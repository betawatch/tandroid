package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class cd0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A0;
    public boolean B;
    public boolean B0;
    public final UndoView[] C;
    public xc0 C0;
    public boolean D;
    public final int D0;
    public boolean E;
    public int E0;
    public IMapsProvider.IMap F;
    public uc0 F0;
    public IMapsProvider.ICameraUpdate G;
    public lc0 G0;
    public IMapsProvider.IMapView H;
    public sc0 H0;
    public IMapsProvider.ICameraUpdate I;
    public org.telegram.ui.Cells.t3 I0;
    public boolean J;
    public TL_stories.MediaArea J0;
    public float K;
    public boolean K0;
    public IMapsProvider.ICircle L;
    public boolean L0;
    public double M;
    public Boolean M0;
    public boolean N;
    public final Bitmap[] N0;
    public org.telegram.ui.Components.mi0 O;
    public n0 P;
    public qc0 Q;
    public org.telegram.ui.Components.rl0 R;
    public org.telegram.ui.Components.rl0 S;
    public vc0 T;
    public View U;
    public f2.i0 V;
    public org.telegram.ui.ActionBar.w0 W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public ImageView a;
    public boolean a0;
    public TextView b;
    public long b0;
    public ImageView c;
    public boolean c0;
    public org.telegram.ui.ActionBar.w0 d;
    public final ArrayList d0;
    public org.telegram.ui.Components.yk e;
    public final a0.h e0;
    public LinearLayout f;
    public long f0;
    public boolean g0;
    public ImageView h;
    public final ArrayList h0;
    public AnimatorSet i0;
    public IMapsProvider.IMarker j0;
    public bd0 k0;
    public FrameLayout l0;
    public boolean m0;
    public TextView n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public TextView r;
    public boolean r0;
    public Drawable s;
    public boolean s0;
    public Location t0;
    public Location u0;
    public nh.a3 v;
    public int v0;
    public org.telegram.ui.ActionBar.w0 w;
    public TLRPC.TL_channelLocation w0;
    public zc0 x;
    public TLRPC.TL_channelLocation x0;
    public ph.f3 y;
    public MessageObject y0;
    public boolean z0;

    public cd0(int i10) {
        super(null);
        this.C = new UndoView[2];
        this.Y = true;
        this.Z = false;
        this.a0 = true;
        this.c0 = true;
        this.d0 = new ArrayList();
        this.e0 = new a0.h();
        this.f0 = -1L;
        this.h0 = new ArrayList();
        this.m0 = true;
        this.n0 = true;
        this.E0 = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.L0 = true;
        this.N0 = new Bitmap[7];
        this.D0 = i10;
        AndroidUtilities.fixGoogleMapsBug();
    }

    public static void U(cd0 cd0Var) {
        IMapsProvider.IMap iMap;
        Activity parentActivity;
        int i10 = cd0Var.D0;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = cd0Var.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            if (cd0Var.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cd0Var.getParentActivity());
            alertDialog$Builder.m(R.raw.permission_request_location, 72, cd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.L5), null);
            alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
            alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new jc0(cd0Var, 1));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            cd0Var.showDialog(alertDialog$Builder.a);
            return;
        }
        if (cd0Var.d0() || i10 == 3) {
            if ((cd0Var.y0 == null || i10 == 3) && cd0Var.w0 == null) {
                if (cd0Var.t0 != null && cd0Var.F != null) {
                    ImageView imageView = cd0Var.a;
                    int i11 = org.telegram.ui.ActionBar.j6.vi;
                    imageView.setColorFilter(new PorterDuffColorFilter(cd0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                    cd0Var.a.setTag(Integer.valueOf(i11));
                    cd0Var.Q.L(null);
                    cd0Var.z0 = false;
                    cd0Var.y0(false);
                    cd0Var.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(cd0Var.t0.getLatitude(), cd0Var.t0.getLongitude())));
                    if (cd0Var.A0 && i10 != 8) {
                        Location location = cd0Var.t0;
                        if (location != null) {
                            cd0Var.Q.H(null, location, true);
                        }
                        cd0Var.A0 = false;
                        cd0Var.x0();
                    }
                }
            } else if (cd0Var.t0 != null && (iMap = cd0Var.F) != null) {
                iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(cd0Var.t0.getLatitude(), cd0Var.t0.getLongitude()), cd0Var.F.getMaxZoomLevel() - 4.0f));
            }
            if (cd0Var.j0 != null) {
                cd0Var.U.setVisibility(0);
                zc0 zc0Var = cd0Var.x;
                IMapsProvider.IMarker iMarker = cd0Var.j0;
                HashMap hashMap = zc0Var.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    zc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                cd0Var.j0 = null;
                cd0Var.k0 = null;
                cd0Var.l0 = null;
            }
        }
    }

    public static /* synthetic */ void V(cd0 cd0Var, boolean z4, TLRPC.User user, int i10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (!z4) {
            cd0Var.w0(i10, user, 0);
            return;
        }
        LocationController.SharingLocationInfo sharingLocationInfo = cd0Var.getLocationController().getSharingLocationInfo(cd0Var.b0);
        if (sharingLocationInfo != null) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = cd0Var.getMessagesController().getInputPeer(sharingLocationInfo.did);
            tL_messages_editMessage.id = sharingLocationInfo.mid;
            tL_messages_editMessage.flags |= 16384;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = false;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
            Location lastKnownLocation = LocationController.getInstance(cd0Var.currentAccount).getLastKnownLocation();
            tL_messages_editMessage.media.geo_point.lat = AndroidUtilities.fixLocationCoord(lastKnownLocation.getLatitude());
            tL_messages_editMessage.media.geo_point._long = AndroidUtilities.fixLocationCoord(lastKnownLocation.getLongitude());
            tL_messages_editMessage.media.geo_point.accuracy_radius = (int) lastKnownLocation.getAccuracy();
            TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
            TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
            if (inputGeoPoint.accuracy_radius != 0) {
                inputGeoPoint.flags |= 1;
            }
            int i11 = sharingLocationInfo.lastSentProximityMeters;
            int i12 = sharingLocationInfo.proximityMeters;
            if (i11 != i12) {
                inputMedia.proximity_notification_radius = i12;
                inputMedia.flags |= 8;
            }
            inputMedia.heading = LocationController.getHeading(lastKnownLocation);
            TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
            int i13 = inputMedia2.flags;
            inputMedia2.flags = i13 | 4;
            int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i15 = i10 == Integer.MAX_VALUE ? ConnectionsManager.DEFAULT_DATACENTER_ID : sharingLocationInfo.period + i10;
            sharingLocationInfo.period = i15;
            inputMedia2.period = i15;
            if (i10 != Integer.MAX_VALUE) {
                i14 = sharingLocationInfo.stopTime + i10;
            }
            sharingLocationInfo.stopTime = i14;
            inputMedia2.flags = i13 | 6;
            MessageObject messageObject = sharingLocationInfo.messageObject;
            if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                messageMedia.period = i15;
                cd0Var.getMessagesStorage().replaceMessageIfExists(sharingLocationInfo.messageObject.messageOwner, null, null, true);
            }
            cd0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
        }
    }

    public static /* synthetic */ void W(cd0 cd0Var) {
        lc0 lc0Var;
        cd0Var.getLocationController().markLiveLoactionsAsRead(cd0Var.b0);
        if (cd0Var.isPaused || (lc0Var = cd0Var.G0) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(lc0Var, 5000L);
    }

    public static IMapsProvider.LatLng p0(IMapsProvider.LatLng latLng, double d, double d10) {
        double degrees = Math.toDegrees(d10 / (Math.cos(Math.toRadians(latLng.latitude)) * 6366198.0d));
        return new IMapsProvider.LatLng(latLng.latitude + Math.toDegrees(d / 6366198.0d), latLng.longitude + degrees);
    }

    public final void A0(boolean z4) {
        int i10;
        int i11;
        FrameLayout.LayoutParams layoutParams;
        f2.l1 K = this.R.K(0);
        if (K != null) {
            i10 = (int) K.a.getY();
            i11 = Math.min(i10, 0) + this.E0;
        } else {
            i10 = -this.P.getMeasuredHeight();
            i11 = 0;
        }
        if (((FrameLayout.LayoutParams) this.P.getLayoutParams()) != null) {
            if (i11 <= 0) {
                if (this.H.getView().getVisibility() == 0) {
                    this.H.getView().setVisibility(4);
                    this.P.setVisibility(4);
                    zc0 zc0Var = this.x;
                    if (zc0Var != null) {
                        zc0Var.setVisibility(4);
                    }
                }
            } else if (this.H.getView().getVisibility() == 4) {
                this.H.getView().setVisibility(0);
                this.P.setVisibility(0);
                zc0 zc0Var2 = this.x;
                if (zc0Var2 != null) {
                    zc0Var2.setVisibility(0);
                }
            }
            this.P.setTranslationY(Math.min(0, i10));
            int i12 = -i10;
            int i13 = i12 / 2;
            this.H.getView().setTranslationY(Math.max(0, i13));
            zc0 zc0Var3 = this.x;
            if (zc0Var3 != null) {
                zc0Var3.setTranslationY(Math.max(0, i13));
            }
            int measuredHeight = this.E0 - this.d.getMeasuredHeight();
            int i14 = this.D0;
            float min = Math.min(measuredHeight - AndroidUtilities.dp(64 + ((i14 == 0 || i14 == 1) ? 30 : 10)), i12);
            this.d.setTranslationY(min);
            this.c.setTranslationY(min);
            ph.f3 f3Var = this.y;
            if (f3Var != null) {
                f3Var.setTranslationY(min);
            }
            org.telegram.ui.Components.yk ykVar = this.e;
            if (ykVar != null) {
                ykVar.c = min;
                ykVar.setTranslationY(min + ykVar.b);
            }
            View view = this.U;
            if (view != null) {
                int dp = (i11 / 2) + (i12 - AndroidUtilities.dp(view.getTag() == null ? 48.0f : 69.0f));
                this.v0 = dp;
                view.setTranslationY(dp);
            }
            if (z4) {
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.H.getView().getLayoutParams();
            if (layoutParams2 != null) {
                if (layoutParams2.height != AndroidUtilities.dp(10.0f) + this.E0) {
                    layoutParams2.height = AndroidUtilities.dp(10.0f) + this.E0;
                    IMapsProvider.IMap iMap = this.F;
                    if (iMap != null) {
                        iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                    }
                    this.H.getView().setLayoutParams(layoutParams2);
                }
            }
            zc0 zc0Var4 = this.x;
            if (zc0Var4 == null || (layoutParams = (FrameLayout.LayoutParams) zc0Var4.getLayoutParams()) == null) {
                return;
            }
            if (layoutParams.height != AndroidUtilities.dp(10.0f) + this.E0) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.E0;
                this.x.setLayoutParams(layoutParams);
            }
        }
    }

    public final void B0() {
        if (!this.o0) {
            this.f.setVisibility(8);
        } else {
            if (!this.q0) {
                this.S.setEmptyView(this.f);
                return;
            }
            this.S.setEmptyView(null);
            this.f.setVisibility(8);
            this.S.setVisibility(8);
        }
    }

    public final void C0() {
        TLRPC.MessageMedia messageMedia;
        int i10;
        if (this.b == null) {
            return;
        }
        if (this.g0) {
            z0(false, true);
            j0();
            return;
        }
        int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.Message message = ((wc0) arrayList.get(i12)).b;
            if (message != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > currentTime)) {
                i11++;
            }
        }
        boolean z4 = this.e0.f(getUserConfig().getClientUserId()) != null;
        if (this.t0 != null && !z4) {
            i11++;
        }
        z0(i11 >= 2, true);
    }

    public final wc0 c0(TLRPC.Message message) {
        Location location;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
        long fromChatId = MessageObject.getFromChatId(message);
        a0.h hVar = this.e0;
        wc0 wc0Var = (wc0) hVar.f(fromChatId);
        if (wc0Var == null) {
            wc0Var = new wc0();
            wc0Var.b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                wc0Var.c = getMessagesController().getUser(Long.valueOf(wc0Var.b.from_id.user_id));
                wc0Var.a = wc0Var.b.from_id.user_id;
            } else {
                long dialogId = MessageObject.getDialogId(message);
                if (DialogObject.isUserDialog(dialogId)) {
                    wc0Var.c = getMessagesController().getUser(Long.valueOf(dialogId));
                } else {
                    wc0Var.d = getMessagesController().getChat(Long.valueOf(-dialogId));
                }
                wc0Var.a = dialogId;
            }
            v0(wc0Var);
            try {
                IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                Bitmap g02 = g0(wc0Var);
                if (g02 != null) {
                    position.icon(g02);
                    position.anchor(0.5f, 0.907f);
                    wc0Var.e = this.F.addMarker(position);
                    if (!UserObject.isUserSelf(wc0Var.c)) {
                        IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                        flat.anchor(0.5f, 0.5f);
                        IMapsProvider.IMarker addMarker = this.F.addMarker(flat);
                        wc0Var.f = addMarker;
                        int i10 = message.media.heading;
                        if (i10 != 0) {
                            addMarker.setRotation(i10);
                            wc0Var.f.setIcon(R.drawable.map_pin_cone2);
                            wc0Var.g = true;
                        } else {
                            addMarker.setRotation(0);
                            wc0Var.f.setIcon(R.drawable.map_pin_circle);
                            wc0Var.g = false;
                        }
                    }
                    this.d0.add(wc0Var);
                    hVar.k(wc0Var, wc0Var.a);
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.b0);
                    if (wc0Var.a == getUserConfig().getClientUserId() && sharingLocationInfo != null && wc0Var.b.id == sharingLocationInfo.mid && (location = this.t0) != null) {
                        wc0Var.e.setPosition(new IMapsProvider.LatLng(location.getLatitude(), this.t0.getLongitude()));
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            wc0Var.b = message;
            wc0Var.e.setPosition(latLng);
            if (this.f0 == wc0Var.a) {
                this.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(wc0Var.e.getPosition()));
            }
        }
        org.telegram.ui.Components.mi0 mi0Var = this.O;
        if (mi0Var != null) {
            mi0Var.c(true);
        }
        C0();
        return wc0Var;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        boolean z4;
        int i10;
        int i11;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.p0 = false;
        this.o0 = false;
        this.q0 = false;
        qc0 qc0Var = this.Q;
        if (qc0Var != null) {
            qc0Var.F();
        }
        vc0 vc0Var = this.T;
        if (vc0Var != null) {
            vc0Var.F();
        }
        if (this.w0 != null) {
            Location location = new Location("network");
            this.u0 = location;
            location.setLatitude(this.w0.geo_point.lat);
            this.u0.setLongitude(this.w0.geo_point._long);
        } else if (this.y0 != null) {
            Location location2 = new Location("network");
            this.u0 = location2;
            location2.setLatitude(this.y0.messageOwner.media.geo.lat);
            this.u0.setLongitude(this.y0.messageOwner.media.geo._long);
        }
        this.Z = (Build.VERSION.SDK_INT < 23 || getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.h5;
        kVar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.j6.j5;
        kVar2.setTitleColor(getThemedColor(i13));
        this.actionBar.C(getThemedColor(i13), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.j6.I5), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new pc0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        TLRPC.TL_channelLocation tL_channelLocation = this.w0;
        int i14 = this.D0;
        if (tL_channelLocation != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
        } else {
            MessageObject messageObject = this.y0;
            if (messageObject == null) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
                if (i14 != 4) {
                    this.x = new zc0(this, context);
                    org.telegram.ui.ActionBar.w0 c3 = n10.c(0, R.drawable.outline_header_search, getResourceProvider());
                    c3.F();
                    c3.E = new hb(this, 11);
                    this.w = c3;
                    c3.setSearchFieldHint(LocaleController.getString(R.string.Search));
                    this.w.setContentDescription(LocaleController.getString(R.string.Search));
                    EditTextBoldCursor searchField = this.w.getSearchField();
                    searchField.setTextColor(getThemedColor(i13));
                    searchField.setCursorColor(getThemedColor(i13));
                    searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Vd));
                }
            } else if (messageObject.isLiveLocation()) {
                this.actionBar.setTitle(LocaleController.getString(R.string.AttachLiveLocation));
                org.telegram.ui.ActionBar.w0 c10 = n10.c(0, R.drawable.ic_ab_other, getResourceProvider());
                this.W = c10;
                c10.e(6, R.drawable.filled_directions, LocaleController.getString(R.string.GetDirections));
            } else {
                String str = this.y0.messageOwner.media.title;
                if (str == null || str.length() <= 0) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.SharedPlace));
                }
                if (i14 != 3) {
                    org.telegram.ui.ActionBar.w0 c11 = n10.c(0, R.drawable.ic_ab_other, getResourceProvider());
                    this.W = c11;
                    c11.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
                    if (!getLocationController().isSharingLocation(this.b0) && this.L0) {
                        this.W.e(5, R.drawable.msg_location, LocaleController.getString(R.string.SendLiveLocationMenu));
                    }
                    this.W.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                }
            }
        }
        ad0 ad0Var = new ad0(this, context);
        this.fragmentView = ad0Var;
        ad0Var.setBackgroundColor(getThemedColor(i12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s = mutate;
        int themedColor = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        Rect rect = new Rect();
        this.s.getPadding(rect);
        FrameLayout.LayoutParams layoutParams = (i14 == 0 || i14 == 1) ? new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f) + rect.top) : new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(6.0f) + rect.top);
        layoutParams.gravity = 83;
        n0 n0Var = new n0(this, context, 11);
        this.P = n0Var;
        n0Var.setBackgroundDrawable(new df.f(n0()));
        MessageObject messageObject2 = this.y0;
        if ((messageObject2 == null && (i14 == 0 || i14 == 1)) || (messageObject2 != null && i14 == 3)) {
            org.telegram.ui.Components.yk ykVar = new org.telegram.ui.Components.yk(context, 1);
            this.e = ykVar;
            ykVar.setTranslationX(-AndroidUtilities.dp(80.0f));
            int dp = AndroidUtilities.dp(40.0f);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.wi);
            int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.j6.xi);
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3);
            k7.d6.a(this.e);
            this.e.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.e.setOutlineProvider(kf.r0.b);
            this.e.setBackgroundDrawable(i02);
            this.e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.vi));
            this.e.setTextSize(1, 14.0f);
            this.e.setTypeface(AndroidUtilities.bold());
            this.e.setGravity(17);
            this.e.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.P.addView(this.e, k7.b6.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
            if (i14 == 3) {
                this.e.setText(LocaleController.getString(R.string.OpenInMaps));
                final int i15 = 5;
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ic0
                    public final /* synthetic */ cd0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        boolean z10;
                        int i16 = i15;
                        cd0 cd0Var = this.b;
                        int i17 = 1;
                        switch (i16) {
                            case 0:
                                cd0Var.y0(false);
                                cd0Var.Q.H(null, cd0Var.u0, true);
                                cd0Var.A0 = true;
                                cd0Var.x0();
                                break;
                            case 1:
                                cd0Var.d.M(null, null);
                                break;
                            case 2:
                                cd0.U(cd0Var);
                                break;
                            case 3:
                                cd0Var.f0 = -1L;
                                cd0Var.z0 = true;
                                if (cd0Var.j0()) {
                                    cd0Var.g0 = true;
                                    cd0Var.z0(false, true);
                                    break;
                                }
                                break;
                            case 4:
                                if (cd0Var.getParentActivity() != null && cd0Var.t0 != null && cd0Var.d0() && cd0Var.F != null) {
                                    ph.f3 f3Var = cd0Var.y;
                                    if (f3Var != null) {
                                        f3Var.e(true);
                                    }
                                    int i18 = 3;
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = cd0Var.getLocationController().getSharingLocationInfo(cd0Var.b0);
                                    if (cd0Var.D) {
                                        cd0Var.C[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        cd0Var.c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = cd0Var.L;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            cd0Var.L = null;
                                        }
                                        cd0Var.D = true;
                                        cd0Var.m0().k(0L, 25, 0, null, new lc0(cd0Var, i17), new w10(26, cd0Var, sharingLocationInfo));
                                        break;
                                    } else {
                                        IMapsProvider.ICircle iCircle2 = cd0Var.L;
                                        if (iCircle2 == null) {
                                            cd0Var.e0(500);
                                        } else {
                                            cd0Var.M = iCircle2.getRadius();
                                        }
                                        TLRPC.User user = DialogObject.isUserDialog(cd0Var.b0) ? cd0Var.getMessagesController().getUser(Long.valueOf(cd0Var.b0)) : null;
                                        Activity parentActivity = cd0Var.getParentActivity();
                                        jc0 jc0Var = new jc0(cd0Var, i18);
                                        ss ssVar = new ss(22, cd0Var, user);
                                        lc0 lc0Var = new lc0(cd0Var, 2);
                                        org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(parentActivity);
                                        mi0Var.a = null;
                                        mi0Var.d = -1;
                                        mi0Var.e = false;
                                        mi0Var.f = false;
                                        mi0Var.h = null;
                                        mi0Var.n = new Rect();
                                        new Paint();
                                        mi0Var.w = true;
                                        mi0Var.C = org.telegram.ui.Components.mr.h;
                                        mi0Var.setWillNotDraw(false);
                                        mi0Var.N = lc0Var;
                                        mi0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                        Rect rect2 = new Rect();
                                        Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false), PorterDuff.Mode.MULTIPLY));
                                        mutate2.getPadding(rect2);
                                        int i19 = rect2.left;
                                        mi0Var.x = i19;
                                        org.telegram.ui.Components.ii0 ii0Var = new org.telegram.ui.Components.ii0(mi0Var.getContext());
                                        mi0Var.v = ii0Var;
                                        ii0Var.setBackgroundDrawable(mutate2);
                                        ii0Var.setPadding(i19, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i19, 0);
                                        ii0Var.setVisibility(4);
                                        mi0Var.addView(ii0Var, 0, k7.b6.e(-1, -2, 80));
                                        mi0Var.L = LocaleController.getUseImperialSystemType();
                                        mi0Var.J = user;
                                        mi0Var.F = jc0Var;
                                        org.telegram.ui.Components.xc0 xc0Var = new org.telegram.ui.Components.xc0(parentActivity, null);
                                        mi0Var.D = xc0Var;
                                        xc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                        xc0Var.setItemCount(5);
                                        org.telegram.ui.Components.xc0 xc0Var2 = new org.telegram.ui.Components.xc0(parentActivity, null);
                                        mi0Var.E = xc0Var2;
                                        xc0Var2.setItemCount(5);
                                        xc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                        org.telegram.ui.Components.ji0 ji0Var = new org.telegram.ui.Components.ji0(mi0Var, parentActivity);
                                        mi0Var.M = ji0Var;
                                        ji0Var.setOrientation(1);
                                        FrameLayout frameLayout = new FrameLayout(parentActivity);
                                        ji0Var.addView(frameLayout, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                                        TextView textView = new TextView(parentActivity);
                                        textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                        org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false), 1, 20.0f);
                                        frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                        textView.setOnTouchListener(new oh.d(20));
                                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                                        linearLayout.setOrientation(0);
                                        linearLayout.setWeightSum(1.0f);
                                        ji0Var.addView(linearLayout, k7.b6.n(-1, -2));
                                        System.currentTimeMillis();
                                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                        TextView textView2 = new TextView(parentActivity);
                                        mi0Var.H = textView2;
                                        org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0(parentActivity);
                                        mi0Var.G = ki0Var;
                                        linearLayout.addView(xc0Var, k7.b6.l(0.5f, 0, 270));
                                        xc0Var.setFormatter(new org.telegram.ui.Components.hi0(mi0Var, 0));
                                        xc0Var.setMinValue(0);
                                        xc0Var.setMaxValue(10);
                                        xc0Var.setWrapSelectorWheel(false);
                                        xc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                        org.telegram.ui.Components.hi0 hi0Var = new org.telegram.ui.Components.hi0(mi0Var, 1);
                                        xc0Var.setOnValueChangedListener(hi0Var);
                                        xc0Var2.setMinValue(0);
                                        xc0Var2.setMaxValue(10);
                                        xc0Var2.setWrapSelectorWheel(false);
                                        xc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                        linearLayout.addView(xc0Var2, k7.b6.l(0.5f, 0, 270));
                                        xc0Var2.setFormatter(new org.telegram.ui.Components.hi0(mi0Var, 2));
                                        xc0Var2.setOnValueChangedListener(hi0Var);
                                        xc0Var.setValue(0);
                                        xc0Var2.setValue(6);
                                        ji0Var.addView(frameLayout2, k7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                                        ki0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        ki0Var.setGravity(17);
                                        ki0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                                        ki0Var.setTextSize(1, 14.0f);
                                        ki0Var.setMaxLines(2);
                                        ki0Var.setTypeface(AndroidUtilities.bold());
                                        ki0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                                        frameLayout2.addView(ki0Var, k7.b6.c(48.0f, -1));
                                        ki0Var.setOnClickListener(new org.telegram.ui.Components.w2(26, mi0Var, ssVar));
                                        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        textView2.setGravity(17);
                                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q5, false));
                                        textView2.setTextSize(1, 14.0f);
                                        textView2.setAlpha(0.0f);
                                        textView2.setScaleX(0.5f);
                                        textView2.setScaleY(0.5f);
                                        frameLayout2.addView(textView2, k7.b6.c(48.0f, -1));
                                        ii0Var.addView(ji0Var, k7.b6.e(-1, -2, 51));
                                        cd0Var.O = mi0Var;
                                        ((FrameLayout) cd0Var.fragmentView).addView(mi0Var, k7.b6.c(-1.0f, -1));
                                        org.telegram.ui.Components.mi0 mi0Var2 = cd0Var.O;
                                        mi0Var2.r = false;
                                        AnimatorSet animatorSet = mi0Var2.s;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                            mi0Var2.s = null;
                                        }
                                        org.telegram.ui.Components.ii0 ii0Var2 = mi0Var2.v;
                                        ii0Var2.measure(View.MeasureSpec.makeMeasureSpec((mi0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                        if (mi0Var2.r) {
                                            z10 = true;
                                        } else {
                                            ii0Var2.setVisibility(0);
                                            if (mi0Var2.w) {
                                                mi0Var2.setLayerType(2, null);
                                            }
                                            ii0Var2.setTranslationY(ii0Var2.getMeasuredHeight());
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            mi0Var2.s = animatorSet2;
                                            animatorSet2.playTogether(ObjectAnimator.ofFloat(ii0Var2, (Property<org.telegram.ui.Components.ii0, Float>) View.TRANSLATION_Y, 0.0f));
                                            mi0Var2.s.setDuration(400L);
                                            mi0Var2.s.setStartDelay(20L);
                                            mi0Var2.s.setInterpolator(mi0Var2.C);
                                            z10 = true;
                                            mi0Var2.s.addListener(new org.telegram.ui.Components.li0(mi0Var2, 1 == true ? 1 : 0));
                                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                            mi0Var2.s.start();
                                        }
                                        mi0Var2.c(z10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                cd0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = cd0Var.y0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    cd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    break;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                        }
                    }
                });
                this.e.setTranslationX(0.0f);
            } else {
                this.e.setText(LocaleController.getString(R.string.PlacesInThisArea));
                final int i16 = 0;
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ic0
                    public final /* synthetic */ cd0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        boolean z10;
                        int i162 = i16;
                        cd0 cd0Var = this.b;
                        int i17 = 1;
                        switch (i162) {
                            case 0:
                                cd0Var.y0(false);
                                cd0Var.Q.H(null, cd0Var.u0, true);
                                cd0Var.A0 = true;
                                cd0Var.x0();
                                break;
                            case 1:
                                cd0Var.d.M(null, null);
                                break;
                            case 2:
                                cd0.U(cd0Var);
                                break;
                            case 3:
                                cd0Var.f0 = -1L;
                                cd0Var.z0 = true;
                                if (cd0Var.j0()) {
                                    cd0Var.g0 = true;
                                    cd0Var.z0(false, true);
                                    break;
                                }
                                break;
                            case 4:
                                if (cd0Var.getParentActivity() != null && cd0Var.t0 != null && cd0Var.d0() && cd0Var.F != null) {
                                    ph.f3 f3Var = cd0Var.y;
                                    if (f3Var != null) {
                                        f3Var.e(true);
                                    }
                                    int i18 = 3;
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = cd0Var.getLocationController().getSharingLocationInfo(cd0Var.b0);
                                    if (cd0Var.D) {
                                        cd0Var.C[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        cd0Var.c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = cd0Var.L;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            cd0Var.L = null;
                                        }
                                        cd0Var.D = true;
                                        cd0Var.m0().k(0L, 25, 0, null, new lc0(cd0Var, i17), new w10(26, cd0Var, sharingLocationInfo));
                                        break;
                                    } else {
                                        IMapsProvider.ICircle iCircle2 = cd0Var.L;
                                        if (iCircle2 == null) {
                                            cd0Var.e0(500);
                                        } else {
                                            cd0Var.M = iCircle2.getRadius();
                                        }
                                        TLRPC.User user = DialogObject.isUserDialog(cd0Var.b0) ? cd0Var.getMessagesController().getUser(Long.valueOf(cd0Var.b0)) : null;
                                        Activity parentActivity = cd0Var.getParentActivity();
                                        jc0 jc0Var = new jc0(cd0Var, i18);
                                        ss ssVar = new ss(22, cd0Var, user);
                                        lc0 lc0Var = new lc0(cd0Var, 2);
                                        org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(parentActivity);
                                        mi0Var.a = null;
                                        mi0Var.d = -1;
                                        mi0Var.e = false;
                                        mi0Var.f = false;
                                        mi0Var.h = null;
                                        mi0Var.n = new Rect();
                                        new Paint();
                                        mi0Var.w = true;
                                        mi0Var.C = org.telegram.ui.Components.mr.h;
                                        mi0Var.setWillNotDraw(false);
                                        mi0Var.N = lc0Var;
                                        mi0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                        Rect rect2 = new Rect();
                                        Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false), PorterDuff.Mode.MULTIPLY));
                                        mutate2.getPadding(rect2);
                                        int i19 = rect2.left;
                                        mi0Var.x = i19;
                                        org.telegram.ui.Components.ii0 ii0Var = new org.telegram.ui.Components.ii0(mi0Var.getContext());
                                        mi0Var.v = ii0Var;
                                        ii0Var.setBackgroundDrawable(mutate2);
                                        ii0Var.setPadding(i19, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i19, 0);
                                        ii0Var.setVisibility(4);
                                        mi0Var.addView(ii0Var, 0, k7.b6.e(-1, -2, 80));
                                        mi0Var.L = LocaleController.getUseImperialSystemType();
                                        mi0Var.J = user;
                                        mi0Var.F = jc0Var;
                                        org.telegram.ui.Components.xc0 xc0Var = new org.telegram.ui.Components.xc0(parentActivity, null);
                                        mi0Var.D = xc0Var;
                                        xc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                        xc0Var.setItemCount(5);
                                        org.telegram.ui.Components.xc0 xc0Var2 = new org.telegram.ui.Components.xc0(parentActivity, null);
                                        mi0Var.E = xc0Var2;
                                        xc0Var2.setItemCount(5);
                                        xc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                        org.telegram.ui.Components.ji0 ji0Var = new org.telegram.ui.Components.ji0(mi0Var, parentActivity);
                                        mi0Var.M = ji0Var;
                                        ji0Var.setOrientation(1);
                                        FrameLayout frameLayout = new FrameLayout(parentActivity);
                                        ji0Var.addView(frameLayout, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                                        TextView textView = new TextView(parentActivity);
                                        textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                        org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false), 1, 20.0f);
                                        frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                        textView.setOnTouchListener(new oh.d(20));
                                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                                        linearLayout.setOrientation(0);
                                        linearLayout.setWeightSum(1.0f);
                                        ji0Var.addView(linearLayout, k7.b6.n(-1, -2));
                                        System.currentTimeMillis();
                                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                        TextView textView2 = new TextView(parentActivity);
                                        mi0Var.H = textView2;
                                        org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0(parentActivity);
                                        mi0Var.G = ki0Var;
                                        linearLayout.addView(xc0Var, k7.b6.l(0.5f, 0, 270));
                                        xc0Var.setFormatter(new org.telegram.ui.Components.hi0(mi0Var, 0));
                                        xc0Var.setMinValue(0);
                                        xc0Var.setMaxValue(10);
                                        xc0Var.setWrapSelectorWheel(false);
                                        xc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                        org.telegram.ui.Components.hi0 hi0Var = new org.telegram.ui.Components.hi0(mi0Var, 1);
                                        xc0Var.setOnValueChangedListener(hi0Var);
                                        xc0Var2.setMinValue(0);
                                        xc0Var2.setMaxValue(10);
                                        xc0Var2.setWrapSelectorWheel(false);
                                        xc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                        linearLayout.addView(xc0Var2, k7.b6.l(0.5f, 0, 270));
                                        xc0Var2.setFormatter(new org.telegram.ui.Components.hi0(mi0Var, 2));
                                        xc0Var2.setOnValueChangedListener(hi0Var);
                                        xc0Var.setValue(0);
                                        xc0Var2.setValue(6);
                                        ji0Var.addView(frameLayout2, k7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                                        ki0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        ki0Var.setGravity(17);
                                        ki0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                                        ki0Var.setTextSize(1, 14.0f);
                                        ki0Var.setMaxLines(2);
                                        ki0Var.setTypeface(AndroidUtilities.bold());
                                        ki0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                                        frameLayout2.addView(ki0Var, k7.b6.c(48.0f, -1));
                                        ki0Var.setOnClickListener(new org.telegram.ui.Components.w2(26, mi0Var, ssVar));
                                        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        textView2.setGravity(17);
                                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q5, false));
                                        textView2.setTextSize(1, 14.0f);
                                        textView2.setAlpha(0.0f);
                                        textView2.setScaleX(0.5f);
                                        textView2.setScaleY(0.5f);
                                        frameLayout2.addView(textView2, k7.b6.c(48.0f, -1));
                                        ii0Var.addView(ji0Var, k7.b6.e(-1, -2, 51));
                                        cd0Var.O = mi0Var;
                                        ((FrameLayout) cd0Var.fragmentView).addView(mi0Var, k7.b6.c(-1.0f, -1));
                                        org.telegram.ui.Components.mi0 mi0Var2 = cd0Var.O;
                                        mi0Var2.r = false;
                                        AnimatorSet animatorSet = mi0Var2.s;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                            mi0Var2.s = null;
                                        }
                                        org.telegram.ui.Components.ii0 ii0Var2 = mi0Var2.v;
                                        ii0Var2.measure(View.MeasureSpec.makeMeasureSpec((mi0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                        if (mi0Var2.r) {
                                            z10 = true;
                                        } else {
                                            ii0Var2.setVisibility(0);
                                            if (mi0Var2.w) {
                                                mi0Var2.setLayerType(2, null);
                                            }
                                            ii0Var2.setTranslationY(ii0Var2.getMeasuredHeight());
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            mi0Var2.s = animatorSet2;
                                            animatorSet2.playTogether(ObjectAnimator.ofFloat(ii0Var2, (Property<org.telegram.ui.Components.ii0, Float>) View.TRANSLATION_Y, 0.0f));
                                            mi0Var2.s.setDuration(400L);
                                            mi0Var2.s.setStartDelay(20L);
                                            mi0Var2.s.setInterpolator(mi0Var2.C);
                                            z10 = true;
                                            mi0Var2.s.addListener(new org.telegram.ui.Components.li0(mi0Var2, 1 == true ? 1 : 0));
                                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                            mi0Var2.s.start();
                                        }
                                        mi0Var2.c(z10);
                                        break;
                                    }
                                }
                                break;
                            default:
                                cd0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = cd0Var.y0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    cd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    break;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                        }
                    }
                });
            }
        }
        int i17 = org.telegram.ui.ActionBar.j6.ui;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i17), false, getResourceProvider());
        this.d = w0Var;
        w0Var.setClickable(true);
        this.d.setSubMenuOpenSide(2);
        this.d.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        this.d.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        this.d.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), getResourceProvider());
        this.d.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), getResourceProvider());
        this.d.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), getResourceProvider());
        this.d.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int dp2 = AndroidUtilities.dp(40.0f);
        int i18 = org.telegram.ui.ActionBar.j6.wi;
        int themedColor4 = getThemedColor(i18);
        int i19 = org.telegram.ui.ActionBar.j6.xi;
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.j6.h0(dp2, themedColor4, getThemedColor(i19));
        k7.d6.a(this.d);
        this.d.setTranslationZ(AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.d;
        gg.j1 j1Var = kf.r0.a;
        w0Var2.setOutlineProvider(j1Var);
        this.d.setBackgroundDrawable(h02);
        this.d.setIcon(R.drawable.msg_map_type);
        this.P.addView(this.d, k7.b6.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        final int i20 = 1;
        this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ic0
            public final /* synthetic */ cd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10;
                int i162 = i20;
                cd0 cd0Var = this.b;
                int i172 = 1;
                switch (i162) {
                    case 0:
                        cd0Var.y0(false);
                        cd0Var.Q.H(null, cd0Var.u0, true);
                        cd0Var.A0 = true;
                        cd0Var.x0();
                        break;
                    case 1:
                        cd0Var.d.M(null, null);
                        break;
                    case 2:
                        cd0.U(cd0Var);
                        break;
                    case 3:
                        cd0Var.f0 = -1L;
                        cd0Var.z0 = true;
                        if (cd0Var.j0()) {
                            cd0Var.g0 = true;
                            cd0Var.z0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (cd0Var.getParentActivity() != null && cd0Var.t0 != null && cd0Var.d0() && cd0Var.F != null) {
                            ph.f3 f3Var = cd0Var.y;
                            if (f3Var != null) {
                                f3Var.e(true);
                            }
                            int i182 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = cd0Var.getLocationController().getSharingLocationInfo(cd0Var.b0);
                            if (cd0Var.D) {
                                cd0Var.C[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                cd0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = cd0Var.L;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    cd0Var.L = null;
                                }
                                cd0Var.D = true;
                                cd0Var.m0().k(0L, 25, 0, null, new lc0(cd0Var, i172), new w10(26, cd0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = cd0Var.L;
                                if (iCircle2 == null) {
                                    cd0Var.e0(500);
                                } else {
                                    cd0Var.M = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(cd0Var.b0) ? cd0Var.getMessagesController().getUser(Long.valueOf(cd0Var.b0)) : null;
                                Activity parentActivity = cd0Var.getParentActivity();
                                jc0 jc0Var = new jc0(cd0Var, i182);
                                ss ssVar = new ss(22, cd0Var, user);
                                lc0 lc0Var = new lc0(cd0Var, 2);
                                org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(parentActivity);
                                mi0Var.a = null;
                                mi0Var.d = -1;
                                mi0Var.e = false;
                                mi0Var.f = false;
                                mi0Var.h = null;
                                mi0Var.n = new Rect();
                                new Paint();
                                mi0Var.w = true;
                                mi0Var.C = org.telegram.ui.Components.mr.h;
                                mi0Var.setWillNotDraw(false);
                                mi0Var.N = lc0Var;
                                mi0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false), PorterDuff.Mode.MULTIPLY));
                                mutate2.getPadding(rect2);
                                int i192 = rect2.left;
                                mi0Var.x = i192;
                                org.telegram.ui.Components.ii0 ii0Var = new org.telegram.ui.Components.ii0(mi0Var.getContext());
                                mi0Var.v = ii0Var;
                                ii0Var.setBackgroundDrawable(mutate2);
                                ii0Var.setPadding(i192, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i192, 0);
                                ii0Var.setVisibility(4);
                                mi0Var.addView(ii0Var, 0, k7.b6.e(-1, -2, 80));
                                mi0Var.L = LocaleController.getUseImperialSystemType();
                                mi0Var.J = user;
                                mi0Var.F = jc0Var;
                                org.telegram.ui.Components.xc0 xc0Var = new org.telegram.ui.Components.xc0(parentActivity, null);
                                mi0Var.D = xc0Var;
                                xc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                xc0Var.setItemCount(5);
                                org.telegram.ui.Components.xc0 xc0Var2 = new org.telegram.ui.Components.xc0(parentActivity, null);
                                mi0Var.E = xc0Var2;
                                xc0Var2.setItemCount(5);
                                xc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.ji0 ji0Var = new org.telegram.ui.Components.ji0(mi0Var, parentActivity);
                                mi0Var.M = ji0Var;
                                ji0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                ji0Var.addView(frameLayout, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(parentActivity);
                                textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false), 1, 20.0f);
                                frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new oh.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                ji0Var.addView(linearLayout, k7.b6.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView2 = new TextView(parentActivity);
                                mi0Var.H = textView2;
                                org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0(parentActivity);
                                mi0Var.G = ki0Var;
                                linearLayout.addView(xc0Var, k7.b6.l(0.5f, 0, 270));
                                xc0Var.setFormatter(new org.telegram.ui.Components.hi0(mi0Var, 0));
                                xc0Var.setMinValue(0);
                                xc0Var.setMaxValue(10);
                                xc0Var.setWrapSelectorWheel(false);
                                xc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.hi0 hi0Var = new org.telegram.ui.Components.hi0(mi0Var, 1);
                                xc0Var.setOnValueChangedListener(hi0Var);
                                xc0Var2.setMinValue(0);
                                xc0Var2.setMaxValue(10);
                                xc0Var2.setWrapSelectorWheel(false);
                                xc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(xc0Var2, k7.b6.l(0.5f, 0, 270));
                                xc0Var2.setFormatter(new org.telegram.ui.Components.hi0(mi0Var, 2));
                                xc0Var2.setOnValueChangedListener(hi0Var);
                                xc0Var.setValue(0);
                                xc0Var2.setValue(6);
                                ji0Var.addView(frameLayout2, k7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                                ki0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                ki0Var.setGravity(17);
                                ki0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                                ki0Var.setTextSize(1, 14.0f);
                                ki0Var.setMaxLines(2);
                                ki0Var.setTypeface(AndroidUtilities.bold());
                                ki0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                                frameLayout2.addView(ki0Var, k7.b6.c(48.0f, -1));
                                ki0Var.setOnClickListener(new org.telegram.ui.Components.w2(26, mi0Var, ssVar));
                                textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView2.setGravity(17);
                                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q5, false));
                                textView2.setTextSize(1, 14.0f);
                                textView2.setAlpha(0.0f);
                                textView2.setScaleX(0.5f);
                                textView2.setScaleY(0.5f);
                                frameLayout2.addView(textView2, k7.b6.c(48.0f, -1));
                                ii0Var.addView(ji0Var, k7.b6.e(-1, -2, 51));
                                cd0Var.O = mi0Var;
                                ((FrameLayout) cd0Var.fragmentView).addView(mi0Var, k7.b6.c(-1.0f, -1));
                                org.telegram.ui.Components.mi0 mi0Var2 = cd0Var.O;
                                mi0Var2.r = false;
                                AnimatorSet animatorSet = mi0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    mi0Var2.s = null;
                                }
                                org.telegram.ui.Components.ii0 ii0Var2 = mi0Var2.v;
                                ii0Var2.measure(View.MeasureSpec.makeMeasureSpec((mi0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (mi0Var2.r) {
                                    z10 = true;
                                } else {
                                    ii0Var2.setVisibility(0);
                                    if (mi0Var2.w) {
                                        mi0Var2.setLayerType(2, null);
                                    }
                                    ii0Var2.setTranslationY(ii0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    mi0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(ii0Var2, (Property<org.telegram.ui.Components.ii0, Float>) View.TRANSLATION_Y, 0.0f));
                                    mi0Var2.s.setDuration(400L);
                                    mi0Var2.s.setStartDelay(20L);
                                    mi0Var2.s.setInterpolator(mi0Var2.C);
                                    z10 = true;
                                    mi0Var2.s.addListener(new org.telegram.ui.Components.li0(mi0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    mi0Var2.s.start();
                                }
                                mi0Var2.c(z10);
                                break;
                            }
                        }
                        break;
                    default:
                        cd0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = cd0Var.y0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            cd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                }
            }
        });
        this.d.setDelegate(new jc0(this, 0));
        this.a = new ImageView(context);
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(40.0f), getThemedColor(i18), getThemedColor(i19));
        k7.d6.a(this.a);
        this.a.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.a.setOutlineProvider(j1Var);
        this.a.setBackground(h03);
        this.a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView = this.a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.a;
        int i21 = org.telegram.ui.ActionBar.j6.vi;
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i21), mode));
        this.a.setTag(Integer.valueOf(i21));
        this.a.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        FrameLayout.LayoutParams d = k7.b6.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f);
        d.bottomMargin = (layoutParams.height - rect.top) + d.bottomMargin;
        this.P.addView(this.a, d);
        final int i22 = 2;
        this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ic0
            public final /* synthetic */ cd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10;
                int i162 = i22;
                cd0 cd0Var = this.b;
                int i172 = 1;
                switch (i162) {
                    case 0:
                        cd0Var.y0(false);
                        cd0Var.Q.H(null, cd0Var.u0, true);
                        cd0Var.A0 = true;
                        cd0Var.x0();
                        break;
                    case 1:
                        cd0Var.d.M(null, null);
                        break;
                    case 2:
                        cd0.U(cd0Var);
                        break;
                    case 3:
                        cd0Var.f0 = -1L;
                        cd0Var.z0 = true;
                        if (cd0Var.j0()) {
                            cd0Var.g0 = true;
                            cd0Var.z0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (cd0Var.getParentActivity() != null && cd0Var.t0 != null && cd0Var.d0() && cd0Var.F != null) {
                            ph.f3 f3Var = cd0Var.y;
                            if (f3Var != null) {
                                f3Var.e(true);
                            }
                            int i182 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = cd0Var.getLocationController().getSharingLocationInfo(cd0Var.b0);
                            if (cd0Var.D) {
                                cd0Var.C[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                cd0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = cd0Var.L;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    cd0Var.L = null;
                                }
                                cd0Var.D = true;
                                cd0Var.m0().k(0L, 25, 0, null, new lc0(cd0Var, i172), new w10(26, cd0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = cd0Var.L;
                                if (iCircle2 == null) {
                                    cd0Var.e0(500);
                                } else {
                                    cd0Var.M = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(cd0Var.b0) ? cd0Var.getMessagesController().getUser(Long.valueOf(cd0Var.b0)) : null;
                                Activity parentActivity = cd0Var.getParentActivity();
                                jc0 jc0Var = new jc0(cd0Var, i182);
                                ss ssVar = new ss(22, cd0Var, user);
                                lc0 lc0Var = new lc0(cd0Var, 2);
                                org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(parentActivity);
                                mi0Var.a = null;
                                mi0Var.d = -1;
                                mi0Var.e = false;
                                mi0Var.f = false;
                                mi0Var.h = null;
                                mi0Var.n = new Rect();
                                new Paint();
                                mi0Var.w = true;
                                mi0Var.C = org.telegram.ui.Components.mr.h;
                                mi0Var.setWillNotDraw(false);
                                mi0Var.N = lc0Var;
                                mi0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false), PorterDuff.Mode.MULTIPLY));
                                mutate2.getPadding(rect2);
                                int i192 = rect2.left;
                                mi0Var.x = i192;
                                org.telegram.ui.Components.ii0 ii0Var = new org.telegram.ui.Components.ii0(mi0Var.getContext());
                                mi0Var.v = ii0Var;
                                ii0Var.setBackgroundDrawable(mutate2);
                                ii0Var.setPadding(i192, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i192, 0);
                                ii0Var.setVisibility(4);
                                mi0Var.addView(ii0Var, 0, k7.b6.e(-1, -2, 80));
                                mi0Var.L = LocaleController.getUseImperialSystemType();
                                mi0Var.J = user;
                                mi0Var.F = jc0Var;
                                org.telegram.ui.Components.xc0 xc0Var = new org.telegram.ui.Components.xc0(parentActivity, null);
                                mi0Var.D = xc0Var;
                                xc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                xc0Var.setItemCount(5);
                                org.telegram.ui.Components.xc0 xc0Var2 = new org.telegram.ui.Components.xc0(parentActivity, null);
                                mi0Var.E = xc0Var2;
                                xc0Var2.setItemCount(5);
                                xc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.ji0 ji0Var = new org.telegram.ui.Components.ji0(mi0Var, parentActivity);
                                mi0Var.M = ji0Var;
                                ji0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                ji0Var.addView(frameLayout, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(parentActivity);
                                textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false), 1, 20.0f);
                                frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new oh.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                ji0Var.addView(linearLayout, k7.b6.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView2 = new TextView(parentActivity);
                                mi0Var.H = textView2;
                                org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0(parentActivity);
                                mi0Var.G = ki0Var;
                                linearLayout.addView(xc0Var, k7.b6.l(0.5f, 0, 270));
                                xc0Var.setFormatter(new org.telegram.ui.Components.hi0(mi0Var, 0));
                                xc0Var.setMinValue(0);
                                xc0Var.setMaxValue(10);
                                xc0Var.setWrapSelectorWheel(false);
                                xc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.hi0 hi0Var = new org.telegram.ui.Components.hi0(mi0Var, 1);
                                xc0Var.setOnValueChangedListener(hi0Var);
                                xc0Var2.setMinValue(0);
                                xc0Var2.setMaxValue(10);
                                xc0Var2.setWrapSelectorWheel(false);
                                xc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(xc0Var2, k7.b6.l(0.5f, 0, 270));
                                xc0Var2.setFormatter(new org.telegram.ui.Components.hi0(mi0Var, 2));
                                xc0Var2.setOnValueChangedListener(hi0Var);
                                xc0Var.setValue(0);
                                xc0Var2.setValue(6);
                                ji0Var.addView(frameLayout2, k7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                                ki0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                ki0Var.setGravity(17);
                                ki0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                                ki0Var.setTextSize(1, 14.0f);
                                ki0Var.setMaxLines(2);
                                ki0Var.setTypeface(AndroidUtilities.bold());
                                ki0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                                frameLayout2.addView(ki0Var, k7.b6.c(48.0f, -1));
                                ki0Var.setOnClickListener(new org.telegram.ui.Components.w2(26, mi0Var, ssVar));
                                textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView2.setGravity(17);
                                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q5, false));
                                textView2.setTextSize(1, 14.0f);
                                textView2.setAlpha(0.0f);
                                textView2.setScaleX(0.5f);
                                textView2.setScaleY(0.5f);
                                frameLayout2.addView(textView2, k7.b6.c(48.0f, -1));
                                ii0Var.addView(ji0Var, k7.b6.e(-1, -2, 51));
                                cd0Var.O = mi0Var;
                                ((FrameLayout) cd0Var.fragmentView).addView(mi0Var, k7.b6.c(-1.0f, -1));
                                org.telegram.ui.Components.mi0 mi0Var2 = cd0Var.O;
                                mi0Var2.r = false;
                                AnimatorSet animatorSet = mi0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    mi0Var2.s = null;
                                }
                                org.telegram.ui.Components.ii0 ii0Var2 = mi0Var2.v;
                                ii0Var2.measure(View.MeasureSpec.makeMeasureSpec((mi0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (mi0Var2.r) {
                                    z10 = true;
                                } else {
                                    ii0Var2.setVisibility(0);
                                    if (mi0Var2.w) {
                                        mi0Var2.setLayerType(2, null);
                                    }
                                    ii0Var2.setTranslationY(ii0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    mi0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(ii0Var2, (Property<org.telegram.ui.Components.ii0, Float>) View.TRANSLATION_Y, 0.0f));
                                    mi0Var2.s.setDuration(400L);
                                    mi0Var2.s.setStartDelay(20L);
                                    mi0Var2.s.setInterpolator(mi0Var2.C);
                                    z10 = true;
                                    mi0Var2.s.addListener(new org.telegram.ui.Components.li0(mi0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    mi0Var2.s.start();
                                }
                                mi0Var2.c(z10);
                                break;
                            }
                        }
                        break;
                    default:
                        cd0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = cd0Var.y0.messageOwner.media.geo;
                            double d10 = geoPoint.lat;
                            double d102 = geoPoint._long;
                            cd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d10 + "," + d102 + "?q=" + d10 + "," + d102)));
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                }
            }
        });
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(17);
        this.b.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.b.setTextSize(1, 15.0f);
        this.b.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourceProvider));
        this.b.setTypeface(AndroidUtilities.bold());
        this.b.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.b.setText(LocaleController.getString(R.string.LocationsShowAll));
        this.b.setBackground(org.telegram.ui.ActionBar.j6.Z(getThemedColor(i18), getThemedColor(i19), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        FrameLayout.LayoutParams d10 = k7.b6.d(-2, 38.0f, 81, 12.0f, 0.0f, 12.0f, 12.0f);
        d10.bottomMargin = (layoutParams.height - rect.top) + d10.bottomMargin;
        this.P.addView(this.b, d10);
        k7.d6.a(this.b);
        final int i23 = 3;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ic0
            public final /* synthetic */ cd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10;
                int i162 = i23;
                cd0 cd0Var = this.b;
                int i172 = 1;
                switch (i162) {
                    case 0:
                        cd0Var.y0(false);
                        cd0Var.Q.H(null, cd0Var.u0, true);
                        cd0Var.A0 = true;
                        cd0Var.x0();
                        break;
                    case 1:
                        cd0Var.d.M(null, null);
                        break;
                    case 2:
                        cd0.U(cd0Var);
                        break;
                    case 3:
                        cd0Var.f0 = -1L;
                        cd0Var.z0 = true;
                        if (cd0Var.j0()) {
                            cd0Var.g0 = true;
                            cd0Var.z0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (cd0Var.getParentActivity() != null && cd0Var.t0 != null && cd0Var.d0() && cd0Var.F != null) {
                            ph.f3 f3Var = cd0Var.y;
                            if (f3Var != null) {
                                f3Var.e(true);
                            }
                            int i182 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = cd0Var.getLocationController().getSharingLocationInfo(cd0Var.b0);
                            if (cd0Var.D) {
                                cd0Var.C[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                cd0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = cd0Var.L;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    cd0Var.L = null;
                                }
                                cd0Var.D = true;
                                cd0Var.m0().k(0L, 25, 0, null, new lc0(cd0Var, i172), new w10(26, cd0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = cd0Var.L;
                                if (iCircle2 == null) {
                                    cd0Var.e0(500);
                                } else {
                                    cd0Var.M = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(cd0Var.b0) ? cd0Var.getMessagesController().getUser(Long.valueOf(cd0Var.b0)) : null;
                                Activity parentActivity = cd0Var.getParentActivity();
                                jc0 jc0Var = new jc0(cd0Var, i182);
                                ss ssVar = new ss(22, cd0Var, user);
                                lc0 lc0Var = new lc0(cd0Var, 2);
                                org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(parentActivity);
                                mi0Var.a = null;
                                mi0Var.d = -1;
                                mi0Var.e = false;
                                mi0Var.f = false;
                                mi0Var.h = null;
                                mi0Var.n = new Rect();
                                new Paint();
                                mi0Var.w = true;
                                mi0Var.C = org.telegram.ui.Components.mr.h;
                                mi0Var.setWillNotDraw(false);
                                mi0Var.N = lc0Var;
                                mi0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false), PorterDuff.Mode.MULTIPLY));
                                mutate2.getPadding(rect2);
                                int i192 = rect2.left;
                                mi0Var.x = i192;
                                org.telegram.ui.Components.ii0 ii0Var = new org.telegram.ui.Components.ii0(mi0Var.getContext());
                                mi0Var.v = ii0Var;
                                ii0Var.setBackgroundDrawable(mutate2);
                                ii0Var.setPadding(i192, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i192, 0);
                                ii0Var.setVisibility(4);
                                mi0Var.addView(ii0Var, 0, k7.b6.e(-1, -2, 80));
                                mi0Var.L = LocaleController.getUseImperialSystemType();
                                mi0Var.J = user;
                                mi0Var.F = jc0Var;
                                org.telegram.ui.Components.xc0 xc0Var = new org.telegram.ui.Components.xc0(parentActivity, null);
                                mi0Var.D = xc0Var;
                                xc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                xc0Var.setItemCount(5);
                                org.telegram.ui.Components.xc0 xc0Var2 = new org.telegram.ui.Components.xc0(parentActivity, null);
                                mi0Var.E = xc0Var2;
                                xc0Var2.setItemCount(5);
                                xc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.ji0 ji0Var = new org.telegram.ui.Components.ji0(mi0Var, parentActivity);
                                mi0Var.M = ji0Var;
                                ji0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                ji0Var.addView(frameLayout, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView2 = new TextView(parentActivity);
                                textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.y3.t(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false), 1, 20.0f);
                                frameLayout.addView(textView2, k7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView2.setOnTouchListener(new oh.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                ji0Var.addView(linearLayout, k7.b6.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView22 = new TextView(parentActivity);
                                mi0Var.H = textView22;
                                org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0(parentActivity);
                                mi0Var.G = ki0Var;
                                linearLayout.addView(xc0Var, k7.b6.l(0.5f, 0, 270));
                                xc0Var.setFormatter(new org.telegram.ui.Components.hi0(mi0Var, 0));
                                xc0Var.setMinValue(0);
                                xc0Var.setMaxValue(10);
                                xc0Var.setWrapSelectorWheel(false);
                                xc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.hi0 hi0Var = new org.telegram.ui.Components.hi0(mi0Var, 1);
                                xc0Var.setOnValueChangedListener(hi0Var);
                                xc0Var2.setMinValue(0);
                                xc0Var2.setMaxValue(10);
                                xc0Var2.setWrapSelectorWheel(false);
                                xc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(xc0Var2, k7.b6.l(0.5f, 0, 270));
                                xc0Var2.setFormatter(new org.telegram.ui.Components.hi0(mi0Var, 2));
                                xc0Var2.setOnValueChangedListener(hi0Var);
                                xc0Var.setValue(0);
                                xc0Var2.setValue(6);
                                ji0Var.addView(frameLayout2, k7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                                ki0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                ki0Var.setGravity(17);
                                ki0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                                ki0Var.setTextSize(1, 14.0f);
                                ki0Var.setMaxLines(2);
                                ki0Var.setTypeface(AndroidUtilities.bold());
                                ki0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                                frameLayout2.addView(ki0Var, k7.b6.c(48.0f, -1));
                                ki0Var.setOnClickListener(new org.telegram.ui.Components.w2(26, mi0Var, ssVar));
                                textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView22.setGravity(17);
                                textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q5, false));
                                textView22.setTextSize(1, 14.0f);
                                textView22.setAlpha(0.0f);
                                textView22.setScaleX(0.5f);
                                textView22.setScaleY(0.5f);
                                frameLayout2.addView(textView22, k7.b6.c(48.0f, -1));
                                ii0Var.addView(ji0Var, k7.b6.e(-1, -2, 51));
                                cd0Var.O = mi0Var;
                                ((FrameLayout) cd0Var.fragmentView).addView(mi0Var, k7.b6.c(-1.0f, -1));
                                org.telegram.ui.Components.mi0 mi0Var2 = cd0Var.O;
                                mi0Var2.r = false;
                                AnimatorSet animatorSet = mi0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    mi0Var2.s = null;
                                }
                                org.telegram.ui.Components.ii0 ii0Var2 = mi0Var2.v;
                                ii0Var2.measure(View.MeasureSpec.makeMeasureSpec((mi0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (mi0Var2.r) {
                                    z10 = true;
                                } else {
                                    ii0Var2.setVisibility(0);
                                    if (mi0Var2.w) {
                                        mi0Var2.setLayerType(2, null);
                                    }
                                    ii0Var2.setTranslationY(ii0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    mi0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(ii0Var2, (Property<org.telegram.ui.Components.ii0, Float>) View.TRANSLATION_Y, 0.0f));
                                    mi0Var2.s.setDuration(400L);
                                    mi0Var2.s.setStartDelay(20L);
                                    mi0Var2.s.setInterpolator(mi0Var2.C);
                                    z10 = true;
                                    mi0Var2.s.addListener(new org.telegram.ui.Components.li0(mi0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    mi0Var2.s.start();
                                }
                                mi0Var2.c(z10);
                                break;
                            }
                        }
                        break;
                    default:
                        cd0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = cd0Var.y0.messageOwner.media.geo;
                            double d102 = geoPoint.lat;
                            double d1022 = geoPoint._long;
                            cd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d102 + "," + d1022 + "?q=" + d102 + "," + d1022)));
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                }
            }
        });
        z0(false, false);
        this.c = new ImageView(context);
        org.telegram.ui.Cells.z h04 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(40.0f), getThemedColor(i18), getThemedColor(i19));
        k7.d6.a(this.c);
        this.c.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.c.setOutlineProvider(j1Var);
        this.c.setColorFilter(new PorterDuffColorFilter(getThemedColor(i17), mode));
        this.c.setBackgroundDrawable(h04);
        this.c.setScaleType(scaleType);
        this.c.setContentDescription(LocaleController.getString(R.string.AccDescrLocationNotify));
        this.P.addView(this.c, k7.b6.d(40, 40.0f, 53, 0.0f, 62.0f, 12.0f, 0.0f));
        final int i24 = 4;
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ic0
            public final /* synthetic */ cd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10;
                int i162 = i24;
                cd0 cd0Var = this.b;
                int i172 = 1;
                switch (i162) {
                    case 0:
                        cd0Var.y0(false);
                        cd0Var.Q.H(null, cd0Var.u0, true);
                        cd0Var.A0 = true;
                        cd0Var.x0();
                        break;
                    case 1:
                        cd0Var.d.M(null, null);
                        break;
                    case 2:
                        cd0.U(cd0Var);
                        break;
                    case 3:
                        cd0Var.f0 = -1L;
                        cd0Var.z0 = true;
                        if (cd0Var.j0()) {
                            cd0Var.g0 = true;
                            cd0Var.z0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (cd0Var.getParentActivity() != null && cd0Var.t0 != null && cd0Var.d0() && cd0Var.F != null) {
                            ph.f3 f3Var = cd0Var.y;
                            if (f3Var != null) {
                                f3Var.e(true);
                            }
                            int i182 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = cd0Var.getLocationController().getSharingLocationInfo(cd0Var.b0);
                            if (cd0Var.D) {
                                cd0Var.C[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                cd0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = cd0Var.L;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    cd0Var.L = null;
                                }
                                cd0Var.D = true;
                                cd0Var.m0().k(0L, 25, 0, null, new lc0(cd0Var, i172), new w10(26, cd0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = cd0Var.L;
                                if (iCircle2 == null) {
                                    cd0Var.e0(500);
                                } else {
                                    cd0Var.M = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(cd0Var.b0) ? cd0Var.getMessagesController().getUser(Long.valueOf(cd0Var.b0)) : null;
                                Activity parentActivity = cd0Var.getParentActivity();
                                jc0 jc0Var = new jc0(cd0Var, i182);
                                ss ssVar = new ss(22, cd0Var, user);
                                lc0 lc0Var = new lc0(cd0Var, 2);
                                org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(parentActivity);
                                mi0Var.a = null;
                                mi0Var.d = -1;
                                mi0Var.e = false;
                                mi0Var.f = false;
                                mi0Var.h = null;
                                mi0Var.n = new Rect();
                                new Paint();
                                mi0Var.w = true;
                                mi0Var.C = org.telegram.ui.Components.mr.h;
                                mi0Var.setWillNotDraw(false);
                                mi0Var.N = lc0Var;
                                mi0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false), PorterDuff.Mode.MULTIPLY));
                                mutate2.getPadding(rect2);
                                int i192 = rect2.left;
                                mi0Var.x = i192;
                                org.telegram.ui.Components.ii0 ii0Var = new org.telegram.ui.Components.ii0(mi0Var.getContext());
                                mi0Var.v = ii0Var;
                                ii0Var.setBackgroundDrawable(mutate2);
                                ii0Var.setPadding(i192, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i192, 0);
                                ii0Var.setVisibility(4);
                                mi0Var.addView(ii0Var, 0, k7.b6.e(-1, -2, 80));
                                mi0Var.L = LocaleController.getUseImperialSystemType();
                                mi0Var.J = user;
                                mi0Var.F = jc0Var;
                                org.telegram.ui.Components.xc0 xc0Var = new org.telegram.ui.Components.xc0(parentActivity, null);
                                mi0Var.D = xc0Var;
                                xc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                xc0Var.setItemCount(5);
                                org.telegram.ui.Components.xc0 xc0Var2 = new org.telegram.ui.Components.xc0(parentActivity, null);
                                mi0Var.E = xc0Var2;
                                xc0Var2.setItemCount(5);
                                xc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.ji0 ji0Var = new org.telegram.ui.Components.ji0(mi0Var, parentActivity);
                                mi0Var.M = ji0Var;
                                ji0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                ji0Var.addView(frameLayout, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView2 = new TextView(parentActivity);
                                textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.y3.t(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false), 1, 20.0f);
                                frameLayout.addView(textView2, k7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView2.setOnTouchListener(new oh.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                ji0Var.addView(linearLayout, k7.b6.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView22 = new TextView(parentActivity);
                                mi0Var.H = textView22;
                                org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0(parentActivity);
                                mi0Var.G = ki0Var;
                                linearLayout.addView(xc0Var, k7.b6.l(0.5f, 0, 270));
                                xc0Var.setFormatter(new org.telegram.ui.Components.hi0(mi0Var, 0));
                                xc0Var.setMinValue(0);
                                xc0Var.setMaxValue(10);
                                xc0Var.setWrapSelectorWheel(false);
                                xc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.hi0 hi0Var = new org.telegram.ui.Components.hi0(mi0Var, 1);
                                xc0Var.setOnValueChangedListener(hi0Var);
                                xc0Var2.setMinValue(0);
                                xc0Var2.setMaxValue(10);
                                xc0Var2.setWrapSelectorWheel(false);
                                xc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(xc0Var2, k7.b6.l(0.5f, 0, 270));
                                xc0Var2.setFormatter(new org.telegram.ui.Components.hi0(mi0Var, 2));
                                xc0Var2.setOnValueChangedListener(hi0Var);
                                xc0Var.setValue(0);
                                xc0Var2.setValue(6);
                                ji0Var.addView(frameLayout2, k7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                                ki0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                ki0Var.setGravity(17);
                                ki0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                                ki0Var.setTextSize(1, 14.0f);
                                ki0Var.setMaxLines(2);
                                ki0Var.setTypeface(AndroidUtilities.bold());
                                ki0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                                frameLayout2.addView(ki0Var, k7.b6.c(48.0f, -1));
                                ki0Var.setOnClickListener(new org.telegram.ui.Components.w2(26, mi0Var, ssVar));
                                textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView22.setGravity(17);
                                textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q5, false));
                                textView22.setTextSize(1, 14.0f);
                                textView22.setAlpha(0.0f);
                                textView22.setScaleX(0.5f);
                                textView22.setScaleY(0.5f);
                                frameLayout2.addView(textView22, k7.b6.c(48.0f, -1));
                                ii0Var.addView(ji0Var, k7.b6.e(-1, -2, 51));
                                cd0Var.O = mi0Var;
                                ((FrameLayout) cd0Var.fragmentView).addView(mi0Var, k7.b6.c(-1.0f, -1));
                                org.telegram.ui.Components.mi0 mi0Var2 = cd0Var.O;
                                mi0Var2.r = false;
                                AnimatorSet animatorSet = mi0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    mi0Var2.s = null;
                                }
                                org.telegram.ui.Components.ii0 ii0Var2 = mi0Var2.v;
                                ii0Var2.measure(View.MeasureSpec.makeMeasureSpec((mi0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (mi0Var2.r) {
                                    z10 = true;
                                } else {
                                    ii0Var2.setVisibility(0);
                                    if (mi0Var2.w) {
                                        mi0Var2.setLayerType(2, null);
                                    }
                                    ii0Var2.setTranslationY(ii0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    mi0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(ii0Var2, (Property<org.telegram.ui.Components.ii0, Float>) View.TRANSLATION_Y, 0.0f));
                                    mi0Var2.s.setDuration(400L);
                                    mi0Var2.s.setStartDelay(20L);
                                    mi0Var2.s.setInterpolator(mi0Var2.C);
                                    z10 = true;
                                    mi0Var2.s.addListener(new org.telegram.ui.Components.li0(mi0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    mi0Var2.s.start();
                                }
                                mi0Var2.c(z10);
                                break;
                            }
                        }
                        break;
                    default:
                        cd0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = cd0Var.y0.messageOwner.media.geo;
                            double d102 = geoPoint.lat;
                            double d1022 = geoPoint._long;
                            cd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d102 + "," + d1022 + "?q=" + d102 + "," + d1022)));
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                }
            }
        });
        TLRPC.Chat chat = DialogObject.isChatDialog(this.b0) ? getMessagesController().getChat(Long.valueOf(-this.b0)) : null;
        MessageObject messageObject3 = this.y0;
        if (messageObject3 == null || !messageObject3.isLiveLocation() || this.y0.isExpiredLiveLocation(getConnectionsManager().getCurrentTime()) || (ChatObject.isChannel(chat) && !chat.megagroup)) {
            this.c.setVisibility(8);
            this.c.setImageResource(R.drawable.msg_location_alert);
        } else {
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.b0);
            if (sharingLocationInfo == null || sharingLocationInfo.proximityMeters <= 0) {
                if (DialogObject.isUserDialog(this.b0) && this.y0.getFromChatId() == getUserConfig().getClientUserId()) {
                    this.c.setVisibility(4);
                    this.c.setAlpha(0.0f);
                    this.c.setScaleX(0.4f);
                    this.c.setScaleY(0.4f);
                }
                this.c.setImageResource(R.drawable.msg_location_alert);
            } else {
                this.c.setImageResource(R.drawable.msg_location_alert2);
            }
        }
        ph.f3 f3Var = new ph.f3(context, 1);
        this.y = f3Var;
        f3Var.setLayerType(2, null);
        ph.f3 f3Var2 = this.y;
        f3Var2.d = 4000L;
        f3Var2.l(1.0f, -25.0f);
        this.y.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.P.addView(this.y, k7.b6.d(-1, -2.0f, 51, 8.0f, 106.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.f.setGravity(1);
        this.f.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        this.f.setVisibility(8);
        ad0Var.addView(this.f, k7.b6.c(-1.0f, -1));
        this.f.setOnTouchListener(new oh.d(2));
        ImageView imageView3 = new ImageView(context);
        this.h = imageView3;
        imageView3.setImageResource(R.drawable.location_empty);
        this.h.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.W5), mode));
        this.f.addView(this.h, k7.b6.n(-2, -2));
        TextView textView2 = new TextView(context);
        this.n = textView2;
        int i25 = org.telegram.ui.ActionBar.j6.X5;
        textView2.setTextColor(getThemedColor(i25));
        this.n.setGravity(17);
        this.n.setTypeface(AndroidUtilities.bold());
        this.n.setTextSize(1, 17.0f);
        this.n.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView i26 = ai.i(this.f, this.n, k7.b6.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.r = i26;
        i26.setTextColor(getThemedColor(i25));
        this.r.setGravity(17);
        this.r.setTextSize(1, 15.0f);
        this.r.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.f.addView(this.r, k7.b6.t(-2, -2, 17, 0, 6, 0, 0));
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.R = rl0Var;
        qc0 qc0Var2 = new qc0(this, context, this.D0, this.b0, getResourceProvider(), this.B, i14 == 8);
        this.Q = qc0Var2;
        rl0Var.setAdapter(qc0Var2);
        org.telegram.ui.Components.rl0 rl0Var2 = this.R;
        f2.i0 i0Var = new f2.i0(1, false);
        this.V = i0Var;
        rl0Var2.setLayoutManager(i0Var);
        if (this.J0 != null) {
            this.I0 = new org.telegram.ui.Cells.t3(context, this.resourceProvider);
            sc0 sc0Var = new sc0(this, context, new org.telegram.ui.Components.qu0(this), this, new rc0(this), getResourceProvider());
            this.H0 = sc0Var;
            sc0Var.setBackgroundColor(getThemedColor(i12));
            this.H0.addView(this.I0, k7.b6.e(-1, 32, 55));
            this.Q.e0 = this.H0;
            this.R.setOverScrollMode(2);
            f2.l lVar = new f2.l();
            z4 = false;
            lVar.m = false;
            lVar.C = false;
            lVar.o(org.telegram.ui.Components.mr.h);
            lVar.n(350L);
            this.R.setItemAnimator(lVar);
        } else {
            z4 = false;
        }
        this.Q.O(this.Z, z4);
        this.Q.getClass();
        this.R.setVerticalScrollBarEnabled(z4);
        ad0Var.addView(this.R, k7.b6.e(-1, -1, 51));
        MessageObject messageObject4 = this.y0;
        if (messageObject4 != null && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
            qc0 qc0Var3 = this.Q;
            qc0Var3.N = this.y0.messageOwner.media.address;
            qc0Var3.Q();
        }
        this.R.setOnScrollListener(new tc0(this));
        ((f2.l) this.R.getItemAnimator()).C = false;
        this.R.setOnItemLongClickListener(new ss(20, this, context));
        this.R.setOnItemClickListener(new j(this, 16));
        qc0 qc0Var4 = this.Q;
        long j10 = this.b0;
        jc0 jc0Var = new jc0(this, 5);
        qc0Var4.E = j10;
        qc0Var4.y = jc0Var;
        qc0Var4.P(this.E0);
        ad0Var.addView(this.P, k7.b6.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.H = onCreateMapView;
        onCreateMapView.getView().setAlpha(0.0f);
        this.H.setOnDispatchTouchEventInterceptor(new jc0(this, 6));
        this.H.setOnInterceptTouchEventInterceptor(new jc0(this, 7));
        this.H.setOnLayoutListener(new lc0(this, 5));
        new Thread(new mc0(this, this.H, 1)).start();
        MessageObject messageObject5 = this.y0;
        if (messageObject5 == null && this.w0 == null) {
            i10 = i14;
            if (chat != null && i10 == 4 && this.b0 != 0) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackgroundResource(R.drawable.livepin);
                this.P.addView(frameLayout, k7.b6.e(62, 76, 49));
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                p9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
                p9Var.e(chat, new org.telegram.ui.Components.z8(chat));
                frameLayout.addView(p9Var, k7.b6.d(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                this.U = frameLayout;
                frameLayout.setTag(1);
            }
            if (this.U == null) {
                ImageView imageView4 = new ImageView(context);
                imageView4.setImageResource(R.drawable.map_pin2);
                this.P.addView(imageView4, k7.b6.e(28, 48, 49));
                this.U = imageView4;
            }
            org.telegram.ui.Components.rl0 rl0Var3 = new org.telegram.ui.Components.rl0(context, null);
            this.S = rl0Var3;
            rl0Var3.setVisibility(8);
            i11 = 0;
            this.S.setLayoutManager(new f2.i0(1, false));
            vc0 vc0Var2 = new vc0(this, context, getResourceProvider(), i10 == 8);
            this.T = vc0Var2;
            jc0 jc0Var2 = new jc0(this, 8);
            vc0Var2.E = 0L;
            vc0Var2.y = jc0Var2;
            ad0Var.addView(this.S, k7.b6.e(-1, -1, 51));
            this.S.setOnScrollListener(new n3(this, 18));
            this.S.setOnItemClickListener(new gg.v0(19, this, n10));
        } else {
            i10 = i14;
            i11 = 0;
            if ((messageObject5 != null && !messageObject5.isLiveLocation()) || this.w0 != null) {
                TLRPC.TL_channelLocation tL_channelLocation2 = this.w0;
                if (tL_channelLocation2 != null) {
                    this.Q.U = tL_channelLocation2;
                } else {
                    MessageObject messageObject6 = this.y0;
                    if (messageObject6 != null) {
                        qc0 qc0Var5 = this.Q;
                        qc0Var5.T = messageObject6;
                        qc0Var5.l();
                    }
                }
            }
        }
        MessageObject messageObject7 = this.y0;
        if (messageObject7 != null && i10 == 6) {
            qc0 qc0Var6 = this.Q;
            qc0Var6.T = messageObject7;
            qc0Var6.l();
        }
        while (i11 < 2) {
            UndoView undoView = new UndoView(context);
            UndoView[] undoViewArr = this.C;
            undoViewArr[i11] = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            undoViewArr[i11].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.P.addView(undoViewArr[i11], k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            i11++;
        }
        nh.a3 a3Var = new nh.a3(this, context, rect);
        this.v = a3Var;
        a3Var.setTranslationZ(AndroidUtilities.dp(6.0f));
        this.P.addView(this.v, layoutParams);
        if (this.y0 == null && this.w0 == null && this.x0 != null) {
            this.z0 = true;
            ImageView imageView5 = this.a;
            int i27 = org.telegram.ui.ActionBar.j6.ui;
            imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(i27), PorterDuff.Mode.MULTIPLY));
            this.a.setTag(Integer.valueOf(i27));
        }
        ad0Var.addView(this.actionBar);
        B0();
        return this.fragmentView;
    }

    public final boolean d0() {
        if (h0()) {
            return false;
        }
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, getThemedColor(org.telegram.ui.ActionBar.j6.L5), null);
                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new jc0(this, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(alertDialog$Builder.a);
                    return false;
                }
            } catch (Exception e) {
                FileLog.e(e);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        qc0 qc0Var;
        qc0 qc0Var2;
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
            return;
        }
        if (i10 == NotificationCenter.locationPermissionGranted) {
            this.Z = false;
            qc0 qc0Var3 = this.Q;
            if (qc0Var3 != null) {
                qc0Var3.O(false, false);
            }
            IMapsProvider.IMap iMap = this.F;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.locationPermissionDenied) {
            this.Z = true;
            qc0 qc0Var4 = this.Q;
            if (qc0Var4 != null) {
                qc0Var4.O(true, false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.liveLocationsChanged) {
            qc0 qc0Var5 = this.Q;
            if (qc0Var5 != null) {
                qc0Var5.l();
            }
            C0();
            return;
        }
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue() || ((Long) objArr[0]).longValue() != this.b0 || this.y0 == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[1];
            boolean z4 = false;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i12);
                if (messageObject.isLiveLocation()) {
                    c0(messageObject.messageOwner);
                    z4 = true;
                } else if ((messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) && DialogObject.isUserDialog(messageObject.getDialogId())) {
                    this.c.setImageResource(R.drawable.msg_location_alert);
                    IMapsProvider.ICircle iCircle = this.L;
                    if (iCircle != null) {
                        iCircle.remove();
                        this.L = null;
                    }
                }
            }
            if (!z4 || (qc0Var2 = this.Q) == null) {
                return;
            }
            qc0Var2.N(this.d0);
            return;
        }
        if (i10 == NotificationCenter.replaceMessagesObjects) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue != this.b0 || this.y0 == null) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[1];
            boolean z10 = false;
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i13);
                if (messageObject2.isLiveLocation()) {
                    TLRPC.Message message = messageObject2.messageOwner;
                    wc0 wc0Var = (wc0) this.e0.f(message.from_id != null ? MessageObject.getFromChatId(message) : MessageObject.getDialogId(message));
                    if (wc0Var != null) {
                        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(longValue);
                        if (sharingLocationInfo == null || sharingLocationInfo.mid != messageObject2.getId()) {
                            TLRPC.Message message2 = messageObject2.messageOwner;
                            wc0Var.b = message2;
                            TLRPC.GeoPoint geoPoint = message2.media.geo;
                            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                            wc0Var.e.setPosition(latLng);
                            if (this.f0 == wc0Var.a) {
                                this.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(wc0Var.e.getPosition()));
                            }
                            IMapsProvider.IMarker iMarker = wc0Var.f;
                            if (iMarker != null) {
                                iMarker.getPosition();
                                wc0Var.f.setPosition(latLng);
                                int i14 = messageObject2.messageOwner.media.heading;
                                if (i14 != 0) {
                                    wc0Var.f.setRotation(i14);
                                    if (!wc0Var.g) {
                                        wc0Var.f.setIcon(R.drawable.map_pin_cone2);
                                        wc0Var.g = true;
                                    }
                                } else if (wc0Var.g) {
                                    wc0Var.f.setRotation(0);
                                    wc0Var.f.setIcon(R.drawable.map_pin_circle);
                                    wc0Var.g = false;
                                }
                            }
                        }
                        z10 = true;
                    }
                }
            }
            if (z10 && (qc0Var = this.Q) != null) {
                qc0Var.l();
                org.telegram.ui.Components.mi0 mi0Var = this.O;
                if (mi0Var != null) {
                    mi0Var.c(true);
                }
            }
            if (z10) {
                C0();
            }
        }
    }

    public final void e0(int i10) {
        if (this.F == null) {
            return;
        }
        List<IMapsProvider.PatternItem> asList = Arrays.asList(new IMapsProvider.PatternItem.Gap(20), new IMapsProvider.PatternItem.Dash(20));
        IMapsProvider.ICircleOptions onCreateCircleOptions = ApplicationLoader.getMapsProvider().onCreateCircleOptions();
        onCreateCircleOptions.center(new IMapsProvider.LatLng(this.t0.getLatitude(), this.t0.getLongitude()));
        onCreateCircleOptions.radius(i10);
        if (n0()) {
            onCreateCircleOptions.strokeColor(-1771658281);
            onCreateCircleOptions.fillColor(476488663);
        } else {
            onCreateCircleOptions.strokeColor(-1774024971);
            onCreateCircleOptions.fillColor(474121973);
        }
        onCreateCircleOptions.strokePattern(asList);
        onCreateCircleOptions.strokeWidth(2);
        this.L = this.F.addCircle(onCreateCircleOptions);
    }

    public final Bitmap f0(int i10) {
        Bitmap[] bitmapArr = this.N0;
        Bitmap bitmap = bitmapArr[i10 % 7];
        if (bitmap != null) {
            return bitmap;
        }
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            paint.setColor(org.telegram.ui.Cells.t4.a(i10));
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i10 % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return null;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean finishFragment(boolean z4) {
        if (q0()) {
            return false;
        }
        return super.finishFragment(z4);
    }

    public final Bitmap g0(wc0 wc0Var) {
        Bitmap bitmap = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(62.0f), AndroidUtilities.dp(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.map_pin_photo);
                drawable.setBounds(0, 0, AndroidUtilities.dp(62.0f), AndroidUtilities.dp(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
                TLRPC.User user = wc0Var.c;
                if (user != null) {
                    z8Var.m(this.currentAccount, user);
                } else {
                    TLRPC.Chat chat = wc0Var.d;
                    if (chat != null) {
                        z8Var.k(this.currentAccount, chat);
                    }
                }
                canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                z8Var.setBounds(0, 0, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
                z8Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = wc0Var.h;
                Bitmap bitmap2 = (imageReceiver == null || !imageReceiver.hasImageLoaded()) ? null : wc0Var.h.getBitmap();
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float dp = AndroidUtilities.dp(50.0f) / bitmap2.getWidth();
                    matrix.postTranslate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                    matrix.postScale(dp, dp);
                    paint.setShader(bitmapShader);
                    bitmapShader.setLocalMatrix(matrix);
                    rectF.set(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f), paint);
                }
                canvas.restore();
                try {
                    canvas.setBitmap(null);
                    return createBitmap;
                } catch (Exception unused) {
                    return createBitmap;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmap = createBitmap;
                FileLog.e(th);
                return bitmap;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 21);
        int i10 = 0;
        while (true) {
            UndoView[] undoViewArr = this.C;
            if (i10 >= undoViewArr.length) {
                break;
            }
            UndoView undoView = undoViewArr[i10];
            int i11 = org.telegram.ui.ActionBar.j6.Fi;
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoView, 32, null, null, null, null, i11));
            int i12 = org.telegram.ui.ActionBar.j6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i12));
            int i13 = org.telegram.ui.ActionBar.j6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "BODY", i11));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big", i11));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big 3", i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Small", i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Main", i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Top", i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Line", i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Big", i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Small", i13));
            i10++;
        }
        View view = this.fragmentView;
        int i14 = org.telegram.ui.ActionBar.j6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, fVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 32768, null, null, null, null, i14));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.j6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 64, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_27, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.Vd));
        org.telegram.ui.ActionBar.w0 w0Var = this.w;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var != null ? w0Var.getSearchField() : null, 16777216, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_31, null, null, null, fVar, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_30, null, null, null, fVar, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, fVar, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        ImageView imageView = this.h;
        int i16 = org.telegram.ui.ActionBar.j6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, null, null, i16));
        TextView textView = this.n;
        int i17 = org.telegram.ui.ActionBar.j6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.r, 4, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
        ImageView imageView2 = this.a;
        int i18 = org.telegram.ui.ActionBar.j6.ui;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView2, 262152, null, null, null, null, i18));
        ImageView imageView3 = this.a;
        int i19 = org.telegram.ui.ActionBar.j6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView3, 262152, null, null, null, null, i19));
        ImageView imageView4 = this.a;
        int i20 = org.telegram.ui.ActionBar.j6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView4, 32, null, null, null, null, i20));
        ImageView imageView5 = this.a;
        int i21 = org.telegram.ui.ActionBar.j6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView5, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, fVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, null, null, null, fVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 4, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.r0, fVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.si));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 393216, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 393216, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 393248, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 393248, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.pi));
        int i22 = org.telegram.ui.ActionBar.j6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 262144, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 262144, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 131072, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 196608, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 32, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 48, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 32, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        int i23 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 32, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, new Class[]{org.telegram.ui.Cells.t7.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, new Class[]{org.telegram.ui.Cells.t7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 8, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView2"}, null, null, -1, null, i17));
        return arrayList;
    }

    public boolean h0() {
        return this instanceof in;
    }

    public final void i0(ArrayList arrayList) {
        IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = this.c0 ? ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder() : null;
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
            int i11 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i12 = messageMedia.period;
            if (i11 + i12 > currentTime || i12 == Integer.MAX_VALUE) {
                if (onCreateLatLngBoundsBuilder != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    onCreateLatLngBoundsBuilder.include(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                }
                c0(message);
                if (this.c.getVisibility() != 8 && MessageObject.getFromChatId(message) != getUserConfig().getClientUserId()) {
                    this.c.setVisibility(0);
                    this.E = true;
                    this.c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new org.telegram.ui.Components.f91(this, 23)).start();
                }
            }
        }
        if (onCreateLatLngBoundsBuilder != null) {
            if (this.c0) {
                this.R.v0(0, AndroidUtilities.dp(99.0f), null);
            }
            this.c0 = false;
            this.Q.N(this.d0);
            if (this.y0.isLiveLocation()) {
                try {
                    IMapsProvider.LatLng center = onCreateLatLngBoundsBuilder.build().getCenter();
                    IMapsProvider.LatLng p02 = p0(center, 100.0d, 100.0d);
                    onCreateLatLngBoundsBuilder.include(p0(center, -100.0d, -100.0d));
                    onCreateLatLngBoundsBuilder.include(p02);
                    IMapsProvider.ILatLngBounds build = onCreateLatLngBoundsBuilder.build();
                    if (arrayList.size() > 1) {
                        try {
                            IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build, AndroidUtilities.dp(113.0f));
                            this.G = newCameraUpdateLatLngBounds;
                            this.F.moveCamera(newCameraUpdateLatLngBounds);
                            this.G = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return i0.a.f(getThemedColor(org.telegram.ui.ActionBar.j6.d6)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final boolean j0() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i10;
        if (this.F != null) {
            ArrayList arrayList = new ArrayList();
            int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
            ArrayList arrayList2 = this.d0;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                wc0 wc0Var = (wc0) arrayList2.get(i11);
                IMapsProvider.IMarker iMarker = wc0Var.e;
                if (iMarker != null && (message = wc0Var.b) != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > currentTime)) {
                    arrayList.add(iMarker.getPosition());
                }
            }
            boolean z4 = this.e0.f(getUserConfig().getClientUserId()) != null;
            Location location = this.t0;
            if (location != null && !z4) {
                arrayList.add(new IMapsProvider.LatLng(location.getLatitude(), this.t0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    double d10 = Double.MAX_VALUE;
                    double d11 = Double.MAX_VALUE;
                    int i12 = 0;
                    double d12 = -1.7976931348623157E308d;
                    while (i12 < size2) {
                        IMapsProvider.LatLng latLng = (IMapsProvider.LatLng) arrayList.get(i12);
                        onCreateLatLngBoundsBuilder.include(latLng);
                        int i13 = size2;
                        double d13 = latLng.latitude;
                        if (d13 < d10) {
                            d10 = d13;
                        }
                        if (d13 > d) {
                            d = d13;
                        }
                        double d14 = latLng.longitude;
                        if (d14 < d11) {
                            d11 = d14;
                        }
                        if (d14 > d12) {
                            d12 = d14;
                        }
                        i12++;
                        size2 = i13;
                    }
                    IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng((d10 + d) / 2.0d, (d11 + d12) / 2.0d);
                    double radians = Math.toRadians(d - d10) * 6366198.0d;
                    double radians2 = Math.toRadians(d12 - d11) * 6366198.0d * Math.cos(Math.toRadians(latLng2.latitude));
                    if (radians < 30.0d || radians2 < 30.0d) {
                        onCreateLatLngBoundsBuilder.include(p0(latLng2, 15.0d, 15.0d));
                        onCreateLatLngBoundsBuilder.include(p0(latLng2, -15.0d, -15.0d));
                    }
                    this.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(onCreateLatLngBoundsBuilder.build(), AndroidUtilities.dp(60.0f)), 500, null);
                    return true;
                } catch (Exception e) {
                    FileLog.e(e);
                    return false;
                }
            }
        }
        return false;
    }

    public final void k0(boolean z4) {
        FrameLayout.LayoutParams layoutParams;
        if (this.R != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight == 0) {
                return;
            }
            int i10 = this.D0;
            if (i10 == 6) {
                this.E0 = org.telegram.messenger.y3.B(66.0f, measuredHeight, currentActionBarHeight);
            } else if (i10 == 2) {
                this.E0 = org.telegram.messenger.y3.B(73.0f, measuredHeight, currentActionBarHeight);
            } else {
                this.E0 = org.telegram.messenger.y3.B(66.0f, measuredHeight, currentActionBarHeight);
            }
            sc0 sc0Var = this.H0;
            if (sc0Var != null && sc0Var.c0(8) > 0) {
                this.E0 -= AndroidUtilities.dp(200.0f);
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.R.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            this.R.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.P.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.E0;
            this.P.setLayoutParams(layoutParams3);
            org.telegram.ui.Components.rl0 rl0Var = this.S;
            if (rl0Var != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) rl0Var.getLayoutParams();
                layoutParams4.topMargin = currentActionBarHeight;
                this.S.setLayoutParams(layoutParams4);
            }
            this.Q.P(this.E0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.H.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.E0;
                IMapsProvider.IMap iMap = this.F;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                this.H.getView().setLayoutParams(layoutParams5);
            }
            zc0 zc0Var = this.x;
            if (zc0Var != null && (layoutParams = (FrameLayout.LayoutParams) zc0Var.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.E0;
                this.x.setLayoutParams(layoutParams);
            }
            this.Q.l();
            if (!z4) {
                A0(false);
                return;
            }
            int i11 = i10 == 3 ? 73 : (i10 == 1 || i10 == 2) ? 66 : 0;
            this.V.h1(0, -AndroidUtilities.dp(i11));
            A0(false);
            this.R.post(new org.telegram.ui.Components.dw(this, i11, 14));
        }
    }

    public final boolean l0() {
        ArrayList arrayList = (ArrayList) getLocationController().locationsCache.f(this.y0.getDialogId());
        if (arrayList == null || !arrayList.isEmpty()) {
            arrayList = null;
        } else {
            i0(arrayList);
        }
        if (DialogObject.isChatDialog(this.b0)) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.b0));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long dialogId = this.y0.getDialogId();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(dialogId);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new nh.t5(this, dialogId, 6));
        return arrayList != null;
    }

    public final UndoView m0() {
        UndoView[] undoViewArr = this.C;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.e(2, true);
            this.P.removeView(undoViewArr[0]);
            this.P.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean n0() {
        return (getResourceProvider() == null && org.telegram.ui.ActionBar.j6.I.q()) || AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.j6.d6)) < 0.721f;
    }

    public final void o0() {
        SharedPreferences globalMainSettings;
        int i10;
        ImageView imageView = this.c;
        if (imageView == null || imageView.getVisibility() != 0 || this.E || (i10 = (globalMainSettings = MessagesController.getGlobalMainSettings()).getInt("proximityhint", 0)) >= 3) {
            return;
        }
        globalMainSettings.edit().putInt("proximityhint", i10 + 1).commit();
        if (DialogObject.isUserDialog(this.b0)) {
            this.y.s(LocaleController.formatString("ProximityTooltioUser", R.string.ProximityTooltioUser, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.b0)))));
        } else {
            this.y.s(LocaleController.getString(R.string.ProximityTooltioGroup));
        }
        this.y.u();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.Components.mi0 mi0Var = this.O;
        if (mi0Var == null) {
            IMapsProvider.IMapView iMapView = this.H;
            if (iMapView == null || iMapView.getGlSurfaceView() == null || this.J) {
                return super.onBackPressed(z4);
            }
            if (z4) {
                q0();
            }
        } else if (z4) {
            mi0Var.a();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.C[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        MessageObject messageObject = this.y0;
        if (messageObject == null || !messageObject.isLiveLocation()) {
            return true;
        }
        getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(this, NotificationCenter.replaceMessagesObjects);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.replaceMessagesObjects);
        try {
            IMapsProvider.IMap iMap = this.F;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            IMapsProvider.IMapView iMapView = this.H;
            if (iMapView != null) {
                iMapView.onDestroy();
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        UndoView undoView = this.C[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        qc0 qc0Var = this.Q;
        if (qc0Var != null) {
            qc0Var.F();
        }
        vc0 vc0Var = this.T;
        if (vc0Var != null) {
            vc0Var.F();
        }
        lc0 lc0Var = this.G0;
        if (lc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lc0Var);
            this.G0 = null;
        }
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            wc0 wc0Var = (wc0) arrayList.get(i10);
            ImageReceiver imageReceiver = wc0Var.h;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                wc0Var.h = null;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onLowMemory() {
        super.onLowMemory();
        IMapsProvider.IMapView iMapView = this.H;
        if (iMapView == null || !this.r0) {
            return;
        }
        iMapView.onLowMemory();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        IMapsProvider.IMapView iMapView = this.H;
        if (iMapView != null && this.r0) {
            try {
                iMapView.onPause();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        UndoView undoView = this.C[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.s0 = false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 30) {
            s0(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        IMapsProvider.IMapView iMapView = this.H;
        if (iMapView != null && this.r0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.s0 = true;
        IMapsProvider.IMap iMap = this.F;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        k0(true);
        if (h0()) {
            this.m0 = false;
        } else if (this.m0 && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.m0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        lc0 lc0Var = this.G0;
        if (lc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lc0Var);
            AndroidUtilities.runOnUIThread(this.G0, 5000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 || z10) {
            return;
        }
        try {
            if (this.H.getView().getParent() instanceof ViewGroup) {
                ((ViewGroup) this.H.getView().getParent()).removeView(this.H.getView());
            }
        } catch (Exception unused) {
        }
        n0 n0Var = this.P;
        if (n0Var == null) {
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView(this.H.getView(), 0, k7.b6.e(-1, -1, 51));
                return;
            }
            return;
        }
        n0Var.addView(this.H.getView(), 0, k7.b6.e(-1, AndroidUtilities.dp(10.0f) + this.E0, 51));
        zc0 zc0Var = this.x;
        if (zc0Var != null) {
            try {
                if (zc0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.x.getParent()).removeView(this.x);
                }
            } catch (Exception unused2) {
            }
            this.P.addView(this.x, 1, k7.b6.e(-1, AndroidUtilities.dp(10.0f) + this.E0, 51));
        }
        A0(false);
        o0();
    }

    public final boolean q0() {
        IMapsProvider.IMapView iMapView = this.H;
        if (iMapView == null || iMapView.getGlSurfaceView() == null || this.J) {
            return false;
        }
        GLSurfaceView glSurfaceView = this.H.getGlSurfaceView();
        glSurfaceView.queueEvent(new w10(25, this, glSurfaceView));
        return true;
    }

    public final void r0(wc0 wc0Var) {
        double d;
        double d10;
        TLRPC.Message message;
        if (wc0Var == null || (message = wc0Var.b) == null) {
            MessageObject messageObject = this.y0;
            if (messageObject != null) {
                TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                d = geoPoint.lat;
                d10 = geoPoint._long;
            } else {
                TLRPC.GeoPoint geoPoint2 = this.w0.geo_point;
                d = geoPoint2.lat;
                d10 = geoPoint2._long;
            }
        } else {
            TLRPC.GeoPoint geoPoint3 = message.media.geo;
            d = geoPoint3.lat;
            d10 = geoPoint3._long;
        }
        String str = BuildVars.isHuaweiStoreApp() ? "mapapp://navigation" : "http://maps.google.com/maps";
        if (this.t0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.t0.getLatitude()), Double.valueOf(this.t0.getLongitude()), Double.valueOf(d), Double.valueOf(d10)))));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d10)))));
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void s0(final boolean z4) {
        Activity parentActivity;
        if (this.C0 == null || h0() || getParentActivity() == null || this.t0 == null || !d0()) {
            return;
        }
        if (this.n0 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
            this.n0 = false;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                org.telegram.ui.Components.z4.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new hc0(this, z4, 1), null).o();
                return;
            }
        }
        final TLRPC.User user = DialogObject.isUserDialog(this.b0) ? getMessagesController().getUser(Long.valueOf(this.b0)) : null;
        showDialog(org.telegram.ui.Components.z4.E(getParentActivity(), z4, user, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.kc0
            @Override // org.telegram.messenger.MessagesStorage.IntCallback
            public final void run(int i10) {
                cd0.V(cd0.this, z4, user, i10);
            }
        }, null));
    }

    public final void t0(Location location) {
        int i10;
        if (location == null) {
            return;
        }
        this.t0 = new Location(location);
        wc0 wc0Var = (wc0) this.e0.f(getUserConfig().getClientUserId());
        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.b0);
        if (wc0Var != null && sharingLocationInfo != null && wc0Var.b.id == sharingLocationInfo.mid) {
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            wc0Var.e.setPosition(latLng);
            IMapsProvider.IMarker iMarker = wc0Var.f;
            if (iMarker != null) {
                iMarker.setPosition(latLng);
            }
            if (this.f0 == wc0Var.a) {
                this.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(wc0Var.e.getPosition()));
            }
        }
        if (this.y0 == null && this.w0 == null && this.F != null) {
            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            qc0 qc0Var = this.Q;
            if (qc0Var != null) {
                if (!this.A0 && (i10 = this.D0) != 4 && i10 != 8) {
                    qc0Var.H(null, this.t0, true);
                }
                this.Q.M(this.t0);
            }
            if (!this.z0) {
                this.u0 = new Location(location);
                if (this.B0) {
                    this.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng2));
                } else {
                    this.B0 = true;
                    this.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, this.F.getMaxZoomLevel() - 4.0f));
                }
            }
        } else {
            this.Q.M(this.t0);
        }
        org.telegram.ui.Components.mi0 mi0Var = this.O;
        if (mi0Var != null) {
            mi0Var.c(true);
        }
        IMapsProvider.ICircle iCircle = this.L;
        if (iCircle != null) {
            iCircle.setCenter(new IMapsProvider.LatLng(this.t0.getLatitude(), this.t0.getLongitude()));
        }
        C0();
    }

    public final void u0(MessageObject messageObject) {
        this.y0 = messageObject;
        this.b0 = messageObject.getDialogId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0(wc0 wc0Var) {
        if (wc0Var.h != null) {
            return;
        }
        TLRPC.User user = wc0Var.c;
        TLRPC.Chat chat = wc0Var.d;
        if (user == null && chat == 0) {
            return;
        }
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        if (user != null) {
            z8Var.m(this.currentAccount, user);
        } else {
            z8Var.k(this.currentAccount, chat);
        }
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setCurrentAccount(this.currentAccount);
        imageReceiver.setDelegate(new ss(21, this, wc0Var));
        imageReceiver.onAttachedToWindow();
        if (user == null) {
            user = chat;
        }
        imageReceiver.setForUserOrChat(user, z8Var);
        wc0Var.h = imageReceiver;
    }

    public final void w0(int i10, TLRPC.User user, int i11) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.t0.getLatitude());
        tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(this.t0.getLongitude());
        tL_messageMediaGeoLive.heading = LocationController.getHeading(this.t0);
        int i12 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i10;
        tL_messageMediaGeoLive.proximity_notification_radius = i11;
        tL_messageMediaGeoLive.flags = i12 | 9;
        this.C0.b(tL_messageMediaGeoLive, this.D0, true, 0, 0L);
        if (i11 <= 0) {
            finishFragment();
            return;
        }
        this.O.I = true;
        this.c.setImageResource(R.drawable.msg_location_alert2);
        org.telegram.ui.Components.mi0 mi0Var = this.O;
        if (mi0Var != null) {
            mi0Var.a();
        }
        m0().k(0L, 24, Integer.valueOf(i11), user, null, null);
    }

    public final void x0() {
        if (this.Q.h() != 0 && this.V.L0() == 0) {
            View childAt = this.R.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top < 0 || top > AndroidUtilities.dp(258.0f)) {
                return;
            }
            this.R.v0(0, top, null);
        }
    }

    public final void y0(boolean z4) {
        org.telegram.ui.Components.yk ykVar;
        Location location;
        Location location2;
        if (this.D0 == 3) {
            z4 = true;
        }
        if (z4 && (ykVar = this.e) != null && ykVar.getTag() == null && ((location = this.t0) == null || (location2 = this.u0) == null || location2.distanceTo(location) < 300.0f)) {
            z4 = false;
        }
        org.telegram.ui.Components.yk ykVar2 = this.e;
        if (ykVar2 != null) {
            if (!z4 || ykVar2.getTag() == null) {
                if (z4 || this.e.getTag() != null) {
                    this.e.setTag(z4 ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.yk, Float>) View.TRANSLATION_X, z4 ? 0.0f : -AndroidUtilities.dp(80.0f)));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(org.telegram.ui.Components.mr.g);
                    animatorSet.start();
                }
            }
        }
    }

    public final void z0(boolean z4, boolean z10) {
        Boolean bool = this.M0;
        if (bool == null || bool.booleanValue() != z4) {
            this.M0 = Boolean.valueOf(z4);
            if (z10) {
                this.b.setVisibility(0);
                this.b.animate().alpha(z4 ? 1.0f : 0.0f).scaleX(z4 ? 1.0f : 0.7f).scaleY(z4 ? 1.0f : 0.7f).setInterpolator(org.telegram.ui.Components.mr.h).setDuration(420L).withEndAction(new hc0(this, z4, 0)).start();
            } else {
                this.b.setVisibility(z4 ? 0 : 8);
                this.b.setAlpha(z4 ? 1.0f : 0.0f);
                this.b.setScaleX(z4 ? 1.0f : 0.7f);
                this.b.setScaleY(z4 ? 1.0f : 0.7f);
            }
        }
    }
}

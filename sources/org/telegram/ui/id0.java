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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class id0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.TL_channelLocation A0;
    public MessageObject B0;
    public boolean C0;
    public boolean D0;
    public boolean E;
    public boolean E0;
    public final UndoView[] F;
    public dd0 F0;
    public boolean G;
    public final int G0;
    public boolean H;
    public int H0;
    public IMapsProvider.IMap I;
    public ad0 I0;
    public IMapsProvider.ICameraUpdate J;
    public sc0 J0;
    public IMapsProvider.IMapView K;
    public yc0 K0;
    public IMapsProvider.ICameraUpdate L;
    public org.telegram.ui.Cells.u3 L0;
    public boolean M;
    public TL_stories.MediaArea M0;
    public float N;
    public boolean N0;
    public IMapsProvider.ICircle O;
    public boolean O0;
    public double P;
    public Boolean P0;
    public boolean Q;
    public final Bitmap[] Q0;
    public org.telegram.ui.Components.ei0 R;
    public j0 S;
    public wc0 T;
    public org.telegram.ui.Components.ll0 U;
    public org.telegram.ui.Components.ll0 V;
    public bd0 W;
    public View X;
    public s4.c0 Y;
    public org.telegram.ui.ActionBar.v0 Z;
    public ImageView a;
    public boolean a0;
    public TextView b;
    public boolean b0;
    public ImageView c;
    public boolean c0;
    public org.telegram.ui.ActionBar.v0 d;
    public boolean d0;
    public org.telegram.ui.Components.el e;
    public long e0;
    public LinearLayout f;
    public boolean f0;
    public final ArrayList g0;
    public ImageView h;
    public final a0.i h0;
    public long i0;
    public boolean j0;
    public final ArrayList k0;
    public AnimatorSet l0;
    public IMapsProvider.IMarker m0;
    public TextView n;
    public hd0 n0;
    public FrameLayout o0;
    public boolean p0;
    public boolean q0;
    public TextView r;
    public boolean r0;
    public Drawable s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public bi.a4 v;
    public boolean v0;
    public org.telegram.ui.ActionBar.v0 w;
    public Location w0;
    public fd0 x;
    public Location x0;
    public di.f4 y;
    public int y0;
    public TLRPC.TL_channelLocation z0;

    public id0(int i10) {
        super(null);
        this.F = new UndoView[2];
        this.b0 = true;
        this.c0 = false;
        this.d0 = true;
        this.f0 = true;
        this.g0 = new ArrayList();
        this.h0 = new a0.i();
        this.i0 = -1L;
        this.k0 = new ArrayList();
        this.p0 = true;
        this.q0 = true;
        this.H0 = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.O0 = true;
        this.Q0 = new Bitmap[7];
        this.G0 = i10;
        AndroidUtilities.fixGoogleMapsBug();
    }

    public static void U(id0 id0Var) {
        IMapsProvider.IMap iMap;
        Activity parentActivity;
        int i10 = id0Var.G0;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = id0Var.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            if (id0Var.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(id0Var.getParentActivity());
            alertDialog$Builder.m(R.raw.permission_request_location, 72, id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.L5), null);
            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
            alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new qc0(id0Var, 1));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            id0Var.showDialog(alertDialog$Builder.a);
            return;
        }
        if (id0Var.d0() || i10 == 3) {
            if ((id0Var.B0 == null || i10 == 3) && id0Var.z0 == null) {
                if (id0Var.w0 != null && id0Var.I != null) {
                    ImageView imageView = id0Var.a;
                    int i11 = org.telegram.ui.ActionBar.j6.vi;
                    imageView.setColorFilter(new PorterDuffColorFilter(id0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                    id0Var.a.setTag(Integer.valueOf(i11));
                    id0Var.T.L(null);
                    id0Var.C0 = false;
                    id0Var.y0(false);
                    id0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(id0Var.w0.getLatitude(), id0Var.w0.getLongitude())));
                    if (id0Var.D0 && i10 != 8) {
                        Location location = id0Var.w0;
                        if (location != null) {
                            id0Var.T.H(null, location, true);
                        }
                        id0Var.D0 = false;
                        id0Var.x0();
                    }
                }
            } else if (id0Var.w0 != null && (iMap = id0Var.I) != null) {
                iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(id0Var.w0.getLatitude(), id0Var.w0.getLongitude()), id0Var.I.getMaxZoomLevel() - 4.0f));
            }
            if (id0Var.m0 != null) {
                id0Var.X.setVisibility(0);
                fd0 fd0Var = id0Var.x;
                IMapsProvider.IMarker iMarker = id0Var.m0;
                HashMap hashMap = fd0Var.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    fd0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                id0Var.m0 = null;
                id0Var.n0 = null;
                id0Var.o0 = null;
            }
        }
    }

    public static /* synthetic */ void V(id0 id0Var, boolean z10, TLRPC.User user, int i10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (!z10) {
            id0Var.w0(i10, user, 0);
            return;
        }
        LocationController.SharingLocationInfo sharingLocationInfo = id0Var.getLocationController().getSharingLocationInfo(id0Var.e0);
        if (sharingLocationInfo != null) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = id0Var.getMessagesController().getInputPeer(sharingLocationInfo.did);
            tL_messages_editMessage.id = sharingLocationInfo.mid;
            tL_messages_editMessage.flags |= 16384;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = false;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
            Location lastKnownLocation = LocationController.getInstance(id0Var.currentAccount).getLastKnownLocation();
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
                id0Var.getMessagesStorage().replaceMessageIfExists(sharingLocationInfo.messageObject.messageOwner, null, null, true);
            }
            id0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
        }
    }

    public static /* synthetic */ void W(id0 id0Var) {
        sc0 sc0Var;
        id0Var.getLocationController().markLiveLoactionsAsRead(id0Var.e0);
        if (id0Var.isPaused || (sc0Var = id0Var.J0) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(sc0Var, 5000L);
    }

    public static IMapsProvider.LatLng p0(IMapsProvider.LatLng latLng, double d, double d10) {
        double degrees = Math.toDegrees(d10 / (Math.cos(Math.toRadians(latLng.latitude)) * 6366198.0d));
        return new IMapsProvider.LatLng(latLng.latitude + Math.toDegrees(d / 6366198.0d), latLng.longitude + degrees);
    }

    public final void A0(boolean z10) {
        int i10;
        int i11;
        FrameLayout.LayoutParams layoutParams;
        s4.c1 K = this.U.K(0);
        if (K != null) {
            i10 = (int) K.a.getY();
            i11 = Math.min(i10, 0) + this.H0;
        } else {
            i10 = -this.S.getMeasuredHeight();
            i11 = 0;
        }
        if (((FrameLayout.LayoutParams) this.S.getLayoutParams()) != null) {
            if (i11 <= 0) {
                if (this.K.getView().getVisibility() == 0) {
                    this.K.getView().setVisibility(4);
                    this.S.setVisibility(4);
                    fd0 fd0Var = this.x;
                    if (fd0Var != null) {
                        fd0Var.setVisibility(4);
                    }
                }
            } else if (this.K.getView().getVisibility() == 4) {
                this.K.getView().setVisibility(0);
                this.S.setVisibility(0);
                fd0 fd0Var2 = this.x;
                if (fd0Var2 != null) {
                    fd0Var2.setVisibility(0);
                }
            }
            this.S.setTranslationY(Math.min(0, i10));
            int i12 = -i10;
            int i13 = i12 / 2;
            this.K.getView().setTranslationY(Math.max(0, i13));
            fd0 fd0Var3 = this.x;
            if (fd0Var3 != null) {
                fd0Var3.setTranslationY(Math.max(0, i13));
            }
            int measuredHeight = this.H0 - this.d.getMeasuredHeight();
            int i14 = this.G0;
            float min = Math.min(measuredHeight - AndroidUtilities.dp(64 + ((i14 == 0 || i14 == 1) ? 30 : 10)), i12);
            this.d.setTranslationY(min);
            this.c.setTranslationY(min);
            di.f4 f4Var = this.y;
            if (f4Var != null) {
                f4Var.setTranslationY(min);
            }
            org.telegram.ui.Components.el elVar = this.e;
            if (elVar != null) {
                elVar.c = min;
                elVar.setTranslationY(min + elVar.b);
            }
            View view = this.X;
            if (view != null) {
                int dp = (i11 / 2) + (i12 - AndroidUtilities.dp(view.getTag() == null ? 48.0f : 69.0f));
                this.y0 = dp;
                view.setTranslationY(dp);
            }
            if (z10) {
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.K.getView().getLayoutParams();
            if (layoutParams2 != null) {
                if (layoutParams2.height != AndroidUtilities.dp(10.0f) + this.H0) {
                    layoutParams2.height = AndroidUtilities.dp(10.0f) + this.H0;
                    IMapsProvider.IMap iMap = this.I;
                    if (iMap != null) {
                        iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                    }
                    this.K.getView().setLayoutParams(layoutParams2);
                }
            }
            fd0 fd0Var4 = this.x;
            if (fd0Var4 == null || (layoutParams = (FrameLayout.LayoutParams) fd0Var4.getLayoutParams()) == null) {
                return;
            }
            if (layoutParams.height != AndroidUtilities.dp(10.0f) + this.H0) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.H0;
                this.x.setLayoutParams(layoutParams);
            }
        }
    }

    public final void B0() {
        if (!this.r0) {
            this.f.setVisibility(8);
        } else {
            if (!this.t0) {
                this.V.setEmptyView(this.f);
                return;
            }
            this.V.setEmptyView(null);
            this.f.setVisibility(8);
            this.V.setVisibility(8);
        }
    }

    public final void C0() {
        TLRPC.MessageMedia messageMedia;
        int i10;
        if (this.b == null) {
            return;
        }
        if (this.j0) {
            z0(false, true);
            j0();
            return;
        }
        int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
        ArrayList arrayList = this.g0;
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.Message message = ((cd0) arrayList.get(i12)).b;
            if (message != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > currentTime)) {
                i11++;
            }
        }
        boolean z10 = this.h0.f(getUserConfig().getClientUserId()) != null;
        if (this.w0 != null && !z10) {
            i11++;
        }
        z0(i11 >= 2, true);
    }

    public final cd0 c0(TLRPC.Message message) {
        Location location;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
        long fromChatId = MessageObject.getFromChatId(message);
        a0.i iVar = this.h0;
        cd0 cd0Var = (cd0) iVar.f(fromChatId);
        if (cd0Var == null) {
            cd0Var = new cd0();
            cd0Var.b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                cd0Var.c = getMessagesController().getUser(Long.valueOf(cd0Var.b.from_id.user_id));
                cd0Var.a = cd0Var.b.from_id.user_id;
            } else {
                long dialogId = MessageObject.getDialogId(message);
                if (DialogObject.isUserDialog(dialogId)) {
                    cd0Var.c = getMessagesController().getUser(Long.valueOf(dialogId));
                } else {
                    cd0Var.d = getMessagesController().getChat(Long.valueOf(-dialogId));
                }
                cd0Var.a = dialogId;
            }
            v0(cd0Var);
            try {
                IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                Bitmap g02 = g0(cd0Var);
                if (g02 != null) {
                    position.icon(g02);
                    position.anchor(0.5f, 0.907f);
                    cd0Var.e = this.I.addMarker(position);
                    if (!UserObject.isUserSelf(cd0Var.c)) {
                        IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                        flat.anchor(0.5f, 0.5f);
                        IMapsProvider.IMarker addMarker = this.I.addMarker(flat);
                        cd0Var.f = addMarker;
                        int i10 = message.media.heading;
                        if (i10 != 0) {
                            addMarker.setRotation(i10);
                            cd0Var.f.setIcon(R.drawable.map_pin_cone2);
                            cd0Var.g = true;
                        } else {
                            addMarker.setRotation(0);
                            cd0Var.f.setIcon(R.drawable.map_pin_circle);
                            cd0Var.g = false;
                        }
                    }
                    this.g0.add(cd0Var);
                    iVar.k(cd0Var, cd0Var.a);
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.e0);
                    if (cd0Var.a == getUserConfig().getClientUserId() && sharingLocationInfo != null && cd0Var.b.id == sharingLocationInfo.mid && (location = this.w0) != null) {
                        cd0Var.e.setPosition(new IMapsProvider.LatLng(location.getLatitude(), this.w0.getLongitude()));
                    }
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        } else {
            cd0Var.b = message;
            cd0Var.e.setPosition(latLng);
            if (this.i0 == cd0Var.a) {
                this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(cd0Var.e.getPosition()));
            }
        }
        org.telegram.ui.Components.ei0 ei0Var = this.R;
        if (ei0Var != null) {
            ei0Var.c(true);
        }
        C0();
        return cd0Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        boolean z10;
        int i10;
        int i11;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.s0 = false;
        this.r0 = false;
        this.t0 = false;
        wc0 wc0Var = this.T;
        if (wc0Var != null) {
            wc0Var.F();
        }
        bd0 bd0Var = this.W;
        if (bd0Var != null) {
            bd0Var.F();
        }
        if (this.z0 != null) {
            Location location = new Location("network");
            this.x0 = location;
            location.setLatitude(this.z0.geo_point.lat);
            this.x0.setLongitude(this.z0.geo_point._long);
        } else if (this.B0 != null) {
            Location location2 = new Location("network");
            this.x0 = location2;
            location2.setLatitude(this.B0.messageOwner.media.geo.lat);
            this.x0.setLongitude(this.B0.messageOwner.media.geo._long);
        }
        this.c0 = (Build.VERSION.SDK_INT < 23 || getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
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
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new vc0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        TLRPC.TL_channelLocation tL_channelLocation = this.z0;
        int i14 = this.G0;
        if (tL_channelLocation != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
        } else {
            MessageObject messageObject = this.B0;
            if (messageObject == null) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
                if (i14 != 4) {
                    this.x = new fd0(this, context);
                    org.telegram.ui.ActionBar.v0 c10 = n10.c(0, R.drawable.outline_header_search, getResourceProvider());
                    c10.F();
                    c10.H = new ig.d2(this, 12);
                    this.w = c10;
                    c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
                    this.w.setContentDescription(LocaleController.getString(R.string.Search));
                    EditTextBoldCursor searchField = this.w.getSearchField();
                    searchField.setTextColor(getThemedColor(i13));
                    searchField.setCursorColor(getThemedColor(i13));
                    searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Vd));
                }
            } else if (messageObject.isLiveLocation()) {
                this.actionBar.setTitle(LocaleController.getString(R.string.AttachLiveLocation));
                org.telegram.ui.ActionBar.v0 c11 = n10.c(0, R.drawable.ic_ab_other, getResourceProvider());
                this.Z = c11;
                c11.e(6, R.drawable.filled_directions, LocaleController.getString(R.string.GetDirections));
            } else {
                String str = this.B0.messageOwner.media.title;
                if (str == null || str.length() <= 0) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.SharedPlace));
                }
                if (i14 != 3) {
                    org.telegram.ui.ActionBar.v0 c12 = n10.c(0, R.drawable.ic_ab_other, getResourceProvider());
                    this.Z = c12;
                    c12.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
                    if (!getLocationController().isSharingLocation(this.e0) && this.O0) {
                        this.Z.e(5, R.drawable.msg_location, LocaleController.getString(R.string.SendLiveLocationMenu));
                    }
                    this.Z.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                }
            }
        }
        gd0 gd0Var = new gd0(this, context);
        this.fragmentView = gd0Var;
        gd0Var.setBackgroundColor(getThemedColor(i12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s = mutate;
        int themedColor = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        Rect rect = new Rect();
        this.s.getPadding(rect);
        FrameLayout.LayoutParams layoutParams = (i14 == 0 || i14 == 1) ? new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f) + rect.top) : new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(6.0f) + rect.top);
        layoutParams.gravity = 83;
        j0 j0Var = new j0(this, context, 11);
        this.S = j0Var;
        j0Var.setBackgroundDrawable(new org.telegram.ui.Components.fd(n0()));
        MessageObject messageObject2 = this.B0;
        if ((messageObject2 == null && (i14 == 0 || i14 == 1)) || (messageObject2 != null && i14 == 3)) {
            org.telegram.ui.Components.el elVar = new org.telegram.ui.Components.el(context, 1);
            this.e = elVar;
            elVar.setTranslationX(-AndroidUtilities.dp(80.0f));
            int dp = AndroidUtilities.dp(40.0f);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.wi);
            int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.j6.xi);
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3);
            w7.z5.a(this.e);
            this.e.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.e.setOutlineProvider(yf.j0.b);
            this.e.setBackgroundDrawable(i02);
            this.e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.vi));
            this.e.setTextSize(1, 14.0f);
            this.e.setTypeface(AndroidUtilities.bold());
            this.e.setGravity(17);
            this.e.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.S.addView(this.e, w7.x5.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
            if (i14 == 3) {
                this.e.setText(LocaleController.getString(R.string.OpenInMaps));
                final int i15 = 5;
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pc0
                    public final /* synthetic */ id0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        boolean z11;
                        int i16 = i15;
                        id0 id0Var = this.b;
                        int i17 = 1;
                        switch (i16) {
                            case 0:
                                id0Var.y0(false);
                                id0Var.T.H(null, id0Var.x0, true);
                                id0Var.D0 = true;
                                id0Var.x0();
                                break;
                            case 1:
                                id0Var.d.M(null, null);
                                break;
                            case 2:
                                id0.U(id0Var);
                                break;
                            case 3:
                                id0Var.i0 = -1L;
                                id0Var.C0 = true;
                                if (id0Var.j0()) {
                                    id0Var.j0 = true;
                                    id0Var.z0(false, true);
                                    break;
                                }
                                break;
                            case 4:
                                if (id0Var.getParentActivity() != null && id0Var.w0 != null && id0Var.d0() && id0Var.I != null) {
                                    di.f4 f4Var = id0Var.y;
                                    if (f4Var != null) {
                                        f4Var.e(true);
                                    }
                                    int i18 = 3;
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = id0Var.getLocationController().getSharingLocationInfo(id0Var.e0);
                                    if (id0Var.G) {
                                        id0Var.F[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        id0Var.c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = id0Var.O;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            id0Var.O = null;
                                        }
                                        id0Var.G = true;
                                        id0Var.m0().k(0L, 25, 0, null, new sc0(id0Var, i17), new r80(15, id0Var, sharingLocationInfo));
                                        break;
                                    } else {
                                        IMapsProvider.ICircle iCircle2 = id0Var.O;
                                        if (iCircle2 == null) {
                                            id0Var.e0(500);
                                        } else {
                                            id0Var.P = iCircle2.getRadius();
                                        }
                                        TLRPC.User user = DialogObject.isUserDialog(id0Var.e0) ? id0Var.getMessagesController().getUser(Long.valueOf(id0Var.e0)) : null;
                                        Activity parentActivity = id0Var.getParentActivity();
                                        qc0 qc0Var = new qc0(id0Var, i18);
                                        z10 z10Var = new z10(14, id0Var, user);
                                        sc0 sc0Var = new sc0(id0Var, 2);
                                        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(parentActivity);
                                        ei0Var.a = null;
                                        ei0Var.d = -1;
                                        ei0Var.e = false;
                                        ei0Var.f = false;
                                        ei0Var.h = null;
                                        ei0Var.n = new Rect();
                                        new Paint();
                                        ei0Var.w = true;
                                        ei0Var.F = org.telegram.ui.Components.pr.h;
                                        ei0Var.setWillNotDraw(false);
                                        ei0Var.Q = sc0Var;
                                        ei0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                        Rect rect2 = new Rect();
                                        Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false), PorterDuff.Mode.MULTIPLY));
                                        mutate2.getPadding(rect2);
                                        int i19 = rect2.left;
                                        ei0Var.x = i19;
                                        org.telegram.ui.Components.ai0 ai0Var = new org.telegram.ui.Components.ai0(ei0Var.getContext());
                                        ei0Var.v = ai0Var;
                                        ai0Var.setBackgroundDrawable(mutate2);
                                        ai0Var.setPadding(i19, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i19, 0);
                                        ai0Var.setVisibility(4);
                                        ei0Var.addView(ai0Var, 0, w7.x5.e(-1, -2, 80));
                                        ei0Var.O = LocaleController.getUseImperialSystemType();
                                        ei0Var.M = user;
                                        ei0Var.I = qc0Var;
                                        org.telegram.ui.Components.vc0 vc0Var = new org.telegram.ui.Components.vc0(parentActivity, null);
                                        ei0Var.G = vc0Var;
                                        vc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                        vc0Var.setItemCount(5);
                                        org.telegram.ui.Components.vc0 vc0Var2 = new org.telegram.ui.Components.vc0(parentActivity, null);
                                        ei0Var.H = vc0Var2;
                                        vc0Var2.setItemCount(5);
                                        vc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(ei0Var, parentActivity);
                                        ei0Var.P = bi0Var;
                                        bi0Var.setOrientation(1);
                                        FrameLayout frameLayout = new FrameLayout(parentActivity);
                                        bi0Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                                        TextView textView = new TextView(parentActivity);
                                        textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                        org.telegram.messenger.w1.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false), 1, 20.0f);
                                        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                        textView.setOnTouchListener(new ci.d(20));
                                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                                        linearLayout.setOrientation(0);
                                        linearLayout.setWeightSum(1.0f);
                                        bi0Var.addView(linearLayout, w7.x5.n(-1, -2));
                                        System.currentTimeMillis();
                                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                        TextView textView2 = new TextView(parentActivity);
                                        ei0Var.K = textView2;
                                        org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(parentActivity);
                                        ei0Var.J = ci0Var;
                                        linearLayout.addView(vc0Var, w7.x5.l(0.5f, 0, 270));
                                        vc0Var.setFormatter(new org.telegram.ui.Components.zh0(ei0Var, 0));
                                        vc0Var.setMinValue(0);
                                        vc0Var.setMaxValue(10);
                                        vc0Var.setWrapSelectorWheel(false);
                                        vc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                        org.telegram.ui.Components.zh0 zh0Var = new org.telegram.ui.Components.zh0(ei0Var, 1);
                                        vc0Var.setOnValueChangedListener(zh0Var);
                                        vc0Var2.setMinValue(0);
                                        vc0Var2.setMaxValue(10);
                                        vc0Var2.setWrapSelectorWheel(false);
                                        vc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                        linearLayout.addView(vc0Var2, w7.x5.l(0.5f, 0, 270));
                                        vc0Var2.setFormatter(new org.telegram.ui.Components.zh0(ei0Var, 2));
                                        vc0Var2.setOnValueChangedListener(zh0Var);
                                        vc0Var.setValue(0);
                                        vc0Var2.setValue(6);
                                        bi0Var.addView(frameLayout2, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                                        ci0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        ci0Var.setGravity(17);
                                        ci0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                                        ci0Var.setTextSize(1, 14.0f);
                                        ci0Var.setMaxLines(2);
                                        ci0Var.setTypeface(AndroidUtilities.bold());
                                        ci0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                                        frameLayout2.addView(ci0Var, w7.x5.c(48.0f, -1));
                                        ci0Var.setOnClickListener(new org.telegram.ui.Components.ct(11, ei0Var, z10Var));
                                        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        textView2.setGravity(17);
                                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q5, false));
                                        textView2.setTextSize(1, 14.0f);
                                        textView2.setAlpha(0.0f);
                                        textView2.setScaleX(0.5f);
                                        textView2.setScaleY(0.5f);
                                        frameLayout2.addView(textView2, w7.x5.c(48.0f, -1));
                                        ai0Var.addView(bi0Var, w7.x5.e(-1, -2, 51));
                                        id0Var.R = ei0Var;
                                        ((FrameLayout) id0Var.fragmentView).addView(ei0Var, w7.x5.c(-1.0f, -1));
                                        org.telegram.ui.Components.ei0 ei0Var2 = id0Var.R;
                                        ei0Var2.r = false;
                                        AnimatorSet animatorSet = ei0Var2.s;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                            ei0Var2.s = null;
                                        }
                                        org.telegram.ui.Components.ai0 ai0Var2 = ei0Var2.v;
                                        ai0Var2.measure(View.MeasureSpec.makeMeasureSpec((ei0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                        if (ei0Var2.r) {
                                            z11 = true;
                                        } else {
                                            ai0Var2.setVisibility(0);
                                            if (ei0Var2.w) {
                                                ei0Var2.setLayerType(2, null);
                                            }
                                            ai0Var2.setTranslationY(ai0Var2.getMeasuredHeight());
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            ei0Var2.s = animatorSet2;
                                            animatorSet2.playTogether(ObjectAnimator.ofFloat(ai0Var2, (Property<org.telegram.ui.Components.ai0, Float>) View.TRANSLATION_Y, 0.0f));
                                            ei0Var2.s.setDuration(400L);
                                            ei0Var2.s.setStartDelay(20L);
                                            ei0Var2.s.setInterpolator(ei0Var2.F);
                                            z11 = true;
                                            ei0Var2.s.addListener(new org.telegram.ui.Components.di0(ei0Var2, 1 == true ? 1 : 0));
                                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                            ei0Var2.s.start();
                                        }
                                        ei0Var2.c(z11);
                                        break;
                                    }
                                }
                                break;
                            default:
                                id0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = id0Var.B0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    id0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    break;
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                        }
                    }
                });
                this.e.setTranslationX(0.0f);
            } else {
                this.e.setText(LocaleController.getString(R.string.PlacesInThisArea));
                final int i16 = 0;
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pc0
                    public final /* synthetic */ id0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        boolean z11;
                        int i162 = i16;
                        id0 id0Var = this.b;
                        int i17 = 1;
                        switch (i162) {
                            case 0:
                                id0Var.y0(false);
                                id0Var.T.H(null, id0Var.x0, true);
                                id0Var.D0 = true;
                                id0Var.x0();
                                break;
                            case 1:
                                id0Var.d.M(null, null);
                                break;
                            case 2:
                                id0.U(id0Var);
                                break;
                            case 3:
                                id0Var.i0 = -1L;
                                id0Var.C0 = true;
                                if (id0Var.j0()) {
                                    id0Var.j0 = true;
                                    id0Var.z0(false, true);
                                    break;
                                }
                                break;
                            case 4:
                                if (id0Var.getParentActivity() != null && id0Var.w0 != null && id0Var.d0() && id0Var.I != null) {
                                    di.f4 f4Var = id0Var.y;
                                    if (f4Var != null) {
                                        f4Var.e(true);
                                    }
                                    int i18 = 3;
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = id0Var.getLocationController().getSharingLocationInfo(id0Var.e0);
                                    if (id0Var.G) {
                                        id0Var.F[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        id0Var.c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = id0Var.O;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            id0Var.O = null;
                                        }
                                        id0Var.G = true;
                                        id0Var.m0().k(0L, 25, 0, null, new sc0(id0Var, i17), new r80(15, id0Var, sharingLocationInfo));
                                        break;
                                    } else {
                                        IMapsProvider.ICircle iCircle2 = id0Var.O;
                                        if (iCircle2 == null) {
                                            id0Var.e0(500);
                                        } else {
                                            id0Var.P = iCircle2.getRadius();
                                        }
                                        TLRPC.User user = DialogObject.isUserDialog(id0Var.e0) ? id0Var.getMessagesController().getUser(Long.valueOf(id0Var.e0)) : null;
                                        Activity parentActivity = id0Var.getParentActivity();
                                        qc0 qc0Var = new qc0(id0Var, i18);
                                        z10 z10Var = new z10(14, id0Var, user);
                                        sc0 sc0Var = new sc0(id0Var, 2);
                                        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(parentActivity);
                                        ei0Var.a = null;
                                        ei0Var.d = -1;
                                        ei0Var.e = false;
                                        ei0Var.f = false;
                                        ei0Var.h = null;
                                        ei0Var.n = new Rect();
                                        new Paint();
                                        ei0Var.w = true;
                                        ei0Var.F = org.telegram.ui.Components.pr.h;
                                        ei0Var.setWillNotDraw(false);
                                        ei0Var.Q = sc0Var;
                                        ei0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                        Rect rect2 = new Rect();
                                        Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false), PorterDuff.Mode.MULTIPLY));
                                        mutate2.getPadding(rect2);
                                        int i19 = rect2.left;
                                        ei0Var.x = i19;
                                        org.telegram.ui.Components.ai0 ai0Var = new org.telegram.ui.Components.ai0(ei0Var.getContext());
                                        ei0Var.v = ai0Var;
                                        ai0Var.setBackgroundDrawable(mutate2);
                                        ai0Var.setPadding(i19, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i19, 0);
                                        ai0Var.setVisibility(4);
                                        ei0Var.addView(ai0Var, 0, w7.x5.e(-1, -2, 80));
                                        ei0Var.O = LocaleController.getUseImperialSystemType();
                                        ei0Var.M = user;
                                        ei0Var.I = qc0Var;
                                        org.telegram.ui.Components.vc0 vc0Var = new org.telegram.ui.Components.vc0(parentActivity, null);
                                        ei0Var.G = vc0Var;
                                        vc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                        vc0Var.setItemCount(5);
                                        org.telegram.ui.Components.vc0 vc0Var2 = new org.telegram.ui.Components.vc0(parentActivity, null);
                                        ei0Var.H = vc0Var2;
                                        vc0Var2.setItemCount(5);
                                        vc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(ei0Var, parentActivity);
                                        ei0Var.P = bi0Var;
                                        bi0Var.setOrientation(1);
                                        FrameLayout frameLayout = new FrameLayout(parentActivity);
                                        bi0Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                                        TextView textView = new TextView(parentActivity);
                                        textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                        org.telegram.messenger.w1.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false), 1, 20.0f);
                                        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                        textView.setOnTouchListener(new ci.d(20));
                                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                                        linearLayout.setOrientation(0);
                                        linearLayout.setWeightSum(1.0f);
                                        bi0Var.addView(linearLayout, w7.x5.n(-1, -2));
                                        System.currentTimeMillis();
                                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                        TextView textView2 = new TextView(parentActivity);
                                        ei0Var.K = textView2;
                                        org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(parentActivity);
                                        ei0Var.J = ci0Var;
                                        linearLayout.addView(vc0Var, w7.x5.l(0.5f, 0, 270));
                                        vc0Var.setFormatter(new org.telegram.ui.Components.zh0(ei0Var, 0));
                                        vc0Var.setMinValue(0);
                                        vc0Var.setMaxValue(10);
                                        vc0Var.setWrapSelectorWheel(false);
                                        vc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                        org.telegram.ui.Components.zh0 zh0Var = new org.telegram.ui.Components.zh0(ei0Var, 1);
                                        vc0Var.setOnValueChangedListener(zh0Var);
                                        vc0Var2.setMinValue(0);
                                        vc0Var2.setMaxValue(10);
                                        vc0Var2.setWrapSelectorWheel(false);
                                        vc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                        linearLayout.addView(vc0Var2, w7.x5.l(0.5f, 0, 270));
                                        vc0Var2.setFormatter(new org.telegram.ui.Components.zh0(ei0Var, 2));
                                        vc0Var2.setOnValueChangedListener(zh0Var);
                                        vc0Var.setValue(0);
                                        vc0Var2.setValue(6);
                                        bi0Var.addView(frameLayout2, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                                        ci0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        ci0Var.setGravity(17);
                                        ci0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                                        ci0Var.setTextSize(1, 14.0f);
                                        ci0Var.setMaxLines(2);
                                        ci0Var.setTypeface(AndroidUtilities.bold());
                                        ci0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                                        frameLayout2.addView(ci0Var, w7.x5.c(48.0f, -1));
                                        ci0Var.setOnClickListener(new org.telegram.ui.Components.ct(11, ei0Var, z10Var));
                                        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        textView2.setGravity(17);
                                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q5, false));
                                        textView2.setTextSize(1, 14.0f);
                                        textView2.setAlpha(0.0f);
                                        textView2.setScaleX(0.5f);
                                        textView2.setScaleY(0.5f);
                                        frameLayout2.addView(textView2, w7.x5.c(48.0f, -1));
                                        ai0Var.addView(bi0Var, w7.x5.e(-1, -2, 51));
                                        id0Var.R = ei0Var;
                                        ((FrameLayout) id0Var.fragmentView).addView(ei0Var, w7.x5.c(-1.0f, -1));
                                        org.telegram.ui.Components.ei0 ei0Var2 = id0Var.R;
                                        ei0Var2.r = false;
                                        AnimatorSet animatorSet = ei0Var2.s;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                            ei0Var2.s = null;
                                        }
                                        org.telegram.ui.Components.ai0 ai0Var2 = ei0Var2.v;
                                        ai0Var2.measure(View.MeasureSpec.makeMeasureSpec((ei0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                        if (ei0Var2.r) {
                                            z11 = true;
                                        } else {
                                            ai0Var2.setVisibility(0);
                                            if (ei0Var2.w) {
                                                ei0Var2.setLayerType(2, null);
                                            }
                                            ai0Var2.setTranslationY(ai0Var2.getMeasuredHeight());
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            ei0Var2.s = animatorSet2;
                                            animatorSet2.playTogether(ObjectAnimator.ofFloat(ai0Var2, (Property<org.telegram.ui.Components.ai0, Float>) View.TRANSLATION_Y, 0.0f));
                                            ei0Var2.s.setDuration(400L);
                                            ei0Var2.s.setStartDelay(20L);
                                            ei0Var2.s.setInterpolator(ei0Var2.F);
                                            z11 = true;
                                            ei0Var2.s.addListener(new org.telegram.ui.Components.di0(ei0Var2, 1 == true ? 1 : 0));
                                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                            ei0Var2.s.start();
                                        }
                                        ei0Var2.c(z11);
                                        break;
                                    }
                                }
                                break;
                            default:
                                id0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = id0Var.B0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    id0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    break;
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                        }
                    }
                });
            }
        }
        int i17 = org.telegram.ui.ActionBar.j6.ui;
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i17), false, getResourceProvider());
        this.d = v0Var;
        v0Var.setClickable(true);
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
        w7.z5.a(this.d);
        this.d.setTranslationZ(AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.d;
        bi.z1 z1Var = yf.j0.a;
        v0Var2.setOutlineProvider(z1Var);
        this.d.setBackgroundDrawable(h02);
        this.d.setIcon(R.drawable.msg_map_type);
        this.S.addView(this.d, w7.x5.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        final int i20 = 1;
        this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pc0
            public final /* synthetic */ id0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11;
                int i162 = i20;
                id0 id0Var = this.b;
                int i172 = 1;
                switch (i162) {
                    case 0:
                        id0Var.y0(false);
                        id0Var.T.H(null, id0Var.x0, true);
                        id0Var.D0 = true;
                        id0Var.x0();
                        break;
                    case 1:
                        id0Var.d.M(null, null);
                        break;
                    case 2:
                        id0.U(id0Var);
                        break;
                    case 3:
                        id0Var.i0 = -1L;
                        id0Var.C0 = true;
                        if (id0Var.j0()) {
                            id0Var.j0 = true;
                            id0Var.z0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (id0Var.getParentActivity() != null && id0Var.w0 != null && id0Var.d0() && id0Var.I != null) {
                            di.f4 f4Var = id0Var.y;
                            if (f4Var != null) {
                                f4Var.e(true);
                            }
                            int i182 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = id0Var.getLocationController().getSharingLocationInfo(id0Var.e0);
                            if (id0Var.G) {
                                id0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                id0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = id0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    id0Var.O = null;
                                }
                                id0Var.G = true;
                                id0Var.m0().k(0L, 25, 0, null, new sc0(id0Var, i172), new r80(15, id0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = id0Var.O;
                                if (iCircle2 == null) {
                                    id0Var.e0(500);
                                } else {
                                    id0Var.P = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(id0Var.e0) ? id0Var.getMessagesController().getUser(Long.valueOf(id0Var.e0)) : null;
                                Activity parentActivity = id0Var.getParentActivity();
                                qc0 qc0Var = new qc0(id0Var, i182);
                                z10 z10Var = new z10(14, id0Var, user);
                                sc0 sc0Var = new sc0(id0Var, 2);
                                org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(parentActivity);
                                ei0Var.a = null;
                                ei0Var.d = -1;
                                ei0Var.e = false;
                                ei0Var.f = false;
                                ei0Var.h = null;
                                ei0Var.n = new Rect();
                                new Paint();
                                ei0Var.w = true;
                                ei0Var.F = org.telegram.ui.Components.pr.h;
                                ei0Var.setWillNotDraw(false);
                                ei0Var.Q = sc0Var;
                                ei0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false), PorterDuff.Mode.MULTIPLY));
                                mutate2.getPadding(rect2);
                                int i192 = rect2.left;
                                ei0Var.x = i192;
                                org.telegram.ui.Components.ai0 ai0Var = new org.telegram.ui.Components.ai0(ei0Var.getContext());
                                ei0Var.v = ai0Var;
                                ai0Var.setBackgroundDrawable(mutate2);
                                ai0Var.setPadding(i192, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i192, 0);
                                ai0Var.setVisibility(4);
                                ei0Var.addView(ai0Var, 0, w7.x5.e(-1, -2, 80));
                                ei0Var.O = LocaleController.getUseImperialSystemType();
                                ei0Var.M = user;
                                ei0Var.I = qc0Var;
                                org.telegram.ui.Components.vc0 vc0Var = new org.telegram.ui.Components.vc0(parentActivity, null);
                                ei0Var.G = vc0Var;
                                vc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                vc0Var.setItemCount(5);
                                org.telegram.ui.Components.vc0 vc0Var2 = new org.telegram.ui.Components.vc0(parentActivity, null);
                                ei0Var.H = vc0Var2;
                                vc0Var2.setItemCount(5);
                                vc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(ei0Var, parentActivity);
                                ei0Var.P = bi0Var;
                                bi0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                bi0Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(parentActivity);
                                textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.w1.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false), 1, 20.0f);
                                frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new ci.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                bi0Var.addView(linearLayout, w7.x5.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView2 = new TextView(parentActivity);
                                ei0Var.K = textView2;
                                org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(parentActivity);
                                ei0Var.J = ci0Var;
                                linearLayout.addView(vc0Var, w7.x5.l(0.5f, 0, 270));
                                vc0Var.setFormatter(new org.telegram.ui.Components.zh0(ei0Var, 0));
                                vc0Var.setMinValue(0);
                                vc0Var.setMaxValue(10);
                                vc0Var.setWrapSelectorWheel(false);
                                vc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.zh0 zh0Var = new org.telegram.ui.Components.zh0(ei0Var, 1);
                                vc0Var.setOnValueChangedListener(zh0Var);
                                vc0Var2.setMinValue(0);
                                vc0Var2.setMaxValue(10);
                                vc0Var2.setWrapSelectorWheel(false);
                                vc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(vc0Var2, w7.x5.l(0.5f, 0, 270));
                                vc0Var2.setFormatter(new org.telegram.ui.Components.zh0(ei0Var, 2));
                                vc0Var2.setOnValueChangedListener(zh0Var);
                                vc0Var.setValue(0);
                                vc0Var2.setValue(6);
                                bi0Var.addView(frameLayout2, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                                ci0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                ci0Var.setGravity(17);
                                ci0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                                ci0Var.setTextSize(1, 14.0f);
                                ci0Var.setMaxLines(2);
                                ci0Var.setTypeface(AndroidUtilities.bold());
                                ci0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                                frameLayout2.addView(ci0Var, w7.x5.c(48.0f, -1));
                                ci0Var.setOnClickListener(new org.telegram.ui.Components.ct(11, ei0Var, z10Var));
                                textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView2.setGravity(17);
                                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q5, false));
                                textView2.setTextSize(1, 14.0f);
                                textView2.setAlpha(0.0f);
                                textView2.setScaleX(0.5f);
                                textView2.setScaleY(0.5f);
                                frameLayout2.addView(textView2, w7.x5.c(48.0f, -1));
                                ai0Var.addView(bi0Var, w7.x5.e(-1, -2, 51));
                                id0Var.R = ei0Var;
                                ((FrameLayout) id0Var.fragmentView).addView(ei0Var, w7.x5.c(-1.0f, -1));
                                org.telegram.ui.Components.ei0 ei0Var2 = id0Var.R;
                                ei0Var2.r = false;
                                AnimatorSet animatorSet = ei0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    ei0Var2.s = null;
                                }
                                org.telegram.ui.Components.ai0 ai0Var2 = ei0Var2.v;
                                ai0Var2.measure(View.MeasureSpec.makeMeasureSpec((ei0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (ei0Var2.r) {
                                    z11 = true;
                                } else {
                                    ai0Var2.setVisibility(0);
                                    if (ei0Var2.w) {
                                        ei0Var2.setLayerType(2, null);
                                    }
                                    ai0Var2.setTranslationY(ai0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    ei0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(ai0Var2, (Property<org.telegram.ui.Components.ai0, Float>) View.TRANSLATION_Y, 0.0f));
                                    ei0Var2.s.setDuration(400L);
                                    ei0Var2.s.setStartDelay(20L);
                                    ei0Var2.s.setInterpolator(ei0Var2.F);
                                    z11 = true;
                                    ei0Var2.s.addListener(new org.telegram.ui.Components.di0(ei0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    ei0Var2.s.start();
                                }
                                ei0Var2.c(z11);
                                break;
                            }
                        }
                        break;
                    default:
                        id0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = id0Var.B0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            id0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                }
            }
        });
        this.d.setDelegate(new qc0(this, 0));
        this.a = new ImageView(context);
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(40.0f), getThemedColor(i18), getThemedColor(i19));
        w7.z5.a(this.a);
        this.a.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.a.setOutlineProvider(z1Var);
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
        FrameLayout.LayoutParams d = w7.x5.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f);
        d.bottomMargin = (layoutParams.height - rect.top) + d.bottomMargin;
        this.S.addView(this.a, d);
        final int i22 = 2;
        this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pc0
            public final /* synthetic */ id0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11;
                int i162 = i22;
                id0 id0Var = this.b;
                int i172 = 1;
                switch (i162) {
                    case 0:
                        id0Var.y0(false);
                        id0Var.T.H(null, id0Var.x0, true);
                        id0Var.D0 = true;
                        id0Var.x0();
                        break;
                    case 1:
                        id0Var.d.M(null, null);
                        break;
                    case 2:
                        id0.U(id0Var);
                        break;
                    case 3:
                        id0Var.i0 = -1L;
                        id0Var.C0 = true;
                        if (id0Var.j0()) {
                            id0Var.j0 = true;
                            id0Var.z0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (id0Var.getParentActivity() != null && id0Var.w0 != null && id0Var.d0() && id0Var.I != null) {
                            di.f4 f4Var = id0Var.y;
                            if (f4Var != null) {
                                f4Var.e(true);
                            }
                            int i182 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = id0Var.getLocationController().getSharingLocationInfo(id0Var.e0);
                            if (id0Var.G) {
                                id0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                id0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = id0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    id0Var.O = null;
                                }
                                id0Var.G = true;
                                id0Var.m0().k(0L, 25, 0, null, new sc0(id0Var, i172), new r80(15, id0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = id0Var.O;
                                if (iCircle2 == null) {
                                    id0Var.e0(500);
                                } else {
                                    id0Var.P = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(id0Var.e0) ? id0Var.getMessagesController().getUser(Long.valueOf(id0Var.e0)) : null;
                                Activity parentActivity = id0Var.getParentActivity();
                                qc0 qc0Var = new qc0(id0Var, i182);
                                z10 z10Var = new z10(14, id0Var, user);
                                sc0 sc0Var = new sc0(id0Var, 2);
                                org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(parentActivity);
                                ei0Var.a = null;
                                ei0Var.d = -1;
                                ei0Var.e = false;
                                ei0Var.f = false;
                                ei0Var.h = null;
                                ei0Var.n = new Rect();
                                new Paint();
                                ei0Var.w = true;
                                ei0Var.F = org.telegram.ui.Components.pr.h;
                                ei0Var.setWillNotDraw(false);
                                ei0Var.Q = sc0Var;
                                ei0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false), PorterDuff.Mode.MULTIPLY));
                                mutate2.getPadding(rect2);
                                int i192 = rect2.left;
                                ei0Var.x = i192;
                                org.telegram.ui.Components.ai0 ai0Var = new org.telegram.ui.Components.ai0(ei0Var.getContext());
                                ei0Var.v = ai0Var;
                                ai0Var.setBackgroundDrawable(mutate2);
                                ai0Var.setPadding(i192, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i192, 0);
                                ai0Var.setVisibility(4);
                                ei0Var.addView(ai0Var, 0, w7.x5.e(-1, -2, 80));
                                ei0Var.O = LocaleController.getUseImperialSystemType();
                                ei0Var.M = user;
                                ei0Var.I = qc0Var;
                                org.telegram.ui.Components.vc0 vc0Var = new org.telegram.ui.Components.vc0(parentActivity, null);
                                ei0Var.G = vc0Var;
                                vc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                vc0Var.setItemCount(5);
                                org.telegram.ui.Components.vc0 vc0Var2 = new org.telegram.ui.Components.vc0(parentActivity, null);
                                ei0Var.H = vc0Var2;
                                vc0Var2.setItemCount(5);
                                vc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(ei0Var, parentActivity);
                                ei0Var.P = bi0Var;
                                bi0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                bi0Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(parentActivity);
                                textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.w1.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false), 1, 20.0f);
                                frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new ci.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                bi0Var.addView(linearLayout, w7.x5.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView2 = new TextView(parentActivity);
                                ei0Var.K = textView2;
                                org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(parentActivity);
                                ei0Var.J = ci0Var;
                                linearLayout.addView(vc0Var, w7.x5.l(0.5f, 0, 270));
                                vc0Var.setFormatter(new org.telegram.ui.Components.zh0(ei0Var, 0));
                                vc0Var.setMinValue(0);
                                vc0Var.setMaxValue(10);
                                vc0Var.setWrapSelectorWheel(false);
                                vc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.zh0 zh0Var = new org.telegram.ui.Components.zh0(ei0Var, 1);
                                vc0Var.setOnValueChangedListener(zh0Var);
                                vc0Var2.setMinValue(0);
                                vc0Var2.setMaxValue(10);
                                vc0Var2.setWrapSelectorWheel(false);
                                vc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(vc0Var2, w7.x5.l(0.5f, 0, 270));
                                vc0Var2.setFormatter(new org.telegram.ui.Components.zh0(ei0Var, 2));
                                vc0Var2.setOnValueChangedListener(zh0Var);
                                vc0Var.setValue(0);
                                vc0Var2.setValue(6);
                                bi0Var.addView(frameLayout2, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                                ci0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                ci0Var.setGravity(17);
                                ci0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                                ci0Var.setTextSize(1, 14.0f);
                                ci0Var.setMaxLines(2);
                                ci0Var.setTypeface(AndroidUtilities.bold());
                                ci0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                                frameLayout2.addView(ci0Var, w7.x5.c(48.0f, -1));
                                ci0Var.setOnClickListener(new org.telegram.ui.Components.ct(11, ei0Var, z10Var));
                                textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView2.setGravity(17);
                                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q5, false));
                                textView2.setTextSize(1, 14.0f);
                                textView2.setAlpha(0.0f);
                                textView2.setScaleX(0.5f);
                                textView2.setScaleY(0.5f);
                                frameLayout2.addView(textView2, w7.x5.c(48.0f, -1));
                                ai0Var.addView(bi0Var, w7.x5.e(-1, -2, 51));
                                id0Var.R = ei0Var;
                                ((FrameLayout) id0Var.fragmentView).addView(ei0Var, w7.x5.c(-1.0f, -1));
                                org.telegram.ui.Components.ei0 ei0Var2 = id0Var.R;
                                ei0Var2.r = false;
                                AnimatorSet animatorSet = ei0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    ei0Var2.s = null;
                                }
                                org.telegram.ui.Components.ai0 ai0Var2 = ei0Var2.v;
                                ai0Var2.measure(View.MeasureSpec.makeMeasureSpec((ei0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (ei0Var2.r) {
                                    z11 = true;
                                } else {
                                    ai0Var2.setVisibility(0);
                                    if (ei0Var2.w) {
                                        ei0Var2.setLayerType(2, null);
                                    }
                                    ai0Var2.setTranslationY(ai0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    ei0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(ai0Var2, (Property<org.telegram.ui.Components.ai0, Float>) View.TRANSLATION_Y, 0.0f));
                                    ei0Var2.s.setDuration(400L);
                                    ei0Var2.s.setStartDelay(20L);
                                    ei0Var2.s.setInterpolator(ei0Var2.F);
                                    z11 = true;
                                    ei0Var2.s.addListener(new org.telegram.ui.Components.di0(ei0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    ei0Var2.s.start();
                                }
                                ei0Var2.c(z11);
                                break;
                            }
                        }
                        break;
                    default:
                        id0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = id0Var.B0.messageOwner.media.geo;
                            double d10 = geoPoint.lat;
                            double d102 = geoPoint._long;
                            id0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d10 + "," + d102 + "?q=" + d10 + "," + d102)));
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
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
        FrameLayout.LayoutParams d10 = w7.x5.d(-2, 38.0f, 81, 12.0f, 0.0f, 12.0f, 12.0f);
        d10.bottomMargin = (layoutParams.height - rect.top) + d10.bottomMargin;
        this.S.addView(this.b, d10);
        w7.z5.a(this.b);
        final int i23 = 3;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pc0
            public final /* synthetic */ id0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11;
                int i162 = i23;
                id0 id0Var = this.b;
                int i172 = 1;
                switch (i162) {
                    case 0:
                        id0Var.y0(false);
                        id0Var.T.H(null, id0Var.x0, true);
                        id0Var.D0 = true;
                        id0Var.x0();
                        break;
                    case 1:
                        id0Var.d.M(null, null);
                        break;
                    case 2:
                        id0.U(id0Var);
                        break;
                    case 3:
                        id0Var.i0 = -1L;
                        id0Var.C0 = true;
                        if (id0Var.j0()) {
                            id0Var.j0 = true;
                            id0Var.z0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (id0Var.getParentActivity() != null && id0Var.w0 != null && id0Var.d0() && id0Var.I != null) {
                            di.f4 f4Var = id0Var.y;
                            if (f4Var != null) {
                                f4Var.e(true);
                            }
                            int i182 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = id0Var.getLocationController().getSharingLocationInfo(id0Var.e0);
                            if (id0Var.G) {
                                id0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                id0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = id0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    id0Var.O = null;
                                }
                                id0Var.G = true;
                                id0Var.m0().k(0L, 25, 0, null, new sc0(id0Var, i172), new r80(15, id0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = id0Var.O;
                                if (iCircle2 == null) {
                                    id0Var.e0(500);
                                } else {
                                    id0Var.P = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(id0Var.e0) ? id0Var.getMessagesController().getUser(Long.valueOf(id0Var.e0)) : null;
                                Activity parentActivity = id0Var.getParentActivity();
                                qc0 qc0Var = new qc0(id0Var, i182);
                                z10 z10Var = new z10(14, id0Var, user);
                                sc0 sc0Var = new sc0(id0Var, 2);
                                org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(parentActivity);
                                ei0Var.a = null;
                                ei0Var.d = -1;
                                ei0Var.e = false;
                                ei0Var.f = false;
                                ei0Var.h = null;
                                ei0Var.n = new Rect();
                                new Paint();
                                ei0Var.w = true;
                                ei0Var.F = org.telegram.ui.Components.pr.h;
                                ei0Var.setWillNotDraw(false);
                                ei0Var.Q = sc0Var;
                                ei0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false), PorterDuff.Mode.MULTIPLY));
                                mutate2.getPadding(rect2);
                                int i192 = rect2.left;
                                ei0Var.x = i192;
                                org.telegram.ui.Components.ai0 ai0Var = new org.telegram.ui.Components.ai0(ei0Var.getContext());
                                ei0Var.v = ai0Var;
                                ai0Var.setBackgroundDrawable(mutate2);
                                ai0Var.setPadding(i192, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i192, 0);
                                ai0Var.setVisibility(4);
                                ei0Var.addView(ai0Var, 0, w7.x5.e(-1, -2, 80));
                                ei0Var.O = LocaleController.getUseImperialSystemType();
                                ei0Var.M = user;
                                ei0Var.I = qc0Var;
                                org.telegram.ui.Components.vc0 vc0Var = new org.telegram.ui.Components.vc0(parentActivity, null);
                                ei0Var.G = vc0Var;
                                vc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                vc0Var.setItemCount(5);
                                org.telegram.ui.Components.vc0 vc0Var2 = new org.telegram.ui.Components.vc0(parentActivity, null);
                                ei0Var.H = vc0Var2;
                                vc0Var2.setItemCount(5);
                                vc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(ei0Var, parentActivity);
                                ei0Var.P = bi0Var;
                                bi0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                bi0Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView2 = new TextView(parentActivity);
                                textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.w1.q(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false), 1, 20.0f);
                                frameLayout.addView(textView2, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView2.setOnTouchListener(new ci.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                bi0Var.addView(linearLayout, w7.x5.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView22 = new TextView(parentActivity);
                                ei0Var.K = textView22;
                                org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(parentActivity);
                                ei0Var.J = ci0Var;
                                linearLayout.addView(vc0Var, w7.x5.l(0.5f, 0, 270));
                                vc0Var.setFormatter(new org.telegram.ui.Components.zh0(ei0Var, 0));
                                vc0Var.setMinValue(0);
                                vc0Var.setMaxValue(10);
                                vc0Var.setWrapSelectorWheel(false);
                                vc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.zh0 zh0Var = new org.telegram.ui.Components.zh0(ei0Var, 1);
                                vc0Var.setOnValueChangedListener(zh0Var);
                                vc0Var2.setMinValue(0);
                                vc0Var2.setMaxValue(10);
                                vc0Var2.setWrapSelectorWheel(false);
                                vc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(vc0Var2, w7.x5.l(0.5f, 0, 270));
                                vc0Var2.setFormatter(new org.telegram.ui.Components.zh0(ei0Var, 2));
                                vc0Var2.setOnValueChangedListener(zh0Var);
                                vc0Var.setValue(0);
                                vc0Var2.setValue(6);
                                bi0Var.addView(frameLayout2, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                                ci0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                ci0Var.setGravity(17);
                                ci0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                                ci0Var.setTextSize(1, 14.0f);
                                ci0Var.setMaxLines(2);
                                ci0Var.setTypeface(AndroidUtilities.bold());
                                ci0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                                frameLayout2.addView(ci0Var, w7.x5.c(48.0f, -1));
                                ci0Var.setOnClickListener(new org.telegram.ui.Components.ct(11, ei0Var, z10Var));
                                textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView22.setGravity(17);
                                textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q5, false));
                                textView22.setTextSize(1, 14.0f);
                                textView22.setAlpha(0.0f);
                                textView22.setScaleX(0.5f);
                                textView22.setScaleY(0.5f);
                                frameLayout2.addView(textView22, w7.x5.c(48.0f, -1));
                                ai0Var.addView(bi0Var, w7.x5.e(-1, -2, 51));
                                id0Var.R = ei0Var;
                                ((FrameLayout) id0Var.fragmentView).addView(ei0Var, w7.x5.c(-1.0f, -1));
                                org.telegram.ui.Components.ei0 ei0Var2 = id0Var.R;
                                ei0Var2.r = false;
                                AnimatorSet animatorSet = ei0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    ei0Var2.s = null;
                                }
                                org.telegram.ui.Components.ai0 ai0Var2 = ei0Var2.v;
                                ai0Var2.measure(View.MeasureSpec.makeMeasureSpec((ei0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (ei0Var2.r) {
                                    z11 = true;
                                } else {
                                    ai0Var2.setVisibility(0);
                                    if (ei0Var2.w) {
                                        ei0Var2.setLayerType(2, null);
                                    }
                                    ai0Var2.setTranslationY(ai0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    ei0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(ai0Var2, (Property<org.telegram.ui.Components.ai0, Float>) View.TRANSLATION_Y, 0.0f));
                                    ei0Var2.s.setDuration(400L);
                                    ei0Var2.s.setStartDelay(20L);
                                    ei0Var2.s.setInterpolator(ei0Var2.F);
                                    z11 = true;
                                    ei0Var2.s.addListener(new org.telegram.ui.Components.di0(ei0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    ei0Var2.s.start();
                                }
                                ei0Var2.c(z11);
                                break;
                            }
                        }
                        break;
                    default:
                        id0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = id0Var.B0.messageOwner.media.geo;
                            double d102 = geoPoint.lat;
                            double d1022 = geoPoint._long;
                            id0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d102 + "," + d1022 + "?q=" + d102 + "," + d1022)));
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                }
            }
        });
        z0(false, false);
        this.c = new ImageView(context);
        org.telegram.ui.Cells.z h04 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(40.0f), getThemedColor(i18), getThemedColor(i19));
        w7.z5.a(this.c);
        this.c.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.c.setOutlineProvider(z1Var);
        this.c.setColorFilter(new PorterDuffColorFilter(getThemedColor(i17), mode));
        this.c.setBackgroundDrawable(h04);
        this.c.setScaleType(scaleType);
        this.c.setContentDescription(LocaleController.getString(R.string.AccDescrLocationNotify));
        this.S.addView(this.c, w7.x5.d(40, 40.0f, 53, 0.0f, 62.0f, 12.0f, 0.0f));
        final int i24 = 4;
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.pc0
            public final /* synthetic */ id0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11;
                int i162 = i24;
                id0 id0Var = this.b;
                int i172 = 1;
                switch (i162) {
                    case 0:
                        id0Var.y0(false);
                        id0Var.T.H(null, id0Var.x0, true);
                        id0Var.D0 = true;
                        id0Var.x0();
                        break;
                    case 1:
                        id0Var.d.M(null, null);
                        break;
                    case 2:
                        id0.U(id0Var);
                        break;
                    case 3:
                        id0Var.i0 = -1L;
                        id0Var.C0 = true;
                        if (id0Var.j0()) {
                            id0Var.j0 = true;
                            id0Var.z0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (id0Var.getParentActivity() != null && id0Var.w0 != null && id0Var.d0() && id0Var.I != null) {
                            di.f4 f4Var = id0Var.y;
                            if (f4Var != null) {
                                f4Var.e(true);
                            }
                            int i182 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = id0Var.getLocationController().getSharingLocationInfo(id0Var.e0);
                            if (id0Var.G) {
                                id0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                id0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = id0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    id0Var.O = null;
                                }
                                id0Var.G = true;
                                id0Var.m0().k(0L, 25, 0, null, new sc0(id0Var, i172), new r80(15, id0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = id0Var.O;
                                if (iCircle2 == null) {
                                    id0Var.e0(500);
                                } else {
                                    id0Var.P = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(id0Var.e0) ? id0Var.getMessagesController().getUser(Long.valueOf(id0Var.e0)) : null;
                                Activity parentActivity = id0Var.getParentActivity();
                                qc0 qc0Var = new qc0(id0Var, i182);
                                z10 z10Var = new z10(14, id0Var, user);
                                sc0 sc0Var = new sc0(id0Var, 2);
                                org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(parentActivity);
                                ei0Var.a = null;
                                ei0Var.d = -1;
                                ei0Var.e = false;
                                ei0Var.f = false;
                                ei0Var.h = null;
                                ei0Var.n = new Rect();
                                new Paint();
                                ei0Var.w = true;
                                ei0Var.F = org.telegram.ui.Components.pr.h;
                                ei0Var.setWillNotDraw(false);
                                ei0Var.Q = sc0Var;
                                ei0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false), PorterDuff.Mode.MULTIPLY));
                                mutate2.getPadding(rect2);
                                int i192 = rect2.left;
                                ei0Var.x = i192;
                                org.telegram.ui.Components.ai0 ai0Var = new org.telegram.ui.Components.ai0(ei0Var.getContext());
                                ei0Var.v = ai0Var;
                                ai0Var.setBackgroundDrawable(mutate2);
                                ai0Var.setPadding(i192, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i192, 0);
                                ai0Var.setVisibility(4);
                                ei0Var.addView(ai0Var, 0, w7.x5.e(-1, -2, 80));
                                ei0Var.O = LocaleController.getUseImperialSystemType();
                                ei0Var.M = user;
                                ei0Var.I = qc0Var;
                                org.telegram.ui.Components.vc0 vc0Var = new org.telegram.ui.Components.vc0(parentActivity, null);
                                ei0Var.G = vc0Var;
                                vc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                vc0Var.setItemCount(5);
                                org.telegram.ui.Components.vc0 vc0Var2 = new org.telegram.ui.Components.vc0(parentActivity, null);
                                ei0Var.H = vc0Var2;
                                vc0Var2.setItemCount(5);
                                vc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(ei0Var, parentActivity);
                                ei0Var.P = bi0Var;
                                bi0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                bi0Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView2 = new TextView(parentActivity);
                                textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.w1.q(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false), 1, 20.0f);
                                frameLayout.addView(textView2, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView2.setOnTouchListener(new ci.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                bi0Var.addView(linearLayout, w7.x5.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView22 = new TextView(parentActivity);
                                ei0Var.K = textView22;
                                org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(parentActivity);
                                ei0Var.J = ci0Var;
                                linearLayout.addView(vc0Var, w7.x5.l(0.5f, 0, 270));
                                vc0Var.setFormatter(new org.telegram.ui.Components.zh0(ei0Var, 0));
                                vc0Var.setMinValue(0);
                                vc0Var.setMaxValue(10);
                                vc0Var.setWrapSelectorWheel(false);
                                vc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.zh0 zh0Var = new org.telegram.ui.Components.zh0(ei0Var, 1);
                                vc0Var.setOnValueChangedListener(zh0Var);
                                vc0Var2.setMinValue(0);
                                vc0Var2.setMaxValue(10);
                                vc0Var2.setWrapSelectorWheel(false);
                                vc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(vc0Var2, w7.x5.l(0.5f, 0, 270));
                                vc0Var2.setFormatter(new org.telegram.ui.Components.zh0(ei0Var, 2));
                                vc0Var2.setOnValueChangedListener(zh0Var);
                                vc0Var.setValue(0);
                                vc0Var2.setValue(6);
                                bi0Var.addView(frameLayout2, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                                ci0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                ci0Var.setGravity(17);
                                ci0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                                ci0Var.setTextSize(1, 14.0f);
                                ci0Var.setMaxLines(2);
                                ci0Var.setTypeface(AndroidUtilities.bold());
                                ci0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                                frameLayout2.addView(ci0Var, w7.x5.c(48.0f, -1));
                                ci0Var.setOnClickListener(new org.telegram.ui.Components.ct(11, ei0Var, z10Var));
                                textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView22.setGravity(17);
                                textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q5, false));
                                textView22.setTextSize(1, 14.0f);
                                textView22.setAlpha(0.0f);
                                textView22.setScaleX(0.5f);
                                textView22.setScaleY(0.5f);
                                frameLayout2.addView(textView22, w7.x5.c(48.0f, -1));
                                ai0Var.addView(bi0Var, w7.x5.e(-1, -2, 51));
                                id0Var.R = ei0Var;
                                ((FrameLayout) id0Var.fragmentView).addView(ei0Var, w7.x5.c(-1.0f, -1));
                                org.telegram.ui.Components.ei0 ei0Var2 = id0Var.R;
                                ei0Var2.r = false;
                                AnimatorSet animatorSet = ei0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    ei0Var2.s = null;
                                }
                                org.telegram.ui.Components.ai0 ai0Var2 = ei0Var2.v;
                                ai0Var2.measure(View.MeasureSpec.makeMeasureSpec((ei0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (ei0Var2.r) {
                                    z11 = true;
                                } else {
                                    ai0Var2.setVisibility(0);
                                    if (ei0Var2.w) {
                                        ei0Var2.setLayerType(2, null);
                                    }
                                    ai0Var2.setTranslationY(ai0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    ei0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(ai0Var2, (Property<org.telegram.ui.Components.ai0, Float>) View.TRANSLATION_Y, 0.0f));
                                    ei0Var2.s.setDuration(400L);
                                    ei0Var2.s.setStartDelay(20L);
                                    ei0Var2.s.setInterpolator(ei0Var2.F);
                                    z11 = true;
                                    ei0Var2.s.addListener(new org.telegram.ui.Components.di0(ei0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    ei0Var2.s.start();
                                }
                                ei0Var2.c(z11);
                                break;
                            }
                        }
                        break;
                    default:
                        id0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = id0Var.B0.messageOwner.media.geo;
                            double d102 = geoPoint.lat;
                            double d1022 = geoPoint._long;
                            id0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d102 + "," + d1022 + "?q=" + d102 + "," + d1022)));
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                }
            }
        });
        TLRPC.Chat chat = DialogObject.isChatDialog(this.e0) ? getMessagesController().getChat(Long.valueOf(-this.e0)) : null;
        MessageObject messageObject3 = this.B0;
        if (messageObject3 == null || !messageObject3.isLiveLocation() || this.B0.isExpiredLiveLocation(getConnectionsManager().getCurrentTime()) || (ChatObject.isChannel(chat) && !chat.megagroup)) {
            this.c.setVisibility(8);
            this.c.setImageResource(R.drawable.msg_location_alert);
        } else {
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.e0);
            if (sharingLocationInfo == null || sharingLocationInfo.proximityMeters <= 0) {
                if (DialogObject.isUserDialog(this.e0) && this.B0.getFromChatId() == getUserConfig().getClientUserId()) {
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
        di.f4 f4Var = new di.f4(context, 1);
        this.y = f4Var;
        f4Var.setLayerType(2, null);
        di.f4 f4Var2 = this.y;
        f4Var2.d = 4000L;
        f4Var2.l(1.0f, -25.0f);
        this.y.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.S.addView(this.y, w7.x5.d(-1, -2.0f, 51, 8.0f, 106.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.f.setGravity(1);
        this.f.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        this.f.setVisibility(8);
        gd0Var.addView(this.f, w7.x5.c(-1.0f, -1));
        this.f.setOnTouchListener(new ci.d(2));
        ImageView imageView3 = new ImageView(context);
        this.h = imageView3;
        imageView3.setImageResource(R.drawable.location_empty);
        this.h.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.W5), mode));
        this.f.addView(this.h, w7.x5.n(-2, -2));
        TextView textView2 = new TextView(context);
        this.n = textView2;
        int i25 = org.telegram.ui.ActionBar.j6.X5;
        textView2.setTextColor(getThemedColor(i25));
        this.n.setGravity(17);
        this.n.setTypeface(AndroidUtilities.bold());
        this.n.setTextSize(1, 17.0f);
        this.n.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView h = com.google.android.gms.internal.vision.e2.h(this.f, this.n, w7.x5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.r = h;
        h.setTextColor(getThemedColor(i25));
        this.r.setGravity(17);
        this.r.setTextSize(1, 15.0f);
        this.r.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.f.addView(this.r, w7.x5.t(-2, -2, 17, 0, 6, 0, 0));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.U = ll0Var;
        wc0 wc0Var2 = new wc0(this, context, this.G0, this.e0, getResourceProvider(), this.E, i14 == 8);
        this.T = wc0Var2;
        ll0Var.setAdapter(wc0Var2);
        org.telegram.ui.Components.ll0 ll0Var2 = this.U;
        s4.c0 c0Var = new s4.c0(1, false);
        this.Y = c0Var;
        ll0Var2.setLayoutManager(c0Var);
        if (this.M0 != null) {
            this.L0 = new org.telegram.ui.Cells.u3(context, this.resourceProvider);
            yc0 yc0Var = new yc0(this, context, new org.telegram.ui.Components.pu0(this), this, new xc0(this), getResourceProvider());
            this.K0 = yc0Var;
            yc0Var.setBackgroundColor(getThemedColor(i12));
            this.K0.addView(this.L0, w7.x5.e(-1, 32, 55));
            this.T.h0 = this.K0;
            this.U.setOverScrollMode(2);
            s4.j jVar = new s4.j();
            z10 = false;
            jVar.m = false;
            jVar.C = false;
            jVar.o(org.telegram.ui.Components.pr.h);
            jVar.n(350L);
            this.U.setItemAnimator(jVar);
        } else {
            z10 = false;
        }
        this.T.O(this.c0, z10);
        this.T.getClass();
        this.U.setVerticalScrollBarEnabled(z10);
        gd0Var.addView(this.U, w7.x5.e(-1, -1, 51));
        MessageObject messageObject4 = this.B0;
        if (messageObject4 != null && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
            wc0 wc0Var3 = this.T;
            wc0Var3.Q = this.B0.messageOwner.media.address;
            wc0Var3.Q();
        }
        this.U.setOnScrollListener(new zc0(this));
        ((s4.j) this.U.getItemAnimator()).C = false;
        this.U.setOnItemLongClickListener(new z10(12, this, context));
        this.U.setOnItemClickListener(new i(this, 16));
        wc0 wc0Var4 = this.T;
        long j3 = this.e0;
        qc0 qc0Var = new qc0(this, 5);
        wc0Var4.H = j3;
        wc0Var4.y = qc0Var;
        wc0Var4.P(this.H0);
        gd0Var.addView(this.S, w7.x5.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.K = onCreateMapView;
        onCreateMapView.getView().setAlpha(0.0f);
        this.K.setOnDispatchTouchEventInterceptor(new qc0(this, 6));
        this.K.setOnInterceptTouchEventInterceptor(new qc0(this, 7));
        this.K.setOnLayoutListener(new sc0(this, 5));
        new Thread(new tc0(this, this.K, 1)).start();
        MessageObject messageObject5 = this.B0;
        if (messageObject5 == null && this.z0 == null) {
            i10 = i14;
            if (chat != null && i10 == 4 && this.e0 != 0) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackgroundResource(R.drawable.livepin);
                this.S.addView(frameLayout, w7.x5.e(62, 76, 49));
                org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
                x9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
                x9Var.e(chat, new org.telegram.ui.Components.i9(chat));
                frameLayout.addView(x9Var, w7.x5.d(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                this.X = frameLayout;
                frameLayout.setTag(1);
            }
            if (this.X == null) {
                ImageView imageView4 = new ImageView(context);
                imageView4.setImageResource(R.drawable.map_pin2);
                this.S.addView(imageView4, w7.x5.e(28, 48, 49));
                this.X = imageView4;
            }
            org.telegram.ui.Components.ll0 ll0Var3 = new org.telegram.ui.Components.ll0(context, null);
            this.V = ll0Var3;
            ll0Var3.setVisibility(8);
            i11 = 0;
            this.V.setLayoutManager(new s4.c0(1, false));
            bd0 bd0Var2 = new bd0(this, context, getResourceProvider(), i10 == 8);
            this.W = bd0Var2;
            qc0 qc0Var2 = new qc0(this, 8);
            bd0Var2.H = 0L;
            bd0Var2.y = qc0Var2;
            gd0Var.addView(this.V, w7.x5.e(-1, -1, 51));
            int i26 = 18;
            this.V.setOnScrollListener(new i3(this, i26));
            this.V.setOnItemClickListener(new bi.x5(i26, this, n10));
        } else {
            i10 = i14;
            i11 = 0;
            if ((messageObject5 != null && !messageObject5.isLiveLocation()) || this.z0 != null) {
                TLRPC.TL_channelLocation tL_channelLocation2 = this.z0;
                if (tL_channelLocation2 != null) {
                    this.T.X = tL_channelLocation2;
                } else {
                    MessageObject messageObject6 = this.B0;
                    if (messageObject6 != null) {
                        wc0 wc0Var5 = this.T;
                        wc0Var5.W = messageObject6;
                        wc0Var5.l();
                    }
                }
            }
        }
        MessageObject messageObject7 = this.B0;
        if (messageObject7 != null && i10 == 6) {
            wc0 wc0Var6 = this.T;
            wc0Var6.W = messageObject7;
            wc0Var6.l();
        }
        while (i11 < 2) {
            UndoView undoView = new UndoView(context);
            UndoView[] undoViewArr = this.F;
            undoViewArr[i11] = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            undoViewArr[i11].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.S.addView(undoViewArr[i11], w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            i11++;
        }
        bi.a4 a4Var = new bi.a4(this, context, rect);
        this.v = a4Var;
        a4Var.setTranslationZ(AndroidUtilities.dp(6.0f));
        this.S.addView(this.v, layoutParams);
        if (this.B0 == null && this.z0 == null && this.A0 != null) {
            this.C0 = true;
            ImageView imageView5 = this.a;
            int i27 = org.telegram.ui.ActionBar.j6.ui;
            imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(i27), PorterDuff.Mode.MULTIPLY));
            this.a.setTag(Integer.valueOf(i27));
        }
        gd0Var.addView(this.actionBar);
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
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new qc0(this, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(alertDialog$Builder.a);
                    return false;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        wc0 wc0Var;
        wc0 wc0Var2;
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
            return;
        }
        if (i10 == NotificationCenter.locationPermissionGranted) {
            this.c0 = false;
            wc0 wc0Var3 = this.T;
            if (wc0Var3 != null) {
                wc0Var3.O(false, false);
            }
            IMapsProvider.IMap iMap = this.I;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.locationPermissionDenied) {
            this.c0 = true;
            wc0 wc0Var4 = this.T;
            if (wc0Var4 != null) {
                wc0Var4.O(true, false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.liveLocationsChanged) {
            wc0 wc0Var5 = this.T;
            if (wc0Var5 != null) {
                wc0Var5.l();
            }
            C0();
            return;
        }
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue() || ((Long) objArr[0]).longValue() != this.e0 || this.B0 == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[1];
            boolean z10 = false;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i12);
                if (messageObject.isLiveLocation()) {
                    c0(messageObject.messageOwner);
                    z10 = true;
                } else if ((messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) && DialogObject.isUserDialog(messageObject.getDialogId())) {
                    this.c.setImageResource(R.drawable.msg_location_alert);
                    IMapsProvider.ICircle iCircle = this.O;
                    if (iCircle != null) {
                        iCircle.remove();
                        this.O = null;
                    }
                }
            }
            if (!z10 || (wc0Var2 = this.T) == null) {
                return;
            }
            wc0Var2.N(this.g0);
            return;
        }
        if (i10 == NotificationCenter.replaceMessagesObjects) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue != this.e0 || this.B0 == null) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[1];
            boolean z11 = false;
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i13);
                if (messageObject2.isLiveLocation()) {
                    TLRPC.Message message = messageObject2.messageOwner;
                    cd0 cd0Var = (cd0) this.h0.f(message.from_id != null ? MessageObject.getFromChatId(message) : MessageObject.getDialogId(message));
                    if (cd0Var != null) {
                        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(longValue);
                        if (sharingLocationInfo == null || sharingLocationInfo.mid != messageObject2.getId()) {
                            TLRPC.Message message2 = messageObject2.messageOwner;
                            cd0Var.b = message2;
                            TLRPC.GeoPoint geoPoint = message2.media.geo;
                            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                            cd0Var.e.setPosition(latLng);
                            if (this.i0 == cd0Var.a) {
                                this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(cd0Var.e.getPosition()));
                            }
                            IMapsProvider.IMarker iMarker = cd0Var.f;
                            if (iMarker != null) {
                                iMarker.getPosition();
                                cd0Var.f.setPosition(latLng);
                                int i14 = messageObject2.messageOwner.media.heading;
                                if (i14 != 0) {
                                    cd0Var.f.setRotation(i14);
                                    if (!cd0Var.g) {
                                        cd0Var.f.setIcon(R.drawable.map_pin_cone2);
                                        cd0Var.g = true;
                                    }
                                } else if (cd0Var.g) {
                                    cd0Var.f.setRotation(0);
                                    cd0Var.f.setIcon(R.drawable.map_pin_circle);
                                    cd0Var.g = false;
                                }
                            }
                        }
                        z11 = true;
                    }
                }
            }
            if (z11 && (wc0Var = this.T) != null) {
                wc0Var.l();
                org.telegram.ui.Components.ei0 ei0Var = this.R;
                if (ei0Var != null) {
                    ei0Var.c(true);
                }
            }
            if (z11) {
                C0();
            }
        }
    }

    public final void e0(int i10) {
        if (this.I == null) {
            return;
        }
        List<IMapsProvider.PatternItem> asList = Arrays.asList(new IMapsProvider.PatternItem.Gap(20), new IMapsProvider.PatternItem.Dash(20));
        IMapsProvider.ICircleOptions onCreateCircleOptions = ApplicationLoader.getMapsProvider().onCreateCircleOptions();
        onCreateCircleOptions.center(new IMapsProvider.LatLng(this.w0.getLatitude(), this.w0.getLongitude()));
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
        this.O = this.I.addCircle(onCreateCircleOptions);
    }

    public final Bitmap f0(int i10) {
        Bitmap[] bitmapArr = this.Q0;
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

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean finishFragment(boolean z10) {
        if (q0()) {
            return false;
        }
        return super.finishFragment(z10);
    }

    public final Bitmap g0(cd0 cd0Var) {
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
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
                TLRPC.User user = cd0Var.c;
                if (user != null) {
                    i9Var.m(this.currentAccount, user);
                } else {
                    TLRPC.Chat chat = cd0Var.d;
                    if (chat != null) {
                        i9Var.k(this.currentAccount, chat);
                    }
                }
                canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                i9Var.setBounds(0, 0, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
                i9Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = cd0Var.h;
                Bitmap bitmap2 = (imageReceiver == null || !imageReceiver.hasImageLoaded()) ? null : cd0Var.h.getBitmap();
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

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 21);
        int i10 = 0;
        while (true) {
            UndoView[] undoViewArr = this.F;
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, eVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 32768, null, null, null, null, i14));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.j6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 64, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_27, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.Vd));
        org.telegram.ui.ActionBar.v0 v0Var = this.w;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var != null ? v0Var.getSearchField() : null, 16777216, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_31, null, null, null, eVar, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_30, null, null, null, eVar, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, eVar, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, eVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, null, null, null, eVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 4, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.r0, eVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.si));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.pi));
        int i22 = org.telegram.ui.ActionBar.j6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 131072, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 196608, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 48, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 32, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        int i23 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 32, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 8, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView2"}, null, null, -1, null, i17));
        return arrayList;
    }

    public boolean h0() {
        return this instanceof ln;
    }

    public final void i0(ArrayList arrayList) {
        IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = this.f0 ? ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder() : null;
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
                    this.H = true;
                    this.c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new org.telegram.ui.Components.k61(this, 27)).start();
                }
            }
        }
        if (onCreateLatLngBoundsBuilder != null) {
            if (this.f0) {
                this.U.v0(0, AndroidUtilities.dp(99.0f), null);
            }
            this.f0 = false;
            this.T.N(this.g0);
            if (this.B0.isLiveLocation()) {
                try {
                    IMapsProvider.LatLng center = onCreateLatLngBoundsBuilder.build().getCenter();
                    IMapsProvider.LatLng p02 = p0(center, 100.0d, 100.0d);
                    onCreateLatLngBoundsBuilder.include(p0(center, -100.0d, -100.0d));
                    onCreateLatLngBoundsBuilder.include(p02);
                    IMapsProvider.ILatLngBounds build = onCreateLatLngBoundsBuilder.build();
                    if (arrayList.size() > 1) {
                        try {
                            IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build, AndroidUtilities.dp(113.0f));
                            this.J = newCameraUpdateLatLngBounds;
                            this.I.moveCamera(newCameraUpdateLatLngBounds);
                            this.J = null;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return i0.a.f(getThemedColor(org.telegram.ui.ActionBar.j6.d6)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final boolean j0() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i10;
        if (this.I != null) {
            ArrayList arrayList = new ArrayList();
            int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
            ArrayList arrayList2 = this.g0;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                cd0 cd0Var = (cd0) arrayList2.get(i11);
                IMapsProvider.IMarker iMarker = cd0Var.e;
                if (iMarker != null && (message = cd0Var.b) != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > currentTime)) {
                    arrayList.add(iMarker.getPosition());
                }
            }
            boolean z10 = this.h0.f(getUserConfig().getClientUserId()) != null;
            Location location = this.w0;
            if (location != null && !z10) {
                arrayList.add(new IMapsProvider.LatLng(location.getLatitude(), this.w0.getLongitude()));
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
                    this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(onCreateLatLngBoundsBuilder.build(), AndroidUtilities.dp(60.0f)), 500, null);
                    return true;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return false;
                }
            }
        }
        return false;
    }

    public final void k0(boolean z10) {
        FrameLayout.LayoutParams layoutParams;
        if (this.U != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight == 0) {
                return;
            }
            int i10 = this.G0;
            if (i10 == 6) {
                this.H0 = org.telegram.messenger.w1.B(66.0f, measuredHeight, currentActionBarHeight);
            } else if (i10 == 2) {
                this.H0 = org.telegram.messenger.w1.B(73.0f, measuredHeight, currentActionBarHeight);
            } else {
                this.H0 = org.telegram.messenger.w1.B(66.0f, measuredHeight, currentActionBarHeight);
            }
            yc0 yc0Var = this.K0;
            if (yc0Var != null && yc0Var.c0(8) > 0) {
                this.H0 -= AndroidUtilities.dp(200.0f);
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.U.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            this.U.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.S.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.H0;
            this.S.setLayoutParams(layoutParams3);
            org.telegram.ui.Components.ll0 ll0Var = this.V;
            if (ll0Var != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ll0Var.getLayoutParams();
                layoutParams4.topMargin = currentActionBarHeight;
                this.V.setLayoutParams(layoutParams4);
            }
            this.T.P(this.H0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.K.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.H0;
                IMapsProvider.IMap iMap = this.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                this.K.getView().setLayoutParams(layoutParams5);
            }
            fd0 fd0Var = this.x;
            if (fd0Var != null && (layoutParams = (FrameLayout.LayoutParams) fd0Var.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.H0;
                this.x.setLayoutParams(layoutParams);
            }
            this.T.l();
            if (!z10) {
                A0(false);
                return;
            }
            int i11 = i10 == 3 ? 73 : (i10 == 1 || i10 == 2) ? 66 : 0;
            this.Y.h1(0, -AndroidUtilities.dp(i11));
            A0(false);
            this.U.post(new org.telegram.ui.Components.m8(this, i11, 18));
        }
    }

    public final boolean l0() {
        ArrayList arrayList = (ArrayList) getLocationController().locationsCache.f(this.B0.getDialogId());
        if (arrayList == null || !arrayList.isEmpty()) {
            arrayList = null;
        } else {
            i0(arrayList);
        }
        if (DialogObject.isChatDialog(this.e0)) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.e0));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long dialogId = this.B0.getDialogId();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(dialogId);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new bi.j7(this, dialogId, 6));
        return arrayList != null;
    }

    public final UndoView m0() {
        UndoView[] undoViewArr = this.F;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.e(2, true);
            this.S.removeView(undoViewArr[0]);
            this.S.addView(undoViewArr[0]);
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
        if (imageView == null || imageView.getVisibility() != 0 || this.H || (i10 = (globalMainSettings = MessagesController.getGlobalMainSettings()).getInt("proximityhint", 0)) >= 3) {
            return;
        }
        globalMainSettings.edit().putInt("proximityhint", i10 + 1).commit();
        if (DialogObject.isUserDialog(this.e0)) {
            this.y.s(LocaleController.formatString("ProximityTooltioUser", R.string.ProximityTooltioUser, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.e0)))));
        } else {
            this.y.s(LocaleController.getString(R.string.ProximityTooltioGroup));
        }
        this.y.u();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ei0 ei0Var = this.R;
        if (ei0Var == null) {
            IMapsProvider.IMapView iMapView = this.K;
            if (iMapView == null || iMapView.getGlSurfaceView() == null || this.M) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                q0();
            }
        } else if (z10) {
            ei0Var.a();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.F[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        MessageObject messageObject = this.B0;
        if (messageObject == null || !messageObject.isLiveLocation()) {
            return true;
        }
        getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(this, NotificationCenter.replaceMessagesObjects);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.replaceMessagesObjects);
        try {
            IMapsProvider.IMap iMap = this.I;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        try {
            IMapsProvider.IMapView iMapView = this.K;
            if (iMapView != null) {
                iMapView.onDestroy();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        UndoView undoView = this.F[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        wc0 wc0Var = this.T;
        if (wc0Var != null) {
            wc0Var.F();
        }
        bd0 bd0Var = this.W;
        if (bd0Var != null) {
            bd0Var.F();
        }
        sc0 sc0Var = this.J0;
        if (sc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(sc0Var);
            this.J0 = null;
        }
        ArrayList arrayList = this.g0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            cd0 cd0Var = (cd0) arrayList.get(i10);
            ImageReceiver imageReceiver = cd0Var.h;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                cd0Var.h = null;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onLowMemory() {
        super.onLowMemory();
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView == null || !this.u0) {
            return;
        }
        iMapView.onLowMemory();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && this.u0) {
            try {
                iMapView.onPause();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        UndoView undoView = this.F[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.v0 = false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 30) {
            s0(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && this.u0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.v0 = true;
        IMapsProvider.IMap iMap = this.I;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        k0(true);
        if (h0()) {
            this.p0 = false;
        } else if (this.p0 && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.p0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        sc0 sc0Var = this.J0;
        if (sc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(sc0Var);
            AndroidUtilities.runOnUIThread(this.J0, 5000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || z11) {
            return;
        }
        try {
            if (this.K.getView().getParent() instanceof ViewGroup) {
                ((ViewGroup) this.K.getView().getParent()).removeView(this.K.getView());
            }
        } catch (Exception unused) {
        }
        j0 j0Var = this.S;
        if (j0Var == null) {
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView(this.K.getView(), 0, w7.x5.e(-1, -1, 51));
                return;
            }
            return;
        }
        j0Var.addView(this.K.getView(), 0, w7.x5.e(-1, AndroidUtilities.dp(10.0f) + this.H0, 51));
        fd0 fd0Var = this.x;
        if (fd0Var != null) {
            try {
                if (fd0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.x.getParent()).removeView(this.x);
                }
            } catch (Exception unused2) {
            }
            this.S.addView(this.x, 1, w7.x5.e(-1, AndroidUtilities.dp(10.0f) + this.H0, 51));
        }
        A0(false);
        o0();
    }

    public final boolean q0() {
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView == null || iMapView.getGlSurfaceView() == null || this.M) {
            return false;
        }
        GLSurfaceView glSurfaceView = this.K.getGlSurfaceView();
        glSurfaceView.queueEvent(new r80(14, this, glSurfaceView));
        return true;
    }

    public final void r0(cd0 cd0Var) {
        double d;
        double d10;
        TLRPC.Message message;
        if (cd0Var == null || (message = cd0Var.b) == null) {
            MessageObject messageObject = this.B0;
            if (messageObject != null) {
                TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                d = geoPoint.lat;
                d10 = geoPoint._long;
            } else {
                TLRPC.GeoPoint geoPoint2 = this.z0.geo_point;
                d = geoPoint2.lat;
                d10 = geoPoint2._long;
            }
        } else {
            TLRPC.GeoPoint geoPoint3 = message.media.geo;
            d = geoPoint3.lat;
            d10 = geoPoint3._long;
        }
        String str = BuildVars.isHuaweiStoreApp() ? "mapapp://navigation" : "http://maps.google.com/maps";
        if (this.w0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.w0.getLatitude()), Double.valueOf(this.w0.getLongitude()), Double.valueOf(d), Double.valueOf(d10)))));
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d10)))));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void s0(final boolean z10) {
        Activity parentActivity;
        if (this.F0 == null || h0() || getParentActivity() == null || this.w0 == null || !d0()) {
            return;
        }
        if (this.q0 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
            this.q0 = false;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                org.telegram.ui.Components.e5.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new oc0(this, z10, 1), null).o();
                return;
            }
        }
        final TLRPC.User user = DialogObject.isUserDialog(this.e0) ? getMessagesController().getUser(Long.valueOf(this.e0)) : null;
        showDialog(org.telegram.ui.Components.e5.E(getParentActivity(), z10, user, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.rc0
            @Override // org.telegram.messenger.MessagesStorage.IntCallback
            public final void run(int i10) {
                id0.V(id0.this, z10, user, i10);
            }
        }, null));
    }

    public final void t0(Location location) {
        int i10;
        if (location == null) {
            return;
        }
        this.w0 = new Location(location);
        cd0 cd0Var = (cd0) this.h0.f(getUserConfig().getClientUserId());
        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.e0);
        if (cd0Var != null && sharingLocationInfo != null && cd0Var.b.id == sharingLocationInfo.mid) {
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            cd0Var.e.setPosition(latLng);
            IMapsProvider.IMarker iMarker = cd0Var.f;
            if (iMarker != null) {
                iMarker.setPosition(latLng);
            }
            if (this.i0 == cd0Var.a) {
                this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(cd0Var.e.getPosition()));
            }
        }
        if (this.B0 == null && this.z0 == null && this.I != null) {
            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            wc0 wc0Var = this.T;
            if (wc0Var != null) {
                if (!this.D0 && (i10 = this.G0) != 4 && i10 != 8) {
                    wc0Var.H(null, this.w0, true);
                }
                this.T.M(this.w0);
            }
            if (!this.C0) {
                this.x0 = new Location(location);
                if (this.E0) {
                    this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng2));
                } else {
                    this.E0 = true;
                    this.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, this.I.getMaxZoomLevel() - 4.0f));
                }
            }
        } else {
            this.T.M(this.w0);
        }
        org.telegram.ui.Components.ei0 ei0Var = this.R;
        if (ei0Var != null) {
            ei0Var.c(true);
        }
        IMapsProvider.ICircle iCircle = this.O;
        if (iCircle != null) {
            iCircle.setCenter(new IMapsProvider.LatLng(this.w0.getLatitude(), this.w0.getLongitude()));
        }
        C0();
    }

    public final void u0(MessageObject messageObject) {
        this.B0 = messageObject;
        this.e0 = messageObject.getDialogId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0(cd0 cd0Var) {
        if (cd0Var.h != null) {
            return;
        }
        TLRPC.User user = cd0Var.c;
        TLRPC.Chat chat = cd0Var.d;
        if (user == null && chat == 0) {
            return;
        }
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        if (user != null) {
            i9Var.m(this.currentAccount, user);
        } else {
            i9Var.k(this.currentAccount, chat);
        }
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setCurrentAccount(this.currentAccount);
        imageReceiver.setDelegate(new z10(13, this, cd0Var));
        imageReceiver.onAttachedToWindow();
        if (user == null) {
            user = chat;
        }
        imageReceiver.setForUserOrChat(user, i9Var);
        cd0Var.h = imageReceiver;
    }

    public final void w0(int i10, TLRPC.User user, int i11) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.w0.getLatitude());
        tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(this.w0.getLongitude());
        tL_messageMediaGeoLive.heading = LocationController.getHeading(this.w0);
        int i12 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i10;
        tL_messageMediaGeoLive.proximity_notification_radius = i11;
        tL_messageMediaGeoLive.flags = i12 | 9;
        this.F0.b(tL_messageMediaGeoLive, this.G0, true, 0, 0L);
        if (i11 <= 0) {
            finishFragment();
            return;
        }
        this.R.L = true;
        this.c.setImageResource(R.drawable.msg_location_alert2);
        org.telegram.ui.Components.ei0 ei0Var = this.R;
        if (ei0Var != null) {
            ei0Var.a();
        }
        m0().k(0L, 24, Integer.valueOf(i11), user, null, null);
    }

    public final void x0() {
        if (this.T.h() != 0 && this.Y.L0() == 0) {
            View childAt = this.U.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top < 0 || top > AndroidUtilities.dp(258.0f)) {
                return;
            }
            this.U.v0(0, top, null);
        }
    }

    public final void y0(boolean z10) {
        org.telegram.ui.Components.el elVar;
        Location location;
        Location location2;
        if (this.G0 == 3) {
            z10 = true;
        }
        if (z10 && (elVar = this.e) != null && elVar.getTag() == null && ((location = this.w0) == null || (location2 = this.x0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        org.telegram.ui.Components.el elVar2 = this.e;
        if (elVar2 != null) {
            if (!z10 || elVar2.getTag() == null) {
                if (z10 || this.e.getTag() != null) {
                    this.e.setTag(z10 ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.el, Float>) View.TRANSLATION_X, z10 ? 0.0f : -AndroidUtilities.dp(80.0f)));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(org.telegram.ui.Components.pr.g);
                    animatorSet.start();
                }
            }
        }
    }

    public final void z0(boolean z10, boolean z11) {
        Boolean bool = this.P0;
        if (bool == null || bool.booleanValue() != z10) {
            this.P0 = Boolean.valueOf(z10);
            if (z11) {
                this.b.setVisibility(0);
                this.b.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f).setInterpolator(org.telegram.ui.Components.pr.h).setDuration(420L).withEndAction(new oc0(this, z10, 0)).start();
            } else {
                this.b.setVisibility(z10 ? 0 : 8);
                this.b.setAlpha(z10 ? 1.0f : 0.0f);
                this.b.setScaleX(z10 ? 1.0f : 0.7f);
                this.b.setScaleY(z10 ? 1.0f : 0.7f);
            }
        }
    }
}

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class pc0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public boolean A0;
    public final UndoView[] B;
    public kc0 B0;
    public boolean C;
    public final int C0;
    public boolean D;
    public int D0;
    public IMapsProvider.IMap E;
    public hc0 E0;
    public IMapsProvider.ICameraUpdate F;
    public xb0 F0;
    public IMapsProvider.IMapView G;
    public fc0 G0;
    public IMapsProvider.ICameraUpdate H;
    public org.telegram.ui.Cells.v3 H0;
    public boolean I;
    public TL_stories.MediaArea I0;
    public float J;
    public boolean J0;
    public IMapsProvider.ICircle K;
    public boolean K0;
    public double L;
    public Boolean L0;
    public boolean M;
    public final Bitmap[] M0;
    public org.telegram.ui.Components.qh0 N;
    public m0 O;
    public dc0 P;
    public org.telegram.ui.Components.wk0 Q;
    public org.telegram.ui.Components.wk0 R;
    public ic0 S;
    public View T;
    public f2.m0 U;
    public org.telegram.ui.ActionBar.w0 V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public ImageView a;
    public long a0;
    public TextView b;
    public boolean b0;
    public ImageView c;
    public final ArrayList c0;
    public org.telegram.ui.ActionBar.w0 d;
    public final a0.h d0;
    public org.telegram.ui.Components.vk e;
    public long e0;
    public LinearLayout f;
    public boolean f0;
    public final ArrayList g0;
    public ImageView h;
    public AnimatorSet h0;
    public IMapsProvider.IMarker i0;
    public oc0 j0;
    public FrameLayout k0;
    public boolean l0;
    public boolean m0;
    public TextView n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public TextView r;
    public boolean r0;
    public Drawable s;
    public Location s0;
    public Location t0;
    public int u0;
    public ih.b3 v;
    public TLRPC.TL_channelLocation v0;
    public org.telegram.ui.ActionBar.w0 w;
    public TLRPC.TL_channelLocation w0;
    public mc0 x;
    public MessageObject x0;
    public kh.x3 y;
    public boolean y0;
    public boolean z0;

    public pc0(int i9) {
        super(null);
        this.B = new UndoView[2];
        this.X = true;
        this.Y = false;
        this.Z = true;
        this.b0 = true;
        this.c0 = new ArrayList();
        this.d0 = new a0.h();
        this.e0 = -1L;
        this.g0 = new ArrayList();
        this.l0 = true;
        this.m0 = true;
        this.D0 = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.K0 = true;
        this.M0 = new Bitmap[7];
        this.C0 = i9;
        AndroidUtilities.fixGoogleMapsBug();
    }

    public static void T(pc0 pc0Var) {
        IMapsProvider.IMap iMap;
        Activity parentActivity;
        int i9 = pc0Var.C0;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = pc0Var.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            if (pc0Var.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pc0Var.getParentActivity());
            alertDialog$Builder.m(R.raw.permission_request_location, 72, pc0Var.getThemedColor(org.telegram.ui.ActionBar.f6.L5), null);
            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
            alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new vb0(pc0Var, 1));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            pc0Var.showDialog(alertDialog$Builder.a);
            return;
        }
        if (pc0Var.c0() || i9 == 3) {
            if ((pc0Var.x0 == null || i9 == 3) && pc0Var.v0 == null) {
                if (pc0Var.s0 != null && pc0Var.E != null) {
                    ImageView imageView = pc0Var.a;
                    int i10 = org.telegram.ui.ActionBar.f6.vi;
                    imageView.setColorFilter(new PorterDuffColorFilter(pc0Var.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
                    pc0Var.a.setTag(Integer.valueOf(i10));
                    pc0Var.P.L(null);
                    pc0Var.y0 = false;
                    pc0Var.x0(false);
                    pc0Var.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(pc0Var.s0.getLatitude(), pc0Var.s0.getLongitude())));
                    if (pc0Var.z0 && i9 != 8) {
                        Location location = pc0Var.s0;
                        if (location != null) {
                            pc0Var.P.H(null, location, true);
                        }
                        pc0Var.z0 = false;
                        pc0Var.w0();
                    }
                }
            } else if (pc0Var.s0 != null && (iMap = pc0Var.E) != null) {
                iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(pc0Var.s0.getLatitude(), pc0Var.s0.getLongitude()), pc0Var.E.getMaxZoomLevel() - 4.0f));
            }
            if (pc0Var.i0 != null) {
                pc0Var.T.setVisibility(0);
                mc0 mc0Var = pc0Var.x;
                IMapsProvider.IMarker iMarker = pc0Var.i0;
                HashMap hashMap = mc0Var.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    mc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                pc0Var.i0 = null;
                pc0Var.j0 = null;
                pc0Var.k0 = null;
            }
        }
    }

    public static /* synthetic */ void U(pc0 pc0Var, boolean z10, TLRPC.User user, int i9) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (!z10) {
            pc0Var.v0(i9, user, 0);
            return;
        }
        LocationController.SharingLocationInfo sharingLocationInfo = pc0Var.getLocationController().getSharingLocationInfo(pc0Var.a0);
        if (sharingLocationInfo != null) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = pc0Var.getMessagesController().getInputPeer(sharingLocationInfo.did);
            tL_messages_editMessage.id = sharingLocationInfo.mid;
            tL_messages_editMessage.flags |= 16384;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = false;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
            Location lastKnownLocation = LocationController.getInstance(pc0Var.currentAccount).getLastKnownLocation();
            tL_messages_editMessage.media.geo_point.lat = AndroidUtilities.fixLocationCoord(lastKnownLocation.getLatitude());
            tL_messages_editMessage.media.geo_point._long = AndroidUtilities.fixLocationCoord(lastKnownLocation.getLongitude());
            tL_messages_editMessage.media.geo_point.accuracy_radius = (int) lastKnownLocation.getAccuracy();
            TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
            TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
            if (inputGeoPoint.accuracy_radius != 0) {
                inputGeoPoint.flags |= 1;
            }
            int i10 = sharingLocationInfo.lastSentProximityMeters;
            int i11 = sharingLocationInfo.proximityMeters;
            if (i10 != i11) {
                inputMedia.proximity_notification_radius = i11;
                inputMedia.flags |= 8;
            }
            inputMedia.heading = LocationController.getHeading(lastKnownLocation);
            TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
            int i12 = inputMedia2.flags;
            inputMedia2.flags = i12 | 4;
            int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i14 = i9 == Integer.MAX_VALUE ? ConnectionsManager.DEFAULT_DATACENTER_ID : sharingLocationInfo.period + i9;
            sharingLocationInfo.period = i14;
            inputMedia2.period = i14;
            if (i9 != Integer.MAX_VALUE) {
                i13 = sharingLocationInfo.stopTime + i9;
            }
            sharingLocationInfo.stopTime = i13;
            inputMedia2.flags = i12 | 6;
            MessageObject messageObject = sharingLocationInfo.messageObject;
            if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                messageMedia.period = i14;
                pc0Var.getMessagesStorage().replaceMessageIfExists(sharingLocationInfo.messageObject.messageOwner, null, null, true);
            }
            pc0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
        }
    }

    public static /* synthetic */ void V(pc0 pc0Var) {
        xb0 xb0Var;
        pc0Var.getLocationController().markLiveLoactionsAsRead(pc0Var.a0);
        if (pc0Var.isPaused || (xb0Var = pc0Var.F0) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(xb0Var, 5000L);
    }

    public static IMapsProvider.LatLng o0(IMapsProvider.LatLng latLng, double d, double d9) {
        double degrees = Math.toDegrees(d9 / (Math.cos(Math.toRadians(latLng.latitude)) * 6366198.0d));
        return new IMapsProvider.LatLng(latLng.latitude + Math.toDegrees(d / 6366198.0d), latLng.longitude + degrees);
    }

    public final void A0() {
        if (!this.n0) {
            this.f.setVisibility(8);
        } else {
            if (!this.p0) {
                this.R.setEmptyView(this.f);
                return;
            }
            this.R.setEmptyView(null);
            this.f.setVisibility(8);
            this.R.setVisibility(8);
        }
    }

    public final void B0() {
        TLRPC.MessageMedia messageMedia;
        int i9;
        if (this.b == null) {
            return;
        }
        if (this.f0) {
            y0(false, true);
            i0();
            return;
        }
        int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
        ArrayList arrayList = this.c0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.Message message = ((jc0) arrayList.get(i11)).b;
            if (message != null && (messageMedia = message.media) != null && ((i9 = messageMedia.period) == Integer.MAX_VALUE || message.date + i9 > currentTime)) {
                i10++;
            }
        }
        boolean z10 = this.d0.f(getUserConfig().getClientUserId()) != null;
        if (this.s0 != null && !z10) {
            i10++;
        }
        y0(i10 >= 2, true);
    }

    public final jc0 b0(TLRPC.Message message) {
        Location location;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
        long fromChatId = MessageObject.getFromChatId(message);
        a0.h hVar = this.d0;
        jc0 jc0Var = (jc0) hVar.f(fromChatId);
        if (jc0Var == null) {
            jc0Var = new jc0();
            jc0Var.b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                jc0Var.c = getMessagesController().getUser(Long.valueOf(jc0Var.b.from_id.user_id));
                jc0Var.a = jc0Var.b.from_id.user_id;
            } else {
                long dialogId = MessageObject.getDialogId(message);
                if (DialogObject.isUserDialog(dialogId)) {
                    jc0Var.c = getMessagesController().getUser(Long.valueOf(dialogId));
                } else {
                    jc0Var.d = getMessagesController().getChat(Long.valueOf(-dialogId));
                }
                jc0Var.a = dialogId;
            }
            u0(jc0Var);
            try {
                IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                Bitmap f02 = f0(jc0Var);
                if (f02 != null) {
                    position.icon(f02);
                    position.anchor(0.5f, 0.907f);
                    jc0Var.e = this.E.addMarker(position);
                    if (!UserObject.isUserSelf(jc0Var.c)) {
                        IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                        flat.anchor(0.5f, 0.5f);
                        IMapsProvider.IMarker addMarker = this.E.addMarker(flat);
                        jc0Var.f = addMarker;
                        int i9 = message.media.heading;
                        if (i9 != 0) {
                            addMarker.setRotation(i9);
                            jc0Var.f.setIcon(R.drawable.map_pin_cone2);
                            jc0Var.g = true;
                        } else {
                            addMarker.setRotation(0);
                            jc0Var.f.setIcon(R.drawable.map_pin_circle);
                            jc0Var.g = false;
                        }
                    }
                    this.c0.add(jc0Var);
                    hVar.k(jc0Var, jc0Var.a);
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.a0);
                    if (jc0Var.a == getUserConfig().getClientUserId() && sharingLocationInfo != null && jc0Var.b.id == sharingLocationInfo.mid && (location = this.s0) != null) {
                        jc0Var.e.setPosition(new IMapsProvider.LatLng(location.getLatitude(), this.s0.getLongitude()));
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        } else {
            jc0Var.b = message;
            jc0Var.e.setPosition(latLng);
            if (this.e0 == jc0Var.a) {
                this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(jc0Var.e.getPosition()));
            }
        }
        org.telegram.ui.Components.qh0 qh0Var = this.N;
        if (qh0Var != null) {
            qh0Var.c(true);
        }
        B0();
        return jc0Var;
    }

    public final boolean c0() {
        if (g0()) {
            return false;
        }
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, getThemedColor(org.telegram.ui.ActionBar.f6.L5), null);
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new vb0(this, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(alertDialog$Builder.a);
                    return false;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        boolean z10;
        int i9;
        int i10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.o0 = false;
        this.n0 = false;
        this.p0 = false;
        dc0 dc0Var = this.P;
        if (dc0Var != null) {
            dc0Var.F();
        }
        ic0 ic0Var = this.S;
        if (ic0Var != null) {
            ic0Var.F();
        }
        if (this.v0 != null) {
            Location location = new Location("network");
            this.t0 = location;
            location.setLatitude(this.v0.geo_point.lat);
            this.t0.setLongitude(this.v0.geo_point._long);
        } else if (this.x0 != null) {
            Location location2 = new Location("network");
            this.t0 = location2;
            location2.setLatitude(this.x0.messageOwner.media.geo.lat);
            this.t0.setLongitude(this.x0.messageOwner.media.geo._long);
        }
        this.Y = (Build.VERSION.SDK_INT < 23 || getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.f6.h5;
        kVar.setBackgroundColor(getThemedColor(i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.f6.j5;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.C(getThemedColor(i12), false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.f6.I5), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new cc0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        TLRPC.TL_channelLocation tL_channelLocation = this.v0;
        int i13 = this.C0;
        if (tL_channelLocation != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
        } else {
            MessageObject messageObject = this.x0;
            if (messageObject == null) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
                if (i13 != 4) {
                    this.x = new mc0(this, context);
                    org.telegram.ui.ActionBar.w0 c10 = n10.c(0, R.drawable.outline_header_search, getResourceProvider());
                    c10.F();
                    c10.D = new cb(this, 11);
                    this.w = c10;
                    c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
                    this.w.setContentDescription(LocaleController.getString(R.string.Search));
                    EditTextBoldCursor searchField = this.w.getSearchField();
                    searchField.setTextColor(getThemedColor(i12));
                    searchField.setCursorColor(getThemedColor(i12));
                    searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Vd));
                }
            } else if (messageObject.isLiveLocation()) {
                this.actionBar.setTitle(LocaleController.getString(R.string.AttachLiveLocation));
                org.telegram.ui.ActionBar.w0 c11 = n10.c(0, R.drawable.ic_ab_other, getResourceProvider());
                this.V = c11;
                c11.e(6, R.drawable.filled_directions, LocaleController.getString(R.string.GetDirections));
            } else {
                String str = this.x0.messageOwner.media.title;
                if (str == null || str.length() <= 0) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.SharedPlace));
                }
                if (i13 != 3) {
                    org.telegram.ui.ActionBar.w0 c12 = n10.c(0, R.drawable.ic_ab_other, getResourceProvider());
                    this.V = c12;
                    c12.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
                    if (!getLocationController().isSharingLocation(this.a0) && this.K0) {
                        this.V.e(5, R.drawable.msg_location, LocaleController.getString(R.string.SendLiveLocationMenu));
                    }
                    this.V.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                }
            }
        }
        nc0 nc0Var = new nc0(this, context);
        this.fragmentView = nc0Var;
        nc0Var.setBackgroundColor(getThemedColor(i11));
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s = mutate;
        int themedColor = getThemedColor(i11);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        Rect rect = new Rect();
        this.s.getPadding(rect);
        FrameLayout.LayoutParams layoutParams = (i13 == 0 || i13 == 1) ? new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f) + rect.top) : new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(6.0f) + rect.top);
        layoutParams.gravity = 83;
        m0 m0Var = new m0(this, context, 11);
        this.O = m0Var;
        m0Var.setBackgroundDrawable(new org.telegram.ui.Components.vc(m0()));
        MessageObject messageObject2 = this.x0;
        if ((messageObject2 == null && (i13 == 0 || i13 == 1)) || (messageObject2 != null && i13 == 3)) {
            org.telegram.ui.Components.vk vkVar = new org.telegram.ui.Components.vk(context, 1);
            this.e = vkVar;
            vkVar.setTranslationX(-AndroidUtilities.dp(80.0f));
            int dp = AndroidUtilities.dp(40.0f);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.f6.wi);
            int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.f6.xi);
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3);
            g7.g6.a(this.e);
            this.e.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.e.setOutlineProvider(ff.r0.b);
            this.e.setBackgroundDrawable(i02);
            this.e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.vi));
            this.e.setTextSize(1, 14.0f);
            this.e.setTypeface(AndroidUtilities.bold());
            this.e.setGravity(17);
            this.e.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.O.addView(this.e, g7.e6.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
            if (i13 == 3) {
                this.e.setText(LocaleController.getString(R.string.OpenInMaps));
                final int i14 = 5;
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ub0
                    public final /* synthetic */ pc0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        boolean z11;
                        int i15 = i14;
                        pc0 pc0Var = this.b;
                        int i16 = 1;
                        switch (i15) {
                            case 0:
                                pc0Var.x0(false);
                                pc0Var.P.H(null, pc0Var.t0, true);
                                pc0Var.z0 = true;
                                pc0Var.w0();
                                break;
                            case 1:
                                pc0Var.d.M(null, null);
                                break;
                            case 2:
                                pc0.T(pc0Var);
                                break;
                            case 3:
                                pc0Var.e0 = -1L;
                                pc0Var.y0 = true;
                                if (pc0Var.i0()) {
                                    pc0Var.f0 = true;
                                    pc0Var.y0(false, true);
                                    break;
                                }
                                break;
                            case 4:
                                if (pc0Var.getParentActivity() != null && pc0Var.s0 != null && pc0Var.c0() && pc0Var.E != null) {
                                    kh.x3 x3Var = pc0Var.y;
                                    if (x3Var != null) {
                                        x3Var.e(true);
                                    }
                                    int i17 = 3;
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = pc0Var.getLocationController().getSharingLocationInfo(pc0Var.a0);
                                    if (pc0Var.C) {
                                        pc0Var.B[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        pc0Var.c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = pc0Var.K;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            pc0Var.K = null;
                                        }
                                        pc0Var.C = true;
                                        pc0Var.l0().k(0L, 25, 0, null, new xb0(pc0Var, i16), new x20(21, pc0Var, sharingLocationInfo));
                                        break;
                                    } else {
                                        IMapsProvider.ICircle iCircle2 = pc0Var.K;
                                        if (iCircle2 == null) {
                                            pc0Var.d0(500);
                                        } else {
                                            pc0Var.L = iCircle2.getRadius();
                                        }
                                        TLRPC.User user = DialogObject.isUserDialog(pc0Var.a0) ? pc0Var.getMessagesController().getUser(Long.valueOf(pc0Var.a0)) : null;
                                        Activity parentActivity = pc0Var.getParentActivity();
                                        vb0 vb0Var = new vb0(pc0Var, i17);
                                        yr yrVar = new yr(23, pc0Var, user);
                                        xb0 xb0Var = new xb0(pc0Var, 2);
                                        org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(parentActivity);
                                        qh0Var.a = null;
                                        qh0Var.d = -1;
                                        qh0Var.e = false;
                                        qh0Var.f = false;
                                        qh0Var.h = null;
                                        qh0Var.n = new Rect();
                                        new Paint();
                                        qh0Var.w = true;
                                        qh0Var.B = org.telegram.ui.Components.gr.h;
                                        qh0Var.setWillNotDraw(false);
                                        qh0Var.M = xb0Var;
                                        qh0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                        Rect rect2 = new Rect();
                                        Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false), PorterDuff.Mode.MULTIPLY));
                                        mutate2.getPadding(rect2);
                                        int i18 = rect2.left;
                                        qh0Var.x = i18;
                                        org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(qh0Var.getContext());
                                        qh0Var.v = mh0Var;
                                        mh0Var.setBackgroundDrawable(mutate2);
                                        mh0Var.setPadding(i18, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i18, 0);
                                        mh0Var.setVisibility(4);
                                        qh0Var.addView(mh0Var, 0, g7.e6.e(-1, -2, 80));
                                        qh0Var.K = LocaleController.getUseImperialSystemType();
                                        qh0Var.I = user;
                                        qh0Var.E = vb0Var;
                                        org.telegram.ui.Components.bc0 bc0Var = new org.telegram.ui.Components.bc0(parentActivity, null);
                                        qh0Var.C = bc0Var;
                                        bc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                        bc0Var.setItemCount(5);
                                        org.telegram.ui.Components.bc0 bc0Var2 = new org.telegram.ui.Components.bc0(parentActivity, null);
                                        qh0Var.D = bc0Var2;
                                        bc0Var2.setItemCount(5);
                                        bc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                        org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(qh0Var, parentActivity);
                                        qh0Var.L = nh0Var;
                                        nh0Var.setOrientation(1);
                                        FrameLayout frameLayout = new FrameLayout(parentActivity);
                                        nh0Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
                                        TextView textView = new TextView(parentActivity);
                                        textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                        org.telegram.messenger.l0.q(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false), 1, 20.0f);
                                        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                        textView.setOnTouchListener(new jh.d(20));
                                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                                        linearLayout.setOrientation(0);
                                        linearLayout.setWeightSum(1.0f);
                                        nh0Var.addView(linearLayout, g7.e6.n(-1, -2));
                                        System.currentTimeMillis();
                                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                        TextView textView2 = new TextView(parentActivity);
                                        qh0Var.G = textView2;
                                        org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(parentActivity);
                                        qh0Var.F = oh0Var;
                                        linearLayout.addView(bc0Var, g7.e6.l(0.5f, 0, 270));
                                        bc0Var.setFormatter(new org.telegram.ui.Components.lh0(qh0Var, 0));
                                        bc0Var.setMinValue(0);
                                        bc0Var.setMaxValue(10);
                                        bc0Var.setWrapSelectorWheel(false);
                                        bc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                        org.telegram.ui.Components.lh0 lh0Var = new org.telegram.ui.Components.lh0(qh0Var, 1);
                                        bc0Var.setOnValueChangedListener(lh0Var);
                                        bc0Var2.setMinValue(0);
                                        bc0Var2.setMaxValue(10);
                                        bc0Var2.setWrapSelectorWheel(false);
                                        bc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                        linearLayout.addView(bc0Var2, g7.e6.l(0.5f, 0, 270));
                                        bc0Var2.setFormatter(new org.telegram.ui.Components.lh0(qh0Var, 2));
                                        bc0Var2.setOnValueChangedListener(lh0Var);
                                        bc0Var.setValue(0);
                                        bc0Var2.setValue(6);
                                        nh0Var.addView(frameLayout2, g7.e6.t(-1, 48, 83, 16, 15, 16, 16));
                                        oh0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        oh0Var.setGravity(17);
                                        oh0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
                                        oh0Var.setTextSize(1, 14.0f);
                                        oh0Var.setMaxLines(2);
                                        oh0Var.setTypeface(AndroidUtilities.bold());
                                        oh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.v5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.Oh));
                                        frameLayout2.addView(oh0Var, g7.e6.c(48.0f, -1));
                                        oh0Var.setOnClickListener(new org.telegram.ui.Components.s2(28, qh0Var, yrVar));
                                        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        textView2.setGravity(17);
                                        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q5, false));
                                        textView2.setTextSize(1, 14.0f);
                                        textView2.setAlpha(0.0f);
                                        textView2.setScaleX(0.5f);
                                        textView2.setScaleY(0.5f);
                                        frameLayout2.addView(textView2, g7.e6.c(48.0f, -1));
                                        mh0Var.addView(nh0Var, g7.e6.e(-1, -2, 51));
                                        pc0Var.N = qh0Var;
                                        ((FrameLayout) pc0Var.fragmentView).addView(qh0Var, g7.e6.c(-1.0f, -1));
                                        org.telegram.ui.Components.qh0 qh0Var2 = pc0Var.N;
                                        qh0Var2.r = false;
                                        AnimatorSet animatorSet = qh0Var2.s;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                            qh0Var2.s = null;
                                        }
                                        org.telegram.ui.Components.mh0 mh0Var2 = qh0Var2.v;
                                        mh0Var2.measure(View.MeasureSpec.makeMeasureSpec((qh0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                        if (qh0Var2.r) {
                                            z11 = true;
                                        } else {
                                            mh0Var2.setVisibility(0);
                                            if (qh0Var2.w) {
                                                qh0Var2.setLayerType(2, null);
                                            }
                                            mh0Var2.setTranslationY(mh0Var2.getMeasuredHeight());
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            qh0Var2.s = animatorSet2;
                                            animatorSet2.playTogether(ObjectAnimator.ofFloat(mh0Var2, (Property<org.telegram.ui.Components.mh0, Float>) View.TRANSLATION_Y, 0.0f));
                                            qh0Var2.s.setDuration(400L);
                                            qh0Var2.s.setStartDelay(20L);
                                            qh0Var2.s.setInterpolator(qh0Var2.B);
                                            z11 = true;
                                            qh0Var2.s.addListener(new org.telegram.ui.Components.ph0(qh0Var2, 1 == true ? 1 : 0));
                                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                            qh0Var2.s.start();
                                        }
                                        qh0Var2.c(z11);
                                        break;
                                    }
                                }
                                break;
                            default:
                                pc0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = pc0Var.x0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d9 = geoPoint._long;
                                    pc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d9 + "?q=" + d + "," + d9)));
                                    break;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                        }
                    }
                });
                this.e.setTranslationX(0.0f);
            } else {
                this.e.setText(LocaleController.getString(R.string.PlacesInThisArea));
                final int i15 = 0;
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ub0
                    public final /* synthetic */ pc0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        boolean z11;
                        int i152 = i15;
                        pc0 pc0Var = this.b;
                        int i16 = 1;
                        switch (i152) {
                            case 0:
                                pc0Var.x0(false);
                                pc0Var.P.H(null, pc0Var.t0, true);
                                pc0Var.z0 = true;
                                pc0Var.w0();
                                break;
                            case 1:
                                pc0Var.d.M(null, null);
                                break;
                            case 2:
                                pc0.T(pc0Var);
                                break;
                            case 3:
                                pc0Var.e0 = -1L;
                                pc0Var.y0 = true;
                                if (pc0Var.i0()) {
                                    pc0Var.f0 = true;
                                    pc0Var.y0(false, true);
                                    break;
                                }
                                break;
                            case 4:
                                if (pc0Var.getParentActivity() != null && pc0Var.s0 != null && pc0Var.c0() && pc0Var.E != null) {
                                    kh.x3 x3Var = pc0Var.y;
                                    if (x3Var != null) {
                                        x3Var.e(true);
                                    }
                                    int i17 = 3;
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = pc0Var.getLocationController().getSharingLocationInfo(pc0Var.a0);
                                    if (pc0Var.C) {
                                        pc0Var.B[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        pc0Var.c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = pc0Var.K;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            pc0Var.K = null;
                                        }
                                        pc0Var.C = true;
                                        pc0Var.l0().k(0L, 25, 0, null, new xb0(pc0Var, i16), new x20(21, pc0Var, sharingLocationInfo));
                                        break;
                                    } else {
                                        IMapsProvider.ICircle iCircle2 = pc0Var.K;
                                        if (iCircle2 == null) {
                                            pc0Var.d0(500);
                                        } else {
                                            pc0Var.L = iCircle2.getRadius();
                                        }
                                        TLRPC.User user = DialogObject.isUserDialog(pc0Var.a0) ? pc0Var.getMessagesController().getUser(Long.valueOf(pc0Var.a0)) : null;
                                        Activity parentActivity = pc0Var.getParentActivity();
                                        vb0 vb0Var = new vb0(pc0Var, i17);
                                        yr yrVar = new yr(23, pc0Var, user);
                                        xb0 xb0Var = new xb0(pc0Var, 2);
                                        org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(parentActivity);
                                        qh0Var.a = null;
                                        qh0Var.d = -1;
                                        qh0Var.e = false;
                                        qh0Var.f = false;
                                        qh0Var.h = null;
                                        qh0Var.n = new Rect();
                                        new Paint();
                                        qh0Var.w = true;
                                        qh0Var.B = org.telegram.ui.Components.gr.h;
                                        qh0Var.setWillNotDraw(false);
                                        qh0Var.M = xb0Var;
                                        qh0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                        Rect rect2 = new Rect();
                                        Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false), PorterDuff.Mode.MULTIPLY));
                                        mutate2.getPadding(rect2);
                                        int i18 = rect2.left;
                                        qh0Var.x = i18;
                                        org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(qh0Var.getContext());
                                        qh0Var.v = mh0Var;
                                        mh0Var.setBackgroundDrawable(mutate2);
                                        mh0Var.setPadding(i18, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i18, 0);
                                        mh0Var.setVisibility(4);
                                        qh0Var.addView(mh0Var, 0, g7.e6.e(-1, -2, 80));
                                        qh0Var.K = LocaleController.getUseImperialSystemType();
                                        qh0Var.I = user;
                                        qh0Var.E = vb0Var;
                                        org.telegram.ui.Components.bc0 bc0Var = new org.telegram.ui.Components.bc0(parentActivity, null);
                                        qh0Var.C = bc0Var;
                                        bc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                        bc0Var.setItemCount(5);
                                        org.telegram.ui.Components.bc0 bc0Var2 = new org.telegram.ui.Components.bc0(parentActivity, null);
                                        qh0Var.D = bc0Var2;
                                        bc0Var2.setItemCount(5);
                                        bc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                        org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(qh0Var, parentActivity);
                                        qh0Var.L = nh0Var;
                                        nh0Var.setOrientation(1);
                                        FrameLayout frameLayout = new FrameLayout(parentActivity);
                                        nh0Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
                                        TextView textView = new TextView(parentActivity);
                                        textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                        org.telegram.messenger.l0.q(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false), 1, 20.0f);
                                        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                        textView.setOnTouchListener(new jh.d(20));
                                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                                        linearLayout.setOrientation(0);
                                        linearLayout.setWeightSum(1.0f);
                                        nh0Var.addView(linearLayout, g7.e6.n(-1, -2));
                                        System.currentTimeMillis();
                                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                        TextView textView2 = new TextView(parentActivity);
                                        qh0Var.G = textView2;
                                        org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(parentActivity);
                                        qh0Var.F = oh0Var;
                                        linearLayout.addView(bc0Var, g7.e6.l(0.5f, 0, 270));
                                        bc0Var.setFormatter(new org.telegram.ui.Components.lh0(qh0Var, 0));
                                        bc0Var.setMinValue(0);
                                        bc0Var.setMaxValue(10);
                                        bc0Var.setWrapSelectorWheel(false);
                                        bc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                        org.telegram.ui.Components.lh0 lh0Var = new org.telegram.ui.Components.lh0(qh0Var, 1);
                                        bc0Var.setOnValueChangedListener(lh0Var);
                                        bc0Var2.setMinValue(0);
                                        bc0Var2.setMaxValue(10);
                                        bc0Var2.setWrapSelectorWheel(false);
                                        bc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                        linearLayout.addView(bc0Var2, g7.e6.l(0.5f, 0, 270));
                                        bc0Var2.setFormatter(new org.telegram.ui.Components.lh0(qh0Var, 2));
                                        bc0Var2.setOnValueChangedListener(lh0Var);
                                        bc0Var.setValue(0);
                                        bc0Var2.setValue(6);
                                        nh0Var.addView(frameLayout2, g7.e6.t(-1, 48, 83, 16, 15, 16, 16));
                                        oh0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        oh0Var.setGravity(17);
                                        oh0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
                                        oh0Var.setTextSize(1, 14.0f);
                                        oh0Var.setMaxLines(2);
                                        oh0Var.setTypeface(AndroidUtilities.bold());
                                        oh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.v5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.Oh));
                                        frameLayout2.addView(oh0Var, g7.e6.c(48.0f, -1));
                                        oh0Var.setOnClickListener(new org.telegram.ui.Components.s2(28, qh0Var, yrVar));
                                        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        textView2.setGravity(17);
                                        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q5, false));
                                        textView2.setTextSize(1, 14.0f);
                                        textView2.setAlpha(0.0f);
                                        textView2.setScaleX(0.5f);
                                        textView2.setScaleY(0.5f);
                                        frameLayout2.addView(textView2, g7.e6.c(48.0f, -1));
                                        mh0Var.addView(nh0Var, g7.e6.e(-1, -2, 51));
                                        pc0Var.N = qh0Var;
                                        ((FrameLayout) pc0Var.fragmentView).addView(qh0Var, g7.e6.c(-1.0f, -1));
                                        org.telegram.ui.Components.qh0 qh0Var2 = pc0Var.N;
                                        qh0Var2.r = false;
                                        AnimatorSet animatorSet = qh0Var2.s;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                            qh0Var2.s = null;
                                        }
                                        org.telegram.ui.Components.mh0 mh0Var2 = qh0Var2.v;
                                        mh0Var2.measure(View.MeasureSpec.makeMeasureSpec((qh0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                        if (qh0Var2.r) {
                                            z11 = true;
                                        } else {
                                            mh0Var2.setVisibility(0);
                                            if (qh0Var2.w) {
                                                qh0Var2.setLayerType(2, null);
                                            }
                                            mh0Var2.setTranslationY(mh0Var2.getMeasuredHeight());
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            qh0Var2.s = animatorSet2;
                                            animatorSet2.playTogether(ObjectAnimator.ofFloat(mh0Var2, (Property<org.telegram.ui.Components.mh0, Float>) View.TRANSLATION_Y, 0.0f));
                                            qh0Var2.s.setDuration(400L);
                                            qh0Var2.s.setStartDelay(20L);
                                            qh0Var2.s.setInterpolator(qh0Var2.B);
                                            z11 = true;
                                            qh0Var2.s.addListener(new org.telegram.ui.Components.ph0(qh0Var2, 1 == true ? 1 : 0));
                                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                            qh0Var2.s.start();
                                        }
                                        qh0Var2.c(z11);
                                        break;
                                    }
                                }
                                break;
                            default:
                                pc0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = pc0Var.x0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d9 = geoPoint._long;
                                    pc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d9 + "?q=" + d + "," + d9)));
                                    break;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                        }
                    }
                });
            }
        }
        int i16 = org.telegram.ui.ActionBar.f6.ui;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i16), false, getResourceProvider());
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
        int i17 = org.telegram.ui.ActionBar.f6.wi;
        int themedColor4 = getThemedColor(i17);
        int i18 = org.telegram.ui.ActionBar.f6.xi;
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.f6.h0(dp2, themedColor4, getThemedColor(i18));
        g7.g6.a(this.d);
        this.d.setTranslationZ(AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.d;
        bg.q1 q1Var = ff.r0.a;
        w0Var2.setOutlineProvider(q1Var);
        this.d.setBackgroundDrawable(h02);
        this.d.setIcon(R.drawable.msg_map_type);
        this.O.addView(this.d, g7.e6.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        final int i19 = 1;
        this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ub0
            public final /* synthetic */ pc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11;
                int i152 = i19;
                pc0 pc0Var = this.b;
                int i162 = 1;
                switch (i152) {
                    case 0:
                        pc0Var.x0(false);
                        pc0Var.P.H(null, pc0Var.t0, true);
                        pc0Var.z0 = true;
                        pc0Var.w0();
                        break;
                    case 1:
                        pc0Var.d.M(null, null);
                        break;
                    case 2:
                        pc0.T(pc0Var);
                        break;
                    case 3:
                        pc0Var.e0 = -1L;
                        pc0Var.y0 = true;
                        if (pc0Var.i0()) {
                            pc0Var.f0 = true;
                            pc0Var.y0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (pc0Var.getParentActivity() != null && pc0Var.s0 != null && pc0Var.c0() && pc0Var.E != null) {
                            kh.x3 x3Var = pc0Var.y;
                            if (x3Var != null) {
                                x3Var.e(true);
                            }
                            int i172 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = pc0Var.getLocationController().getSharingLocationInfo(pc0Var.a0);
                            if (pc0Var.C) {
                                pc0Var.B[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                pc0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = pc0Var.K;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    pc0Var.K = null;
                                }
                                pc0Var.C = true;
                                pc0Var.l0().k(0L, 25, 0, null, new xb0(pc0Var, i162), new x20(21, pc0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = pc0Var.K;
                                if (iCircle2 == null) {
                                    pc0Var.d0(500);
                                } else {
                                    pc0Var.L = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(pc0Var.a0) ? pc0Var.getMessagesController().getUser(Long.valueOf(pc0Var.a0)) : null;
                                Activity parentActivity = pc0Var.getParentActivity();
                                vb0 vb0Var = new vb0(pc0Var, i172);
                                yr yrVar = new yr(23, pc0Var, user);
                                xb0 xb0Var = new xb0(pc0Var, 2);
                                org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(parentActivity);
                                qh0Var.a = null;
                                qh0Var.d = -1;
                                qh0Var.e = false;
                                qh0Var.f = false;
                                qh0Var.h = null;
                                qh0Var.n = new Rect();
                                new Paint();
                                qh0Var.w = true;
                                qh0Var.B = org.telegram.ui.Components.gr.h;
                                qh0Var.setWillNotDraw(false);
                                qh0Var.M = xb0Var;
                                qh0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false), PorterDuff.Mode.MULTIPLY));
                                mutate2.getPadding(rect2);
                                int i182 = rect2.left;
                                qh0Var.x = i182;
                                org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(qh0Var.getContext());
                                qh0Var.v = mh0Var;
                                mh0Var.setBackgroundDrawable(mutate2);
                                mh0Var.setPadding(i182, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i182, 0);
                                mh0Var.setVisibility(4);
                                qh0Var.addView(mh0Var, 0, g7.e6.e(-1, -2, 80));
                                qh0Var.K = LocaleController.getUseImperialSystemType();
                                qh0Var.I = user;
                                qh0Var.E = vb0Var;
                                org.telegram.ui.Components.bc0 bc0Var = new org.telegram.ui.Components.bc0(parentActivity, null);
                                qh0Var.C = bc0Var;
                                bc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                bc0Var.setItemCount(5);
                                org.telegram.ui.Components.bc0 bc0Var2 = new org.telegram.ui.Components.bc0(parentActivity, null);
                                qh0Var.D = bc0Var2;
                                bc0Var2.setItemCount(5);
                                bc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(qh0Var, parentActivity);
                                qh0Var.L = nh0Var;
                                nh0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                nh0Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(parentActivity);
                                textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.l0.q(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false), 1, 20.0f);
                                frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new jh.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                nh0Var.addView(linearLayout, g7.e6.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView2 = new TextView(parentActivity);
                                qh0Var.G = textView2;
                                org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(parentActivity);
                                qh0Var.F = oh0Var;
                                linearLayout.addView(bc0Var, g7.e6.l(0.5f, 0, 270));
                                bc0Var.setFormatter(new org.telegram.ui.Components.lh0(qh0Var, 0));
                                bc0Var.setMinValue(0);
                                bc0Var.setMaxValue(10);
                                bc0Var.setWrapSelectorWheel(false);
                                bc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.lh0 lh0Var = new org.telegram.ui.Components.lh0(qh0Var, 1);
                                bc0Var.setOnValueChangedListener(lh0Var);
                                bc0Var2.setMinValue(0);
                                bc0Var2.setMaxValue(10);
                                bc0Var2.setWrapSelectorWheel(false);
                                bc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(bc0Var2, g7.e6.l(0.5f, 0, 270));
                                bc0Var2.setFormatter(new org.telegram.ui.Components.lh0(qh0Var, 2));
                                bc0Var2.setOnValueChangedListener(lh0Var);
                                bc0Var.setValue(0);
                                bc0Var2.setValue(6);
                                nh0Var.addView(frameLayout2, g7.e6.t(-1, 48, 83, 16, 15, 16, 16));
                                oh0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                oh0Var.setGravity(17);
                                oh0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
                                oh0Var.setTextSize(1, 14.0f);
                                oh0Var.setMaxLines(2);
                                oh0Var.setTypeface(AndroidUtilities.bold());
                                oh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.v5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.Oh));
                                frameLayout2.addView(oh0Var, g7.e6.c(48.0f, -1));
                                oh0Var.setOnClickListener(new org.telegram.ui.Components.s2(28, qh0Var, yrVar));
                                textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView2.setGravity(17);
                                textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q5, false));
                                textView2.setTextSize(1, 14.0f);
                                textView2.setAlpha(0.0f);
                                textView2.setScaleX(0.5f);
                                textView2.setScaleY(0.5f);
                                frameLayout2.addView(textView2, g7.e6.c(48.0f, -1));
                                mh0Var.addView(nh0Var, g7.e6.e(-1, -2, 51));
                                pc0Var.N = qh0Var;
                                ((FrameLayout) pc0Var.fragmentView).addView(qh0Var, g7.e6.c(-1.0f, -1));
                                org.telegram.ui.Components.qh0 qh0Var2 = pc0Var.N;
                                qh0Var2.r = false;
                                AnimatorSet animatorSet = qh0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    qh0Var2.s = null;
                                }
                                org.telegram.ui.Components.mh0 mh0Var2 = qh0Var2.v;
                                mh0Var2.measure(View.MeasureSpec.makeMeasureSpec((qh0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (qh0Var2.r) {
                                    z11 = true;
                                } else {
                                    mh0Var2.setVisibility(0);
                                    if (qh0Var2.w) {
                                        qh0Var2.setLayerType(2, null);
                                    }
                                    mh0Var2.setTranslationY(mh0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    qh0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(mh0Var2, (Property<org.telegram.ui.Components.mh0, Float>) View.TRANSLATION_Y, 0.0f));
                                    qh0Var2.s.setDuration(400L);
                                    qh0Var2.s.setStartDelay(20L);
                                    qh0Var2.s.setInterpolator(qh0Var2.B);
                                    z11 = true;
                                    qh0Var2.s.addListener(new org.telegram.ui.Components.ph0(qh0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    qh0Var2.s.start();
                                }
                                qh0Var2.c(z11);
                                break;
                            }
                        }
                        break;
                    default:
                        pc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = pc0Var.x0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d9 = geoPoint._long;
                            pc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d9 + "?q=" + d + "," + d9)));
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                }
            }
        });
        this.d.setDelegate(new vb0(this, 0));
        this.a = new ImageView(context);
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(40.0f), getThemedColor(i17), getThemedColor(i18));
        g7.g6.a(this.a);
        this.a.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.a.setOutlineProvider(q1Var);
        this.a.setBackground(h03);
        this.a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView = this.a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.a;
        int i20 = org.telegram.ui.ActionBar.f6.vi;
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i20), mode));
        this.a.setTag(Integer.valueOf(i20));
        this.a.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        FrameLayout.LayoutParams d = g7.e6.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f);
        d.bottomMargin = (layoutParams.height - rect.top) + d.bottomMargin;
        this.O.addView(this.a, d);
        final int i21 = 2;
        this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ub0
            public final /* synthetic */ pc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11;
                int i152 = i21;
                pc0 pc0Var = this.b;
                int i162 = 1;
                switch (i152) {
                    case 0:
                        pc0Var.x0(false);
                        pc0Var.P.H(null, pc0Var.t0, true);
                        pc0Var.z0 = true;
                        pc0Var.w0();
                        break;
                    case 1:
                        pc0Var.d.M(null, null);
                        break;
                    case 2:
                        pc0.T(pc0Var);
                        break;
                    case 3:
                        pc0Var.e0 = -1L;
                        pc0Var.y0 = true;
                        if (pc0Var.i0()) {
                            pc0Var.f0 = true;
                            pc0Var.y0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (pc0Var.getParentActivity() != null && pc0Var.s0 != null && pc0Var.c0() && pc0Var.E != null) {
                            kh.x3 x3Var = pc0Var.y;
                            if (x3Var != null) {
                                x3Var.e(true);
                            }
                            int i172 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = pc0Var.getLocationController().getSharingLocationInfo(pc0Var.a0);
                            if (pc0Var.C) {
                                pc0Var.B[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                pc0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = pc0Var.K;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    pc0Var.K = null;
                                }
                                pc0Var.C = true;
                                pc0Var.l0().k(0L, 25, 0, null, new xb0(pc0Var, i162), new x20(21, pc0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = pc0Var.K;
                                if (iCircle2 == null) {
                                    pc0Var.d0(500);
                                } else {
                                    pc0Var.L = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(pc0Var.a0) ? pc0Var.getMessagesController().getUser(Long.valueOf(pc0Var.a0)) : null;
                                Activity parentActivity = pc0Var.getParentActivity();
                                vb0 vb0Var = new vb0(pc0Var, i172);
                                yr yrVar = new yr(23, pc0Var, user);
                                xb0 xb0Var = new xb0(pc0Var, 2);
                                org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(parentActivity);
                                qh0Var.a = null;
                                qh0Var.d = -1;
                                qh0Var.e = false;
                                qh0Var.f = false;
                                qh0Var.h = null;
                                qh0Var.n = new Rect();
                                new Paint();
                                qh0Var.w = true;
                                qh0Var.B = org.telegram.ui.Components.gr.h;
                                qh0Var.setWillNotDraw(false);
                                qh0Var.M = xb0Var;
                                qh0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false), PorterDuff.Mode.MULTIPLY));
                                mutate2.getPadding(rect2);
                                int i182 = rect2.left;
                                qh0Var.x = i182;
                                org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(qh0Var.getContext());
                                qh0Var.v = mh0Var;
                                mh0Var.setBackgroundDrawable(mutate2);
                                mh0Var.setPadding(i182, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i182, 0);
                                mh0Var.setVisibility(4);
                                qh0Var.addView(mh0Var, 0, g7.e6.e(-1, -2, 80));
                                qh0Var.K = LocaleController.getUseImperialSystemType();
                                qh0Var.I = user;
                                qh0Var.E = vb0Var;
                                org.telegram.ui.Components.bc0 bc0Var = new org.telegram.ui.Components.bc0(parentActivity, null);
                                qh0Var.C = bc0Var;
                                bc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                bc0Var.setItemCount(5);
                                org.telegram.ui.Components.bc0 bc0Var2 = new org.telegram.ui.Components.bc0(parentActivity, null);
                                qh0Var.D = bc0Var2;
                                bc0Var2.setItemCount(5);
                                bc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(qh0Var, parentActivity);
                                qh0Var.L = nh0Var;
                                nh0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                nh0Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(parentActivity);
                                textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.l0.q(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false), 1, 20.0f);
                                frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new jh.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                nh0Var.addView(linearLayout, g7.e6.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView2 = new TextView(parentActivity);
                                qh0Var.G = textView2;
                                org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(parentActivity);
                                qh0Var.F = oh0Var;
                                linearLayout.addView(bc0Var, g7.e6.l(0.5f, 0, 270));
                                bc0Var.setFormatter(new org.telegram.ui.Components.lh0(qh0Var, 0));
                                bc0Var.setMinValue(0);
                                bc0Var.setMaxValue(10);
                                bc0Var.setWrapSelectorWheel(false);
                                bc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.lh0 lh0Var = new org.telegram.ui.Components.lh0(qh0Var, 1);
                                bc0Var.setOnValueChangedListener(lh0Var);
                                bc0Var2.setMinValue(0);
                                bc0Var2.setMaxValue(10);
                                bc0Var2.setWrapSelectorWheel(false);
                                bc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(bc0Var2, g7.e6.l(0.5f, 0, 270));
                                bc0Var2.setFormatter(new org.telegram.ui.Components.lh0(qh0Var, 2));
                                bc0Var2.setOnValueChangedListener(lh0Var);
                                bc0Var.setValue(0);
                                bc0Var2.setValue(6);
                                nh0Var.addView(frameLayout2, g7.e6.t(-1, 48, 83, 16, 15, 16, 16));
                                oh0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                oh0Var.setGravity(17);
                                oh0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
                                oh0Var.setTextSize(1, 14.0f);
                                oh0Var.setMaxLines(2);
                                oh0Var.setTypeface(AndroidUtilities.bold());
                                oh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.v5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.Oh));
                                frameLayout2.addView(oh0Var, g7.e6.c(48.0f, -1));
                                oh0Var.setOnClickListener(new org.telegram.ui.Components.s2(28, qh0Var, yrVar));
                                textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView2.setGravity(17);
                                textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q5, false));
                                textView2.setTextSize(1, 14.0f);
                                textView2.setAlpha(0.0f);
                                textView2.setScaleX(0.5f);
                                textView2.setScaleY(0.5f);
                                frameLayout2.addView(textView2, g7.e6.c(48.0f, -1));
                                mh0Var.addView(nh0Var, g7.e6.e(-1, -2, 51));
                                pc0Var.N = qh0Var;
                                ((FrameLayout) pc0Var.fragmentView).addView(qh0Var, g7.e6.c(-1.0f, -1));
                                org.telegram.ui.Components.qh0 qh0Var2 = pc0Var.N;
                                qh0Var2.r = false;
                                AnimatorSet animatorSet = qh0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    qh0Var2.s = null;
                                }
                                org.telegram.ui.Components.mh0 mh0Var2 = qh0Var2.v;
                                mh0Var2.measure(View.MeasureSpec.makeMeasureSpec((qh0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (qh0Var2.r) {
                                    z11 = true;
                                } else {
                                    mh0Var2.setVisibility(0);
                                    if (qh0Var2.w) {
                                        qh0Var2.setLayerType(2, null);
                                    }
                                    mh0Var2.setTranslationY(mh0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    qh0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(mh0Var2, (Property<org.telegram.ui.Components.mh0, Float>) View.TRANSLATION_Y, 0.0f));
                                    qh0Var2.s.setDuration(400L);
                                    qh0Var2.s.setStartDelay(20L);
                                    qh0Var2.s.setInterpolator(qh0Var2.B);
                                    z11 = true;
                                    qh0Var2.s.addListener(new org.telegram.ui.Components.ph0(qh0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    qh0Var2.s.start();
                                }
                                qh0Var2.c(z11);
                                break;
                            }
                        }
                        break;
                    default:
                        pc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = pc0Var.x0.messageOwner.media.geo;
                            double d9 = geoPoint.lat;
                            double d92 = geoPoint._long;
                            pc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d9 + "," + d92 + "?q=" + d9 + "," + d92)));
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                }
            }
        });
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(17);
        this.b.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.b.setTextSize(1, 15.0f);
        this.b.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.resourceProvider));
        this.b.setTypeface(AndroidUtilities.bold());
        this.b.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.b.setText(LocaleController.getString(R.string.LocationsShowAll));
        this.b.setBackground(org.telegram.ui.ActionBar.f6.Z(getThemedColor(i17), getThemedColor(i18), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        FrameLayout.LayoutParams d9 = g7.e6.d(-2, 38.0f, 81, 12.0f, 0.0f, 12.0f, 12.0f);
        d9.bottomMargin = (layoutParams.height - rect.top) + d9.bottomMargin;
        this.O.addView(this.b, d9);
        g7.g6.a(this.b);
        final int i22 = 3;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ub0
            public final /* synthetic */ pc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11;
                int i152 = i22;
                pc0 pc0Var = this.b;
                int i162 = 1;
                switch (i152) {
                    case 0:
                        pc0Var.x0(false);
                        pc0Var.P.H(null, pc0Var.t0, true);
                        pc0Var.z0 = true;
                        pc0Var.w0();
                        break;
                    case 1:
                        pc0Var.d.M(null, null);
                        break;
                    case 2:
                        pc0.T(pc0Var);
                        break;
                    case 3:
                        pc0Var.e0 = -1L;
                        pc0Var.y0 = true;
                        if (pc0Var.i0()) {
                            pc0Var.f0 = true;
                            pc0Var.y0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (pc0Var.getParentActivity() != null && pc0Var.s0 != null && pc0Var.c0() && pc0Var.E != null) {
                            kh.x3 x3Var = pc0Var.y;
                            if (x3Var != null) {
                                x3Var.e(true);
                            }
                            int i172 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = pc0Var.getLocationController().getSharingLocationInfo(pc0Var.a0);
                            if (pc0Var.C) {
                                pc0Var.B[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                pc0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = pc0Var.K;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    pc0Var.K = null;
                                }
                                pc0Var.C = true;
                                pc0Var.l0().k(0L, 25, 0, null, new xb0(pc0Var, i162), new x20(21, pc0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = pc0Var.K;
                                if (iCircle2 == null) {
                                    pc0Var.d0(500);
                                } else {
                                    pc0Var.L = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(pc0Var.a0) ? pc0Var.getMessagesController().getUser(Long.valueOf(pc0Var.a0)) : null;
                                Activity parentActivity = pc0Var.getParentActivity();
                                vb0 vb0Var = new vb0(pc0Var, i172);
                                yr yrVar = new yr(23, pc0Var, user);
                                xb0 xb0Var = new xb0(pc0Var, 2);
                                org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(parentActivity);
                                qh0Var.a = null;
                                qh0Var.d = -1;
                                qh0Var.e = false;
                                qh0Var.f = false;
                                qh0Var.h = null;
                                qh0Var.n = new Rect();
                                new Paint();
                                qh0Var.w = true;
                                qh0Var.B = org.telegram.ui.Components.gr.h;
                                qh0Var.setWillNotDraw(false);
                                qh0Var.M = xb0Var;
                                qh0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false), PorterDuff.Mode.MULTIPLY));
                                mutate2.getPadding(rect2);
                                int i182 = rect2.left;
                                qh0Var.x = i182;
                                org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(qh0Var.getContext());
                                qh0Var.v = mh0Var;
                                mh0Var.setBackgroundDrawable(mutate2);
                                mh0Var.setPadding(i182, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i182, 0);
                                mh0Var.setVisibility(4);
                                qh0Var.addView(mh0Var, 0, g7.e6.e(-1, -2, 80));
                                qh0Var.K = LocaleController.getUseImperialSystemType();
                                qh0Var.I = user;
                                qh0Var.E = vb0Var;
                                org.telegram.ui.Components.bc0 bc0Var = new org.telegram.ui.Components.bc0(parentActivity, null);
                                qh0Var.C = bc0Var;
                                bc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                bc0Var.setItemCount(5);
                                org.telegram.ui.Components.bc0 bc0Var2 = new org.telegram.ui.Components.bc0(parentActivity, null);
                                qh0Var.D = bc0Var2;
                                bc0Var2.setItemCount(5);
                                bc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(qh0Var, parentActivity);
                                qh0Var.L = nh0Var;
                                nh0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                nh0Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView2 = new TextView(parentActivity);
                                textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.l0.q(textView2, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false), 1, 20.0f);
                                frameLayout.addView(textView2, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView2.setOnTouchListener(new jh.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                nh0Var.addView(linearLayout, g7.e6.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView22 = new TextView(parentActivity);
                                qh0Var.G = textView22;
                                org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(parentActivity);
                                qh0Var.F = oh0Var;
                                linearLayout.addView(bc0Var, g7.e6.l(0.5f, 0, 270));
                                bc0Var.setFormatter(new org.telegram.ui.Components.lh0(qh0Var, 0));
                                bc0Var.setMinValue(0);
                                bc0Var.setMaxValue(10);
                                bc0Var.setWrapSelectorWheel(false);
                                bc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.lh0 lh0Var = new org.telegram.ui.Components.lh0(qh0Var, 1);
                                bc0Var.setOnValueChangedListener(lh0Var);
                                bc0Var2.setMinValue(0);
                                bc0Var2.setMaxValue(10);
                                bc0Var2.setWrapSelectorWheel(false);
                                bc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(bc0Var2, g7.e6.l(0.5f, 0, 270));
                                bc0Var2.setFormatter(new org.telegram.ui.Components.lh0(qh0Var, 2));
                                bc0Var2.setOnValueChangedListener(lh0Var);
                                bc0Var.setValue(0);
                                bc0Var2.setValue(6);
                                nh0Var.addView(frameLayout2, g7.e6.t(-1, 48, 83, 16, 15, 16, 16));
                                oh0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                oh0Var.setGravity(17);
                                oh0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
                                oh0Var.setTextSize(1, 14.0f);
                                oh0Var.setMaxLines(2);
                                oh0Var.setTypeface(AndroidUtilities.bold());
                                oh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.v5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.Oh));
                                frameLayout2.addView(oh0Var, g7.e6.c(48.0f, -1));
                                oh0Var.setOnClickListener(new org.telegram.ui.Components.s2(28, qh0Var, yrVar));
                                textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView22.setGravity(17);
                                textView22.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q5, false));
                                textView22.setTextSize(1, 14.0f);
                                textView22.setAlpha(0.0f);
                                textView22.setScaleX(0.5f);
                                textView22.setScaleY(0.5f);
                                frameLayout2.addView(textView22, g7.e6.c(48.0f, -1));
                                mh0Var.addView(nh0Var, g7.e6.e(-1, -2, 51));
                                pc0Var.N = qh0Var;
                                ((FrameLayout) pc0Var.fragmentView).addView(qh0Var, g7.e6.c(-1.0f, -1));
                                org.telegram.ui.Components.qh0 qh0Var2 = pc0Var.N;
                                qh0Var2.r = false;
                                AnimatorSet animatorSet = qh0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    qh0Var2.s = null;
                                }
                                org.telegram.ui.Components.mh0 mh0Var2 = qh0Var2.v;
                                mh0Var2.measure(View.MeasureSpec.makeMeasureSpec((qh0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (qh0Var2.r) {
                                    z11 = true;
                                } else {
                                    mh0Var2.setVisibility(0);
                                    if (qh0Var2.w) {
                                        qh0Var2.setLayerType(2, null);
                                    }
                                    mh0Var2.setTranslationY(mh0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    qh0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(mh0Var2, (Property<org.telegram.ui.Components.mh0, Float>) View.TRANSLATION_Y, 0.0f));
                                    qh0Var2.s.setDuration(400L);
                                    qh0Var2.s.setStartDelay(20L);
                                    qh0Var2.s.setInterpolator(qh0Var2.B);
                                    z11 = true;
                                    qh0Var2.s.addListener(new org.telegram.ui.Components.ph0(qh0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    qh0Var2.s.start();
                                }
                                qh0Var2.c(z11);
                                break;
                            }
                        }
                        break;
                    default:
                        pc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = pc0Var.x0.messageOwner.media.geo;
                            double d92 = geoPoint.lat;
                            double d922 = geoPoint._long;
                            pc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d92 + "," + d922 + "?q=" + d92 + "," + d922)));
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                }
            }
        });
        y0(false, false);
        this.c = new ImageView(context);
        org.telegram.ui.Cells.z h04 = org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(40.0f), getThemedColor(i17), getThemedColor(i18));
        g7.g6.a(this.c);
        this.c.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.c.setOutlineProvider(q1Var);
        this.c.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.c.setBackgroundDrawable(h04);
        this.c.setScaleType(scaleType);
        this.c.setContentDescription(LocaleController.getString(R.string.AccDescrLocationNotify));
        this.O.addView(this.c, g7.e6.d(40, 40.0f, 53, 0.0f, 62.0f, 12.0f, 0.0f));
        final int i23 = 4;
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ub0
            public final /* synthetic */ pc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11;
                int i152 = i23;
                pc0 pc0Var = this.b;
                int i162 = 1;
                switch (i152) {
                    case 0:
                        pc0Var.x0(false);
                        pc0Var.P.H(null, pc0Var.t0, true);
                        pc0Var.z0 = true;
                        pc0Var.w0();
                        break;
                    case 1:
                        pc0Var.d.M(null, null);
                        break;
                    case 2:
                        pc0.T(pc0Var);
                        break;
                    case 3:
                        pc0Var.e0 = -1L;
                        pc0Var.y0 = true;
                        if (pc0Var.i0()) {
                            pc0Var.f0 = true;
                            pc0Var.y0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (pc0Var.getParentActivity() != null && pc0Var.s0 != null && pc0Var.c0() && pc0Var.E != null) {
                            kh.x3 x3Var = pc0Var.y;
                            if (x3Var != null) {
                                x3Var.e(true);
                            }
                            int i172 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = pc0Var.getLocationController().getSharingLocationInfo(pc0Var.a0);
                            if (pc0Var.C) {
                                pc0Var.B[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                pc0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = pc0Var.K;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    pc0Var.K = null;
                                }
                                pc0Var.C = true;
                                pc0Var.l0().k(0L, 25, 0, null, new xb0(pc0Var, i162), new x20(21, pc0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = pc0Var.K;
                                if (iCircle2 == null) {
                                    pc0Var.d0(500);
                                } else {
                                    pc0Var.L = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(pc0Var.a0) ? pc0Var.getMessagesController().getUser(Long.valueOf(pc0Var.a0)) : null;
                                Activity parentActivity = pc0Var.getParentActivity();
                                vb0 vb0Var = new vb0(pc0Var, i172);
                                yr yrVar = new yr(23, pc0Var, user);
                                xb0 xb0Var = new xb0(pc0Var, 2);
                                org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(parentActivity);
                                qh0Var.a = null;
                                qh0Var.d = -1;
                                qh0Var.e = false;
                                qh0Var.f = false;
                                qh0Var.h = null;
                                qh0Var.n = new Rect();
                                new Paint();
                                qh0Var.w = true;
                                qh0Var.B = org.telegram.ui.Components.gr.h;
                                qh0Var.setWillNotDraw(false);
                                qh0Var.M = xb0Var;
                                qh0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false), PorterDuff.Mode.MULTIPLY));
                                mutate2.getPadding(rect2);
                                int i182 = rect2.left;
                                qh0Var.x = i182;
                                org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(qh0Var.getContext());
                                qh0Var.v = mh0Var;
                                mh0Var.setBackgroundDrawable(mutate2);
                                mh0Var.setPadding(i182, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i182, 0);
                                mh0Var.setVisibility(4);
                                qh0Var.addView(mh0Var, 0, g7.e6.e(-1, -2, 80));
                                qh0Var.K = LocaleController.getUseImperialSystemType();
                                qh0Var.I = user;
                                qh0Var.E = vb0Var;
                                org.telegram.ui.Components.bc0 bc0Var = new org.telegram.ui.Components.bc0(parentActivity, null);
                                qh0Var.C = bc0Var;
                                bc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                bc0Var.setItemCount(5);
                                org.telegram.ui.Components.bc0 bc0Var2 = new org.telegram.ui.Components.bc0(parentActivity, null);
                                qh0Var.D = bc0Var2;
                                bc0Var2.setItemCount(5);
                                bc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(qh0Var, parentActivity);
                                qh0Var.L = nh0Var;
                                nh0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                nh0Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView2 = new TextView(parentActivity);
                                textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.l0.q(textView2, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false), 1, 20.0f);
                                frameLayout.addView(textView2, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView2.setOnTouchListener(new jh.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                nh0Var.addView(linearLayout, g7.e6.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView22 = new TextView(parentActivity);
                                qh0Var.G = textView22;
                                org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(parentActivity);
                                qh0Var.F = oh0Var;
                                linearLayout.addView(bc0Var, g7.e6.l(0.5f, 0, 270));
                                bc0Var.setFormatter(new org.telegram.ui.Components.lh0(qh0Var, 0));
                                bc0Var.setMinValue(0);
                                bc0Var.setMaxValue(10);
                                bc0Var.setWrapSelectorWheel(false);
                                bc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.lh0 lh0Var = new org.telegram.ui.Components.lh0(qh0Var, 1);
                                bc0Var.setOnValueChangedListener(lh0Var);
                                bc0Var2.setMinValue(0);
                                bc0Var2.setMaxValue(10);
                                bc0Var2.setWrapSelectorWheel(false);
                                bc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(bc0Var2, g7.e6.l(0.5f, 0, 270));
                                bc0Var2.setFormatter(new org.telegram.ui.Components.lh0(qh0Var, 2));
                                bc0Var2.setOnValueChangedListener(lh0Var);
                                bc0Var.setValue(0);
                                bc0Var2.setValue(6);
                                nh0Var.addView(frameLayout2, g7.e6.t(-1, 48, 83, 16, 15, 16, 16));
                                oh0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                oh0Var.setGravity(17);
                                oh0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
                                oh0Var.setTextSize(1, 14.0f);
                                oh0Var.setMaxLines(2);
                                oh0Var.setTypeface(AndroidUtilities.bold());
                                oh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.v5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.Oh));
                                frameLayout2.addView(oh0Var, g7.e6.c(48.0f, -1));
                                oh0Var.setOnClickListener(new org.telegram.ui.Components.s2(28, qh0Var, yrVar));
                                textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView22.setGravity(17);
                                textView22.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q5, false));
                                textView22.setTextSize(1, 14.0f);
                                textView22.setAlpha(0.0f);
                                textView22.setScaleX(0.5f);
                                textView22.setScaleY(0.5f);
                                frameLayout2.addView(textView22, g7.e6.c(48.0f, -1));
                                mh0Var.addView(nh0Var, g7.e6.e(-1, -2, 51));
                                pc0Var.N = qh0Var;
                                ((FrameLayout) pc0Var.fragmentView).addView(qh0Var, g7.e6.c(-1.0f, -1));
                                org.telegram.ui.Components.qh0 qh0Var2 = pc0Var.N;
                                qh0Var2.r = false;
                                AnimatorSet animatorSet = qh0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    qh0Var2.s = null;
                                }
                                org.telegram.ui.Components.mh0 mh0Var2 = qh0Var2.v;
                                mh0Var2.measure(View.MeasureSpec.makeMeasureSpec((qh0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (qh0Var2.r) {
                                    z11 = true;
                                } else {
                                    mh0Var2.setVisibility(0);
                                    if (qh0Var2.w) {
                                        qh0Var2.setLayerType(2, null);
                                    }
                                    mh0Var2.setTranslationY(mh0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    qh0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(mh0Var2, (Property<org.telegram.ui.Components.mh0, Float>) View.TRANSLATION_Y, 0.0f));
                                    qh0Var2.s.setDuration(400L);
                                    qh0Var2.s.setStartDelay(20L);
                                    qh0Var2.s.setInterpolator(qh0Var2.B);
                                    z11 = true;
                                    qh0Var2.s.addListener(new org.telegram.ui.Components.ph0(qh0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    qh0Var2.s.start();
                                }
                                qh0Var2.c(z11);
                                break;
                            }
                        }
                        break;
                    default:
                        pc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = pc0Var.x0.messageOwner.media.geo;
                            double d92 = geoPoint.lat;
                            double d922 = geoPoint._long;
                            pc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d92 + "," + d922 + "?q=" + d92 + "," + d922)));
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                }
            }
        });
        TLRPC.Chat chat = DialogObject.isChatDialog(this.a0) ? getMessagesController().getChat(Long.valueOf(-this.a0)) : null;
        MessageObject messageObject3 = this.x0;
        if (messageObject3 == null || !messageObject3.isLiveLocation() || this.x0.isExpiredLiveLocation(getConnectionsManager().getCurrentTime()) || (ChatObject.isChannel(chat) && !chat.megagroup)) {
            this.c.setVisibility(8);
            this.c.setImageResource(R.drawable.msg_location_alert);
        } else {
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.a0);
            if (sharingLocationInfo == null || sharingLocationInfo.proximityMeters <= 0) {
                if (DialogObject.isUserDialog(this.a0) && this.x0.getFromChatId() == getUserConfig().getClientUserId()) {
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
        kh.x3 x3Var = new kh.x3(context, 1);
        this.y = x3Var;
        x3Var.setLayerType(2, null);
        kh.x3 x3Var2 = this.y;
        x3Var2.d = 4000L;
        x3Var2.m(1.0f, -25.0f);
        this.y.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.O.addView(this.y, g7.e6.d(-1, -2.0f, 51, 8.0f, 106.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.f.setGravity(1);
        this.f.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        this.f.setVisibility(8);
        nc0Var.addView(this.f, g7.e6.c(-1.0f, -1));
        this.f.setOnTouchListener(new jh.d(2));
        ImageView imageView3 = new ImageView(context);
        this.h = imageView3;
        imageView3.setImageResource(R.drawable.location_empty);
        this.h.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.W5), mode));
        this.f.addView(this.h, g7.e6.n(-2, -2));
        TextView textView2 = new TextView(context);
        this.n = textView2;
        int i24 = org.telegram.ui.ActionBar.f6.X5;
        textView2.setTextColor(getThemedColor(i24));
        this.n.setGravity(17);
        this.n.setTypeface(AndroidUtilities.bold());
        this.n.setTextSize(1, 17.0f);
        this.n.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView h = j3.r0.h(this.f, this.n, g7.e6.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.r = h;
        h.setTextColor(getThemedColor(i24));
        this.r.setGravity(17);
        this.r.setTextSize(1, 15.0f);
        this.r.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.f.addView(this.r, g7.e6.t(-2, -2, 17, 0, 6, 0, 0));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.Q = wk0Var;
        dc0 dc0Var2 = new dc0(this, context, this.C0, this.a0, getResourceProvider(), this.A, i13 == 8);
        this.P = dc0Var2;
        wk0Var.setAdapter(dc0Var2);
        org.telegram.ui.Components.wk0 wk0Var2 = this.Q;
        f2.m0 m0Var2 = new f2.m0(1, false);
        this.U = m0Var2;
        wk0Var2.setLayoutManager(m0Var2);
        if (this.I0 != null) {
            this.H0 = new org.telegram.ui.Cells.v3(context, this.resourceProvider);
            fc0 fc0Var = new fc0(this, context, new org.telegram.ui.Components.wt0(this), this, new ec0(this), getResourceProvider());
            this.G0 = fc0Var;
            fc0Var.setBackgroundColor(getThemedColor(i11));
            this.G0.addView(this.H0, g7.e6.e(-1, 32, 55));
            this.P.d0 = this.G0;
            this.Q.setOverScrollMode(2);
            f2.n nVar = new f2.n();
            z10 = false;
            nVar.m = false;
            nVar.C = false;
            nVar.o(org.telegram.ui.Components.gr.h);
            nVar.n(350L);
            this.Q.setItemAnimator(nVar);
        } else {
            z10 = false;
        }
        this.P.O(this.Y, z10);
        this.P.getClass();
        this.Q.setVerticalScrollBarEnabled(z10);
        nc0Var.addView(this.Q, g7.e6.e(-1, -1, 51));
        MessageObject messageObject4 = this.x0;
        if (messageObject4 != null && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
            dc0 dc0Var3 = this.P;
            dc0Var3.M = this.x0.messageOwner.media.address;
            dc0Var3.Q();
        }
        this.Q.setOnScrollListener(new gc0(this));
        ((f2.n) this.Q.getItemAnimator()).C = false;
        this.Q.setOnItemLongClickListener(new yr(21, this, context));
        this.Q.setOnItemClickListener(new i(this, 16));
        dc0 dc0Var4 = this.P;
        long j10 = this.a0;
        vb0 vb0Var = new vb0(this, 5);
        dc0Var4.D = j10;
        dc0Var4.y = vb0Var;
        dc0Var4.P(this.D0);
        nc0Var.addView(this.O, g7.e6.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.G = onCreateMapView;
        onCreateMapView.getView().setAlpha(0.0f);
        this.G.setOnDispatchTouchEventInterceptor(new vb0(this, 6));
        this.G.setOnInterceptTouchEventInterceptor(new vb0(this, 7));
        this.G.setOnLayoutListener(new xb0(this, 5));
        new Thread(new yb0(this, this.G, 1)).start();
        MessageObject messageObject5 = this.x0;
        if (messageObject5 == null && this.v0 == null) {
            i9 = i13;
            if (chat != null && i9 == 4 && this.a0 != 0) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackgroundResource(R.drawable.livepin);
                this.O.addView(frameLayout, g7.e6.e(62, 76, 49));
                org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
                o9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
                o9Var.e(chat, new org.telegram.ui.Components.z8(chat));
                frameLayout.addView(o9Var, g7.e6.d(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                this.T = frameLayout;
                frameLayout.setTag(1);
            }
            if (this.T == null) {
                ImageView imageView4 = new ImageView(context);
                imageView4.setImageResource(R.drawable.map_pin2);
                this.O.addView(imageView4, g7.e6.e(28, 48, 49));
                this.T = imageView4;
            }
            org.telegram.ui.Components.wk0 wk0Var3 = new org.telegram.ui.Components.wk0(context, null);
            this.R = wk0Var3;
            wk0Var3.setVisibility(8);
            i10 = 0;
            this.R.setLayoutManager(new f2.m0(1, false));
            ic0 ic0Var2 = new ic0(this, context, getResourceProvider(), i9 == 8);
            this.S = ic0Var2;
            vb0 vb0Var2 = new vb0(this, 8);
            ic0Var2.D = 0L;
            ic0Var2.y = vb0Var2;
            nc0Var.addView(this.R, g7.e6.e(-1, -1, 51));
            this.R.setOnScrollListener(new l3(this, 18));
            this.R.setOnItemClickListener(new bg.b1(20, this, n10));
        } else {
            i9 = i13;
            i10 = 0;
            if ((messageObject5 != null && !messageObject5.isLiveLocation()) || this.v0 != null) {
                TLRPC.TL_channelLocation tL_channelLocation2 = this.v0;
                if (tL_channelLocation2 != null) {
                    this.P.T = tL_channelLocation2;
                } else {
                    MessageObject messageObject6 = this.x0;
                    if (messageObject6 != null) {
                        dc0 dc0Var5 = this.P;
                        dc0Var5.S = messageObject6;
                        dc0Var5.l();
                    }
                }
            }
        }
        MessageObject messageObject7 = this.x0;
        if (messageObject7 != null && i9 == 6) {
            dc0 dc0Var6 = this.P;
            dc0Var6.S = messageObject7;
            dc0Var6.l();
        }
        while (i10 < 2) {
            UndoView undoView = new UndoView(context);
            UndoView[] undoViewArr = this.B;
            undoViewArr[i10] = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            undoViewArr[i10].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.O.addView(undoViewArr[i10], g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            i10++;
        }
        ih.b3 b3Var = new ih.b3(this, context, rect);
        this.v = b3Var;
        b3Var.setTranslationZ(AndroidUtilities.dp(6.0f));
        this.O.addView(this.v, layoutParams);
        if (this.x0 == null && this.v0 == null && this.w0 != null) {
            this.y0 = true;
            ImageView imageView5 = this.a;
            int i25 = org.telegram.ui.ActionBar.f6.ui;
            imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(i25), PorterDuff.Mode.MULTIPLY));
            this.a.setTag(Integer.valueOf(i25));
        }
        nc0Var.addView(this.actionBar);
        A0();
        return this.fragmentView;
    }

    public final void d0(int i9) {
        if (this.E == null) {
            return;
        }
        List<IMapsProvider.PatternItem> asList = Arrays.asList(new IMapsProvider.PatternItem.Gap(20), new IMapsProvider.PatternItem.Dash(20));
        IMapsProvider.ICircleOptions onCreateCircleOptions = ApplicationLoader.getMapsProvider().onCreateCircleOptions();
        onCreateCircleOptions.center(new IMapsProvider.LatLng(this.s0.getLatitude(), this.s0.getLongitude()));
        onCreateCircleOptions.radius(i9);
        if (m0()) {
            onCreateCircleOptions.strokeColor(-1771658281);
            onCreateCircleOptions.fillColor(476488663);
        } else {
            onCreateCircleOptions.strokeColor(-1774024971);
            onCreateCircleOptions.fillColor(474121973);
        }
        onCreateCircleOptions.strokePattern(asList);
        onCreateCircleOptions.strokeWidth(2);
        this.K = this.E.addCircle(onCreateCircleOptions);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        dc0 dc0Var;
        dc0 dc0Var2;
        if (i9 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
            return;
        }
        if (i9 == NotificationCenter.locationPermissionGranted) {
            this.Y = false;
            dc0 dc0Var3 = this.P;
            if (dc0Var3 != null) {
                dc0Var3.O(false, false);
            }
            IMapsProvider.IMap iMap = this.E;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            }
            return;
        }
        if (i9 == NotificationCenter.locationPermissionDenied) {
            this.Y = true;
            dc0 dc0Var4 = this.P;
            if (dc0Var4 != null) {
                dc0Var4.O(true, false);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.liveLocationsChanged) {
            dc0 dc0Var5 = this.P;
            if (dc0Var5 != null) {
                dc0Var5.l();
            }
            B0();
            return;
        }
        if (i9 == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue() || ((Long) objArr[0]).longValue() != this.a0 || this.x0 == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[1];
            boolean z10 = false;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i11);
                if (messageObject.isLiveLocation()) {
                    b0(messageObject.messageOwner);
                    z10 = true;
                } else if ((messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) && DialogObject.isUserDialog(messageObject.getDialogId())) {
                    this.c.setImageResource(R.drawable.msg_location_alert);
                    IMapsProvider.ICircle iCircle = this.K;
                    if (iCircle != null) {
                        iCircle.remove();
                        this.K = null;
                    }
                }
            }
            if (!z10 || (dc0Var2 = this.P) == null) {
                return;
            }
            dc0Var2.N(this.c0);
            return;
        }
        if (i9 == NotificationCenter.replaceMessagesObjects) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue != this.a0 || this.x0 == null) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[1];
            boolean z11 = false;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i12);
                if (messageObject2.isLiveLocation()) {
                    TLRPC.Message message = messageObject2.messageOwner;
                    jc0 jc0Var = (jc0) this.d0.f(message.from_id != null ? MessageObject.getFromChatId(message) : MessageObject.getDialogId(message));
                    if (jc0Var != null) {
                        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(longValue);
                        if (sharingLocationInfo == null || sharingLocationInfo.mid != messageObject2.getId()) {
                            TLRPC.Message message2 = messageObject2.messageOwner;
                            jc0Var.b = message2;
                            TLRPC.GeoPoint geoPoint = message2.media.geo;
                            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                            jc0Var.e.setPosition(latLng);
                            if (this.e0 == jc0Var.a) {
                                this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(jc0Var.e.getPosition()));
                            }
                            IMapsProvider.IMarker iMarker = jc0Var.f;
                            if (iMarker != null) {
                                iMarker.getPosition();
                                jc0Var.f.setPosition(latLng);
                                int i13 = messageObject2.messageOwner.media.heading;
                                if (i13 != 0) {
                                    jc0Var.f.setRotation(i13);
                                    if (!jc0Var.g) {
                                        jc0Var.f.setIcon(R.drawable.map_pin_cone2);
                                        jc0Var.g = true;
                                    }
                                } else if (jc0Var.g) {
                                    jc0Var.f.setRotation(0);
                                    jc0Var.f.setIcon(R.drawable.map_pin_circle);
                                    jc0Var.g = false;
                                }
                            }
                        }
                        z11 = true;
                    }
                }
            }
            if (z11 && (dc0Var = this.P) != null) {
                dc0Var.l();
                org.telegram.ui.Components.qh0 qh0Var = this.N;
                if (qh0Var != null) {
                    qh0Var.c(true);
                }
            }
            if (z11) {
                B0();
            }
        }
    }

    public final Bitmap e0(int i9) {
        Bitmap[] bitmapArr = this.M0;
        Bitmap bitmap = bitmapArr[i9 % 7];
        if (bitmap != null) {
            return bitmap;
        }
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            paint.setColor(org.telegram.ui.Cells.u4.a(i9));
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i9 % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th) {
            FileLog.e(th);
            return null;
        }
    }

    public final Bitmap f0(jc0 jc0Var) {
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
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
                TLRPC.User user = jc0Var.c;
                if (user != null) {
                    z8Var.m(this.currentAccount, user);
                } else {
                    TLRPC.Chat chat = jc0Var.d;
                    if (chat != null) {
                        z8Var.k(this.currentAccount, chat);
                    }
                }
                canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                z8Var.setBounds(0, 0, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
                z8Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = jc0Var.h;
                Bitmap bitmap2 = (imageReceiver == null || !imageReceiver.hasImageLoaded()) ? null : jc0Var.h.getBitmap();
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
            } catch (Throwable th) {
                th = th;
                bitmap = createBitmap;
                FileLog.e(th);
                return bitmap;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean finishFragment(boolean z10) {
        if (p0()) {
            return false;
        }
        return super.finishFragment(z10);
    }

    public boolean g0() {
        return this instanceof zm;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 21);
        int i9 = 0;
        while (true) {
            UndoView[] undoViewArr = this.B;
            if (i9 >= undoViewArr.length) {
                break;
            }
            UndoView undoView = undoViewArr[i9];
            int i10 = org.telegram.ui.ActionBar.f6.Fi;
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoView, 32, null, null, null, null, i10));
            int i11 = org.telegram.ui.ActionBar.f6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i9], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i9], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i11));
            int i12 = org.telegram.ui.ActionBar.f6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i9], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i9], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, -1, null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i9], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i9], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i9], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "BODY", i10));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i9], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big", i10));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i9], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big 3", i12));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i9], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Small", i12));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i9], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Main", i12));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i9], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Top", i12));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i9], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Line", i12));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i9], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Big", i12));
            arrayList.add(new org.telegram.ui.ActionBar.h6(undoViewArr[i9], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Small", i12));
            i9++;
        }
        View view = this.fragmentView;
        int i13 = org.telegram.ui.ActionBar.f6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 1, null, null, null, eVar, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 32768, null, null, null, null, i13));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i14 = org.telegram.ui.ActionBar.f6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 64, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_27, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.f6.Vd));
        org.telegram.ui.ActionBar.w0 w0Var = this.w;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var != null ? w0Var.getSearchField() : null, 16777216, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_31, null, null, null, eVar, org.telegram.ui.ActionBar.f6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_30, null, null, null, eVar, org.telegram.ui.ActionBar.f6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1073741832, null, null, null, eVar, org.telegram.ui.ActionBar.f6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        ImageView imageView = this.h;
        int i15 = org.telegram.ui.ActionBar.f6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 8, null, null, null, null, i15));
        TextView textView = this.n;
        int i16 = org.telegram.ui.ActionBar.f6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(textView, 4, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.r, 4, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ii));
        ImageView imageView2 = this.a;
        int i17 = org.telegram.ui.ActionBar.f6.ui;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView2, 262152, null, null, null, null, i17));
        ImageView imageView3 = this.a;
        int i18 = org.telegram.ui.ActionBar.f6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView3, 262152, null, null, null, null, i18));
        ImageView imageView4 = this.a;
        int i19 = org.telegram.ui.ActionBar.f6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView4, 32, null, null, null, null, i19));
        ImageView imageView5 = this.a;
        int i20 = org.telegram.ui.ActionBar.f6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView5, 65568, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, eVar, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 32, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 65568, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, null, null, null, eVar, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 32, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 65568, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 4, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 32, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 65568, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, org.telegram.ui.ActionBar.f6.r0, eVar, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.si));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 393216, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 393216, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 393248, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 393248, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.pi));
        int i21 = org.telegram.ui.ActionBar.f6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 0, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i21));
        int i22 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.R, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.R, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.R, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 0, new Class[]{org.telegram.ui.Cells.u7.class}, new String[]{"nameTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 0, new Class[]{org.telegram.ui.Cells.u7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 8, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView2"}, null, null, -1, null, i16));
        return arrayList;
    }

    public final void h0(ArrayList arrayList) {
        IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = this.b0 ? ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder() : null;
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i9);
            int i10 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i11 = messageMedia.period;
            if (i10 + i11 > currentTime || i11 == Integer.MAX_VALUE) {
                if (onCreateLatLngBoundsBuilder != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    onCreateLatLngBoundsBuilder.include(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                }
                b0(message);
                if (this.c.getVisibility() != 8 && MessageObject.getFromChatId(message) != getUserConfig().getClientUserId()) {
                    this.c.setVisibility(0);
                    this.D = true;
                    this.c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new bc0(this, 0)).start();
                }
            }
        }
        if (onCreateLatLngBoundsBuilder != null) {
            if (this.b0) {
                this.Q.v0(0, AndroidUtilities.dp(99.0f), null);
            }
            this.b0 = false;
            this.P.N(this.c0);
            if (this.x0.isLiveLocation()) {
                try {
                    IMapsProvider.LatLng center = onCreateLatLngBoundsBuilder.build().getCenter();
                    IMapsProvider.LatLng o02 = o0(center, 100.0d, 100.0d);
                    onCreateLatLngBoundsBuilder.include(o0(center, -100.0d, -100.0d));
                    onCreateLatLngBoundsBuilder.include(o02);
                    IMapsProvider.ILatLngBounds build = onCreateLatLngBoundsBuilder.build();
                    if (arrayList.size() > 1) {
                        try {
                            IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build, AndroidUtilities.dp(113.0f));
                            this.F = newCameraUpdateLatLngBounds;
                            this.E.moveCamera(newCameraUpdateLatLngBounds);
                            this.F = null;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final boolean i0() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i9;
        if (this.E != null) {
            ArrayList arrayList = new ArrayList();
            int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
            ArrayList arrayList2 = this.c0;
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                jc0 jc0Var = (jc0) arrayList2.get(i10);
                IMapsProvider.IMarker iMarker = jc0Var.e;
                if (iMarker != null && (message = jc0Var.b) != null && (messageMedia = message.media) != null && ((i9 = messageMedia.period) == Integer.MAX_VALUE || message.date + i9 > currentTime)) {
                    arrayList.add(iMarker.getPosition());
                }
            }
            boolean z10 = this.d0.f(getUserConfig().getClientUserId()) != null;
            Location location = this.s0;
            if (location != null && !z10) {
                arrayList.add(new IMapsProvider.LatLng(location.getLatitude(), this.s0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    double d9 = Double.MAX_VALUE;
                    double d10 = Double.MAX_VALUE;
                    int i11 = 0;
                    double d11 = -1.7976931348623157E308d;
                    while (i11 < size2) {
                        IMapsProvider.LatLng latLng = (IMapsProvider.LatLng) arrayList.get(i11);
                        onCreateLatLngBoundsBuilder.include(latLng);
                        int i12 = size2;
                        double d12 = latLng.latitude;
                        if (d12 < d9) {
                            d9 = d12;
                        }
                        if (d12 > d) {
                            d = d12;
                        }
                        double d13 = latLng.longitude;
                        if (d13 < d10) {
                            d10 = d13;
                        }
                        if (d13 > d11) {
                            d11 = d13;
                        }
                        i11++;
                        size2 = i12;
                    }
                    IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng((d9 + d) / 2.0d, (d10 + d11) / 2.0d);
                    double radians = Math.toRadians(d - d9) * 6366198.0d;
                    double radians2 = Math.toRadians(d11 - d10) * 6366198.0d * Math.cos(Math.toRadians(latLng2.latitude));
                    if (radians < 30.0d || radians2 < 30.0d) {
                        onCreateLatLngBoundsBuilder.include(o0(latLng2, 15.0d, 15.0d));
                        onCreateLatLngBoundsBuilder.include(o0(latLng2, -15.0d, -15.0d));
                    }
                    this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(onCreateLatLngBoundsBuilder.build(), AndroidUtilities.dp(60.0f)), 500, null);
                    return true;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return false;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.f(getThemedColor(org.telegram.ui.ActionBar.f6.d6)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0(boolean z10) {
        FrameLayout.LayoutParams layoutParams;
        if (this.Q != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight == 0) {
                return;
            }
            int i9 = this.C0;
            if (i9 == 6) {
                this.D0 = org.telegram.messenger.l0.B(66.0f, measuredHeight, currentActionBarHeight);
            } else if (i9 == 2) {
                this.D0 = org.telegram.messenger.l0.B(73.0f, measuredHeight, currentActionBarHeight);
            } else {
                this.D0 = org.telegram.messenger.l0.B(66.0f, measuredHeight, currentActionBarHeight);
            }
            fc0 fc0Var = this.G0;
            if (fc0Var != null && fc0Var.c0(8) > 0) {
                this.D0 -= AndroidUtilities.dp(200.0f);
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            this.Q.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.O.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.D0;
            this.O.setLayoutParams(layoutParams3);
            org.telegram.ui.Components.wk0 wk0Var = this.R;
            if (wk0Var != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) wk0Var.getLayoutParams();
                layoutParams4.topMargin = currentActionBarHeight;
                this.R.setLayoutParams(layoutParams4);
            }
            this.P.P(this.D0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.G.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.D0;
                IMapsProvider.IMap iMap = this.E;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                this.G.getView().setLayoutParams(layoutParams5);
            }
            mc0 mc0Var = this.x;
            if (mc0Var != null && (layoutParams = (FrameLayout.LayoutParams) mc0Var.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.D0;
                this.x.setLayoutParams(layoutParams);
            }
            this.P.l();
            if (!z10) {
                z0(false);
                return;
            }
            int i10 = i9 == 3 ? 73 : (i9 == 1 || i9 == 2) ? 66 : 0;
            this.U.h1(0, -AndroidUtilities.dp(i10));
            z0(false);
            this.Q.post(new org.telegram.ui.Components.qd(this, i10, 16));
        }
    }

    public final boolean k0() {
        ArrayList arrayList = (ArrayList) getLocationController().locationsCache.f(this.x0.getDialogId());
        if (arrayList == null || !arrayList.isEmpty()) {
            arrayList = null;
        } else {
            h0(arrayList);
        }
        if (DialogObject.isChatDialog(this.a0)) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.a0));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long dialogId = this.x0.getDialogId();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(dialogId);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new ih.v5(this, dialogId, 6));
        return arrayList != null;
    }

    public final UndoView l0() {
        UndoView[] undoViewArr = this.B;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.e(2, true);
            this.O.removeView(undoViewArr[0]);
            this.O.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean m0() {
        return (getResourceProvider() == null && org.telegram.ui.ActionBar.f6.I.q()) || AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.f6.d6)) < 0.721f;
    }

    public final void n0() {
        SharedPreferences globalMainSettings;
        int i9;
        ImageView imageView = this.c;
        if (imageView == null || imageView.getVisibility() != 0 || this.D || (i9 = (globalMainSettings = MessagesController.getGlobalMainSettings()).getInt("proximityhint", 0)) >= 3) {
            return;
        }
        globalMainSettings.edit().putInt("proximityhint", i9 + 1).commit();
        if (DialogObject.isUserDialog(this.a0)) {
            this.y.t(LocaleController.formatString("ProximityTooltioUser", R.string.ProximityTooltioUser, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.a0)))));
        } else {
            this.y.t(LocaleController.getString(R.string.ProximityTooltioGroup));
        }
        this.y.v();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.qh0 qh0Var = this.N;
        if (qh0Var == null) {
            IMapsProvider.IMapView iMapView = this.G;
            if (iMapView == null || iMapView.getGlSurfaceView() == null || this.I) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                p0();
            }
        } else if (z10) {
            qh0Var.a();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.B[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        MessageObject messageObject = this.x0;
        if (messageObject == null || !messageObject.isLiveLocation()) {
            return true;
        }
        getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(this, NotificationCenter.replaceMessagesObjects);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.replaceMessagesObjects);
        try {
            IMapsProvider.IMap iMap = this.E;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            IMapsProvider.IMapView iMapView = this.G;
            if (iMapView != null) {
                iMapView.onDestroy();
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        UndoView undoView = this.B[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        dc0 dc0Var = this.P;
        if (dc0Var != null) {
            dc0Var.F();
        }
        ic0 ic0Var = this.S;
        if (ic0Var != null) {
            ic0Var.F();
        }
        xb0 xb0Var = this.F0;
        if (xb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(xb0Var);
            this.F0 = null;
        }
        ArrayList arrayList = this.c0;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            jc0 jc0Var = (jc0) arrayList.get(i9);
            ImageReceiver imageReceiver = jc0Var.h;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                jc0Var.h = null;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onLowMemory() {
        super.onLowMemory();
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView == null || !this.q0) {
            return;
        }
        iMapView.onLowMemory();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.q0) {
            try {
                iMapView.onPause();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        UndoView undoView = this.B[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.r0 = false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        if (i9 == 30) {
            r0(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.q0) {
            try {
                iMapView.onResume();
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        this.r0 = true;
        IMapsProvider.IMap iMap = this.E;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        j0(true);
        if (g0()) {
            this.l0 = false;
        } else if (this.l0 && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.l0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        xb0 xb0Var = this.F0;
        if (xb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(xb0Var);
            AndroidUtilities.runOnUIThread(this.F0, 5000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || z11) {
            return;
        }
        try {
            if (this.G.getView().getParent() instanceof ViewGroup) {
                ((ViewGroup) this.G.getView().getParent()).removeView(this.G.getView());
            }
        } catch (Exception unused) {
        }
        m0 m0Var = this.O;
        if (m0Var == null) {
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView(this.G.getView(), 0, g7.e6.e(-1, -1, 51));
                return;
            }
            return;
        }
        m0Var.addView(this.G.getView(), 0, g7.e6.e(-1, AndroidUtilities.dp(10.0f) + this.D0, 51));
        mc0 mc0Var = this.x;
        if (mc0Var != null) {
            try {
                if (mc0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.x.getParent()).removeView(this.x);
                }
            } catch (Exception unused2) {
            }
            this.O.addView(this.x, 1, g7.e6.e(-1, AndroidUtilities.dp(10.0f) + this.D0, 51));
        }
        z0(false);
        n0();
    }

    public final boolean p0() {
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView == null || iMapView.getGlSurfaceView() == null || this.I) {
            return false;
        }
        GLSurfaceView glSurfaceView = this.G.getGlSurfaceView();
        glSurfaceView.queueEvent(new x20(20, this, glSurfaceView));
        return true;
    }

    public final void q0(jc0 jc0Var) {
        double d;
        double d9;
        TLRPC.Message message;
        if (jc0Var == null || (message = jc0Var.b) == null) {
            MessageObject messageObject = this.x0;
            if (messageObject != null) {
                TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                d = geoPoint.lat;
                d9 = geoPoint._long;
            } else {
                TLRPC.GeoPoint geoPoint2 = this.v0.geo_point;
                d = geoPoint2.lat;
                d9 = geoPoint2._long;
            }
        } else {
            TLRPC.GeoPoint geoPoint3 = message.media.geo;
            d = geoPoint3.lat;
            d9 = geoPoint3._long;
        }
        String str = BuildVars.isHuaweiStoreApp() ? "mapapp://navigation" : "http://maps.google.com/maps";
        if (this.s0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.s0.getLatitude()), Double.valueOf(this.s0.getLongitude()), Double.valueOf(d), Double.valueOf(d9)))));
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d9)))));
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    public final void r0(final boolean z10) {
        Activity parentActivity;
        if (this.B0 == null || g0() || getParentActivity() == null || this.s0 == null || !c0()) {
            return;
        }
        if (this.m0 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
            this.m0 = false;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                org.telegram.ui.Components.y4.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new tb0(this, z10, 1), null).o();
                return;
            }
        }
        final TLRPC.User user = DialogObject.isUserDialog(this.a0) ? getMessagesController().getUser(Long.valueOf(this.a0)) : null;
        showDialog(org.telegram.ui.Components.y4.E(getParentActivity(), z10, user, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.wb0
            @Override // org.telegram.messenger.MessagesStorage.IntCallback
            public final void run(int i9) {
                pc0.U(pc0.this, z10, user, i9);
            }
        }, null));
    }

    public final void s0(Location location) {
        int i9;
        if (location == null) {
            return;
        }
        this.s0 = new Location(location);
        jc0 jc0Var = (jc0) this.d0.f(getUserConfig().getClientUserId());
        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.a0);
        if (jc0Var != null && sharingLocationInfo != null && jc0Var.b.id == sharingLocationInfo.mid) {
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            jc0Var.e.setPosition(latLng);
            IMapsProvider.IMarker iMarker = jc0Var.f;
            if (iMarker != null) {
                iMarker.setPosition(latLng);
            }
            if (this.e0 == jc0Var.a) {
                this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(jc0Var.e.getPosition()));
            }
        }
        if (this.x0 == null && this.v0 == null && this.E != null) {
            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            dc0 dc0Var = this.P;
            if (dc0Var != null) {
                if (!this.z0 && (i9 = this.C0) != 4 && i9 != 8) {
                    dc0Var.H(null, this.s0, true);
                }
                this.P.M(this.s0);
            }
            if (!this.y0) {
                this.t0 = new Location(location);
                if (this.A0) {
                    this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng2));
                } else {
                    this.A0 = true;
                    this.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, this.E.getMaxZoomLevel() - 4.0f));
                }
            }
        } else {
            this.P.M(this.s0);
        }
        org.telegram.ui.Components.qh0 qh0Var = this.N;
        if (qh0Var != null) {
            qh0Var.c(true);
        }
        IMapsProvider.ICircle iCircle = this.K;
        if (iCircle != null) {
            iCircle.setCenter(new IMapsProvider.LatLng(this.s0.getLatitude(), this.s0.getLongitude()));
        }
        B0();
    }

    public final void t0(MessageObject messageObject) {
        this.x0 = messageObject;
        this.a0 = messageObject.getDialogId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0(jc0 jc0Var) {
        if (jc0Var.h != null) {
            return;
        }
        TLRPC.User user = jc0Var.c;
        TLRPC.Chat chat = jc0Var.d;
        if (user == null && chat == 0) {
            return;
        }
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        if (user != null) {
            z8Var.m(this.currentAccount, user);
        } else {
            z8Var.k(this.currentAccount, chat);
        }
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setCurrentAccount(this.currentAccount);
        imageReceiver.setDelegate(new yr(22, this, jc0Var));
        imageReceiver.onAttachedToWindow();
        if (user == null) {
            user = chat;
        }
        imageReceiver.setForUserOrChat(user, z8Var);
        jc0Var.h = imageReceiver;
    }

    public final void v0(int i9, TLRPC.User user, int i10) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.s0.getLatitude());
        tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(this.s0.getLongitude());
        tL_messageMediaGeoLive.heading = LocationController.getHeading(this.s0);
        int i11 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i9;
        tL_messageMediaGeoLive.proximity_notification_radius = i10;
        tL_messageMediaGeoLive.flags = i11 | 9;
        this.B0.d(tL_messageMediaGeoLive, this.C0, true, 0, 0L);
        if (i10 <= 0) {
            finishFragment();
            return;
        }
        this.N.H = true;
        this.c.setImageResource(R.drawable.msg_location_alert2);
        org.telegram.ui.Components.qh0 qh0Var = this.N;
        if (qh0Var != null) {
            qh0Var.a();
        }
        l0().k(0L, 24, Integer.valueOf(i10), user, null, null);
    }

    public final void w0() {
        if (this.P.h() != 0 && this.U.L0() == 0) {
            View childAt = this.Q.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top < 0 || top > AndroidUtilities.dp(258.0f)) {
                return;
            }
            this.Q.v0(0, top, null);
        }
    }

    public final void x0(boolean z10) {
        org.telegram.ui.Components.vk vkVar;
        Location location;
        Location location2;
        if (this.C0 == 3) {
            z10 = true;
        }
        if (z10 && (vkVar = this.e) != null && vkVar.getTag() == null && ((location = this.s0) == null || (location2 = this.t0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        org.telegram.ui.Components.vk vkVar2 = this.e;
        if (vkVar2 != null) {
            if (!z10 || vkVar2.getTag() == null) {
                if (z10 || this.e.getTag() != null) {
                    this.e.setTag(z10 ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.vk, Float>) View.TRANSLATION_X, z10 ? 0.0f : -AndroidUtilities.dp(80.0f)));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(org.telegram.ui.Components.gr.g);
                    animatorSet.start();
                }
            }
        }
    }

    public final void y0(boolean z10, boolean z11) {
        Boolean bool = this.L0;
        if (bool == null || bool.booleanValue() != z10) {
            this.L0 = Boolean.valueOf(z10);
            if (z11) {
                this.b.setVisibility(0);
                this.b.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f).setInterpolator(org.telegram.ui.Components.gr.h).setDuration(420L).withEndAction(new tb0(this, z10, 0)).start();
            } else {
                this.b.setVisibility(z10 ? 0 : 8);
                this.b.setAlpha(z10 ? 1.0f : 0.0f);
                this.b.setScaleX(z10 ? 1.0f : 0.7f);
                this.b.setScaleY(z10 ? 1.0f : 0.7f);
            }
        }
    }

    public final void z0(boolean z10) {
        int i9;
        int i10;
        FrameLayout.LayoutParams layoutParams;
        f2.q1 K = this.Q.K(0);
        if (K != null) {
            i9 = (int) K.a.getY();
            i10 = Math.min(i9, 0) + this.D0;
        } else {
            i9 = -this.O.getMeasuredHeight();
            i10 = 0;
        }
        if (((FrameLayout.LayoutParams) this.O.getLayoutParams()) != null) {
            if (i10 <= 0) {
                if (this.G.getView().getVisibility() == 0) {
                    this.G.getView().setVisibility(4);
                    this.O.setVisibility(4);
                    mc0 mc0Var = this.x;
                    if (mc0Var != null) {
                        mc0Var.setVisibility(4);
                    }
                }
            } else if (this.G.getView().getVisibility() == 4) {
                this.G.getView().setVisibility(0);
                this.O.setVisibility(0);
                mc0 mc0Var2 = this.x;
                if (mc0Var2 != null) {
                    mc0Var2.setVisibility(0);
                }
            }
            this.O.setTranslationY(Math.min(0, i9));
            int i11 = -i9;
            int i12 = i11 / 2;
            this.G.getView().setTranslationY(Math.max(0, i12));
            mc0 mc0Var3 = this.x;
            if (mc0Var3 != null) {
                mc0Var3.setTranslationY(Math.max(0, i12));
            }
            int measuredHeight = this.D0 - this.d.getMeasuredHeight();
            int i13 = this.C0;
            float min = Math.min(measuredHeight - AndroidUtilities.dp(64 + ((i13 == 0 || i13 == 1) ? 30 : 10)), i11);
            this.d.setTranslationY(min);
            this.c.setTranslationY(min);
            kh.x3 x3Var = this.y;
            if (x3Var != null) {
                x3Var.setTranslationY(min);
            }
            org.telegram.ui.Components.vk vkVar = this.e;
            if (vkVar != null) {
                vkVar.c = min;
                vkVar.setTranslationY(min + vkVar.b);
            }
            View view = this.T;
            if (view != null) {
                int dp = (i10 / 2) + (i11 - AndroidUtilities.dp(view.getTag() == null ? 48.0f : 69.0f));
                this.u0 = dp;
                view.setTranslationY(dp);
            }
            if (z10) {
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.G.getView().getLayoutParams();
            if (layoutParams2 != null) {
                if (layoutParams2.height != AndroidUtilities.dp(10.0f) + this.D0) {
                    layoutParams2.height = AndroidUtilities.dp(10.0f) + this.D0;
                    IMapsProvider.IMap iMap = this.E;
                    if (iMap != null) {
                        iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                    }
                    this.G.getView().setLayoutParams(layoutParams2);
                }
            }
            mc0 mc0Var4 = this.x;
            if (mc0Var4 == null || (layoutParams = (FrameLayout.LayoutParams) mc0Var4.getLayoutParams()) == null) {
                return;
            }
            if (layoutParams.height != AndroidUtilities.dp(10.0f) + this.D0) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.D0;
                this.x.setLayoutParams(layoutParams);
            }
        }
    }
}

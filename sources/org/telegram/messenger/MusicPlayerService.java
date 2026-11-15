package org.telegram.messenger;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class MusicPlayerService extends Service implements is {
    public static final boolean s;
    public static android.support.v4.media.session.a0 w;
    public RemoteControlClient a;
    public AudioManager b;
    public android.support.v4.media.session.d0 c;
    public Bitmap d;
    public int e;
    public ImageReceiver f;
    public boolean h;
    public String n;
    public final q0 r = new q0(2);

    static {
        s = Build.VERSION.SDK_INT < 29 && !TextUtils.isEmpty(g0.k1("ro.miui.ui.version.code"));
    }

    public static int b(int i7) {
        return (Build.VERSION.SDK_INT >= 31 || !b6.i()) ? i7 : i7 & (-100663297);
    }

    public static float d(gj gjVar, boolean z10) {
        if (!z10) {
            return 0.0f;
        }
        if (gjVar == null) {
            return 1.0f;
        }
        if (gj.R4(gjVar.k) || gjVar.h4()) {
            return MediaController.B().q0;
        }
        return 1.0f;
    }

    public static void g() {
        if (w != null) {
            int i7 = gz.S0;
            w.v(i7 != 1 ? i7 != 2 ? 0 : 1 : 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0594  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(gj gjVar, boolean z10) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap c10;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        String str;
        long j3;
        String str2;
        String str3;
        rf.a aVar;
        String str4;
        int i7;
        String str5;
        int i10;
        String str6;
        int i11;
        android.support.v4.media.session.a0 a0Var;
        rf.a aVar2;
        String str7;
        Bitmap bitmap3;
        int i12;
        String y12 = gjVar.y1(true);
        String w12 = gjVar.w1(true);
        rf.a aVar3 = MediaController.B().E0;
        Intent intent = new Intent(t0.b, (Class<?>) LaunchActivity.class);
        if (gjVar.I3()) {
            intent.setAction("com.tmessages.openplayer");
            intent.addCategory("android.intent.category.LAUNCHER");
        } else if (gj.R4(gjVar.k) || gjVar.h4()) {
            intent.setAction("android.intent.action.VIEW");
            TLRPC.Peer peer = gjVar.k.peer_id;
            boolean z11 = peer instanceof TLRPC.TL_peerUser;
            long j10 = z11 ? peer.user_id : peer instanceof TLRPC.TL_peerChat ? peer.chat_id : peer instanceof TLRPC.TL_peerChannel ? peer.channel_id : 0L;
            if (j10 != 0) {
                if (z11) {
                    StringBuilder t6 = a8.p0.t(j10, "tg://openmessage?user_id=", "&message_id=");
                    t6.append(gjVar.e1());
                    intent.setData(Uri.parse(t6.toString()));
                } else {
                    StringBuilder t10 = a8.p0.t(j10, "tg://openmessage?chat_id=", "&message_id=");
                    t10.append(gjVar.e1());
                    intent.setData(Uri.parse(t10.toString()));
                }
            }
        }
        PendingIntent activity = PendingIntent.getActivity(t0.b, 0, intent, b(33554432));
        long L0 = (long) (gjVar.L0() * 1000.0d);
        if (gjVar.I3()) {
            String u02 = gjVar.u0(true);
            String u03 = gjVar.u0(false);
            bitmap2 = aVar3 != null ? aVar3.p : null;
            bitmap = aVar3 != null ? aVar3.o : null;
            this.n = null;
            this.f.w0(null);
            if (bitmap2 != null || TextUtils.isEmpty(u02)) {
                w7.G(m10.t0);
                this.n = w7.I(gjVar.F0()).getAbsolutePath();
            } else {
                boolean z12 = !z10;
                Bitmap e10 = e(u03, true, z12);
                if (e10 == null) {
                    bitmap2 = e(u02, false, z12);
                    bitmap = bitmap2;
                } else {
                    bitmap2 = e(u03, false, z12);
                    bitmap = e10;
                }
            }
        } else if (gj.R4(gjVar.k) || gjVar.h4()) {
            long R1 = gjVar.R1();
            if (gjVar.p3()) {
                TLRPC.User a22 = np.s1(m10.t0).a2(Long.valueOf(R1));
                if (a22 != null) {
                    y12 = q10.p(a22);
                    boolean z13 = !z10;
                    bitmap = c(a22, true, z13);
                    c10 = c(a22, false, z13);
                } else {
                    c10 = null;
                    bitmap = null;
                }
            } else {
                TLRPC.Chat M0 = np.s1(m10.t0).M0(Long.valueOf(-R1));
                if (M0 != null) {
                    y12 = M0.title;
                    boolean z14 = !z10;
                    bitmap = c(M0, true, z14);
                    c10 = c(M0, false, z14);
                } else {
                    bitmap = null;
                    bitmap2 = null;
                    if (bitmap == null && bitmap2 != null) {
                        bitmap = bitmap2;
                    }
                    w12 = !gj.R4(gjVar.k) ? hd.M0(2131753982, null) : hd.M0(2131753941, null);
                }
            }
            bitmap2 = c10;
            if (bitmap == null) {
                bitmap = bitmap2;
            }
            if (!gj.R4(gjVar.k)) {
            }
        } else {
            bitmap = null;
            bitmap2 = null;
        }
        int i13 = Build.VERSION.SDK_INT;
        boolean H = MediaController.B().H();
        boolean z15 = !H;
        Bitmap bitmap4 = bitmap;
        PendingIntent broadcast = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.previous").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), b(301989888));
        PendingIntent service = PendingIntent.getService(getApplicationContext(), 0, new Intent(this, getClass()).setAction(getPackageName() + ".STOP_PLAYER"), b(301989888));
        PendingIntent broadcast2 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(!H ? "org.telegram.android.musicplayer.pause" : "org.telegram.android.musicplayer.play").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), b(301989888));
        PendingIntent broadcast3 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.next").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), b(301989888));
        PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.seek").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), b(301989888));
        PendingIntent broadcast4 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.repeat").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), b(301989888));
        PendingIntent broadcast5 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.shuffle").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), b(301989888));
        Notification.MediaStyle mediaSession = new Notification.MediaStyle().setMediaSession((MediaSession.Token) ((android.support.v4.media.session.u) w.b).c.b);
        if (gjVar.I3()) {
            pendingIntent = broadcast;
            pendingIntent2 = broadcast5;
            str = "org.telegram.android.musicplayer.shuffle";
            mediaSession.setShowActionsInCompactView(0, 1, 2, 3, 4);
        } else {
            pendingIntent = broadcast;
            pendingIntent2 = broadcast5;
            str = "org.telegram.android.musicplayer.shuffle";
            if (gj.R4(gjVar.k) || gjVar.h4()) {
                mediaSession.setShowActionsInCompactView(0);
            }
        }
        Notification.Builder builder = new Notification.Builder(this);
        builder.setSmallIcon(R.drawable.player).setOngoing(z15).setContentTitle(y12).setContentText(w12).setSubText((aVar3 == null || !gjVar.I3()) ? null : aVar3.f).setContentIntent(activity).setDeleteIntent(service).setShowWhen(false).setCategory("transport").setPriority(2).setStyle(mediaSession);
        if (i13 >= 26) {
            at.i();
            builder.setChannelId(at.k0);
        }
        if (bitmap2 != null) {
            builder.setLargeIcon(bitmap2);
        } else {
            builder.setLargeIcon(this.d);
        }
        String M02 = hd.M0(2131748250, null);
        String M03 = hd.M0(2131754800, null);
        this.c = new android.support.v4.media.session.d0();
        if (MediaController.B().B0) {
            android.support.v4.media.session.d0 d0Var = this.c;
            j3 = 1000;
            d0Var.c(6, 0L, 1.0f);
            d0Var.e = 0L;
            if (gjVar.I3()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_previous, M03, pendingIntent).build());
            }
            builder.addAction(new Notification.Action.Builder(R.drawable.loading_animation2, hd.M0(2131748779, null), (PendingIntent) null).build());
            if (gjVar.I3()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_next, M02, broadcast3).build());
            }
            str2 = y12;
            str3 = w12;
            aVar = aVar3;
            i7 = i13;
        } else {
            PendingIntent pendingIntent3 = pendingIntent;
            j3 = 1000;
            long j11 = gjVar.I3() ? 2360118L : 2360070L;
            if (gjVar.I3()) {
                if (gz.N0) {
                    i7 = i13;
                    i11 = R.drawable.player_new_shuffle;
                } else {
                    i7 = i13;
                    i11 = R.drawable.player_new_shuffle_off;
                }
                aVar = aVar3;
                android.support.v4.media.session.d0 d0Var2 = this.c;
                str2 = y12;
                str3 = w12;
                String M04 = hd.M0(2131745322, null);
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(M04)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                str4 = M02;
                d0Var2.a(new PlaybackStateCompat.CustomAction(str, M04, i11, null));
            } else {
                str2 = y12;
                str3 = w12;
                aVar = aVar3;
                str4 = M02;
                i7 = i13;
            }
            android.support.v4.media.session.d0 d0Var3 = this.c;
            d0Var3.c(!H ? 3 : 2, MediaController.B().v0.i0 * 1000, d(gjVar, z15));
            d0Var3.e = j11;
            boolean I3 = gjVar.I3();
            int i14 = R.drawable.player_new_repeatall;
            if (I3) {
                int i15 = gz.S0;
                int i16 = i15 != 1 ? i15 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone : R.drawable.player_new_repeatall;
                android.support.v4.media.session.d0 d0Var4 = this.c;
                String M05 = hd.M0(2131746273, null);
                if (TextUtils.isEmpty("org.telegram.android.musicplayer.repeat")) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(M05)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                d0Var4.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.repeat", M05, i16, null));
            }
            if (H) {
                str5 = null;
                i10 = 2131754929;
            } else {
                i10 = 2131754930;
                str5 = null;
            }
            String M06 = hd.M0(i10, str5);
            if (gjVar.I3()) {
                builder.addAction(new Notification.Action.Builder(gz.N0 ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off, hd.M0(2131745322, str5), pendingIntent2).build());
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_previous, M03, pendingIntent3).build());
            }
            builder.addAction(new Notification.Action.Builder(!H ? R.drawable.ic_action_pause : R.drawable.ic_action_play, M06, broadcast2).build());
            if (gjVar.I3()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_next, str4, broadcast3).build());
                int i17 = gz.S0;
                if (i17 != 1) {
                    i14 = i17 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone;
                }
                str6 = null;
                builder.addAction(new Notification.Action.Builder(i14, hd.M0(2131746273, null), broadcast4).build());
                w.t(this.c.b());
                g();
                a0Var = w;
                if (a0Var != null) {
                    a0Var.w(gz.N0 ? 1 : 0);
                }
                ab.w wVar = new ab.w();
                String str8 = str3;
                wVar.j("android.media.metadata.ALBUM_ARTIST", str8);
                wVar.j("android.media.metadata.ARTIST", str8);
                wVar.i(L0);
                String str9 = str2;
                wVar.j("android.media.metadata.TITLE", str9);
                if (aVar == null && gjVar.I3()) {
                    aVar2 = aVar;
                    str7 = aVar2.f;
                } else {
                    aVar2 = aVar;
                    str7 = str6;
                }
                wVar.j("android.media.metadata.ALBUM", str7);
                if (bitmap4 != null || bitmap4.isRecycled()) {
                    bitmap3 = bitmap4;
                } else {
                    bitmap3 = bitmap4;
                    wVar.h("android.media.metadata.ALBUM_ART", bitmap3);
                }
                w.s(new MediaMetadataCompat(wVar.a));
                builder.setVisibility(1);
                Notification build = builder.build();
                if (i7 < 31) {
                    if (this.h) {
                        ((NotificationManager) getSystemService("notification")).notify(5, build);
                    } else {
                        this.h = true;
                        startForeground(5, build);
                    }
                } else if (H) {
                    stopForeground(false);
                    ((NotificationManager) getSystemService("notification")).notify(5, build);
                } else {
                    startForeground(5, build);
                }
                if (this.a == null) {
                    int e12 = MediaController.B().v0.e1();
                    if (this.e != e12) {
                        this.e = e12;
                        RemoteControlClient.MetadataEditor editMetadata = this.a.editMetadata(true);
                        i12 = 2;
                        editMetadata.putString(2, str8);
                        editMetadata.putString(7, str9);
                        if (aVar2 != null && !TextUtils.isEmpty(aVar2.f)) {
                            editMetadata.putString(1, aVar2.f);
                        }
                        editMetadata.putLong(9, MediaController.B().v0.j0 * j3);
                        if (bitmap3 != null) {
                            try {
                                editMetadata.putBitmap(100, bitmap3);
                            } catch (Throwable th2) {
                                a8.g(th2, true);
                            }
                        }
                        editMetadata.apply();
                        g0.i3(new j6.o(this, 11), j3);
                    } else {
                        i12 = 2;
                    }
                    if (MediaController.B().B0) {
                        this.a.setPlaybackState(8);
                        return;
                    }
                    RemoteControlClient.MetadataEditor editMetadata2 = this.a.editMetadata(false);
                    editMetadata2.putLong(9, MediaController.B().v0.j0 * 1000);
                    editMetadata2.apply();
                    this.a.setPlaybackState(MediaController.B().H() ? i12 : 3, Math.max(MediaController.B().v0.i0 * 1000, 100L), MediaController.B().H() ? 0.0f : 1.0f);
                    return;
                }
                return;
            }
        }
        str6 = null;
        w.t(this.c.b());
        g();
        a0Var = w;
        if (a0Var != null) {
        }
        ab.w wVar2 = new ab.w();
        String str82 = str3;
        wVar2.j("android.media.metadata.ALBUM_ARTIST", str82);
        wVar2.j("android.media.metadata.ARTIST", str82);
        wVar2.i(L0);
        String str92 = str2;
        wVar2.j("android.media.metadata.TITLE", str92);
        if (aVar == null) {
        }
        aVar2 = aVar;
        str7 = str6;
        wVar2.j("android.media.metadata.ALBUM", str7);
        if (bitmap4 != null) {
        }
        bitmap3 = bitmap4;
        w.s(new MediaMetadataCompat(wVar2.a));
        builder.setVisibility(1);
        Notification build2 = builder.build();
        if (i7 < 31) {
        }
        if (this.a == null) {
        }
    }

    public final Bitmap c(TLObject tLObject, boolean z10, boolean z11) {
        int i7 = z10 ? 600 : 100;
        try {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.FileLocation fileLocation = z10 ? user.photo.photo_big : user.photo.photo_small;
                if (fileLocation != null) {
                    w7.G(m10.t0);
                    File J = w7.J(fileLocation, null, true, true);
                    if (J.exists()) {
                        float f10 = i7;
                        return fc.K(J.getAbsolutePath(), null, f10, f10, false);
                    }
                    if (z10) {
                        if (z11) {
                            this.n = w7.r(null, fileLocation);
                            this.f.q0(gc.l(m10.t0, 0, user), "", null, null, null, 0);
                        } else {
                            this.n = null;
                        }
                    }
                }
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                TLRPC.FileLocation fileLocation2 = z10 ? chat.photo.photo_big : chat.photo.photo_small;
                if (fileLocation2 != null) {
                    w7.G(m10.t0);
                    File J2 = w7.J(fileLocation2, null, true, true);
                    if (J2.exists()) {
                        float f11 = i7;
                        return fc.K(J2.getAbsolutePath(), null, f11, f11, false);
                    }
                    if (z10) {
                        if (z11) {
                            this.n = w7.r(null, fileLocation2);
                            this.f.q0(gc.a(0, chat), "", null, null, null, 0);
                        } else {
                            this.n = null;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        if (z10) {
            return null;
        }
        org.telegram.ui.ActionBar.j6.T(this);
        org.telegram.ui.Components.t8 t8Var = tLObject instanceof TLRPC.User ? new org.telegram.ui.Components.t8(0, (TLRPC.User) tLObject) : new org.telegram.ui.Components.t8((TLRPC.Chat) tLObject);
        t8Var.r = 1;
        float f12 = i7;
        Bitmap createBitmap = Bitmap.createBitmap(g0.L(f12), g0.L(f12), Bitmap.Config.ARGB_8888);
        t8Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        t8Var.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        String str2;
        if (i7 == ns.g2) {
            gj gjVar = MediaController.B().v0;
            if (gjVar != null) {
                a(gjVar, false);
                return;
            } else {
                stopSelf();
                return;
            }
        }
        if (i7 == ns.i2) {
            if (MediaController.B().v0 == null) {
                return;
            }
            long round = Math.round(((Float) objArr[1]).floatValue() * r3.j0) * 1000;
            f(round);
            RemoteControlClient remoteControlClient = this.a;
            if (remoteControlClient != null) {
                remoteControlClient.setPlaybackState(MediaController.B().H() ? 2 : 3, round, MediaController.B().H() ? 0.0f : 1.0f);
                return;
            }
            return;
        }
        if (i7 == ns.R1) {
            String str3 = (String) objArr[0];
            gj gjVar2 = MediaController.B().v0;
            if (gjVar2 == null || (str2 = this.n) == null || !str2.equals(str3)) {
                return;
            }
            a(gjVar2, false);
            return;
        }
        if (i7 == ns.Y1) {
            String str4 = (String) objArr[0];
            gj gjVar3 = MediaController.B().v0;
            if (gjVar3 == null || (str = this.n) == null || !str.equals(str4)) {
                return;
            }
            a(gjVar3, false);
        }
    }

    public final Bitmap e(String str, boolean z10, boolean z11) {
        File A = fc.A(str);
        if (A.exists()) {
            return fc.K(A.getAbsolutePath(), null, z10 ? 600.0f : 100.0f, z10 ? 600.0f : 100.0f, false);
        }
        if (!z11) {
            this.n = null;
            return null;
        }
        this.n = A.getAbsolutePath();
        if (!z10) {
            this.f.o0(str, "48_48", null, null, 0L);
        }
        return null;
    }

    public final void f(long j3) {
        long j10;
        this.c = new android.support.v4.media.session.d0();
        boolean H = MediaController.B().H();
        boolean z10 = !H;
        if (MediaController.B().B0) {
            android.support.v4.media.session.d0 d0Var = this.c;
            d0Var.c(6, 0L, 1.0f);
            d0Var.e = 0L;
        } else {
            gj gjVar = MediaController.B().v0;
            if (gjVar == null || !gjVar.I3()) {
                j10 = 2360070;
            } else {
                int i7 = gz.N0 ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off;
                android.support.v4.media.session.d0 d0Var2 = this.c;
                String M0 = hd.M0(2131745322, null);
                if (TextUtils.isEmpty("org.telegram.android.musicplayer.shuffle")) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(M0)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                d0Var2.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.shuffle", M0, i7, null));
                j10 = 2360118;
            }
            android.support.v4.media.session.d0 d0Var3 = this.c;
            d0Var3.c(!H ? 3 : 2, j3, d(gjVar, z10));
            d0Var3.e = j10;
            if (gjVar != null && gjVar.I3()) {
                int i10 = gz.S0;
                int i11 = i10 != 1 ? i10 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone : R.drawable.player_new_repeatall;
                android.support.v4.media.session.d0 d0Var4 = this.c;
                String M02 = hd.M0(2131746273, null);
                if (TextUtils.isEmpty("org.telegram.android.musicplayer.repeat")) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(M02)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                d0Var4.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.repeat", M02, i11, null));
            }
        }
        w.t(this.c.b());
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.b = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        for (int i7 = 0; i7 < 4; i7++) {
            ns.f(i7).b(this, ns.i2);
            ns.f(i7).b(this, ns.g2);
            ns.f(i7).b(this, ns.R1);
            ns.f(i7).b(this, ns.Y1);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f = imageReceiver;
        imageReceiver.h1 = new j1(this, 13);
        if (w == null) {
            w = new android.support.v4.media.session.a0(getApplicationContext(), "telegramAudioPlayer", (ComponentName) null, (PendingIntent) null);
        }
        this.c = new android.support.v4.media.session.d0();
        this.d = Bitmap.createBitmap(g0.L(102.0f), g0.L(102.0f), Bitmap.Config.ARGB_8888);
        Drawable drawable = getResources().getDrawable(R.drawable.nocover_big);
        drawable.setBounds(0, 0, this.d.getWidth(), this.d.getHeight());
        drawable.draw(new Canvas(this.d));
        w.r(new i6.g(this, 1), null);
        w.q(true);
        g();
        android.support.v4.media.session.a0 a0Var = w;
        if (a0Var != null) {
            a0Var.w(gz.N0 ? 1 : 0);
        }
        registerReceiver(this.r, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        unregisterReceiver(this.r);
        super.onDestroy();
        stopForeground(true);
        RemoteControlClient remoteControlClient = this.a;
        if (remoteControlClient != null) {
            RemoteControlClient.MetadataEditor editMetadata = remoteControlClient.editMetadata(true);
            editMetadata.clear();
            editMetadata.apply();
            this.b.unregisterRemoteControlClient(this.a);
        }
        android.support.v4.media.session.a0 a0Var = w;
        if (a0Var != null) {
            a0Var.r(null, null);
            w.q(false);
        }
        for (int i7 = 0; i7 < 4; i7++) {
            ns.f(i7).n(this, ns.i2);
            ns.f(i7).n(this, ns.g2);
            ns.f(i7).n(this, ns.R1);
            ns.f(i7).n(this, ns.Y1);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        if (intent != null) {
            try {
                if ((getPackageName() + ".STOP_PLAYER").equals(intent.getAction())) {
                    MediaController.B().q(true, true, false, false);
                    return 2;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        gj gjVar = MediaController.B().v0;
        if (gjVar == null) {
            g0.h3(new a(this, 29));
            return 1;
        }
        if (s) {
            ComponentName componentName = new ComponentName(getApplicationContext(), MusicPlayerReceiver.class.getName());
            try {
                if (this.a == null) {
                    this.b.registerMediaButtonEventReceiver(componentName);
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    RemoteControlClient remoteControlClient = new RemoteControlClient(PendingIntent.getBroadcast(this, 0, intent2, b(33554432)));
                    this.a = remoteControlClient;
                    this.b.registerRemoteControlClient(remoteControlClient);
                }
                this.a.setTransportControlFlags(ns.T2);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        a(gjVar, false);
        return 1;
    }
}

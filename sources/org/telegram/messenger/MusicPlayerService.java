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
import android.os.Bundle;
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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class MusicPlayerService extends Service implements ls {
    public static final boolean w = !TextUtils.isEmpty(g0.k1("ro.miui.ui.version.code"));
    public RemoteControlClient a;
    public AudioManager b;
    public android.support.v4.media.session.a0 c;
    public android.support.v4.media.session.d0 d;
    public Bitmap e;
    public int f;
    public ImageReceiver h;
    public boolean n;
    public String r;
    public final q0 s = new q0(2);

    public static int b(int i7) {
        return (Build.VERSION.SDK_INT >= 31 || !as.i()) ? i7 : i7 & (-100663297);
    }

    public static float d(ij ijVar, boolean z9) {
        if (!z9) {
            return 0.0f;
        }
        if (ijVar == null) {
            return 1.0f;
        }
        if (ij.S4(ijVar.k) || ijVar.i4()) {
            return MediaController.B().p0;
        }
        return 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0596  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ij ijVar, boolean z9) {
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
        String z12 = ijVar.z1(true);
        String x12 = ijVar.x1(true);
        rf.a aVar3 = MediaController.B().D0;
        Intent intent = new Intent(t0.b, (Class<?>) LaunchActivity.class);
        if (ijVar.J3()) {
            intent.setAction("com.tmessages.openplayer");
            intent.addCategory("android.intent.category.LAUNCHER");
        } else if (ij.S4(ijVar.k) || ijVar.i4()) {
            intent.setAction("android.intent.action.VIEW");
            TLRPC.Peer peer = ijVar.k.peer_id;
            boolean z10 = peer instanceof TLRPC.TL_peerUser;
            long j10 = z10 ? peer.user_id : peer instanceof TLRPC.TL_peerChat ? peer.chat_id : peer instanceof TLRPC.TL_peerChannel ? peer.channel_id : 0L;
            if (j10 != 0) {
                if (z10) {
                    StringBuilder t6 = a8.p0.t(j10, "tg://openmessage?user_id=", "&message_id=");
                    t6.append(ijVar.f1());
                    intent.setData(Uri.parse(t6.toString()));
                } else {
                    StringBuilder t10 = a8.p0.t(j10, "tg://openmessage?chat_id=", "&message_id=");
                    t10.append(ijVar.f1());
                    intent.setData(Uri.parse(t10.toString()));
                }
            }
        }
        PendingIntent activity = PendingIntent.getActivity(t0.b, 0, intent, b(33554432));
        long L0 = (long) (ijVar.L0() * 1000.0d);
        if (ijVar.J3()) {
            String u02 = ijVar.u0(true);
            String u03 = ijVar.u0(false);
            bitmap2 = aVar3 != null ? aVar3.p : null;
            bitmap = aVar3 != null ? aVar3.o : null;
            this.r = null;
            this.h.w0(null);
            if (bitmap2 != null || TextUtils.isEmpty(u02)) {
                w7.G(p10.s0);
                this.r = w7.I(ijVar.F0()).getAbsolutePath();
            } else {
                boolean z11 = !z9;
                Bitmap e10 = e(u03, true, z11);
                if (e10 == null) {
                    bitmap2 = e(u02, false, z11);
                    bitmap = bitmap2;
                } else {
                    bitmap2 = e(u03, false, z11);
                    bitmap = e10;
                }
            }
        } else if (ij.S4(ijVar.k) || ijVar.i4()) {
            long S1 = ijVar.S1();
            if (ijVar.q3()) {
                TLRPC.User a22 = qp.s1(p10.s0).a2(Long.valueOf(S1));
                if (a22 != null) {
                    z12 = t10.p(a22);
                    boolean z13 = !z9;
                    bitmap = c(a22, true, z13);
                    c10 = c(a22, false, z13);
                } else {
                    c10 = null;
                    bitmap = null;
                }
            } else {
                TLRPC.Chat M0 = qp.s1(p10.s0).M0(Long.valueOf(-S1));
                if (M0 != null) {
                    z12 = M0.title;
                    boolean z14 = !z9;
                    bitmap = c(M0, true, z14);
                    c10 = c(M0, false, z14);
                } else {
                    bitmap = null;
                    bitmap2 = null;
                    if (bitmap == null && bitmap2 != null) {
                        bitmap = bitmap2;
                    }
                    x12 = !ij.S4(ijVar.k) ? hd.M0(2131753982, null) : hd.M0(2131753941, null);
                }
            }
            bitmap2 = c10;
            if (bitmap == null) {
                bitmap = bitmap2;
            }
            if (!ij.S4(ijVar.k)) {
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
        Notification.MediaStyle mediaSession = new Notification.MediaStyle().setMediaSession((MediaSession.Token) ((android.support.v4.media.session.u) this.c.b).c.b);
        if (ijVar.J3()) {
            pendingIntent = broadcast;
            pendingIntent2 = broadcast5;
            str = "org.telegram.android.musicplayer.shuffle";
            mediaSession.setShowActionsInCompactView(0, 1, 2, 3, 4);
        } else {
            pendingIntent = broadcast;
            pendingIntent2 = broadcast5;
            str = "org.telegram.android.musicplayer.shuffle";
            if (ij.S4(ijVar.k) || ijVar.i4()) {
                mediaSession.setShowActionsInCompactView(0);
            }
        }
        Notification.Builder builder = new Notification.Builder(this);
        builder.setSmallIcon(R.drawable.player).setOngoing(z15).setContentTitle(z12).setContentText(x12).setSubText((aVar3 == null || !ijVar.J3()) ? null : aVar3.f).setContentIntent(activity).setDeleteIntent(service).setShowWhen(false).setCategory("transport").setPriority(2).setStyle(mediaSession);
        if (i13 >= 26) {
            dt.i();
            builder.setChannelId(dt.j0);
        }
        if (bitmap2 != null) {
            builder.setLargeIcon(bitmap2);
        } else {
            builder.setLargeIcon(this.e);
        }
        String M02 = hd.M0(2131748249, null);
        String M03 = hd.M0(2131754800, null);
        this.d = new android.support.v4.media.session.d0();
        if (MediaController.B().A0) {
            android.support.v4.media.session.d0 d0Var = this.d;
            j3 = 1000;
            d0Var.c(6, 0L, 1.0f);
            d0Var.e = 0L;
            if (ijVar.J3()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_previous, M03, pendingIntent).build());
            }
            builder.addAction(new Notification.Action.Builder(R.drawable.loading_animation2, hd.M0(2131748778, null), (PendingIntent) null).build());
            if (ijVar.J3()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_next, M02, broadcast3).build());
            }
            str2 = z12;
            str3 = x12;
            aVar = aVar3;
            i7 = i13;
        } else {
            PendingIntent pendingIntent3 = pendingIntent;
            j3 = 1000;
            long j11 = ijVar.J3() ? 2360118L : 2360070L;
            if (ijVar.J3()) {
                if (iz.N0) {
                    i7 = i13;
                    i11 = R.drawable.player_new_shuffle;
                } else {
                    i7 = i13;
                    i11 = R.drawable.player_new_shuffle_off;
                }
                aVar = aVar3;
                android.support.v4.media.session.d0 d0Var2 = this.d;
                str2 = z12;
                str3 = x12;
                String M04 = hd.M0(2131745323, null);
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(M04)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                str4 = M02;
                d0Var2.a(new PlaybackStateCompat.CustomAction(str, M04, i11, null));
            } else {
                str2 = z12;
                str3 = x12;
                aVar = aVar3;
                str4 = M02;
                i7 = i13;
            }
            android.support.v4.media.session.d0 d0Var3 = this.d;
            d0Var3.c(!H ? 3 : 2, MediaController.B().u0.g0 * 1000, d(ijVar, z15));
            d0Var3.e = j11;
            boolean J3 = ijVar.J3();
            int i14 = R.drawable.player_new_repeatall;
            if (J3) {
                int i15 = iz.S0;
                int i16 = i15 != 1 ? i15 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone : R.drawable.player_new_repeatall;
                android.support.v4.media.session.d0 d0Var4 = this.d;
                String M05 = hd.M0(2131746272, null);
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
            if (ijVar.J3()) {
                builder.addAction(new Notification.Action.Builder(iz.N0 ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off, hd.M0(2131745323, str5), pendingIntent2).build());
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_previous, M03, pendingIntent3).build());
            }
            builder.addAction(new Notification.Action.Builder(!H ? R.drawable.ic_action_pause : R.drawable.ic_action_play, M06, broadcast2).build());
            if (ijVar.J3()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_next, str4, broadcast3).build());
                int i17 = iz.S0;
                if (i17 != 1) {
                    i14 = i17 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone;
                }
                str6 = null;
                builder.addAction(new Notification.Action.Builder(i14, hd.M0(2131746272, null), broadcast4).build());
                this.c.u(this.d.b());
                g();
                a0Var = this.c;
                if (a0Var != null) {
                    a0Var.x(iz.N0 ? 1 : 0);
                }
                cb.c cVar = new cb.c(5);
                String str8 = str3;
                cVar.B("android.media.metadata.ALBUM_ARTIST", str8);
                cVar.B("android.media.metadata.ARTIST", str8);
                cVar.z(L0);
                String str9 = str2;
                cVar.B("android.media.metadata.TITLE", str9);
                if (aVar == null && ijVar.J3()) {
                    aVar2 = aVar;
                    str7 = aVar2.f;
                } else {
                    aVar2 = aVar;
                    str7 = str6;
                }
                cVar.B("android.media.metadata.ALBUM", str7);
                if (bitmap4 != null || bitmap4.isRecycled()) {
                    bitmap3 = bitmap4;
                } else {
                    bitmap3 = bitmap4;
                    cVar.y("android.media.metadata.ALBUM_ART", bitmap3);
                }
                this.c.t(new MediaMetadataCompat((Bundle) cVar.b));
                builder.setVisibility(1);
                Notification build = builder.build();
                if (i7 < 31) {
                    if (this.n) {
                        ((NotificationManager) getSystemService("notification")).notify(5, build);
                    } else {
                        this.n = true;
                        startForeground(5, build);
                    }
                } else if (H) {
                    stopForeground(false);
                    ((NotificationManager) getSystemService("notification")).notify(5, build);
                } else {
                    startForeground(5, build);
                }
                if (this.a == null) {
                    int f12 = MediaController.B().u0.f1();
                    if (this.f != f12) {
                        this.f = f12;
                        RemoteControlClient.MetadataEditor editMetadata = this.a.editMetadata(true);
                        i12 = 2;
                        editMetadata.putString(2, str8);
                        editMetadata.putString(7, str9);
                        if (aVar2 != null && !TextUtils.isEmpty(aVar2.f)) {
                            editMetadata.putString(1, aVar2.f);
                        }
                        editMetadata.putLong(9, MediaController.B().u0.h0 * j3);
                        if (bitmap3 != null) {
                            try {
                                editMetadata.putBitmap(100, bitmap3);
                            } catch (Throwable th2) {
                                a8.g(th2, true);
                            }
                        }
                        editMetadata.apply();
                        g0.i3(new m.f3(this, 8), j3);
                    } else {
                        i12 = 2;
                    }
                    if (MediaController.B().A0) {
                        this.a.setPlaybackState(8);
                        return;
                    }
                    RemoteControlClient.MetadataEditor editMetadata2 = this.a.editMetadata(false);
                    editMetadata2.putLong(9, MediaController.B().u0.h0 * 1000);
                    editMetadata2.apply();
                    this.a.setPlaybackState(MediaController.B().H() ? i12 : 3, Math.max(MediaController.B().u0.g0 * 1000, 100L), MediaController.B().H() ? 0.0f : 1.0f);
                    return;
                }
                return;
            }
        }
        str6 = null;
        this.c.u(this.d.b());
        g();
        a0Var = this.c;
        if (a0Var != null) {
        }
        cb.c cVar2 = new cb.c(5);
        String str82 = str3;
        cVar2.B("android.media.metadata.ALBUM_ARTIST", str82);
        cVar2.B("android.media.metadata.ARTIST", str82);
        cVar2.z(L0);
        String str92 = str2;
        cVar2.B("android.media.metadata.TITLE", str92);
        if (aVar == null) {
        }
        aVar2 = aVar;
        str7 = str6;
        cVar2.B("android.media.metadata.ALBUM", str7);
        if (bitmap4 != null) {
        }
        bitmap3 = bitmap4;
        this.c.t(new MediaMetadataCompat((Bundle) cVar2.b));
        builder.setVisibility(1);
        Notification build2 = builder.build();
        if (i7 < 31) {
        }
        if (this.a == null) {
        }
    }

    public final Bitmap c(TLObject tLObject, boolean z9, boolean z10) {
        int i7 = z9 ? 600 : 100;
        try {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.FileLocation fileLocation = z9 ? user.photo.photo_big : user.photo.photo_small;
                if (fileLocation != null) {
                    w7.G(p10.s0);
                    File K = w7.K(fileLocation, null, true, true);
                    if (K.exists()) {
                        float f10 = i7;
                        return gc.K(K.getAbsolutePath(), null, f10, f10, false);
                    }
                    if (z9) {
                        if (z10) {
                            this.r = w7.r(null, fileLocation);
                            this.h.q0(hc.l(p10.s0, 0, user), "", null, null, null, 0);
                        } else {
                            this.r = null;
                        }
                    }
                }
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                TLRPC.FileLocation fileLocation2 = z9 ? chat.photo.photo_big : chat.photo.photo_small;
                if (fileLocation2 != null) {
                    w7.G(p10.s0);
                    File K2 = w7.K(fileLocation2, null, true, true);
                    if (K2.exists()) {
                        float f11 = i7;
                        return gc.K(K2.getAbsolutePath(), null, f11, f11, false);
                    }
                    if (z9) {
                        if (z10) {
                            this.r = w7.r(null, fileLocation2);
                            this.h.q0(hc.a(0, chat), "", null, null, null, 0);
                        } else {
                            this.r = null;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        if (z9) {
            return null;
        }
        org.telegram.ui.ActionBar.k6.T(this);
        org.telegram.ui.Components.w8 w8Var = tLObject instanceof TLRPC.User ? new org.telegram.ui.Components.w8(0, (TLRPC.User) tLObject) : new org.telegram.ui.Components.w8((TLRPC.Chat) tLObject);
        w8Var.r = 1;
        float f12 = i7;
        Bitmap createBitmap = Bitmap.createBitmap(g0.L(f12), g0.L(f12), Bitmap.Config.ARGB_8888);
        w8Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        w8Var.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        String str2;
        if (i7 == qs.g2) {
            ij ijVar = MediaController.B().u0;
            if (ijVar != null) {
                a(ijVar, false);
                return;
            } else {
                stopSelf();
                return;
            }
        }
        if (i7 == qs.i2) {
            if (MediaController.B().u0 == null) {
                return;
            }
            long round = Math.round(((Float) objArr[1]).floatValue() * r3.h0) * 1000;
            f(round);
            RemoteControlClient remoteControlClient = this.a;
            if (remoteControlClient != null) {
                remoteControlClient.setPlaybackState(MediaController.B().H() ? 2 : 3, round, MediaController.B().H() ? 0.0f : 1.0f);
                return;
            }
            return;
        }
        if (i7 == qs.R1) {
            String str3 = (String) objArr[0];
            ij ijVar2 = MediaController.B().u0;
            if (ijVar2 == null || (str2 = this.r) == null || !str2.equals(str3)) {
                return;
            }
            a(ijVar2, false);
            return;
        }
        if (i7 == qs.Y1) {
            String str4 = (String) objArr[0];
            ij ijVar3 = MediaController.B().u0;
            if (ijVar3 == null || (str = this.r) == null || !str.equals(str4)) {
                return;
            }
            a(ijVar3, false);
        }
    }

    public final Bitmap e(String str, boolean z9, boolean z10) {
        File A = gc.A(str);
        if (A.exists()) {
            return gc.K(A.getAbsolutePath(), null, z9 ? 600.0f : 100.0f, z9 ? 600.0f : 100.0f, false);
        }
        if (!z10) {
            this.r = null;
            return null;
        }
        this.r = A.getAbsolutePath();
        if (!z9) {
            this.h.o0(str, "48_48", null, null, 0L);
        }
        return null;
    }

    public final void f(long j3) {
        long j10;
        this.d = new android.support.v4.media.session.d0();
        boolean H = MediaController.B().H();
        boolean z9 = !H;
        if (MediaController.B().A0) {
            android.support.v4.media.session.d0 d0Var = this.d;
            d0Var.c(6, 0L, 1.0f);
            d0Var.e = 0L;
        } else {
            ij ijVar = MediaController.B().u0;
            if (ijVar == null || !ijVar.J3()) {
                j10 = 2360070;
            } else {
                int i7 = iz.N0 ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off;
                android.support.v4.media.session.d0 d0Var2 = this.d;
                String M0 = hd.M0(2131745323, null);
                if (TextUtils.isEmpty("org.telegram.android.musicplayer.shuffle")) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(M0)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                d0Var2.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.shuffle", M0, i7, null));
                j10 = 2360118;
            }
            android.support.v4.media.session.d0 d0Var3 = this.d;
            d0Var3.c(!H ? 3 : 2, j3, d(ijVar, z9));
            d0Var3.e = j10;
            if (ijVar != null && ijVar.J3()) {
                int i10 = iz.S0;
                int i11 = i10 != 1 ? i10 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone : R.drawable.player_new_repeatall;
                android.support.v4.media.session.d0 d0Var4 = this.d;
                String M02 = hd.M0(2131746272, null);
                if (TextUtils.isEmpty("org.telegram.android.musicplayer.repeat")) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(M02)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                d0Var4.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.repeat", M02, i11, null));
            }
        }
        this.c.u(this.d.b());
    }

    public final void g() {
        android.support.v4.media.session.a0 a0Var = this.c;
        if (a0Var != null) {
            int i7 = iz.S0;
            a0Var.w(i7 != 1 ? i7 != 2 ? 0 : 1 : 2);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.b = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        for (int i7 = 0; i7 < 4; i7++) {
            qs.f(i7).b(this, qs.i2);
            qs.f(i7).b(this, qs.g2);
            qs.f(i7).b(this, qs.R1);
            qs.f(i7).b(this, qs.Y1);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.g1 = new p1(this, 13);
        this.c = new android.support.v4.media.session.a0(this, "telegramAudioPlayer", (ComponentName) null, (PendingIntent) null);
        this.d = new android.support.v4.media.session.d0();
        this.e = Bitmap.createBitmap(g0.L(102.0f), g0.L(102.0f), Bitmap.Config.ARGB_8888);
        Drawable drawable = getResources().getDrawable(R.drawable.nocover_big);
        drawable.setBounds(0, 0, this.e.getWidth(), this.e.getHeight());
        drawable.draw(new Canvas(this.e));
        this.c.s(new i6.g(this, 1), null);
        this.c.r(true);
        g();
        android.support.v4.media.session.a0 a0Var = this.c;
        if (a0Var != null) {
            a0Var.x(iz.N0 ? 1 : 0);
        }
        registerReceiver(this.s, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        unregisterReceiver(this.s);
        super.onDestroy();
        stopForeground(true);
        RemoteControlClient remoteControlClient = this.a;
        if (remoteControlClient != null) {
            RemoteControlClient.MetadataEditor editMetadata = remoteControlClient.editMetadata(true);
            editMetadata.clear();
            editMetadata.apply();
            this.b.unregisterRemoteControlClient(this.a);
        }
        android.support.v4.media.session.a0 a0Var = this.c;
        if (a0Var != null) {
            a0Var.q();
        }
        for (int i7 = 0; i7 < 4; i7++) {
            qs.f(i7).n(this, qs.i2);
            qs.f(i7).n(this, qs.g2);
            qs.f(i7).n(this, qs.R1);
            qs.f(i7).n(this, qs.Y1);
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
        ij ijVar = MediaController.B().u0;
        if (ijVar == null) {
            g0.h3(new a(this, 29));
            return 1;
        }
        if (w) {
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
                this.a.setTransportControlFlags(qs.T2);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        a(ijVar, false);
        return 1;
    }
}

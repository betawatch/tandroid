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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class MusicPlayerService extends Service implements us {
    public static final boolean w = !TextUtils.isEmpty(i0.k1("ro.miui.ui.version.code"));
    public RemoteControlClient a;
    public AudioManager b;
    public android.support.v4.media.session.a0 c;
    public android.support.v4.media.session.d0 d;
    public Bitmap e;
    public int f;
    public ImageReceiver h;
    public boolean n;
    public String r;
    public final t0 s = new t0(2);

    public static int b(int i10) {
        return (Build.VERSION.SDK_INT >= 31 || !d6.i()) ? i10 : i10 & (-100663297);
    }

    public static float d(jj jjVar, boolean z10) {
        if (!z10) {
            return 0.0f;
        }
        if (jjVar == null) {
            return 1.0f;
        }
        if (jj.R4(jjVar.k) || jjVar.h4()) {
            return MediaController.B().p0;
        }
        return 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0597  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(jj jjVar, boolean z10) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap c10;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        String str;
        long j10;
        String str2;
        String str3;
        cf.a aVar;
        String str4;
        int i10;
        String str5;
        int i11;
        String str6;
        int i12;
        android.support.v4.media.session.a0 a0Var;
        cf.a aVar2;
        String str7;
        Bitmap bitmap3;
        int i13;
        String z12 = jjVar.z1(true);
        String x12 = jjVar.x1(true);
        cf.a aVar3 = MediaController.B().D0;
        Intent intent = new Intent(w0.b, (Class<?>) LaunchActivity.class);
        if (jjVar.I3()) {
            intent.setAction("com.tmessages.openplayer");
            intent.addCategory("android.intent.category.LAUNCHER");
        } else if (jj.R4(jjVar.k) || jjVar.h4()) {
            intent.setAction("android.intent.action.VIEW");
            TLRPC.Peer peer = jjVar.k.peer_id;
            boolean z11 = peer instanceof TLRPC.TL_peerUser;
            long j11 = z11 ? peer.user_id : peer instanceof TLRPC.TL_peerChat ? peer.chat_id : peer instanceof TLRPC.TL_peerChannel ? peer.channel_id : 0L;
            if (j11 != 0) {
                if (z11) {
                    StringBuilder s10 = a1.g.s(j11, "tg://openmessage?user_id=", "&message_id=");
                    s10.append(jjVar.f1());
                    intent.setData(Uri.parse(s10.toString()));
                } else {
                    StringBuilder s11 = a1.g.s(j11, "tg://openmessage?chat_id=", "&message_id=");
                    s11.append(jjVar.f1());
                    intent.setData(Uri.parse(s11.toString()));
                }
            }
        }
        PendingIntent activity = PendingIntent.getActivity(w0.b, 0, intent, b(33554432));
        long L0 = (long) (jjVar.L0() * 1000.0d);
        if (jjVar.I3()) {
            String u02 = jjVar.u0(true);
            String u03 = jjVar.u0(false);
            bitmap2 = aVar3 != null ? aVar3.p : null;
            bitmap = aVar3 != null ? aVar3.o : null;
            this.r = null;
            this.h.w0(null);
            if (bitmap2 != null || TextUtils.isEmpty(u02)) {
                b8.G(d20.s0);
                this.r = b8.I(jjVar.F0()).getAbsolutePath();
            } else {
                boolean z13 = !z10;
                Bitmap e = e(u03, true, z13);
                if (e == null) {
                    bitmap2 = e(u02, false, z13);
                    bitmap = bitmap2;
                } else {
                    bitmap2 = e(u03, false, z13);
                    bitmap = e;
                }
            }
        } else if (jj.R4(jjVar.k) || jjVar.h4()) {
            long S1 = jjVar.S1();
            if (jjVar.p3()) {
                TLRPC.User Z1 = vp.r1(d20.s0).Z1(Long.valueOf(S1));
                if (Z1 != null) {
                    z12 = h20.p(Z1);
                    boolean z14 = !z10;
                    bitmap = c(Z1, true, z14);
                    c10 = c(Z1, false, z14);
                } else {
                    c10 = null;
                    bitmap = null;
                }
            } else {
                TLRPC.Chat L02 = vp.r1(d20.s0).L0(Long.valueOf(-S1));
                if (L02 != null) {
                    z12 = L02.title;
                    boolean z15 = !z10;
                    bitmap = c(L02, true, z15);
                    c10 = c(L02, false, z15);
                } else {
                    bitmap = null;
                    bitmap2 = null;
                    if (bitmap == null && bitmap2 != null) {
                        bitmap = bitmap2;
                    }
                    x12 = !jj.R4(jjVar.k) ? cd.L0(2131753982, null) : cd.L0(2131753941, null);
                }
            }
            bitmap2 = c10;
            if (bitmap == null) {
                bitmap = bitmap2;
            }
            if (!jj.R4(jjVar.k)) {
            }
        } else {
            bitmap = null;
            bitmap2 = null;
        }
        int i14 = Build.VERSION.SDK_INT;
        boolean H = MediaController.B().H();
        boolean z16 = !H;
        Bitmap bitmap4 = bitmap;
        PendingIntent broadcast = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.previous").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), b(301989888));
        PendingIntent service = PendingIntent.getService(getApplicationContext(), 0, new Intent(this, getClass()).setAction(getPackageName() + ".STOP_PLAYER"), b(301989888));
        PendingIntent broadcast2 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(!H ? "org.telegram.android.musicplayer.pause" : "org.telegram.android.musicplayer.play").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), b(301989888));
        PendingIntent broadcast3 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.next").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), b(301989888));
        PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.seek").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), b(301989888));
        PendingIntent broadcast4 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.repeat").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), b(301989888));
        PendingIntent broadcast5 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.shuffle").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), b(301989888));
        Notification.MediaStyle mediaSession = new Notification.MediaStyle().setMediaSession((MediaSession.Token) ((android.support.v4.media.session.u) this.c.b).c.b);
        if (jjVar.I3()) {
            pendingIntent = broadcast;
            pendingIntent2 = broadcast5;
            str = "org.telegram.android.musicplayer.shuffle";
            mediaSession.setShowActionsInCompactView(0, 1, 2, 3, 4);
        } else {
            pendingIntent = broadcast;
            pendingIntent2 = broadcast5;
            str = "org.telegram.android.musicplayer.shuffle";
            if (jj.R4(jjVar.k) || jjVar.h4()) {
                mediaSession.setShowActionsInCompactView(0);
            }
        }
        Notification.Builder builder = new Notification.Builder(this);
        builder.setSmallIcon(R.drawable.player).setOngoing(z16).setContentTitle(z12).setContentText(x12).setSubText((aVar3 == null || !jjVar.I3()) ? null : aVar3.f).setContentIntent(activity).setDeleteIntent(service).setShowWhen(false).setCategory("transport").setPriority(2).setStyle(mediaSession);
        if (i14 >= 26) {
            ot.i();
            builder.setChannelId(ot.j0);
        }
        if (bitmap2 != null) {
            builder.setLargeIcon(bitmap2);
        } else {
            builder.setLargeIcon(this.e);
        }
        String L03 = cd.L0(2131748267, null);
        String L04 = cd.L0(2131754800, null);
        this.d = new android.support.v4.media.session.d0();
        if (MediaController.B().A0) {
            android.support.v4.media.session.d0 d0Var = this.d;
            j10 = 1000;
            d0Var.c(6, 0L, 1.0f);
            d0Var.e = 0L;
            if (jjVar.I3()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_previous, L04, pendingIntent).build());
            }
            builder.addAction(new Notification.Action.Builder(R.drawable.loading_animation2, cd.L0(2131748789, null), (PendingIntent) null).build());
            if (jjVar.I3()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_next, L03, broadcast3).build());
            }
            str2 = z12;
            str3 = x12;
            aVar = aVar3;
            i10 = i14;
        } else {
            PendingIntent pendingIntent3 = pendingIntent;
            j10 = 1000;
            long j12 = jjVar.I3() ? 2360118L : 2360070L;
            if (jjVar.I3()) {
                if (tz.N0) {
                    i10 = i14;
                    i12 = R.drawable.player_new_shuffle;
                } else {
                    i10 = i14;
                    i12 = R.drawable.player_new_shuffle_off;
                }
                aVar = aVar3;
                android.support.v4.media.session.d0 d0Var2 = this.d;
                str2 = z12;
                str3 = x12;
                String L05 = cd.L0(2131745340, null);
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(L05)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                str4 = L03;
                d0Var2.a(new PlaybackStateCompat.CustomAction(str, L05, i12, null));
            } else {
                str2 = z12;
                str3 = x12;
                aVar = aVar3;
                str4 = L03;
                i10 = i14;
            }
            android.support.v4.media.session.d0 d0Var3 = this.d;
            d0Var3.c(!H ? 3 : 2, MediaController.B().u0.g0 * 1000, d(jjVar, z16));
            d0Var3.e = j12;
            boolean I3 = jjVar.I3();
            int i15 = R.drawable.player_new_repeatall;
            if (I3) {
                int i16 = tz.S0;
                int i17 = i16 != 1 ? i16 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone : R.drawable.player_new_repeatall;
                android.support.v4.media.session.d0 d0Var4 = this.d;
                String L06 = cd.L0(2131746288, null);
                if (TextUtils.isEmpty("org.telegram.android.musicplayer.repeat")) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(L06)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                d0Var4.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.repeat", L06, i17, null));
            }
            if (H) {
                str5 = null;
                i11 = 2131754929;
            } else {
                i11 = 2131754930;
                str5 = null;
            }
            String L07 = cd.L0(i11, str5);
            if (jjVar.I3()) {
                builder.addAction(new Notification.Action.Builder(tz.N0 ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off, cd.L0(2131745340, str5), pendingIntent2).build());
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_previous, L04, pendingIntent3).build());
            }
            builder.addAction(new Notification.Action.Builder(!H ? R.drawable.ic_action_pause : R.drawable.ic_action_play, L07, broadcast2).build());
            if (jjVar.I3()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_next, str4, broadcast3).build());
                int i18 = tz.S0;
                if (i18 != 1) {
                    i15 = i18 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone;
                }
                str6 = null;
                builder.addAction(new Notification.Action.Builder(i15, cd.L0(2131746288, null), broadcast4).build());
                this.c.C(this.d.b());
                g();
                a0Var = this.c;
                if (a0Var != null) {
                    a0Var.F(tz.N0 ? 1 : 0);
                }
                a4.l lVar = new a4.l(1);
                String str8 = str3;
                lVar.D("android.media.metadata.ALBUM_ARTIST", str8);
                lVar.D("android.media.metadata.ARTIST", str8);
                lVar.C(L0);
                String str9 = str2;
                lVar.D("android.media.metadata.TITLE", str9);
                if (aVar == null && jjVar.I3()) {
                    aVar2 = aVar;
                    str7 = aVar2.f;
                } else {
                    aVar2 = aVar;
                    str7 = str6;
                }
                lVar.D("android.media.metadata.ALBUM", str7);
                if (bitmap4 != null || bitmap4.isRecycled()) {
                    bitmap3 = bitmap4;
                } else {
                    bitmap3 = bitmap4;
                    lVar.A("android.media.metadata.ALBUM_ART", bitmap3);
                }
                this.c.B(new MediaMetadataCompat((Bundle) lVar.b));
                builder.setVisibility(1);
                Notification build = builder.build();
                if (i10 < 31) {
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
                        i13 = 2;
                        editMetadata.putString(2, str8);
                        editMetadata.putString(7, str9);
                        if (aVar2 != null && !TextUtils.isEmpty(aVar2.f)) {
                            editMetadata.putString(1, aVar2.f);
                        }
                        editMetadata.putLong(9, MediaController.B().u0.h0 * j10);
                        if (bitmap3 != null) {
                            try {
                                editMetadata.putBitmap(100, bitmap3);
                            } catch (Throwable th2) {
                                f8.g(th2, true);
                            }
                        }
                        editMetadata.apply();
                        i0.h3(new mg.c2(this, 6), j10);
                    } else {
                        i13 = 2;
                    }
                    if (MediaController.B().A0) {
                        this.a.setPlaybackState(8);
                        return;
                    }
                    RemoteControlClient.MetadataEditor editMetadata2 = this.a.editMetadata(false);
                    editMetadata2.putLong(9, MediaController.B().u0.h0 * 1000);
                    editMetadata2.apply();
                    this.a.setPlaybackState(MediaController.B().H() ? i13 : 3, Math.max(MediaController.B().u0.g0 * 1000, 100L), MediaController.B().H() ? 0.0f : 1.0f);
                    return;
                }
                return;
            }
        }
        str6 = null;
        this.c.C(this.d.b());
        g();
        a0Var = this.c;
        if (a0Var != null) {
        }
        a4.l lVar2 = new a4.l(1);
        String str82 = str3;
        lVar2.D("android.media.metadata.ALBUM_ARTIST", str82);
        lVar2.D("android.media.metadata.ARTIST", str82);
        lVar2.C(L0);
        String str92 = str2;
        lVar2.D("android.media.metadata.TITLE", str92);
        if (aVar == null) {
        }
        aVar2 = aVar;
        str7 = str6;
        lVar2.D("android.media.metadata.ALBUM", str7);
        if (bitmap4 != null) {
        }
        bitmap3 = bitmap4;
        this.c.B(new MediaMetadataCompat((Bundle) lVar2.b));
        builder.setVisibility(1);
        Notification build2 = builder.build();
        if (i10 < 31) {
        }
        if (this.a == null) {
        }
    }

    public final Bitmap c(TLObject tLObject, boolean z10, boolean z11) {
        int i10 = z10 ? 600 : 100;
        try {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.FileLocation fileLocation = z10 ? user.photo.photo_big : user.photo.photo_small;
                if (fileLocation != null) {
                    b8.G(d20.s0);
                    File K = b8.K(fileLocation, null, true, true);
                    if (K.exists()) {
                        float f7 = i10;
                        return hc.K(K.getAbsolutePath(), null, f7, f7, false);
                    }
                    if (z10) {
                        if (z11) {
                            this.r = b8.r(null, fileLocation);
                            this.h.q0(ic.l(d20.s0, 0, user), "", null, null, null, 0);
                        } else {
                            this.r = null;
                        }
                    }
                }
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                TLRPC.FileLocation fileLocation2 = z10 ? chat.photo.photo_big : chat.photo.photo_small;
                if (fileLocation2 != null) {
                    b8.G(d20.s0);
                    File K2 = b8.K(fileLocation2, null, true, true);
                    if (K2.exists()) {
                        float f10 = i10;
                        return hc.K(K2.getAbsolutePath(), null, f10, f10, false);
                    }
                    if (z10) {
                        if (z11) {
                            this.r = b8.r(null, fileLocation2);
                            this.h.q0(ic.a(0, chat), "", null, null, null, 0);
                        } else {
                            this.r = null;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
        if (z10) {
            return null;
        }
        org.telegram.ui.ActionBar.t6.T(this);
        org.telegram.ui.Components.r8 r8Var = tLObject instanceof TLRPC.User ? new org.telegram.ui.Components.r8(0, (TLRPC.User) tLObject) : new org.telegram.ui.Components.r8((TLRPC.Chat) tLObject);
        r8Var.r = 1;
        float f11 = i10;
        Bitmap createBitmap = Bitmap.createBitmap(i0.L(f11), i0.L(f11), Bitmap.Config.ARGB_8888);
        r8Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        r8Var.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        String str2;
        if (i10 == zs.g2) {
            jj jjVar = MediaController.B().u0;
            if (jjVar != null) {
                a(jjVar, false);
                return;
            } else {
                stopSelf();
                return;
            }
        }
        if (i10 == zs.i2) {
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
        if (i10 == zs.R1) {
            String str3 = (String) objArr[0];
            jj jjVar2 = MediaController.B().u0;
            if (jjVar2 == null || (str2 = this.r) == null || !str2.equals(str3)) {
                return;
            }
            a(jjVar2, false);
            return;
        }
        if (i10 == zs.Y1) {
            String str4 = (String) objArr[0];
            jj jjVar3 = MediaController.B().u0;
            if (jjVar3 == null || (str = this.r) == null || !str.equals(str4)) {
                return;
            }
            a(jjVar3, false);
        }
    }

    public final Bitmap e(String str, boolean z10, boolean z11) {
        File A = hc.A(str);
        if (A.exists()) {
            return hc.K(A.getAbsolutePath(), null, z10 ? 600.0f : 100.0f, z10 ? 600.0f : 100.0f, false);
        }
        if (!z11) {
            this.r = null;
            return null;
        }
        this.r = A.getAbsolutePath();
        if (!z10) {
            this.h.o0(str, "48_48", null, null, 0L);
        }
        return null;
    }

    public final void f(long j10) {
        long j11;
        this.d = new android.support.v4.media.session.d0();
        boolean H = MediaController.B().H();
        boolean z10 = !H;
        if (MediaController.B().A0) {
            android.support.v4.media.session.d0 d0Var = this.d;
            d0Var.c(6, 0L, 1.0f);
            d0Var.e = 0L;
        } else {
            jj jjVar = MediaController.B().u0;
            if (jjVar == null || !jjVar.I3()) {
                j11 = 2360070;
            } else {
                int i10 = tz.N0 ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off;
                android.support.v4.media.session.d0 d0Var2 = this.d;
                String L0 = cd.L0(2131745340, null);
                if (TextUtils.isEmpty("org.telegram.android.musicplayer.shuffle")) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(L0)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                d0Var2.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.shuffle", L0, i10, null));
                j11 = 2360118;
            }
            android.support.v4.media.session.d0 d0Var3 = this.d;
            d0Var3.c(!H ? 3 : 2, j10, d(jjVar, z10));
            d0Var3.e = j11;
            if (jjVar != null && jjVar.I3()) {
                int i11 = tz.S0;
                int i12 = i11 != 1 ? i11 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone : R.drawable.player_new_repeatall;
                android.support.v4.media.session.d0 d0Var4 = this.d;
                String L02 = cd.L0(2131746288, null);
                if (TextUtils.isEmpty("org.telegram.android.musicplayer.repeat")) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(L02)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                d0Var4.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.repeat", L02, i12, null));
            }
        }
        this.c.C(this.d.b());
    }

    public final void g() {
        android.support.v4.media.session.a0 a0Var = this.c;
        if (a0Var != null) {
            int i10 = tz.S0;
            a0Var.E(i10 != 1 ? i10 != 2 ? 0 : 1 : 2);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.b = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        for (int i10 = 0; i10 < 4; i10++) {
            zs.f(i10).b(this, zs.i2);
            zs.f(i10).b(this, zs.g2);
            zs.f(i10).b(this, zs.R1);
            zs.f(i10).b(this, zs.Y1);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.g1 = new s1(this, 12);
        this.c = new android.support.v4.media.session.a0(this, "telegramAudioPlayer", (ComponentName) null, (PendingIntent) null);
        this.d = new android.support.v4.media.session.d0();
        this.e = Bitmap.createBitmap(i0.L(102.0f), i0.L(102.0f), Bitmap.Config.ARGB_8888);
        Drawable drawable = getResources().getDrawable(R.drawable.nocover_big);
        drawable.setBounds(0, 0, this.e.getWidth(), this.e.getHeight());
        drawable.draw(new Canvas(this.e));
        this.c.z(new f6.h(this, 1), null);
        this.c.x(true);
        g();
        android.support.v4.media.session.a0 a0Var = this.c;
        if (a0Var != null) {
            a0Var.F(tz.N0 ? 1 : 0);
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
            a0Var.u();
        }
        for (int i10 = 0; i10 < 4; i10++) {
            zs.f(i10).n(this, zs.i2);
            zs.f(i10).n(this, zs.g2);
            zs.f(i10).n(this, zs.R1);
            zs.f(i10).n(this, zs.Y1);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        if (intent != null) {
            try {
                if ((getPackageName() + ".STOP_PLAYER").equals(intent.getAction())) {
                    MediaController.B().q(true, true, false, false);
                    return 2;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        jj jjVar = MediaController.B().u0;
        if (jjVar == null) {
            i0.g3(new a(this, 29));
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
                this.a.setTransportControlFlags(zs.T2);
            } catch (Exception e7) {
                f8.g(e7, true);
            }
        }
        a(jjVar, false);
        return 1;
    }
}

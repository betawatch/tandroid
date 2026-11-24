package org.telegram.messenger;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
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
import android.support.v4.media.session.f;
import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class MusicPlayerService extends Service implements jm7 {
    public static final boolean s;
    public static mx6 w;
    public RemoteControlClient a;
    public AudioManager b;
    public f c;
    public Bitmap d;
    public int e;
    public ImageReceiver f;
    public boolean h;
    public String n;
    public final ts r = new ts(2);

    static {
        s = Build.VERSION.SDK_INT < 29 && !TextUtils.isEmpty(gm.j1("ro.miui.ui.version.code"));
    }

    public static int b(int i) {
        return (Build.VERSION.SDK_INT >= 31 || !p0f.b()) ? i : i & (-100663297);
    }

    public static float d(k47 k47Var, boolean z) {
        if (!z) {
            return 0.0f;
        }
        if (k47Var == null) {
            return 1.0f;
        }
        if (k47.Q4(k47Var.k) || k47Var.g4()) {
            return MediaController.w().q0;
        }
        return 1.0f;
    }

    public static void g() {
        if (w != null) {
            int i = gda.O0;
            w.t0(i != 1 ? i != 2 ? 0 : 1 : 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x055d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(k47 k47Var, boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap c;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        String str;
        long j;
        String str2;
        String str3;
        g10 g10Var;
        int i;
        String str4;
        String str5;
        mx6 mx6Var;
        g10 g10Var2;
        String str6;
        Bitmap bitmap3;
        int i2;
        byte b;
        String y1 = k47Var.y1(true);
        String w1 = k47Var.w1(true);
        g10 g10Var3 = MediaController.w().E0;
        Intent intent = new Intent(a.b, (Class<?>) LaunchActivity.class);
        if (k47Var.I3()) {
            intent.setAction("com.tmessages.openplayer");
            intent.addCategory("android.intent.category.LAUNCHER");
        } else if (k47.Q4(k47Var.k) || k47Var.g4()) {
            intent.setAction("android.intent.action.VIEW");
            TLRPC.Peer peer = k47Var.k.peer_id;
            boolean z2 = peer instanceof TLRPC.TL_peerUser;
            long j2 = z2 ? peer.user_id : peer instanceof TLRPC.TL_peerChat ? peer.chat_id : peer instanceof TLRPC.TL_peerChannel ? peer.channel_id : 0L;
            if (j2 != 0) {
                if (z2) {
                    StringBuilder o = wi8.o(j2, "tg://openmessage?user_id=", "&message_id=");
                    o.append(k47Var.e1());
                    intent.setData(Uri.parse(o.toString()));
                } else {
                    StringBuilder o2 = wi8.o(j2, "tg://openmessage?chat_id=", "&message_id=");
                    o2.append(k47Var.e1());
                    intent.setData(Uri.parse(o2.toString()));
                }
            }
        }
        PendingIntent activity = PendingIntent.getActivity(a.b, 0, intent, b(33554432));
        long L0 = (long) (k47Var.L0() * 1000.0d);
        if (k47Var.I3()) {
            String u0 = k47Var.u0(true);
            String u02 = k47Var.u0(false);
            if (g10Var3 != null) {
                bitmap2 = g10Var3.p;
                bitmap = g10Var3.o;
            } else {
                bitmap = null;
                bitmap2 = null;
            }
            this.n = null;
            this.f.g0(null);
            if (bitmap2 != null || TextUtils.isEmpty(u0)) {
                bc4.G(z8c.t0);
                this.n = bc4.I(k47Var.F0()).getAbsolutePath();
            } else {
                boolean z3 = !z;
                Bitmap e = e(u02, true, z3);
                if (e == null) {
                    bitmap = e(u0, false, z3);
                    bitmap2 = bitmap;
                } else {
                    bitmap2 = e(u02, false, z3);
                    bitmap = e;
                }
            }
        } else if (k47.Q4(k47Var.k) || k47Var.g4()) {
            long R1 = k47Var.R1();
            boolean p3 = k47Var.p3();
            int i3 = z8c.t0;
            if (p3) {
                TLRPC.User W1 = oc7.r1(i3).W1(Long.valueOf(R1));
                if (W1 != null) {
                    y1 = m9c.r(W1);
                    boolean z4 = !z;
                    bitmap = c(W1, true, z4);
                    c = c(W1, false, z4);
                } else {
                    c = null;
                    bitmap = null;
                }
            } else {
                TLRPC.Chat L02 = oc7.r1(i3).L0(Long.valueOf(-R1));
                if (L02 != null) {
                    y1 = L02.title;
                    boolean z5 = !z;
                    bitmap = c(L02, true, z5);
                    c = c(L02, false, z5);
                } else {
                    bitmap = null;
                    bitmap2 = null;
                    if (bitmap == null && bitmap2 != null) {
                        bitmap = bitmap2;
                    }
                    w1 = !k47.Q4(k47Var.k) ? jb6.M0(2131753947, null) : jb6.M0(2131753906, null);
                }
            }
            bitmap2 = c;
            if (bitmap == null) {
                bitmap = bitmap2;
            }
            if (!k47.Q4(k47Var.k)) {
            }
        } else {
            bitmap = null;
            bitmap2 = bitmap;
        }
        boolean C = MediaController.w().C();
        boolean z6 = !C;
        PendingIntent broadcast = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.previous").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), b(301989888));
        Context applicationContext = getApplicationContext();
        Intent intent2 = new Intent(this, getClass());
        StringBuilder sb = new StringBuilder();
        Bitmap bitmap4 = bitmap;
        sb.append(getPackageName());
        sb.append(".STOP_PLAYER");
        PendingIntent service = PendingIntent.getService(applicationContext, 0, intent2.setAction(sb.toString()), b(301989888));
        PendingIntent broadcast2 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(!C ? "org.telegram.android.musicplayer.pause" : "org.telegram.android.musicplayer.play").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), b(301989888));
        PendingIntent broadcast3 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.next").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), b(301989888));
        PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.seek").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), b(301989888));
        PendingIntent broadcast4 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.repeat").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), b(301989888));
        PendingIntent broadcast5 = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("org.telegram.android.musicplayer.shuffle").setComponent(new ComponentName(this, (Class<?>) MusicPlayerReceiver.class)), b(301989888));
        Notification.MediaStyle mediaSession = new Notification.MediaStyle().setMediaSession((MediaSession.Token) ((zw6) w.b).c.b);
        if (k47Var.I3()) {
            pendingIntent = broadcast5;
            pendingIntent2 = broadcast3;
            str = "org.telegram.android.musicplayer.shuffle";
            mediaSession.setShowActionsInCompactView(0, 1, 2, 3, 4);
        } else {
            pendingIntent = broadcast5;
            pendingIntent2 = broadcast3;
            str = "org.telegram.android.musicplayer.shuffle";
            if (k47.Q4(k47Var.k) || k47Var.g4()) {
                mediaSession.setShowActionsInCompactView(0);
            }
        }
        Notification.Builder builder = new Notification.Builder(this);
        builder.setSmallIcon(R.drawable.player).setOngoing(z6).setContentTitle(y1).setContentText(w1).setSubText((g10Var3 == null || !k47Var.I3()) ? null : g10Var3.f).setContentIntent(activity).setDeleteIntent(service).setShowWhen(false).setCategory("transport").setPriority(2).setStyle(mediaSession);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            lo7.c();
            builder.setChannelId(lo7.k0);
        }
        if (bitmap2 != null) {
            builder.setLargeIcon(bitmap2);
        } else {
            builder.setLargeIcon(this.d);
        }
        String M0 = jb6.M0(2131747984, null);
        String M02 = jb6.M0(2131754799, null);
        this.c = new f();
        if (MediaController.w().B0) {
            f fVar = this.c;
            j = 1000;
            fVar.c(6, 0L, 1.0f);
            fVar.e = 0L;
            if (k47Var.I3()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_previous, M02, broadcast).build());
            }
            builder.addAction(new Notification.Action.Builder(R.drawable.loading_animation2, jb6.M0(2131748536, null), (PendingIntent) null).build());
            if (k47Var.I3()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_next, M0, pendingIntent2).build());
            }
            str2 = y1;
            str3 = w1;
            g10Var = g10Var3;
            i = i4;
        } else {
            PendingIntent pendingIntent3 = pendingIntent2;
            j = 1000;
            long j3 = k47Var.I3() ? 2360118L : 2360070L;
            if (k47Var.I3()) {
                int i5 = gda.J0 ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off;
                i = i4;
                f fVar2 = this.c;
                str2 = y1;
                g10Var = g10Var3;
                String M03 = jb6.M0(2131745056, null);
                if (TextUtils.isEmpty(M03)) {
                    u36.j("You must specify a name to build a CustomAction");
                    return;
                } else {
                    str3 = w1;
                    fVar2.a(new PlaybackStateCompat.CustomAction(str, M03, i5, null));
                }
            } else {
                str2 = y1;
                str3 = w1;
                g10Var = g10Var3;
                i = i4;
            }
            f fVar3 = this.c;
            fVar3.c(!C ? 3 : 2, MediaController.w().v0.i0 * 1000, d(k47Var, z6));
            fVar3.e = j3;
            if (k47Var.I3()) {
                int i6 = gda.O0;
                int i7 = i6 != 1 ? i6 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone : R.drawable.player_new_repeatall;
                f fVar4 = this.c;
                str4 = null;
                String M04 = jb6.M0(2131746006, null);
                if (TextUtils.isEmpty(M04)) {
                    u36.j("You must specify a name to build a CustomAction");
                    return;
                }
                fVar4.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.repeat", M04, i7, null));
            } else {
                str4 = null;
            }
            String M05 = jb6.M0(!C ? 2131754930 : 2131754929, str4);
            if (k47Var.I3()) {
                builder.addAction(new Notification.Action.Builder(gda.J0 ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off, jb6.M0(2131745056, str4), pendingIntent).build());
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_previous, M02, broadcast).build());
            }
            builder.addAction(new Notification.Action.Builder(!C ? R.drawable.ic_action_pause : R.drawable.ic_action_play, M05, broadcast2).build());
            if (k47Var.I3()) {
                builder.addAction(new Notification.Action.Builder(R.drawable.ic_action_next, M0, pendingIntent3).build());
                int i8 = gda.O0;
                str5 = null;
                builder.addAction(new Notification.Action.Builder(i8 != 1 ? i8 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone : R.drawable.player_new_repeatall, jb6.M0(2131746006, null), broadcast4).build());
                w.r0(this.c.b());
                g();
                mx6Var = w;
                if (mx6Var != null) {
                    mx6Var.u0(gda.J0 ? 1 : 0);
                }
                k44 k44Var = new k44((byte) 17);
                String str7 = str3;
                k44Var.U("android.media.metadata.ALBUM_ARTIST", str7);
                k44Var.U("android.media.metadata.ARTIST", str7);
                k44Var.T(L0);
                String str8 = str2;
                k44Var.U("android.media.metadata.TITLE", str8);
                if (g10Var == null && k47Var.I3()) {
                    g10Var2 = g10Var;
                    str6 = g10Var2.f;
                } else {
                    g10Var2 = g10Var;
                    str6 = str5;
                }
                k44Var.U("android.media.metadata.ALBUM", str6);
                if (bitmap4 != null || bitmap4.isRecycled()) {
                    bitmap3 = bitmap4;
                } else {
                    bitmap3 = bitmap4;
                    k44Var.Q("android.media.metadata.ALBUM_ART", bitmap3);
                }
                w.q0(new MediaMetadataCompat((Bundle) k44Var.b));
                builder.setVisibility(1);
                Notification build = builder.build();
                if (i < 31) {
                    if (this.h) {
                        ((NotificationManager) getSystemService("notification")).notify(5, build);
                    } else {
                        this.h = true;
                        startForeground(5, build);
                    }
                } else if (C) {
                    stopForeground(false);
                    ((NotificationManager) getSystemService("notification")).notify(5, build);
                } else {
                    startForeground(5, build);
                }
                if (this.a == null) {
                    int e1 = MediaController.w().v0.e1();
                    if (this.e != e1) {
                        this.e = e1;
                        RemoteControlClient.MetadataEditor editMetadata = this.a.editMetadata(true);
                        i2 = 2;
                        editMetadata.putString(2, str7);
                        editMetadata.putString(7, str8);
                        if (g10Var2 != null && !TextUtils.isEmpty(g10Var2.f)) {
                            editMetadata.putString(1, g10Var2.f);
                        }
                        editMetadata.putLong(9, MediaController.w().v0.j0 * j);
                        if (bitmap3 != null) {
                            try {
                                editMetadata.putBitmap(100, bitmap3);
                            } catch (Throwable th) {
                                b = 1;
                                fc4.g(th, true);
                            }
                        }
                        b = 1;
                        editMetadata.apply();
                        gm.d3(new ei7(this, b), j);
                    } else {
                        i2 = 2;
                    }
                    boolean z7 = MediaController.w().B0;
                    RemoteControlClient remoteControlClient = this.a;
                    if (z7) {
                        remoteControlClient.setPlaybackState(8);
                        return;
                    }
                    RemoteControlClient.MetadataEditor editMetadata2 = remoteControlClient.editMetadata(false);
                    editMetadata2.putLong(9, MediaController.w().v0.j0 * 1000);
                    editMetadata2.apply();
                    this.a.setPlaybackState(MediaController.w().C() ? i2 : 3, Math.max(MediaController.w().v0.i0 * 1000, 100L), MediaController.w().C() ? 0.0f : 1.0f);
                    return;
                }
                return;
            }
        }
        str5 = null;
        w.r0(this.c.b());
        g();
        mx6Var = w;
        if (mx6Var != null) {
        }
        k44 k44Var2 = new k44((byte) 17);
        String str72 = str3;
        k44Var2.U("android.media.metadata.ALBUM_ARTIST", str72);
        k44Var2.U("android.media.metadata.ARTIST", str72);
        k44Var2.T(L0);
        String str82 = str2;
        k44Var2.U("android.media.metadata.TITLE", str82);
        if (g10Var == null) {
        }
        g10Var2 = g10Var;
        str6 = str5;
        k44Var2.U("android.media.metadata.ALBUM", str6);
        if (bitmap4 != null) {
        }
        bitmap3 = bitmap4;
        w.q0(new MediaMetadataCompat((Bundle) k44Var2.b));
        builder.setVisibility(1);
        Notification build2 = builder.build();
        if (i < 31) {
        }
        if (this.a == null) {
        }
    }

    public final Bitmap c(TLObject tLObject, boolean z, boolean z2) {
        int i = z ? 600 : 100;
        try {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                TLRPC.FileLocation fileLocation = z ? userProfilePhoto.photo_big : userProfilePhoto.photo_small;
                if (fileLocation != null) {
                    bc4.G(z8c.t0);
                    File J = bc4.J(fileLocation, null, true, true);
                    if (J.exists()) {
                        float f = i;
                        return fn5.G(J.getAbsolutePath(), null, f, f, false);
                    }
                    if (z) {
                        if (z2) {
                            this.n = bc4.r(null, fileLocation);
                            this.f.d0(gn5.l(z8c.t0, 0, user), "", null, null, null, 0);
                        } else {
                            this.n = null;
                        }
                    }
                }
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                TLRPC.FileLocation fileLocation2 = z ? chatPhoto.photo_big : chatPhoto.photo_small;
                if (fileLocation2 != null) {
                    bc4.G(z8c.t0);
                    File J2 = bc4.J(fileLocation2, null, true, true);
                    if (J2.exists()) {
                        float f2 = i;
                        return fn5.G(J2.getAbsolutePath(), null, f2, f2, false);
                    }
                    if (z) {
                        if (z2) {
                            this.n = bc4.r(null, fileLocation2);
                            this.f.d0(gn5.a(0, chat), "", null, null, null, 0);
                        } else {
                            this.n = null;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            fc4.g(th, true);
        }
        if (z) {
            return null;
        }
        cmb.S(this);
        pc0 pc0Var = tLObject instanceof TLRPC.User ? new pc0(0, (TLRPC.User) tLObject) : new pc0((TLRPC.Chat) tLObject);
        pc0Var.r = 1;
        float f3 = i;
        Bitmap createBitmap = Bitmap.createBitmap(gm.L(f3), gm.L(f3), Bitmap.Config.ARGB_8888);
        pc0Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        pc0Var.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        String str2;
        if (i == nm7.g2) {
            k47 k47Var = MediaController.w().v0;
            if (k47Var != null) {
                a(k47Var, false);
                return;
            } else {
                stopSelf();
                return;
            }
        }
        if (i == nm7.i2) {
            if (MediaController.w().v0 != null) {
                long round = Math.round(((Float) objArr[1]).floatValue() * r3.j0) * 1000;
                f(round);
                RemoteControlClient remoteControlClient = this.a;
                if (remoteControlClient != null) {
                    remoteControlClient.setPlaybackState(MediaController.w().C() ? 2 : 3, round, MediaController.w().C() ? 0.0f : 1.0f);
                    return;
                }
                return;
            }
            return;
        }
        if (i == nm7.R1) {
            String str3 = (String) objArr[0];
            k47 k47Var2 = MediaController.w().v0;
            if (k47Var2 == null || (str2 = this.n) == null || !str2.equals(str3)) {
                return;
            }
            a(k47Var2, false);
            return;
        }
        if (i == nm7.Y1) {
            String str4 = (String) objArr[0];
            k47 k47Var3 = MediaController.w().v0;
            if (k47Var3 == null || (str = this.n) == null || !str.equals(str4)) {
                return;
            }
            a(k47Var3, false);
        }
    }

    public final Bitmap e(String str, boolean z, boolean z2) {
        File w2 = fn5.w(str);
        if (w2.exists()) {
            String absolutePath = w2.getAbsolutePath();
            float f = z ? 600.0f : 100.0f;
            return fn5.G(absolutePath, null, f, f, false);
        }
        if (!z2) {
            this.n = null;
            return null;
        }
        this.n = w2.getAbsolutePath();
        if (!z) {
            this.f.e0(str, "48_48", null, null, 0L);
        }
        return null;
    }

    public final void f(long j) {
        long j2;
        this.c = new f();
        boolean C = MediaController.w().C();
        boolean z = !C;
        if (MediaController.w().B0) {
            f fVar = this.c;
            fVar.c(6, 0L, 1.0f);
            fVar.e = 0L;
        } else {
            k47 k47Var = MediaController.w().v0;
            if (k47Var == null || !k47Var.I3()) {
                j2 = 2360070;
            } else {
                int i = gda.J0 ? R.drawable.player_new_shuffle : R.drawable.player_new_shuffle_off;
                f fVar2 = this.c;
                String M0 = jb6.M0(2131745056, null);
                if (TextUtils.isEmpty(M0)) {
                    u36.j("You must specify a name to build a CustomAction");
                    return;
                } else {
                    fVar2.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.shuffle", M0, i, null));
                    j2 = 2360118;
                }
            }
            f fVar3 = this.c;
            fVar3.c(!C ? 3 : 2, j, d(k47Var, z));
            fVar3.e = j2;
            if (k47Var != null && k47Var.I3()) {
                int i2 = gda.O0;
                int i3 = i2 != 1 ? i2 != 2 ? R.drawable.player_new_repeat_off : R.drawable.player_new_repeatone : R.drawable.player_new_repeatall;
                f fVar4 = this.c;
                String M02 = jb6.M0(2131746006, null);
                if (TextUtils.isEmpty(M02)) {
                    u36.j("You must specify a name to build a CustomAction");
                    return;
                }
                fVar4.a(new PlaybackStateCompat.CustomAction("org.telegram.android.musicplayer.repeat", M02, i3, null));
            }
        }
        w.r0(this.c.b());
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.b = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        byte b = 0;
        for (int i = 0; i < 4; i++) {
            nm7.f(i).a(this, nm7.i2);
            nm7.f(i).a(this, nm7.g2);
            nm7.f(i).a(this, nm7.R1);
            nm7.f(i).a(this, nm7.Y1);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f = imageReceiver;
        imageReceiver.h1 = new cj6(this, (byte) 16);
        if (w == null) {
            w = new mx6(getApplicationContext(), "telegramAudioPlayer", (ComponentName) null, (PendingIntent) null);
        }
        this.c = new f();
        this.d = Bitmap.createBitmap(gm.L(102.0f), gm.L(102.0f), Bitmap.Config.ARGB_8888);
        Drawable drawable = getResources().getDrawable(R.drawable.nocover_big);
        drawable.setBounds(0, 0, this.d.getWidth(), this.d.getHeight());
        drawable.draw(new Canvas(this.d));
        w.o0(new hj7(this, b), null);
        w.l0(true);
        g();
        mx6 mx6Var = w;
        if (mx6Var != null) {
            mx6Var.u0(gda.J0 ? 1 : 0);
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
        mx6 mx6Var = w;
        if (mx6Var != null) {
            mx6Var.o0(null, null);
            w.l0(false);
        }
        for (int i = 0; i < 4; i++) {
            nm7.f(i).n(this, nm7.i2);
            nm7.f(i).n(this, nm7.g2);
            nm7.f(i).n(this, nm7.R1);
            nm7.f(i).n(this, nm7.Y1);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            try {
                if ((getPackageName() + ".STOP_PLAYER").equals(intent.getAction())) {
                    MediaController.w().l(true, true, false, false);
                    return 2;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        k47 k47Var = MediaController.w().v0;
        if (k47Var == null) {
            gm.c3(new pg6(this, (byte) 27));
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
                this.a.setTransportControlFlags(nm7.S2);
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
        a(k47Var, false);
        return 1;
    }
}

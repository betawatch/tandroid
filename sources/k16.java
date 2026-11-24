// default package

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.CancellationTokenSource;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class k16 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k16(k11 k11Var, he heVar) {
        this.a = (byte) 1;
        this.b = k11Var;
        this.c = heVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0742 A[Catch: all -> 0x07e0, InterruptedException -> 0x0824, TryCatch #3 {InterruptedException -> 0x0824, all -> 0x07e0, blocks: (B:130:0x062a, B:132:0x062e, B:134:0x0638, B:135:0x0642, B:137:0x064a, B:139:0x0660, B:141:0x0667, B:144:0x066d, B:147:0x0673, B:149:0x067b, B:151:0x0690, B:153:0x0694, B:154:0x06a3, B:155:0x06ab, B:162:0x06e6, B:163:0x06e8, B:168:0x06f1, B:170:0x06f5, B:172:0x06fe, B:174:0x0709, B:176:0x0711, B:178:0x0730, B:179:0x0738, B:180:0x073e, B:182:0x0742, B:187:0x074e, B:189:0x0759, B:190:0x0760, B:198:0x06b6, B:200:0x06d0, B:208:0x0767, B:210:0x0771, B:213:0x0776, B:215:0x077c, B:219:0x0790, B:224:0x07a5, B:226:0x07a9, B:228:0x07b1, B:221:0x07b8, B:235:0x07bb), top: B:129:0x062a }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        ByteBuffer byteBuffer;
        long j;
        String nativeSessionPush;
        String nativeSessionPush2;
        VoIPService sharedInstance;
        s96 s96Var;
        int i3;
        int i4;
        byte b = 5;
        float f = 0.0f;
        byte b2 = 2;
        byte b3 = 0;
        switch (this.a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                k11 k11Var = (k11) this.b;
                String str = LaunchActivity.C1;
                launchActivity.P0 = null;
                launchActivity.Q0 = null;
                launchActivity.R0 = null;
                launchActivity.S0 = null;
                launchActivity.V0 = null;
                launchActivity.T0 = null;
                if (k11Var != null) {
                    k11Var.b();
                    return;
                }
                return;
            case 1:
                k11 k11Var2 = (k11) this.b;
                he heVar = (he) this.c;
                String str2 = LaunchActivity.C1;
                if (k11Var2 != null) {
                    k11Var2.b();
                }
                heVar.dismiss();
                return;
            case 2:
                i46 i46Var = (i46) this.c;
                TLObject tLObject = (TLObject) this.b;
                ArrayList arrayList = i46Var.d2;
                r59 r59Var = i46Var.n1;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    i46Var.D2 = false;
                    i46Var.E2.b(i46Var.i2 + 4);
                    int i5 = 0;
                    while (true) {
                        if (i5 >= r59Var.getChildCount()) {
                            i = 0;
                        } else if (r59Var.getChildAt(i5) instanceof g46) {
                            i = r59Var.getChildAt(i5).getTop();
                        } else {
                            i5++;
                        }
                    }
                    i46Var.x1();
                    if (i46Var.g2 >= 0 && i != 0) {
                        ((u46) r59Var.getLayoutManager()).g1(i46Var.g2 + 1, i);
                    }
                }
                int max = Math.max(arrayList.size(), i46Var.H2.e);
                i46Var.s2.j(max, false);
                i46Var.s2.setBagePosition(max / i46Var.H2.f);
                f46 f46Var = i46Var.s2;
                f46Var.I = true;
                f46Var.requestLayout();
                return;
            case 3:
                ((i46) this.c).Y0((fa6) this.b, true);
                return;
            case 4:
                a66 a66Var = (a66) this.c;
                TLObject tLObject2 = (TLObject) this.b;
                a66Var.c();
                if (tLObject2 != null) {
                    a66Var.a.k0((TL_account.Password) tLObject2);
                    return;
                }
                return;
            case 5:
                ((FiltersSetupActivity) this.b).c0(((a66) this.c).a.N());
                return;
            case 6:
                g66 g66Var = (g66) this.c;
                if (g66Var.P0 == ((m66) this.b)) {
                    g66Var.performLongClick();
                    g66Var.P0 = null;
                    g66Var.N0.e(true);
                    return;
                }
                return;
            case 7:
                ((i66) this.c).m((qa6) this.b, false);
                return;
            case 8:
                q86 q86Var = (q86) this.c;
                in3 in3Var = (in3) this.b;
                q86Var.getClass();
                DictationAsr.O();
                SparseArray sparseArray = new SparseArray();
                int i6 = 0;
                while (q86Var.d) {
                    try {
                        byte[] readIncomingAudio = NativeInstance.readIncomingAudio();
                        long currentTimeMillis = System.currentTimeMillis();
                        if (readIncomingAudio != null) {
                            ByteBuffer order = ByteBuffer.wrap(readIncomingAudio).order(ByteOrder.LITTLE_ENDIAN);
                            while (order.remaining() >= 8) {
                                int i7 = order.getInt();
                                int i8 = order.getInt() << 1;
                                int position = order.position();
                                if (i8 <= order.remaining()) {
                                    order.position(position + i8);
                                    if (i7 != 0 || ((sharedInstance = VoIPService.getSharedInstance()) != null && !sharedInstance.isMicMute())) {
                                        p86 p86Var = (p86) sparseArray.get(i7);
                                        if (p86Var == null) {
                                            p86Var = new p86(q86Var, i7);
                                            long j2 = q86Var.f;
                                            i2 = i8;
                                            q86Var.f = j2 + 1;
                                            p86Var.f = j2;
                                            if (i7 == 0 && q86Var.c) {
                                                ExecutorService executorService = DictationLid.a;
                                                p86Var.k = oc7.d1().getString("tinylid_lang", null);
                                            }
                                            sparseArray.put(i7, p86Var);
                                        } else {
                                            i2 = i8;
                                        }
                                        int i9 = i2 / 2;
                                        if (i9 == 0) {
                                            byteBuffer = order;
                                        } else {
                                            double d = 0.0d;
                                            int i10 = 0;
                                            while (i10 < i9) {
                                                int i11 = (i10 << 1) + position;
                                                short s = (short) ((readIncomingAudio[i11] & 255) | (readIncomingAudio[i11 + 1] << 8));
                                                ByteBuffer byteBuffer2 = order;
                                                double d2 = s;
                                                d = (d2 * d2) + d;
                                                i10++;
                                                order = byteBuffer2;
                                            }
                                            byteBuffer = order;
                                            f = (float) Math.sqrt(d / i9);
                                        }
                                        boolean z = f >= 400.0f;
                                        if (z) {
                                            p86Var.e = currentTimeMillis;
                                        }
                                        if (p86Var.d == null) {
                                            if (z && i6 < 4) {
                                                String str3 = p86Var.k;
                                                in3 X = str3 != null ? DictationAsr.X(str3, in3Var, false) : null;
                                                if (X == null || !DictationAsr.A((gn3) X.b)) {
                                                    X = in3Var;
                                                }
                                                kn3 c = kn3.c(X, p86Var);
                                                p86Var.d = c;
                                                if (c != null) {
                                                    i6++;
                                                    p86Var.h = 0;
                                                    p86Var.g = 0;
                                                    p86Var.e();
                                                    p86Var.c(0, p86Var.c, p86Var.b);
                                                    kn3 kn3Var = p86Var.d;
                                                    byte[] bArr = p86Var.b;
                                                    int i12 = p86Var.c;
                                                    j = 0;
                                                    long j3 = kn3Var.c;
                                                    if (j3 != 0) {
                                                        nativeSessionPush2 = DictationAsr.nativeSessionPush(j3, bArr, 0, i12);
                                                        kn3Var.b(nativeSessionPush2);
                                                    }
                                                    p86Var.c = 0;
                                                    if (p86Var.d == null) {
                                                        p86Var.d(position, i2, readIncomingAudio);
                                                        order = byteBuffer;
                                                        f = 0.0f;
                                                    }
                                                }
                                            }
                                            j = 0;
                                            if (p86Var.d == null) {
                                            }
                                        } else {
                                            j = 0;
                                        }
                                        int i13 = i2;
                                        p86Var.c(position, i13, readIncomingAudio);
                                        kn3 kn3Var2 = p86Var.d;
                                        long j4 = kn3Var2.c;
                                        if (j4 != j) {
                                            nativeSessionPush = DictationAsr.nativeSessionPush(j4, readIncomingAudio, position, i13);
                                            kn3Var2.b(nativeSessionPush);
                                        }
                                        p86Var.a();
                                        order = byteBuffer;
                                        f = 0.0f;
                                    }
                                }
                            }
                        }
                        while (true) {
                            Runnable runnable = (Runnable) q86Var.b.poll();
                            if (runnable != null) {
                                runnable.run();
                            } else {
                                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                                    p86 p86Var2 = (p86) sparseArray.valueAt(i14);
                                    long j5 = currentTimeMillis - p86Var2.e;
                                    kn3 kn3Var3 = p86Var2.d;
                                    if (kn3Var3 != null) {
                                        if (j5 > 6000) {
                                            kn3Var3.a();
                                            p86Var2.d = null;
                                            i6--;
                                            p86Var2.b();
                                            p86Var2.e();
                                        } else if (j5 > 1600 && p86Var2.i && !p86Var2.j.isEmpty()) {
                                            p86Var2.b();
                                            p86Var2.g = p86Var2.h;
                                        }
                                    }
                                }
                                Thread.sleep(60L);
                                f = 0.0f;
                            }
                        }
                    } catch (InterruptedException unused) {
                        for (int i15 = 0; i15 < sparseArray.size(); i15++) {
                            p86 p86Var3 = (p86) sparseArray.valueAt(i15);
                            kn3 kn3Var4 = p86Var3.d;
                            if (kn3Var4 != null) {
                                kn3Var4.a();
                                p86Var3.d = null;
                            }
                            p86Var3.b();
                        }
                        return;
                    } catch (Throwable th) {
                        try {
                            Log.e("Dictation", "live captions", th);
                            for (int i16 = 0; i16 < sparseArray.size(); i16++) {
                                p86 p86Var4 = (p86) sparseArray.valueAt(i16);
                                kn3 kn3Var5 = p86Var4.d;
                                if (kn3Var5 != null) {
                                    kn3Var5.a();
                                    p86Var4.d = null;
                                }
                                p86Var4.b();
                            }
                            return;
                        } catch (Throwable th2) {
                            for (int i17 = 0; i17 < sparseArray.size(); i17++) {
                                p86 p86Var5 = (p86) sparseArray.valueAt(i17);
                                kn3 kn3Var6 = p86Var5.d;
                                if (kn3Var6 != null) {
                                    kn3Var6.a();
                                    p86Var5.d = null;
                                }
                                p86Var5.b();
                            }
                            throw th2;
                        }
                    }
                }
                for (int i18 = 0; i18 < sparseArray.size(); i18++) {
                    p86 p86Var6 = (p86) sparseArray.valueAt(i18);
                    kn3 kn3Var7 = p86Var6.d;
                    if (kn3Var7 != null) {
                        kn3Var7.a();
                        p86Var6.d = null;
                    }
                    p86Var6.b();
                }
                return;
            case 9:
                ((oab) this.c).L(ProfileActivity.S2(((i96) this.b).c));
                return;
            case 10:
                n38 n38Var = (n38) this.c;
                gm.g(((d96) this.b).w);
                if (gm.C3()) {
                    Toast.makeText(n38Var.getContext(), jb6.M0(2131743879, null), 0).show();
                    return;
                }
                return;
            case 11:
                n38 n38Var2 = (n38) this.c;
                i96 i96Var = (i96) this.b;
                long j6 = i96Var.c;
                a58 a58Var = n38Var2.j0;
                if (j6 != z8c.h(a58Var.s2).e() && ((s96Var = n38Var2.i0.B0) == null || j6 != pg3.n(s96Var.l()))) {
                    if (a58Var.D3 != null) {
                        for (int i19 = 0; i19 < a58Var.D3.peers.size(); i19++) {
                            if (j6 != pg3.n(a58Var.D3.peers.get(i19).peer)) {
                            }
                        }
                    }
                    Context context = n38Var2.getContext();
                    long j7 = i96Var.c;
                    qp0 qp0Var = new qp0(n38Var2, i96Var, b);
                    q63 q63Var = new q63(b2);
                    my0 my0Var = new my0(1, (ylb) q63Var, context, false);
                    my0Var.J();
                    LinearLayout i20 = hg9.i(context, 1);
                    TextView textView = new TextView(context);
                    textView.setTextSize(1, 20.0f);
                    anb.X(textView, cmb.i5, q63Var);
                    textView.setTypeface(gm.o());
                    textView.setText(jb6.M0(2131751433, null));
                    i20.addView(textView, qoe.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    jf5 jf5Var = new jf5(context, q63Var);
                    jf5Var.setText(jb6.M0(2131751530, null));
                    i20.addView(jf5Var, qoe.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    oh2 oh2Var = new oh2(context, 4, 21, true, q63Var);
                    jh2 checkBoxRound = oh2Var.getCheckBoxRound();
                    int i21 = cmb.U6;
                    int i22 = cmb.f7;
                    int i23 = cmb.j7;
                    checkBoxRound.b(i21, i22, i23);
                    oh2Var.e(jb6.M0(2131751439, null), null, false, true, false);
                    oh2Var.setOnClickListener(new kf(oh2Var, b2));
                    int i24 = cmb.h6;
                    fg0 f0 = cmb.f0(cmb.v0(i24, q63Var), 2, -1);
                    wmb M = anb.M(i24);
                    oh2Var.setBackground(f0);
                    anb.j(oh2Var, f0, null, M, q63Var);
                    i20.addView(oh2Var, qoe.o(-1, -2));
                    oh2 oh2Var2 = new oh2(context, 4, 21, true, q63Var);
                    oh2Var2.getCheckBoxRound().b(i21, i22, i23);
                    oh2Var2.e(jb6.a0(null, null, 2131751524, pg3.k(z8c.t0, j7)), null, false, true, false);
                    oh2Var2.setOnClickListener(new kf(oh2Var2, (byte) 3));
                    fg0 f02 = cmb.f0(cmb.v0(i24, q63Var), 2, -1);
                    wmb M2 = anb.M(i24);
                    oh2Var2.setBackground(f02);
                    anb.j(oh2Var2, f02, null, M2, q63Var);
                    i20.addView(oh2Var2, qoe.o(-1, -2));
                    oh2 oh2Var3 = new oh2(context, 4, 21, true, q63Var);
                    oh2Var3.getCheckBoxRound().b(i21, i22, i23);
                    oh2Var3.e(jb6.a0(null, null, 2131751505, pg3.k(z8c.t0, j7)), null, false, false, false);
                    oh2Var3.setOnClickListener(new kf(oh2Var3, (byte) 4));
                    fg0 f03 = cmb.f0(cmb.v0(i24, q63Var), 2, -1);
                    wmb M3 = anb.M(i24);
                    oh2Var3.setBackground(f03);
                    anb.j(oh2Var3, f03, null, M3, q63Var);
                    i20.addView(oh2Var3, qoe.o(-1, -2));
                    njb njbVar = new njb(context, q63Var);
                    njbVar.setBackgroundColor(-16777216);
                    njbVar.setFixedSize(12);
                    i20.addView(njbVar, qoe.o(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    b61 b61Var = new b61(q63Var, context, true);
                    b61Var.i(jb6.M0(2131751450, null), false, true);
                    b61Var.setOnClickListener(new oh(oh2Var, oh2Var2, oh2Var3, qp0Var, my0Var, (byte) 8));
                    frameLayout.addView(b61Var, qoe.d(-1, 48.0f, nm7.D1, 16.0f, 16.0f, 16.0f, 16.0f));
                    i20.addView(frameLayout, qoe.o(-1, -2));
                    my0Var.O = i20;
                    my0Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = n38Var2.P;
                deletegroupcallmessages.messages.add(Integer.valueOf(i96Var.a));
                ConnectionsManager.getInstance(n38Var2.O).sendRequest(deletegroupcallmessages, null);
                n38Var2.b(i96Var.a);
                return;
            case 12:
                s96 s96Var2 = (s96) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                int size = arrayList2.size();
                int i25 = 0;
                while (i25 < size) {
                    Object obj = arrayList2.get(i25);
                    i25++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    nm7.f(s96Var2.e).k(nm7.H2, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 13:
                pc6 pc6Var = (pc6) this.c;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.b;
                if (gLSurfaceView.getWidth() == 0 || gLSurfaceView.getHeight() == 0) {
                    return;
                }
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect((gLSurfaceView.getHeight() * gLSurfaceView.getWidth()) << 2);
                GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(allocateDirect);
                Matrix matrix = new Matrix();
                matrix.preScale(1.0f, -1.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                createBitmap.recycle();
                gm.c3(new dt5(pc6Var, createBitmap2, gLSurfaceView, (byte) 14));
                return;
            case 14:
                pc6 pc6Var2 = (pc6) this.c;
                cd6 cd6Var = (cd6) this.b;
                pc6Var2.c.setImageResource(R.drawable.msg_location_alert2);
                pc6Var2.h0(cd6Var.f);
                pc6Var2.y = false;
                return;
            case 15:
                ((EditText) this.c).removeTextChangedListener((qz) this.b);
                return;
            case 16:
                ze6 ze6Var = (ze6) this.c;
                Runnable runnable2 = (Runnable) this.b;
                xe6 xe6Var = ze6Var.a;
                int i26 = 0;
                while (true) {
                    gl2[] gl2VarArr = xe6Var.f;
                    if (i26 >= gl2VarArr.length) {
                        runnable2.run();
                        xe6Var.e = false;
                        return;
                    } else {
                        gl2VarArr[i26].D(0.0f);
                        i26++;
                    }
                }
            case 17:
                if6 if6Var = (if6) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                mh6 mh6Var = if6Var.E;
                mh6Var.y1(false, false);
                gm.t1(if6Var.a);
                mh6Var.C1((TLRPC.TL_auth_authorization) tLObject3, false);
                return;
            case 18:
                if6 if6Var2 = (if6) this.c;
                String str4 = (String) this.b;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = if6Var2.n.current_algo;
                boolean z2 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] c2 = z2 ? nq9.c(gm.g1(str4), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                gf6 gf6Var = new gf6(if6Var2, b2);
                if (z2) {
                    TL_account.Password password = if6Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP d3 = nq9.d(c2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d3 == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        gf6Var.run(null, tL_error);
                        return;
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = d3;
                        i3 = ((d) if6Var2.E).currentAccount;
                        ConnectionsManager.getInstance(i3).sendRequest(tL_auth_checkPassword, gf6Var, 10);
                        return;
                    }
                }
                return;
            case 19:
                zf6 zf6Var = (zf6) this.c;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) this.b;
                zf6Var.Q.y1(false, false);
                gm.t1(zf6Var.Q.fragmentView.findFocus());
                zf6Var.Q.C1((TLRPC.TL_auth_authorization) auth_authorization, true);
                TLRPC.FileLocation fileLocation = zf6Var.P;
                if (fileLocation != null) {
                    Utilities.f.c(new k16(zf6Var, fileLocation, (byte) 20));
                    return;
                }
                return;
            case 20:
                zf6 zf6Var2 = (zf6) this.c;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.b;
                i4 = ((d) zf6Var2.Q).currentAccount;
                oc7 r1 = oc7.r1(i4);
                if (fileLocation2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(bc4.z(4));
                    sb.append("/");
                    sb.append(fileLocation2.volume_id);
                    sb.append("_");
                    r1.G2 = hg9.k(sb, fileLocation2.local_id, ".jpg");
                    r1.getFileLoader().h0(false, 16777216, r1.G2, true);
                    return;
                }
                return;
            case 21:
                ag6 ag6Var = (ag6) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                mh6 mh6Var2 = ag6Var.H;
                mh6Var2.y1(false, true);
                if (tL_error2 != null) {
                    if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                        mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131745848, "ResetAccountCancelledAlert"));
                        return;
                    } else {
                        mh6Var2.z1(jb6.M0(2131745804, null), tL_error2.text);
                        return;
                    }
                }
                if (ag6Var.r == null || ag6Var.s == null || ag6Var.w == null) {
                    mh6Var2.J1(0, true, null, true);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("phoneFormated", ag6Var.r);
                bundle.putString("phoneHash", ag6Var.s);
                bundle.putString("code", ag6Var.w);
                mh6Var2.J1(5, true, bundle, false);
                return;
            case 22:
                rg6 rg6Var = (rg6) this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.b);
                alertDialog$Builder.a.S = jb6.M0(2131752532, null);
                alertDialog$Builder.a.U = jb6.a0("CancelLinkSuccess", null, 2131752533, mlb.l(new StringBuilder("+"), rg6Var.b, r58.f()));
                alertDialog$Builder.j(jb6.M0(2131751978, null), null);
                alertDialog$Builder.a.setOnDismissListener(new lg6(rg6Var, b3));
                alertDialog$Builder.o();
                return;
            case 23:
                ((rg6) this.c).h0 = ((TLRPC.TL_error) this.b).text;
                return;
            case 24:
                ((rg6) this.c).v0.C1((TLRPC.TL_auth_authorization) ((TLObject) this.b), false);
                return;
            case 25:
                rg6 rg6Var2 = (rg6) this.c;
                Runnable runnable3 = (Runnable) this.b;
                tk2 tk2Var = rg6Var2.f;
                int i27 = 0;
                while (true) {
                    gl2[] gl2VarArr2 = tk2Var.f;
                    if (i27 >= gl2VarArr2.length) {
                        runnable3.run();
                        tk2Var.e = false;
                        return;
                    } else {
                        gl2VarArr2[i27].D(0.0f);
                        i27++;
                    }
                }
            case 26:
                ((sk3) this.c).a((String) this.b);
                return;
            case 27:
                lh6 lh6Var = (lh6) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
                mh6 mh6Var3 = lh6Var.h0;
                SharedPreferences d1 = oc7.d1();
                if (!d1.getBoolean("firstloginshow", true) && !mh6Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    mh6Var3.getParentActivity().requestPermissions((String[]) arrayList3.toArray(new String[0]), 7);
                    return;
                }
                d1.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(mh6Var3.getParentActivity());
                int i28 = cmb.K5;
                alertDialog$Builder2.l(R.raw.incoming_calls, 46, cmb.w0(null, i28, false), null);
                alertDialog$Builder2.m(i28, null);
                alertDialog$Builder2.j(jb6.M0(2131751708, "Continue"), null);
                String M0 = jb6.M0(2131754243, "AllowFillNumber");
                he heVar2 = alertDialog$Builder2.a;
                heVar2.U = M0;
                mh6Var3.n = mh6Var3.showDialog(heVar2, true, null);
                mh6Var3.d0 = true;
                return;
            case 28:
                lh6 lh6Var2 = (lh6) this.c;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.b;
                if (lh6Var2.o()) {
                    he heVar3 = new he(3, null, lh6Var2.getContext());
                    heVar3.setOnCancelListener(new ct0(cancellationTokenSource, (byte) 11));
                    heVar3.show();
                    lh6Var2.c0 = heVar3;
                    return;
                }
                return;
            default:
                ((ph6) this.c).a0((he) this.b);
                return;
        }
    }

    public /* synthetic */ k16(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }
}

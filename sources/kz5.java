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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class kz5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kz5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x075a A[Catch: all -> 0x07f6, InterruptedException -> 0x083a, TryCatch #3 {InterruptedException -> 0x083a, all -> 0x07f6, blocks: (B:135:0x0645, B:137:0x0649, B:139:0x0653, B:140:0x065d, B:142:0x0665, B:144:0x067b, B:146:0x0682, B:149:0x0688, B:152:0x068e, B:154:0x0696, B:156:0x06a9, B:158:0x06ad, B:159:0x06bc, B:160:0x06c2, B:167:0x06f8, B:168:0x06fa, B:173:0x0703, B:175:0x0707, B:177:0x0710, B:179:0x071b, B:181:0x0723, B:183:0x0742, B:185:0x0751, B:186:0x0756, B:188:0x075a, B:193:0x0766, B:195:0x0771, B:196:0x0778, B:205:0x06cd, B:207:0x06e6, B:215:0x077e, B:217:0x0788, B:220:0x078d, B:222:0x0793, B:226:0x07a7, B:231:0x07bc, B:233:0x07c0, B:235:0x07c8, B:228:0x07cf, B:242:0x07d2), top: B:134:0x0645 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        byte[] bArr;
        float sqrt;
        long j;
        byte[] bArr2;
        String nativeSessionPush;
        String nativeSessionPush2;
        VoIPService sharedInstance;
        t76 t76Var;
        int i2;
        int i3;
        byte b = 12;
        byte b2 = 5;
        byte b3 = 2;
        byte b4 = 0;
        switch (this.a) {
            case 0:
                c01 c01Var = (c01) this.b;
                hd hdVar = (hd) this.c;
                String str = LaunchActivity.C1;
                if (c01Var != null) {
                    c01Var.b();
                }
                hdVar.dismiss();
                return;
            case 1:
                h26 h26Var = (h26) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList = h26Var.d2;
                o39 o39Var = h26Var.n1;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    h26Var.D2 = false;
                    h26Var.E2.b(h26Var.i2 + 4);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= o39Var.getChildCount()) {
                            i = 0;
                        } else if (o39Var.getChildAt(i4) instanceof f26) {
                            i = o39Var.getChildAt(i4).getTop();
                        } else {
                            i4++;
                        }
                    }
                    h26Var.x1();
                    if (h26Var.g2 >= 0 && i != 0) {
                        ((t26) o39Var.getLayoutManager()).g1(h26Var.g2 + 1, i);
                    }
                }
                int max = Math.max(arrayList.size(), h26Var.H2.e);
                h26Var.s2.j(max, false);
                h26Var.s2.setBagePosition(max / h26Var.H2.f);
                e26 e26Var = h26Var.s2;
                e26Var.I = true;
                e26Var.requestLayout();
                return;
            case 2:
                ((h26) this.b).Y0((g86) this.c, true);
                return;
            case 3:
                a46 a46Var = (a46) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                a46Var.c();
                if (tLObject2 != null) {
                    a46Var.a.k0((TL_account.Password) tLObject2);
                    return;
                }
                return;
            case 4:
                ((FiltersSetupActivity) this.c).b0(((a46) this.b).a.N());
                return;
            case 5:
                g46 g46Var = (g46) this.b;
                if (g46Var.P0 == ((m46) this.c)) {
                    g46Var.performLongClick();
                    g46Var.P0 = null;
                    g46Var.N0.e(true);
                    return;
                }
                return;
            case 6:
                ((i46) this.b).m((r86) this.c, false);
                return;
            case 7:
                q66 q66Var = (q66) this.b;
                xl3 xl3Var = (xl3) this.c;
                q66Var.getClass();
                DictationAsr.O();
                SparseArray sparseArray = new SparseArray();
                int i5 = 0;
                while (q66Var.d) {
                    try {
                        byte[] readIncomingAudio = NativeInstance.readIncomingAudio();
                        long currentTimeMillis = System.currentTimeMillis();
                        if (readIncomingAudio != null) {
                            ByteBuffer order = ByteBuffer.wrap(readIncomingAudio).order(ByteOrder.LITTLE_ENDIAN);
                            while (true) {
                                char c = '\b';
                                if (order.remaining() >= 8) {
                                    int i6 = order.getInt();
                                    int i7 = order.getInt() << 1;
                                    int position = order.position();
                                    if (i7 <= order.remaining()) {
                                        order.position(position + i7);
                                        if (i6 != 0 || ((sharedInstance = VoIPService.getSharedInstance()) != null && !sharedInstance.isMicMute())) {
                                            p66 p66Var = (p66) sparseArray.get(i6);
                                            if (p66Var == null) {
                                                p66Var = new p66(q66Var, i6);
                                                long j2 = q66Var.f;
                                                bArr = readIncomingAudio;
                                                q66Var.f = j2 + 1;
                                                p66Var.f = j2;
                                                if (i6 == 0 && q66Var.c) {
                                                    ExecutorService executorService = DictationLid.a;
                                                    p66Var.k = na7.c1().getString("tinylid_lang", null);
                                                }
                                                sparseArray.put(i6, p66Var);
                                            } else {
                                                bArr = readIncomingAudio;
                                            }
                                            int i8 = i7 / 2;
                                            if (i8 == 0) {
                                                sqrt = 0.0f;
                                            } else {
                                                double d = 0.0d;
                                                int i9 = 0;
                                                while (i9 < i8) {
                                                    int i10 = (i9 << 1) + position;
                                                    double d2 = (short) ((bArr[i10] & 255) | (bArr[i10 + 1] << 8));
                                                    d += d2 * d2;
                                                    i9++;
                                                    c = c;
                                                }
                                                sqrt = (float) Math.sqrt(d / i8);
                                            }
                                            boolean z = sqrt >= 400.0f;
                                            if (z) {
                                                p66Var.e = currentTimeMillis;
                                            }
                                            if (p66Var.d == null) {
                                                if (z && i5 < 4) {
                                                    String str2 = p66Var.k;
                                                    xl3 X = str2 != null ? DictationAsr.X(str2, xl3Var, false) : null;
                                                    if (X == null || !DictationAsr.A((vl3) X.b)) {
                                                        X = xl3Var;
                                                    }
                                                    zl3 c2 = zl3.c(X, p66Var);
                                                    p66Var.d = c2;
                                                    if (c2 != null) {
                                                        i5++;
                                                        p66Var.h = 0;
                                                        p66Var.g = 0;
                                                        p66Var.e();
                                                        p66Var.c(0, p66Var.c, p66Var.b);
                                                        zl3 zl3Var = p66Var.d;
                                                        byte[] bArr3 = p66Var.b;
                                                        int i11 = p66Var.c;
                                                        long j3 = zl3Var.c;
                                                        if (j3 != 0) {
                                                            j = 0;
                                                            nativeSessionPush2 = DictationAsr.nativeSessionPush(j3, bArr3, 0, i11);
                                                            zl3Var.b(nativeSessionPush2);
                                                        } else {
                                                            j = 0;
                                                        }
                                                        p66Var.c = 0;
                                                        if (p66Var.d == null) {
                                                            bArr2 = bArr;
                                                            p66Var.d(position, i7, bArr2);
                                                            readIncomingAudio = bArr2;
                                                        }
                                                    }
                                                }
                                                j = 0;
                                                if (p66Var.d == null) {
                                                }
                                            } else {
                                                j = 0;
                                            }
                                            bArr2 = bArr;
                                            p66Var.c(position, i7, bArr2);
                                            zl3 zl3Var2 = p66Var.d;
                                            long j4 = zl3Var2.c;
                                            if (j4 != j) {
                                                nativeSessionPush = DictationAsr.nativeSessionPush(j4, bArr2, position, i7);
                                                zl3Var2.b(nativeSessionPush);
                                            }
                                            p66Var.a();
                                            readIncomingAudio = bArr2;
                                        }
                                    }
                                }
                            }
                        }
                        while (true) {
                            Runnable runnable = (Runnable) q66Var.b.poll();
                            if (runnable != null) {
                                runnable.run();
                            } else {
                                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                                    p66 p66Var2 = (p66) sparseArray.valueAt(i12);
                                    long j5 = currentTimeMillis - p66Var2.e;
                                    zl3 zl3Var3 = p66Var2.d;
                                    if (zl3Var3 != null) {
                                        if (j5 > 6000) {
                                            zl3Var3.a();
                                            p66Var2.d = null;
                                            i5--;
                                            p66Var2.b();
                                            p66Var2.e();
                                        } else if (j5 > 1600 && p66Var2.i && !p66Var2.j.isEmpty()) {
                                            p66Var2.b();
                                            p66Var2.g = p66Var2.h;
                                        }
                                    }
                                }
                                Thread.sleep(60L);
                            }
                        }
                    } catch (InterruptedException unused) {
                        for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                            p66 p66Var3 = (p66) sparseArray.valueAt(i13);
                            zl3 zl3Var4 = p66Var3.d;
                            if (zl3Var4 != null) {
                                zl3Var4.a();
                                p66Var3.d = null;
                            }
                            p66Var3.b();
                        }
                        return;
                    } catch (Throwable th) {
                        try {
                            Log.e("Dictation", "live captions", th);
                            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                                p66 p66Var4 = (p66) sparseArray.valueAt(i14);
                                zl3 zl3Var5 = p66Var4.d;
                                if (zl3Var5 != null) {
                                    zl3Var5.a();
                                    p66Var4.d = null;
                                }
                                p66Var4.b();
                            }
                            return;
                        } catch (Throwable th2) {
                            for (int i15 = 0; i15 < sparseArray.size(); i15++) {
                                p66 p66Var5 = (p66) sparseArray.valueAt(i15);
                                zl3 zl3Var6 = p66Var5.d;
                                if (zl3Var6 != null) {
                                    zl3Var6.a();
                                    p66Var5.d = null;
                                }
                                p66Var5.b();
                            }
                            throw th2;
                        }
                    }
                }
                for (int i16 = 0; i16 < sparseArray.size(); i16++) {
                    p66 p66Var6 = (p66) sparseArray.valueAt(i16);
                    zl3 zl3Var7 = p66Var6.d;
                    if (zl3Var7 != null) {
                        zl3Var7.a();
                        p66Var6.d = null;
                    }
                    p66Var6.b();
                }
                return;
            case 8:
                ((m8b) this.b).L(ProfileActivity.P2(((i76) this.c).c));
                return;
            case 9:
                l18 l18Var = (l18) this.b;
                gl.g(((d76) this.c).w);
                if (gl.C3()) {
                    Toast.makeText(l18Var.getContext(), k96.M0(2131743953, null), 0).show();
                    return;
                }
                return;
            case 10:
                l18 l18Var2 = (l18) this.b;
                i76 i76Var = (i76) this.c;
                long j6 = i76Var.c;
                y28 y28Var = l18Var2.j0;
                if (j6 != y6c.h(y28Var.s2).e() && ((t76Var = l18Var2.i0.B0) == null || j6 != cf3.n(t76Var.l()))) {
                    if (y28Var.D3 != null) {
                        for (int i17 = 0; i17 < y28Var.D3.peers.size(); i17++) {
                            if (j6 != cf3.n(y28Var.D3.peers.get(i17).peer)) {
                            }
                        }
                    }
                    Context context = l18Var2.getContext();
                    long j7 = i76Var.c;
                    qo0 qo0Var = new qo0(l18Var2, i76Var, b2);
                    e53 e53Var = new e53(b3);
                    fx0 fx0Var = new fx0(1, (wjb) e53Var, context, false);
                    fx0Var.K();
                    LinearLayout j8 = de9.j(context, 1);
                    TextView textView = new TextView(context);
                    textView.setTextSize(1, 20.0f);
                    zkb.X(textView, bkb.i5, e53Var);
                    textView.setTypeface(gl.o());
                    textView.setText(k96.M0(2131751484, null));
                    j8.addView(textView, nme.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    ld5 ld5Var = new ld5(context, e53Var);
                    ld5Var.setText(k96.M0(2131751581, null));
                    j8.addView(ld5Var, nme.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    ag2 ag2Var = new ag2(context, 4, 21, true, e53Var);
                    wf2 checkBoxRound = ag2Var.getCheckBoxRound();
                    int i18 = bkb.U6;
                    int i19 = bkb.f7;
                    int i20 = bkb.j7;
                    checkBoxRound.b(i18, i19, i20);
                    ag2Var.e(k96.M0(2131751490, null), null, false, true, false);
                    ag2Var.setOnClickListener(new je(ag2Var, b3));
                    int i21 = bkb.h6;
                    ff0 f0 = bkb.f0(bkb.v0(i21, e53Var), 2, -1);
                    vkb M = zkb.M(i21);
                    ag2Var.setBackground(f0);
                    zkb.j(ag2Var, f0, null, M, e53Var);
                    j8.addView(ag2Var, nme.o(-1, -2));
                    ag2 ag2Var2 = new ag2(context, 4, 21, true, e53Var);
                    ag2Var2.getCheckBoxRound().b(i18, i19, i20);
                    ag2Var2.e(k96.a0(null, null, 2131751575, cf3.k(y6c.t0, j7)), null, false, true, false);
                    ag2Var2.setOnClickListener(new je(ag2Var2, (byte) 3));
                    ff0 f02 = bkb.f0(bkb.v0(i21, e53Var), 2, -1);
                    vkb M2 = zkb.M(i21);
                    ag2Var2.setBackground(f02);
                    zkb.j(ag2Var2, f02, null, M2, e53Var);
                    j8.addView(ag2Var2, nme.o(-1, -2));
                    ag2 ag2Var3 = new ag2(context, 4, 21, true, e53Var);
                    ag2Var3.getCheckBoxRound().b(i18, i19, i20);
                    ag2Var3.e(k96.a0(null, null, 2131751556, cf3.k(y6c.t0, j7)), null, false, false, false);
                    ag2Var3.setOnClickListener(new je(ag2Var3, (byte) 4));
                    ff0 f03 = bkb.f0(bkb.v0(i21, e53Var), 2, -1);
                    vkb M3 = zkb.M(i21);
                    ag2Var3.setBackground(f03);
                    zkb.j(ag2Var3, f03, null, M3, e53Var);
                    j8.addView(ag2Var3, nme.o(-1, -2));
                    mhb mhbVar = new mhb(context, e53Var);
                    mhbVar.setBackgroundColor(-16777216);
                    mhbVar.setFixedSize(12);
                    j8.addView(mhbVar, nme.o(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    u41 u41Var = new u41(e53Var, context, true);
                    u41Var.i(k96.M0(2131751501, null), false, true);
                    u41Var.setOnClickListener(new og(ag2Var, ag2Var2, ag2Var3, qo0Var, fx0Var, (byte) 8));
                    frameLayout.addView(u41Var, nme.d(-1, 48.0f, kk7.D1, 16.0f, 16.0f, 16.0f, 16.0f));
                    j8.addView(frameLayout, nme.o(-1, -2));
                    fx0Var.O = j8;
                    fx0Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = l18Var2.P;
                deletegroupcallmessages.messages.add(Integer.valueOf(i76Var.a));
                ConnectionsManager.getInstance(l18Var2.O).sendRequest(deletegroupcallmessages, null);
                l18Var2.b(i76Var.a);
                return;
            case 11:
                t76 t76Var2 = (t76) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                int size = arrayList2.size();
                int i22 = 0;
                while (i22 < size) {
                    Object obj = arrayList2.get(i22);
                    i22++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    kk7.f(t76Var2.e).k(kk7.G2, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 12:
                qa6 qa6Var = (qa6) this.b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.c;
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
                gl.c3(new sx5(qa6Var, createBitmap2, gLSurfaceView, b));
                return;
            case 13:
                qa6 qa6Var2 = (qa6) this.b;
                db6 db6Var = (db6) this.c;
                qa6Var2.c.setImageResource(R.drawable.msg_location_alert2);
                qa6Var2.g0(db6Var.f);
                qa6Var2.y = false;
                return;
            case 14:
                ((EditText) this.b).removeTextChangedListener((qy) this.c);
                return;
            case 15:
                ad6 ad6Var = (ad6) this.b;
                Runnable runnable2 = (Runnable) this.c;
                yc6 yc6Var = ad6Var.a;
                int i23 = 0;
                while (true) {
                    sj2[] sj2VarArr = yc6Var.f;
                    if (i23 >= sj2VarArr.length) {
                        runnable2.run();
                        yc6Var.e = false;
                        return;
                    } else {
                        sj2VarArr[i23].D(0.0f);
                        i23++;
                    }
                }
            case 16:
                jd6 jd6Var = (jd6) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                mf6 mf6Var = jd6Var.E;
                mf6Var.x1(false, false);
                gl.t1(jd6Var.a);
                mf6Var.B1((TLRPC.TL_auth_authorization) tLObject3, false);
                return;
            case 17:
                jd6 jd6Var2 = (jd6) this.b;
                String str3 = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = jd6Var2.n.current_algo;
                boolean z2 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] c3 = z2 ? mo9.c(gl.g1(str3), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                hd6 hd6Var = new hd6(jd6Var2, b3);
                if (z2) {
                    TL_account.Password password = jd6Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP d3 = mo9.d(c3, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d3 == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        hd6Var.run(null, tL_error);
                        return;
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = d3;
                        i2 = ((d) jd6Var2.E).currentAccount;
                        ConnectionsManager.getInstance(i2).sendRequest(tL_auth_checkPassword, hd6Var, 10);
                        return;
                    }
                }
                return;
            case 18:
                ae6 ae6Var = (ae6) this.b;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) this.c;
                ae6Var.Q.x1(false, false);
                gl.t1(ae6Var.Q.fragmentView.findFocus());
                ae6Var.Q.B1((TLRPC.TL_auth_authorization) auth_authorization, true);
                TLRPC.FileLocation fileLocation = ae6Var.P;
                if (fileLocation != null) {
                    Utilities.f.c(new kz5(ae6Var, fileLocation, (byte) 19));
                    return;
                }
                return;
            case 19:
                ae6 ae6Var2 = (ae6) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i3 = ((d) ae6Var2.Q).currentAccount;
                na7 q1 = na7.q1(i3);
                if (fileLocation2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ba4.z(4));
                    sb.append("/");
                    sb.append(fileLocation2.volume_id);
                    sb.append("_");
                    q1.G2 = de9.l(sb, fileLocation2.local_id, ".jpg");
                    q1.getFileLoader().h0(false, 16777216, q1.G2, true);
                    return;
                }
                return;
            case 20:
                be6 be6Var = (be6) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                mf6 mf6Var2 = be6Var.H;
                mf6Var2.x1(false, true);
                if (tL_error2 != null) {
                    if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                        mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131745922, "ResetAccountCancelledAlert"));
                        return;
                    } else {
                        mf6Var2.y1(k96.M0(2131745878, null), tL_error2.text);
                        return;
                    }
                }
                if (be6Var.r == null || be6Var.s == null || be6Var.w == null) {
                    mf6Var2.I1(0, true, null, true);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("phoneFormated", be6Var.r);
                bundle.putString("phoneHash", be6Var.s);
                bundle.putString("code", be6Var.w);
                mf6Var2.I1(5, true, bundle, false);
                return;
            case 21:
                qe6 qe6Var = (qe6) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.S = k96.M0(2131752567, null);
                alertDialog$Builder.a.U = k96.a0("CancelLinkSuccess", null, 2131752568, yjb.k(new StringBuilder("+"), qe6Var.b, p38.f()));
                alertDialog$Builder.j(k96.M0(2131752029, null), null);
                alertDialog$Builder.a.setOnDismissListener(new me6(qe6Var, b4));
                alertDialog$Builder.o();
                return;
            case 22:
                ((qe6) this.b).h0 = ((TLRPC.TL_error) this.c).text;
                return;
            case 23:
                ((qe6) this.b).v0.B1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                return;
            case 24:
                qe6 qe6Var2 = (qe6) this.b;
                Runnable runnable3 = (Runnable) this.c;
                fj2 fj2Var = qe6Var2.f;
                int i24 = 0;
                while (true) {
                    sj2[] sj2VarArr2 = fj2Var.f;
                    if (i24 >= sj2VarArr2.length) {
                        runnable3.run();
                        fj2Var.e = false;
                        return;
                    } else {
                        sj2VarArr2[i24].D(0.0f);
                        i24++;
                    }
                }
            case 25:
                ((hj3) this.b).a((String) this.c);
                return;
            case 26:
                lf6 lf6Var = (lf6) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                mf6 mf6Var3 = lf6Var.h0;
                SharedPreferences c1 = na7.c1();
                if (!c1.getBoolean("firstloginshow", true) && !mf6Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    mf6Var3.getParentActivity().requestPermissions((String[]) arrayList3.toArray(new String[0]), 7);
                    return;
                }
                c1.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(mf6Var3.getParentActivity());
                int i25 = bkb.K5;
                alertDialog$Builder2.l(R.raw.incoming_calls, 46, bkb.w0(null, i25, false), null);
                alertDialog$Builder2.m(i25, null);
                alertDialog$Builder2.j(k96.M0(2131751759, "Continue"), null);
                String M0 = k96.M0(2131754275, "AllowFillNumber");
                hd hdVar2 = alertDialog$Builder2.a;
                hdVar2.U = M0;
                mf6Var3.n = mf6Var3.showDialog(hdVar2, true, null);
                mf6Var3.d0 = true;
                return;
            case 27:
                lf6 lf6Var2 = (lf6) this.b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.c;
                if (lf6Var2.o()) {
                    hd hdVar3 = new hd(3, null, lf6Var2.getContext());
                    hdVar3.setOnCancelListener(new ur0(cancellationTokenSource, (byte) 11));
                    hdVar3.show();
                    lf6Var2.c0 = hdVar3;
                    return;
                }
                return;
            case 28:
                ((pf6) this.b).Z((hd) this.c);
                return;
            default:
                yh6 yh6Var = (yh6) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                yh6Var.d0 = false;
                if (tL_error3 == null) {
                    qh6 k0 = yh6Var.k0();
                    yh6Var.k0.clear();
                    yh6Var.m0(k0);
                    return;
                }
                return;
        }
    }
}

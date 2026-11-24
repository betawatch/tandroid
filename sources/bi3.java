// default package

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.Choreographer;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.ProfileActivity;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bi3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bi3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02e3, code lost:
    
        r8 = org.telegram.ui.Dictation.DictationAsr.nativeFileNext(r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        boolean z;
        long nativeSessionNew;
        String nativeSessionPush;
        String nativeSessionFinish;
        long nativeFileNew;
        String nativeFileNext;
        byte b = this.a;
        byte b2 = 8;
        long j = 0;
        int i2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                er3 q = er3.q(((j5) obj).a);
                q.getMessagesStorage().a.c(new br3(q, null == true ? 1 : 0));
                return;
            case 1:
                ((nl3) obj).updateColors();
                return;
            case 2:
                ((x6c) obj).updateColors();
                return;
            case 3:
                ((l9) obj).updateColors();
                return;
            case 4:
                ((nk3) ((fh2) obj).b).g0.setAlpha(1.0f);
                return;
            case 5:
                Bundle bundle = new Bundle();
                nk3 nk3Var = ((wj3) obj).a;
                i = ((d) nk3Var).currentAccount;
                bundle.putLong("user_id", z8c.h(i).e());
                bundle.putBoolean("my_profile", true);
                nk3Var.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                nk3 nk3Var2 = ((ak3) obj).H0;
                nk3Var2.showDialog(new kj8((d) nk3Var2, 9, true));
                nk3Var2.A0.setIsEditing(false);
                nk3Var2.d5(false);
                return;
            case 7:
                nk3 nk3Var3 = ((dk3) obj).b;
                nk3Var3.A0.setIsEditing(true);
                nk3Var3.d5(true);
                return;
            case 8:
                ok3 ok3Var = (ok3) obj;
                ok3Var.a.a(!r1.f, true);
                gm.d3(ok3Var.f, 3000L);
                return;
            case 9:
                ((qv9) obj).W(false);
                return;
            case 10:
                ov9 ov9Var = (ov9) obj;
                sg4 sg4Var = ov9Var.B0;
                if (sg4Var != null) {
                    ((nh3) sg4Var).h(false, null, ov9Var.z0, ov9Var.A0);
                    return;
                }
                return;
            case 11:
                mm3 mm3Var = (mm3) obj;
                mm3Var.c = jm3.d;
                mm3Var.J.clear();
                int i3 = mm3Var.G0;
                if (i3 >= 0 && i3 < mm3Var.b()) {
                    mm3Var.g(mm3Var.G0);
                }
                mm3Var.P();
                return;
            case 12:
                sm3 sm3Var = ((qm3) obj).d;
                sm3Var.s = false;
                sm3Var.w = null;
                Choreographer.getInstance().removeFrameCallback(sm3Var);
                sm3Var.G = 0L;
                mpc mpcVar = (mpc) sm3Var;
                npc npcVar = mpcVar.M;
                if (npcVar.d == mpcVar) {
                    npcVar.h();
                    return;
                }
                return;
            case 13:
                ((um3) obj).c(null, null);
                return;
            case 14:
                jn3 jn3Var = (jn3) obj;
                long h = DictationAsr.h(jn3Var.b);
                if (h == 0) {
                    jn3Var.b(jn3Var.o);
                    return;
                }
                DictationAsr.O();
                ln3 ln3Var = jn3Var.a;
                synchronized (ln3Var.a) {
                    z = ln3Var.d;
                }
                if (!z) {
                    String a = jn3Var.b.a(jn3Var.c);
                    String str = a.split(",")[0];
                    nativeSessionNew = DictationAsr.nativeSessionNew(h, a, str, gda.o() == 0 ? 2 : 4);
                    StringBuilder sb = new StringBuilder("tinyasr: session ");
                    kt6.v(sb, jn3Var.b.a, " in ", a, " (from ");
                    sb.append(str);
                    sb.append("), audio from 0 ms");
                    Log.d("Dictation", sb.toString());
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i4 = 0;
                    while (true) {
                        try {
                            if (!jn3Var.l) {
                                boolean z2 = jn3Var.k;
                                int c = jn3Var.a.c() - i4;
                                if (c >= 2) {
                                    int min = Math.min(10240, c & (-2)) + i4;
                                    byte[] b3 = jn3Var.a.b(i4, min);
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                    nativeSessionPush = DictationAsr.nativeSessionPush(nativeSessionNew, b3, 0, b3.length);
                                    jn3Var.a(nativeSessionPush);
                                    j += SystemClock.elapsedRealtime() - elapsedRealtime2;
                                    jn3Var.m = min;
                                    i4 = min;
                                } else if (z2) {
                                    nativeSessionFinish = DictationAsr.nativeSessionFinish(nativeSessionNew);
                                    jn3Var.a(nativeSessionFinish);
                                    Log.d("Dictation", "tinyasr: finished, " + (i4 / 32) + " ms of audio, " + j + " ms busy, " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms in all");
                                } else {
                                    Thread.sleep(40L);
                                }
                            }
                        } catch (InterruptedException unused) {
                        } catch (Throwable th) {
                            DictationAsr.nativeSessionFree(nativeSessionNew);
                            DictationAsr.S(jn3Var.b);
                            throw th;
                        }
                    }
                    DictationAsr.nativeSessionFree(nativeSessionNew);
                    DictationAsr.S(jn3Var.b);
                    jn3Var.b(jn3Var.o);
                    return;
                }
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                ln3 ln3Var2 = jn3Var.a;
                byte[] b4 = ln3Var2.b(0, ln3Var2.c());
                jn3Var.m = b4.length;
                int length = b4.length / 2;
                float[] fArr = new float[length];
                while (i2 < length) {
                    int i5 = i2 << 1;
                    fArr[i2] = ((short) ((b4[i5] & 255) | (b4[i5 + 1] << 8))) / 32768.0f;
                    i2++;
                    b2 = b2;
                }
                nativeFileNew = DictationAsr.nativeFileNew(h, fArr, jn3Var.b.a(jn3Var.c), gda.o() != 0 ? 4 : 2);
                try {
                    if (nativeFileNew == 0) {
                        if (nativeFileNew != 0) {
                            DictationAsr.nativeFileFree(nativeFileNew);
                        }
                        DictationAsr.S(jn3Var.b);
                        while (!jn3Var.k && !jn3Var.l) {
                            Thread.sleep(10L);
                        }
                    } else {
                        while (!jn3Var.l && nativeFileNext != null) {
                            try {
                                try {
                                    DictationAsr.l(jn3Var.e, new JSONArray(nativeFileNext), null);
                                } catch (Exception e) {
                                    Log.e("Dictation", "tinyasr: words " + nativeFileNext, e);
                                }
                                jn3Var.b(null);
                            } catch (Throwable th2) {
                                if (nativeFileNew != 0) {
                                    DictationAsr.nativeFileFree(nativeFileNew);
                                }
                                DictationAsr.S(jn3Var.b);
                                while (!jn3Var.k && !jn3Var.l) {
                                    try {
                                        Thread.sleep(10L);
                                    } catch (InterruptedException unused2) {
                                    }
                                }
                                jn3Var.b(jn3Var.o);
                                throw th2;
                            }
                        }
                        Log.d("Dictation", "tinyasr: file pass in " + jn3Var.c + ", " + (length / 16) + " ms of audio in " + (SystemClock.elapsedRealtime() - elapsedRealtime3) + " ms");
                        if (nativeFileNew != 0) {
                            DictationAsr.nativeFileFree(nativeFileNew);
                        }
                        DictationAsr.S(jn3Var.b);
                        while (!jn3Var.k && !jn3Var.l) {
                            Thread.sleep(10L);
                        }
                    }
                } catch (InterruptedException unused3) {
                }
                jn3Var.b(jn3Var.o);
                return;
            case 15:
                gm.E3((sy1) obj);
                return;
            case 16:
                ((or3) obj).a(false);
                return;
            case 17:
                ((zt3) obj).a();
                return;
            case 18:
                gm.t1(((e3a) obj).b.getEditText());
                return;
            case 19:
                ((kv3) obj).removeSelfFromStack();
                return;
            case 20:
                ((EglRenderer) obj).renderFrameOnRenderThread();
                return;
            case 21:
                l11.u(((zv3) ((sv) obj).b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 22:
                zv3 zv3Var = ((yv3) obj).a;
                zv3Var.r1.setVisibility(4);
                zv3Var.q1.setVisibility(4);
                ImageView imageView = zv3Var.w1;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 23:
                kw3 kw3Var = (kw3) obj;
                ArrayList arrayList = kw3Var.y;
                ArrayList arrayList2 = kw3Var.x;
                if (kw3Var.r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = kw3Var.r;
                    tL_sendMessageEmojiInteraction.emoticon = kw3Var.w;
                    tL_sendMessageEmojiInteraction.interaction = new TLRPC.TL_dataJSON();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("v", 1);
                        JSONArray jSONArray = new JSONArray();
                        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("i", ((Integer) arrayList.get(i6)).intValue() + 1);
                            jSONObject2.put("t", ((Long) arrayList2.get(i6)).longValue() / 1000.0f);
                            jSONArray.put(i6, jSONObject2);
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j2 = kw3Var.K;
                        if (j2 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j2;
                            tL_messages_setTyping.flags |= 1;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = oc7.r1(kw3Var.b).i1(kw3Var.J);
                        ConnectionsManager.getInstance(kw3Var.b).sendRequest(tL_messages_setTyping, null);
                        kw3Var.r = 0;
                        kw3Var.w = null;
                        kw3Var.s = 0L;
                        arrayList2.clear();
                        arrayList.clear();
                    } catch (JSONException e2) {
                        kw3Var.r = 0;
                        kw3Var.w = null;
                        kw3Var.s = 0L;
                        arrayList2.clear();
                        arrayList.clear();
                        fc4.g(e2, true);
                    }
                }
                kw3Var.E = null;
                return;
            case 24:
                u31.e();
                kj8 kj8Var = new kj8((d) new qv0((nv7) obj), 14, false);
                kj8Var.setOnDismissListener(new g5((byte) 6));
                kj8Var.show();
                return;
            case 25:
                ((ww3) obj).F();
                return;
            case 26:
                dx3 dx3Var = (dx3) obj;
                ArrayList arrayList3 = dx3Var.w;
                ArrayList arrayList4 = dx3Var.s;
                ex3 ex3Var = dx3Var.O;
                px3 px3Var = ex3Var.s;
                int i7 = px3.C1;
                hs6 d0 = hs6.d0(px3Var.a);
                String str2 = dx3Var.I;
                if (!"premium".equalsIgnoreCase(str2)) {
                    if (ex3Var.a == 1 && gw3.d(dx3Var.I)) {
                        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                        tL_messages_getStickers.emoticon = dx3Var.I;
                        tL_messages_getStickers.hash = 0L;
                        ConnectionsManager.getInstance(px3Var.a).sendRequest(tL_messages_getStickers, new cx3(dx3Var, str2, null == true ? 1 : 0));
                        return;
                    }
                    String[] F0 = gm.F0();
                    String[] strArr = dx3Var.K;
                    if (strArr == null || !Arrays.equals(F0, strArr)) {
                        hs6.d0(px3Var.a).O(F0, false);
                    }
                    dx3Var.K = F0;
                    d0.X(F0, dx3Var.I, false, new wu2(dx3Var, str2, d0, b2), false, false, false, true, 50);
                    return;
                }
                ArrayList j0 = d0.j0(7, false);
                dx3Var.y = 0;
                arrayList4.clear();
                arrayList3.clear();
                dx3Var.E.clear();
                dx3Var.n.clear();
                dx3Var.y++;
                arrayList4.add(null);
                arrayList3.add(0L);
                arrayList4.addAll(j0);
                dx3Var.y = j0.size() + dx3Var.y;
                dx3Var.J = dx3Var.I;
                dx3Var.f();
                uw3 uw3Var = ex3Var.b;
                int i8 = uw3.q3;
                uw3Var.z1(0, 0);
                ex3Var.f.c(false);
                ex3Var.e.n(false);
                return;
            case 27:
                ix3 ix3Var = (ix3) ((b7) obj).b;
                if (ix3Var.n) {
                    return;
                }
                ix3Var.r.setVisibility(8);
                return;
            case 28:
                mx3 mx3Var = (mx3) ((lx3) obj).b;
                ArrayList arrayList5 = mx3Var.o;
                if (arrayList5.isEmpty()) {
                    return;
                }
                mx3Var.l.e(true, 0.0f);
                int i9 = mx3Var.k + 1;
                mx3Var.k = i9;
                if (i9 > arrayList5.size() - 1) {
                    mx3Var.k = 0;
                }
                d29 d29Var = mx3Var.j;
                d29Var.e((k39) arrayList5.get(mx3Var.k));
                mx3Var.j = mx3Var.i;
                mx3Var.i = d29Var;
                mx3Var.p.invalidate();
                return;
            default:
                ((wy3) obj).a(true, true);
                return;
        }
    }
}

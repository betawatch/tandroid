// default package

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseIntArray;
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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class li3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ li3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x03c9, code lost:
    
        r5 = org.telegram.ui.Dictation.DictationAsr.nativeFileNext(r7);
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
        Object obj;
        byte b = this.a;
        long j = 0;
        byte b2 = 8;
        int i2 = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                cj3 cj3Var = ((mi3) obj2).a;
                i = ((d) cj3Var).currentAccount;
                bundle.putLong("user_id", y6c.h(i).e());
                bundle.putBoolean("my_profile", true);
                cj3Var.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                cj3 cj3Var2 = ((qi3) obj2).H0;
                cj3Var2.showDialog(new jh8((d) cj3Var2, 9, true));
                cj3Var2.A0.setIsEditing(false);
                cj3Var2.Z4(false);
                return;
            case 2:
                cj3 cj3Var3 = ((ti3) obj2).b;
                cj3Var3.A0.setIsEditing(true);
                cj3Var3.Z4(true);
                return;
            case 3:
                dj3 dj3Var = (dj3) obj2;
                dj3Var.a.a(!r1.f, true);
                gl.d3(dj3Var.f, 3000L);
                return;
            case 4:
                ((ot9) obj2).W(false);
                return;
            case 5:
                mt9 mt9Var = (mt9) obj2;
                qe4 qe4Var = mt9Var.B0;
                if (qe4Var != null) {
                    ((ag3) qe4Var).h(false, null, mt9Var.z0, mt9Var.A0);
                    return;
                }
                return;
            case 6:
                bl3 bl3Var = (bl3) obj2;
                bl3Var.c = yk3.d;
                bl3Var.J.clear();
                int i3 = bl3Var.G0;
                if (i3 >= 0 && i3 < bl3Var.b()) {
                    bl3Var.g(bl3Var.G0);
                }
                bl3Var.P();
                return;
            case 7:
                hl3 hl3Var = ((fl3) obj2).d;
                hl3Var.s = false;
                hl3Var.w = null;
                Choreographer.getInstance().removeFrameCallback(hl3Var);
                hl3Var.G = 0L;
                knc kncVar = (knc) hl3Var;
                lnc lncVar = kncVar.M;
                if (lncVar.d == kncVar) {
                    lncVar.h();
                    return;
                }
                return;
            case 8:
                ((jl3) obj2).c(null, null);
                return;
            case 9:
                yl3 yl3Var = (yl3) obj2;
                long h = DictationAsr.h(yl3Var.b);
                if (h == 0) {
                    yl3Var.b(yl3Var.o);
                    return;
                }
                DictationAsr.O();
                am3 am3Var = yl3Var.a;
                synchronized (am3Var.a) {
                    z = am3Var.d;
                }
                if (!z) {
                    String a = yl3Var.b.a(yl3Var.c);
                    String str = a.split(",")[0];
                    nativeSessionNew = DictationAsr.nativeSessionNew(h, a, str, gba.o() == 0 ? 2 : 4);
                    StringBuilder sb = new StringBuilder("tinyasr: session ");
                    ls6.u(sb, yl3Var.b.a, " in ", a, " (from ");
                    sb.append(str);
                    sb.append("), audio from 0 ms");
                    Log.d("Dictation", sb.toString());
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i4 = 0;
                    while (true) {
                        try {
                            if (!yl3Var.l) {
                                boolean z2 = yl3Var.k;
                                int c = yl3Var.a.c() - i4;
                                if (c >= 2) {
                                    int min = Math.min(10240, c & (-2)) + i4;
                                    byte[] b3 = yl3Var.a.b(i4, min);
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                    nativeSessionPush = DictationAsr.nativeSessionPush(nativeSessionNew, b3, 0, b3.length);
                                    yl3Var.a(nativeSessionPush);
                                    j += SystemClock.elapsedRealtime() - elapsedRealtime2;
                                    yl3Var.m = min;
                                    i4 = min;
                                } else if (z2) {
                                    nativeSessionFinish = DictationAsr.nativeSessionFinish(nativeSessionNew);
                                    yl3Var.a(nativeSessionFinish);
                                    Log.d("Dictation", "tinyasr: finished, " + (i4 / 32) + " ms of audio, " + j + " ms busy, " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms in all");
                                } else {
                                    Thread.sleep(40L);
                                }
                            }
                        } catch (InterruptedException unused) {
                        } catch (Throwable th) {
                            DictationAsr.nativeSessionFree(nativeSessionNew);
                            DictationAsr.S(yl3Var.b);
                            throw th;
                        }
                    }
                    DictationAsr.nativeSessionFree(nativeSessionNew);
                    DictationAsr.S(yl3Var.b);
                    yl3Var.b(yl3Var.o);
                    return;
                }
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                am3 am3Var2 = yl3Var.a;
                byte[] b4 = am3Var2.b(0, am3Var2.c());
                yl3Var.m = b4.length;
                int length = b4.length / 2;
                float[] fArr = new float[length];
                while (i2 < length) {
                    int i5 = i2 << 1;
                    fArr[i2] = ((short) ((b4[i5] & 255) | (b4[i5 + 1] << 8))) / 32768.0f;
                    i2++;
                    b2 = b2;
                }
                nativeFileNew = DictationAsr.nativeFileNew(h, fArr, yl3Var.b.a(yl3Var.c), gba.o() != 0 ? 4 : 2);
                try {
                    if (nativeFileNew == 0) {
                        if (nativeFileNew != 0) {
                            DictationAsr.nativeFileFree(nativeFileNew);
                        }
                        DictationAsr.S(yl3Var.b);
                        while (!yl3Var.k && !yl3Var.l) {
                            Thread.sleep(10L);
                        }
                    } else {
                        while (!yl3Var.l && nativeFileNext != null) {
                            try {
                                try {
                                    DictationAsr.l(yl3Var.e, new JSONArray(nativeFileNext), null);
                                } catch (Exception e) {
                                    Log.e("Dictation", "tinyasr: words " + nativeFileNext, e);
                                }
                                yl3Var.b(null);
                            } catch (Throwable th2) {
                                if (nativeFileNew != 0) {
                                    DictationAsr.nativeFileFree(nativeFileNew);
                                }
                                DictationAsr.S(yl3Var.b);
                                while (!yl3Var.k && !yl3Var.l) {
                                    try {
                                        Thread.sleep(10L);
                                    } catch (InterruptedException unused2) {
                                    }
                                }
                                yl3Var.b(yl3Var.o);
                                throw th2;
                            }
                        }
                        Log.d("Dictation", "tinyasr: file pass in " + yl3Var.c + ", " + (length / 16) + " ms of audio in " + (SystemClock.elapsedRealtime() - elapsedRealtime3) + " ms");
                        if (nativeFileNew != 0) {
                            DictationAsr.nativeFileFree(nativeFileNew);
                        }
                        DictationAsr.S(yl3Var.b);
                        while (!yl3Var.k && !yl3Var.l) {
                            Thread.sleep(10L);
                        }
                    }
                } catch (InterruptedException unused3) {
                }
                yl3Var.b(yl3Var.o);
                return;
            case 10:
                gl.E3((ex1) obj2);
                return;
            case 11:
                ((eq3) obj2).a(false);
                return;
            case 12:
                ((ps3) obj2).a();
                return;
            case 13:
                gl.t1(((c1a) obj2).b.getEditText());
                return;
            case 14:
                ((zt3) obj2).removeSelfFromStack();
                return;
            case 15:
                ((EglRenderer) obj2).renderFrameOnRenderThread();
                return;
            case 16:
                d01.t(((ou3) ((su) obj2).b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 17:
                ou3 ou3Var = ((nu3) obj2).a;
                ou3Var.r1.setVisibility(4);
                ou3Var.q1.setVisibility(4);
                ImageView imageView = ou3Var.w1;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 18:
                zu3 zu3Var = (zu3) obj2;
                ArrayList arrayList = zu3Var.y;
                ArrayList arrayList2 = zu3Var.x;
                if (zu3Var.r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = zu3Var.r;
                    tL_sendMessageEmojiInteraction.emoticon = zu3Var.w;
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
                        long j2 = zu3Var.K;
                        if (j2 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j2;
                            tL_messages_setTyping.flags |= 1;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = na7.q1(zu3Var.b).h1(zu3Var.J);
                        ConnectionsManager.getInstance(zu3Var.b).sendRequest(tL_messages_setTyping, null);
                        zu3Var.r = 0;
                        zu3Var.w = null;
                        zu3Var.s = 0L;
                        arrayList2.clear();
                        arrayList.clear();
                    } catch (JSONException e2) {
                        zu3Var.r = 0;
                        zu3Var.w = null;
                        zu3Var.s = 0L;
                        arrayList2.clear();
                        arrayList.clear();
                        fa4.g(e2, true);
                    }
                }
                zu3Var.E = null;
                return;
            case 19:
                m21.e();
                jh8 jh8Var = new jh8((d) new hu0((mt7) obj2), 14, false);
                jh8Var.setOnDismissListener(new g5((byte) 6));
                jh8Var.show();
                return;
            case 20:
                ((lv3) obj2).F();
                return;
            case 21:
                sv3 sv3Var = (sv3) obj2;
                ArrayList arrayList3 = sv3Var.w;
                ArrayList arrayList4 = sv3Var.s;
                tv3 tv3Var = sv3Var.O;
                ew3 ew3Var = tv3Var.s;
                int i7 = ew3.C1;
                hq6 d0 = hq6.d0(ew3Var.a);
                String str2 = sv3Var.I;
                if (!"premium".equalsIgnoreCase(str2)) {
                    if (tv3Var.a == 1 && vu3.d(sv3Var.I)) {
                        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                        tL_messages_getStickers.emoticon = sv3Var.I;
                        tL_messages_getStickers.hash = 0L;
                        ConnectionsManager.getInstance(ew3Var.a).sendRequest(tL_messages_getStickers, new rv3(sv3Var, str2, null == true ? 1 : 0));
                        return;
                    }
                    String[] F0 = gl.F0();
                    String[] strArr = sv3Var.K;
                    if (strArr == null || !Arrays.equals(F0, strArr)) {
                        hq6.d0(ew3Var.a).O(F0, false);
                    }
                    sv3Var.K = F0;
                    d0.X(F0, sv3Var.I, false, new lt2(sv3Var, str2, d0, b2), false, false, false, true, 50);
                    return;
                }
                ArrayList j0 = d0.j0(7, false);
                sv3Var.y = 0;
                arrayList4.clear();
                arrayList3.clear();
                sv3Var.E.clear();
                sv3Var.n.clear();
                sv3Var.y++;
                arrayList4.add(null);
                arrayList3.add(0L);
                arrayList4.addAll(j0);
                sv3Var.y = j0.size() + sv3Var.y;
                sv3Var.J = sv3Var.I;
                sv3Var.f();
                jv3 jv3Var = tv3Var.b;
                int i8 = jv3.q3;
                jv3Var.z1(0, 0);
                tv3Var.f.c(false);
                tv3Var.e.n(false);
                return;
            case 22:
                xv3 xv3Var = (xv3) ((b7) obj2).b;
                if (xv3Var.n) {
                    return;
                }
                xv3Var.r.setVisibility(8);
                return;
            case 23:
                bw3 bw3Var = (bw3) ((aw3) obj2).b;
                ArrayList arrayList5 = bw3Var.o;
                if (arrayList5.isEmpty()) {
                    return;
                }
                bw3Var.l.e(true, 0.0f);
                int i9 = bw3Var.k + 1;
                bw3Var.k = i9;
                if (i9 > arrayList5.size() - 1) {
                    bw3Var.k = 0;
                }
                b09 b09Var = bw3Var.j;
                b09Var.e((h19) arrayList5.get(bw3Var.k));
                bw3Var.j = bw3Var.i;
                bw3Var.i = b09Var;
                bw3Var.p.invalidate();
                return;
            case 24:
                ((mx3) obj2).a(true, true);
                return;
            case 25:
                sz3 sz3Var = (sz3) obj2;
                if (sz3Var.a0.getEmojiView() != null) {
                    t14 emojiView = sz3Var.a0.getEmojiView();
                    if (emojiView.g0) {
                        return;
                    }
                    try {
                        SparseIntArray sparseIntArray = emojiView.S.s;
                        char[] cArr = ow3.a;
                        int i10 = sparseIntArray.get(8);
                        if (i10 > 0) {
                            emojiView.Q.D0();
                            emojiView.V(i10);
                            emojiView.E(i10, gl.L(-9.0f));
                            emojiView.j(0, null);
                            return;
                        }
                        return;
                    } catch (Exception unused4) {
                        return;
                    }
                }
                return;
            case 26:
                s04 s04Var = (s04) obj2;
                t04 t04Var = s04Var.a;
                if (t04Var.G.W.G) {
                    return;
                }
                ArrayList arrayList6 = new ArrayList();
                t04Var.G.W.d(true);
                t04Var.F(new eu3(s04Var, arrayList6, b2), arrayList6, true);
                return;
            case 27:
                l04 l04Var = (l04) obj2;
                l04Var.x.f = true;
                l04Var.a(true);
                return;
            case 28:
                gl.P3(((h14) obj2).h, true, true);
                return;
            default:
                y54 y54Var = (y54) obj2;
                ko koVar = y54Var.C;
                Context context = y54Var.e;
                String str3 = g8c.a;
                int generateAudioSessionId = i00.e(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                koVar.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((cdb) koVar.c).a.getLooper()) {
                    obj = koVar.e;
                } else {
                    gre.p(myLooper == ((cdb) koVar.b).a.getLooper());
                    obj = koVar.f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    koVar.f = valueOf;
                    xd0 xd0Var = new xd0(koVar, valueOf, (byte) 0);
                    cdb cdbVar = (cdb) koVar.c;
                    if (cdbVar.a.getLooper().getThread().isAlive()) {
                        cdbVar.e(xd0Var);
                    }
                    cdb cdbVar2 = y54Var.l.h;
                    bdb b5 = cdbVar2.b(40, generateAudioSessionId, 0);
                    Handler handler = cdbVar2.a;
                    Message message = b5.a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    b5.a();
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class fx implements org.telegram.messenger.cs {
    public static final HashSet M = new HashSet();
    public static final HashSet N;
    public xg E;
    public l9.u F;
    public final FrameLayout H;
    public final org.telegram.ui.Components.tj0 I;
    public final long J;
    public final long K;
    public HashMap L;
    public final wm a;
    public int b;
    public TLRPC.TL_messages_stickerSet c;
    public boolean n;
    public String w;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Random h = new Random();
    public int r = -1;
    public long s = 0;
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ArrayList G = new ArrayList();

    static {
        HashSet hashSet = new HashSet();
        N = hashSet;
        hashSet.add("0⃣");
        hashSet.add("1⃣");
        hashSet.add("2⃣");
        hashSet.add("3⃣");
        hashSet.add("4⃣");
        hashSet.add("5⃣");
        hashSet.add("6⃣");
        hashSet.add("7⃣");
        hashSet.add("8⃣");
        hashSet.add("9⃣");
    }

    public fx(int i3, FrameLayout frameLayout) {
        this.H = frameLayout;
        this.b = i3;
    }

    public static boolean a(org.telegram.ui.Cells.q1 q1Var, float f10, int i3) {
        float s6 = q1Var.getPhotoImage().s() + q1Var.getY();
        return s6 > f10 && s6 < ((float) i3);
    }

    public static int f() {
        float min;
        float f10;
        if (org.telegram.messenger.g0.Q1()) {
            min = org.telegram.messenger.g0.Q0();
            f10 = 0.4f;
        } else {
            Point point = org.telegram.messenger.g0.q;
            min = Math.min(point.x, point.y);
            f10 = 0.5f;
        }
        return (int) ((((int) (min * f10)) * 2.0f) / org.telegram.messenger.g0.p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r8.charAt(r3) <= 57343) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r8.charAt(r3) != 9794) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String p(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i3 = 0;
        String str2 = str;
        while (i3 < length) {
            if (i3 < length - 1) {
                if (str2.charAt(i3) == 55356) {
                    int i10 = i3 + 1;
                    if (str2.charAt(i10) >= 57339) {
                    }
                }
                if (str2.charAt(i3) == 8205) {
                    int i11 = i3 + 1;
                    if (str2.charAt(i11) != 9792) {
                    }
                    length -= 2;
                    str2 = TextUtils.concat(str2.subSequence(0, i3), str2.subSequence(i3 + 2, str2.length()));
                    i3--;
                    i3++;
                    str2 = str2;
                }
            }
            if (str2.charAt(i3) == 65039) {
                length--;
                str2 = TextUtils.concat(str2.subSequence(0, i3), str2.subSequence(i3 + 1, str2.length()));
                i3--;
                i3++;
                str2 = str2;
            } else {
                i3++;
                str2 = str2;
            }
        }
        return str2.toString();
    }

    public final void b() {
        if (this.d) {
            return;
        }
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.li.b0(this.b).p0("EmojiAnimations");
        this.c = p02;
        if (p02 == null) {
            this.c = org.telegram.messenger.li.b0(this.b).n0("EmojiAnimations");
        }
        if (this.c == null) {
            org.telegram.messenger.li.b0(this.b).c1("EmojiAnimations", false, true);
        }
        if (this.c != null) {
            HashMap hashMap = new HashMap();
            for (int i3 = 0; i3 < this.c.documents.size(); i3++) {
                hashMap.put(Long.valueOf(this.c.documents.get(i3).id), this.c.documents.get(i3));
            }
            for (int i10 = 0; i10 < this.c.packs.size(); i10++) {
                TLRPC.TL_stickerPack tL_stickerPack = this.c.packs.get(i10);
                if (!N.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                    String str = tL_stickerPack.emoticon;
                    HashSet hashSet = M;
                    hashSet.add(str);
                    ArrayList arrayList = new ArrayList();
                    String str2 = tL_stickerPack.emoticon;
                    HashMap hashMap2 = this.e;
                    hashMap2.put(str2, arrayList);
                    for (int i11 = 0; i11 < tL_stickerPack.documents.size(); i11++) {
                        arrayList.add((TLRPC.Document) hashMap.get(tL_stickerPack.documents.get(i11)));
                    }
                    if (tL_stickerPack.emoticon.equals("❤")) {
                        String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎"};
                        for (int i12 = 0; i12 < 8; i12++) {
                            String str3 = strArr[i12];
                            hashSet.add(str3);
                            hashMap2.put(str3, arrayList);
                        }
                    }
                }
            }
            this.d = true;
        }
    }

    public final void c() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i3 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((ex) arrayList.get(i3)).r.R();
            if (((ex) arrayList.get(i3)).j != null) {
                ((ex) arrayList.get(i3)).j.d(this.H);
            }
            i3++;
        }
    }

    public final boolean d(String str, int i3, TLRPC.Document document, org.telegram.messenger.zi ziVar, int i10, boolean z10, boolean z11, float f10, float f11, boolean z12) {
        Random random;
        long j10;
        TLRPC.Document document2;
        int abs;
        TLRPC.VideoSize G1;
        boolean z13;
        xg xgVar;
        int i11 = i10;
        boolean z14 = ziVar != null && ziVar.X3();
        boolean z15 = (ziVar == null || ziVar.M0() == null) ? false : true;
        if (z15 || z14 || M.contains(str)) {
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (z15 || ((arrayList != null && !arrayList.isEmpty()) || z14)) {
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList2 = this.G;
                    if (i12 >= arrayList2.size()) {
                        int i15 = 27;
                        if (z10 && z14 && i13 > 0) {
                            org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.w;
                            if (acVar != null && acVar.b == ziVar.f1()) {
                                return false;
                            }
                            TLRPC.InputStickerSet k1 = org.telegram.messenger.zi.k1(ziVar.k);
                            TLRPC.TL_messages_stickerSet p02 = k1.short_name != null ? org.telegram.messenger.li.b0(this.b).p0(k1.short_name) : null;
                            if (p02 == null) {
                                p02 = org.telegram.messenger.li.b0(this.b).o0(k1.id);
                            }
                            if (p02 != null) {
                                o(p02, ziVar);
                                return false;
                            }
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = k1;
                            ConnectionsManager.getInstance(this.b).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.ActionBar.h6(i15, this, ziVar));
                            return false;
                        }
                        if (i13 >= 4) {
                            return false;
                        }
                        Random random2 = this.h;
                        if (z15) {
                            TLRPC.TL_availableEffect M0 = ziVar.M0();
                            j10 = 0;
                            TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.hp.s1(this.b).E0();
                            if (E0 == null) {
                                return false;
                            }
                            random = random2;
                            long j11 = M0.effect_animation_id;
                            if (j11 == 0) {
                                j11 = M0.effect_sticker_id;
                            }
                            int i16 = 0;
                            while (true) {
                                if (i16 >= E0.documents.size()) {
                                    document2 = null;
                                    break;
                                }
                                document2 = E0.documents.get(i16);
                                long j12 = j11;
                                if (document2 != null && document2.id == j12) {
                                    break;
                                }
                                i16++;
                                j11 = j12;
                            }
                            if (document2 == null) {
                                return false;
                            }
                            if (M0.effect_sticker_id != 0) {
                                G1 = org.telegram.messenger.zi.G1(document2);
                                z14 = G1 != null;
                            }
                            G1 = null;
                        } else {
                            random = random2;
                            j10 = 0;
                            if (z14) {
                                document2 = ziVar.F0();
                                G1 = org.telegram.messenger.zi.G1(ziVar.F0());
                            } else {
                                if (ziVar == null || !ziVar.G2()) {
                                    if (i11 < 0 || i11 > arrayList.size() - 1) {
                                        i11 = Math.abs(random.nextInt()) % arrayList.size();
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(i11);
                                } else {
                                    if (i11 < 0 || i11 > arrayList.size() - 1) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i17);
                                            if (document3 != null) {
                                                HashMap hashMap = this.L;
                                                Boolean bool = hashMap != null ? (Boolean) hashMap.get(Long.valueOf(document3.id)) : null;
                                                if (bool != null && bool.booleanValue()) {
                                                    arrayList3.add(Integer.valueOf(i17));
                                                }
                                            }
                                        }
                                        abs = arrayList3.isEmpty() ? Math.abs(random.nextInt()) % arrayList.size() : ((Integer) arrayList3.get(Math.abs(random.nextInt()) % arrayList3.size())).intValue();
                                    } else {
                                        abs = i11;
                                    }
                                    i11 = abs;
                                    document2 = (TLRPC.Document) arrayList.get(abs);
                                }
                                G1 = null;
                            }
                        }
                        if (document2 == null && G1 == null) {
                            return false;
                        }
                        ex exVar = new ex();
                        exVar.h = z14;
                        exVar.i = z15;
                        if (!z15) {
                            exVar.f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                            exVar.g = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        }
                        exVar.p = i3;
                        exVar.q = document2;
                        exVar.m = z12;
                        ImageReceiver imageReceiver = exVar.r;
                        imageReceiver.u0 = true;
                        imageReceiver.t0 = z10;
                        if (org.telegram.messenger.az.o() > 1) {
                            boolean z16 = org.telegram.messenger.r2.a;
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        int i18 = i11;
                        HashMap hashMap2 = this.f;
                        boolean z17 = z14;
                        if (G1 == null) {
                            int f12 = f();
                            boolean z18 = z13;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.id));
                            int intValue = (num == null ? 0 : num.intValue()) + 1;
                            hashMap2.put(Long.valueOf(document2.id), Integer.valueOf(intValue));
                            org.telegram.messenger.ac b10 = org.telegram.messenger.ac.b(document2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(intValue);
                            sb2.append("_");
                            imageReceiver.w1 = a1.g.o(exVar.p, "_", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(f12);
                            sb3.append("_");
                            sb3.append(f12);
                            sb3.append(z18 ? "_pcache" : "");
                            exVar.r.q0(b10, sb3.toString(), null, "tgs", this.c, 1);
                            imageReceiver.h1 = new dx(this, exVar, z10, ziVar);
                            if (imageReceiver.B() != null) {
                                imageReceiver.B().N(0, false, true);
                            }
                        } else {
                            boolean z19 = z13;
                            int f13 = f();
                            if (i14 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.id));
                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                hashMap2.put(Long.valueOf(document2.id), Integer.valueOf((intValue2 + 1) % 4));
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(intValue2);
                                sb4.append("_");
                                imageReceiver.w1 = a1.g.o(exVar.p, "_", sb4);
                            }
                            exVar.q = document2;
                            org.telegram.messenger.ac d = org.telegram.messenger.ac.d(G1, document2);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(f13);
                            sb5.append("_");
                            sb5.append(f13);
                            sb5.append(z19 ? "_pcache" : "");
                            exVar.r.q0(d, sb5.toString(), null, "tgs", this.c, 1);
                        }
                        imageReceiver.E0(ConnectionsManager.DEFAULT_DATACENTER_ID);
                        imageReceiver.W(0);
                        if (imageReceiver.B() != null) {
                            if (exVar.h) {
                                imageReceiver.B().N(0, false, true);
                            }
                            imageReceiver.B().start();
                        }
                        arrayList2.add(exVar);
                        imageReceiver.P();
                        FrameLayout frameLayout = this.H;
                        imageReceiver.H0(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z17 && org.telegram.messenger.h10.i(this.b).n != this.J) {
                            int i19 = this.r;
                            if (i19 != 0 && i19 != i3 && (xgVar = this.E) != null) {
                                org.telegram.messenger.g0.r(xgVar);
                                this.E.run();
                            }
                            this.r = i3;
                            this.w = str;
                            long j13 = this.s;
                            ArrayList arrayList4 = this.y;
                            ArrayList arrayList5 = this.x;
                            if (j13 == j10) {
                                this.s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i18));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.s));
                                arrayList4.add(Integer.valueOf(i18));
                            }
                            xg xgVar2 = this.E;
                            if (xgVar2 != null) {
                                org.telegram.messenger.g0.r(xgVar2);
                                this.E = null;
                            }
                            xg xgVar3 = new xg(this, 27);
                            this.E = xgVar3;
                            org.telegram.messenger.g0.i3(xgVar3, 500L);
                        }
                        if (!z11) {
                            return true;
                        }
                        org.telegram.messenger.hp.s1(this.b).C4(11, 0, this.J, this.K, str);
                        return true;
                    }
                    if (((ex) arrayList2.get(i12)).p == i3) {
                        i13++;
                        if (!z15 && (((ex) arrayList2.get(i12)).r.B() == null || ((ex) arrayList2.get(i12)).r.B().y())) {
                            return false;
                        }
                    }
                    if (((ex) arrayList2.get(i12)).q != null && document != null) {
                        if (((ex) arrayList2.get(i12)).q.id == document.id) {
                            i14++;
                        }
                    }
                    i12++;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        Integer E1;
        if (i3 == org.telegram.messenger.hs.y0) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i11 = org.telegram.messenger.hs.T4;
        long j10 = this.J;
        if (i3 != i11) {
            if (i3 == org.telegram.messenger.hs.r && (E1 = org.telegram.messenger.hp.s1(this.b).E1(j10, this.K)) != null && E1.intValue() == 5) {
                l9.u uVar = this.F;
                if (uVar != null) {
                    org.telegram.messenger.g0.r(uVar);
                }
                this.F = null;
                return;
            }
            return;
        }
        if (this.a == null) {
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
        if (longValue == j10 && M.contains(tL_sendMessageEmojiInteraction.emoticon)) {
            int i12 = tL_sendMessageEmojiInteraction.msg_id;
            if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                try {
                    JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                    for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i13);
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.bb0(this, i12, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public final void e(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        ImageReceiver imageReceiver;
        org.telegram.messenger.zi ziVar;
        if (this.G.isEmpty()) {
            return;
        }
        int i3 = 0;
        while (i3 < this.G.size()) {
            ex exVar = (ex) this.G.get(i3);
            if (this.a != null) {
                exVar.c = false;
                int i10 = 0;
                while (true) {
                    if (i10 >= this.I.getChildCount()) {
                        f10 = 3.0f;
                        f11 = 2.0f;
                        f12 = 0.0f;
                        break;
                    }
                    View childAt = this.I.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        ziVar = q1Var.getMessageObject();
                        imageReceiver = q1Var.getPhotoImage();
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                        ziVar = t0Var.getMessageObject();
                        imageReceiver = t0Var.getPhotoImage();
                    } else {
                        imageReceiver = null;
                        ziVar = null;
                    }
                    if (ziVar == null || ziVar.f1() != exVar.p) {
                        i10++;
                    } else {
                        exVar.c = true;
                        float x10 = childAt.getX() + this.I.getX();
                        float y9 = childAt.getY() + this.I.getY();
                        f12 = childAt.getY();
                        f10 = 3.0f;
                        float f13 = imageReceiver.N0;
                        exVar.d = f13;
                        f11 = 2.0f;
                        exVar.e = imageReceiver.O0;
                        if (exVar.i && (childAt instanceof org.telegram.ui.Cells.q1)) {
                            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                            float f14 = (f() * org.telegram.messenger.g0.p) / 1.3f;
                            float f15 = f14 / 3.0f;
                            exVar.d = f15;
                            exVar.e = f15;
                            float f16 = f14 / 2.0f;
                            exVar.a = Utilities.i((q1Var2.getTimeX() + x10) - f16, org.telegram.messenger.g0.q.x - f14, 0.0f);
                            exVar.b = (q1Var2.getTimeY() + y9) - f16;
                        } else if (exVar.h) {
                            exVar.a = x10 + imageReceiver.L0;
                            exVar.b = y9 + imageReceiver.M0;
                        } else {
                            float f17 = x10 + imageReceiver.L0;
                            float f18 = y9 + imageReceiver.M0;
                            float L = exVar.m ? ((-f13) * 2.0f) + org.telegram.messenger.g0.L(24.0f) + f17 : (-org.telegram.messenger.g0.L(24.0f)) + f17;
                            float f19 = f18 - imageReceiver.N0;
                            exVar.a = L;
                            exVar.b = f19;
                        }
                    }
                }
                if (!exVar.c || exVar.e + f12 < this.a.M9 || f12 > this.I.getMeasuredHeight() - this.a.Va) {
                    exVar.n = true;
                }
                if (exVar.h) {
                    float f20 = exVar.e / f11;
                    boolean z10 = ((float) this.I.getMeasuredHeight()) - f12 <= f20;
                    boolean z11 = (f12 - this.a.M9) + f20 <= 0.0f;
                    if (z10 || z11) {
                        exVar.n = true;
                    }
                }
                if (exVar.n) {
                    float f21 = exVar.o;
                    if (f21 != 1.0f) {
                        float i11 = Utilities.i(f21 + 0.10666667f, 1.0f, 0.0f);
                        exVar.o = i11;
                        exVar.r.setAlpha(1.0f - i11);
                        this.a.m1.invalidate();
                    }
                }
            } else {
                f10 = 3.0f;
                f11 = 2.0f;
                g(exVar);
            }
            boolean z12 = !exVar.l && exVar.n;
            if (!z12) {
                if (!exVar.h || exVar.i) {
                    dh.d dVar = exVar.j;
                    if (dVar != null) {
                        float f22 = exVar.a + exVar.f;
                        float f23 = exVar.b + exVar.g;
                        float f24 = exVar.d * f10;
                        dVar.e((int) f22, (int) f23, (int) (f22 + f24), (int) (f23 + f24));
                        exVar.j.b(canvas);
                    } else {
                        ImageReceiver imageReceiver2 = exVar.r;
                        float f25 = exVar.a + exVar.f;
                        float f26 = exVar.b + exVar.g;
                        float f27 = exVar.d * f10;
                        imageReceiver2.y0(f25, f26, f27, f27);
                        if (exVar.m) {
                            exVar.r.h(canvas, null);
                        } else {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, exVar.r.r(), exVar.r.s());
                            exVar.r.h(canvas, null);
                            canvas.restore();
                        }
                    }
                } else {
                    float f28 = exVar.e;
                    float f29 = 1.49926f * f28;
                    float f30 = 0.0546875f * f29;
                    float f31 = (((f28 / f11) + exVar.b) - (f29 / f11)) - (0.00279f * f29);
                    if (exVar.m) {
                        exVar.r.y0(((exVar.a + exVar.d) - f29) + f30, f31, f29, f29);
                    } else {
                        exVar.r.y0(exVar.a - f30, f31, f29, f29);
                    }
                    if (exVar.m) {
                        exVar.r.h(canvas, null);
                    } else {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, exVar.r.r(), exVar.r.s());
                        exVar.r.h(canvas, null);
                        canvas.restore();
                    }
                }
            }
            dh.d dVar2 = exVar.j;
            boolean c2 = dVar2 != null ? dVar2.c() : exVar.l && exVar.r.B() != null && exVar.r.B().b0 >= exVar.r.B().e[0] + (-2);
            if (exVar.o == 1.0f || c2 || z12) {
                ex exVar2 = (ex) this.G.remove(i3);
                if (exVar.h && exVar.r.B() != null) {
                    exVar2.r.B().N(0, true, true);
                }
                exVar2.r.R();
                dh.d dVar3 = exVar2.j;
                if (dVar3 != null) {
                    dVar3.d(this.H);
                }
                i3--;
            } else if (exVar.r.B() != null && exVar.r.B().l0) {
                exVar.l = true;
            } else if (exVar.r.B() != null && !exVar.r.B().l0) {
                exVar.r.B().N(0, true, false);
                exVar.r.B().start();
            }
            i3++;
        }
        if (this.G.isEmpty()) {
            h();
        }
        this.H.invalidate();
    }

    public final void i() {
        this.n = true;
        b();
        org.telegram.messenger.hs.f(this.b).c(this, org.telegram.messenger.hs.y0);
        org.telegram.messenger.hs.f(this.b).c(this, org.telegram.messenger.hs.T4);
        org.telegram.messenger.hs.f(this.b).c(this, org.telegram.messenger.hs.r);
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((ex) arrayList.get(i3)).r.P();
            if (((ex) arrayList.get(i3)).j != null) {
                ((ex) arrayList.get(i3)).j.f(this.H);
            }
            i3++;
        }
    }

    public final void j() {
        int i3 = 0;
        this.n = false;
        org.telegram.messenger.hs.f(this.b).n(this, org.telegram.messenger.hs.y0);
        org.telegram.messenger.hs.f(this.b).n(this, org.telegram.messenger.hs.T4);
        org.telegram.messenger.hs.f(this.b).n(this, org.telegram.messenger.hs.r);
        while (true) {
            ArrayList arrayList = this.G;
            if (i3 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((ex) arrayList.get(i3)).r.R();
            if (((ex) arrayList.get(i3)).j != null) {
                ((ex) arrayList.get(i3)).j.d(this.H);
            }
            i3++;
        }
    }

    public final void k(org.telegram.ui.Cells.q1 q1Var, wm wmVar, boolean z10) {
        if (wmVar.z() || q1Var.getMessageObject() == null || q1Var.getMessageObject().f1() < 0) {
            return;
        }
        if (q1Var.getMessageObject().X3() || wmVar.f != null) {
            boolean z11 = false;
            boolean n4 = n(q1Var, -1, z10, false);
            if (z10 && n4) {
                String W1 = q1Var.getMessageObject().W1();
                if (!org.telegram.messenger.j6.a(W1) && !"🍑".equals(W1) && !"⚰".equals(W1) && !q1Var.getMessageObject().X3() && !q1Var.getMessageObject().G2()) {
                    try {
                        q1Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            if (q1Var.getMessageObject().X3() || q1Var.getEffect() != null || (!z10 && q1Var.getMessageObject().o != null)) {
                q1Var.getMessageObject().R = false;
                q1Var.getMessageObject().k.premiumEffectWasPlayed = true;
                wmVar.getMessagesStorage().X1(this.J, q1Var.getMessageObject().k);
                return;
            }
            Integer E1 = org.telegram.messenger.hp.s1(this.b).E1(this.J, this.K);
            if ((E1 == null || E1.intValue() != 5) && this.F == null && n4) {
                org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.w;
                if ((acVar == null || !acVar.l) && org.telegram.messenger.az.d1 > 0 && org.telegram.messenger.h10.i(this.b).e() != wmVar.f.id) {
                    org.telegram.messenger.az.d1--;
                    org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", org.telegram.messenger.az.d1).apply();
                    org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(wmVar.getParentActivity(), null, 1, -1, q1Var.getMessageObject().G2() ? q1Var.getMessageObject().F0() : org.telegram.messenger.li.b0(this.b).T(q1Var.getMessageObject().W1()), wmVar.getResourceProvider());
                    bv0Var.c.setVisibility(8);
                    bv0Var.b.setText(org.telegram.messenger.i6.m(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("EmojiInteractionTapHint", null, 2131751178, wmVar.f.first_name)), bv0Var.b.getPaint().getFontMetricsInt(), false, null, 0));
                    bv0Var.b.setTypeface(null);
                    bv0Var.b.setMaxLines(3);
                    bv0Var.b.setSingleLine(false);
                    l9.u uVar = new l9.u(this, org.telegram.ui.Components.ac.g(wmVar, bv0Var, 2750), z11, 28);
                    this.F = uVar;
                    org.telegram.messenger.g0.i3(uVar, 1500L);
                }
            }
        }
    }

    public final void l(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        HashMap hashMap = this.L;
        if (hashMap == null || !hashMap.containsKey(Long.valueOf(document.id))) {
            if (this.L == null) {
                this.L = new HashMap();
            }
            this.L.put(Long.valueOf(document.id), Boolean.TRUE);
            org.telegram.messenger.li.b0(this.b).l1(org.telegram.messenger.ac.b(document), 2);
        }
    }

    public final void m(org.telegram.ui.Cells.q1 q1Var) {
        ArrayList arrayList;
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        if (messageObject.X3()) {
            return;
        }
        String W1 = messageObject.W1();
        if (W1 == null) {
            W1 = messageObject.k.message;
        }
        String p10 = p(W1);
        if (!M.contains(p10) || (arrayList = (ArrayList) this.e.get(p10)) == null || arrayList.isEmpty()) {
            return;
        }
        int min = Math.min(1, arrayList.size());
        for (int i3 = 0; i3 < min; i3++) {
            l((TLRPC.Document) arrayList.get(i3));
        }
    }

    public final boolean n(org.telegram.ui.Cells.q1 q1Var, int i3, boolean z10, boolean z11) {
        if (q1Var == null || this.G.size() > 12) {
            return false;
        }
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        if (q1Var.getEffect() == null && !q1Var.getPhotoImage().L()) {
            return false;
        }
        String W1 = messageObject.W1();
        if (W1 == null) {
            W1 = messageObject.k.message;
        }
        if (q1Var.getEffect() == null && W1 == null) {
            return false;
        }
        float f10 = q1Var.getPhotoImage().O0;
        float f11 = q1Var.getPhotoImage().N0;
        if (q1Var.getEffect() != null || (f10 > 0.0f && f11 > 0.0f)) {
            return d(p(W1), q1Var.getMessageObject().f1(), q1Var.getMessageObject().F0(), messageObject, i3, z10, z11, f11, f10, q1Var.getMessageObject().Q3());
        }
        return false;
    }

    public final void o(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.messenger.zi ziVar) {
        wm wmVar = this.a;
        if (wmVar == null || org.telegram.messenger.hp.s1(this.b).D3() || wmVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(this.H.getContext(), null, 1, -1, ziVar.F0(), wmVar.getResourceProvider());
        bv0Var.b.setText(tL_messages_stickerSet.set.title);
        bv0Var.c.setText(org.telegram.messenger.bd.M0(2131746956, null));
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(wmVar.getParentActivity(), wmVar.getResourceProvider(), true);
        bv0Var.setButton(ybVar);
        ybVar.b = new org.telegram.ui.Components.p11(24, this, ziVar);
        ybVar.e(org.telegram.messenger.bd.M0(2131743573, null));
        org.telegram.ui.Components.ac g7 = org.telegram.ui.Components.ac.g(wmVar, bv0Var, 2750);
        g7.b = ziVar.f1();
        g7.j();
    }

    public fx(wm wmVar, FrameLayout frameLayout, org.telegram.ui.Components.tj0 tj0Var, int i3, long j10, long j11) {
        this.a = wmVar;
        this.H = frameLayout;
        this.I = tj0Var;
        this.b = i3;
        this.J = j10;
        this.K = j11;
    }

    public void g(ex exVar) {
    }

    public void h() {
    }
}

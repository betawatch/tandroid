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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class mx implements org.telegram.messenger.fs {
    public static final HashSet M = new HashSet();
    public static final HashSet N;
    public ch E;
    public m9.u F;
    public final FrameLayout H;
    public final org.telegram.ui.Components.ek0 I;
    public final long J;
    public final long K;
    public HashMap L;
    public final bn a;
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

    public mx(int i7, FrameLayout frameLayout) {
        this.H = frameLayout;
        this.b = i7;
    }

    public static boolean a(org.telegram.ui.Cells.r1 r1Var, float f10, int i7) {
        float s5 = r1Var.getPhotoImage().s() + r1Var.getY();
        return s5 > f10 && s5 < ((float) i7);
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
        int i7 = 0;
        String str2 = str;
        while (i7 < length) {
            if (i7 < length - 1) {
                if (str2.charAt(i7) == 55356) {
                    int i10 = i7 + 1;
                    if (str2.charAt(i10) >= 57339) {
                    }
                }
                if (str2.charAt(i7) == 8205) {
                    int i11 = i7 + 1;
                    if (str2.charAt(i11) != 9792) {
                    }
                    length -= 2;
                    str2 = TextUtils.concat(str2.subSequence(0, i7), str2.subSequence(i7 + 2, str2.length()));
                    i7--;
                    i7++;
                    str2 = str2;
                }
            }
            if (str2.charAt(i7) == 65039) {
                length--;
                str2 = TextUtils.concat(str2.subSequence(0, i7), str2.subSequence(i7 + 1, str2.length()));
                i7--;
                i7++;
                str2 = str2;
            } else {
                i7++;
                str2 = str2;
            }
        }
        return str2.toString();
    }

    public final void b() {
        if (this.d) {
            return;
        }
        TLRPC.TL_messages_stickerSet r02 = org.telegram.messenger.ri.d0(this.b).r0("EmojiAnimations");
        this.c = r02;
        if (r02 == null) {
            this.c = org.telegram.messenger.ri.d0(this.b).p0("EmojiAnimations");
        }
        if (this.c == null) {
            org.telegram.messenger.ri.d0(this.b).f1("EmojiAnimations", false, true);
        }
        if (this.c != null) {
            HashMap hashMap = new HashMap();
            for (int i7 = 0; i7 < this.c.documents.size(); i7++) {
                hashMap.put(Long.valueOf(this.c.documents.get(i7).id), this.c.documents.get(i7));
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
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((lx) arrayList.get(i7)).r.S();
            if (((lx) arrayList.get(i7)).j != null) {
                ((lx) arrayList.get(i7)).j.d(this.H);
            }
            i7++;
        }
    }

    public final boolean d(String str, int i7, TLRPC.Document document, org.telegram.messenger.fj fjVar, int i10, boolean z10, boolean z11, float f10, float f11, boolean z12) {
        Random random;
        long j3;
        TLRPC.Document document2;
        int abs;
        TLRPC.VideoSize F1;
        boolean z13;
        ch chVar;
        int i11 = i10;
        boolean z14 = fjVar != null && fjVar.W3();
        boolean z15 = (fjVar == null || fjVar.M0() == null) ? false : true;
        if (z15 || z14 || M.contains(str)) {
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (z15 || ((arrayList != null && !arrayList.isEmpty()) || z14)) {
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList2 = this.G;
                    if (i12 >= arrayList2.size()) {
                        if (z10 && z14 && i13 > 0) {
                            org.telegram.ui.Components.fc fcVar = org.telegram.ui.Components.fc.w;
                            if (fcVar != null && fcVar.b == fjVar.e1()) {
                                return false;
                            }
                            TLRPC.InputStickerSet j12 = org.telegram.messenger.fj.j1(fjVar.k);
                            TLRPC.TL_messages_stickerSet r02 = j12.short_name != null ? org.telegram.messenger.ri.d0(this.b).r0(j12.short_name) : null;
                            if (r02 == null) {
                                r02 = org.telegram.messenger.ri.d0(this.b).q0(j12.id);
                            }
                            if (r02 != null) {
                                o(r02, fjVar);
                                return false;
                            }
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = j12;
                            ConnectionsManager.getInstance(this.b).sendRequest(tL_messages_getStickerSet, new v7(26, this, fjVar));
                            return false;
                        }
                        if (i13 >= 4) {
                            return false;
                        }
                        Random random2 = this.h;
                        if (z15) {
                            TLRPC.TL_availableEffect M0 = fjVar.M0();
                            TLRPC.messages_AvailableEffects G0 = org.telegram.messenger.mp.u1(this.b).G0();
                            if (G0 == null) {
                                return false;
                            }
                            j3 = 0;
                            long j10 = M0.effect_animation_id;
                            if (j10 == 0) {
                                j10 = M0.effect_sticker_id;
                            }
                            random = random2;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= G0.documents.size()) {
                                    document2 = null;
                                    break;
                                }
                                document2 = G0.documents.get(i15);
                                long j11 = j10;
                                if (document2 != null && document2.id == j11) {
                                    break;
                                }
                                i15++;
                                j10 = j11;
                            }
                            if (document2 == null) {
                                return false;
                            }
                            if (M0.effect_sticker_id != 0) {
                                F1 = org.telegram.messenger.fj.F1(document2);
                                z14 = F1 != null;
                            }
                            F1 = null;
                        } else {
                            random = random2;
                            j3 = 0;
                            if (z14) {
                                document2 = fjVar.F0();
                                F1 = org.telegram.messenger.fj.F1(fjVar.F0());
                            } else {
                                if (fjVar == null || !fjVar.F2()) {
                                    if (i11 < 0 || i11 > arrayList.size() - 1) {
                                        i11 = Math.abs(random.nextInt()) % arrayList.size();
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(i11);
                                } else {
                                    if (i11 < 0 || i11 > arrayList.size() - 1) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                                            if (document3 != null) {
                                                HashMap hashMap = this.L;
                                                Boolean bool = hashMap != null ? (Boolean) hashMap.get(Long.valueOf(document3.id)) : null;
                                                if (bool != null && bool.booleanValue()) {
                                                    arrayList3.add(Integer.valueOf(i16));
                                                }
                                            }
                                        }
                                        abs = arrayList3.isEmpty() ? Math.abs(random.nextInt()) % arrayList.size() : ((Integer) arrayList3.get(Math.abs(random.nextInt()) % arrayList3.size())).intValue();
                                    } else {
                                        abs = i11;
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(abs);
                                    i11 = abs;
                                }
                                F1 = null;
                            }
                        }
                        if (document2 == null && F1 == null) {
                            return false;
                        }
                        lx lxVar = new lx();
                        lxVar.h = z14;
                        lxVar.i = z15;
                        if (!z15) {
                            lxVar.f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                            lxVar.g = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        }
                        lxVar.p = i7;
                        lxVar.q = document2;
                        lxVar.m = z12;
                        ImageReceiver imageReceiver = lxVar.r;
                        imageReceiver.u0 = true;
                        imageReceiver.t0 = z10;
                        if (org.telegram.messenger.bz.o() > 1) {
                            boolean z16 = org.telegram.messenger.s2.a;
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        int i17 = i11;
                        HashMap hashMap2 = this.f;
                        boolean z17 = z14;
                        if (F1 == null) {
                            int f12 = f();
                            boolean z18 = z13;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.id));
                            int intValue = (num == null ? 0 : num.intValue()) + 1;
                            hashMap2.put(Long.valueOf(document2.id), Integer.valueOf(intValue));
                            org.telegram.messenger.fc b10 = org.telegram.messenger.fc.b(document2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(intValue);
                            sb2.append("_");
                            imageReceiver.w1 = a8.p0.n(lxVar.p, "_", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(f12);
                            sb3.append("_");
                            sb3.append(f12);
                            sb3.append(z18 ? "_pcache" : "");
                            lxVar.r.r0(b10, sb3.toString(), null, "tgs", this.c, 1);
                            imageReceiver.h1 = new kx(this, lxVar, z10, fjVar);
                            if (imageReceiver.C() != null) {
                                imageReceiver.C().N(0, false, true);
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
                                imageReceiver.w1 = a8.p0.n(lxVar.p, "_", sb4);
                            }
                            lxVar.q = document2;
                            org.telegram.messenger.fc d = org.telegram.messenger.fc.d(F1, document2);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(f13);
                            sb5.append("_");
                            sb5.append(f13);
                            sb5.append(z19 ? "_pcache" : "");
                            lxVar.r.r0(d, sb5.toString(), null, "tgs", this.c, 1);
                        }
                        imageReceiver.F0(ConnectionsManager.DEFAULT_DATACENTER_ID);
                        imageReceiver.X(0);
                        if (imageReceiver.C() != null) {
                            if (lxVar.h) {
                                imageReceiver.C().N(0, false, true);
                            }
                            imageReceiver.C().start();
                        }
                        arrayList2.add(lxVar);
                        imageReceiver.Q();
                        FrameLayout frameLayout = this.H;
                        imageReceiver.I0(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z17 && org.telegram.messenger.i10.i(this.b).n != this.J) {
                            int i18 = this.r;
                            if (i18 != 0 && i18 != i7 && (chVar = this.E) != null) {
                                org.telegram.messenger.g0.r(chVar);
                                this.E.run();
                            }
                            this.r = i7;
                            this.w = str;
                            long j13 = this.s;
                            ArrayList arrayList4 = this.y;
                            ArrayList arrayList5 = this.x;
                            if (j13 == j3) {
                                this.s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j3));
                                arrayList4.add(Integer.valueOf(i17));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.s));
                                arrayList4.add(Integer.valueOf(i17));
                            }
                            ch chVar2 = this.E;
                            if (chVar2 != null) {
                                org.telegram.messenger.g0.r(chVar2);
                                this.E = null;
                            }
                            ch chVar3 = new ch(this, 27);
                            this.E = chVar3;
                            org.telegram.messenger.g0.h3(chVar3, 500L);
                        }
                        if (!z11) {
                            return true;
                        }
                        org.telegram.messenger.mp.u1(this.b).N4(11, 0, this.J, this.K, str);
                        return true;
                    }
                    if (((lx) arrayList2.get(i12)).p == i7) {
                        i13++;
                        if (!z15 && (((lx) arrayList2.get(i12)).r.C() == null || ((lx) arrayList2.get(i12)).r.C().y())) {
                            return false;
                        }
                    }
                    if (((lx) arrayList2.get(i12)).q != null && document != null) {
                        if (((lx) arrayList2.get(i12)).q.id == document.id) {
                            i14++;
                        }
                    }
                    i12++;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Integer G1;
        if (i7 == org.telegram.messenger.ks.y0) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i11 = org.telegram.messenger.ks.W4;
        long j3 = this.J;
        if (i7 != i11) {
            if (i7 == org.telegram.messenger.ks.r && (G1 = org.telegram.messenger.mp.u1(this.b).G1(j3, this.K)) != null && G1.intValue() == 5) {
                m9.u uVar = this.F;
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
        if (longValue == j3 && M.contains(tL_sendMessageEmojiInteraction.emoticon)) {
            int i12 = tL_sendMessageEmojiInteraction.msg_id;
            if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                try {
                    JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                    for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i13);
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.pb0(this, i12, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
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
        org.telegram.messenger.fj fjVar;
        if (this.G.isEmpty()) {
            return;
        }
        int i7 = 0;
        while (i7 < this.G.size()) {
            lx lxVar = (lx) this.G.get(i7);
            if (this.a != null) {
                lxVar.c = false;
                int i10 = 0;
                while (true) {
                    if (i10 >= this.I.getChildCount()) {
                        f10 = 3.0f;
                        f11 = 2.0f;
                        f12 = 0.0f;
                        break;
                    }
                    View childAt = this.I.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                        fjVar = r1Var.getMessageObject();
                        imageReceiver = r1Var.getPhotoImage();
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                        fjVar = v0Var.getMessageObject();
                        imageReceiver = v0Var.getPhotoImage();
                    } else {
                        imageReceiver = null;
                        fjVar = null;
                    }
                    if (fjVar == null || fjVar.e1() != lxVar.p) {
                        i10++;
                    } else {
                        lxVar.c = true;
                        float x10 = childAt.getX() + this.I.getX();
                        float y10 = childAt.getY() + this.I.getY();
                        f12 = childAt.getY();
                        f10 = 3.0f;
                        float f13 = imageReceiver.N0;
                        lxVar.d = f13;
                        f11 = 2.0f;
                        lxVar.e = imageReceiver.O0;
                        if (lxVar.i && (childAt instanceof org.telegram.ui.Cells.r1)) {
                            org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) childAt;
                            float f14 = (f() * org.telegram.messenger.g0.p) / 1.3f;
                            float f15 = f14 / 3.0f;
                            lxVar.d = f15;
                            lxVar.e = f15;
                            float f16 = f14 / 2.0f;
                            lxVar.a = Utilities.i((r1Var2.getTimeX() + x10) - f16, org.telegram.messenger.g0.q.x - f14, 0.0f);
                            lxVar.b = (r1Var2.getTimeY() + y10) - f16;
                        } else if (lxVar.h) {
                            lxVar.a = x10 + imageReceiver.L0;
                            lxVar.b = y10 + imageReceiver.M0;
                        } else {
                            float f17 = x10 + imageReceiver.L0;
                            float f18 = y10 + imageReceiver.M0;
                            float L = lxVar.m ? ((-f13) * 2.0f) + org.telegram.messenger.g0.L(24.0f) + f17 : (-org.telegram.messenger.g0.L(24.0f)) + f17;
                            float f19 = f18 - imageReceiver.N0;
                            lxVar.a = L;
                            lxVar.b = f19;
                        }
                    }
                }
                if (!lxVar.c || lxVar.e + f12 < this.a.P9 || f12 > this.I.getMeasuredHeight() - this.a.Ya) {
                    lxVar.n = true;
                }
                if (lxVar.h) {
                    float f20 = lxVar.e / f11;
                    boolean z10 = ((float) this.I.getMeasuredHeight()) - f12 <= f20;
                    boolean z11 = (f12 - this.a.P9) + f20 <= 0.0f;
                    if (z10 || z11) {
                        lxVar.n = true;
                    }
                }
                if (lxVar.n) {
                    float f21 = lxVar.o;
                    if (f21 != 1.0f) {
                        float i11 = Utilities.i(f21 + 0.10666667f, 1.0f, 0.0f);
                        lxVar.o = i11;
                        lxVar.r.setAlpha(1.0f - i11);
                        this.a.m1.invalidate();
                    }
                }
            } else {
                f10 = 3.0f;
                f11 = 2.0f;
                g(lxVar);
            }
            boolean z12 = !lxVar.l && lxVar.n;
            if (!z12) {
                if (!lxVar.h || lxVar.i) {
                    ch.d dVar = lxVar.j;
                    if (dVar != null) {
                        float f22 = lxVar.a + lxVar.f;
                        float f23 = lxVar.b + lxVar.g;
                        float f24 = lxVar.d * f10;
                        dVar.e((int) f22, (int) f23, (int) (f22 + f24), (int) (f23 + f24));
                        lxVar.j.b(canvas);
                    } else {
                        ImageReceiver imageReceiver2 = lxVar.r;
                        float f25 = lxVar.a + lxVar.f;
                        float f26 = lxVar.b + lxVar.g;
                        float f27 = lxVar.d * f10;
                        imageReceiver2.z0(f25, f26, f27, f27);
                        if (lxVar.m) {
                            lxVar.r.h(canvas, null);
                        } else {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, lxVar.r.r(), lxVar.r.s());
                            lxVar.r.h(canvas, null);
                            canvas.restore();
                        }
                    }
                } else {
                    float f28 = lxVar.e;
                    float f29 = 1.49926f * f28;
                    float f30 = 0.0546875f * f29;
                    float f31 = (((f28 / f11) + lxVar.b) - (f29 / f11)) - (0.00279f * f29);
                    if (lxVar.m) {
                        lxVar.r.z0(((lxVar.a + lxVar.d) - f29) + f30, f31, f29, f29);
                    } else {
                        lxVar.r.z0(lxVar.a - f30, f31, f29, f29);
                    }
                    if (lxVar.m) {
                        lxVar.r.h(canvas, null);
                    } else {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, lxVar.r.r(), lxVar.r.s());
                        lxVar.r.h(canvas, null);
                        canvas.restore();
                    }
                }
            }
            ch.d dVar2 = lxVar.j;
            boolean c10 = dVar2 != null ? dVar2.c() : lxVar.l && lxVar.r.C() != null && lxVar.r.C().b0 >= lxVar.r.C().e[0] + (-2);
            if (lxVar.o == 1.0f || c10 || z12) {
                lx lxVar2 = (lx) this.G.remove(i7);
                if (lxVar.h && lxVar.r.C() != null) {
                    lxVar2.r.C().N(0, true, true);
                }
                lxVar2.r.S();
                ch.d dVar3 = lxVar2.j;
                if (dVar3 != null) {
                    dVar3.d(this.H);
                }
                i7--;
            } else if (lxVar.r.C() != null && lxVar.r.C().l0) {
                lxVar.l = true;
            } else if (lxVar.r.C() != null && !lxVar.r.C().l0) {
                lxVar.r.C().N(0, true, false);
                lxVar.r.C().start();
            }
            i7++;
        }
        if (this.G.isEmpty()) {
            h();
        }
        this.H.invalidate();
    }

    public final void i() {
        this.n = true;
        b();
        org.telegram.messenger.ks.f(this.b).c(this, org.telegram.messenger.ks.y0);
        org.telegram.messenger.ks.f(this.b).c(this, org.telegram.messenger.ks.W4);
        org.telegram.messenger.ks.f(this.b).c(this, org.telegram.messenger.ks.r);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((lx) arrayList.get(i7)).r.Q();
            if (((lx) arrayList.get(i7)).j != null) {
                ((lx) arrayList.get(i7)).j.f(this.H);
            }
            i7++;
        }
    }

    public final void j() {
        int i7 = 0;
        this.n = false;
        org.telegram.messenger.ks.f(this.b).n(this, org.telegram.messenger.ks.y0);
        org.telegram.messenger.ks.f(this.b).n(this, org.telegram.messenger.ks.W4);
        org.telegram.messenger.ks.f(this.b).n(this, org.telegram.messenger.ks.r);
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((lx) arrayList.get(i7)).r.S();
            if (((lx) arrayList.get(i7)).j != null) {
                ((lx) arrayList.get(i7)).j.d(this.H);
            }
            i7++;
        }
    }

    public final void k(org.telegram.ui.Cells.r1 r1Var, bn bnVar, boolean z10) {
        if (bnVar.y() || r1Var.getMessageObject() == null || r1Var.getMessageObject().e1() < 0) {
            return;
        }
        if (r1Var.getMessageObject().W3() || bnVar.f != null) {
            boolean z11 = false;
            boolean n10 = n(r1Var, -1, z10, false);
            if (z10 && n10) {
                String V1 = r1Var.getMessageObject().V1();
                if (!org.telegram.messenger.k6.a(V1) && !"🍑".equals(V1) && !"⚰".equals(V1) && !r1Var.getMessageObject().W3() && !r1Var.getMessageObject().F2()) {
                    try {
                        r1Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            if (r1Var.getMessageObject().W3() || r1Var.getEffect() != null || (!z10 && r1Var.getMessageObject().o != null)) {
                r1Var.getMessageObject().R = false;
                r1Var.getMessageObject().k.premiumEffectWasPlayed = true;
                bnVar.getMessagesStorage().X1(this.J, r1Var.getMessageObject().k);
                return;
            }
            Integer G1 = org.telegram.messenger.mp.u1(this.b).G1(this.J, this.K);
            if ((G1 == null || G1.intValue() != 5) && this.F == null && n10) {
                org.telegram.ui.Components.fc fcVar = org.telegram.ui.Components.fc.w;
                if ((fcVar == null || !fcVar.l) && org.telegram.messenger.bz.d1 > 0 && org.telegram.messenger.i10.i(this.b).e() != bnVar.f.id) {
                    org.telegram.messenger.bz.d1--;
                    org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", org.telegram.messenger.bz.d1).apply();
                    org.telegram.ui.Components.ov0 ov0Var = new org.telegram.ui.Components.ov0(bnVar.getParentActivity(), null, 1, -1, r1Var.getMessageObject().F2() ? r1Var.getMessageObject().F0() : org.telegram.messenger.ri.d0(this.b).V(r1Var.getMessageObject().V1()), bnVar.getResourceProvider());
                    ov0Var.c.setVisibility(8);
                    ov0Var.b.setText(org.telegram.messenger.j6.m(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("EmojiInteractionTapHint", null, 2131751165, bnVar.f.first_name)), ov0Var.b.getPaint().getFontMetricsInt(), false, null, 0));
                    ov0Var.b.setTypeface(null);
                    ov0Var.b.setMaxLines(3);
                    ov0Var.b.setSingleLine(false);
                    m9.u uVar = new m9.u(this, org.telegram.ui.Components.fc.g(bnVar, ov0Var, 2750), z11, 29);
                    this.F = uVar;
                    org.telegram.messenger.g0.h3(uVar, 1500L);
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
            org.telegram.messenger.ri.d0(this.b).o1(org.telegram.messenger.fc.b(document), 2);
        }
    }

    public final void m(org.telegram.ui.Cells.r1 r1Var) {
        ArrayList arrayList;
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        if (messageObject.W3()) {
            return;
        }
        String V1 = messageObject.V1();
        if (V1 == null) {
            V1 = messageObject.k.message;
        }
        String p10 = p(V1);
        if (!M.contains(p10) || (arrayList = (ArrayList) this.e.get(p10)) == null || arrayList.isEmpty()) {
            return;
        }
        int min = Math.min(1, arrayList.size());
        for (int i7 = 0; i7 < min; i7++) {
            l((TLRPC.Document) arrayList.get(i7));
        }
    }

    public final boolean n(org.telegram.ui.Cells.r1 r1Var, int i7, boolean z10, boolean z11) {
        if (r1Var == null || this.G.size() > 12) {
            return false;
        }
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        if (r1Var.getEffect() == null && !r1Var.getPhotoImage().M()) {
            return false;
        }
        String V1 = messageObject.V1();
        if (V1 == null) {
            V1 = messageObject.k.message;
        }
        if (r1Var.getEffect() == null && V1 == null) {
            return false;
        }
        float f10 = r1Var.getPhotoImage().O0;
        float f11 = r1Var.getPhotoImage().N0;
        if (r1Var.getEffect() != null || (f10 > 0.0f && f11 > 0.0f)) {
            return d(p(V1), r1Var.getMessageObject().e1(), r1Var.getMessageObject().F0(), messageObject, i7, z10, z11, f11, f10, r1Var.getMessageObject().P3());
        }
        return false;
    }

    public final void o(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.messenger.fj fjVar) {
        bn bnVar = this.a;
        if (bnVar == null || org.telegram.messenger.mp.u1(this.b).K3() || bnVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.ov0 ov0Var = new org.telegram.ui.Components.ov0(this.H.getContext(), null, 1, -1, fjVar.F0(), bnVar.getResourceProvider());
        ov0Var.b.setText(tL_messages_stickerSet.set.title);
        ov0Var.c.setText(org.telegram.messenger.gd.N0(2131746754, null));
        org.telegram.ui.Components.dc dcVar = new org.telegram.ui.Components.dc(bnVar.getParentActivity(), bnVar.getResourceProvider(), true);
        ov0Var.setButton(dcVar);
        dcVar.b = new org.telegram.ui.Components.voip.o(16, this, fjVar);
        dcVar.e(org.telegram.messenger.gd.N0(2131743313, null));
        org.telegram.ui.Components.fc g10 = org.telegram.ui.Components.fc.g(bnVar, ov0Var, 2750);
        g10.b = fjVar.e1();
        g10.j();
    }

    public mx(bn bnVar, FrameLayout frameLayout, org.telegram.ui.Components.ek0 ek0Var, int i7, long j3, long j10) {
        this.a = bnVar;
        this.H = frameLayout;
        this.I = ek0Var;
        this.b = i7;
        this.J = j3;
        this.K = j10;
    }

    public void g(lx lxVar) {
    }

    public void h() {
    }
}

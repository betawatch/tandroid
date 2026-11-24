// default package

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
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class kw3 implements jm7 {
    public static final HashSet M = new HashSet();
    public static final HashSet N;
    public bi3 E;
    public us4 F;
    public final FrameLayout H;
    public final vr1 I;
    public final long J;
    public final long K;
    public HashMap L;
    public final yv1 a;
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

    public kw3(yv1 yv1Var, FrameLayout frameLayout, vr1 vr1Var, int i, long j, long j2) {
        this.a = yv1Var;
        this.H = frameLayout;
        this.I = vr1Var;
        this.b = i;
        this.J = j;
        this.K = j2;
    }

    public static boolean a(rc2 rc2Var, float f, int i) {
        float s = rc2Var.getPhotoImage().s() + rc2Var.getY();
        return s > f && s < ((float) i);
    }

    public static int f() {
        float min;
        float f;
        if (gm.O1()) {
            min = gm.P0();
            f = 0.4f;
        } else {
            Point point = gm.q;
            min = Math.min(point.x, point.y);
            f = 0.5f;
        }
        return (int) ((((int) (min * f)) * 2.0f) / gm.p);
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
        int i = 0;
        String str2 = str;
        while (i < length) {
            if (i < length - 1) {
                if (str2.charAt(i) == 55356) {
                    int i2 = i + 1;
                    if (str2.charAt(i2) >= 57339) {
                    }
                }
                if (str2.charAt(i) == 8205) {
                    int i3 = i + 1;
                    if (str2.charAt(i3) != 9792) {
                    }
                    length -= 2;
                    str2 = TextUtils.concat(str2.subSequence(0, i), str2.subSequence(i + 2, str2.length()));
                    i--;
                    i++;
                    str2 = str2;
                }
            }
            if (str2.charAt(i) == 65039) {
                length--;
                str2 = TextUtils.concat(str2.subSequence(0, i), str2.subSequence(i + 1, str2.length()));
                i--;
                i++;
                str2 = str2;
            } else {
                i++;
                str2 = str2;
            }
        }
        return str2.toString();
    }

    public final void b() {
        if (this.d) {
            return;
        }
        TLRPC.TL_messages_stickerSet q0 = hs6.d0(this.b).q0("EmojiAnimations");
        this.c = q0;
        if (q0 == null) {
            q0 = hs6.d0(this.b).o0("EmojiAnimations");
            this.c = q0;
        }
        if (q0 == null) {
            hs6.d0(this.b).d1("EmojiAnimations", false, true);
        }
        if (this.c != null) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < this.c.documents.size(); i++) {
                hashMap.put(Long.valueOf(this.c.documents.get(i).id), this.c.documents.get(i));
            }
            for (int i2 = 0; i2 < this.c.packs.size(); i2++) {
                TLRPC.TL_stickerPack tL_stickerPack = this.c.packs.get(i2);
                if (!N.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                    String str = tL_stickerPack.emoticon;
                    HashSet hashSet = M;
                    hashSet.add(str);
                    ArrayList arrayList = new ArrayList();
                    String str2 = tL_stickerPack.emoticon;
                    HashMap hashMap2 = this.e;
                    hashMap2.put(str2, arrayList);
                    for (int i3 = 0; i3 < tL_stickerPack.documents.size(); i3++) {
                        arrayList.add((TLRPC.Document) hashMap.get(tL_stickerPack.documents.get(i3)));
                    }
                    if (tL_stickerPack.emoticon.equals("❤")) {
                        String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎"};
                        for (int i4 = 0; i4 < 8; i4++) {
                            String str3 = strArr[i4];
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
        int i = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((jw3) arrayList.get(i)).r.K();
            if (((jw3) arrayList.get(i)).j != null) {
                ((jw3) arrayList.get(i)).j.d(this.H);
            }
            i++;
        }
    }

    public final boolean d(String str, int i, TLRPC.Document document, k47 k47Var, int i2, boolean z, boolean z2, float f, float f2, boolean z3) {
        Random random;
        long j;
        TLRPC.Document document2;
        int abs;
        TLRPC.VideoSize F1;
        boolean z4;
        bi3 bi3Var;
        int i3 = i2;
        boolean z5 = k47Var != null && k47Var.V3();
        boolean z6 = (k47Var == null || k47Var.M0() == null) ? false : true;
        if (z6 || z5 || M.contains(str)) {
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (z6 || ((arrayList != null && !arrayList.isEmpty()) || z5)) {
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    ArrayList arrayList2 = this.G;
                    if (i4 >= arrayList2.size()) {
                        if (z && z5 && i5 > 0) {
                            u31 u31Var = u31.x;
                            if (u31Var != null && u31Var.b == k47Var.e1()) {
                                return false;
                            }
                            TLRPC.InputStickerSet j1 = k47.j1(k47Var.k);
                            TLRPC.TL_messages_stickerSet q0 = j1.short_name != null ? hs6.d0(this.b).q0(j1.short_name) : null;
                            if (q0 == null) {
                                q0 = hs6.d0(this.b).p0(j1.id);
                            }
                            if (q0 != null) {
                                o(q0, k47Var);
                                return false;
                            }
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = j1;
                            ConnectionsManager.getInstance(this.b).sendRequest(tL_messages_getStickerSet, new pm(this, k47Var, (byte) 29));
                            return false;
                        }
                        if (i5 >= 4) {
                            return false;
                        }
                        Random random2 = this.h;
                        if (z6) {
                            TLRPC.TL_availableEffect M0 = k47Var.M0();
                            TLRPC.messages_AvailableEffects D0 = oc7.r1(this.b).D0();
                            if (D0 == null) {
                                return false;
                            }
                            j = 0;
                            long j2 = M0.effect_animation_id;
                            if (j2 == 0) {
                                j2 = M0.effect_sticker_id;
                            }
                            random = random2;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= D0.documents.size()) {
                                    document2 = null;
                                    break;
                                }
                                document2 = D0.documents.get(i7);
                                long j3 = j2;
                                if (document2 != null && document2.id == j3) {
                                    break;
                                }
                                i7++;
                                j2 = j3;
                            }
                            if (document2 == null) {
                                return false;
                            }
                            if (M0.effect_sticker_id != 0) {
                                F1 = k47.F1(document2);
                                z5 = F1 != null;
                            }
                            F1 = null;
                        } else {
                            random = random2;
                            j = 0;
                            if (z5) {
                                document2 = k47Var.F0();
                                F1 = k47.F1(k47Var.F0());
                            } else {
                                if (k47Var == null || !k47Var.F2()) {
                                    if (i3 < 0 || i3 > arrayList.size() - 1) {
                                        i3 = Math.abs(random.nextInt()) % arrayList.size();
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(i3);
                                } else {
                                    if (i3 < 0 || i3 > arrayList.size() - 1) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i8);
                                            if (document3 != null) {
                                                HashMap hashMap = this.L;
                                                Boolean bool = hashMap != null ? (Boolean) hashMap.get(Long.valueOf(document3.id)) : null;
                                                if (bool != null && bool.booleanValue()) {
                                                    arrayList3.add(Integer.valueOf(i8));
                                                }
                                            }
                                        }
                                        abs = arrayList3.isEmpty() ? Math.abs(random.nextInt()) % arrayList.size() : ((Integer) arrayList3.get(Math.abs(random.nextInt()) % arrayList3.size())).intValue();
                                    } else {
                                        abs = i3;
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(abs);
                                    i3 = abs;
                                }
                                F1 = null;
                            }
                        }
                        if (document2 == null && F1 == null) {
                            return false;
                        }
                        jw3 jw3Var = new jw3();
                        jw3Var.h = z5;
                        jw3Var.i = z6;
                        if (!z6) {
                            jw3Var.f = ((random.nextInt() % 101) / 100.0f) * (f / 4.0f);
                            jw3Var.g = ((random.nextInt() % 101) / 100.0f) * (f2 / 4.0f);
                        }
                        jw3Var.p = i;
                        jw3Var.q = document2;
                        jw3Var.m = z3;
                        ImageReceiver imageReceiver = jw3Var.r;
                        imageReceiver.u0 = true;
                        imageReceiver.t0 = z;
                        if (gda.o() > 1) {
                            boolean z7 = e21.a;
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        int i9 = i3;
                        HashMap hashMap2 = this.f;
                        boolean z8 = z5;
                        if (F1 == null) {
                            int f3 = f();
                            boolean z9 = z4;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.id));
                            int intValue = (num == null ? 0 : num.intValue()) + 1;
                            hashMap2.put(Long.valueOf(document2.id), Integer.valueOf(intValue));
                            gn5 b = gn5.b(document2);
                            StringBuilder sb = new StringBuilder();
                            sb.append(intValue);
                            sb.append("_");
                            imageReceiver.w1 = hg9.k(sb, jw3Var.p, "_");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f3);
                            sb2.append("_");
                            sb2.append(f3);
                            sb2.append(z9 ? "_pcache" : "");
                            jw3Var.r.d0(b, sb2.toString(), null, "tgs", this.c, 1);
                            imageReceiver.h1 = new iw3(this, jw3Var, z, k47Var);
                            if (imageReceiver.y() != null) {
                                imageReceiver.y().I(0, false, true);
                            }
                        } else {
                            boolean z10 = z4;
                            int f4 = f();
                            if (i6 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.id));
                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                hashMap2.put(Long.valueOf(document2.id), Integer.valueOf((intValue2 + 1) % 4));
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(intValue2);
                                sb3.append("_");
                                imageReceiver.w1 = hg9.k(sb3, jw3Var.p, "_");
                            }
                            jw3Var.q = document2;
                            gn5 d = gn5.d(F1, document2);
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(f4);
                            sb4.append("_");
                            sb4.append(f4);
                            sb4.append(z10 ? "_pcache" : "");
                            jw3Var.r.d0(d, sb4.toString(), null, "tgs", this.c, 1);
                        }
                        imageReceiver.m0(ConnectionsManager.DEFAULT_DATACENTER_ID);
                        imageReceiver.M(0);
                        if (imageReceiver.y() != null) {
                            if (jw3Var.h) {
                                imageReceiver.y().I(0, false, true);
                            }
                            imageReceiver.y().start();
                        }
                        arrayList2.add(jw3Var);
                        imageReceiver.I();
                        FrameLayout frameLayout = this.H;
                        imageReceiver.p0(frameLayout);
                        frameLayout.invalidate();
                        if (z && !z8 && z8c.h(this.b).n != this.J) {
                            int i10 = this.r;
                            if (i10 != 0 && i10 != i && (bi3Var = this.E) != null) {
                                gm.r(bi3Var);
                                this.E.run();
                            }
                            this.r = i;
                            this.w = str;
                            long j4 = this.s;
                            ArrayList arrayList4 = this.y;
                            ArrayList arrayList5 = this.x;
                            if (j4 == j) {
                                this.s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j));
                                arrayList4.add(Integer.valueOf(i9));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.s));
                                arrayList4.add(Integer.valueOf(i9));
                            }
                            bi3 bi3Var2 = this.E;
                            if (bi3Var2 != null) {
                                gm.r(bi3Var2);
                                this.E = null;
                            }
                            bi3 bi3Var3 = new bi3(this, (byte) 23);
                            this.E = bi3Var3;
                            gm.d3(bi3Var3, 500L);
                        }
                        if (!z2) {
                            return true;
                        }
                        oc7.r1(this.b).J4(11, 0, this.J, this.K, str);
                        return true;
                    }
                    if (((jw3) arrayList2.get(i4)).p == i) {
                        i5++;
                        if (!z6 && (((jw3) arrayList2.get(i4)).r.y() == null || ((jw3) arrayList2.get(i4)).r.y().t())) {
                            return false;
                        }
                    }
                    if (((jw3) arrayList2.get(i4)).q != null && document != null && ((jw3) arrayList2.get(i4)).q.id == document.id) {
                        i6++;
                    }
                    i4++;
                }
            }
        }
        return false;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Integer C1;
        if (i == nm7.y0) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i3 = nm7.X4;
        long j = this.J;
        if (i != i3) {
            if (i == 2 && (C1 = oc7.r1(this.b).C1(j, this.K)) != null && C1.intValue() == 5) {
                us4 us4Var = this.F;
                if (us4Var != null) {
                    gm.r(us4Var);
                }
                this.F = null;
                return;
            }
            return;
        }
        if (this.a != null) {
            long longValue = ((Long) objArr[0]).longValue();
            TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
            if (longValue == j && M.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                int i4 = tL_sendMessageEmojiInteraction.msg_id;
                if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                    try {
                        JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i5);
                            gm.d3(new hw3(this, i4, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public final void e(Canvas canvas) {
        ArrayList arrayList;
        float f;
        float f2;
        float f3;
        ImageReceiver imageReceiver;
        k47 k47Var;
        if (this.G.isEmpty()) {
            return;
        }
        int i = 0;
        while (true) {
            int size = this.G.size();
            arrayList = this.G;
            if (i >= size) {
                break;
            }
            jw3 jw3Var = (jw3) arrayList.get(i);
            if (this.a != null) {
                jw3Var.c = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= this.I.getChildCount()) {
                        f = 3.0f;
                        f2 = 2.0f;
                        f3 = 0.0f;
                        break;
                    }
                    View childAt = this.I.getChildAt(i2);
                    if (childAt instanceof rc2) {
                        rc2 rc2Var = (rc2) childAt;
                        k47Var = rc2Var.getMessageObject();
                        imageReceiver = rc2Var.getPhotoImage();
                    } else if (childAt instanceof cm1) {
                        cm1 cm1Var = (cm1) childAt;
                        k47Var = cm1Var.getMessageObject();
                        imageReceiver = cm1Var.getPhotoImage();
                    } else {
                        imageReceiver = null;
                        k47Var = null;
                    }
                    if (k47Var == null || k47Var.e1() != jw3Var.p) {
                        i2++;
                    } else {
                        jw3Var.c = true;
                        float x = childAt.getX() + this.I.getX();
                        float y = childAt.getY() + this.I.getY();
                        f3 = childAt.getY();
                        f = 3.0f;
                        float f4 = imageReceiver.N0;
                        jw3Var.d = f4;
                        f2 = 2.0f;
                        jw3Var.e = imageReceiver.O0;
                        if (jw3Var.i && (childAt instanceof rc2)) {
                            rc2 rc2Var2 = (rc2) childAt;
                            float f5 = (f() * gm.p) / 1.3f;
                            float f6 = f5 / 3.0f;
                            jw3Var.d = f6;
                            jw3Var.e = f6;
                            float f7 = f5 / 2.0f;
                            jw3Var.a = Utilities.i((rc2Var2.getTimeX() + x) - f7, gm.q.x - f5, 0.0f);
                            jw3Var.b = (rc2Var2.getTimeY() + y) - f7;
                        } else {
                            boolean z = jw3Var.h;
                            float f8 = x + imageReceiver.L0;
                            if (z) {
                                jw3Var.a = f8;
                                jw3Var.b = y + imageReceiver.M0;
                            } else {
                                float f9 = y + imageReceiver.M0;
                                float L = jw3Var.m ? ((-f4) * 2.0f) + gm.L(24.0f) + f8 : (-gm.L(24.0f)) + f8;
                                float f10 = f9 - imageReceiver.N0;
                                jw3Var.a = L;
                                jw3Var.b = f10;
                            }
                        }
                    }
                }
                if (!jw3Var.c || jw3Var.e + f3 < this.a.P9 || f3 > this.I.getMeasuredHeight() - this.a.Ya) {
                    jw3Var.n = true;
                }
                if (jw3Var.h) {
                    float f11 = jw3Var.e / f2;
                    boolean z2 = ((float) this.I.getMeasuredHeight()) - f3 <= f11;
                    boolean z3 = (f3 - this.a.P9) + f11 <= 0.0f;
                    if (z2 || z3) {
                        jw3Var.n = true;
                    }
                }
                if (jw3Var.n) {
                    float f12 = jw3Var.o;
                    if (f12 != 1.0f) {
                        float i3 = Utilities.i(f12 + 0.10666667f, 1.0f, 0.0f);
                        jw3Var.o = i3;
                        jw3Var.r.setAlpha(1.0f - i3);
                        this.a.m1.invalidate();
                    }
                }
            } else {
                f = 3.0f;
                f2 = 2.0f;
                g(jw3Var);
            }
            boolean z4 = !jw3Var.l && jw3Var.n;
            if (!z4) {
                if (!jw3Var.h || jw3Var.i) {
                    xm xmVar = jw3Var.j;
                    if (xmVar != null) {
                        float f13 = jw3Var.a + jw3Var.f;
                        float f14 = jw3Var.b + jw3Var.g;
                        float f15 = jw3Var.d * f;
                        xmVar.e((int) f13, (int) f14, (int) (f13 + f15), (int) (f14 + f15));
                        jw3Var.j.b(canvas);
                    } else {
                        ImageReceiver imageReceiver2 = jw3Var.r;
                        float f16 = jw3Var.a + jw3Var.f;
                        float f17 = jw3Var.b + jw3Var.g;
                        float f18 = jw3Var.d * f;
                        imageReceiver2.i0(f16, f17, f18, f18);
                        if (jw3Var.m) {
                            jw3Var.r.h(canvas, null);
                        } else {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, jw3Var.r.r(), jw3Var.r.s());
                            jw3Var.r.h(canvas, null);
                            canvas.restore();
                        }
                    }
                } else {
                    float f19 = jw3Var.e;
                    float f20 = 1.49926f * f19;
                    float f21 = 0.0546875f * f20;
                    float f22 = (((f19 / f2) + jw3Var.b) - (f20 / f2)) - (0.00279f * f20);
                    boolean z5 = jw3Var.m;
                    ImageReceiver imageReceiver3 = jw3Var.r;
                    float f23 = jw3Var.a;
                    if (z5) {
                        imageReceiver3.i0(((f23 + jw3Var.d) - f20) + f21, f22, f20, f20);
                    } else {
                        imageReceiver3.i0(f23 - f21, f22, f20, f20);
                    }
                    if (jw3Var.m) {
                        jw3Var.r.h(canvas, null);
                    } else {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, jw3Var.r.r(), jw3Var.r.s());
                        jw3Var.r.h(canvas, null);
                        canvas.restore();
                    }
                }
            }
            xm xmVar2 = jw3Var.j;
            boolean c = xmVar2 != null ? xmVar2.c() : jw3Var.l && jw3Var.r.y() != null && jw3Var.r.y().b0 >= jw3Var.r.y().e[0] + (-2);
            if (jw3Var.o == 1.0f || c || z4) {
                jw3 jw3Var2 = (jw3) this.G.remove(i);
                if (jw3Var.h && jw3Var.r.y() != null) {
                    jw3Var2.r.y().I(0, true, true);
                }
                jw3Var2.r.K();
                xm xmVar3 = jw3Var2.j;
                if (xmVar3 != null) {
                    xmVar3.d(this.H);
                }
                i--;
            } else if (jw3Var.r.y() != null && jw3Var.r.y().l0) {
                jw3Var.l = true;
            } else if (jw3Var.r.y() != null && !jw3Var.r.y().l0) {
                jw3Var.r.y().I(0, true, false);
                jw3Var.r.y().start();
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            h();
        }
        this.H.invalidate();
    }

    public final void i() {
        this.n = true;
        b();
        nm7.f(this.b).b(this, nm7.y0);
        nm7.f(this.b).b(this, nm7.X4);
        nm7.f(this.b).b(this, 2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i >= arrayList.size()) {
                return;
            }
            ((jw3) arrayList.get(i)).r.I();
            if (((jw3) arrayList.get(i)).j != null) {
                ((jw3) arrayList.get(i)).j.f(this.H);
            }
            i++;
        }
    }

    public final void j() {
        int i = 0;
        this.n = false;
        nm7.f(this.b).n(this, nm7.y0);
        nm7.f(this.b).n(this, nm7.X4);
        nm7.f(this.b).n(this, 2);
        while (true) {
            ArrayList arrayList = this.G;
            if (i >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((jw3) arrayList.get(i)).r.K();
            if (((jw3) arrayList.get(i)).j != null) {
                ((jw3) arrayList.get(i)).j.d(this.H);
            }
            i++;
        }
    }

    public final void k(rc2 rc2Var, yv1 yv1Var, boolean z) {
        if (yv1Var.x() || rc2Var.getMessageObject() == null || rc2Var.getMessageObject().e1() < 0) {
            return;
        }
        if (rc2Var.getMessageObject().V3() || yv1Var.f != null) {
            boolean z2 = false;
            boolean n = n(rc2Var, -1, z, false);
            if (z && n) {
                String V1 = rc2Var.getMessageObject().V1();
                if (!zx3.a(V1) && !"🍑".equals(V1) && !"⚰".equals(V1) && !rc2Var.getMessageObject().V3() && !rc2Var.getMessageObject().F2()) {
                    try {
                        rc2Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            if (rc2Var.getMessageObject().V3() || rc2Var.getEffect() != null || (!z && rc2Var.getMessageObject().o != null)) {
                rc2Var.getMessageObject().R = false;
                rc2Var.getMessageObject().k.premiumEffectWasPlayed = true;
                yv1Var.getMessagesStorage().U1(this.J, rc2Var.getMessageObject().k);
                return;
            }
            Integer C1 = oc7.r1(this.b).C1(this.J, this.K);
            if ((C1 == null || C1.intValue() != 5) && this.F == null && n) {
                u31 u31Var = u31.x;
                if ((u31Var == null || !u31Var.m) && gda.Z0 > 0 && z8c.h(this.b).e() != yv1Var.f.id) {
                    gda.Z0--;
                    a.b.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", gda.Z0).apply();
                    o1b o1bVar = new o1b(yv1Var.getParentActivity(), null, 1, -1, rc2Var.getMessageObject().F2() ? rc2Var.getMessageObject().F0() : hs6.d0(this.b).V(rc2Var.getMessageObject().V1()), yv1Var.getResourceProvider());
                    o1bVar.c.setVisibility(8);
                    o1bVar.b.setText(gw3.m(gm.S2(jb6.a0("EmojiInteractionTapHint", null, 2131751114, yv1Var.f.first_name)), o1bVar.b.getPaint().getFontMetricsInt(), false, null, 0));
                    o1bVar.b.setTypeface(null);
                    o1bVar.b.setMaxLines(3);
                    o1bVar.b.setSingleLine(false);
                    us4 us4Var = new us4(this, u31.g(yv1Var, o1bVar, 2750), z2, (byte) 7);
                    this.F = us4Var;
                    gm.d3(us4Var, 1500L);
                }
            }
        }
    }

    public final void l(rc2 rc2Var) {
        ArrayList arrayList;
        k47 messageObject = rc2Var.getMessageObject();
        if (messageObject.V3()) {
            return;
        }
        String V1 = messageObject.V1();
        if (V1 == null) {
            V1 = messageObject.k.message;
        }
        String p = p(V1);
        if (!M.contains(p) || (arrayList = (ArrayList) this.e.get(p)) == null || arrayList.isEmpty()) {
            return;
        }
        int min = Math.min(1, arrayList.size());
        for (int i = 0; i < min; i++) {
            m((TLRPC.Document) arrayList.get(i));
        }
    }

    public final void m(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.L;
            if (hashMap == null || !hashMap.containsKey(Long.valueOf(document.id))) {
                HashMap hashMap2 = this.L;
                if (hashMap2 == null) {
                    hashMap2 = new HashMap();
                    this.L = hashMap2;
                }
                hashMap2.put(Long.valueOf(document.id), Boolean.TRUE);
                hs6.d0(this.b).m1(gn5.b(document), 2);
            }
        }
    }

    public final boolean n(rc2 rc2Var, int i, boolean z, boolean z2) {
        if (rc2Var == null || this.G.size() > 12) {
            return false;
        }
        k47 messageObject = rc2Var.getMessageObject();
        if (rc2Var.getEffect() == null && !rc2Var.getPhotoImage().E()) {
            return false;
        }
        String V1 = messageObject.V1();
        if (V1 == null) {
            V1 = messageObject.k.message;
        }
        if (rc2Var.getEffect() == null && V1 == null) {
            return false;
        }
        float f = rc2Var.getPhotoImage().O0;
        float f2 = rc2Var.getPhotoImage().N0;
        if (rc2Var.getEffect() != null || (f > 0.0f && f2 > 0.0f)) {
            return d(p(V1), rc2Var.getMessageObject().e1(), rc2Var.getMessageObject().F0(), messageObject, i, z, z2, f2, f, rc2Var.getMessageObject().O3());
        }
        return false;
    }

    public final void o(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, k47 k47Var) {
        yv1 yv1Var = this.a;
        if (yv1Var == null || oc7.r1(this.b).H3() || yv1Var.getParentActivity() == null) {
            return;
        }
        o1b o1bVar = new o1b(this.H.getContext(), null, 1, -1, k47Var.F0(), yv1Var.getResourceProvider());
        o1bVar.b.setText(tL_messages_stickerSet.set.title);
        o1bVar.c.setText(jb6.M0(2131746683, null));
        s31 s31Var = new s31(yv1Var.getResourceProvider(), yv1Var.getParentActivity(), true);
        o1bVar.setButton(s31Var);
        s31Var.b = new pv3(this, k47Var, (byte) 2);
        s31Var.e(jb6.M0(2131743247, null));
        u31 g = u31.g(yv1Var, o1bVar, 2750);
        g.b = k47Var.e1();
        g.j();
    }

    public void g(jw3 jw3Var) {
    }

    public void h() {
    }

    public kw3(int i, FrameLayout frameLayout) {
        this.H = frameLayout;
        this.b = i;
    }
}

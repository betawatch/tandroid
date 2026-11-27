// default package

import android.R;
import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AlignmentSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class dl1 extends jf0 implements jq3, fn7, pk5 {
    public static final HashMap y2;
    public float A0;
    public TextPaint A1;
    public float B0;
    public StaticLayout B1;
    public float C0;
    public float C1;
    public boolean D0;
    public StaticLayout D1;
    public npa E;
    public boolean E0;
    public float E1;
    public boolean F;
    public final x49 F0;
    public final TextPaint F1;
    public boolean G;
    public float G0;
    public final TextPaint G1;
    public boolean H;
    public float H0;
    public final TextPaint H1;
    public final int I;
    public yua I0;
    public TLRPC.Document I1;
    public final ImageReceiver J;
    public zoc J0;
    public TLRPC.VideoSize J1;
    public Drawable K;
    public boolean K0;
    public final RadialProgress2 K1;
    public Path L;
    public float L0;
    public int L1;
    public final rb0 M;
    public float M0;
    public boolean M1;
    public StaticLayout N;
    public float N0;
    public RectF N1;
    public int O;
    public final RectF O0;
    public final rd1 O1;
    public int P;
    public ueb P0;
    public boolean P1;
    public StaticLayout Q;
    public r47 Q0;
    public ColorMatrixColorFilter Q1;
    public int R;
    public int R0;
    public CornerPathEffect R1;
    public int S;
    public CharSequence S0;
    public Path S1;
    public int T;
    public px4 T0;
    public pkb T1;
    public int U;
    public int U0;
    public final View U1;
    public int V;
    public int V0;
    public final Path V1;
    public int W;
    public Paint W0;
    public final dva W1;
    public TextPaint X0;
    public int X1;
    public final ArrayList Y0;
    public final ArrayList Y1;
    public final ArrayList Z0;
    public ed Z1;
    public boolean a0;
    public final Path a1;
    public boolean a2;
    public boolean b0;
    public int b1;
    public int b2;
    public RadialProgressView c0;
    public int c1;
    public TLRPC.TL_messageActionStarGiftOnchainOffer c2;
    public float d0;
    public final RectF d1;
    public boolean d2;
    public final q6b e0;
    public boolean e1;
    public int e2;
    public int f;
    public boolean f0;
    public boolean f1;
    public boolean f2;
    public boolean g0;
    public al1 g1;
    public vx4 g2;
    public int h;
    public boolean h0;
    public final vnb h1;
    public float h2;
    public boolean i0;
    public int i1;
    public final Paint i2;
    public boolean j0;
    public int j1;
    public boolean j2;
    public int k0;
    public StaticLayout k1;
    public View.OnClickListener k2;
    public boolean l0;
    public Paint l1;
    public int l2;
    public int m0;
    public pkb m1;
    public final Path m2;
    public final v41 n;
    public boolean n0;
    public StaticLayout n1;
    public final float[] n2;
    public byb o0;
    public boolean o1;
    public final float[] o2;
    public final RectF p0;
    public boolean p1;
    public final Path p2;
    public final ArrayList q0;
    public int q1;
    public final int[] q2;
    public va6 r;
    public final Stack r0;
    public final mm r1;
    public int r2;
    public final boolean s;
    public dm s0;
    public pm3 s1;
    public SpannableStringBuilder s2;
    public TextPaint t0;
    public bl1 t1;
    public boolean t2;
    public float u0;
    public int u1;
    public Runnable u2;
    public float v0;
    public int v1;
    public PorterDuffColorFilter v2;
    public View w;
    public int w0;
    public int w1;
    public int w2;
    public final int x;
    public boolean x0;
    public pkb x1;
    public final cl1 x2;
    public URLSpan y;
    public jn5 y0;
    public StaticLayout y1;
    public float z0;
    public boolean z1;

    static {
        HashMap hashMap = new HashMap();
        y2 = hashMap;
        c00.r(1, hashMap, "1⃣", 3, "2⃣");
        c00.r(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public dl1(vnb vnbVar, Context context, boolean z) {
        super(context);
        this.n = new v41(this);
        int i = yac.t0;
        this.I = i;
        q6b q6bVar = new q6b(null, false);
        this.e0 = q6bVar;
        this.n0 = true;
        this.p0 = new RectF();
        this.q0 = new ArrayList();
        this.r0 = new Stack();
        this.F0 = new x49(this);
        this.O0 = new RectF();
        this.U0 = -1;
        this.V0 = -1;
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.a1 = new Path();
        this.d1 = new RectF();
        this.e1 = true;
        this.f1 = false;
        this.o1 = false;
        this.p1 = false;
        this.r1 = new mm(this, 0L, 320L, k43.h);
        this.z1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.F1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.G1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.H1 = textPaint3;
        this.K1 = new RadialProgress2(this, null);
        this.O1 = new rd1((Object) this, (byte) 4);
        this.V1 = new Path();
        this.Y1 = new ArrayList();
        this.b2 = -1;
        this.e2 = -1;
        this.i2 = new Paint(1);
        this.m2 = new Path();
        this.n2 = new float[8];
        this.o2 = new float[8];
        this.p2 = new Path();
        this.q2 = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.x2 = new cl1(this);
        q6bVar.a = false;
        this.s = z;
        this.h1 = vnbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.J = imageReceiver;
        imageReceiver.q0(hl.u / 2);
        this.M = new rb0((vnb) null);
        this.x = lq3.q(i).k();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.U1 = view;
        view.setBackground(aob.f0(aob.p1(0.1f, -16777216), 7, hl.L(16.0f)));
        view.setVisibility(8);
        addView(view);
        dva dvaVar = new dva(10);
        this.W1 = dvaVar;
        dvaVar.N = 100;
        dvaVar.I = false;
        dvaVar.L = true;
        dvaVar.G = false;
        dvaVar.J = true;
        dvaVar.H = true;
        dvaVar.r = (byte) 1;
        dvaVar.w = 0.98f;
        dvaVar.v = 0.98f;
        dvaVar.u = 0.98f;
        dvaVar.g = false;
        dvaVar.o = 0.0f;
        dvaVar.x = (short) 750;
        dvaVar.y = (short) 750;
        dvaVar.c();
    }

    public static SpannableStringBuilder H(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hl.F2(str, false, hl.L(6.0f), -hl.L(1.3f), 0.8f, org.telegram.messenger.beta.R.drawable.floating_check));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new mf3(hl.L(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            vk1.j();
            spannableStringBuilder.setSpan(vk1.g(hl.L(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static float a0(StaticLayout staticLayout) {
        float f = 0.0f;
        for (int i = 0; i < staticLayout.getLineCount(); i++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i));
            if (ceil > f) {
                f = ceil;
            }
        }
        return f;
    }

    private float getWalletActionTop() {
        return hl.L(11.0f) + this.T + this.P;
    }

    private void setStarsPaused(boolean z) {
        dva dvaVar = this.W1;
        boolean z2 = dvaVar.g;
        ArrayList arrayList = dvaVar.n;
        if (z == z2) {
            return;
        }
        dvaVar.g = z;
        if (z) {
            dvaVar.Q = System.currentTimeMillis();
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            cva cvaVar = (cva) arrayList.get(i);
            cvaVar.a = (System.currentTimeMillis() - dvaVar.Q) + cvaVar.a;
        }
        invalidate();
    }

    public final boolean A(MotionEvent motionEvent) {
        int i;
        int i2;
        iq0 iq0Var;
        r47 r47Var;
        TLRPC.Message message;
        r47 r47Var2;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j;
        TLObject M0;
        String str;
        Context context;
        boolean z;
        int i3;
        SpannableStringBuilder S2;
        boolean z2;
        ArrayList arrayList = this.Y1;
        if (arrayList.isEmpty()) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        float width = (getWidth() - this.j1) / 2.0f;
        float f = 4.0f;
        float L = hl.L(4.0f) + hl.L(4.0f) + this.T + this.P + this.f;
        float L2 = (this.j1 - hl.L(4.0f)) / 2.0f;
        int action = motionEvent.getAction();
        vnb vnbVar = this.h1;
        if (action == 0) {
            this.r2 = -1;
            int i4 = 0;
            while (i4 < arrayList.size()) {
                wo0 wo0Var = (wo0) arrayList.get(i4);
                float L3 = ((hl.L(f) + L2) * i4) + width;
                RectF rectF = hl.P;
                rectF.set(L3, L, L3 + L2, wo0Var.f + L);
                float f2 = x;
                float f3 = y;
                if (rectF.contains(f2, f3)) {
                    this.r2 = i4;
                    V();
                    if (wo0Var.s == null) {
                        hf0 Y = aob.Y(aob.v0(aob.ed, vnbVar), 6, 6);
                        wo0Var.s = Y;
                        Y.setCallback(this);
                    }
                    wo0Var.s.setHotspot(f2, f3);
                    wo0Var.s.setState(this.q2);
                    wo0Var.b(!wo0Var.m);
                    return true;
                }
                i4++;
                f = 4.0f;
            }
            return false;
        }
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() != 3 || (i = this.r2) == -1) {
                return false;
            }
            wo0 wo0Var2 = (wo0) arrayList.get(i);
            hf0 hf0Var = wo0Var2.s;
            if (hf0Var != null) {
                hf0Var.setState(StateSet.NOTHING);
            }
            wo0Var2.b(false);
            this.r2 = -1;
            V();
            return false;
        }
        if (this.r2 == -1) {
            return false;
        }
        playSoundEffect(0);
        wo0 wo0Var3 = (wo0) arrayList.get(this.r2);
        hf0 hf0Var2 = wo0Var3.s;
        if (hf0Var2 != null) {
            hf0Var2.setState(StateSet.NOTHING);
        }
        wo0Var3.b(false);
        if (this.g1 == null || wo0Var3.m || (iq0Var = wo0Var3.j) == null) {
            i2 = -1;
        } else {
            if (getMessageObject() != null) {
                byte b = iq0Var.a;
                byte b2 = 2;
                if (b == 5) {
                    al1 al1Var = this.g1;
                    e w = al1Var != null ? al1Var.w() : null;
                    if (w != null && this.Q0 != null) {
                        jj.s0(w, ob6.M0(2131749652, null), hl.S2(ob6.a0(null, null, 2131749653, wf3.s(r47.B0(this.Q0.k)))), ob6.M0(2131749654, null), true, new jj1(this, w, b2));
                    }
                } else if (b == 6) {
                    r47 r47Var3 = this.Q0;
                    if (r47Var3 != null && (message3 = r47Var3.k) != null) {
                        TLRPC.MessageAction messageAction = message3.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction;
                            e Q = LaunchActivity.Q();
                            Context context2 = getContext();
                            long B0 = r47.B0(this.Q0.k);
                            int e1 = this.Q0.e1();
                            int[] iArr = ow4.G1;
                            oj n = oj.n(tL_messageActionStarGiftPurchaseOffer.price);
                            pj pjVar = n.a;
                            int i5 = this.I;
                            pj pjVar2 = pj.a;
                            oj j2 = oj.j((n.b * (pjVar == pjVar2 ? uc7.s1(i5).k4.m.f() : uc7.s1(i5).k4.n.f())) / 1000, pjVar);
                            TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                            StringBuilder sb = new StringBuilder();
                            sb.append(starGift.title);
                            sb.append(" #");
                            String m = qu6.m(starGift.num, ',', sb);
                            if (B0 >= 0) {
                                j = 0;
                                M0 = uc7.s1(i5).X1(Long.valueOf(B0));
                            } else {
                                j = 0;
                                M0 = uc7.s1(i5).M0(Long.valueOf(-B0));
                            }
                            String d = n.d();
                            String d2 = j2.d();
                            if (pjVar == pj.b) {
                                str = m;
                                context = context2;
                                z = true;
                            } else {
                                str = m;
                                context = context2;
                                z = false;
                            }
                            LinearLayout j3 = uh9.j(context, 1);
                            j3.addView(new xta(context, starGift, M0), tre.t(-1, -2, 48, 0, -4, 0, 0));
                            TextView textView = new TextView(context);
                            yob.X(textView, aob.j5, vnbVar);
                            textView.setTextSize(1, 16.0f);
                            textView.setText(hl.S2(pjVar == pjVar2 ? ob6.a0(null, null, 2131749630, d, wf3.s(B0), str, d2) : ob6.a0(null, null, 2131749629, d, wf3.s(B0), str, d2)));
                            j3.addView(textView, tre.t(-1, -2, 48, 24, 4, 24, 4));
                            FrameLayout frameLayout = new FrameLayout(context);
                            frameLayout.setClipChildren(false);
                            frameLayout.setClipToPadding(false);
                            hjb hjbVar = new hjb(context, vnbVar);
                            frameLayout.addView(hjbVar, tre.e(-1, -1, jn7.D1));
                            wua.a1(hjbVar, jxa.i(starGift.attributes, TL_stars.starGiftAttributeModel.class));
                            wua.a1(hjbVar, jxa.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                            wua.a1(hjbVar, jxa.i(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                            j3.addView(frameLayout, tre.t(-1, -2, 48, 23, 16, 23, 4));
                            oj k = oj.k(starGift.value_usd_amount / Math.pow(10.0d, di0.h().g("USD")), pjVar);
                            if (k.c() > 0.0d && starGift.value_usd_amount > j) {
                                if (k.b >= j2.b) {
                                    int round = (int) Math.round((1.0d - (j2.c() / k.c())) * 100.0d);
                                    S2 = hl.S2(ob6.a0(null, null, 2131749679, bp1.n(round, "%"), starGift.title));
                                    z2 = round > 10;
                                    i3 = 1;
                                } else {
                                    i3 = 1;
                                    S2 = hl.S2(ob6.a0(null, null, 2131749682, bp1.n((int) Math.round(((j2.c() / k.c()) - 1.0d) * 100.0d), "%"), starGift.title));
                                    z2 = false;
                                }
                                TextView textView2 = new TextView(context);
                                textView2.setTextSize(i3, 13.0f);
                                textView2.setGravity(17);
                                textView2.setText(S2);
                                yob.X(textView2, z2 ? aob.p7 : aob.y6, vnbVar);
                                j3.addView(textView2, tre.t(-1, -2, 49, 40, 12, 40, 9));
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
                            alertDialog$Builder.n(j3);
                            alertDialog$Builder.j(nza.V0(ob6.a0(null, null, 2131749647, d2), z), new wr3(e1, i5, Q));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            alertDialog$Builder.a.show();
                        }
                    }
                } else {
                    if (b == 7) {
                        al1 al1Var2 = this.g1;
                        e w2 = al1Var2 != null ? al1Var2.w() : null;
                        if (w2 != null && (r47Var2 = this.Q0) != null && (message2 = r47Var2.k) != null) {
                            TLRPC.MessageAction messageAction2 = message2.action;
                            if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                                final byte b3 = 0;
                                jj.s0(w2, ob6.M0(tL_messageActionNoForwardsRequest.prev_value ? 2131745113 : 2131745102, null), ob6.M0(tL_messageActionNoForwardsRequest.prev_value ? 2131745114 : 2131745103, null), ob6.M0(2131745119, null), false, new Runnable(this) { // from class: yk1
                                    public final /* synthetic */ dl1 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b4 = b3;
                                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = tL_messageActionNoForwardsRequest;
                                        dl1 dl1Var = this.b;
                                        switch (b4) {
                                            case 0:
                                                uc7.s1(dl1Var.I).r5(r47.B0(dl1Var.Q0.k), dl1Var.Q0.e1(), tL_messageActionNoForwardsRequest2.prev_value, null);
                                                break;
                                            default:
                                                uc7.s1(dl1Var.I).r5(r47.B0(dl1Var.Q0.k), dl1Var.Q0.e1(), tL_messageActionNoForwardsRequest2.new_value, null);
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                    } else if (b == 8) {
                        al1 al1Var3 = this.g1;
                        e w3 = al1Var3 != null ? al1Var3.w() : null;
                        if (w3 != null && (r47Var = this.Q0) != null && (message = r47Var.k) != null) {
                            TLRPC.MessageAction messageAction3 = message.action;
                            if (messageAction3 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction3;
                                final byte b4 = 1;
                                jj.s0(w3, ob6.M0(tL_messageActionNoForwardsRequest2.new_value ? 2131745113 : 2131745102, null), ob6.M0(tL_messageActionNoForwardsRequest2.new_value ? 2131745112 : 2131745101, null), ob6.M0(2131745119, null), false, new Runnable(this) { // from class: yk1
                                    public final /* synthetic */ dl1 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b42 = b4;
                                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest22 = tL_messageActionNoForwardsRequest2;
                                        dl1 dl1Var = this.b;
                                        switch (b42) {
                                            case 0:
                                                uc7.s1(dl1Var.I).r5(r47.B0(dl1Var.Q0.k), dl1Var.Q0.e1(), tL_messageActionNoForwardsRequest22.prev_value, null);
                                                break;
                                            default:
                                                uc7.s1(dl1Var.I).r5(r47.B0(dl1Var.Q0.k), dl1Var.Q0.e1(), tL_messageActionNoForwardsRequest22.new_value, null);
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            }
            i2 = -1;
        }
        this.r2 = i2;
        V();
        return false;
    }

    public final void C() {
        float f = this.b1;
        RectF rectF = this.d1;
        this.b1 = (int) Math.min(f, rectF.left);
        this.c1 = (int) Math.max(this.c1, rectF.right);
    }

    public final boolean D(float f, int i) {
        x49 x49Var = this.F0;
        if (!x49Var.H) {
            return false;
        }
        float y = getY() + x49Var.c;
        return y > f && (y + ((float) x49Var.m)) - ((float) hl.L(16.0f)) < ((float) i);
    }

    public final void E() {
        SpannableStringBuilder spannableStringBuilder;
        int L = this.j1 - hl.L(16.0f);
        float L2 = hl.L(14.0f);
        TextPaint textPaint = this.F1;
        textPaint.setTextSize(L2);
        float L3 = hl.L(13.0f);
        TextPaint textPaint2 = this.G1;
        textPaint2.setTextSize(L3);
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.Q0.k.action;
        int i = tL_messageActionGiftCode.months;
        TLRPC.Chat M0 = uc7.s1(this.I).M0(Long.valueOf(-wf3.n(tL_messageActionGiftCode.boost_peer)));
        String str = M0 == null ? null : M0.title;
        boolean z = tL_messageActionGiftCode.via_giveaway;
        String M02 = tL_messageActionGiftCode.unclaimed ? ob6.M0(2131753169, "BoostingUnclaimedPrize") : ob6.M0(2131753535, "BoostingCongratulations");
        String G = i == 12 ? ob6.G(1, "BoldYears", new Object[0]) : ob6.G(i, "BoldMonths", new Object[0]);
        if (!z) {
            spannableStringBuilder = new SpannableStringBuilder(hl.S2(str == null ? ob6.M0(2131753303, null) : ob6.a0("BoostingReceivedGiftFrom", null, 2131753304, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            qu6.s(null, null, 2131753305, new Object[]{G}, spannableStringBuilder);
        } else if (tL_messageActionGiftCode.unclaimed) {
            spannableStringBuilder = new SpannableStringBuilder(hl.S2(ob6.a0(null, null, 2131753159, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            qu6.s(null, null, 2131753168, new Object[]{G}, spannableStringBuilder);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(hl.S2(ob6.a0(null, null, 2131753300, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            qu6.s(null, null, 2131753301, new Object[]{G}, spannableStringBuilder);
        }
        String M03 = ob6.M0(2131753302, "BoostingReceivedGiftOpenBtn");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M02);
        valueOf.setSpan(new y7c(hl.o()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.k1 = new StaticLayout(valueOf, textPaint, L, alignment, 1.1f, 0.0f, false);
        this.n1 = null;
        this.m1 = null;
        bl1 bl1Var = this.t1;
        if (bl1Var != null) {
            hm.release(bl1Var.i, bl1Var.h);
        }
        bl1 bl1Var2 = new bl1(this);
        this.t1 = bl1Var2;
        bl1Var2.a(L, textPaint2, spannableStringBuilder);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(M03);
        valueOf2.setSpan(new y7c(hl.o()), 0, valueOf2.length(), 33);
        this.p1 = false;
        this.q1 = 0;
        this.x1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) Q("paintChatActionText"), L, alignment, 1.0f, 0.0f, false);
        this.y1 = staticLayout;
        this.z1 = true;
        this.E1 = a0(staticLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void F(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, String str, int i2, boolean z2) {
        ?? r4;
        int i3;
        int a;
        CharSequence charSequence4 = charSequence2;
        int L = i2 - hl.L(16.0f);
        r47 r47Var = this.Q0;
        if (r47Var != null && r47Var.D == 30) {
            L -= hl.L(16.0f);
        }
        int i4 = L;
        if (charSequence != null) {
            r47 r47Var2 = this.Q0;
            TextPaint textPaint = this.F1;
            if (r47Var2 == null || r47Var2.D != 30) {
                textPaint.setTextSize(hl.L(16.0f));
            } else {
                textPaint.setTextSize(hl.L(14.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new y7c(hl.o()), 0, valueOf.length(), 33);
            r4 = 0;
            this.k1 = new StaticLayout(valueOf, textPaint, i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r4 = 0;
            this.k1 = null;
        }
        this.n1 = null;
        if (spannableStringBuilder != null) {
            pkb pkbVar = new pkb(spannableStringBuilder, 10.0f, null);
            this.m1 = pkbVar;
            pkbVar.a.linkColor = -1;
        } else {
            this.m1 = null;
        }
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        TextPaint textPaint2 = this.G1;
        if (tL_messageActionStarGiftOnchainOffer != null) {
            textPaint2.setTextSize(Q("paintChatActionText").getTextSize());
        } else {
            r47 r47Var3 = this.Q0;
            if (r47Var3 != null) {
                if (r47Var3.D == 35) {
                    textPaint2.setTextSize(hl.L(14.3f));
                } else if (Y() || (i3 = this.Q0.D) == 30 || i3 == 18 || i3 == 31 || i3 == 37 || i3 == 33) {
                    textPaint2.setTextSize(hl.L(13.0f));
                }
            }
            textPaint2.setTextSize(hl.L(15.0f));
        }
        int L2 = i4 - hl.L(12.0f);
        r47 r47Var4 = this.Q0;
        if (r47Var4 != null && r47Var4.D == 22 && r47.B0(r47Var4.k) >= 0 && (a = kg5.a(charSequence4, textPaint2)) < L2 && a > L2 / 5.0f) {
            L2 = a;
        }
        bl1 bl1Var = this.t1;
        if (charSequence4 == 0) {
            if (bl1Var != null) {
                hm.release(bl1Var.i, bl1Var.h);
                this.t1 = null;
            }
            this.p1 = r4;
        } else {
            if (bl1Var == null) {
                this.t1 = new bl1(this);
            }
            try {
                charSequence4 = pv3.m(charSequence4, textPaint2.getFontMetricsInt(), r4, null, r4);
            } catch (Exception unused) {
            }
            this.t1.a(L2, textPaint2, charSequence4);
            if (!z || this.t1.d.getLineCount() <= 3) {
                this.p1 = r4;
                this.r1.f(true, true);
                this.q1 = r4;
            } else {
                this.p1 = !this.o1;
                this.q1 = this.t1.d.getLineBottom(2);
                this.x1 = new pkb(ob6.M0(2131750224, null), textPaint2.getTextSize() / hl.p, hl.o());
                int lineBottom = this.t1.d.getLineBottom(2);
                this.v1 = lineBottom;
                this.w1 = lineBottom - this.t1.d.getLineTop(2);
                this.u1 = (int) this.t1.d.getLineRight(2);
            }
            if (this.p1) {
                int lineEnd = this.t1.d.getLineEnd(2) - 1;
                bl1 bl1Var2 = this.t1;
                CharSequence charSequence5 = charSequence4;
                if (lineEnd >= 0) {
                    charSequence5 = charSequence4.subSequence(r4, lineEnd);
                }
                bl1Var2.a(L2, textPaint2, charSequence5);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new y7c(hl.o()), r4, valueOf2.length(), 33);
            boolean z3 = true;
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) Q("paintChatActionText"), i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.y1 = staticLayout;
            if (!z2 || this.p1) {
                z3 = r4;
            }
            this.z1 = z3;
            this.E1 = a0(staticLayout);
        } else {
            this.y1 = null;
            this.z1 = r4;
            this.E1 = 0.0f;
        }
        if (str == null) {
            this.S1 = null;
            this.T1 = null;
            return;
        }
        if (this.R1 == null) {
            this.R1 = new CornerPathEffect(hl.L(5.0f));
        }
        if (this.S1 == null) {
            Path path = new Path();
            this.S1 = path;
            vx4.d(path, 1.35f, r4);
        }
        pkb pkbVar2 = new pkb(str, i, hl.o());
        this.T1 = pkbVar2;
        pkbVar2.p = hl.L(62.0f);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:12|(1:14)|15|(28:17|(2:19|(2:23|(21:25|26|(3:28|(3:30|(1:32)|33)|34)(1:97)|35|(1:37)(1:96)|38|39|(2:43|(2:45|(1:49)))|50|(1:95)(1:56)|57|(1:59)|60|(4:78|79|(5:81|82|(1:84)|85|86)|92)|64|(1:66)|67|(1:69)(1:77)|70|71|(2:73|74)(1:76))))|98|26|(0)(0)|35|(0)(0)|38|39|(3:41|43|(0))|50|(1:52)|95|57|(0)|60|(1:62)|78|79|(0)|92|64|(0)|67|(0)(0)|70|71|(0)(0))|99|26|(0)(0)|35|(0)(0)|38|39|(0)|50|(0)|95|57|(0)|60|(0)|78|79|(0)|92|64|(0)|67|(0)(0)|70|71|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0193, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0194, code lost:
    
        cc4.g(r0, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(int i, CharSequence charSequence) {
        TextPaint textPaint;
        int i2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        r47 r47Var;
        StaticLayout staticLayout;
        r47 r47Var2;
        int lineCount;
        al1 al1Var;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        int L = i - hl.L(30.0f);
        if (this.j0) {
            L -= hl.L(64.0f);
        }
        if (X()) {
            L = Math.min(L - hl.L(this.j0 ? 28.0f : 82.0f), hl.L(272.0f));
        }
        if (L < 0) {
            return;
        }
        int i3 = this.l2;
        if (i3 > 0) {
            L = Math.min(i3, L);
        }
        int i4 = L;
        this.e1 = true;
        if (!X()) {
            r47 r47Var3 = this.Q0;
            if (r47Var3 != null) {
                int i5 = r47Var3.D;
                if (i5 != 34 && i5 != 35) {
                    if (r47Var3.s2) {
                        textPaint = (TextPaint) Q("paintChatActionText2");
                        textPaint.linkColor = textPaint.getColor();
                        if (X()) {
                            if (charSequence instanceof Spannable) {
                                Spannable spannable = (Spannable) charSequence;
                                for (mv3 mv3Var : (mv3[]) spannable.getSpans(0, spannable.length(), mv3.class)) {
                                    spannable.removeSpan(mv3Var);
                                }
                            }
                            charSequence2 = pv3.n(charSequence, textPaint.getFontMetricsInt(), false, null, 0, 0.85f, 0);
                        } else {
                            charSequence2 = charSequence;
                        }
                        TextPaint textPaint2 = textPaint;
                        charSequence3 = charSequence2;
                        this.N = new StaticLayout(charSequence2, textPaint2, i4, X() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        this.Q = null;
                        r47Var = this.Q0;
                        if (r47Var != null && (message = r47Var.k) != null) {
                            messageAction = message.action;
                            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                                if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                                    this.Q = new StaticLayout(pv3.n(hl.S2(ob6.M0(2131744019, null)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                }
                            }
                        }
                        this.s0 = hm.update(0, this, (this.s || (al1Var = this.g1) == null || al1Var.h()) ? false : true, this.s0, this.N);
                        this.P = 0;
                        this.O = 0;
                        this.R = 0;
                        staticLayout = this.Q;
                        if (staticLayout != null) {
                            int height = staticLayout.getHeight();
                            this.R = height;
                            this.R = hl.L(12.0f) + height;
                        }
                        r47Var2 = this.Q0;
                        if (r47Var2 != null || !r47Var2.j2) {
                            lineCount = this.N.getLineCount();
                            for (i2 = 0; i2 < lineCount; i2++) {
                                try {
                                    float lineWidth = this.N.getLineWidth(i2);
                                    float f = i4;
                                    if (lineWidth > f) {
                                        lineWidth = f;
                                    }
                                    this.P = (int) Math.max(this.P, Math.ceil(this.N.getLineBottom(i2)));
                                    this.O = (int) Math.max(this.O, Math.ceil(lineWidth));
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                    return;
                                }
                            }
                        }
                        this.S = (i - this.O) / 2;
                        int L2 = hl.L(7.0f);
                        this.T = L2;
                        if (this.Q != null) {
                            this.T = uh9.w(11.0f, this.R, L2);
                        }
                        this.U = (i - (X() ? this.O : this.N.getWidth())) / 2;
                        this.V = (i - i4) / 2;
                        Stack stack = this.r0;
                        ArrayList arrayList = this.q0;
                        stack.addAll(arrayList);
                        arrayList.clear();
                        if (charSequence3 instanceof Spannable) {
                            StaticLayout staticLayout2 = this.N;
                            int i6 = this.S;
                            npa.a(this, staticLayout2, i6, i6 + this.O, (Spannable) charSequence3, stack, arrayList, null);
                            return;
                        }
                        return;
                    }
                }
            }
            textPaint = (TextPaint) Q("paintChatActionText");
            textPaint.linkColor = textPaint.getColor();
            if (X()) {
            }
            TextPaint textPaint22 = textPaint;
            charSequence3 = charSequence2;
            this.N = new StaticLayout(charSequence2, textPaint22, i4, X() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.Q = null;
            r47Var = this.Q0;
            if (r47Var != null) {
                messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                }
            }
            this.s0 = hm.update(0, this, (this.s || (al1Var = this.g1) == null || al1Var.h()) ? false : true, this.s0, this.N);
            this.P = 0;
            this.O = 0;
            this.R = 0;
            staticLayout = this.Q;
            if (staticLayout != null) {
            }
            r47Var2 = this.Q0;
            if (r47Var2 != null) {
            }
            lineCount = this.N.getLineCount();
            while (i2 < lineCount) {
            }
            this.S = (i - this.O) / 2;
            int L22 = hl.L(7.0f);
            this.T = L22;
            if (this.Q != null) {
            }
            this.U = (i - (X() ? this.O : this.N.getWidth())) / 2;
            this.V = (i - i4) / 2;
            Stack stack2 = this.r0;
            ArrayList arrayList2 = this.q0;
            stack2.addAll(arrayList2);
            arrayList2.clear();
            if (charSequence3 instanceof Spannable) {
            }
        }
        textPaint = (TextPaint) Q("paintChatActionText3");
        textPaint.linkColor = textPaint.getColor();
        if (X()) {
        }
        TextPaint textPaint222 = textPaint;
        charSequence3 = charSequence2;
        this.N = new StaticLayout(charSequence2, textPaint222, i4, X() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.Q = null;
        r47Var = this.Q0;
        if (r47Var != null) {
        }
        this.s0 = hm.update(0, this, (this.s || (al1Var = this.g1) == null || al1Var.h()) ? false : true, this.s0, this.N);
        this.P = 0;
        this.O = 0;
        this.R = 0;
        staticLayout = this.Q;
        if (staticLayout != null) {
        }
        r47Var2 = this.Q0;
        if (r47Var2 != null) {
        }
        lineCount = this.N.getLineCount();
        while (i2 < lineCount) {
        }
        this.S = (i - this.O) / 2;
        int L222 = hl.L(7.0f);
        this.T = L222;
        if (this.Q != null) {
        }
        this.U = (i - (X() ? this.O : this.N.getWidth())) / 2;
        this.V = (i - i4) / 2;
        Stack stack22 = this.r0;
        ArrayList arrayList22 = this.q0;
        stack22.addAll(arrayList22);
        arrayList22.clear();
        if (charSequence3 instanceof Spannable) {
        }
    }

    public final void I(Canvas canvas, boolean z) {
        dl1 dl1Var;
        Paint paint;
        Paint paint2;
        vnb vnbVar;
        float f;
        float f2;
        float f3;
        float f4;
        vnb vnbVar2;
        Paint paint3;
        Paint paint4;
        int i;
        int i2;
        Canvas canvas2;
        float f5;
        float f6;
        float f7;
        RectF rectF;
        int i3;
        bl1 bl1Var;
        int L;
        RectF rectF2;
        ArrayList arrayList;
        int i4;
        int i5;
        Paint paint5;
        int i6;
        float f8;
        StaticLayout staticLayout;
        ArrayList arrayList2;
        int i7;
        int i8;
        int i9;
        int i10;
        dl1 dl1Var2 = this;
        if (dl1Var2.s) {
            if (dl1Var2.S() && !z) {
                return;
            }
            if (!dl1Var2.S() && z) {
                return;
            }
        }
        Paint Q = dl1Var2.Q("paintChatActionBackground");
        Paint Q2 = dl1Var2.Q("paintChatActionBackgroundDarken");
        dl1Var2.t0 = (TextPaint) dl1Var2.Q("paintChatActionText");
        int i11 = dl1Var2.U0;
        vnb vnbVar3 = dl1Var2.h1;
        if (i11 >= 0) {
            int v0 = aob.v0(i11, vnbVar3);
            if (dl1Var2.W0 == null) {
                Paint paint6 = new Paint(1);
                dl1Var2.W0 = paint6;
                paint6.setColor(v0);
                TextPaint textPaint = new TextPaint(1);
                dl1Var2.X0 = textPaint;
                textPaint.setTypeface(hl.o());
                dl1Var2.X0.setTextSize(hl.L(Math.max(16, xea.S0) - 2));
                dl1Var2.X0.setColor(aob.v0(dl1Var2.V0, vnbVar3));
            }
            Q = dl1Var2.W0;
            dl1Var2.t0 = dl1Var2.X0;
        }
        boolean z2 = dl1Var2.e1;
        Path path = dl1Var2.a1;
        if (z2) {
            dl1Var2.e1 = false;
            dl1Var2.b1 = dl1Var2.getWidth();
            dl1Var2.c1 = 0;
            StaticLayout staticLayout2 = dl1Var2.N;
            int measuredWidth = dl1Var2.getMeasuredWidth() / 2;
            int L2 = hl.L(4.0f);
            f2 = 6.0f;
            ArrayList arrayList3 = dl1Var2.Y0;
            arrayList3.clear();
            int lineCount = staticLayout2 == null ? 0 : staticLayout2.getLineCount();
            f3 = 8.0f;
            int L3 = hl.L(11.0f);
            f = 4.0f;
            int L4 = hl.L(8.0f);
            int i12 = 0;
            f4 = 2.0f;
            int i13 = 0;
            while (i12 < lineCount) {
                vnb vnbVar4 = vnbVar3;
                int ceil = (int) Math.ceil(staticLayout2.getLineWidth(i12));
                if (i12 == 0 || (i10 = i13 - ceil) <= 0) {
                    i8 = ceil;
                } else {
                    i8 = ceil;
                    if (i10 <= (L3 * 1.5f) + L4) {
                        i9 = i13;
                        i12 = qd4.g(i9, i12, 1, arrayList3);
                        i13 = i9;
                        vnbVar3 = vnbVar4;
                    }
                }
                i9 = i8;
                i12 = qd4.g(i9, i12, 1, arrayList3);
                i13 = i9;
                vnbVar3 = vnbVar4;
            }
            vnbVar = vnbVar3;
            for (int i14 = lineCount - 2; i14 >= 0; i14--) {
                int intValue = ((Integer) arrayList3.get(i14)).intValue();
                int i15 = i13 - intValue;
                if (i15 > 0) {
                    i7 = intValue;
                    if (i15 <= (L3 * 1.5f) + L4) {
                        arrayList3.set(i14, Integer.valueOf(i13));
                    }
                } else {
                    i7 = intValue;
                }
                i13 = i7;
                arrayList3.set(i14, Integer.valueOf(i13));
            }
            int L5 = hl.L(3.0f);
            int L6 = hl.L(6.0f);
            int i16 = L3 - L5;
            ArrayList arrayList4 = dl1Var2.Z0;
            arrayList4.clear();
            path.reset();
            float f9 = measuredWidth;
            path.moveTo(f9, L2);
            int i17 = i13;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                rectF2 = dl1Var2.d1;
                if (i19 >= lineCount) {
                    break;
                }
                int intValue2 = ((Integer) arrayList3.get(i19)).intValue();
                int lineBottom = staticLayout2.getLineBottom(i19);
                int i20 = lineCount;
                int i21 = i20 - 1;
                if (i19 < i21) {
                    paint5 = Q2;
                    i6 = ((Integer) arrayList3.get(i19 + 1)).intValue();
                } else {
                    paint5 = Q2;
                    i6 = 0;
                }
                int i22 = lineBottom - i18;
                if (i19 == 0 || intValue2 > i17) {
                    i22 = hl.L(3.0f) + i22;
                }
                if (i19 == i21 || intValue2 > i6) {
                    i22 = hl.L(3.0f) + i22;
                }
                Paint paint7 = Q;
                float f10 = (intValue2 / 2.0f) + f9;
                int i23 = (i19 == i21 || intValue2 >= i6 || i19 == 0 || intValue2 >= i17) ? L4 : L6;
                if (i19 == 0 || intValue2 > i17) {
                    f8 = f10;
                    staticLayout = staticLayout2;
                    arrayList2 = arrayList3;
                    rectF2.set((f8 - L5) - L3, L2, f8 + i16, (L3 << 1) + L2);
                    C();
                    path.arcTo(rectF2, -90.0f, 90.0f);
                } else {
                    f8 = f10;
                    if (intValue2 < i17) {
                        float f11 = f8 + i16;
                        staticLayout = staticLayout2;
                        arrayList2 = arrayList3;
                        rectF2.set(f11, L2, (i23 << 1) + f11, r4 + L2);
                        C();
                        path.arcTo(rectF2, -90.0f, -90.0f);
                    } else {
                        staticLayout = staticLayout2;
                        arrayList2 = arrayList3;
                    }
                }
                L2 += i22;
                if (i19 != i21 && intValue2 < i6) {
                    L2 -= hl.L(3.0f);
                    i22 -= hl.L(3.0f);
                }
                if (i19 != 0 && intValue2 < i17) {
                    L2 -= hl.L(3.0f);
                    i22 -= hl.L(3.0f);
                }
                arrayList4.add(Integer.valueOf(i22));
                if (i19 == i21 || intValue2 > i6) {
                    rectF2.set((f8 - L5) - L3, L2 - (L3 << 1), f8 + i16, L2);
                    C();
                    path.arcTo(rectF2, 0.0f, 90.0f);
                } else if (intValue2 < i6) {
                    float f12 = f8 + i16;
                    rectF2.set(f12, L2 - r0, (i23 << 1) + f12, L2);
                    C();
                    path.arcTo(rectF2, 180.0f, -90.0f);
                }
                i19++;
                dl1Var2 = this;
                i17 = intValue2;
                i18 = lineBottom;
                lineCount = i20;
                Q2 = paint5;
                Q = paint7;
                staticLayout2 = staticLayout;
                arrayList3 = arrayList2;
            }
            paint = Q;
            paint2 = Q2;
            StaticLayout staticLayout3 = staticLayout2;
            ArrayList arrayList5 = arrayList3;
            int i24 = lineCount - 1;
            int i25 = i24;
            while (i25 >= 0) {
                if (i25 != 0) {
                    arrayList = arrayList5;
                    i4 = ((Integer) arrayList.get(i25 - 1)).intValue();
                } else {
                    arrayList = arrayList5;
                    i4 = 0;
                }
                int intValue3 = ((Integer) arrayList.get(i25)).intValue();
                int intValue4 = i25 != i24 ? ((Integer) arrayList.get(i25 + 1)).intValue() : 0;
                StaticLayout staticLayout4 = staticLayout3;
                staticLayout4.getLineBottom(i25);
                float f13 = measuredWidth - (intValue3 / 2);
                int i26 = (i25 == i24 || intValue3 >= intValue4 || i25 == 0 || intValue3 >= i4) ? L4 : L6;
                if (i25 == i24 || intValue3 > intValue4) {
                    arrayList5 = arrayList;
                    staticLayout3 = staticLayout4;
                    i5 = i24;
                    rectF2.set(f13 - i16, L2 - (L3 << 1), L5 + f13 + L3, L2);
                    C();
                    path.arcTo(rectF2, 90.0f, 90.0f);
                } else if (intValue3 < intValue4) {
                    float f14 = f13 - i16;
                    arrayList5 = arrayList;
                    staticLayout3 = staticLayout4;
                    i5 = i24;
                    rectF2.set(f14 - (i26 << 1), L2 - r2, f14, L2);
                    C();
                    path.arcTo(rectF2, 90.0f, -90.0f);
                } else {
                    arrayList5 = arrayList;
                    staticLayout3 = staticLayout4;
                    i5 = i24;
                }
                L2 -= ((Integer) arrayList4.get(i25)).intValue();
                if (i25 == 0 || intValue3 > i4) {
                    rectF2.set(f13 - i16, L2, f13 + L5 + L3, (L3 << 1) + L2);
                    C();
                    path.arcTo(rectF2, 180.0f, 90.0f);
                } else if (intValue3 < i4) {
                    float f15 = f13 - i16;
                    rectF2.set(f15 - (i26 << 1), L2, f15, r11 + L2);
                    C();
                    path.arcTo(rectF2, 0.0f, -90.0f);
                }
                i25--;
                i24 = i5;
            }
            path.close();
            int measuredWidth2 = getMeasuredWidth() / 2;
            if (!X() || Y()) {
                dl1Var = this;
            } else {
                float f16 = measuredWidth2;
                dl1Var = this;
                rectF2.left = (f16 - (dl1Var.O / 2.0f)) - hl.L(17.0f);
                rectF2.top = L2;
                rectF2.right = (dl1Var.O / 2.0f) + f16 + hl.L(17.0f);
                rectF2.bottom = hl.L(28.0f) + L2 + dl1Var.P + dl1Var.R;
                path.reset();
                path.addRoundRect(rectF2, hl.L(15.0f), hl.L(15.0f), Path.Direction.CW);
                path.close();
            }
        } else {
            dl1Var = dl1Var2;
            paint = Q;
            paint2 = Q2;
            vnbVar = vnbVar3;
            f = 4.0f;
            f2 = 6.0f;
            f3 = 8.0f;
            f4 = 2.0f;
        }
        if (!dl1Var.x0) {
            dl1Var.w0 = ((ViewGroup) dl1Var.getParent()).getMeasuredHeight();
        }
        if (vnbVar != null) {
            vnbVar2 = vnbVar;
            vnbVar2.b(dl1Var.v0, dl1Var.u0 + hl.L(f), dl1Var.getMeasuredWidth(), dl1Var.w0);
        } else {
            vnbVar2 = vnbVar;
            aob.q(dl1Var.v0, dl1Var.u0 + hl.L(f), dl1Var.getMeasuredWidth(), dl1Var.w0);
        }
        boolean z3 = dl1Var instanceof er1;
        float f17 = (!z3 || aob.g1(vnbVar2)) ? 1.0f : 0.75f;
        if (!z || (dl1Var.getAlpha() == 1.0f && !z3)) {
            paint3 = paint2;
            paint4 = paint;
            if (z3) {
                i = paint4.getAlpha();
                i2 = paint3.getAlpha();
                paint4.setAlpha((int) (i * f17));
                paint3.setAlpha((int) (i2 * f17));
            } else {
                i = -1;
                i2 = -1;
            }
        } else {
            i = paint.getAlpha();
            i2 = paint2.getAlpha();
            paint4 = paint;
            paint4.setAlpha((int) (dl1Var.getAlpha() * i * f17));
            paint3 = paint2;
            paint3.setAlpha((int) (dl1Var.getAlpha() * i2 * f17));
        }
        r47 r47Var = dl1Var.Q0;
        Paint paint8 = dl1Var.i2;
        if (r47Var == null || !r47Var.j2) {
            canvas2 = canvas;
            canvas2.drawPath(path, paint4);
            if (dl1Var.S() && paint3.getAlpha() > 0) {
                canvas2.drawPath(path, paint3);
            }
            if (dl1Var.h2 > 0.0f) {
                int alpha = paint8.getAlpha();
                if (z) {
                    paint8.setAlpha((int) (dl1Var.getAlpha() * alpha));
                }
                canvas2.drawPath(path, paint8);
                paint8.setAlpha(alpha);
            }
        } else {
            canvas2 = canvas;
        }
        if (dl1Var.U()) {
            int width = dl1Var.getWidth();
            dl1Var.J0.getClass();
            float L7 = (width - hl.L(206.0f)) / f4;
            float walletActionTop = dl1Var.getWalletActionTop();
            dl1Var.J0.getClass();
            float L8 = hl.L(206.0f) + L7;
            if (dl1Var.J0.q0 == null) {
                L = hl.L(140.0f);
                f5 = 140.0f;
                f6 = 20.0f;
            } else {
                f5 = 140.0f;
                f6 = 20.0f;
                L = hl.L(150.0f) + ((int) Math.ceil(r13.q0.h()));
            }
            RectF rectF3 = dl1Var.O0;
            rectF3.set(L7, walletActionTop, L8, L + walletActionTop);
            canvas2.save();
            dl1Var.J0.c(canvas2, L7, walletActionTop);
            canvas2.drawRoundRect(rectF3, hl.L(f6), hl.L(f6), paint4);
            if (dl1Var.S() && paint3.getAlpha() > 0) {
                canvas2.drawRoundRect(rectF3, hl.L(f6), hl.L(f6), paint3);
            }
            f7 = 0.0f;
            if (dl1Var.h2 > 0.0f) {
                int alpha2 = paint8.getAlpha();
                if (z) {
                    paint8.setAlpha((int) (dl1Var.getAlpha() * alpha2));
                }
                canvas2.drawRoundRect(rectF3, hl.L(f6), hl.L(f6), paint8);
                paint8.setAlpha(alpha2);
            }
            canvas2.restore();
        } else {
            f5 = 140.0f;
            f6 = 20.0f;
            f7 = 0.0f;
        }
        r47 r47Var2 = dl1Var.Q0;
        if (dl1Var.T()) {
            float L9 = dl1Var.I0.T.f + hl.L(f3);
            float width2 = (dl1Var.getWidth() - L9) / f4;
            float L10 = dl1Var.I0.p ? f7 : hl.L(12.0f) + dl1Var.T + dl1Var.P;
            RectF rectF4 = hl.P;
            rectF4.set(width2, L10, L9 + width2, dl1Var.I0.P + L10 + hl.L(f3));
            RectF rectF5 = dl1Var.N1;
            if (rectF5 == null) {
                rectF5 = new RectF();
                dl1Var.N1 = rectF5;
            }
            rectF5.set(rectF4);
            canvas2.drawRoundRect(dl1Var.N1, hl.L(16.0f), hl.L(16.0f), paint4);
            if (dl1Var.S()) {
                canvas2.drawRoundRect(dl1Var.N1, hl.L(16.0f), hl.L(16.0f), paint3);
            }
        } else if (dl1Var.P0 != null) {
            float L11 = hl.L(174.0f);
            ueb uebVar = dl1Var.P0;
            uebVar.getClass();
            float L12 = hl.L(f5) + ((int) uebVar.f.h()) + (uebVar.i ? hl.L(40.0f) : 0);
            float width3 = (dl1Var.getWidth() - L11) / f4;
            RectF rectF6 = dl1Var.N1;
            if (rectF6 == null) {
                rectF6 = new RectF();
                dl1Var.N1 = rectF6;
            }
            rectF6.set(width3, hl.L(f), L11 + width3, hl.L(f) + L12);
            canvas2.drawRoundRect(dl1Var.N1, hl.L(16.0f), hl.L(16.0f), paint4);
            if (dl1Var.S()) {
                canvas2.drawRoundRect(dl1Var.N1, hl.L(16.0f), hl.L(16.0f), paint3);
            }
        } else if (dl1Var.W(r47Var2)) {
            float width4 = (dl1Var.getWidth() - dl1Var.j1) / f4;
            float f18 = dl1Var.T + dl1Var.P;
            if (dl1Var.Y()) {
                float L13 = f18 + hl.L(f);
                rectF = hl.P;
                rectF.set(width4, L13, dl1Var.j1 + width4, dl1Var.f + L13);
            } else {
                float L14 = f18 + hl.L(12.0f);
                rectF = hl.P;
                float f19 = dl1Var.j1;
                rectF.set(width4, L14, width4 + f19, f19 + L14 + dl1Var.L1);
            }
            if (r47Var2 != null && r47Var2.D == 18 && !dl1Var.p1 && (bl1Var = dl1Var.t1) != null && dl1Var.q1 > 0) {
                rectF.bottom = qu6.B(1.0f, dl1Var.r1.c, bl1Var.d.getHeight() - dl1Var.q1, rectF.bottom);
            }
            RectF rectF7 = dl1Var.N1;
            if (rectF7 == null) {
                rectF7 = new RectF();
                dl1Var.N1 = rectF7;
            }
            rectF7.set(rectF);
            if (r47Var2 == null || (!((i3 = r47Var2.D) == 33 || i3 == 35) || dl1Var.Z1 == null)) {
                canvas2.drawRoundRect(dl1Var.N1, hl.L(f6), hl.L(f6), paint4);
                if (dl1Var.S()) {
                    canvas2.drawRoundRect(dl1Var.N1, hl.L(f6), hl.L(f6), paint3);
                }
            } else {
                float L15 = hl.L(16.0f);
                float[] fArr = dl1Var.n2;
                Arrays.fill(fArr, L15);
                float L16 = hl.L(f2);
                fArr[7] = L16;
                fArr[6] = L16;
                fArr[5] = L16;
                fArr[4] = L16;
                Path path2 = dl1Var.m2;
                path2.rewind();
                path2.addRoundRect(dl1Var.N1, fArr, Path.Direction.CW);
                canvas2.drawPath(path2, paint4);
                if (dl1Var.S()) {
                    canvas2.drawPath(path2, paint3);
                }
            }
        }
        if (i >= 0) {
            paint4.setAlpha(i);
            paint3.setAlpha(i2);
        }
    }

    public final void J(Canvas canvas) {
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer == null || this.g2 == null || !(tL_messageActionStarGiftOnchainOffer.gift instanceof TL_stars.TL_starGiftUnique)) {
            return;
        }
        ImageReceiver imageReceiver = this.J;
        float L = imageReceiver.L0 + imageReceiver.N0 + hl.L(10.0f) + hl.L(1.9805f);
        int L2 = (int) ((L + hl.L(48.0f)) - hl.L(40.800003f));
        int L3 = (int) ((imageReceiver.M0 - hl.L(10.0f)) - hl.L(1.7f));
        this.g2.setBounds(L2 - hl.L(39.0f), L3, L2, hl.L(42.6f) + L3);
        this.g2.draw(canvas);
    }

    public final void K(Canvas canvas) {
        float f;
        float f2;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f3 = 2.0f;
        canvas2.translate(this.k0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.U, this.T);
        StaticLayout staticLayout = this.N;
        hm.drawAnimatedEmojis(canvas2, staticLayout, this.s0, 0.0f, this.q0, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout != null ? O(staticLayout.getPaint().getColor()) : null);
        canvas2.restore();
        float f4 = 4.0f;
        if (T()) {
            canvas2.save();
            float width = getWidth();
            yua yuaVar = this.I0;
            canvas2.translate((width - yuaVar.T.f) / 2.0f, yuaVar.p ? hl.L(4.0f) : hl.L(16.0f) + this.T + this.P);
            this.I0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        byb bybVar = this.o0;
        vnb vnbVar = this.h1;
        if (bybVar != null) {
            float alpha = getAlpha();
            if (vnbVar != null) {
                vnbVar.b(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            } else {
                aob.q(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            }
            this.o0.c(canvas, getWidth(), this.k0, 0.0f, 1.0f, alpha, this.n0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.Y1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (vnbVar != null) {
            vnbVar.b(this.v0, this.u0 + hl.L(4.0f), getMeasuredWidth(), this.w0);
        } else {
            aob.q(this.v0, this.u0 + hl.L(4.0f), getMeasuredWidth(), this.w0);
        }
        float width2 = (getWidth() - this.j1) / 2.0f;
        float L = hl.L(4.0f) + hl.L(4.0f) + this.T + this.P + this.f;
        float L2 = (this.j1 - hl.L(4.0f)) / 2.0f;
        int i = 0;
        while (i < arrayList.size()) {
            wo0 wo0Var = (wo0) arrayList.get(i);
            float a = wo0Var.a();
            float L3 = ((hl.L(f4) + L2) * i) + width2;
            float f5 = L3 + L2;
            RectF rectF = this.d1;
            rectF.set(L3, L, f5, wo0Var.f + L);
            canvas2.save();
            if (a != 1.0f) {
                f = f4;
                canvas2.scale(a, a, rectF.centerX(), rectF.centerY());
            } else {
                f = f4;
            }
            float L4 = hl.L(Math.min(6.75f, xea.U0));
            float[] fArr = this.o2;
            Arrays.fill(fArr, L4);
            if ((wo0Var.g & 9) == 9) {
                float L5 = hl.L(xea.U0);
                fArr[7] = L5;
                fArr[6] = L5;
            }
            if ((wo0Var.g & 10) == 10) {
                float L6 = hl.L(xea.U0);
                fArr[5] = L6;
                fArr[4] = L6;
            }
            Path path = this.p2;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas2.drawPath(path, Q("paintChatActionBackground"));
            if (S()) {
                canvas2.drawPath(path, aob.h2);
            }
            canvas2.save();
            canvas2.clipPath(path);
            hf0 hf0Var = wo0Var.s;
            if (hf0Var != null) {
                int i2 = (int) L;
                hf0Var.setBounds((int) L3, i2, (int) f5, wo0Var.f + i2);
                wo0Var.s.setAlpha(jn7.d4);
                wo0Var.s.draw(canvas2);
            }
            canvas2.restore();
            canvas2.save();
            float L7 = wo0Var.t != null ? hl.L(26.0f) : 0;
            float z = bp1.z(L2 - (wo0Var.h.j() + (wo0Var.t != null ? hl.L(f) : 0)), L7, f3, L3);
            Drawable drawable = wo0Var.t;
            if (drawable != null) {
                int i3 = (int) z;
                f2 = f3;
                drawable.setBounds(i3, (int) (((wo0Var.f - hl.L(24.0f)) / f3) + L), hl.L(24.0f) + i3, hl.L(24.0f) + ((int) (((wo0Var.f - hl.L(24.0f)) / f2) + L)));
                wo0Var.t.setAlpha(wo0Var.m ? 128 : jn7.d4);
                wo0Var.t.draw(canvas2);
                z += L7;
            } else {
                f2 = f3;
            }
            wo0Var.h.p = Math.max(1, (((int) L2) - hl.L(15.0f)) - r6);
            wo0Var.h.f(canvas2, z, (hl.L(40.0f) / f2) + L, wo0Var.m ? 0.5f : 1.0f);
            canvas2.restore();
            canvas2.restore();
            i++;
            f4 = f;
            f3 = f2;
        }
    }

    public final void L(Canvas canvas, boolean z) {
        if (this.s) {
            if (S() && !z) {
                return;
            }
            if (!S() && z) {
                return;
            }
        }
        M(canvas, z, null);
    }

    public final void M(Canvas canvas, boolean z, Integer num) {
        Canvas canvas2;
        float alpha = z ? getAlpha() : 1.0f;
        if (alpha > 0.0f) {
            vnb vnbVar = this.h1;
            if (vnbVar != null) {
                vnbVar.b(this.v0, this.u0 + hl.L(4.0f), getMeasuredWidth(), this.w0);
            } else {
                aob.q(this.v0, this.u0 + hl.L(4.0f), getMeasuredWidth(), this.w0);
            }
            r47 r47Var = this.Q0;
            if (r47Var == null || !r47Var.N5()) {
                return;
            }
            x49 x49Var = this.F0;
            x49Var.getClass();
            x49Var.a = 1.0f;
            if (alpha < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            cl1 cl1Var = this.x2;
            x49Var.d(canvas2, cl1Var.b ? cl1Var.c : 1.0f, num);
            if (alpha < 1.0f) {
                canvas2.restore();
            }
        }
    }

    @Override // jq3
    public final void N(String str) {
        TLRPC.PhotoSize photoSize;
        r47 r47Var = this.Q0;
        if (r47Var == null || r47Var.D != 11) {
            return;
        }
        int size = r47Var.p0.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                photoSize = null;
                break;
            }
            photoSize = (TLRPC.PhotoSize) r47Var.p0.get(i);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                break;
            } else {
                i++;
            }
        }
        this.J.Z(this.y0, "g", jn5.f(photoSize, r47Var.n0), "50_50_b", this.M, 0L, null, r47Var, 1);
        lq3.q(this.I).v(this);
    }

    public final ColorFilter O(int i) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (i == this.w2 && (porterDuffColorFilter = this.v2) != null) {
            return porterDuffColorFilter;
        }
        this.w2 = i;
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        this.v2 = porterDuffColorFilter2;
        return porterDuffColorFilter2;
    }

    public final int P(r47 r47Var) {
        int i;
        int i2 = this.i1;
        int i3 = r47Var.D;
        if (i3 == 37) {
            i2 = hl.L(52.0f);
        } else if (i3 == 21 || Y()) {
            i2 = hl.L(78.0f);
        }
        if (X() || (i = r47Var.D) == 34 || i == 35) {
            return 0;
        }
        return i2;
    }

    public Paint Q(String str) {
        vnb vnbVar = this.h1;
        Paint d = vnbVar != null ? vnbVar.d(str) : null;
        return d != null ? d : aob.T0(str);
    }

    public final float R(r47 r47Var) {
        uc7 s1;
        String str;
        if (r47Var == null) {
            return 1.0f;
        }
        try {
            if (r47Var.D == 22 && (str = (s1 = uc7.s1(this.I)).J2) != null && TextUtils.equals(r47Var.k.action.wallpaper.uploadingImage, str)) {
                return s1.K2.r;
            }
            return 1.0f;
        } catch (Exception e) {
            cc4.g(e, true);
            return 1.0f;
        }
    }

    public final boolean S() {
        if (this.W0 != null) {
            return false;
        }
        vnb vnbVar = this.h1;
        return vnbVar != null ? vnbVar.g() : aob.b1();
    }

    public final boolean T() {
        yua yuaVar = this.I0;
        return (yuaVar == null || yuaVar.Q == null) ? false : true;
    }

    public final boolean U() {
        TLRPC.Message message;
        r47 r47Var = this.Q0;
        return (r47Var == null || (message = r47Var.k) == null || !(message.action instanceof TLRPC.TL_messageActionGramTransfer)) ? false : true;
    }

    public final void V() {
        al1 al1Var = this.g1;
        if (al1Var != null && al1Var.h()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean W(r47 r47Var) {
        if (r47Var == null) {
            return false;
        }
        int i = r47Var.D;
        return i == 30 || i == 18 || i == 25 || Y();
    }

    public final boolean X() {
        TLRPC.Message message;
        r47 r47Var = this.Q0;
        return (r47Var == null || (message = r47Var.k) == null || !(message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) ? false : true;
    }

    public final boolean Y() {
        r47 r47Var;
        int i;
        if (T() || this.P0 != null || (i = (r47Var = this.Q0).D) == 31 || i == 37 || i == 33 || i == 35 || i == 34 || i == 21 || i == 22 || r47Var.y4()) {
            return true;
        }
        TLRPC.Message message = this.Q0.k;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
            return ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low || ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).rejected;
        }
        return false;
    }

    public final boolean Z() {
        r47 r47Var = this.Q0;
        if (r47Var == null) {
            return false;
        }
        TLRPC.Message message = r47Var.k;
        TLRPC.MessageAction messageAction = message.action;
        if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
            return lbc.D(uc7.s1(this.I).X1(Long.valueOf(this.Q0.k.from_id.user_id)));
        }
        return false;
    }

    @Override // pk5
    public final boolean a() {
        return false;
    }

    public final boolean b0() {
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer == null || !this.d2) {
            return false;
        }
        long j = tL_messageActionStarGiftOnchainOffer.offer_id;
        Long l = (Long) vs7.a.get(Long.valueOf(j));
        if (l != null && l.longValue() > SystemClock.elapsedRealtime() && vs7.b.contains(Long.valueOf(j))) {
            return true;
        }
        int i = this.I;
        return vs7.k(i, j) || vs7.m(i, j);
    }

    @Override // pk5
    public final void c(TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        al1 al1Var = this.g1;
        if (al1Var != null) {
            al1Var.y(this, reactionCount, z, f, f2);
        }
    }

    public final CharSequence c0(SpannableStringBuilder spannableStringBuilder, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        HashMap hashMap = vs7.a;
        CharSequence charSequence = null;
        if (tL_messageActionStarGiftOnchainOffer.settled && !tL_messageActionStarGiftOnchainOffer.accepted) {
            charSequence = ob6.M0(2131749520, null);
        } else if (!tL_messageActionStarGiftOnchainOffer.accepted && !tL_messageActionStarGiftOnchainOffer.declined) {
            if (tL_messageActionStarGiftOnchainOffer.cancelled) {
                charSequence = ob6.M0(2131749519, null);
            } else if (tL_messageActionStarGiftOnchainOffer.cancelling) {
                charSequence = ob6.M0(2131749524, null);
            } else {
                int max = Math.max(0, tL_messageActionStarGiftOnchainOffer.expires_at - ConnectionsManager.getInstance(this.I).getCurrentTime());
                charSequence = tL_messageActionStarGiftOnchainOffer.expired ? ob6.M0(2131749522, null) : max == 0 ? ob6.M0(2131749521, null) : hl.S2(ob6.a0(null, null, 2131749558, String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(max / 3600), Integer.valueOf((max / 60) % 60), Integer.valueOf(max % 60))));
            }
        }
        if (charSequence == null) {
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        spannableStringBuilder2.append((CharSequence) "\n\n");
        spannableStringBuilder2.append(charSequence);
        return spannableStringBuilder2;
    }

    public final void d0(CharacterStyle characterStyle) {
        if (this.g1 == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        String url = ((URLSpan) characterStyle).getURL();
        if (url.startsWith("task")) {
            this.g1.n(this, this.Q0.N1(), Integer.parseInt(url.substring(5)));
            return;
        }
        if (url.startsWith("topic")) {
            URLSpan uRLSpan = this.y;
            if (uRLSpan instanceof f8c) {
                TLObject tLObject = ((f8c) uRLSpan).c;
                if (tLObject instanceof TLRPC.TL_forumTopic) {
                    ro4.n(this.g1.w(), -this.g1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.y;
            if (uRLSpan2 instanceof f8c) {
                TLObject tLObject2 = ((f8c) uRLSpan2).c;
                if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                    this.g1.x((TLRPC.TL_chatInviteExported) tLObject2);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("game")) {
            this.g1.B(this, this.Q0.N1());
        } else if (url.startsWith("http")) {
            m01.u(getContext(), url);
        } else {
            this.g1.I(Long.parseLong(url));
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        r47 r47Var;
        if (i == jn7.m1) {
            setSpoilersSuppressed(false);
            return;
        }
        if (i == jn7.l4 || i == jn7.L3) {
            invalidate();
            return;
        }
        if (i == jn7.l1) {
            setSpoilersSuppressed(true);
            return;
        }
        if (i == jn7.Y2 || i == jn7.H3 || i == jn7.Z2) {
            r47 r47Var2 = this.Q0;
            if (r47Var2 != null) {
                i0(r47Var2, true);
                return;
            }
            return;
        }
        if (i == jn7.y0) {
            if (!Objects.equals(objArr[0], yac.h(this.I).c0) || (r47Var = this.Q0) == null) {
                return;
            }
            i0(r47Var, true);
            return;
        }
        if (i == jn7.d4 && U()) {
            this.s2 = null;
            this.W = 0;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.U1) {
            return super.drawChild(canvas, view, j);
        }
        float a = this.n.a(0.02f);
        canvas.save();
        canvas.scale(a, a, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final void e0() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        r47 r47Var = this.Q0;
        TLRPC.MessageAction messageAction = r47Var.k.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (r47Var != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !Z()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.Q0.k.action).slug;
        }
        if (this.g1 != null) {
            hl.c3(new tu0(this, tL_premiumGiftOption, str));
        }
    }

    public final void f0() {
        TLRPC.Message message;
        r47 r47Var = this.Q0;
        if (r47Var == null || (message = r47Var.k) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        boolean z = messageAction instanceof TLRPC.TL_messageActionGiftStars;
        q6b q6bVar = this.e0;
        if (z) {
            Context context = getContext();
            TLRPC.Message message2 = this.Q0.k;
            int i = message2.date;
            TLRPC.Peer peer = message2.from_id;
            TLRPC.Peer peer2 = message2.peer_id;
            TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
            vnb vnbVar = q6bVar.J;
            TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
            starsTransaction.title = null;
            starsTransaction.description = null;
            starsTransaction.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
            starsTransaction.peer = tL_starsTransactionPeer;
            tL_starsTransactionPeer.peer = peer;
            starsTransaction.date = i;
            starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
            starsTransaction.id = tL_messageActionGiftStars.transaction_id;
            starsTransaction.gift = true;
            starsTransaction.sent_by = peer;
            starsTransaction.received_by = peer2;
            nza.l1(context, false, 0L, this.I, starsTransaction, vnbVar);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
            Context context2 = getContext();
            TLRPC.Message message3 = this.Q0.k;
            int i2 = message3.date;
            TLRPC.Peer peer3 = message3.from_id;
            TLRPC.Peer peer4 = message3.peer_id;
            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
            vnb vnbVar2 = q6bVar.J;
            TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
            starsTransaction2.title = null;
            starsTransaction2.description = null;
            starsTransaction2.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction2.peer = tL_starsTransactionPeer2;
            tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
            starsTransaction2.date = i2;
            starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
            starsTransaction2.id = tL_messageActionPrizeStars.transaction_id;
            starsTransaction2.gift = true;
            starsTransaction2.flags |= TLObject.FLAG_13;
            starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
            starsTransaction2.sent_by = peer3;
            starsTransaction2.received_by = peer4;
            nza.l1(context2, false, 0L, this.I, starsTransaction2, vnbVar2);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
            Context context3 = getContext();
            TLRPC.Message message4 = this.Q0.k;
            int i3 = message4.date;
            TLRPC.Peer peer5 = message4.from_id;
            TLRPC.Peer peer6 = message4.peer_id;
            TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
            vnb vnbVar3 = q6bVar.J;
            TL_stars.StarsTransaction starsTransaction3 = new TL_stars.StarsTransaction();
            starsTransaction3.title = null;
            starsTransaction3.description = null;
            starsTransaction3.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer3 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction3.peer = tL_starsTransactionPeer3;
            tL_starsTransactionPeer3.peer = peer5;
            starsTransaction3.date = i3;
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            starsTransaction3.amount = tL_starsTonAmount;
            tL_starsTonAmount.amount = tL_messageActionGiftTon.cryptoAmount;
            starsTransaction3.id = tL_messageActionGiftTon.transaction_id;
            starsTransaction3.gift = true;
            starsTransaction3.sent_by = peer5;
            starsTransaction3.received_by = peer6;
            nza.l1(context3, false, 0L, this.I, starsTransaction3, vnbVar3);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            if (((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                return;
            }
            wua wuaVar = new wua(getContext(), this.I, r47.B0(this.Q0.k), this.h1, null);
            wuaVar.m2(this.Q0, null);
            wuaVar.show();
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
            if (!((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                wua wuaVar2 = new wua(getContext(), this.I, r47.B0(this.Q0.k), this.h1, null);
                wuaVar2.m2(this.Q0, null);
                wuaVar2.show();
                return;
            } else {
                e S = LaunchActivity.S();
                if (S != null) {
                    bs2.v(null, 2131743535, d31.b0(S), org.telegram.messenger.beta.R.raw.fire_on, 36);
                    return;
                }
                return;
            }
        }
        if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    wua wuaVar3 = new wua(getContext(), this.I, 0L, this.h1, null);
                    wuaVar3.n2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                    wuaVar3.show();
                }
            }
        }
    }

    public final boolean g0(float f, float f2, gn1 gn1Var) {
        if (U() && !this.Q0.O3() && !this.Q0.k.premiumEffectWasPlayed) {
            float y = getY() + getPaddingTop() + getWalletActionTop();
            if (y >= f && y + hl.L(140.0f) <= f2) {
                zoc zocVar = this.J0;
                b29 b29Var = zocVar.l;
                if (zocVar.i0 && zocVar.j0 == null) {
                    zocVar.i0 = false;
                    zocVar.k0 = gn1Var;
                    zocVar.K.e(true, 0.0f);
                    zocVar.M = false;
                    zocVar.N = 0L;
                    zocVar.b();
                    zocVar.g();
                    zocVar.t = 18.0f;
                    zocVar.u.z();
                    b29Var.O(true, 0.0f);
                    b29Var.start();
                    zocVar.H = true;
                    float f3 = zocVar.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    zocVar.j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    zocVar.j0.setInterpolator(k43.h);
                    zocVar.j0.addUpdateListener(new qm1(zocVar, f3, (byte) 8));
                    zocVar.j0.addListener(new omb(zocVar, (byte) 24));
                    zocVar.j0.start();
                    zocVar.a.invalidate();
                    this.Q0.k.premiumEffectWasPlayed = true;
                    jf7.Y(this.I).U1(r47.B0(this.Q0.k), this.Q0.k);
                    return true;
                }
            }
        }
        return false;
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override // jf0
    public int getBoundsLeft() {
        if (T()) {
            int width = ((int) (getWidth() - (this.I0.T.f + hl.L(8.0f)))) / 2;
            return this.I0.p ? width : Math.min(this.b1, width);
        }
        if (W(this.Q0)) {
            return ik8.g(getWidth(), this.j1, 2, this.k0 / 2);
        }
        int i = this.b1;
        ImageReceiver imageReceiver = this.J;
        if (imageReceiver != null && imageReceiver.R0) {
            i = Math.min((int) imageReceiver.L0, i);
        }
        return (this.k0 / 2) + i;
    }

    @Override // jf0
    public int getBoundsRight() {
        if (T()) {
            int L = ((int) ((this.I0.T.f + hl.L(8.0f)) + getWidth())) / 2;
            return this.I0.p ? L : Math.max(this.c1, L);
        }
        if (W(this.Q0)) {
            return ((getWidth() + this.j1) / 2) + (this.k0 / 2);
        }
        int i = this.c1;
        ImageReceiver imageReceiver = this.J;
        if (imageReceiver != null && imageReceiver.R0) {
            i = Math.max((int) imageReceiver.w(), i);
        }
        return (this.k0 / 2) + i;
    }

    @Override // pk5
    public float getCheckBoxTranslation() {
        return 0.0f;
    }

    public j47 getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.R0;
    }

    public al1 getDelegate() {
        return this.g1;
    }

    @Override // pk5
    public float getDeltaBottom() {
        return 0.0f;
    }

    public float getDeltaLeft() {
        return 0.0f;
    }

    public float getDeltaRight() {
        return 0.0f;
    }

    public float getDeltaTop() {
        return 0.0f;
    }

    public int getLayoutHeight() {
        return getMeasuredHeight();
    }

    @Override // pk5
    public r47 getMessageObject() {
        return this.Q0;
    }

    @Override // jq3
    public int getObserverTag() {
        return this.x;
    }

    public ImageReceiver getPhotoImage() {
        return this.J;
    }

    public x49 getReactionsLayout() {
        return this.F0;
    }

    @Override // pk5
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public cl1 getTransitionParams() {
        return this.x2;
    }

    public float getWalletSlidingOffset() {
        return this.N0;
    }

    public final void h0(int i, boolean z, boolean z2) {
        int i2 = this.R0;
        if (i2 == i || i2 / 3600 == i / 3600) {
            return;
        }
        String M0 = z ? i == 2147483646 ? ob6.M0(2131748246, "MessageScheduledUntilOnline") : ob6.a0("MessageScheduledOn", null, 2131748282, ob6.u(i, false)) : ob6.u(i, false);
        this.R0 = i;
        CharSequence charSequence = this.S0;
        if (charSequence == null || !TextUtils.equals(M0, charSequence)) {
            this.S0 = M0;
            this.s2 = null;
            l0(z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0ba0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0ba9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0b8f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x095d A[EDGE_INSN: B:487:0x095d->B:483:0x095d BREAK  A[LOOP:6: B:458:0x0911->B:485:0x095a], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v108 */
    /* JADX WARN: Type inference failed for: r4v109 */
    /* JADX WARN: Type inference failed for: r4v14, types: [org.telegram.tgnet.TLRPC$messages_StickerSet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0(r47 r47Var, boolean z) {
        StaticLayout staticLayout;
        TLRPC.TL_messageReactions tL_messageReactions;
        vnb vnbVar;
        int i;
        ImageReceiver imageReceiver;
        int i2;
        vnb vnbVar2;
        int i3;
        String str;
        r47 r47Var2;
        String str2;
        TLRPC.Document document;
        TLRPC.Document document2;
        String str3;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        r47 r47Var3;
        int i4;
        TLRPC.Document document3;
        TLRPC.Document document4;
        TLRPC.Document document5;
        int i5;
        int i6;
        boolean z2;
        int i7;
        ImageReceiver imageReceiver2;
        TLRPC.PhotoSize photoSize;
        ImageReceiver imageReceiver3;
        TLRPC.VideoSize videoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z3;
        float f;
        RadialProgress2 radialProgress2;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        ImageReceiver imageReceiver4;
        float f2;
        byb bybVar;
        int i8;
        int paddingTop;
        int i9;
        TLRPC.Message message;
        String l;
        String str4;
        ActivityManager activityManager;
        r47 r47Var4 = r47Var;
        if (r47Var4 != null) {
            if (this.Q0 != r47Var4 && this.N0 != 0.0f) {
                setWalletSlidingOffset(0.0f);
            }
            r47 r47Var5 = this.Q0;
            if (r47Var5 != r47Var4) {
                this.r = null;
            }
            TLRPC.Message message2 = r47Var4.k;
            if ((message2 == null || !(message2.action instanceof TLRPC.TL_messageActionGramTransfer) || this.b2 == message2.send_state) && r47Var5 == r47Var4 && (((staticLayout = this.N) == null || TextUtils.equals(staticLayout.getText(), r47Var4.v)) && !((!this.E0 && r47Var4.C != null) || z || r47Var4.D == 21 || r47Var4.M1))) {
                return;
            }
            boolean z4 = f11.a;
            ArrayList arrayList2 = this.Y1;
            arrayList2.clear();
            this.Z1 = null;
            this.c2 = null;
            this.s2 = null;
            r47 r47Var6 = this.Q0;
            byte b = 1;
            boolean z5 = r47Var6 == null || r47Var6.m1 != r47Var4.m1;
            if (r47Var6 != null) {
                r47Var4.o1 = r47Var6.o1;
            }
            if (!z5 && r47Var6 != null && U()) {
                r47Var4.k.premiumEffectWasPlayed |= this.Q0.k.premiumEffectWasPlayed;
            }
            this.Q0 = r47Var4;
            boolean U = U();
            vnb vnbVar3 = this.h1;
            if (U && this.J0 == null) {
                zoc zocVar = new zoc(this, vnbVar3);
                this.J0 = zocVar;
                zocVar.s0 = new wk1(this, b);
                zocVar.n(this.K0);
            }
            zoc zocVar2 = this.J0;
            if (zocVar2 != null) {
                boolean U2 = U();
                dl1 dl1Var = zocVar2.a;
                zocVar2.n = U2;
                if (U2 && zocVar2.m == null && !zocVar2.o && ik8.A(dl1Var) && xea.o() != 0 && (activityManager = (ActivityManager) dl1Var.getContext().getSystemService("activity")) != null && activityManager.getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                    yoc yocVar = new yoc(zocVar2, dl1Var.getContext(), new voc(zocVar2, (byte) 1));
                    zocVar2.m = yocVar;
                    dl1Var.addView(yocVar, new ViewGroup.LayoutParams(hl.L(42.0f), hl.L(42.0f)));
                }
                yoc yocVar2 = zocVar2.m;
                if (yocVar2 != null) {
                    yocVar2.setVisibility((!U2 || zocVar2.o) ? 8 : 0);
                    zocVar2.m.setPaused(!U2 || zocVar2.o);
                }
                if (!U2) {
                    zocVar2.f();
                    zocVar2.k();
                }
            }
            TLRPC.Message message3 = r47Var4.k;
            int i10 = this.I;
            if (message3 != null && (message3.action instanceof TLRPC.TL_messageActionGramTransfer)) {
                uc7 s1 = uc7.s1(i10);
                long n = wf3.n(r47Var4.k.peer_id);
                if (lbc.C(n)) {
                    l = ob6.M0(2131742602, null);
                } else if (r47Var4.k.peer_id == null) {
                    str4 = null;
                    zoc zocVar3 = this.J0;
                    boolean O3 = r47Var4.O3();
                    TLRPC.Message message4 = r47Var4.k;
                    zocVar3.m(O3, (TLRPC.TL_messageActionGramTransfer) message4.action, str4, message4.send_state, z5, !message4.premiumEffectWasPlayed);
                    this.b2 = r47Var4.k.send_state;
                } else {
                    l = wf3.l(s1.b2(n));
                }
                str4 = l;
                zoc zocVar32 = this.J0;
                boolean O32 = r47Var4.O3();
                TLRPC.Message message42 = r47Var4.k;
                zocVar32.m(O32, (TLRPC.TL_messageActionGramTransfer) message42.action, str4, message42.send_state, z5, !message42.premiumEffectWasPlayed);
                this.b2 = r47Var4.k.send_state;
            }
            r47Var4.M1 = false;
            this.E0 = r47Var4.C != null;
            lq3.q(i10).v(this);
            this.W = 0;
            this.H = false;
            bl1 bl1Var = this.t1;
            if (bl1Var != null && z5) {
                hm.release(bl1Var.i, bl1Var.h);
                this.t1 = null;
                this.o1 = false;
            }
            if (z5 || r47Var4.H) {
                r47Var4.H = false;
                TLRPC.Message message5 = r47Var4.k;
                boolean z6 = (message5 == null || (tL_messageReactions = message5.reactions) == null || !tL_messageReactions.reactions_as_tags) ? false : true;
                boolean N5 = r47Var4.N5();
                x49 x49Var = this.F0;
                if (N5) {
                    x49Var.r(r47Var4, z6, vnbVar3);
                } else {
                    x49Var.r(null, false, vnbVar3);
                }
            }
            int i11 = r47Var4.D;
            ueb uebVar = this.P0;
            if (i11 == 32) {
                if (uebVar == null) {
                    ueb uebVar2 = new ueb(i10, this, vnbVar3);
                    this.P0 = uebVar2;
                    if (this.j2) {
                        uebVar2.d.M(uebVar2.b);
                    }
                }
                this.P0.c(r47Var4);
            } else if (uebVar != null) {
                uebVar.d.M(null);
                this.P0 = null;
            }
            if (this.I0 == null && (message = r47Var4.k) != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                yua yuaVar = new yua(i10, vnbVar3, this);
                this.I0 = yuaVar;
                if (this.j2) {
                    yuaVar.a();
                }
            }
            yua yuaVar2 = this.I0;
            if (yuaVar2 != null) {
                yuaVar2.f(r47Var4, !z5);
            }
            ImageReceiver imageReceiver5 = this.J;
            imageReceiver5.N(0);
            imageReceiver5.e();
            if (r47Var4.D != 22) {
                this.K = null;
            }
            if (r47Var4.J0 != -1) {
                iye.b(this, 0.02f, 1.2f);
                this.l2 = Math.max(hl.L(250.0f), kg5.a(r47Var4.v, (TextPaint) Q("paintChatActionText")));
                gs8 P0 = wf1.P0(r47Var4.v);
                if (P0 != null) {
                    P0.g = this;
                }
            } else {
                setStateListAnimator(null);
                this.l2 = 0;
            }
            boolean y4 = r47Var4.y4();
            rb0 rb0Var = this.M;
            if (y4) {
                TLRPC.User X1 = uc7.s1(i10).X1(Long.valueOf(r47Var4.k.media.user_id));
                rb0Var.q(X1);
                TL_stories.StoryItem storyItem = r47Var4.k.media.storyItem;
                if (storyItem == null || !storyItem.noforwards) {
                    t6b.x(imageReceiver5, storyItem);
                } else {
                    imageReceiver5.V(X1, rb0Var, null, true, 0, true);
                }
                imageReceiver5.q0((int) (this.i1 / 2.0f));
            } else {
                int i12 = r47Var4.D;
                RadialProgress2 radialProgress22 = this.K1;
                if (i12 != 22) {
                    ImageReceiver imageReceiver6 = imageReceiver5;
                    if (i12 == 21) {
                        imageReceiver6.q0((int) (this.i1 / 2.0f));
                        imageReceiver6.v0 = true;
                        imageReceiver6.h1 = null;
                        TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) r47Var4.k.action;
                        TLRPC.VideoSize x = xb4.x(1000, tL_messageActionSuggestProfilePhoto.photo.video_sizes);
                        ArrayList<TLRPC.VideoSize> arrayList3 = tL_messageActionSuggestProfilePhoto.photo.video_sizes;
                        jn5 j = (arrayList3 == null || arrayList3.isEmpty()) ? null : jn5.j(x, tL_messageActionSuggestProfilePhoto.photo);
                        TLRPC.Photo photo = r47Var4.k.action.photo;
                        if (r47Var4.I1 == null) {
                            int size = r47Var4.p0.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                photoSize2 = (TLRPC.PhotoSize) r47Var4.p0.get(i13);
                                if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                    break;
                                }
                            }
                        }
                        photoSize2 = null;
                        TLRPC.PhotoSize w = xb4.w(r47Var4.p0, 1000, false, null, false);
                        if (w == null) {
                            vnbVar = vnbVar3;
                            i = i10;
                            z3 = false;
                            f = 1.0f;
                            radialProgress2 = radialProgress22;
                        } else if (x != null) {
                            i = i10;
                            z3 = false;
                            vnbVar = vnbVar3;
                            f = 1.0f;
                            radialProgress2 = radialProgress22;
                            imageReceiver6.Y(j, "g", jn5.i(w, photo), "150_150", jn5.f(photoSize2, r47Var4.n0), "50_50_b", r47Var4.I1, 0L, null, r47Var, 0);
                            r47Var4 = r47Var;
                            imageReceiver6 = imageReceiver6;
                        } else {
                            vnbVar = vnbVar3;
                            i = i10;
                            z3 = false;
                            f = 1.0f;
                            radialProgress2 = radialProgress22;
                            imageReceiver6.Z(jn5.i(w, photo), "150_150", jn5.f(photoSize2, r47Var4.n0), "50_50_b", r47Var4.I1, 0L, null, r47Var4, 0);
                        }
                        imageReceiver6.v0 = z3;
                        zn5 zn5Var = (zn5) uc7.s1(i).m4.get(r47Var4.k.local_id);
                        if (zn5Var == null || zn5Var.X == f) {
                            boolean z7 = !z5;
                            radialProgress2.o(z7, f);
                            radialProgress2.setIcon(4, z7, z7);
                        } else {
                            boolean z8 = !z5;
                            radialProgress2.setIcon(3, z8, z8);
                        }
                    } else {
                        vnbVar = vnbVar3;
                        i = i10;
                        byte b2 = 2;
                        if (i12 == 31 || i12 == 33 || i12 == 30 || i12 == 18 || i12 == 25 || i12 == 35) {
                            imageReceiver6.q0(0);
                            TLRPC.MessageAction messageAction2 = r47Var4.k.action;
                            if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                                long g = uc7.s1(i).k4.O.g(TimeUnit.SECONDS);
                                if (tL_messageActionNoForwardsRequest.expired) {
                                    imageReceiver = imageReceiver6;
                                } else {
                                    imageReceiver = imageReceiver6;
                                    if (r47Var4.k.date + g >= ConnectionsManager.getInstance(i).getCurrentTime()) {
                                        z2 = false;
                                        this.a2 = z2;
                                        if (!r47Var4.N3() || tL_messageActionNoForwardsRequest.expired || this.a2) {
                                            i7 = 8;
                                        } else {
                                            ArrayList arrayList4 = new ArrayList();
                                            i7 = 8;
                                            arrayList4.add(new gq0[]{new iq0(7, 2131751379, org.telegram.messenger.beta.R.drawable.filled_bot_decline_24), new iq0(8, 2131751380, org.telegram.messenger.beta.R.drawable.filled_bot_approve_24)});
                                            this.Z1 = new ed((gq0[][]) arrayList4.toArray(new gq0[arrayList4.size()][]), 0, b2);
                                        }
                                        document = null;
                                        str2 = null;
                                        r47Var2 = null;
                                        r47Var3 = null;
                                        i2 = i7;
                                        i3 = i;
                                        vnbVar2 = vnbVar;
                                    }
                                }
                                z2 = true;
                                this.a2 = z2;
                                if (r47Var4.N3()) {
                                }
                                i7 = 8;
                                document = null;
                                str2 = null;
                                r47Var2 = null;
                                r47Var3 = null;
                                i2 = i7;
                                i3 = i;
                                vnbVar2 = vnbVar;
                            } else {
                                imageReceiver = imageReceiver6;
                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                    TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                                    TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                    if (starGift != null) {
                                        document5 = atb.e(starGift);
                                        i2 = 8;
                                        px4 px4Var = this.T0;
                                        if (px4Var == null) {
                                            vnbVar2 = vnbVar;
                                            px4Var = new px4(this, vnbVar2, false);
                                            this.T0 = px4Var;
                                        } else {
                                            vnbVar2 = vnbVar;
                                        }
                                        px4Var.d((TL_stars.starGiftAttributeBackdrop) jxa.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                        this.T0.e((TL_stars.starGiftAttributePattern) jxa.i(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                    } else {
                                        i2 = 8;
                                        vnbVar2 = vnbVar;
                                        document5 = null;
                                    }
                                    this.a2 = tL_messageActionStarGiftPurchaseOffer.expires_at < ConnectionsManager.getInstance(i).getCurrentTime();
                                    if (!r47Var4.N3() && !tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined && !this.a2) {
                                        ArrayList arrayList5 = new ArrayList();
                                        arrayList5.add(new gq0[]{new iq0(5, 2131749676, org.telegram.messenger.beta.R.drawable.filled_bot_decline_24), new iq0(6, 2131749686, org.telegram.messenger.beta.R.drawable.filled_bot_approve_24)});
                                        this.Z1 = new ed((gq0[][]) arrayList5.toArray(new gq0[arrayList5.size()][]), 0, b2);
                                    }
                                    document = document5;
                                    i3 = i;
                                } else {
                                    i2 = 8;
                                    vnbVar2 = vnbVar;
                                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftOnchainOffer) {
                                        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) messageAction2;
                                        TL_stars.StarGift starGift2 = tL_messageActionStarGiftOnchainOffer.gift;
                                        if (starGift2 != null) {
                                            document4 = atb.e(starGift2);
                                            px4 px4Var2 = this.T0;
                                            if (px4Var2 == null) {
                                                px4Var2 = new px4(this, vnbVar2, false);
                                                this.T0 = px4Var2;
                                            }
                                            px4Var2.d((TL_stars.starGiftAttributeBackdrop) jxa.i(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                            this.T0.e((TL_stars.starGiftAttributePattern) jxa.i(starGift2.attributes, TL_stars.starGiftAttributePattern.class));
                                        } else {
                                            document4 = null;
                                        }
                                        this.c2 = tL_messageActionStarGiftOnchainOffer;
                                        i3 = i;
                                        boolean i14 = vs7.i(i3, tL_messageActionStarGiftOnchainOffer);
                                        this.d2 = i14;
                                        this.e2 = -1;
                                        this.a2 = !i14;
                                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                                            vx4 vx4Var = this.g2;
                                            if (vx4Var == null) {
                                                vx4Var = new vx4(this, 0.85f);
                                                this.g2 = vx4Var;
                                            }
                                            if (!tL_messageActionStarGiftOnchainOffer.buyer && (tL_messageActionStarGiftOnchainOffer.accepted || tL_messageActionStarGiftOnchainOffer.settled)) {
                                                vx4Var.f(-698031);
                                                this.g2.g(10, ob6.M0(2131749538, null), false);
                                            } else {
                                                vx4Var.e((TL_stars.starGiftAttributeBackdrop) jxa.i(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class), false, false);
                                                this.g2.g(9, "#".concat(ob6.E(((TL_stars.TL_starGiftUnique) starGift2).num, ',')), true);
                                            }
                                        }
                                    } else {
                                        i3 = i;
                                        if (!(messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme)) {
                                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                                TL_stars.StarGift starGift3 = ((TLRPC.TL_messageActionStarGift) messageAction2).gift;
                                                if (starGift3 != null) {
                                                    document3 = starGift3.sticker;
                                                    r47Var3 = r47Var4;
                                                    document = document3;
                                                    str2 = null;
                                                    r47Var2 = null;
                                                }
                                                document3 = null;
                                                r47Var3 = r47Var4;
                                                document = document3;
                                                str2 = null;
                                                r47Var2 = null;
                                            } else {
                                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                                                    if (tL_messageActionStarGiftUnique.refunded) {
                                                        TL_stars.StarGift starGift4 = tL_messageActionStarGiftUnique.gift;
                                                        if (starGift4 != null) {
                                                            document3 = starGift4.getDocument();
                                                            r47Var3 = r47Var4;
                                                            document = document3;
                                                            str2 = null;
                                                            r47Var2 = null;
                                                        }
                                                        document3 = null;
                                                        r47Var3 = r47Var4;
                                                        document = document3;
                                                        str2 = null;
                                                        r47Var2 = null;
                                                    }
                                                }
                                                if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                                    str = yac.h(i3).d0;
                                                    if (str == null) {
                                                        ls6.d0(i3).E();
                                                        return;
                                                    }
                                                } else {
                                                    str = yac.h(i3).c0;
                                                    if (str == null) {
                                                        ls6.d0(i3).B();
                                                        return;
                                                    }
                                                }
                                                String str5 = str;
                                                TLRPC.TL_messages_stickerSet q0 = ls6.d0(i3).q0(str5);
                                                ?? r4 = q0;
                                                if (q0 == null) {
                                                    r4 = ls6.d0(i3).o0(str5);
                                                }
                                                if (r4 != 0) {
                                                    TLRPC.MessageAction messageAction3 = r47Var4.k.action;
                                                    int i15 = messageAction3.months;
                                                    if (r47Var4.D == 30) {
                                                        String str6 = "3⃣";
                                                        if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                                            long j2 = messageAction3.cryptoAmount;
                                                            if (j2 > 10000000000L) {
                                                                if (j2 <= 50000000000L) {
                                                                    str6 = "1⃣";
                                                                }
                                                                i4 = 0;
                                                                while (true) {
                                                                    if (i4 < r4.packs.size()) {
                                                                        break;
                                                                    }
                                                                    TLRPC.TL_stickerPack tL_stickerPack = r4.packs.get(i4);
                                                                    if (TextUtils.equals(tL_stickerPack.emoticon, str6) && !tL_stickerPack.documents.isEmpty()) {
                                                                        long longValue = tL_stickerPack.documents.get(0).longValue();
                                                                        for (int i16 = 0; i16 < r4.documents.size(); i16++) {
                                                                            document2 = r4.documents.get(i16);
                                                                            if (document2 != null && document2.id == longValue) {
                                                                                break;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i4++;
                                                                    }
                                                                }
                                                                document2 = null;
                                                            }
                                                            str6 = "2⃣";
                                                            i4 = 0;
                                                            while (true) {
                                                                if (i4 < r4.packs.size()) {
                                                                }
                                                                i4++;
                                                            }
                                                            document2 = null;
                                                        } else {
                                                            long j3 = messageAction3 instanceof TLRPC.TL_messageActionGiftStars ? ((TLRPC.TL_messageActionGiftStars) messageAction3).stars : ((TLRPC.TL_messageActionPrizeStars) messageAction3).stars;
                                                            if (j3 > 1000) {
                                                                if (j3 >= 2500) {
                                                                    str6 = "4⃣";
                                                                }
                                                                i4 = 0;
                                                                while (true) {
                                                                    if (i4 < r4.packs.size()) {
                                                                    }
                                                                    i4++;
                                                                }
                                                                document2 = null;
                                                            }
                                                            str6 = "2⃣";
                                                            i4 = 0;
                                                            while (true) {
                                                                if (i4 < r4.packs.size()) {
                                                                }
                                                                i4++;
                                                            }
                                                            document2 = null;
                                                        }
                                                    } else {
                                                        String str7 = (String) y2.get(Integer.valueOf(i15));
                                                        ArrayList<TLRPC.TL_stickerPack> arrayList6 = r4.packs;
                                                        int size2 = arrayList6.size();
                                                        int i17 = 0;
                                                        TLRPC.Document document6 = null;
                                                        while (i17 < size2) {
                                                            TLRPC.TL_stickerPack tL_stickerPack2 = arrayList6.get(i17);
                                                            i17++;
                                                            TLRPC.TL_stickerPack tL_stickerPack3 = tL_stickerPack2;
                                                            if (Objects.equals(tL_stickerPack3.emoticon, str7)) {
                                                                ArrayList<Long> arrayList7 = tL_stickerPack3.documents;
                                                                int size3 = arrayList7.size();
                                                                TLRPC.Document document7 = document6;
                                                                int i18 = 0;
                                                                while (true) {
                                                                    if (i18 >= size3) {
                                                                        str3 = str7;
                                                                        arrayList = arrayList6;
                                                                        break;
                                                                    }
                                                                    Long l2 = arrayList7.get(i18);
                                                                    i18++;
                                                                    long longValue2 = l2.longValue();
                                                                    ArrayList<TLRPC.Document> arrayList8 = r4.documents;
                                                                    int size4 = arrayList8.size();
                                                                    str3 = str7;
                                                                    int i19 = 0;
                                                                    while (true) {
                                                                        if (i19 >= size4) {
                                                                            arrayList = arrayList6;
                                                                            break;
                                                                        }
                                                                        TLRPC.Document document8 = arrayList8.get(i19);
                                                                        int i20 = i19 + 1;
                                                                        int i21 = size4;
                                                                        TLRPC.Document document9 = document8;
                                                                        arrayList = arrayList6;
                                                                        if (document9.id == longValue2) {
                                                                            document7 = document9;
                                                                            break;
                                                                        } else {
                                                                            arrayList6 = arrayList;
                                                                            size4 = i21;
                                                                            i19 = i20;
                                                                        }
                                                                    }
                                                                    if (document7 != null) {
                                                                        break;
                                                                    }
                                                                    str7 = str3;
                                                                    arrayList6 = arrayList;
                                                                }
                                                                document6 = document7;
                                                            } else {
                                                                str3 = str7;
                                                                arrayList = arrayList6;
                                                            }
                                                            if (document6 != null) {
                                                                break;
                                                            }
                                                            str7 = str3;
                                                            arrayList6 = arrayList;
                                                        }
                                                        document2 = document6;
                                                    }
                                                    if (document2 != null || r4.documents.isEmpty()) {
                                                        r47Var3 = r4;
                                                        document = document2;
                                                    } else {
                                                        document = r4.documents.get(0);
                                                        r47Var3 = r4;
                                                    }
                                                    str2 = str5;
                                                    r47Var2 = r47Var3;
                                                } else {
                                                    r47Var2 = r4;
                                                    str2 = str5;
                                                    document = null;
                                                    r47Var3 = null;
                                                }
                                            }
                                            if (!this.l0 && this.f0 && this.j0 && (this.g0 || this.h0 || this.i0)) {
                                                this.m0 = hl.L(33.0f);
                                                byb bybVar2 = this.o0;
                                                if (bybVar2 == null) {
                                                    bybVar2 = new byb(i3, this, vnbVar2, true);
                                                    this.o0 = bybVar2;
                                                    bybVar2.s = new wk1(this, (byte) 3);
                                                }
                                                if (!bybVar2.e(this.Q0)) {
                                                    this.o0.b();
                                                    this.o0 = null;
                                                    this.m0 = 0;
                                                } else if (this.j2) {
                                                    this.o0.a();
                                                }
                                                i8 = 0;
                                            } else {
                                                bybVar = this.o0;
                                                if (bybVar != null) {
                                                    bybVar.b();
                                                    this.o0 = null;
                                                }
                                                i8 = 0;
                                                this.m0 = 0;
                                            }
                                            paddingTop = getPaddingTop();
                                            i9 = this.m0;
                                            if (paddingTop != i9) {
                                                setPadding(i8, i9, i8, i8);
                                            }
                                            this.U1.setVisibility((W(r47Var) || T()) ? i2 : i8);
                                            ro4.b(r47Var4);
                                            requestLayout();
                                        }
                                        TL_stars.StarGift starGift5 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme).gift;
                                        if (starGift5 != null) {
                                            document4 = atb.e(starGift5);
                                            px4 px4Var3 = this.T0;
                                            if (px4Var3 == null) {
                                                px4Var3 = new px4(this, vnbVar2, false);
                                                this.T0 = px4Var3;
                                            }
                                            px4Var3.d((TL_stars.starGiftAttributeBackdrop) jxa.i(starGift5.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                            this.T0.e((TL_stars.starGiftAttributePattern) jxa.i(starGift5.attributes, TL_stars.starGiftAttributePattern.class));
                                        } else {
                                            document4 = null;
                                        }
                                    }
                                    document = document4;
                                }
                                str2 = null;
                                r47Var2 = null;
                                r47Var3 = null;
                            }
                            ed edVar = this.Z1;
                            if (edVar != null) {
                                int length = ((gq0[][]) edVar.c).length;
                                int i22 = 0;
                                while (i22 < length) {
                                    int length2 = ((gq0[][]) this.Z1.c)[i22].length;
                                    int i23 = 0;
                                    while (i23 < length2) {
                                        gq0 gq0Var = ((gq0[][]) this.Z1.c)[i22][i23];
                                        wo0 wo0Var = new wo0(new wk1(this, (byte) 2));
                                        wo0Var.j = (iq0) gq0Var;
                                        int c = gq0Var.c();
                                        if (c != 0) {
                                            Drawable drawable = getResources().getDrawable(c);
                                            wo0Var.t = drawable;
                                            i5 = length;
                                            i6 = i22;
                                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                        } else {
                                            i5 = length;
                                            i6 = i22;
                                        }
                                        wo0Var.f = hl.L(40.0f);
                                        int i24 = wo0Var.g | 8;
                                        wo0Var.g = i24;
                                        int b3 = vsd.b(i24, 1, i23 == 0);
                                        wo0Var.g = b3;
                                        wo0Var.g = vsd.b(b3, 2, i23 == 1);
                                        wo0Var.h = new pkb(gq0Var.d(), (TextPaint) Q("paintChatBotButton"));
                                        arrayList2.add(wo0Var);
                                        i23++;
                                        length = i5;
                                        i22 = i6;
                                    }
                                    i22++;
                                    length = length;
                                }
                            }
                            this.M1 = r47Var4.n1;
                            this.I1 = document;
                            if (document != null) {
                                ImageReceiver imageReceiver7 = imageReceiver;
                                imageReceiver7.v0 = true;
                                int i25 = r47Var4.D;
                                if (i25 != 31 && i25 != 37 && i25 != 33) {
                                    imageReceiver7.h1 = this.O1;
                                }
                                this.J1 = null;
                                int i26 = 0;
                                while (true) {
                                    if (i26 >= document.video_thumbs.size()) {
                                        break;
                                    }
                                    if ("f".equals(document.video_thumbs.get(i26).type)) {
                                        this.J1 = document.video_thumbs.get(i26);
                                        break;
                                    }
                                    i26++;
                                }
                                if (z5 || r47Var4.D != 18) {
                                    ggb f3 = lp3.f(document, aob.a7, 0.3f, null);
                                    imageReceiver7.M(0);
                                    jn5 b4 = jn5.b(document);
                                    Locale locale = Locale.US;
                                    imageReceiver7.d0(b4, uh9.k(r47Var4.m1, "160_160_nr_messageId="), f3, "tgs", r47Var3, 1);
                                }
                            } else if (str2 != null) {
                                ls6.d0(i3).d1(str2, false, r47Var2 == null);
                            }
                            if (!this.l0) {
                            }
                            bybVar = this.o0;
                            if (bybVar != null) {
                            }
                            i8 = 0;
                            this.m0 = 0;
                            paddingTop = getPaddingTop();
                            i9 = this.m0;
                            if (paddingTop != i9) {
                            }
                            this.U1.setVisibility((W(r47Var) || T()) ? i2 : i8);
                            ro4.b(r47Var4);
                            requestLayout();
                        }
                        if (i12 == 37) {
                            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(((TLRPC.TL_messageActionChangeCommunity) r47Var4.k.action).community_id));
                            imageReceiver6.v0 = true;
                            imageReceiver6.h1 = null;
                            imageReceiver6.q0(hl.L(14.0f));
                            imageReceiver6.N(1);
                            rb0Var.p(M0);
                            imageReceiver6.U(M0, new ee1(getContext(), hl.L(14.0f)), M0);
                        } else if (i12 == 11) {
                            imageReceiver6.v0 = true;
                            imageReceiver6.h1 = null;
                            imageReceiver6.q0(hl.u / 2);
                            imageReceiver6.N(1);
                            rb0Var.j(r47.B0(r47Var4.k), null, null, null);
                            if (r47Var4.k.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                                imageReceiver2 = imageReceiver6;
                                imageReceiver2.d0(null, null, rb0Var, null, r47Var4, 0);
                            } else {
                                imageReceiver2 = imageReceiver6;
                                if (r47Var4.I1 == null) {
                                    int size5 = r47Var4.p0.size();
                                    for (int i27 = 0; i27 < size5; i27++) {
                                        photoSize = (TLRPC.PhotoSize) r47Var4.p0.get(i27);
                                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                            break;
                                        }
                                    }
                                }
                                photoSize = null;
                                TLRPC.PhotoSize w2 = xb4.w(r47Var4.p0, 640, false, null, false);
                                if (w2 != null) {
                                    TLRPC.Photo photo2 = r47Var4.k.action.photo;
                                    if (!photo2.video_sizes.isEmpty()) {
                                        boolean z9 = xea.a;
                                        if (i86.e(2048)) {
                                            TLRPC.VideoSize x2 = xb4.x(1000, photo2.video_sizes);
                                            if (r47Var4.z0 || lq3.q(i).c(4, x2.size)) {
                                                videoSize = x2;
                                                if (videoSize == null) {
                                                    imageReceiver2.Z(jn5.j(videoSize, photo2), "g", jn5.f(photoSize, r47Var4.n0), "50_50_b", r47Var4.I1, 0L, null, r47Var4, 1);
                                                } else {
                                                    imageReceiver2.Z(jn5.f(w2, r47Var4.n0), "150_150", jn5.f(photoSize, r47Var4.n0), "50_50_b", r47Var4.I1, 0L, null, r47Var4, 1);
                                                }
                                            } else {
                                                this.y0 = jn5.j(x2, photo2);
                                                lq3.q(i).a(xb4.r(null, x2), r47Var4, this);
                                            }
                                        }
                                    }
                                    videoSize = null;
                                    if (videoSize == null) {
                                    }
                                } else {
                                    imageReceiver3 = imageReceiver2;
                                    imageReceiver3.g0(rb0Var);
                                    imageReceiver3.v0(!PhotoViewer.P0(r47Var4), false);
                                }
                            }
                            imageReceiver3 = imageReceiver2;
                            imageReceiver3.v0(!PhotoViewer.P0(r47Var4), false);
                        } else {
                            imageReceiver6.v0 = true;
                            imageReceiver6.h1 = null;
                            imageReceiver6.g0(null);
                        }
                    }
                    i3 = i;
                    vnbVar2 = vnbVar;
                    i2 = 8;
                    if (!this.l0) {
                    }
                    bybVar = this.o0;
                    if (bybVar != null) {
                    }
                    i8 = 0;
                    this.m0 = 0;
                    paddingTop = getPaddingTop();
                    i9 = this.m0;
                    if (paddingTop != i9) {
                    }
                    this.U1.setVisibility((W(r47Var) || T()) ? i2 : i8);
                    ro4.b(r47Var4);
                    requestLayout();
                }
                if (r47Var4.I1 == null) {
                    int size6 = r47Var4.p0.size();
                    for (int i28 = 0; i28 < size6 && !(((TLRPC.PhotoSize) r47Var4.p0.get(i28)) instanceof TLRPC.TL_photoStrippedSize); i28++) {
                    }
                }
                TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = r47Var4.L1;
                if (tL_channelAdminLogEvent != null) {
                    TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                        wallPaper = ((TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction).new_value;
                        if (TextUtils.isEmpty(af2.h(wallPaper))) {
                            boolean a = vnbVar3 != null ? vnbVar3.a() : aob.I.o();
                            imageReceiver5.f();
                            String h = af2.h(wallPaper);
                            int i29 = mm8.C0;
                            ez3 g2 = af2.e(i10).g(dpb.d(h));
                            Drawable r0 = g2 == null ? aob.r0() : mm8.f(i10, g2, a);
                            this.K = r0;
                            if (r0 != null) {
                                r0.setCallback(this);
                            }
                            imageReceiver4 = imageReceiver5;
                            f2 = 1.0f;
                        } else if (wallPaper != null) {
                            String str8 = wallPaper.uploadingImage;
                            if (str8 != null) {
                                jn5 g3 = jn5.g(str8);
                                StringBuilder sb = new StringBuilder("150_150_wallpaper");
                                f2 = 1.0f;
                                sb.append(wallPaper.id);
                                sb.append(g82.e(wallPaper.settings));
                                imageReceiver5.Z(g3, sb.toString(), null, null, g82.b(wallPaper), 0L, null, wallPaper, 1);
                                this.K = null;
                                imageReceiver4 = imageReceiver5;
                            } else {
                                TLRPC.WallPaper wallPaper2 = wallPaper;
                                f2 = 1.0f;
                                TLObject tLObject = r47Var4.n0;
                                imageReceiver5.Z(jn5.b(tLObject instanceof TLRPC.Document ? (TLRPC.Document) tLObject : wallPaper2.document), "150_150_wallpaper" + wallPaper2.id + g82.e(wallPaper2.settings), null, null, g82.b(wallPaper2), 0L, null, wallPaper2, 1);
                                imageReceiver4 = imageReceiver5;
                                this.K = null;
                            }
                        } else {
                            imageReceiver4 = imageReceiver5;
                            f2 = 1.0f;
                            this.K = null;
                        }
                        imageReceiver4.q0((int) (this.i1 / 2.0f));
                        if (R(r47Var) != f2) {
                            boolean z10 = !z5;
                            radialProgress22.o(z10, f2);
                            radialProgress22.setIcon(4, z10, z10);
                        } else {
                            boolean z11 = !z5;
                            radialProgress22.setIcon(3, z11, z11);
                        }
                    }
                }
                TLRPC.Message message6 = r47Var4.k;
                wallPaper = (message6 == null || (messageAction = message6.action) == null) ? null : messageAction.wallpaper;
                if (TextUtils.isEmpty(af2.h(wallPaper))) {
                }
                imageReceiver4.q0((int) (this.i1 / 2.0f));
                if (R(r47Var) != f2) {
                }
            }
            vnbVar2 = vnbVar3;
            i3 = i10;
            i2 = 8;
            if (!this.l0) {
            }
            bybVar = this.o0;
            if (bybVar != null) {
            }
            i8 = 0;
            this.m0 = 0;
            paddingTop = getPaddingTop();
            i9 = this.m0;
            if (paddingTop != i9) {
            }
            this.U1.setVisibility((W(r47Var) || T()) ? i2 : i8);
            ro4.b(r47Var4);
            requestLayout();
        }
    }

    @Override // jf0, android.view.View
    public final void invalidate() {
        super.invalidate();
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.u2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.t2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // pk5
    public final boolean j() {
        return false;
    }

    public final void j0(float f, int i) {
        this.x0 = true;
        this.w0 = i;
        this.u0 = f;
        this.v0 = 0.0f;
    }

    public final void k0() {
        final byte b = 1;
        final byte b2 = 0;
        if (this.c2 != null && this.d2 && this.Q0 != null) {
            boolean b0 = b0();
            boolean z = this.f2;
            if (b0 != z) {
                this.f2 = !z;
                final r47 r47Var = this.Q0;
                post(new Runnable(this) { // from class: xk1
                    public final /* synthetic */ dl1 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        r47 r47Var2 = r47Var;
                        dl1 dl1Var = this.b;
                        switch (b3) {
                            case 0:
                                if (dl1Var.Q0 == r47Var2) {
                                    dl1Var.i0(r47Var2, true);
                                    dl1Var.requestLayout();
                                    break;
                                }
                                break;
                            default:
                                if (dl1Var.Q0 == r47Var2) {
                                    dl1Var.i0(r47Var2, true);
                                    dl1Var.requestLayout();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer == null || !this.d2 || this.Q0 == null || this.t1 == null) {
            return;
        }
        HashMap hashMap = vs7.a;
        int i = tL_messageActionStarGiftOnchainOffer.expires_at;
        int i2 = this.I;
        int max = Math.max(0, i - ConnectionsManager.getInstance(i2).getCurrentTime());
        int i3 = this.e2;
        if (max <= 0) {
            if (i3 != 0) {
                this.e2 = 0;
                this.d2 = vs7.i(i2, this.c2);
                final r47 r47Var2 = this.Q0;
                post(new Runnable(this) { // from class: xk1
                    public final /* synthetic */ dl1 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b;
                        r47 r47Var22 = r47Var2;
                        dl1 dl1Var = this.b;
                        switch (b3) {
                            case 0:
                                if (dl1Var.Q0 == r47Var22) {
                                    dl1Var.i0(r47Var22, true);
                                    dl1Var.requestLayout();
                                    break;
                                }
                                break;
                            default:
                                if (dl1Var.Q0 == r47Var22) {
                                    dl1Var.i0(r47Var22, true);
                                    dl1Var.requestLayout();
                                    break;
                                }
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (max != i3) {
            this.e2 = max;
            this.t1.a(this.t1.c, this.G1, c0(vs7.d(this.c2), this.c2));
        }
        postInvalidateDelayed(1016 - (System.currentTimeMillis() % 1000));
    }

    public final void l0(boolean z) {
        if (getMeasuredWidth() != 0) {
            G(getMeasuredWidth(), this.S0);
            invalidate();
        }
        if (this.D0) {
            y();
        } else if (z) {
            hl.c3(new wk1(this, (byte) 5));
        } else {
            requestLayout();
        }
    }

    @Override // pk5
    public final boolean m() {
        return false;
    }

    @Override // pk5
    public final boolean n() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        al1 al1Var;
        super.onAttachedToWindow();
        this.j2 = true;
        this.J.I();
        setStarsPaused(false);
        this.s0 = hm.update(0, this, (!this.s || (al1Var = this.g1) == null || al1Var.h()) ? false : true, this.s0, this.N);
        bl1 bl1Var = this.t1;
        if (bl1Var != null) {
            bl1Var.h = hm.update(0, (View) bl1Var.i, false, bl1Var.h, bl1Var.d);
        }
        int i = this.I;
        jn7.f(i).b(this, jn7.Y2);
        jn7.f(i).b(this, jn7.Z2);
        jn7.f(i).b(this, jn7.H3);
        jn7.f(i).b(this, jn7.y0);
        jn7.f(i).b(this, jn7.d4);
        jn7.e().b(this, jn7.l4);
        jn7.e().b(this, jn7.L3);
        r47 r47Var = this.Q0;
        if (r47Var != null && r47Var.D == 21) {
            i0(r47Var, true);
        }
        yua yuaVar = this.I0;
        if (yuaVar != null) {
            yuaVar.a();
        }
        x49 x49Var = this.F0;
        ArrayList arrayList = x49Var.s;
        x49Var.D = true;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((u49) arrayList.get(i2)).a();
        }
        byb bybVar = this.o0;
        if (bybVar != null) {
            bybVar.a();
        }
        ueb uebVar = this.P0;
        if (uebVar != null) {
            uebVar.d.M(uebVar.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j2 = false;
        int i = this.I;
        lq3.q(i).v(this);
        this.J.K();
        setStarsPaused(true);
        this.D0 = false;
        hm.release(this, this.s0);
        bl1 bl1Var = this.t1;
        if (bl1Var != null) {
            hm.release(bl1Var.i, bl1Var.h);
        }
        jn7.f(i).n(this, jn7.Y2);
        jn7.f(i).n(this, jn7.Z2);
        jn7.f(i).n(this, jn7.H3);
        jn7.f(i).n(this, jn7.y0);
        jn7.f(i).n(this, jn7.d4);
        jn7.e().n(this, jn7.l4);
        jn7.e().n(this, jn7.L3);
        this.e0.g();
        this.x2.a = false;
        yua yuaVar = this.I0;
        if (yuaVar != null) {
            yuaVar.S = false;
            yuaVar.d.K();
            yuaVar.e.b();
            iw4 iw4Var = yuaVar.y;
            iw4Var.d.K();
            hm.release((View) null, iw4Var.q);
            iw4Var.q = null;
        }
        this.F0.p();
        byb bybVar = this.o0;
        if (bybVar != null) {
            bybVar.b();
        }
        ueb uebVar = this.P0;
        if (uebVar != null) {
            uebVar.d.M(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0602, code lost:
    
        if (r3 == 33) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0de3, code lost:
    
        if (vs7.l(r37, r1.offer_id) == false) goto L395;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0549 A[LOOP:1: B:109:0x0547->B:110:0x0549, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0bd3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0bdd  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0c23  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0d25  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0d41  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0dd3  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0e66  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0e98  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0ed3  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0f38  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0f05  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0f0f  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0f07  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0ed8  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0eae  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0e0e  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0d2f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0bf1  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x068f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        TextPaint textPaint;
        int i3;
        ArrayList arrayList;
        int i4;
        RadialProgress2 radialProgress2;
        int i5;
        dl1 dl1Var;
        float f;
        int L;
        int i6;
        int i7;
        float L2;
        StaticLayout staticLayout;
        int i8;
        Canvas canvas2;
        float f2;
        float f3;
        float f4;
        pkb pkbVar;
        bl1 bl1Var;
        StaticLayout staticLayout2;
        vnb vnbVar;
        RectF rectF;
        boolean z;
        float i9;
        Paint Q;
        boolean a;
        ColorMatrixColorFilter colorMatrixColorFilter;
        ColorMatrix colorMatrix;
        int i10;
        float f5;
        float f6;
        dl1 dl1Var2;
        int i11;
        pkb pkbVar2;
        al1 al1Var;
        int size;
        int i12;
        Canvas canvas3 = canvas;
        canvas3.save();
        canvas3.translate(this.k0 / 2.0f, getPaddingTop());
        r47 r47Var = this.Q0;
        float d = this.r1.d(!this.p1);
        int i13 = this.i1;
        boolean T = T();
        q6b q6bVar = this.e0;
        TextPaint textPaint2 = this.G1;
        ImageReceiver imageReceiver = this.J;
        if (!T && this.P0 == null && W(r47Var)) {
            this.i1 = this.j1 - hl.L(106.0f);
            if (Y()) {
                i13 = P(r47Var);
                float f7 = (this.W - i13) / 2.0f;
                float L3 = hl.L(16.0f) + hl.L(4.0f) + this.T + this.P;
                if (r47Var.y4()) {
                    q6bVar.d = r47Var.k.media.storyItem;
                }
                float f8 = i13;
                q6bVar.F.set(f7, L3, f7 + f8, f8 + L3);
                int i14 = r47Var.D;
                if (i14 == 31 || i14 == 33 || i14 == 34 || i14 == 35) {
                    f7 += hl.L(10.0f);
                    L3 += hl.L(10.0f);
                    i13 -= hl.L(20.0f);
                }
                if (r47Var.D == 37) {
                    f7 += hl.L(2.0f);
                }
                imageReceiver.i0(f7, L3, Math.max(0, i13), Math.max(0, i13));
                int i15 = r47Var.D;
                if (i15 == 31 || i15 == 33 || i15 == 34 || i15 == 35) {
                    i13 = hl.L(20.0f) + i13;
                }
            } else {
                int i16 = r47Var.D;
                if (i16 == 11) {
                    int i17 = this.W;
                    float f9 = this.i1;
                    imageReceiver.i0((i17 - r3) / 2.0f, (this.j1 * 0.075f) + this.T + this.P, f9, f9);
                } else if (i16 == 25) {
                    i13 = (int) (this.i1 * (hl.O1() ? 1.0f : 1.2f));
                    float f10 = i13;
                    imageReceiver.i0((this.W - i13) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - hl.L(22.0f), f10, f10);
                } else if (r47Var.r4()) {
                    float f11 = i13;
                    imageReceiver.i0((this.W - i13) / 2.0f, (this.j1 * 0.075f) + this.T + this.P + hl.L(2.0f), f11, f11);
                } else {
                    int i18 = r47Var.D;
                    int i19 = this.i1;
                    if (i18 == 30) {
                        i13 = (int) (i19 * 1.1f);
                        TLRPC.Message message = r47Var.k;
                        if (message == null || (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                            float f12 = i13;
                            imageReceiver.i0((this.W - i13) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - hl.L(12.0f), f12, f12);
                        } else {
                            float f13 = i13;
                            imageReceiver.i0((this.W - i13) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - hl.L(22.0f), f13, f13);
                        }
                    } else {
                        i13 = (int) (i19 * 1.0f);
                        float f14 = i13;
                        imageReceiver.i0((this.W - i13) / 2.0f, ((this.j1 * 0.075f) + (this.T + this.P)) - hl.L(4.0f), f14, f14);
                    }
                }
            }
            TextPaint textPaint3 = (TextPaint) Q("paintChatActionText");
            this.t0 = textPaint3;
            if (textPaint3 != null) {
                TextPaint textPaint4 = this.F1;
                if (textPaint4 != null && textPaint4.getColor() != this.t0.getColor()) {
                    textPaint4.setColor(this.t0.getColor());
                }
                TextPaint textPaint5 = this.H1;
                if (textPaint5 != null && textPaint5.getColor() != this.t0.getColor()) {
                    textPaint5.setColor(this.t0.getColor());
                    textPaint5.linkColor = this.t0.getColor();
                }
                if (textPaint2 != null && textPaint2.getColor() != this.t0.getColor()) {
                    textPaint2.setColor(this.t0.getColor());
                    textPaint2.linkColor = this.t0.getColor();
                }
            }
        }
        int i20 = i13;
        I(canvas3, false);
        if (U()) {
            canvas3.save();
            int width = getWidth();
            this.J0.getClass();
            float h = (width - zoc.h()) / 2.0f;
            this.L0 = h;
            float walletActionTop = getWalletActionTop();
            this.M0 = walletActionTop;
            canvas3.translate(h, walletActionTop);
            this.J0.o((this.k0 / 2.0f) + this.L0, this.M0 + getPaddingTop());
            this.J0.d(canvas3);
            canvas3.restore();
        }
        boolean T2 = T();
        int i21 = this.I;
        RadialProgress2 radialProgress22 = this.K1;
        if (T2) {
            canvas3.save();
            float width2 = (getWidth() - this.I0.d()) / 2.0f;
            this.G0 = width2;
            float L4 = this.I0.p ? hl.L(4.0f) : hl.L(16.0f) + this.T + this.P;
            this.H0 = L4;
            canvas3.translate(width2, L4);
            this.I0.b(canvas3);
            al1 al1Var2 = this.g1;
            if (al1Var2 == null || al1Var2.h()) {
                this.I0.c(canvas3);
            }
            canvas3.restore();
        } else if (this.P0 != null) {
            canvas3.save();
            this.P0.a(canvas3);
            canvas3.restore();
        } else if (W(r47Var) || (r47Var != null && r47Var.D == 11)) {
            px4 px4Var = this.T0;
            if (px4Var != null && ((i2 = r47Var.D) == 31 || i2 == 37 || i2 == 33)) {
                px4Var.setBounds((int) (imageReceiver.L0 - hl.L(13.33f)), (int) (imageReceiver.M0 - hl.L(14.0f)), (int) (imageReceiver.L0 + imageReceiver.N0 + hl.L(13.33f)), (int) (imageReceiver.M0 + imageReceiver.O0 + hl.L(14.0f)));
                this.T0.draw(canvas3);
            }
            if (this.K != null) {
                canvas3.save();
                canvas3.translate(imageReceiver.L0, imageReceiver.M0);
                Path path = this.L;
                if (path == null) {
                    this.L = new Path();
                } else {
                    path.rewind();
                }
                Path path2 = this.L;
                float f15 = imageReceiver.N0 / 2.0f;
                path2.addCircle(f15, imageReceiver.O0 / 2.0f, f15, Path.Direction.CW);
                canvas3.clipPath(this.L);
                this.K.setBounds(0, 0, (int) imageReceiver.N0, (int) imageReceiver.O0);
                this.K.draw(canvas3);
                canvas3.restore();
            } else if (r47Var.y4()) {
                TLRPC.MessageMedia messageMedia = r47Var.k.media;
                long j = messageMedia.user_id;
                q6bVar.c = messageMedia.id;
                t6b.h(j, canvas3, imageReceiver, q6bVar);
            } else {
                imageReceiver.g(canvas3);
            }
            J(canvas);
            k0();
            if (r47Var.D == 37) {
                br3.a(canvas3, aob.R0, imageReceiver.L0 + hl.L(26.0f), imageReceiver.M0 + hl.L(26.0f), hl.L(52.0f));
            }
            float f16 = imageReceiver.L0;
            float f17 = imageReceiver.M0;
            radialProgress22.a.set(f16, f17, imageReceiver.N0 + f16, imageReceiver.O0 + f17);
            int i22 = r47Var.D;
            if (i22 != 21) {
                i = 22;
                if (i22 == 22) {
                    float R = R(r47Var);
                    radialProgress22.o(true, R);
                    radialProgress22.setCircleRadius(hl.L(26.0f));
                    radialProgress22.G = hl.L(24.0f);
                    radialProgress22.g(aob.cf, aob.df, aob.ef, aob.ff);
                    if (R == 1.0f) {
                        radialProgress22.setIcon(4, true, true);
                    } else {
                        radialProgress22.setIcon(3, true, true);
                    }
                    radialProgress22.draw(canvas3);
                }
                textPaint = this.t0;
                i3 = i;
                arrayList = this.q0;
                if (textPaint != null || this.N == null) {
                    i4 = i21;
                    radialProgress2 = radialProgress22;
                    i5 = i3;
                } else {
                    canvas3.save();
                    canvas3.translate(this.U, this.T);
                    if (this.N.getPaint() != this.t0) {
                        y();
                    }
                    canvas3.save();
                    npa.d(canvas3, arrayList);
                    npa.f(canvas3, this.N);
                    al1 al1Var3 = this.g1;
                    if (al1Var3 == null || al1Var3.h()) {
                        StaticLayout staticLayout3 = this.N;
                        radialProgress2 = radialProgress22;
                        i4 = i21;
                        i5 = i3;
                        hm.drawAnimatedEmojis(canvas, staticLayout3, this.s0, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout3 == null ? null : O(staticLayout3.getPaint().getColor()));
                        canvas3 = canvas;
                    } else {
                        i4 = i21;
                        radialProgress2 = radialProgress22;
                        i5 = i3;
                    }
                    canvas3.restore();
                    int size2 = arrayList.size();
                    int i23 = 0;
                    while (i23 < size2) {
                        Object obj = arrayList.get(i23);
                        i23++;
                        npa npaVar = (npa) obj;
                        npaVar.h(this.N.getPaint().getColor());
                        npaVar.draw(canvas3);
                    }
                    canvas3.restore();
                }
                if (this.t0 != null && this.Q != null) {
                    canvas3.save();
                    canvas3.translate(this.V, this.T - this.R);
                    if (this.Q.getPaint() != this.t0) {
                        y();
                    }
                    canvas3.save();
                    npa.d(canvas3, arrayList);
                    npa.f(canvas3, this.Q);
                    al1Var = this.g1;
                    if (al1Var != null || al1Var.h()) {
                        StaticLayout staticLayout4 = this.Q;
                        dm dmVar = this.s0;
                        StaticLayout staticLayout5 = this.N;
                        hm.drawAnimatedEmojis(canvas, staticLayout4, dmVar, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout5 != null ? null : O(staticLayout5.getPaint().getColor()));
                        canvas3 = canvas;
                    }
                    canvas3.restore();
                    size = arrayList.size();
                    i12 = 0;
                    while (i12 < size) {
                        Object obj2 = arrayList.get(i12);
                        i12++;
                        npa npaVar2 = (npa) obj2;
                        npaVar2.h(this.Q.getPaint().getColor());
                        npaVar2.draw(canvas3);
                    }
                    canvas3.restore();
                }
                if (T() && W(r47Var)) {
                    canvas3.save();
                    float f18 = (this.W - this.j1) / 2.0f;
                    if (r47Var.D != i5) {
                        f18 += hl.L(8.0f);
                    }
                    float f19 = f18;
                    if (Y()) {
                        RectF rectF2 = this.N1;
                        f = rectF2 != null ? rectF2.top : hl.L(4.0f) + this.T + this.P;
                        L = hl.L(16.0f);
                        if (i20 > 0) {
                            L = (L << 1) + i20;
                        }
                    } else {
                        float f20 = (this.j1 * 0.075f) + this.T + this.P;
                        if (r47Var.D != 21) {
                            i20 = this.i1;
                        }
                        float L5 = f20 + i20 + hl.L(4.0f);
                        if (r47Var.D == 21) {
                            L5 += hl.L(16.0f);
                        }
                        f = L5;
                        if (r47Var.r4()) {
                            L = hl.L(12.0f);
                        } else {
                            if (r47Var.D == 30 && !r47Var.r4()) {
                                f -= hl.L(3.66f);
                            }
                            i6 = r47Var.D;
                            if (i6 != 31 || i6 == 37) {
                                i7 = 33;
                            } else {
                                i7 = 33;
                            }
                            f -= hl.L(3.66f);
                            canvas3.translate(f19, f);
                            if (this.k1 == null) {
                                canvas3.save();
                                canvas3.translate(((this.j1 - hl.L(16.0f)) - this.k1.getWidth()) / 2.0f, 0.0f);
                                this.k1.draw(canvas3);
                                canvas3.restore();
                                float height = this.k1.getHeight() + f;
                                if (this.n1 != null) {
                                    canvas3.save();
                                    canvas3.translate(((this.j1 - hl.L(16.0f)) - this.n1.getWidth()) / 2.0f, hl.L(4.0f) + this.k1.getHeight());
                                    this.n1.draw(canvas3);
                                    canvas3.restore();
                                    height += hl.L(10.0f) + this.n1.getHeight();
                                }
                                L2 = height + hl.L(r47Var.D == 25 ? 6.0f : 0.0f);
                            } else {
                                L2 = f - hl.L(4.0f);
                            }
                            float f21 = L2;
                            canvas3.restore();
                            staticLayout = this.k1;
                            int i24 = TLObject.FLAG_28;
                            if (staticLayout != null || (pkbVar2 = this.m1) == null) {
                                i8 = i7;
                                canvas2 = canvas3;
                                f2 = 0.0f;
                            } else {
                                float j2 = pkbVar2.j() + hl.L(12.0f);
                                float z2 = bp1.z(this.j1 - hl.L(16.0f), j2, 2.0f, f19);
                                float height2 = f + this.k1.getHeight() + hl.L(14.0f);
                                Paint paint = this.l1;
                                if (paint == null) {
                                    paint = new Paint(1);
                                    this.l1 = paint;
                                }
                                paint.setColor(aob.h1() ? 285212671 : 268435456);
                                RectF rectF3 = hl.P;
                                rectF3.set(z2, height2 - hl.L(8.0f), j2 + z2, hl.L(8.0f) + height2);
                                canvas3.drawRoundRect(rectF3, hl.L(8.0f), hl.L(8.0f), this.l1);
                                Canvas canvas4 = canvas3;
                                f2 = 0.0f;
                                i8 = 33;
                                this.m1.c(z2 + hl.L(6.0f), height2, 1.0f, -855638017, canvas4);
                                canvas2 = canvas4;
                                f21 += hl.L(24.0f);
                            }
                            float L6 = f21 + hl.L(4.0f);
                            if (r47Var.D == 18) {
                                L6 += hl.L(2.0f);
                            }
                            float f22 = L6;
                            canvas2.save();
                            canvas2.translate(f19, f22);
                            if (r47Var.D != i5) {
                                RadialProgress2 radialProgress23 = radialProgress2;
                                if ((radialProgress23.c ? radialProgress23.j : radialProgress23.i).b() == 1.0f) {
                                    i10 = 4;
                                    if (radialProgress23.a() == 4) {
                                        if (this.t1 != null) {
                                            canvas2.save();
                                            canvas2.translate((this.j1 - this.t1.d.getWidth()) / 2.0f, f2);
                                            this.t1.a = ((this.j1 - r3.d.getWidth()) / 2.0f) + f19;
                                            this.t1.b = f22;
                                            int color = textPaint2.getColor();
                                            bl1 bl1Var2 = this.t1;
                                            f5 = f19;
                                            f3 = f2;
                                            npa.g(this, false, color, 0, bl1Var2.g, 1, bl1Var2.d, bl1Var2.f, canvas, false);
                                            bl1 bl1Var3 = this.t1;
                                            hm.drawAnimatedEmojis(canvas, bl1Var3.d, bl1Var3.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, O(textPaint2.getColor()));
                                            canvas3 = canvas;
                                            canvas3.restore();
                                            dl1Var = this;
                                            f4 = f5;
                                        } else {
                                            f3 = f2;
                                            dl1Var = this;
                                            canvas3 = canvas2;
                                            f4 = f19;
                                        }
                                    }
                                } else {
                                    i10 = 4;
                                }
                                f5 = f19;
                                f3 = f2;
                                int i25 = i8;
                                canvas3 = canvas2;
                                if (this.B1 == null) {
                                    TextPaint textPaint6 = new TextPaint();
                                    this.A1 = textPaint6;
                                    textPaint6.setTextSize(hl.L(13.0f));
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.L0(2131754551));
                                    int indexOf = spannableStringBuilder.toString().indexOf("...");
                                    if (indexOf < 0) {
                                        indexOf = spannableStringBuilder.toString().indexOf("…");
                                        i11 = 1;
                                    } else {
                                        i11 = 3;
                                    }
                                    if (indexOf >= 0) {
                                        SpannableString spannableString = new SpannableString("…");
                                        qac qacVar = new qac();
                                        qacVar.r = true;
                                        qacVar.b(this);
                                        f6 = 0.2f;
                                        spannableString.setSpan(qacVar, 0, spannableString.length(), i25);
                                        spannableStringBuilder.replace(indexOf, indexOf + i11, (CharSequence) spannableString);
                                    } else {
                                        f6 = 0.2f;
                                    }
                                    TextPaint textPaint7 = this.A1;
                                    bl1 bl1Var4 = this.t1;
                                    this.B1 = new StaticLayout(spannableStringBuilder, textPaint7, bl1Var4 == null ? 1 : bl1Var4.c, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                } else {
                                    f6 = 0.2f;
                                }
                                float R2 = R(r47Var);
                                if (this.D1 == null || this.C1 != R2) {
                                    this.C1 = R2;
                                    String l = uh9.l(new StringBuilder(), (int) (R2 * 100.0f), "%");
                                    bl1 bl1Var5 = this.t1;
                                    this.D1 = new StaticLayout(l, textPaint2, bl1Var5 == null ? 1 : bl1Var5.c, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                }
                                this.A1.setColor(textPaint2.getColor());
                                if (radialProgress23.a() == i10) {
                                    float b = (radialProgress23.c ? radialProgress23.j : radialProgress23.i).b();
                                    int color2 = textPaint2.getColor();
                                    float f23 = 1.0f - b;
                                    this.A1.setAlpha((int) (Color.alpha(color2) * f23));
                                    textPaint2.setAlpha((int) (Color.alpha(color2) * b));
                                    textPaint2.linkColor = textPaint2.getColor();
                                    if (this.t1 != null) {
                                        float f24 = (b * f6) + 0.8f;
                                        canvas3.save();
                                        canvas3.scale(f24, f24, this.j1 / 2.0f, this.t1.d.getHeight() / 2.0f);
                                        canvas3.translate((this.j1 - this.t1.d.getWidth()) / 2.0f, f3);
                                        this.t1.a = ((this.j1 - r1.d.getWidth()) / 2.0f) + f5;
                                        this.t1.b = f22;
                                        int color3 = textPaint2.getColor();
                                        bl1 bl1Var6 = this.t1;
                                        npa.g(this, false, color3, 0, bl1Var6.g, 1, bl1Var6.d, bl1Var6.f, canvas3, false);
                                        bl1 bl1Var7 = this.t1;
                                        dl1Var2 = this;
                                        hm.drawAnimatedEmojis(canvas, bl1Var7.d, bl1Var7.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, O(textPaint2.getColor()));
                                        canvas3 = canvas;
                                        canvas3.restore();
                                    } else {
                                        dl1Var2 = this;
                                    }
                                    textPaint2.setAlpha((int) (Color.alpha(color2) * f23));
                                    textPaint2.linkColor = textPaint2.getColor();
                                    float f25 = (f23 * f6) + 0.8f;
                                    canvas3.save();
                                    canvas3.scale(f25, f25, dl1Var2.j1 / 2.0f, dl1Var2.B1.getHeight() / 2.0f);
                                    canvas3.translate((dl1Var2.j1 - dl1Var2.B1.getWidth()) / 2.0f, f3);
                                    npa.f(canvas3, dl1Var2.B1);
                                    canvas3.restore();
                                    canvas3.save();
                                    canvas3.translate(f3, hl.L(4.0f) + dl1Var2.B1.getHeight());
                                    canvas3.scale(f25, f25, dl1Var2.j1 / 2.0f, dl1Var2.D1.getHeight() / 2.0f);
                                    canvas3.translate((dl1Var2.j1 - dl1Var2.D1.getWidth()) / 2.0f, f3);
                                    npa.f(canvas3, dl1Var2.D1);
                                    canvas3.restore();
                                    textPaint2.setColor(color2);
                                    textPaint2.linkColor = color2;
                                } else {
                                    dl1Var2 = this;
                                    canvas3.save();
                                    canvas3.translate((dl1Var2.j1 - dl1Var2.B1.getWidth()) / 2.0f, f3);
                                    dl1Var2.B1.draw(canvas3);
                                    canvas3.restore();
                                    canvas3.save();
                                    canvas3.translate((dl1Var2.j1 - dl1Var2.D1.getWidth()) / 2.0f, hl.L(4.0f) + dl1Var2.B1.getHeight());
                                    npa.f(canvas3, dl1Var2.D1);
                                    canvas3.restore();
                                }
                                dl1Var = dl1Var2;
                                f4 = f5;
                            } else {
                                f3 = f2;
                                canvas3 = canvas2;
                                bl1 bl1Var8 = this.t1;
                                if (bl1Var8 != null) {
                                    float height3 = bl1Var8.d.getHeight();
                                    if (d < 1.0f) {
                                        height3 = hl.R1(this.q1, height3, d);
                                        RectF rectF4 = hl.P;
                                        rectF4.set(f3, -hl.L(20.0f), getWidth(), height3);
                                        canvas3.saveLayerAlpha(rectF4, jn7.d4, 31);
                                    } else {
                                        canvas3.save();
                                    }
                                    canvas3.translate(((this.j1 - hl.L(16.0f)) - this.t1.d.getWidth()) / 2.0f, f3);
                                    this.t1.a = (((this.j1 - hl.L(16.0f)) - this.t1.d.getWidth()) / 2.0f) + f19;
                                    bl1 bl1Var9 = this.t1;
                                    bl1Var9.b = f22;
                                    int color4 = bl1Var9.e.getColor();
                                    bl1 bl1Var10 = this.t1;
                                    float f26 = height3;
                                    f4 = f19;
                                    npa.g(this, false, color4, 0, bl1Var10.g, 1, bl1Var10.d, bl1Var10.f, canvas3, false);
                                    bl1 bl1Var11 = this.t1;
                                    StaticLayout staticLayout6 = bl1Var11.d;
                                    dm dmVar2 = bl1Var11.h;
                                    ColorFilter O = O(textPaint2.getColor());
                                    dl1Var = this;
                                    hm.drawAnimatedEmojis(canvas, staticLayout6, dmVar2, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, O);
                                    canvas3 = canvas;
                                    if (d < 1.0f && dl1Var.x1 != null) {
                                        canvas3.save();
                                        if (dl1Var.s1 == null) {
                                            dl1Var.s1 = new pm3((byte) 7);
                                        }
                                        canvas3.translate((-((dl1Var.j1 - hl.L(16.0f)) - dl1Var.t1.d.getWidth())) / 2.0f, f3);
                                        RectF rectF5 = hl.P;
                                        rectF5.set((dl1Var.u1 - dl1Var.x1.c) + hl.L(8.0f), (dl1Var.v1 - dl1Var.w1) - hl.L(6.0f), hl.L(6.0f) + dl1Var.u1, dl1Var.v1);
                                        float f27 = 1.0f - d;
                                        dl1Var.s1.p(canvas3, rectF5, f27);
                                        rectF5.set((dl1Var.u1 - dl1Var.x1.c) - hl.L(16.0f), (dl1Var.v1 - dl1Var.w1) - hl.L(6.0f), (dl1Var.u1 - dl1Var.x1.c) + hl.L(8.0f), dl1Var.v1);
                                        dl1Var.s1.r(canvas3, rectF5, 2, f27);
                                        rectF5.set(f3, f26 - hl.L(12.0f), dl1Var.getWidth(), f26);
                                        dl1Var.s1.r(canvas3, rectF5, 3, (1.0f - f27) * f27 * 4.0f);
                                        canvas3.restore();
                                    }
                                    canvas3.restore();
                                    if (d < 1.0f && (pkbVar = dl1Var.x1) != null) {
                                        pkbVar.c((dl1Var.u1 - pkbVar.c) + hl.L(5.0f), (dl1Var.v1 - (dl1Var.w1 / 2.0f)) - hl.L(1.0f), 1.0f - d, dl1Var.t1.e.getColor(), canvas3);
                                    }
                                } else {
                                    dl1Var = this;
                                    f4 = f19;
                                }
                            }
                            canvas3.restore();
                            bl1Var = dl1Var.t1;
                            if (bl1Var != null) {
                                bl1Var.d.getHeight();
                            }
                            staticLayout2 = dl1Var.y1;
                            if (staticLayout2 != null) {
                                staticLayout2.getHeight();
                            }
                            dl1Var.getHeight();
                            vnbVar = dl1Var.h1;
                            if (vnbVar == null) {
                                vnbVar.b(dl1Var.v0, dl1Var.u0 + hl.L(4.0f), dl1Var.getMeasuredWidth(), dl1Var.w0);
                            } else {
                                aob.q(dl1Var.v0, dl1Var.u0 + hl.L(4.0f), dl1Var.getMeasuredWidth(), dl1Var.w0);
                            }
                            float a2 = dl1Var.n.a(0.02f);
                            canvas3.save();
                            rectF = dl1Var.p0;
                            canvas3.scale(a2, a2, rectF.centerX(), rectF.centerY());
                            if (dl1Var.y1 != null) {
                                canvas3.drawRoundRect(rectF, hl.L(15.0f), hl.L(15.0f), dl1Var.Q("paintChatActionBackgroundSelected"));
                                if (dl1Var.S()) {
                                    canvas3.drawRoundRect(rectF, hl.L(15.0f), hl.L(15.0f), dl1Var.Q("paintChatActionBackgroundDarken"));
                                }
                                float f28 = dl1Var.h2;
                                Paint paint2 = dl1Var.i2;
                                if (f28 > f3) {
                                    canvas3.drawRoundRect(rectF, hl.L(15.0f), hl.L(15.0f), paint2);
                                }
                                if (dl1Var.getMessageObject().D == 31 || dl1Var.getMessageObject().D == 37 || dl1Var.getMessageObject().D == 33) {
                                    boolean a3 = vnbVar != null ? vnbVar.a() : aob.h1();
                                    int color5 = paint2.getColor();
                                    if (a3) {
                                        i24 = 620756991;
                                    }
                                    paint2.setColor(i24);
                                    canvas3.drawRoundRect(rectF, hl.L(15.0f), hl.L(15.0f), paint2);
                                    paint2.setColor(color5);
                                }
                                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = dl1Var.c2;
                                if ((tL_messageActionStarGiftOnchainOffer == null || tL_messageActionStarGiftOnchainOffer.buyer) && (dl1Var.getMessageObject().D == 31 || dl1Var.getMessageObject().D == 37 || dl1Var.getMessageObject().D == 33 || dl1Var.getMessageObject().D == 21 || dl1Var.getMessageObject().D == 22 || dl1Var.getMessageObject().D == 24)) {
                                    dl1Var.invalidate();
                                } else {
                                    Path path3 = dl1Var.V1;
                                    path3.rewind();
                                    path3.addRoundRect(rectF, hl.L(16.0f), hl.L(16.0f), Path.Direction.CW);
                                    canvas3.save();
                                    canvas3.clipPath(path3);
                                    dva dvaVar = dl1Var.W1;
                                    dvaVar.d(canvas3);
                                    if (!dvaVar.g) {
                                        dl1Var.invalidate();
                                    }
                                    canvas3.restore();
                                }
                            }
                            z = r47Var.q;
                            float f29 = dl1Var.d0;
                            if (z) {
                                if (f29 != f3) {
                                    f29 -= 0.10666667f;
                                    dl1Var.d0 = f29;
                                }
                            } else if (f29 != 1.0f) {
                                f29 += 0.10666667f;
                                dl1Var.d0 = f29;
                            }
                            i9 = Utilities.i(f29, 1.0f, f3);
                            dl1Var.d0 = i9;
                            if (i9 != f3) {
                                if (dl1Var.c0 == null) {
                                    dl1Var.c0 = new RadialProgressView(dl1Var.getContext());
                                }
                                int L7 = hl.L(16.0f);
                                canvas3.save();
                                float f30 = dl1Var.d0;
                                canvas3.scale(f30, f30, rectF.centerX(), rectF.centerY());
                                dl1Var.c0.setSize(L7);
                                dl1Var.c0.setProgressColor(aob.u0(aob.Zc));
                                dl1Var.c0.a(canvas3, rectF.centerX(), rectF.centerY());
                                canvas3.restore();
                            }
                            if (dl1Var.d0 != 1.0f && dl1Var.y1 != null) {
                                canvas3.save();
                                float f31 = 1.0f - dl1Var.d0;
                                canvas3.scale(f31, f31, rectF.centerX(), rectF.centerY());
                                canvas3.translate(f4, rectF.top + hl.L(7.0f));
                                canvas3.translate(((dl1Var.j1 - hl.L(16.0f)) - dl1Var.y1.getWidth()) / 2.0f, f3);
                                dl1Var.y1.draw(canvas3);
                                canvas3.restore();
                            }
                            if (!r47Var.r) {
                                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer2 = dl1Var.c2;
                                if (tL_messageActionStarGiftOnchainOffer2 != null && dl1Var.d2) {
                                }
                                va6 va6Var = dl1Var.r;
                                if (va6Var != null) {
                                    va6Var.e(rectF);
                                    dl1Var.r.j(16.0f);
                                    dl1Var.r.a();
                                    dl1Var.r.draw(canvas3);
                                    if (dl1Var.r.c()) {
                                        dl1Var.r.b = -1L;
                                    }
                                }
                                canvas3.restore();
                                if (dl1Var.N1 != null && dl1Var.S1 != null && dl1Var.T1 != null) {
                                    Q = dl1Var.Q("paintChatActionBackground");
                                    Paint Q2 = dl1Var.Q("paintChatActionBackgroundDarken");
                                    float L8 = (dl1Var.N1.right - hl.L(65.0f)) + hl.L(2.0f);
                                    float L9 = dl1Var.N1.top - hl.L(2.0f);
                                    if (vnbVar == null) {
                                        vnbVar.b(dl1Var.v0 + L8, dl1Var.u0 + hl.L(4.0f) + L9, dl1Var.getMeasuredWidth(), dl1Var.w0);
                                    } else {
                                        aob.q(dl1Var.v0 + L8, dl1Var.u0 + hl.L(4.0f) + L9, dl1Var.getMeasuredWidth(), dl1Var.w0);
                                    }
                                    canvas3.save();
                                    canvas3.translate(L8, L9);
                                    ColorFilter colorFilter = Q.getColorFilter();
                                    PathEffect pathEffect = Q.getPathEffect();
                                    a = vnbVar == null ? vnbVar.a() : aob.h1();
                                    colorMatrixColorFilter = dl1Var.Q1;
                                    if (colorMatrixColorFilter != null || dl1Var.P1 != a) {
                                        colorMatrix = new ColorMatrix();
                                        if ((Q.getColorFilter() instanceof ColorMatrixColorFilter) && Build.VERSION.SDK_INT >= 26) {
                                            ((ColorMatrixColorFilter) Q.getColorFilter()).getColorMatrix(colorMatrix);
                                        }
                                        hl.h(colorMatrix, !a ? 0.1f : -0.08f);
                                        hl.i(colorMatrix, a ? 0.15f : 0.1f);
                                        ColorMatrixColorFilter colorMatrixColorFilter2 = new ColorMatrixColorFilter(colorMatrix);
                                        dl1Var.Q1 = colorMatrixColorFilter2;
                                        dl1Var.P1 = a;
                                        colorMatrixColorFilter = colorMatrixColorFilter2;
                                    }
                                    Q.setColorFilter(colorMatrixColorFilter);
                                    Q.setPathEffect(dl1Var.R1);
                                    canvas3.drawPath(dl1Var.S1, Q);
                                    Q.setColorFilter(colorFilter);
                                    Q.setPathEffect(pathEffect);
                                    if (dl1Var.S()) {
                                        PathEffect pathEffect2 = Q2.getPathEffect();
                                        Q2.setPathEffect(dl1Var.R1);
                                        canvas3.drawPath(dl1Var.S1, Q2);
                                        Q2.setPathEffect(pathEffect2);
                                    }
                                    canvas3.rotate(45.0f, hl.L(40.43f), hl.L(24.56f));
                                    dl1Var.T1.c(hl.L(40.43f) - (dl1Var.T1.c / 2.0f), hl.L(26.0f), 1.0f, -1, canvas3);
                                    canvas3.restore();
                                }
                            }
                            if (dl1Var.r == null) {
                                va6 va6Var2 = new va6(vnbVar);
                                dl1Var.r = va6Var2;
                                va6Var2.setCallback(dl1Var);
                                va6 va6Var3 = dl1Var.r;
                                va6Var3.t = 2.0f;
                                va6Var3.D = true;
                                va6Var3.g(aob.p1(0.08f, -1), aob.p1(0.2f, -1), aob.p1(0.2f, -1), aob.p1(0.7f, -1));
                                dl1Var.r.x.setStrokeWidth(hl.L(1.0f));
                            }
                            va6 va6Var4 = dl1Var.r;
                            va6Var4.c = -1L;
                            va6Var4.e(rectF);
                            dl1Var.r.j(16.0f);
                            dl1Var.r.draw(canvas3);
                            canvas3.restore();
                            if (dl1Var.N1 != null) {
                                Q = dl1Var.Q("paintChatActionBackground");
                                Paint Q22 = dl1Var.Q("paintChatActionBackgroundDarken");
                                float L82 = (dl1Var.N1.right - hl.L(65.0f)) + hl.L(2.0f);
                                float L92 = dl1Var.N1.top - hl.L(2.0f);
                                if (vnbVar == null) {
                                }
                                canvas3.save();
                                canvas3.translate(L82, L92);
                                ColorFilter colorFilter2 = Q.getColorFilter();
                                PathEffect pathEffect3 = Q.getPathEffect();
                                if (vnbVar == null) {
                                }
                                colorMatrixColorFilter = dl1Var.Q1;
                                if (colorMatrixColorFilter != null) {
                                }
                                colorMatrix = new ColorMatrix();
                                if (Q.getColorFilter() instanceof ColorMatrixColorFilter) {
                                    ((ColorMatrixColorFilter) Q.getColorFilter()).getColorMatrix(colorMatrix);
                                }
                                hl.h(colorMatrix, !a ? 0.1f : -0.08f);
                                hl.i(colorMatrix, a ? 0.15f : 0.1f);
                                ColorMatrixColorFilter colorMatrixColorFilter22 = new ColorMatrixColorFilter(colorMatrix);
                                dl1Var.Q1 = colorMatrixColorFilter22;
                                dl1Var.P1 = a;
                                colorMatrixColorFilter = colorMatrixColorFilter22;
                                Q.setColorFilter(colorMatrixColorFilter);
                                Q.setPathEffect(dl1Var.R1);
                                canvas3.drawPath(dl1Var.S1, Q);
                                Q.setColorFilter(colorFilter2);
                                Q.setPathEffect(pathEffect3);
                                if (dl1Var.S()) {
                                }
                                canvas3.rotate(45.0f, hl.L(40.43f), hl.L(24.56f));
                                dl1Var.T1.c(hl.L(40.43f) - (dl1Var.T1.c / 2.0f), hl.L(26.0f), 1.0f, -1, canvas3);
                                canvas3.restore();
                            }
                        }
                    }
                    f += L;
                    i6 = r47Var.D;
                    if (i6 != 31) {
                    }
                    i7 = 33;
                    f -= hl.L(3.66f);
                    canvas3.translate(f19, f);
                    if (this.k1 == null) {
                    }
                    float f212 = L2;
                    canvas3.restore();
                    staticLayout = this.k1;
                    int i242 = TLObject.FLAG_28;
                    if (staticLayout != null) {
                    }
                    i8 = i7;
                    canvas2 = canvas3;
                    f2 = 0.0f;
                    float L62 = f212 + hl.L(4.0f);
                    if (r47Var.D == 18) {
                    }
                    float f222 = L62;
                    canvas2.save();
                    canvas2.translate(f19, f222);
                    if (r47Var.D != i5) {
                    }
                    canvas3.restore();
                    bl1Var = dl1Var.t1;
                    if (bl1Var != null) {
                    }
                    staticLayout2 = dl1Var.y1;
                    if (staticLayout2 != null) {
                    }
                    dl1Var.getHeight();
                    vnbVar = dl1Var.h1;
                    if (vnbVar == null) {
                    }
                    float a22 = dl1Var.n.a(0.02f);
                    canvas3.save();
                    rectF = dl1Var.p0;
                    canvas3.scale(a22, a22, rectF.centerX(), rectF.centerY());
                    if (dl1Var.y1 != null) {
                    }
                    z = r47Var.q;
                    float f292 = dl1Var.d0;
                    if (z) {
                    }
                    i9 = Utilities.i(f292, 1.0f, f3);
                    dl1Var.d0 = i9;
                    if (i9 != f3) {
                    }
                    if (dl1Var.d0 != 1.0f) {
                        canvas3.save();
                        float f312 = 1.0f - dl1Var.d0;
                        canvas3.scale(f312, f312, rectF.centerX(), rectF.centerY());
                        canvas3.translate(f4, rectF.top + hl.L(7.0f));
                        canvas3.translate(((dl1Var.j1 - hl.L(16.0f)) - dl1Var.y1.getWidth()) / 2.0f, f3);
                        dl1Var.y1.draw(canvas3);
                        canvas3.restore();
                    }
                    if (!r47Var.r) {
                    }
                    if (dl1Var.r == null) {
                    }
                    va6 va6Var42 = dl1Var.r;
                    va6Var42.c = -1L;
                    va6Var42.e(rectF);
                    dl1Var.r.j(16.0f);
                    dl1Var.r.draw(canvas3);
                    canvas3.restore();
                    if (dl1Var.N1 != null) {
                    }
                } else {
                    dl1Var = this;
                }
                dl1Var.L(canvas3, false);
                dl1Var.x2.a();
                canvas3.restore();
            }
            zn5 zn5Var = (zn5) uc7.s1(i21).m4.get(r47Var.k.local_id);
            if (zn5Var != null) {
                radialProgress22.o(true, zn5Var.X);
                radialProgress22.setCircleRadius(((int) (imageReceiver.N0 * 0.5f)) + 1);
                radialProgress22.G = hl.L(24.0f);
                radialProgress22.g(aob.cf, aob.df, aob.ef, aob.ff);
                if (zn5Var.X == 1.0f) {
                    radialProgress22.setIcon(4, true, true);
                } else {
                    radialProgress22.setIcon(3, true, true);
                }
            }
            radialProgress22.draw(canvas3);
        }
        i = 22;
        textPaint = this.t0;
        i3 = i;
        arrayList = this.q0;
        if (textPaint != null) {
        }
        i4 = i21;
        radialProgress2 = radialProgress22;
        i5 = i3;
        if (this.t0 != null) {
            canvas3.save();
            canvas3.translate(this.V, this.T - this.R);
            if (this.Q.getPaint() != this.t0) {
            }
            canvas3.save();
            npa.d(canvas3, arrayList);
            npa.f(canvas3, this.Q);
            al1Var = this.g1;
            if (al1Var != null) {
            }
            StaticLayout staticLayout42 = this.Q;
            dm dmVar3 = this.s0;
            StaticLayout staticLayout52 = this.N;
            hm.drawAnimatedEmojis(canvas, staticLayout42, dmVar3, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout52 != null ? null : O(staticLayout52.getPaint().getColor()));
            canvas3 = canvas;
            canvas3.restore();
            size = arrayList.size();
            i12 = 0;
            while (i12 < size) {
            }
            canvas3.restore();
        }
        if (T()) {
        }
        dl1Var = this;
        dl1Var.L(canvas3, false);
        dl1Var.x2.a();
        canvas3.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        r47 r47Var = this.Q0;
        if (TextUtils.isEmpty(this.S0) && r47Var == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = this.s2;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder(!TextUtils.isEmpty(this.S0) ? this.S0 : r47Var.v);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new r1((Object) this, (Object) characterStyle, (byte) 3), spanStart, spanEnd, 33);
            }
            this.s2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(spannableStringBuilder.toString());
        } else {
            accessibilityNodeInfo.setText(spannableStringBuilder);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        RectF rectF = this.p0;
        this.U1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        zoc zocVar = this.J0;
        yoc yocVar = zocVar == null ? null : zocVar.m;
        if (yocVar != null) {
            yocVar.layout(0, 0, hl.L(42.0f), hl.L(42.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        int i3;
        boolean T;
        x49 x49Var;
        float f3;
        boolean z;
        boolean Y;
        float f4;
        float L;
        float f5;
        float L2;
        StaticLayout staticLayout;
        float f6;
        float f7;
        TLRPC.Message message;
        int measuredWidth;
        int i4;
        int L3;
        int i5;
        int L4;
        int i6;
        zoc zocVar = this.J0;
        yoc yocVar = zocVar == null ? null : zocVar.m;
        if (yocVar != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(hl.L(42.0f), TLObject.FLAG_30);
            yocVar.measure(makeMeasureSpec, makeMeasureSpec);
        }
        r47 r47Var = this.Q0;
        if (r47Var == null && this.S0 == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(14.0f) + this.m0 + this.P);
            return;
        }
        if (W(r47Var)) {
            this.j1 = c00.y(64.0f, (hl.q.y - a.getCurrentActionBarHeight()) - hl.m, (int) (hl.O1() ? hl.P0() * 0.6f : (hl.q.x * 0.62f) - hl.L(34.0f)));
            if ((!hl.O1() && ((i6 = r47Var.D) == 18 || i6 == 30 || X())) || r47Var.D == 35) {
                this.j1 = (int) (this.j1 * 1.2f);
            }
            this.i1 = this.j1 - hl.L(106.0f);
            if (r47Var.D == 31) {
                this.j1 = Math.min(this.j1, hl.L(192.0f));
                this.i1 = hl.L(78.0f);
            }
            if (r47Var.D == 33) {
                this.j1 = Math.min(this.j1, hl.L(220.0f));
                this.i1 = hl.L(78.0f);
            }
            int i7 = r47Var.D;
            ImageReceiver imageReceiver = this.J;
            if (i7 == 37) {
                this.i1 = hl.L(52.0f);
                imageReceiver.q0(hl.L(14.0f));
            } else if (Y()) {
                imageReceiver.q0(this.i1 / 2);
            } else {
                imageReceiver.q0(0);
            }
        }
        int max = Math.max(hl.L(30.0f), View.MeasureSpec.getSize(i));
        if (this.W != max) {
            this.D0 = true;
            this.W = max;
            y();
        }
        if (r47Var != null) {
            f = 30.0f;
            if (r47Var.D == 11) {
                i5 = hl.u;
                L4 = hl.L(10.0f);
            } else if (W(r47Var)) {
                i5 = this.j1;
                L4 = hl.L(12.0f);
            } else if (U()) {
                f2 = 140.0f;
                i3 = (this.J0.q0 == null ? hl.L(140.0f) : ((int) Math.ceil(r3.q0.h())) + hl.L(150.0f)) + hl.L(8.0f);
                T = T();
                x49Var = this.F0;
                if (T) {
                    r9 = uh9.w(8.0f, this.I0.P, this.I0.p ? 0 : hl.L(16.0f) + this.T + this.P);
                    if (!x49Var.p) {
                        L3 = hl.L(8.0f) + x49Var.m;
                        x49Var.n = L3;
                        r9 += L3;
                    }
                    f4 = 8.0f;
                    f5 = 24.0f;
                } else {
                    ueb uebVar = this.P0;
                    if (uebVar != null) {
                        r9 = hl.L(12.0f) + hl.L(f2) + ((int) uebVar.f.h()) + (uebVar.i ? hl.L(40.0f) : 0);
                        if (!x49Var.p) {
                            L3 = hl.L(8.0f) + x49Var.m;
                            x49Var.n = L3;
                            r9 += L3;
                        }
                    } else if (W(r47Var)) {
                        if (r47Var != null) {
                            f3 = 16.0f;
                            if (r47Var.D == 25) {
                                z = true;
                                int P = P(r47Var);
                                Y = Y();
                                f4 = 8.0f;
                                int i8 = this.T + this.P;
                                if (Y) {
                                    L = (this.t1 == null ? 0 : hl.L(4.0f) + r13.d.getHeight()) + (this.j1 * 0.075f) + i8 + P + hl.L(4.0f);
                                } else {
                                    int L5 = hl.L(4.0f) + i8;
                                    int L6 = hl.L(f3);
                                    if (P > 0) {
                                        L6 = (L6 << 1) + P;
                                    }
                                    int i9 = L5 + L6;
                                    bl1 bl1Var = this.t1;
                                    L = i9 + (bl1Var == null ? 0 : hl.L(4.0f) + bl1Var.d.getHeight());
                                }
                                this.L1 = 0;
                                if (this.k1 == null) {
                                    float height = L + r15.getHeight();
                                    if (this.k1.getLineCount() > 1) {
                                        f5 = 24.0f;
                                        this.L1 = (this.k1.getHeight() - this.k1.getLineTop(1)) + this.L1;
                                    } else {
                                        f5 = 24.0f;
                                    }
                                    L2 = height + hl.L(z ? 6.0f : 0.0f);
                                    if (this.n1 != null) {
                                        L2 += hl.L(9.0f) + r4.getHeight();
                                    }
                                    if (this.m1 != null) {
                                        L2 += hl.L(f5);
                                    }
                                } else {
                                    f5 = 24.0f;
                                    L2 = L - hl.L(12.0f);
                                    this.L1 -= hl.L(f);
                                }
                                bl1 bl1Var2 = this.t1;
                                int height2 = bl1Var2 != null ? 0 : bl1Var2.d.getHeight();
                                if (this.t1 != null) {
                                    this.L1 = 0;
                                } else if (this.n1 != null) {
                                    this.L1 = uh9.w(10.0f, height2, this.L1);
                                } else {
                                    r47 r47Var2 = this.Q0;
                                    if (r47Var2.D == 18 || r47Var2.r4()) {
                                        this.L1 = c00.A(this.y1 == null ? 0.0f : 10.0f, height2, this.L1);
                                    } else if (this.Q0.D == 30) {
                                        this.L1 = c00.A(20.0f, height2, this.L1);
                                    } else if (this.p1) {
                                        this.L1 += height2;
                                    } else if (this.t1.d.getLineCount() > 2) {
                                        this.L1 = ((this.t1.d.getLineCount() * (this.t1.d.getLineBottom(0) - this.t1.d.getLineTop(0))) - 2) + this.L1;
                                    }
                                }
                                if (this.m1 != null) {
                                    this.L1 = hl.L(f5) + this.L1;
                                }
                                int L7 = this.L1 - hl.L(z ? 14.0f : 0.0f);
                                this.L1 = L7;
                                i3 += L7;
                                int L8 = hl.L(14.0f) + this.P + i3;
                                staticLayout = this.y1;
                                RectF rectF = this.p0;
                                if (staticLayout == null) {
                                    float z2 = bp1.z((L8 - L2) - staticLayout.getHeight(), hl.L(8.0f), 2.0f, L2);
                                    if (this.Q0.r4()) {
                                        z2 += hl.L(4.0f);
                                    }
                                    float f8 = (this.W - this.E1) / 2.0f;
                                    f6 = 2.0f;
                                    f7 = 18.0f;
                                    rectF.set(f8 - hl.L(18.0f), z2 - hl.L(8.0f), f8 + this.E1 + hl.L(18.0f), z2 + (this.y1 != null ? r8.getHeight() : 0) + hl.L(8.0f));
                                } else {
                                    f6 = 2.0f;
                                    f7 = 18.0f;
                                    i3 -= hl.L(40.0f);
                                    this.L1 -= hl.L(40.0f);
                                    r47 r47Var3 = this.Q0;
                                    if (r47Var3 != null && (message = r47Var3.k) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                                        i3 -= hl.L(8.0f);
                                        this.L1 -= hl.L(8.0f);
                                    }
                                }
                                measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                                dva dvaVar = this.W1;
                                dvaVar.a.set(rectF);
                                dvaVar.b.set(rectF);
                                if (this.X1 != measuredWidth) {
                                    this.X1 = measuredWidth;
                                    dvaVar.f();
                                }
                                if (Y()) {
                                    int L9 = hl.L(4.0f) + this.T + this.P;
                                    this.f = 0;
                                    int L10 = hl.L(f3);
                                    if (P > 0) {
                                        L10 = (L10 << 1) + P;
                                    }
                                    this.f = L10;
                                    StaticLayout staticLayout2 = this.n1;
                                    if (staticLayout2 != null) {
                                        L10 = uh9.w(10.0f, staticLayout2.getHeight(), L10);
                                        this.f = L10;
                                    }
                                    if (this.m1 != null) {
                                        L10 += hl.L(15.0f);
                                        this.f = L10;
                                    }
                                    int i10 = L10 + height2;
                                    this.f = i10;
                                    float f9 = (this.W - this.E1) / f6;
                                    if (this.y1 != null) {
                                        this.h = hl.L(7.0f) + i10 + L9;
                                        rectF.set(f9 - hl.L(f7), this.h, f9 + this.E1 + hl.L(f7), this.y1.getHeight() + this.h + (hl.L(8.0f) << 1));
                                        this.f = (int) (rectF.height() + hl.L(4.0f) + this.f);
                                    } else if (!X() && (i4 = r47Var.D) != 34 && i4 != 33 && i4 != 35) {
                                        rectF.set(f9 - hl.L(f7), this.h, f9 + this.E1 + hl.L(f7), hl.L(17.0f) + this.h + (hl.L(8.0f) << 1));
                                        this.f = hl.L(17.0f) + this.f;
                                    }
                                    int L11 = hl.L(15.0f) + this.f;
                                    this.f = L11;
                                    int L12 = hl.L(6.0f) + L9 + L11;
                                    if (!x49Var.p) {
                                        int L13 = hl.L(8.0f) + x49Var.m;
                                        x49Var.n = L13;
                                        L12 += L13;
                                    }
                                    r9 = L12;
                                    if (this.Z1 != null) {
                                        r9 += hl.L(44.0f);
                                    }
                                }
                                rectF.inset(hl.L(5.0f), hl.L(1.0f));
                            }
                        } else {
                            f3 = 16.0f;
                        }
                        z = false;
                        int P2 = P(r47Var);
                        Y = Y();
                        f4 = 8.0f;
                        int i82 = this.T + this.P;
                        if (Y) {
                        }
                        this.L1 = 0;
                        if (this.k1 == null) {
                        }
                        bl1 bl1Var22 = this.t1;
                        if (bl1Var22 != null) {
                        }
                        if (this.t1 != null) {
                        }
                        if (this.m1 != null) {
                        }
                        int L72 = this.L1 - hl.L(z ? 14.0f : 0.0f);
                        this.L1 = L72;
                        i3 += L72;
                        int L82 = hl.L(14.0f) + this.P + i3;
                        staticLayout = this.y1;
                        RectF rectF2 = this.p0;
                        if (staticLayout == null) {
                        }
                        measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                        dva dvaVar2 = this.W1;
                        dvaVar2.a.set(rectF2);
                        dvaVar2.b.set(rectF2);
                        if (this.X1 != measuredWidth) {
                        }
                        if (Y()) {
                        }
                        rectF2.inset(hl.L(5.0f), hl.L(1.0f));
                    }
                    f4 = 8.0f;
                    f5 = 24.0f;
                }
                if (this.Q0 != null && !x49Var.p) {
                    int L14 = hl.L(f4) + x49Var.m;
                    x49Var.n = L14;
                    i3 += L14;
                }
                if (X()) {
                    i3 = uh9.w(f5, this.R, i3);
                }
                if (r47Var == null && Y()) {
                    setMeasuredDimension(max, this.m0 + r9);
                } else {
                    setMeasuredDimension(max, hl.L(14.0f) + this.m0 + this.P + i3);
                }
                x49Var.c = (getMeasuredHeight() - getPaddingTop()) - x49Var.n;
            }
            i3 = L4 + i5;
            f2 = 140.0f;
            T = T();
            x49Var = this.F0;
            if (T) {
            }
            if (this.Q0 != null) {
                int L142 = hl.L(f4) + x49Var.m;
                x49Var.n = L142;
                i3 += L142;
            }
            if (X()) {
            }
            if (r47Var == null) {
            }
            setMeasuredDimension(max, hl.L(14.0f) + this.m0 + this.P + i3);
            x49Var.c = (getMeasuredHeight() - getPaddingTop()) - x49Var.n;
        }
        f = 30.0f;
        f2 = 140.0f;
        i3 = 0;
        T = T();
        x49Var = this.F0;
        if (T) {
        }
        if (this.Q0 != null) {
        }
        if (X()) {
        }
        if (r47Var == null) {
        }
        setMeasuredDimension(max, hl.L(14.0f) + this.m0 + this.P + i3);
        x49Var.c = (getMeasuredHeight() - getPaddingTop()) - x49Var.n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        if (r11.i == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02e5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        byte b;
        zn5 zn5Var;
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        bl1 bl1Var;
        b77 b77Var;
        oj ojVar;
        bl1 bl1Var2;
        TLRPC.Message message2;
        boolean z;
        boolean z2;
        boolean z3;
        StaticLayout staticLayout;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        TLRPC.Message message3;
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer;
        int i;
        dl1 dl1Var;
        boolean z8;
        wk1 wk1Var;
        r47 r47Var = this.Q0;
        float x = motionEvent.getX() - (this.k0 / 2.0f);
        this.z0 = x;
        float y = motionEvent.getY() + getPaddingTop();
        this.A0 = y;
        boolean z9 = true;
        if (r47Var == null) {
            if (this.k2 != null) {
                if (motionEvent.getAction() == 0) {
                    if (x >= this.b1 && x <= this.c1) {
                        this.G = true;
                        return true;
                    }
                } else if (this.G) {
                    if (motionEvent.getAction() == 1) {
                        this.k2.onClick(this);
                        this.G = false;
                    } else if (motionEvent.getAction() == 3) {
                        this.G = false;
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        byb bybVar = this.o0;
        if (bybVar == null || !bybVar.d(motionEvent, false)) {
            ueb uebVar = this.P0;
            if (uebVar != null) {
                v41 v41Var = uebVar.m;
                boolean contains = uebVar.k.contains(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0) {
                    v41Var.c(contains);
                } else if (motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1) {
                        if (v41Var.i) {
                            uebVar.b();
                        }
                        v41Var.c(false);
                    } else if (motionEvent.getAction() == 3) {
                        v41Var.c(false);
                    }
                }
            }
            if (!T() || !this.I0.e(this.G0, this.H0, motionEvent)) {
                if (U()) {
                    zoc zocVar = this.J0;
                    float f = (this.k0 / 2.0f) + this.L0;
                    float paddingTop = this.M0 + getPaddingTop();
                    ArrayList arrayList = zocVar.c;
                    v41 v41Var2 = zocVar.Y;
                    float x2 = motionEvent.getX() - f;
                    float y3 = motionEvent.getY() - paddingTop;
                    dl1 dl1Var2 = zocVar.a;
                    if (motionEvent.getActionMasked() == 0) {
                        float x3 = motionEvent.getX() - f;
                        float y4 = motionEvent.getY() - paddingTop;
                        yoc yocVar = zocVar.m;
                        if (yocVar != null && yocVar.n && zocVar.w.contains((int) x3, (int) y4)) {
                            if (!zocVar.D && zocVar.C <= 1.001f) {
                                zocVar.A = zocVar.g();
                                zocVar.B = zocVar.k.F * 0.14f;
                            }
                            ValueAnimator valueAnimator = zocVar.G;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                zocVar.G = null;
                            }
                            zocVar.D = false;
                            zocVar.x = motionEvent.getPointerId(0);
                            zocVar.y = motionEvent.getX();
                            zocVar.z = motionEvent.getY();
                            zocVar.r0 = false;
                            v41Var2.c(false);
                            if (dl1Var2.getParent() != null) {
                                dl1Var2.getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            zocVar.a(3.0f);
                            if (z9) {
                                if (this.J0.x != -1) {
                                    o();
                                    return true;
                                }
                                if (motionEvent.getAction() == 0) {
                                    this.B0 = motionEvent.getX();
                                    this.C0 = motionEvent.getY();
                                    x();
                                    return true;
                                }
                                if (motionEvent.getAction() != 2) {
                                    o();
                                    return true;
                                }
                                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                                if (Math.abs(motionEvent.getX() - this.B0) > scaledTouchSlop || Math.abs(motionEvent.getY() - this.C0) > scaledTouchSlop) {
                                    o();
                                    return true;
                                }
                            }
                        }
                        float L = hl.L(4.0f);
                        boolean z10 = x2 < L && x2 <= ((float) hl.L(206.0f)) - L && y3 >= L && y3 <= ((float) hl.L(140.0f)) - L;
                        if (zocVar.q0 != null) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = zocVar.l0;
                            if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !zocVar.m0) {
                                float L2 = x2 - ((hl.L(206.0f) - zocVar.q0.j()) / 2.0f);
                                float L3 = y3 - hl.L(143.0f);
                                int size = arrayList.size();
                                int i2 = 0;
                                while (i2 < size) {
                                    Object obj = arrayList.get(i2);
                                    i2++;
                                    dl1Var = dl1Var2;
                                    if (((npa) obj).getBounds().contains((int) L2, (int) L3)) {
                                        z8 = true;
                                        break;
                                    }
                                    dl1Var2 = dl1Var;
                                }
                            }
                        }
                        dl1Var = dl1Var2;
                        z8 = false;
                        boolean z11 = !z10 || z8;
                        if (motionEvent.getAction() != 0) {
                            zocVar.r0 = z11;
                            v41Var2.c(z11);
                        } else if (motionEvent.getAction() == 2) {
                            if (zocVar.r0) {
                                v41Var2.c(z11);
                            }
                        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            z9 = zocVar.r0;
                            boolean z12 = motionEvent.getAction() == 1 && z9 && z11;
                            zocVar.r0 = false;
                            v41Var2.c(false);
                            if (z12 && z8) {
                                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = zocVar.l0;
                                if (tL_messageActionGramTransfer2.comment_encrypted_preparing) {
                                    zocVar.m0 = true;
                                    pkb pkbVar = zocVar.q0;
                                    pkbVar.p(pv3.m(tL_messageActionGramTransfer2.comment, pkbVar.a.getFontMetricsInt(), false, null, 0));
                                    zocVar.d.addAll(arrayList);
                                    arrayList.clear();
                                    dl1Var.requestLayout();
                                    dl1Var.invalidate();
                                    if (z9) {
                                    }
                                }
                            }
                            if (z12 && (wk1Var = zocVar.s0) != null) {
                                wk1Var.run();
                            }
                            if (z9) {
                            }
                        }
                        z9 = zocVar.r0;
                        if (z9) {
                        }
                    } else {
                        if (zocVar.x != -1) {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked != 1) {
                                if (actionMasked == 2) {
                                    int findPointerIndex = motionEvent.findPointerIndex(zocVar.x);
                                    if (findPointerIndex < 0) {
                                        zocVar.j();
                                    } else {
                                        float f2 = 0.013962634f / hl.p;
                                        zocVar.A = qd4.A(motionEvent.getX(findPointerIndex), zocVar.y, f2, zocVar.A);
                                        zocVar.B = qd4.A(motionEvent.getY(findPointerIndex), zocVar.z, f2, zocVar.B);
                                        zocVar.y = motionEvent.getX(findPointerIndex);
                                        zocVar.z = motionEvent.getY(findPointerIndex);
                                        dl1Var2.invalidate();
                                    }
                                } else if (actionMasked != 3) {
                                    if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == zocVar.x) {
                                        int i3 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                                        zocVar.x = motionEvent.getPointerId(i3);
                                        zocVar.y = motionEvent.getX(i3);
                                        zocVar.z = motionEvent.getY(i3);
                                    }
                                }
                                if (z9) {
                                }
                            }
                            zocVar.j();
                            if (z9) {
                            }
                        }
                        float L4 = hl.L(4.0f);
                        if (x2 < L4) {
                        }
                        if (zocVar.q0 != null) {
                        }
                        dl1Var = dl1Var2;
                        z8 = false;
                        if (z10) {
                        }
                        if (motionEvent.getAction() != 0) {
                        }
                        z9 = zocVar.r0;
                        if (z9) {
                        }
                    }
                    return true;
                }
                if (!this.F0.c(motionEvent)) {
                    int action = motionEvent.getAction();
                    ImageReceiver imageReceiver = this.J;
                    int i4 = this.I;
                    RectF rectF = this.p0;
                    View view = this.U1;
                    v41 v41Var3 = this.n;
                    if (action != 0) {
                        b = 4;
                        if (motionEvent.getAction() != 2) {
                            o();
                        }
                        if (this.G) {
                            if (motionEvent.getAction() == 2) {
                                if (x < this.b1 || x > this.c1) {
                                    z = false;
                                    this.G = false;
                                    z2 = z;
                                }
                            } else if (motionEvent.getAction() == 1) {
                                View.OnClickListener onClickListener = this.k2;
                                if (onClickListener != null) {
                                    onClickListener.onClick(this);
                                }
                                this.G = false;
                            } else if (motionEvent.getAction() == 3) {
                                this.G = false;
                            }
                            z2 = false;
                        } else if (this.F) {
                            int action2 = motionEvent.getAction();
                            if (action2 == 1) {
                                this.F = false;
                                view.setPressed(false);
                                v41Var3.c(false);
                                if (this.g1 != null && r47Var.C != null && (message2 = r47Var.k) != null && atb.g(message2.action, TLRPC.TL_messageActionTodoAppendTasks.class, TLRPC.TL_messageActionTodoCompletions.class, TLRPC.TL_messageActionSuggestedPostApproval.class, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                    this.g1.B(this, this.Q0.N1());
                                } else if (this.p1 && !this.o1 && (bl1Var2 = this.t1) != null) {
                                    int height = bl1Var2.d.getHeight() - this.q1;
                                    this.o1 = true;
                                    al1 al1Var = this.g1;
                                    if (al1Var != null) {
                                        al1Var.j(this);
                                        if (getParent() instanceof d79) {
                                            ((d79) getParent()).y0(0, hl.L(24.0f) + height, null);
                                            return true;
                                        }
                                    }
                                } else if (this.P0 != null && this.N1.contains(motionEvent.getX(), motionEvent.getY())) {
                                    this.P0.b();
                                    return true;
                                }
                            } else if (action2 == 2) {
                                bl1 bl1Var3 = this.t1;
                                if (bl1Var3 == null || !this.p1) {
                                    this.F = false;
                                } else {
                                    RectF rectF2 = hl.P;
                                    float f3 = bl1Var3.a;
                                    rectF2.set(f3, bl1Var3.b, bl1Var3.d.getWidth() + f3, this.t1.b + r8.d.getHeight());
                                    if (!rectF2.contains(x, y)) {
                                        this.F = false;
                                    }
                                }
                                z = true;
                                z2 = z;
                            } else if (action2 == 3) {
                                this.F = false;
                                v41Var3.c(false);
                            }
                            z = false;
                            z2 = z;
                        } else {
                            if (this.b0) {
                                int action3 = motionEvent.getAction();
                                if (action3 == 1) {
                                    this.a0 = false;
                                    this.b0 = false;
                                    view.setPressed(false);
                                    v41Var3.c(false);
                                    if (this.c2 != null) {
                                        playSoundEffect(0);
                                        al1 al1Var2 = this.g1;
                                        e w = al1Var2 != null ? al1Var2.w() : LaunchActivity.S();
                                        if (w != null && this.c2 != null && this.Q0 != null) {
                                            final d31 b0 = d31.b0(w);
                                            if (this.c2.buyer) {
                                                final Context context = getContext();
                                                int e1 = this.Q0.e1();
                                                final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer2 = this.c2;
                                                HashMap hashMap = vs7.a;
                                                final long j = tL_messageActionStarGiftOnchainOffer2.offer_id;
                                                if (vs7.b(j)) {
                                                    TL_stars.cancelStarGiftOnchainOffer cancelstargiftonchainoffer = new TL_stars.cancelStarGiftOnchainOffer();
                                                    cancelstargiftonchainoffer.offer_msg_id = e1;
                                                    final int i5 = this.I;
                                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i5);
                                                    ic icVar = new ic((byte) 0);
                                                    final vnb vnbVar = this.h1;
                                                    connectionsManager.sendRequestTyped(cancelstargiftonchainoffer, icVar, new icc() { // from class: ts7
                                                        @Override // icc
                                                        public final void a(Object obj2, Object obj3) {
                                                            TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj2;
                                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                                            long j2 = j;
                                                            Context context2 = context;
                                                            int i6 = i5;
                                                            vnb vnbVar2 = vnbVar;
                                                            d31 d31Var = b0;
                                                            if (tL_payments_starGiftOnchainOfferTx == null || tL_payments_starGiftOnchainOfferTx.message == null) {
                                                                vs7.g(j2);
                                                                it7.u(context2, i6, vnbVar2, d31Var, tL_error, null);
                                                                return;
                                                            }
                                                            a35 p = vs7.p(context2, vnbVar2, d31Var, i6, tL_payments_starGiftOnchainOfferTx);
                                                            if (p == null) {
                                                                vs7.g(j2);
                                                                return;
                                                            }
                                                            pq7 pq7Var = new pq7(context2, i6, tL_messageActionStarGiftOnchainOffer2, tL_payments_starGiftOnchainOfferTx, p, vnbVar2, d31Var);
                                                            int i7 = ms7.y2;
                                                            boolean[] zArr = new boolean[1];
                                                            fd7 fd7Var = new fd7((Object) zArr, (Object) new Runnable[]{c.C(i6).k(p, new p((Object) zArr, (Object) fd7Var, (Object) pq7Var, (byte) 22))}, (Object) pq7Var, (byte) 14);
                                                            hl.d3(fd7Var, 5000L);
                                                        }
                                                    });
                                                }
                                            } else {
                                                final Context context2 = getContext();
                                                final int e12 = this.Q0.e1();
                                                final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer3 = this.c2;
                                                HashMap hashMap2 = vs7.a;
                                                final long j2 = tL_messageActionStarGiftOnchainOffer3.offer_id;
                                                final int i6 = this.I;
                                                if (vs7.k(i6, j2)) {
                                                    vs7.r(b0);
                                                } else if (vs7.b(j2)) {
                                                    TL_stars.acceptStarGiftOnchainOffer acceptstargiftonchainoffer = new TL_stars.acceptStarGiftOnchainOffer();
                                                    acceptstargiftonchainoffer.offer_msg_id = e12;
                                                    ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i6);
                                                    ic icVar2 = new ic((byte) 0);
                                                    final vnb vnbVar2 = this.h1;
                                                    connectionsManager2.sendRequestTyped(acceptstargiftonchainoffer, icVar2, new icc() { // from class: ss7
                                                        @Override // icc
                                                        public final void a(Object obj2, Object obj3) {
                                                            TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj2;
                                                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                                            long j3 = j2;
                                                            Context context3 = context2;
                                                            vnb vnbVar3 = vnbVar2;
                                                            int i7 = i6;
                                                            d31 d31Var = b0;
                                                            if (tL_payments_starGiftOnchainOfferTx == null || tL_payments_starGiftOnchainOfferTx.message == null) {
                                                                vs7.g(j3);
                                                                if (tL_error == null || !"STARGIFT_ONCHAIN_SALE_ACTIVE".equals(tL_error.text)) {
                                                                    it7.u(context3, i7, vnbVar3, d31Var, tL_error, null);
                                                                    return;
                                                                } else {
                                                                    it7.s(context3, vnbVar3, ob6.M0(2131749514, null), null);
                                                                    return;
                                                                }
                                                            }
                                                            a35 p = vs7.p(context3, vnbVar3, d31Var, i7, tL_payments_starGiftOnchainOfferTx);
                                                            if (p == null) {
                                                                vs7.g(j3);
                                                                return;
                                                            }
                                                            TL_stars.TL_payments_starGiftOnchainOfferTxMessage tL_payments_starGiftOnchainOfferTxMessage = tL_payments_starGiftOnchainOfferTx.gasless_message;
                                                            if (tL_payments_starGiftOnchainOfferTxMessage != null) {
                                                                try {
                                                                    a35 b2 = a35.b(tL_payments_starGiftOnchainOfferTxMessage);
                                                                    List list = b2.g;
                                                                    if (list == null) {
                                                                        list = Collections.singletonList(b2);
                                                                    }
                                                                    Iterator it = list.iterator();
                                                                    while (true) {
                                                                        if (!it.hasNext()) {
                                                                            break;
                                                                        } else if (((a35) it.next()).e != 3) {
                                                                            b2 = null;
                                                                            break;
                                                                        }
                                                                    }
                                                                    p.f = b2;
                                                                } catch (Exception e) {
                                                                    cc4.g(e, true);
                                                                }
                                                            }
                                                            TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer4 = tL_messageActionStarGiftOnchainOffer3;
                                                            TL_stars.StarGift starGift2 = tL_messageActionStarGiftOnchainOffer4.gift;
                                                            String i8 = starGift2 != null ? it7.i(starGift2) : "";
                                                            ms7 ms7Var = new ms7(context3, i7, tL_messageActionStarGiftOnchainOffer4.gift, vnbVar3);
                                                            ms7Var.h1(hl.S2(ob6.a0(null, null, 2131749530, i8, it7.l(tL_messageActionStarGiftOnchainOffer4.amount))), ob6.M0(2131749529, null));
                                                            String M0 = ob6.M0(2131749496, null);
                                                            SpannableStringBuilder m = it7.m(tL_messageActionStarGiftOnchainOffer4.amount);
                                                            hjb hjbVar = ms7Var.Y1;
                                                            hjbVar.f(M0, m, null, null);
                                                            it7.c(ms7Var, tL_messageActionStarGiftOnchainOffer4.amount, tL_messageActionStarGiftOnchainOffer4.fee_bps, vnbVar3);
                                                            TL_stars.StarGift starGift3 = tL_messageActionStarGiftOnchainOffer4.gift;
                                                            if (starGift3 != null) {
                                                                it7.b(ms7Var, starGift3);
                                                                if (tL_messageActionStarGiftOnchainOffer4.gift.availability_total > 0) {
                                                                    hjbVar.f(ob6.M0(2131750261, null), ob6.H(',', "Gift2QuantityIssued1", tL_messageActionStarGiftOnchainOffer4.gift.availability_issued).concat(ob6.H(',', "Gift2QuantityIssued2", tL_messageActionStarGiftOnchainOffer4.gift.availability_total)), null, null);
                                                                }
                                                            }
                                                            TL_wallet.walletOnchainGiftActionOfferAccept walletonchaingiftactionofferaccept = new TL_wallet.walletOnchainGiftActionOfferAccept();
                                                            walletonchaingiftactionofferaccept.offer_address = tL_messageActionStarGiftOnchainOffer4.offer_address;
                                                            walletonchaingiftactionofferaccept.price = tL_messageActionStarGiftOnchainOffer4.amount;
                                                            TL_stars.StarGift starGift4 = tL_messageActionStarGiftOnchainOffer4.gift;
                                                            p.h = walletonchaingiftactionofferaccept;
                                                            p.i = starGift4;
                                                            long j4 = tL_messageActionStarGiftOnchainOffer4.offer_id;
                                                            boolean[] zArr = new boolean[1];
                                                            vs7.j(j4, Long.MAX_VALUE);
                                                            ms7Var.setOnDismissListener(new ps7(zArr, j4, (byte) 1));
                                                            ms7Var.u2.setVisibility(0);
                                                            String M02 = ob6.M0(2131749566, null);
                                                            iz0 iz0Var = new iz0(context3, i7, e12, tL_messageActionStarGiftOnchainOffer4, vnbVar3, ms7Var);
                                                            c51 c51Var = ms7Var.b2;
                                                            c51Var.i(M02, false, true);
                                                            c51Var.setOnClickListener(new uv5(ms7Var, iz0Var, (byte) 12));
                                                            int i9 = tL_messageActionStarGiftOnchainOffer4.expires_at - 10;
                                                            pg6 pg6Var = new pg6((byte) 9);
                                                            ms7Var.m2 = i9;
                                                            ms7Var.n2 = pg6Var;
                                                            ms7Var.c1();
                                                            ms7Var.e1(ob6.M0(2131749533, null));
                                                            ms7Var.p2 = 2131749576;
                                                            ms7Var.f1(p);
                                                            String str = i8;
                                                            ms7Var.d1(new r77((Object) zArr, j4, i7, (Object) str, (byte) 15), new qt0(str, j4, i7, tL_messageActionStarGiftOnchainOffer4), new ns7(context3, i7, vnbVar3, ms7Var, (byte) 0));
                                                            ms7Var.show();
                                                        }
                                                    });
                                                }
                                            }
                                        }
                                        invalidate();
                                    } else if (this.g1 != null) {
                                        int i7 = r47Var.D;
                                        if (i7 == 37) {
                                            playSoundEffect(0);
                                            e S = LaunchActivity.S();
                                            if (S != null) {
                                                new xo2(S, ((TLRPC.TL_messageActionChangeCommunity) r47Var.k.action).community_id, null, null).show();
                                            }
                                        } else if (i7 == 31) {
                                            playSoundEffect(0);
                                            f0();
                                        } else if (i7 == 25) {
                                            playSoundEffect(0);
                                            if (this.g1 != null) {
                                                hl.c3(new jj1(this, (TLRPC.TL_messageActionGiftCode) this.Q0.k.action, (byte) 1));
                                            }
                                        } else if (i7 == 18) {
                                            playSoundEffect(0);
                                            e0();
                                        } else if (i7 == 30) {
                                            playSoundEffect(0);
                                            f0();
                                        } else {
                                            TLRPC.Message message4 = r47Var.k;
                                            if (message4 != null) {
                                                TLRPC.MessageAction messageAction = message4.action;
                                                if ((messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low) {
                                                    playSoundEffect(0);
                                                    TLRPC.Message message5 = this.Q0.k;
                                                    if (message5 != null) {
                                                        TLRPC.SuggestedPost suggestedPost = message5.suggested_post;
                                                        if (suggestedPost != null) {
                                                            b77Var = b77.b(suggestedPost);
                                                        } else {
                                                            TLRPC.MessageAction messageAction2 = message5.action;
                                                            if (messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                                                                b77Var = new b77(oj.m(((TLRPC.TL_messageActionSuggestedPostApproval) messageAction2).price), r1.schedule_date);
                                                            }
                                                        }
                                                        ojVar = b77Var.a;
                                                        if (ojVar != null && ojVar.a == pj.a) {
                                                            new dza(getContext(), this.h1, b77Var.a.a(), 13, ro4.i(i4, r47.B0(this.Q0.k)), null, r47.B0(this.Q0.k)).show();
                                                        }
                                                    }
                                                    b77Var = null;
                                                    ojVar = b77Var.a;
                                                    if (ojVar != null) {
                                                        new dza(getContext(), this.h1, b77Var.a.a(), 13, ro4.i(i4, r47.B0(this.Q0.k)), null, r47.B0(this.Q0.k)).show();
                                                    }
                                                }
                                            }
                                            if (((zn5) uc7.s1(i4).m4.get(r47Var.k.local_id)) == null) {
                                                boolean z13 = this.z1;
                                                al1 al1Var3 = this.g1;
                                                if (z13) {
                                                    al1Var3.o(this);
                                                } else {
                                                    al1Var3.J(this);
                                                }
                                            }
                                        }
                                    }
                                } else if (action3 != 2) {
                                    if (action3 == 3) {
                                        this.a0 = false;
                                        this.b0 = false;
                                        view.setPressed(false);
                                        v41Var3.c(false);
                                    }
                                } else if (!W(r47Var) || (!rectF.contains(x, y) && !this.N1.contains(x, y))) {
                                    this.b0 = false;
                                    view.setPressed(false);
                                    v41Var3.c(false);
                                }
                            } else if (this.a0) {
                                int action4 = motionEvent.getAction();
                                if (action4 == 1) {
                                    this.a0 = false;
                                    if (!this.p1 || this.o1 || (bl1Var = this.t1) == null) {
                                        int i8 = r47Var.D;
                                        if (i8 == 31) {
                                            f0();
                                        } else if (i8 == 25) {
                                            if (this.g1 != null) {
                                                hl.c3(new jj1(this, (TLRPC.TL_messageActionGiftCode) this.Q0.k.action, (byte) 1));
                                            }
                                        } else if (i8 == 18) {
                                            e0();
                                        } else if (i8 == 30) {
                                            f0();
                                        } else if (i8 == 33) {
                                            r47 r47Var2 = this.Q0;
                                            if (r47Var2 != null && (message = r47Var2.k) != null) {
                                                TLRPC.MessageAction messageAction3 = message.action;
                                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftOnchainOffer) {
                                                    starGift = ((TLRPC.TL_messageActionStarGiftOnchainOffer) messageAction3).gift;
                                                } else if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                                    starGift = ((TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction3).gift;
                                                }
                                                if ((starGift instanceof TL_stars.TL_starGiftUnique) && !TextUtils.isEmpty(starGift.slug)) {
                                                    playSoundEffect(0);
                                                    wua wuaVar = new wua(getContext(), this.I, 0L, this.h1, null);
                                                    wuaVar.n2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                                                    wuaVar.show();
                                                }
                                            }
                                        } else if (this.g1 != null) {
                                            if (i8 != 21 || (zn5Var = (zn5) uc7.s1(i4).m4.get(r47Var.k.local_id)) == null) {
                                                this.g1.o(this);
                                                playSoundEffect(0);
                                            } else {
                                                zn5Var.a();
                                            }
                                        }
                                    } else {
                                        int height2 = bl1Var.d.getHeight() - this.q1;
                                        this.o1 = true;
                                        al1 al1Var4 = this.g1;
                                        if (al1Var4 != null) {
                                            al1Var4.j(this);
                                            if (getParent() instanceof d79) {
                                                ((d79) getParent()).y0(0, hl.L(16.0f) + height2, null);
                                                return true;
                                            }
                                        }
                                    }
                                } else if (action4 != 2) {
                                    if (action4 == 3) {
                                        this.a0 = false;
                                    }
                                } else if (Y()) {
                                    if (!this.N1.contains(x, y)) {
                                        this.a0 = false;
                                    }
                                } else if (!imageReceiver.H(x, y)) {
                                    this.a0 = false;
                                }
                            }
                            z2 = false;
                        }
                    } else if (this.g1 != null) {
                        if ((r47Var.D == 11 || W(r47Var)) && imageReceiver.H(x, y)) {
                            this.a0 = true;
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (r47Var.D == 33 && this.N1.contains(x, y) && (this.y1 == null || !rectF.contains(x, y))) {
                            this.a0 = true;
                            z5 = true;
                        }
                        if (this.K1.i.q == 4 && (((i = r47Var.D) == 21 || i == 22) && this.N1.contains(x, y))) {
                            this.a0 = true;
                            z5 = true;
                        }
                        bl1 bl1Var4 = this.t1;
                        if (bl1Var4 == null || !this.p1) {
                            z6 = z5;
                            b = 4;
                        } else {
                            RectF rectF3 = hl.P;
                            float f4 = bl1Var4.a;
                            b = 4;
                            z6 = z5;
                            rectF3.set(f4, bl1Var4.b, bl1Var4.d.getWidth() + f4, this.t1.b + r1.d.getHeight());
                            if (rectF3.contains(x, y)) {
                                this.F = true;
                                z6 = true;
                            }
                        }
                        if (!W(r47Var) || this.y1 == null || (((tL_messageActionStarGiftOnchainOffer = this.c2) != null && this.d2 && vs7.l(i4, tL_messageActionStarGiftOnchainOffer.offer_id)) || !(rectF.contains(x, y) || (this.z1 && this.N1.contains(x, y))))) {
                            z7 = true;
                        } else {
                            z7 = true;
                            this.b0 = true;
                            view.setPressed(true);
                            v41Var3.c(true);
                            z6 = true;
                        }
                        if (!z6 && X()) {
                            this.F = z7;
                            z6 = true;
                        }
                        if (!z6) {
                            r47 r47Var3 = this.Q0;
                            if (atb.g((r47Var3 == null || (message3 = r47Var3.k) == null) ? null : message3.action, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                this.F = true;
                                z6 = true;
                            }
                        }
                        if (z6) {
                            x();
                        }
                        z2 = z6;
                    } else {
                        b = 4;
                        z2 = false;
                    }
                    if (!z2 && (motionEvent.getAction() == 0 || ((this.y != null || this.E != null) && motionEvent.getAction() == 1))) {
                        bl1 bl1Var5 = this.t1;
                        if (bl1Var5 != null && !bl1Var5.f.isEmpty() && !this.H) {
                            ArrayList arrayList2 = this.t1.f;
                            int size2 = arrayList2.size();
                            int i9 = 0;
                            while (true) {
                                if (i9 >= size2) {
                                    break;
                                }
                                Object obj2 = arrayList2.get(i9);
                                i9++;
                                npa npaVar = (npa) obj2;
                                Rect bounds = npaVar.getBounds();
                                bl1 bl1Var6 = this.t1;
                                if (bounds.contains((int) (x - bl1Var6.a), (int) (y - bl1Var6.b))) {
                                    this.y = null;
                                    if (motionEvent.getAction() == 0) {
                                        this.E = npaVar;
                                        z2 = true;
                                    } else {
                                        npa npaVar2 = this.E;
                                        z3 = true;
                                        if (npaVar == npaVar2) {
                                            this.H = true;
                                            npaVar2.q = new wk1(this, b);
                                            float sqrt = (float) Math.sqrt(Math.pow(this.t1.d.getHeight(), 2.0d) + Math.pow(this.t1.d.getWidth(), 2.0d));
                                            npa npaVar3 = this.E;
                                            bl1 bl1Var7 = this.t1;
                                            npaVar3.j((int) (x - bl1Var7.a), (int) (y - bl1Var7.b), sqrt, false);
                                            invalidate();
                                        }
                                        z2 = true;
                                    }
                                }
                            }
                        }
                        z3 = true;
                        if (!z2 && (staticLayout = this.N) != null) {
                            if (x >= this.S) {
                                float f5 = this.T;
                                if (y >= f5 && x <= r5 + this.O && y <= r6 + this.P) {
                                    float f6 = y - f5;
                                    float f7 = x - this.U;
                                    if (!z2) {
                                        int lineForVertical = staticLayout.getLineForVertical((int) f6);
                                        int offsetForHorizontal = this.N.getOffsetForHorizontal(lineForVertical, f7);
                                        float lineLeft = this.N.getLineLeft(lineForVertical);
                                        if (lineLeft <= f7 && this.N.getLineWidth(lineForVertical) + lineLeft >= f7) {
                                            CharSequence charSequence = r47Var.v;
                                            if (charSequence instanceof Spannable) {
                                                URLSpan[] uRLSpanArr = (URLSpan[]) ((Spannable) charSequence).getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
                                                if (uRLSpanArr.length != 0) {
                                                    if (motionEvent.getAction() == 0) {
                                                        this.y = uRLSpanArr[0];
                                                    } else {
                                                        URLSpan uRLSpan = uRLSpanArr[0];
                                                        URLSpan uRLSpan2 = this.y;
                                                        if (uRLSpan == uRLSpan2) {
                                                            d0(uRLSpan2);
                                                        }
                                                    }
                                                    z4 = z3;
                                                    z2 = z4;
                                                } else {
                                                    this.y = null;
                                                }
                                                z4 = z2;
                                                z2 = z4;
                                            }
                                        }
                                        this.y = null;
                                    }
                                }
                            }
                        }
                        this.y = null;
                    }
                    if (!z2) {
                        z2 = A(motionEvent);
                    }
                    return !z2 ? super.onTouchEvent(motionEvent) : z2;
                }
                return true;
            }
        }
        return true;
    }

    @Override // jf0
    public final boolean q() {
        al1 al1Var = this.g1;
        if (al1Var != null) {
            return al1Var.i0(this, this.z0, this.A0);
        }
        return false;
    }

    public void setCustomText(CharSequence charSequence) {
        this.S0 = charSequence;
        if (charSequence != null) {
            l0(false);
        }
    }

    public void setDelegate(al1 al1Var) {
        this.g1 = al1Var;
    }

    public void setInvalidateColors(boolean z) {
        if (this.f1 == z) {
            return;
        }
        this.f1 = z;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.u2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.w = view;
    }

    public void setInvalidatesParent(boolean z) {
        this.t2 = z;
    }

    public void setMessageObject(r47 r47Var) {
        i0(r47Var, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.k2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i) {
        this.l2 = i;
    }

    public void setScrimReaction(Integer num) {
        this.F0.z = num;
    }

    public void setShowTopic(boolean z) {
        if (this.n0 != z) {
            this.n0 = z;
            V();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z) {
        this.K0 = z;
        zoc zocVar = this.J0;
        if (zocVar != null) {
            zocVar.n(z);
        }
        ArrayList arrayList = this.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((npa) obj).invalidateSelf();
        }
    }

    public void setWalletSlidingOffset(float f) {
        setTranslationX((getTranslationX() - this.N0) + f);
        this.N0 = f;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.K || drawable == this.r || super.verifyDrawable(drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x067e, code lost:
    
        if (r11 == false) goto L290;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence L0;
        CharSequence charSequence3;
        boolean z;
        CharSequence Z;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.Photo photo;
        ArrayList<TLRPC.VideoSize> arrayList2;
        CharSequence charSequence4;
        int i;
        String G;
        CharSequence L02;
        CharSequence charSequence5;
        boolean z2;
        long j;
        boolean z3;
        SpannableStringBuilder spannableStringBuilder;
        long j2;
        TL_stars.StarGift starGift;
        String str;
        CharSequence S2;
        TL_stars.StarGift starGift2;
        String str2;
        CharSequence charSequence6;
        String q;
        TLRPC.Peer peer;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        int i2;
        TLRPC.MessageMedia messageMedia;
        r47 r47Var = this.Q0;
        int i3 = this.I;
        if (r47Var == null) {
            charSequence = this.S0;
        } else if (U()) {
            CharSequence q2 = c.C(i3).q(((TLRPC.TL_messageActionGramTransfer) r47Var.k.action).amount, false);
            if (!TextUtils.isEmpty(q2)) {
                charSequence = ob6.V(null, null, 2131742605, hm.cloneSpans(r47Var.v), q2);
                if (charSequence == null) {
                    TLRPC.Message message2 = r47Var.k;
                    if (message2 == null || (messageMedia = message2.media) == null || messageMedia.ttl_seconds == 0) {
                        charSequence = hm.cloneSpans(r47Var.v);
                    } else if (messageMedia.photo != null) {
                        charSequence = ob6.M0(2131753940, null);
                    } else {
                        TLRPC.Document document = messageMedia.document;
                        charSequence = ((document instanceof TLRPC.TL_documentEmpty) || ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && document == null)) ? messageMedia.voice ? ob6.M0(2131753922, null) : messageMedia.round ? ob6.M0(2131753933, null) : ob6.M0(2131753925, null) : hm.cloneSpans(r47Var.v);
                    }
                }
            }
            charSequence = null;
            if (charSequence == null) {
            }
        } else {
            if (r47Var.g3()) {
                charSequence = r47Var.k.media.user_id != yac.h(i3).e() ? t6b.e(new Object[0], 2131750838, true) : t6b.e(new Object[]{uc7.s1(i3).X1(Long.valueOf(r47.B0(r47Var.k))).first_name}, 2131750837, true);
            } else {
                al1 al1Var = this.g1;
                if (al1Var != null && al1Var.c() == 0 && r47.D4(r47Var)) {
                    charSequence = ro4.c(uc7.s1(i3).g4.f(-r47.B0(r47Var.k), r47.b2(i3, r47Var.k, true, false)), r47Var);
                }
                charSequence = null;
            }
            if (charSequence == null) {
            }
        }
        r47 r47Var2 = this.Q0;
        if (r47Var2 != null && r47Var2.j2) {
            charSequence = "";
        }
        if (r47Var2 != null && (message = r47Var2.k) != null && (messageAction = message.action) != null) {
            if (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                i2 = org.telegram.messenger.beta.R.drawable.mini_checklist_add;
            } else if (messageAction instanceof TLRPC.TL_messageActionTodoCompletions) {
                TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction;
                i2 = tL_messageActionTodoCompletions.incompleted.size() > tL_messageActionTodoCompletions.completed.size() ? org.telegram.messenger.beta.R.drawable.mini_checklist_undone : org.telegram.messenger.beta.R.drawable.mini_checklist_done;
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                spannableStringBuilder2.insert(0, (CharSequence) "i ");
                spannableStringBuilder2.setSpan(new wm2(i2, 0), 0, 1, 33);
                charSequence = spannableStringBuilder2;
            }
        }
        G(this.W, charSequence);
        if (this.P0 != null) {
            this.N = null;
            this.P = 0;
            this.Q = null;
            this.R = 0;
            this.T = 0;
        }
        if (r47Var != null) {
            TLRPC.Message message3 = r47Var.k;
            if (message3 != null) {
                TLRPC.MessageAction messageAction2 = message3.action;
                if ((messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction2).balance_too_low) {
                    F(null, null, charSequence, false, !xc2.z(i3, 24, r47.B0(message3)) ? ob6.M0(2131744808, null) : null, 11, null, this.j1, false);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                }
            }
            CharSequence charSequence7 = charSequence;
            if (message3 != null) {
                TLRPC.MessageAction messageAction3 = message3.action;
                if ((messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction3).rejected) {
                    F(null, null, charSequence7, false, null, 11, null, this.j1, false);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                }
            }
            int i4 = r47Var.D;
            if (i4 == 11) {
                float L = hl.L(19.0f) + this.P;
                float f = hl.u;
                this.J.i0((this.W - hl.u) / 2.0f, L, f, f);
            } else if (i4 == 25) {
                E();
            } else {
                long j3 = 0;
                TextPaint textPaint = this.G1;
                if (i4 == 30) {
                    TLRPC.User X1 = uc7.s1(i3).X1(Long.valueOf(r47.B0(this.Q0.k)));
                    TLRPC.MessageAction messageAction4 = r47Var.k.action;
                    if (messageAction4 instanceof TLRPC.TL_messageActionGiftStars) {
                        F(ob6.H(',', "ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction4).stars), null, hl.S2(this.Q0.O3() ? ob6.a0(null, null, 2131754624, lbc.l(X1)) : ob6.M0(2131754623, null)), false, ob6.M0(2131754619, null), 11, null, this.j1, true);
                    } else if ((messageAction4 instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction4).refunded) {
                        long e = yac.h(i3).e();
                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) r47Var.k.action;
                        if (r47Var.O3() != (!tL_messageActionStarGiftUnique.upgrade)) {
                            e = r47.B0(r47Var.k);
                        }
                        TLRPC.User X12 = uc7.s1(i3).X1(Long.valueOf(e));
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) ob6.M0(tL_messageActionStarGiftUnique.prepaid_upgrade ? 2131750389 : 2131750398, null)).append((CharSequence) " ");
                        if (X12 != null && X12.photo != null) {
                            spannableStringBuilder3.append((CharSequence) "a ");
                            gc0 gc0Var = new gc0(18.0f, i3, this);
                            gc0Var.e(X12);
                            spannableStringBuilder3.setSpan(gc0Var, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                        }
                        spannableStringBuilder3.append((CharSequence) lbc.l(X12));
                        F(spannableStringBuilder3, null, ob6.M0(2131750390, null), false, ob6.M0(2131754619, null), 12, ob6.M0(2131749840, null), this.j1, true);
                    } else if (messageAction4 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction4;
                        long j4 = tL_messageActionStarGift.convert_stars;
                        long e2 = yac.h(i3).e();
                        TLRPC.Peer peer2 = tL_messageActionStarGift.peer;
                        boolean z4 = peer2 != null && (!tL_messageActionStarGift.prepaid_upgrade || (peer2 instanceof TLRPC.TL_peerChannel));
                        boolean z5 = r47.B0(r47Var.k) == e2 && !z4;
                        long Z0 = r47Var.Z0();
                        if (!tL_messageActionStarGift.prepaid_upgrade && (peer = tL_messageActionStarGift.from_id) != null) {
                            Z0 = wf3.n(peer);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        TLObject b2 = uc7.s1(i3).b2(Z0);
                        long n = wf3.n(tL_messageActionStarGift.to_id);
                        TLObject b22 = uc7.s1(i3).b2(n);
                        if (!tL_messageActionStarGift.can_upgrade || tL_messageActionStarGift.converted) {
                            z2 = z4;
                            j = n;
                        } else {
                            z2 = z4;
                            j = n;
                            if (tL_messageActionStarGift.upgrade_stars > 0 && !tL_messageActionStarGift.upgraded) {
                                z3 = true;
                                if (j == 0 && tL_messageActionStarGift.auction_acquired && b22 != null) {
                                    spannableStringBuilder4.append((CharSequence) ob6.M0(2131750395, null)).append((CharSequence) " ");
                                    if (!(b22 instanceof TLRPC.User) ? !(!(b22 instanceof TLRPC.Chat) || ((TLRPC.Chat) b22).photo == null) : ((TLRPC.User) b22).photo != null) {
                                        spannableStringBuilder4.append((CharSequence) "a ");
                                        gc0 gc0Var2 = new gc0(18.0f, i3, this);
                                        rb0 rb0Var = gc0Var2.c;
                                        rb0Var.o(b22);
                                        gc0Var2.b.U(b22, rb0Var, null);
                                        spannableStringBuilder4.setSpan(gc0Var2, spannableStringBuilder4.length() - 2, spannableStringBuilder4.length() - 1, 33);
                                    }
                                    spannableStringBuilder = spannableStringBuilder4;
                                    spannableStringBuilder.append((CharSequence) wf3.t(b22));
                                    j2 = j4;
                                } else {
                                    spannableStringBuilder = spannableStringBuilder4;
                                    if (z5) {
                                        j2 = j4;
                                        spannableStringBuilder.append((CharSequence) ob6.M0(tL_messageActionStarGift.prepaid_upgrade ? 2131750389 : 2131750398, null)).append((CharSequence) " ");
                                        if (!(b2 instanceof TLRPC.User) ? !(!(b2 instanceof TLRPC.Chat) || ((TLRPC.Chat) b2).photo == null) : ((TLRPC.User) b2).photo != null) {
                                            spannableStringBuilder.append((CharSequence) "a ");
                                            gc0 gc0Var3 = new gc0(18.0f, i3, this);
                                            rb0 rb0Var2 = gc0Var3.c;
                                            rb0Var2.o(b2);
                                            gc0Var3.b.U(b2, rb0Var2, null);
                                            spannableStringBuilder.setSpan(gc0Var3, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                                        }
                                        spannableStringBuilder.append((CharSequence) wf3.t(b2));
                                    } else if (tL_messageActionStarGift.gift_num <= 0 || (starGift = tL_messageActionStarGift.gift) == null || (str = starGift.title) == null) {
                                        j2 = j4;
                                        spannableStringBuilder.append((CharSequence) ob6.M0(2131750400, null));
                                    } else {
                                        j2 = j4;
                                        spannableStringBuilder.append((CharSequence) str).append((CharSequence) " #").append((CharSequence) ob6.E(tL_messageActionStarGift.gift_num, ','));
                                    }
                                }
                                boolean z6 = !((r47Var.O3() || z5) && tL_messageActionStarGift.converted) && tL_messageActionStarGift.convert_stars > 0 && ((int) uc7.s1(i3).k4.D3.g(TimeUnit.SECONDS)) - (ConnectionsManager.getInstance(i3).getCurrentTime() - r47Var.k.date) > 0 && !tL_messageActionStarGift.refunded;
                                if (tL_messageActionStarGift.refunded) {
                                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                        textPaint.setTextSize(hl.L(13.0f));
                                        r47.a(spannableStringBuilder5, tL_messageActionStarGift.message.entities, false, true, true);
                                        S2 = r47.y5(textPaint.getFontMetricsInt(), pv3.m(spannableStringBuilder5, textPaint.getFontMetricsInt(), false, null, 0), tL_messageActionStarGift.message.entities);
                                    } else if (tL_messageActionStarGift.auction_acquired) {
                                        S2 = ob6.Z(2131750381, ob6.E(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (!z2) {
                                        long j5 = j2;
                                        if (z5) {
                                            S2 = (!tL_messageActionStarGift.converted || j5 <= 0) ? tL_messageActionStarGift.can_upgrade ? hl.S2(ob6.L0(2131750403)) : hl.S2(ob6.L0(2131750404)) : ob6.I((int) j5, "Gift2ActionConvertedInfo");
                                        } else if (z3) {
                                            S2 = hl.S2(r47Var.O3() ? ob6.Z(2131750391, lbc.l(X1)) : ob6.L0(2131750392));
                                        } else {
                                            S2 = r47Var.O3() ? (!z6 || j5 <= 0) ? tL_messageActionStarGift.can_upgrade ? hl.S2(ob6.Z(2131750412, lbc.l(X1))) : hl.S2(ob6.Z(2131750413, lbc.l(X1))) : hl.S2(ob6.J((int) j5, "Gift2ActionOutInfo", lbc.l(X1))) : tL_messageActionStarGift.converted ? ob6.I((int) j5, "Gift2ActionConvertedInfo") : tL_messageActionStarGift.saved ? !z6 ? ob6.L0(2131750427) : ob6.L0(2131750406) : !z6 ? ob6.L0(2131750428) : hl.S2(ob6.I((int) j5, "Gift2ActionInfo"));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        S2 = ob6.I((int) j2, "Gift2ActionConvertedInfo");
                                    } else {
                                        long j6 = j2;
                                        S2 = (!z6 || j6 <= 0) ? hl.S2(ob6.L0(2131750419)) : hl.S2(ob6.I((int) j6, "Gift2ActionInfoChannel"));
                                    }
                                } else {
                                    S2 = ob6.L0(2131750426);
                                }
                                CharSequence charSequence8 = S2;
                                starGift2 = tL_messageActionStarGift.gift;
                                if (starGift2 == null && starGift2.limited) {
                                    int i5 = starGift2.availability_total;
                                    str2 = ob6.Z(2131750094, i5 > 1500 ? hl.o0(i5, 0) : Integer.valueOf(i5));
                                } else {
                                    str2 = null;
                                }
                                CharSequence L03 = ob6.L0(2131754619);
                                if (r47Var.O3()) {
                                    charSequence6 = L03;
                                    if (!tL_messageActionStarGift.forceIn) {
                                    }
                                }
                                charSequence6 = L03;
                                charSequence6 = L03;
                                if (!r47Var.O3() && z3) {
                                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                                    spannableStringBuilder6.append("^  ");
                                    wm2 wm2Var = new wm2(org.telegram.messenger.beta.R.drawable.gift_unpack);
                                    wm2Var.I = 0.8f;
                                    wm2Var.J = 0.8f;
                                    spannableStringBuilder6.setSpan(wm2Var, 0, 1, 33);
                                    spannableStringBuilder6.append(ob6.L0(2131749831));
                                    charSequence6 = spannableStringBuilder6;
                                }
                                TL_stars.StarGift starGift3 = tL_messageActionStarGift.gift;
                                F(spannableStringBuilder, (starGift3 != null || starGift3.released_by == null || (q = wf3.q(uc7.s1(i3).b2(wf3.n(tL_messageActionStarGift.gift.released_by)))) == null) ? null : wua.k2(ob6.Z(2131750408, "@".concat(q))), charSequence8, false, charSequence6, 11, str2, this.j1, true);
                            }
                        }
                        z3 = false;
                        if (j == 0) {
                        }
                        spannableStringBuilder = spannableStringBuilder4;
                        if (z5) {
                        }
                        if (r47Var.O3()) {
                        }
                        if (tL_messageActionStarGift.refunded) {
                        }
                        CharSequence charSequence82 = S2;
                        starGift2 = tL_messageActionStarGift.gift;
                        if (starGift2 == null) {
                        }
                        str2 = null;
                        CharSequence L032 = ob6.L0(2131754619);
                        if (r47Var.O3()) {
                        }
                        charSequence6 = L032;
                        charSequence6 = L032;
                        if (!r47Var.O3()) {
                            SpannableStringBuilder spannableStringBuilder62 = new SpannableStringBuilder();
                            spannableStringBuilder62.append("^  ");
                            wm2 wm2Var2 = new wm2(org.telegram.messenger.beta.R.drawable.gift_unpack);
                            wm2Var2.I = 0.8f;
                            wm2Var2.J = 0.8f;
                            spannableStringBuilder62.setSpan(wm2Var2, 0, 1, 33);
                            spannableStringBuilder62.append(ob6.L0(2131749831));
                            charSequence6 = spannableStringBuilder62;
                        }
                        TL_stars.StarGift starGift32 = tL_messageActionStarGift.gift;
                        F(spannableStringBuilder, (starGift32 != null || starGift32.released_by == null || (q = wf3.q(uc7.s1(i3).b2(wf3.n(tL_messageActionStarGift.gift.released_by)))) == null) ? null : wua.k2(ob6.Z(2131750408, "@".concat(q))), charSequence82, false, charSequence6, 11, str2, this.j1, true);
                    } else if (messageAction4 instanceof TLRPC.TL_messageActionGiftTon) {
                        F(ob6.L0(2131754617), null, this.Q0.v, false, ob6.L0(2131754619), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else {
                        F(ob6.L0(2131754546), null, this.Q0.v, false, ob6.L0(2131754619), 11, null, this.j1, true);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    }
                } else if (i4 == 33) {
                    TLRPC.MessageAction messageAction5 = message3.action;
                    if (messageAction5 instanceof TLRPC.TL_messageActionStarGiftOnchainOffer) {
                        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) messageAction5;
                        HashMap hashMap = vs7.a;
                        this.e2 = Math.max(0, tL_messageActionStarGiftOnchainOffer.expires_at - ConnectionsManager.getInstance(i3).getCurrentTime());
                        boolean b0 = b0();
                        this.f2 = b0;
                        if (this.d2) {
                            if (b0) {
                                L02 = ob6.L0(2131748533);
                            } else {
                                L02 = ob6.L0(tL_messageActionStarGiftOnchainOffer.buyer ? 2131749513 : 2131749539);
                            }
                            charSequence5 = L02;
                        } else {
                            charSequence5 = null;
                        }
                        F(null, null, c0(vs7.d(tL_messageActionStarGiftOnchainOffer), tL_messageActionStarGiftOnchainOffer), false, charSequence5, 11, null, this.j1, this.d2 && !tL_messageActionStarGiftOnchainOffer.buyer);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else {
                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction5;
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(charSequence7);
                        spannableStringBuilder7.append((CharSequence) "\n\n");
                        if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                            spannableStringBuilder7.append((CharSequence) hl.S2(ob6.L0(2131749640)));
                        } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                            spannableStringBuilder7.append((CharSequence) hl.S2(ob6.L0(2131749637)));
                        } else {
                            int max = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i3).getCurrentTime());
                            if (max == 0) {
                                spannableStringBuilder7.append((CharSequence) hl.S2(ob6.L0(2131749639)));
                            } else {
                                int i6 = max / 60;
                                int i7 = max / 3600;
                                if (i7 > 0) {
                                    i = 0;
                                    G = ob6.G(i7, "ShortHoursAgo", new Object[0]) + " " + ob6.G(i6 % 60, "ShortMinutesAgo", new Object[0]);
                                } else {
                                    i = 0;
                                    G = ob6.G(i6, "ShortMinutesAgo", new Object[0]);
                                }
                                if (G.endsWith(".")) {
                                    G = bs2.n(1, i, G);
                                }
                                Object[] objArr = new Object[1];
                                objArr[i] = G;
                                spannableStringBuilder7.append((CharSequence) hl.S2(ob6.Z(2131749638, objArr)));
                            }
                        }
                        F(null, null, spannableStringBuilder7, false, null, 11, null, this.j1, false);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    }
                } else if (i4 == 34) {
                    F(null, null, charSequence7, false, null, 11, null, this.j1, false);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                } else if (i4 == 35) {
                    TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message3.action;
                    SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                    String t = wf3.t(uc7.s1(i3).X1(Long.valueOf(r47Var.A0())));
                    if (tL_messageActionNoForwardsRequest.new_value) {
                        spannableStringBuilder8.append(r47Var.N3() ? ob6.L0(2131745108) : hl.S2(ob6.Z(2131745111, t)));
                    } else {
                        spannableStringBuilder8.append(r47Var.N3() ? ob6.L0(2131745097) : hl.S2(ob6.Z(2131745100, t)));
                    }
                    if (tL_messageActionNoForwardsRequest.new_value) {
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) H(ob6.L0(2131745118)));
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) H(ob6.L0(2131745117)));
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) H(ob6.L0(2131745116)));
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) H(ob6.L0(2131745115)));
                    } else {
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) H(ob6.L0(2131745107)));
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) H(ob6.L0(2131745106)));
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) H(ob6.L0(2131745105)));
                        spannableStringBuilder8.append((CharSequence) "\n\n");
                        spannableStringBuilder8.append((CharSequence) H(ob6.L0(2131745104)));
                    }
                    F(null, null, spannableStringBuilder8, false, null, 11, null, this.j1, false);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                } else if (i4 == 31) {
                    TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift;
                    StringBuilder sb = new StringBuilder();
                    sb.append(starGift4.title);
                    sb.append(" #");
                    String m = qu6.m(starGift4.num, ',', sb);
                    long Z02 = r47Var.Z0();
                    F(null, null, hl.S2(yac.h(i3).e() == Z02 ? ob6.Z(2131749368, m) : ob6.Z(2131749369, wf3.r(i3, Z02), m)), false, ob6.L0(2131749370), 11, null, this.j1, true);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                } else if (i4 == 37) {
                    TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message3.action;
                    long n2 = wf3.n(message3.peer_id);
                    boolean U = xc2.U(i3, -n2);
                    boolean z7 = n2 > 0;
                    String r = wf3.r(i3, wf3.n(r47Var.k.from_id));
                    String r2 = wf3.r(i3, -tL_messageActionChangeCommunity.community_id);
                    SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder();
                    spannableStringBuilder9.append((CharSequence) gp2.a(r47Var, r2, r, U, z7));
                    F(null, null, spannableStringBuilder9, false, ob6.L0(2131749370), 11, null, this.j1, true);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                } else if (i4 == 18) {
                    TLRPC.MessageAction messageAction6 = message3.action;
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = messageAction6 instanceof TLRPC.TL_messageActionGiftPremium ? ((TLRPC.TL_messageActionGiftPremium) messageAction6).message : messageAction6 instanceof TLRPC.TL_messageActionGiftCode ? ((TLRPC.TL_messageActionGiftCode) messageAction6).message : null;
                    if (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) {
                        charSequence4 = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder(tL_textWithEntities2.text);
                        textPaint.setTextSize(hl.L(13.0f));
                        r47.a(spannableStringBuilder10, tL_textWithEntities2.entities, false, true, true);
                        charSequence4 = r47.y5(textPaint.getFontMetricsInt(), pv3.m(spannableStringBuilder10, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities2.entities);
                    }
                    if (charSequence4 == null) {
                        charSequence4 = ob6.L0(2131754634);
                    }
                    CharSequence charSequence9 = charSequence4;
                    r47 r47Var3 = this.Q0;
                    CharSequence L04 = ob6.L0((r47Var3 == null || !(r47Var3.k.action instanceof TLRPC.TL_messageActionGiftCode) || Z()) ? 2131754627 : 2131749449);
                    TLRPC.MessageAction messageAction7 = r47Var.k.action;
                    int i8 = messageAction7.months;
                    if (i8 >= 1) {
                        F(ob6.I(i8, "ActionGiftPremiumTitle2"), null, charSequence9, true, L04, 11, null, this.j1, false);
                    } else {
                        F(ob6.I(messageAction7.days, "ActionGiftPremiumTitle2Days"), null, charSequence9, true, L04, 11, null, this.j1, false);
                    }
                } else if (i4 == 21) {
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                    uc7 s1 = uc7.s1(i3);
                    if (!r47Var.O3()) {
                        j3 = r47Var.A0();
                    }
                    TLRPC.User X13 = s1.X1(Long.valueOf(j3));
                    boolean z8 = tL_messageActionSuggestProfilePhoto.video || !((photo = tL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = photo.video_sizes) == null || arrayList2.isEmpty());
                    if (X13.id == yac.h(i3).n) {
                        TLRPC.User X14 = uc7.s1(i3).X1(Long.valueOf(r47Var.A0()));
                        Z = z8 ? ob6.Z(2131754537, X14.first_name) : ob6.Z(2131754541, X14.first_name);
                    } else {
                        String str3 = X13.first_name;
                        Z = z8 ? ob6.Z(2131754535, str3) : ob6.Z(2131754539, str3);
                    }
                    F(null, null, Z, false, (tL_messageActionSuggestProfilePhoto.video || !((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) == null || arrayList.isEmpty())) ? ob6.L0(2131743191) : ob6.L0(2131743199), 11, null, this.j1, true);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                } else if (i4 == 22) {
                    TLRPC.User X15 = uc7.s1(i3).X1(Long.valueOf(r47Var.O3() ? 0L : r47Var.A0()));
                    if (r47Var.A0() < 0) {
                        charSequence3 = r47Var.v;
                    } else if (!r47Var.O3() && r47Var.X4() && r47Var.S2()) {
                        charSequence2 = r47Var.v;
                        L0 = ob6.L0(2131746013);
                        z = false;
                        F(null, null, charSequence2, false, L0, 11, null, this.j1, z);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else if (X15 == null || X15.id != yac.h(i3).n) {
                        charSequence2 = r47Var.v;
                        L0 = ob6.L0(2131743190);
                        z = true;
                        F(null, null, charSequence2, false, L0, 11, null, this.j1, z);
                        this.N = null;
                        this.P = 0;
                        this.Q = null;
                        this.R = 0;
                        this.T = 0;
                    } else {
                        charSequence3 = r47Var.v;
                    }
                    charSequence2 = charSequence3;
                    L0 = null;
                    z = true;
                    F(null, null, charSequence2, false, L0, 11, null, this.j1, z);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                } else if (r47Var.y4()) {
                    TLRPC.User X16 = uc7.s1(i3).X1(Long.valueOf(r47Var.k.media.user_id));
                    F(null, null, X16.self ? hl.S2(ob6.Z(2131744092, uc7.s1(i3).X1(Long.valueOf(r47Var.A0())).first_name)) : hl.S2(ob6.Z(2131744268, X16.first_name)), false, ob6.L0(2131744269), 11, null, this.j1, true);
                    this.N = null;
                    this.P = 0;
                    this.Q = null;
                    this.R = 0;
                    this.T = 0;
                }
            }
        }
        int L2 = hl.L(12.0f);
        x49 x49Var = this.F0;
        x49Var.b = L2;
        x49Var.o(this.W - hl.L(24.0f), 1);
    }

    @Override // jq3
    public final void B(boolean z) {
    }

    @Override // pk5
    public final void b(boolean z, boolean z2) {
    }

    @Override // jq3
    public final void i(long j, long j2) {
    }

    @Override // jq3
    public final void l(long j, long j2) {
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.t2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.t2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    public dl1(Context context) {
        this(null, context, false);
    }
}

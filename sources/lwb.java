// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class lwb extends FrameLayout implements gk7 {
    public static final /* synthetic */ int r0 = 0;
    public final FrameLayout E;
    public final View F;
    public final View G;
    public int H;
    public int I;
    public int J;
    public ValueAnimator K;
    public long L;
    public String M;
    public final ArrayList N;
    public int O;
    public zvb P;
    public oub Q;
    public boolean R;
    public final rkb S;
    public final gx0 T;
    public final ArrayList U;
    public long V;
    public Boolean W;
    public final int a;
    public float a0;
    public final long b;
    public ValueAnimator b0;
    public final boolean c;
    public boolean c0;
    public final boolean d;
    public float d0;
    public final wjb e;
    public float e0;
    public final or1 f;
    public boolean f0;
    public boolean g0;
    public final ar8 h;
    public float h0;
    public VelocityTracker i0;
    public boolean j0;
    public ValueAnimator k0;
    public final TextPaint l0;
    public final HashMap m0;
    public final ImageView n;
    public final TextPaint n0;
    public final TextPaint o0;
    public final TextPaint p0;
    public final TextPaint q0;
    public final o39 r;
    public final gwb s;
    public final EditText w;
    public final Paint x;
    public float y;

    public lwb(Activity activity, int i, long j, wjb wjbVar, final or1 or1Var) {
        super(activity);
        int i2;
        boolean z;
        boolean z2;
        String str;
        String M0;
        this.x = new Paint();
        this.H = -1;
        this.J = gl.L(288.0f);
        this.M = "";
        this.N = new ArrayList();
        this.U = new ArrayList();
        TextPaint textPaint = new TextPaint(1);
        this.l0 = textPaint;
        textPaint.setTextSize(gl.L(13.0f));
        textPaint.setTypeface(gl.o());
        this.m0 = new HashMap();
        TextPaint textPaint2 = new TextPaint(1);
        this.n0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.o0 = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.p0 = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        this.q0 = textPaint5;
        textPaint2.setTextSize(gl.L(16.0f));
        textPaint2.setTypeface(gl.o());
        textPaint3.setTextSize(gl.L(13.0f));
        textPaint4.setTextSize(gl.L(15.0f));
        de9.p(textPaint5, gl.L(12.0f));
        this.a = i;
        this.b = j;
        this.e = wjbVar;
        this.f = or1Var;
        TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
        boolean p0 = hc2.p0(K0);
        this.c = p0;
        boolean z3 = j == y6c.h(i).e();
        this.d = z3;
        setWillNotDraw(false);
        ar8 ar8Var = new ar8(activity, (byte) 18);
        this.h = ar8Var;
        ar8Var.setElevation(gl.L(9.0f));
        ar8Var.setOutlineProvider(new xi((byte) 20));
        ar8Var.setClipToOutline(true);
        ar8Var.setOnTouchListener(new wmb((byte) 2));
        addView(ar8Var, nme.e(kk7.K4, -1, 53));
        int i3 = gl.m;
        na7 q1 = na7.q1(i);
        be0 be0Var = new be0(activity);
        be0Var.setRoundRadius(gl.L(20.0f));
        pb0 pb0Var = new pb0((wjb) null);
        if (z3) {
            pb0Var.f(1);
            pb0Var.p = 0.75f;
            be0Var.setImageDrawable(pb0Var);
            String M02 = k96.M0(2131745709, null);
            i2 = i3;
            M0 = k96.G(q1.D1().j.size(), "Chats", new Object[0]);
            z = p0;
            z2 = z3;
            str = M02;
        } else {
            i2 = i3;
            z = p0;
            z2 = z3;
            if (p0) {
                TLRPC.Chat K02 = K0 != null ? q1.K0(Long.valueOf(K0.linked_monoforum_id)) : null;
                K02 = K02 == null ? K0 : K02;
                if (K02 != null) {
                    pb0Var.p(K02);
                    be0Var.f(K02, pb0Var);
                    str = K02.title;
                } else {
                    str = "";
                }
                M0 = k96.M0(2131743744, null);
            } else if (K0 != null) {
                pb0Var.p(K0);
                be0Var.f(K0, pb0Var);
                str = K0.title;
                TLRPC.ChatFull L0 = q1.L0(K0.id);
                int i4 = (L0 == null || (i4 = L0.participants_count) <= 0) ? K0.participants_count : i4;
                M0 = i4 > 0 ? k96.H(',', "Members", i4) : k96.M0(2131743757, null);
            } else {
                TLRPC.User V1 = q1.V1(Long.valueOf(j));
                if (V1 != null) {
                    pb0Var.q(V1);
                    be0Var.f(V1, pb0Var);
                    str = l7c.q(V1);
                } else {
                    str = "";
                }
                M0 = k96.M0(2131743757, null);
            }
        }
        zab zabVar = new zab(activity);
        int i5 = bkb.F6;
        boolean z4 = z;
        boolean z5 = z2;
        zabVar.setBackground(bkb.Y(bkb.p1(0.06f, bkb.v0(i5, wjbVar)), 24, 24));
        final byte b = 0;
        zabVar.setOnClickListener(new View.OnClickListener() { // from class: bwb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                or1 or1Var2 = or1Var;
                switch (b2) {
                    case 0:
                        mu1 mu1Var = or1Var2.a;
                        mu1Var.n0.d();
                        if (!mu1Var.S7()) {
                            boolean p02 = hc2.p0(mu1Var.e);
                            TLRPC.Chat chat = mu1Var.e;
                            if (!p02) {
                                if (chat == null) {
                                    TLRPC.User user = mu1Var.f;
                                    if (user != null) {
                                        mu1Var.presentFragment(ProfileActivity.P2(user.id));
                                        break;
                                    }
                                } else {
                                    mu1Var.presentFragment(ProfileActivity.P2(-chat.id));
                                    break;
                                }
                            } else {
                                mu1Var.presentFragment(ProfileActivity.P2(-chat.linked_monoforum_id));
                                break;
                            }
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", mu1Var.getUserConfig().e());
                            mu1Var.presentFragment(new zj6(bundle, null));
                            break;
                        }
                        break;
                    default:
                        mu1 mu1Var2 = or1Var2.a;
                        r7 r7Var = mu1Var2.j0;
                        if (r7Var != null && mu1Var2.n0 != null) {
                            r7Var.z();
                            o7 o7Var = r7Var.R;
                            if (o7Var != null) {
                                o7Var.N();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = mu1Var2.j0.getPopupLayout();
                            cs5 J = cs5.J(mu1Var2, view);
                            int i6 = 0;
                            boolean z6 = true;
                            while (true) {
                                byte b3 = 5;
                                if (i6 >= popupLayout.getItemsCount()) {
                                    J.W(5);
                                    J.b0(0.0f, -view.getHeight());
                                    J.a0();
                                    break;
                                } else {
                                    View childAt = popupLayout.M.getChildAt(i6);
                                    if (childAt != null && childAt.getVisibility() == 0) {
                                        if (childAt instanceof j8) {
                                            if (!z6) {
                                                J.j();
                                                z6 = true;
                                            }
                                        } else if (childAt instanceof a8) {
                                            a8 a8Var = (a8) childAt;
                                            CharSequence text = a8Var.getTextView().getText();
                                            Drawable drawable = a8Var.getIconResId() == 0 ? a8Var.getImageView().getDrawable() : null;
                                            Drawable oy8Var = ((a8Var.getTag() instanceof Integer) && ((Integer) a8Var.getTag()).intValue() == 29) ? new oy8(R.raw.boosts, gl.L(24.0f), gl.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                            p7 p7Var = mu1Var2.t1;
                                            if (p7Var == null || a8Var != p7Var.j) {
                                                if (a8Var.getTag() instanceof Integer) {
                                                    int intValue = ((Integer) a8Var.getTag()).intValue();
                                                    Drawable drawable2 = oy8Var;
                                                    J.a(a8Var.getIconResId(), drawable2, text, bkb.E8, bkb.D8, new ml1(mu1Var2, intValue, (byte) 3));
                                                    if (drawable2 instanceof oy8) {
                                                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) J.A;
                                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                        if (childAt2 instanceof a8) {
                                                            a8 a8Var2 = (a8) childAt2;
                                                            if (a8Var2.getImageView() instanceof ry8) {
                                                                ry8 ry8Var = (ry8) a8Var2.getImageView();
                                                                ry8Var.setAnimation((oy8) drawable2);
                                                                ry8Var.d();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    J.a(a8Var.getIconResId(), oy8Var, text, bkb.E8, bkb.D8, new nv0(a8Var, (byte) 25));
                                                }
                                            } else if (mu1Var2.getMessagesController().n2(mu1Var2.l6, mu1Var2.d(), null)) {
                                                J.b(a8Var.getIconResId(), text, new wl1(mu1Var2, (byte) 18), false);
                                            } else {
                                                J.b(a8Var.getIconResId(), text, new aj1(mu1Var2, J, b3), false);
                                            }
                                            z6 = false;
                                        }
                                    }
                                    i6++;
                                }
                            }
                        }
                        break;
                }
            }
        });
        ar8Var.addView(zabVar, nme.f(48.0f, -1, 51, gl.L(6.0f), i2 - gl.L(1.0f), gl.L(52.0f), 0));
        zabVar.addView(be0Var, nme.f(40.0f, 40, 51, gl.L(6.0f), gl.L(4.0f), 0, 0));
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int v0 = bkb.v0(i5, wjbVar);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v0, mode));
        final byte b2 = 1;
        imageView.setBackground(bkb.f0(bkb.p1(0.06f, bkb.v0(i5, wjbVar)), 1, -1));
        imageView.setContentDescription(k96.M0(2131754838, null));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: bwb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                or1 or1Var2 = or1Var;
                switch (b22) {
                    case 0:
                        mu1 mu1Var = or1Var2.a;
                        mu1Var.n0.d();
                        if (!mu1Var.S7()) {
                            boolean p02 = hc2.p0(mu1Var.e);
                            TLRPC.Chat chat = mu1Var.e;
                            if (!p02) {
                                if (chat == null) {
                                    TLRPC.User user = mu1Var.f;
                                    if (user != null) {
                                        mu1Var.presentFragment(ProfileActivity.P2(user.id));
                                        break;
                                    }
                                } else {
                                    mu1Var.presentFragment(ProfileActivity.P2(-chat.id));
                                    break;
                                }
                            } else {
                                mu1Var.presentFragment(ProfileActivity.P2(-chat.linked_monoforum_id));
                                break;
                            }
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", mu1Var.getUserConfig().e());
                            mu1Var.presentFragment(new zj6(bundle, null));
                            break;
                        }
                        break;
                    default:
                        mu1 mu1Var2 = or1Var2.a;
                        r7 r7Var = mu1Var2.j0;
                        if (r7Var != null && mu1Var2.n0 != null) {
                            r7Var.z();
                            o7 o7Var = r7Var.R;
                            if (o7Var != null) {
                                o7Var.N();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = mu1Var2.j0.getPopupLayout();
                            cs5 J = cs5.J(mu1Var2, view);
                            int i6 = 0;
                            boolean z6 = true;
                            while (true) {
                                byte b3 = 5;
                                if (i6 >= popupLayout.getItemsCount()) {
                                    J.W(5);
                                    J.b0(0.0f, -view.getHeight());
                                    J.a0();
                                    break;
                                } else {
                                    View childAt = popupLayout.M.getChildAt(i6);
                                    if (childAt != null && childAt.getVisibility() == 0) {
                                        if (childAt instanceof j8) {
                                            if (!z6) {
                                                J.j();
                                                z6 = true;
                                            }
                                        } else if (childAt instanceof a8) {
                                            a8 a8Var = (a8) childAt;
                                            CharSequence text = a8Var.getTextView().getText();
                                            Drawable drawable = a8Var.getIconResId() == 0 ? a8Var.getImageView().getDrawable() : null;
                                            Drawable oy8Var = ((a8Var.getTag() instanceof Integer) && ((Integer) a8Var.getTag()).intValue() == 29) ? new oy8(R.raw.boosts, gl.L(24.0f), gl.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                            p7 p7Var = mu1Var2.t1;
                                            if (p7Var == null || a8Var != p7Var.j) {
                                                if (a8Var.getTag() instanceof Integer) {
                                                    int intValue = ((Integer) a8Var.getTag()).intValue();
                                                    Drawable drawable2 = oy8Var;
                                                    J.a(a8Var.getIconResId(), drawable2, text, bkb.E8, bkb.D8, new ml1(mu1Var2, intValue, (byte) 3));
                                                    if (drawable2 instanceof oy8) {
                                                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) J.A;
                                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                        if (childAt2 instanceof a8) {
                                                            a8 a8Var2 = (a8) childAt2;
                                                            if (a8Var2.getImageView() instanceof ry8) {
                                                                ry8 ry8Var = (ry8) a8Var2.getImageView();
                                                                ry8Var.setAnimation((oy8) drawable2);
                                                                ry8Var.d();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    J.a(a8Var.getIconResId(), oy8Var, text, bkb.E8, bkb.D8, new nv0(a8Var, (byte) 25));
                                                }
                                            } else if (mu1Var2.getMessagesController().n2(mu1Var2.l6, mu1Var2.d(), null)) {
                                                J.b(a8Var.getIconResId(), text, new wl1(mu1Var2, (byte) 18), false);
                                            } else {
                                                J.b(a8Var.getIconResId(), text, new aj1(mu1Var2, J, b3), false);
                                            }
                                            z6 = false;
                                        }
                                    }
                                    i6++;
                                }
                            }
                        }
                        break;
                }
            }
        });
        ar8Var.addView(imageView, nme.f(40.0f, 40, 53, 0, gl.L(3.0f) + i2, gl.L(8.0f), 0));
        this.n = imageView;
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(gl.o());
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(bkb.v0(i5, wjbVar));
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        zabVar.addView(textView, nme.f(-2.0f, -1, 51, gl.L(58.0f), gl.L(7.0f), gl.L(6.0f), 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        int i6 = bkb.x6;
        textView2.setTextColor(bkb.v0(i6, wjbVar));
        textView2.setText(M0);
        textView2.setIncludeFontPadding(false);
        zabVar.addView(textView2, nme.f(-2.0f, -1, 51, gl.L(58.0f), gl.L(26.0f), gl.L(6.0f), 0));
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = gl.L(4.0f);
        frameLayout.setPadding(L, L, L, L);
        frameLayout.setBackground(new ewb(this, L));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(R.drawable.outline_header_search);
        imageView2.setColorFilter(new PorterDuffColorFilter(bkb.v0(i6, wjbVar), mode));
        frameLayout.addView(imageView2, nme.d(20, 20.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        EditText editText = new EditText(activity);
        this.w = editText;
        editText.setBackground(null);
        editText.setPadding(0, 0, 0, 0);
        editText.setTextSize(1, 15.0f);
        editText.setSingleLine();
        editText.setImeOptions(268435459);
        editText.setHint(k96.M0(2131745644, null));
        editText.setHintTextColor(bkb.v0(i6, wjbVar));
        editText.setTextColor(bkb.v0(i5, wjbVar));
        editText.addTextChangedListener(new jf6(this, (byte) 19));
        frameLayout.addView(editText, nme.d(-1, -1.0f, kk7.D1, 48.0f, 0.0f, 12.0f, 0.0f));
        ar8Var.addView(frameLayout, nme.f(48.0f, -1, 51, gl.L(12.0f) - L, (gl.L(56.0f) + i2) - L, gl.L(8.0f) - L, 0));
        o39 o39Var = new o39(activity, wjbVar);
        this.r = o39Var;
        o39Var.setLayoutManager(new t26());
        o39Var.setPadding(0, gl.L(4.0f), 0, gl.L(8.0f));
        o39Var.setClipToPadding(false);
        o39Var.setVerticalScrollBarEnabled(false);
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        s33 s33Var = s33.h;
        gb3Var.i = s33Var;
        gb3Var.n(350L);
        gb3Var.d = (short) 160;
        o39Var.setItemAnimator(gb3Var);
        o39Var.setSelectorRadius(gl.L(16.0f));
        o39Var.setSelectorDrawableColor(bkb.p1(0.06f, bkb.v0(i5, wjbVar)));
        gwb gwbVar = new gwb(this);
        this.s = gwbVar;
        o39Var.setAdapter(gwbVar);
        o39Var.setOnItemClickListener(new k0(this, or1Var, (byte) 22));
        o39Var.setOnItemLongClickListener((e39) new cwb(this, or1Var, (byte) 0));
        o39Var.j(new fwb(this, i, j));
        ar8Var.addView(o39Var, nme.f(-1.0f, -1, kk7.D1, gl.L(8.0f), gl.L(100.0f) + i2, gl.L(8.0f), 0));
        rkb rkbVar = new rkb(activity, wjbVar, (byte) 13);
        this.S = rkbVar;
        rkbVar.setLayoutManager(new t26(0, false));
        rkbVar.setPadding(gl.L(9.0f), 0, gl.L(9.0f), 0);
        rkbVar.setClipToPadding(false);
        rkbVar.setHorizontalScrollBarEnabled(false);
        rkbVar.setOverScrollMode(2);
        gb3 gb3Var2 = new gb3();
        gb3Var2.m = false;
        gb3Var2.C = false;
        gb3Var2.o(s33Var);
        gb3Var2.n(320L);
        rkbVar.setItemAnimator(gb3Var2);
        gx0 gx0Var = new gx0(this, (byte) 11);
        this.T = gx0Var;
        rkbVar.setAdapter(gx0Var);
        rkbVar.setOnItemClickListener(new f09(this, (byte) 26));
        rkbVar.setVisibility(8);
        ar8Var.addView(rkbVar, nme.f(36.0f, -1, 51, 0, gl.L(100.0f) + i2, 0, 0));
        int i7 = bkb.c6;
        int v02 = bkb.v0(i7, wjbVar);
        View view = new View(activity);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{v02, bm2.o(v02, 0)}));
        ar8Var.addView(view, nme.f(gl.L(16.0f), -1, 51, 0, gl.L(100.0f) + i2, 0, 0));
        View view2 = new View(activity);
        this.G = view2;
        view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{v02, bm2.o(v02, 0)}));
        ar8Var.addView(view2, nme.e(-1, 24, 87));
        this.F = view;
        o();
        TLRPC.User V12 = j > 0 ? na7.q1(i).V1(Long.valueOf(j)) : null;
        if (!z4 && !z5 && ((K0 != null && hc2.w(15, K0)) || l7c.w(V12))) {
            FrameLayout frameLayout2 = new FrameLayout(activity);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(gl.L(25.0f));
            gradientDrawable.setColor(bm2.o(v02, kk7.A3));
            frameLayout2.setBackground(gradientDrawable);
            frameLayout2.setElevation(gl.L(2.0f));
            frameLayout2.setPadding(gl.L(3.0f), gl.L(3.0f), gl.L(3.0f), gl.L(3.0f));
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(gl.o());
            int i8 = bkb.Ii;
            textView3.setTextColor(bkb.v0(i8, wjbVar));
            textView3.setText(k96.M0(2131748059, null));
            textView3.setGravity(17);
            textView3.setPadding(gl.L(20.0f), 0, gl.L(22.0f), 0);
            textView3.setCompoundDrawablePadding(gl.L(8.0f));
            Drawable mutate = activity.getDrawable(R.drawable.filled_topic_new_24).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(bkb.v0(i8, wjbVar), mode));
            textView3.setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setBackground(bkb.b0(gl.L(22.0f), bkb.v0(bkb.Ei, wjbVar)));
            ote.a(textView3);
            textView3.setOnClickListener(new b99(this, or1Var, (byte) 29));
            frameLayout2.addView(textView3, nme.c(44.0f, -2));
            ar8Var.addView(frameLayout2, nme.d(-2, 50.0f, 81, 0.0f, 0.0f, 0.0f, 8.0f));
            this.E = frameLayout2;
        }
        ar8Var.setBackgroundColor(bkb.v0(i7, wjbVar));
        setProgress(0.0f);
    }

    private int getPanelWidth() {
        return this.J + this.I;
    }

    private void setTagsShown(boolean z) {
        if (this.j0 == z) {
            return;
        }
        this.j0 = z;
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z ? 1.0f : 0.0f);
        this.b0 = ofFloat;
        ofFloat.addUpdateListener(new xvb(this, (byte) 1));
        this.b0.addListener(new dwb(this, (byte) 0));
        this.b0.setDuration(320L);
        this.b0.setInterpolator(s33.h);
        this.b0.start();
    }

    public final void a(float f, float f2) {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        float f3 = this.y;
        if (f3 == f) {
            setProgress(f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new xvb(this, (byte) 2));
        this.K.addListener(new dwb(this, (byte) 2));
        this.K.setDuration(Math.abs(f2) > ((float) gl.L(300.0f)) ? (long) Math.max(150.0f, Math.min(320.0f, ((Math.abs(f - this.y) * getPanelWidth()) / Math.abs(f2)) * 1000.0f * 2.0f)) : 320L);
        this.K.setInterpolator(s33.h);
        this.K.start();
    }

    public final void b(float f) {
        rkb rkbVar = this.S;
        int childCount = rkbVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = rkbVar.getChildAt(i);
            float R1 = gl.R1(0.6f, 1.0f, f);
            childAt.setScaleX(R1);
            childAt.setScaleY(R1);
            childAt.setAlpha(f);
        }
    }

    public final void c() {
        zvb zvbVar = this.P;
        if (zvbVar != null) {
            gl.r(zvbVar);
            this.P = null;
        }
        if (this.O != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.O, true);
            this.O = 0;
        }
    }

    public final void d() {
        a(0.0f, 0.0f);
        gl.t1(this.w);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.s5) {
            if (((Long) objArr[0]).longValue() == (-this.b)) {
                n();
            }
        } else {
            if (i == 2) {
                n();
                return;
            }
            if (i == kk7.h3) {
                if (this.d) {
                    n();
                }
            } else if (i == kk7.k4) {
                gl.d0(this.r, new bm0((byte) 12));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int p1 = bkb.p1(this.y, 687865856);
        Paint paint = this.x;
        paint.setColor(p1);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        or1 or1Var = this.f;
        if (or1Var != null && this.y > 0.0f) {
            or1Var.a.r6(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c0 = true;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return dispatchTouchEvent;
        }
        this.c0 = false;
        setVisibility(this.y <= 0.0f ? 8 : 0);
        return dispatchTouchEvent;
    }

    public final TLObject e(hwb hwbVar) {
        long n;
        na7 q1 = na7.q1(this.a);
        up9 up9Var = hwbVar.b;
        if (up9Var != null) {
            n = up9Var.a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic = hwbVar.a;
            if (tL_forumTopic == null || !this.c) {
                return null;
            }
            n = cf3.n(tL_forumTopic.from_id);
        }
        return n >= 0 ? q1.V1(Long.valueOf(n)) : q1.K0(Long.valueOf(-n));
    }

    public final String f(long j) {
        int i = this.a;
        na7 q1 = na7.q1(i);
        if (j == y6c.h(i).e()) {
            return k96.M0(2131748111, null);
        }
        if (j == 2666000) {
            return k96.M0(2131754249, null);
        }
        if (j >= 0) {
            return l7c.q(q1.V1(Long.valueOf(j)));
        }
        TLRPC.Chat K0 = q1.K0(Long.valueOf(-j));
        return K0 != null ? K0.title : "";
    }

    public final boolean g() {
        return (this.d || this.c || this.b >= 0) ? false : true;
    }

    public int getContentWidth() {
        return this.J;
    }

    public float getProgress() {
        return this.y;
    }

    public final boolean h() {
        return (this.V == 0 && this.W == null) ? false : true;
    }

    public final boolean i() {
        if (this.d || this.c) {
            return false;
        }
        return !TextUtils.isEmpty(this.M) || h();
    }

    public final void j() {
        if (this.P == null && this.O == 0 && !this.R && i()) {
            String str = this.M;
            long j = this.V;
            Boolean bool = this.W;
            pub pubVar = na7.q1(this.a).g4;
            long j2 = -this.b;
            oub oubVar = this.Q;
            awb awbVar = new awb(this, str, j, bool);
            pubVar.getClass();
            TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
            tL_messages_getForumTopics.peer = pubVar.getMessagesController().h1(-j2);
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            tL_messages_getForumTopics.q = str;
            tL_messages_getForumTopics.icon_emoji_id = j != 0 ? Long.valueOf(j) : null;
            tL_messages_getForumTopics.closed = bool;
            if (oubVar != null) {
                tL_messages_getForumTopics.offset_date = oubVar.a;
                tL_messages_getForumTopics.offset_id = oubVar.b;
                tL_messages_getForumTopics.offset_topic = oubVar.c;
            }
            tL_messages_getForumTopics.limit = 50;
            this.O = pubVar.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new w47((Object) pubVar, j2, (Object) awbVar, (byte) 18));
        }
    }

    public final boolean k(hwb hwbVar) {
        if (!h()) {
            return true;
        }
        TLRPC.TL_forumTopic tL_forumTopic = hwbVar.a;
        if (tL_forumTopic == null) {
            return false;
        }
        long j = this.V;
        if (j != 0 && tL_forumTopic.icon_emoji_id != j) {
            return false;
        }
        Boolean bool = this.W;
        return bool == null || tL_forumTopic.closed == bool.booleanValue();
    }

    public final void l(boolean z) {
        c();
        this.N.clear();
        this.Q = null;
        this.R = false;
        if (i()) {
            zvb zvbVar = new zvb(this, (byte) 0);
            this.P = zvbVar;
            gl.e3(zvbVar, z ? 350L : 0L);
        }
    }

    public final boolean m(hwb hwbVar) {
        String str;
        up9 up9Var = hwbVar.b;
        String str2 = "";
        if (up9Var != null) {
            String f = f(up9Var.a);
            if (f != null) {
                str2 = f.toString();
            }
        } else {
            TLObject e = e(hwbVar);
            if (e instanceof TLRPC.User) {
                str2 = l7c.q((TLRPC.User) e);
            } else if (e instanceof TLRPC.Chat) {
                str2 = ((TLRPC.Chat) e).title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic = hwbVar.a;
                if (tL_forumTopic != null && (str = tL_forumTopic.title) != null) {
                    str2 = str;
                }
            }
        }
        return str2.toLowerCase().contains(this.M);
    }

    public final void n() {
        float f;
        boolean z;
        ArrayList l;
        boolean z2;
        String str;
        float f2;
        ArrayList arrayList;
        boolean z3;
        int visibility = getVisibility();
        gwb gwbVar = this.s;
        if (visibility == 0 || this.y > 0.0f || gwbVar.c.size() <= 0) {
            ArrayList arrayList2 = gwbVar.c;
            String str2 = gwbVar.d;
            lwb lwbVar = gwbVar.e;
            long j = lwbVar.b;
            int i = lwbVar.a;
            String str3 = lwbVar.M;
            boolean z4 = lwbVar.d;
            boolean z5 = TextUtils.equals(str2, str3) && lwbVar.y > 0.0f && !arrayList2.isEmpty();
            gwbVar.d = lwbVar.M;
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList2.clear();
            if (z4) {
                f = 0.0f;
                z = z5;
                l = null;
            } else {
                f = 0.0f;
                z = z5;
                l = na7.q1(i).g4.l(-j);
            }
            if (z4) {
                z2 = z4;
                str = null;
            } else {
                gx0 gx0Var = lwbVar.T;
                ArrayList arrayList4 = lwbVar.U;
                if (lwbVar.g()) {
                    f2 = f;
                    arrayList = (ArrayList) na7.q1(i).g4.f.f(-j);
                } else {
                    f2 = f;
                    arrayList = null;
                }
                ArrayList arrayList5 = new ArrayList();
                z2 = z4;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        long longValue = ((Long) obj).longValue();
                        if (longValue != 0) {
                            ArrayList arrayList6 = arrayList;
                            iwb iwbVar = new iwb();
                            iwbVar.a = longValue;
                            arrayList5.add(iwbVar);
                            arrayList = arrayList6;
                        }
                    }
                }
                if (lwbVar.g()) {
                    boolean[] zArr = {false, true};
                    for (int i3 = 0; i3 < 2; i3++) {
                        boolean z6 = zArr[i3];
                        iwb iwbVar2 = new iwb();
                        iwbVar2.b = Boolean.valueOf(z6);
                        arrayList5.add(iwbVar2);
                    }
                }
                if (arrayList5.isEmpty() && lwbVar.h()) {
                    lwbVar.V = 0L;
                    str = null;
                    lwbVar.W = null;
                    lwbVar.l(false);
                } else {
                    str = null;
                }
                ArrayList arrayList7 = new ArrayList(arrayList4);
                arrayList4.clear();
                arrayList4.addAll(arrayList5);
                if (arrayList7.isEmpty() || arrayList5.isEmpty() || lwbVar.a0 <= f2) {
                    z3 = true;
                    gx0Var.f();
                } else {
                    ia iaVar = new ia(arrayList7, arrayList5);
                    z3 = true;
                    vu7.a(iaVar, true).c(gx0Var);
                }
                lwbVar.setTagsShown(arrayList4.isEmpty() ^ z3);
            }
            if (TextUtils.isEmpty(lwbVar.M) && !lwbVar.h()) {
                arrayList2.add(new hwb(lwbVar));
            }
            if (z2) {
                ArrayList arrayList8 = na7.q1(i).D1().j;
                int size2 = arrayList8.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList8.get(i4);
                    i4++;
                    hwb hwbVar = new hwb(lwbVar);
                    hwbVar.b = (up9) obj2;
                    if (!TextUtils.isEmpty(lwbVar.M) && !lwbVar.m(hwbVar)) {
                        TLObject e = lwbVar.e(hwbVar);
                        String o = e instanceof TLRPC.User ? l7c.o((TLRPC.User) e) : e instanceof TLRPC.Chat ? hc2.K((TLRPC.Chat) e, false) : str;
                        if (o != null && o.toLowerCase().contains(lwbVar.M)) {
                        }
                    }
                    arrayList2.add(hwbVar);
                }
                gwbVar.E(arrayList3, z);
            } else {
                boolean z7 = z;
                HashSet hashSet = new HashSet();
                if (l != null) {
                    int size3 = l.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        Object obj3 = l.get(i5);
                        i5++;
                        hwb hwbVar2 = new hwb(lwbVar);
                        hwbVar2.a = (TLRPC.TL_forumTopic) obj3;
                        if (!TextUtils.isEmpty(lwbVar.M) && !lwbVar.m(hwbVar2)) {
                            TLObject e2 = lwbVar.e(hwbVar2);
                            String o2 = e2 instanceof TLRPC.User ? l7c.o((TLRPC.User) e2) : e2 instanceof TLRPC.Chat ? hc2.K((TLRPC.Chat) e2, false) : str;
                            if (o2 != null && o2.toLowerCase().contains(lwbVar.M)) {
                            }
                        }
                        if (lwbVar.k(hwbVar2)) {
                            arrayList2.add(hwbVar2);
                            hashSet.add(Long.valueOf(hwbVar2.a()));
                        }
                    }
                }
                if (lwbVar.i()) {
                    ArrayList arrayList9 = lwbVar.N;
                    int size4 = arrayList9.size();
                    int i6 = 0;
                    while (i6 < size4) {
                        Object obj4 = arrayList9.get(i6);
                        i6++;
                        hwb hwbVar3 = new hwb(lwbVar);
                        hwbVar3.a = (TLRPC.TL_forumTopic) obj4;
                        if (lwbVar.k(hwbVar3) && hashSet.add(Long.valueOf(hwbVar3.a()))) {
                            arrayList2.add(hwbVar3);
                        }
                    }
                }
                gwbVar.E(arrayList3, z7);
            }
            this.r.post(new zvb(this, (byte) 1));
        }
    }

    public final void o() {
        View view;
        View view2 = this.F;
        if (view2 == null || (view = this.G) == null) {
            return;
        }
        o39 o39Var = this.r;
        view2.setAlpha(Utilities.i(o39Var.computeVerticalScrollOffset() / gl.L(16.0f), 1.0f, 0.0f));
        if (this.E != null) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(Utilities.i(((o39Var.computeVerticalScrollRange() - o39Var.computeVerticalScrollOffset()) - o39Var.computeVerticalScrollExtent()) / gl.L(16.0f), 1.0f, 0.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.a;
        kk7.f(i).a(this, kk7.s5);
        kk7.f(i).a(this, 2);
        kk7.f(i).a(this, kk7.h3);
        kk7.e().a(this, kk7.k4);
        if (g()) {
            pub pubVar = na7.q1(i).g4;
            long j = -this.b;
            LongSparseIntArray longSparseIntArray = pubVar.n;
            long j2 = -j;
            if (!pubVar.getMessagesController().x2(j2) && longSparseIntArray.get(j, 0) == 0 && System.currentTimeMillis() - pubVar.h.get(j, 0L) >= 300000) {
                longSparseIntArray.put(j, 1);
                TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
                tL_messages_getForumTopics.peer = pubVar.getMessagesController().h1(j2);
                tL_messages_getForumTopics.limit = 1;
                pubVar.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new eu2(pubVar, j, (byte) 7));
            }
        }
        n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        kk7.f(i).n(this, kk7.s5);
        kk7.f(i).n(this, 2);
        kk7.f(i).n(this, kk7.h3);
        kk7.e().n(this, kk7.k4);
        c();
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.d0 = motionEvent.getX();
            this.e0 = motionEvent.getY();
            this.f0 = false;
            this.g0 = true;
            this.h0 = this.y;
            VelocityTracker velocityTracker = this.i0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            VelocityTracker obtain = VelocityTracker.obtain();
            this.i0 = obtain;
            obtain.addMovement(motionEvent);
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && this.g0) {
            VelocityTracker velocityTracker2 = this.i0;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            float x = motionEvent.getX() - this.d0;
            float y = motionEvent.getY() - this.e0;
            if (x > ViewConfiguration.get(getContext()).getScaledTouchSlop() && Math.abs(x) > Math.abs(y) * 1.5f) {
                this.f0 = true;
                this.d0 = motionEvent.getX();
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WeakHashMap weakHashMap = jdc.a;
        vxc a = cdc.a(this);
        int i5 = a != null ? a.a.f(2).d : 0;
        if (i5 != this.H) {
            this.H = i5;
            o39 o39Var = this.r;
            View view = this.G;
            FrameLayout frameLayout = this.E;
            if (frameLayout != null) {
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin = gl.L(8.0f) + i5;
                view.getLayoutParams().height = gl.L(64.0f) + i5;
                o39Var.setPadding(0, gl.L(4.0f), 0, gl.L(66.0f) + i5);
            } else {
                view.getLayoutParams().height = gl.L(24.0f) + i5;
                o39Var.setPadding(0, gl.L(4.0f), 0, gl.L(8.0f) + i5);
            }
            this.h.requestLayout();
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        mu1 mu1Var;
        r7 f7;
        a aVar;
        WeakHashMap weakHashMap = jdc.a;
        vxc a = cdc.a(this);
        int i3 = 0;
        int i4 = a != null ? gl.H0(a, false).c : 0;
        int i5 = this.I;
        ar8 ar8Var = this.h;
        if (i4 != i5) {
            this.I = i4;
            ar8Var.getLayoutParams().width = getPanelWidth();
            ar8Var.setPadding(0, 0, i4, 0);
            ar8Var.setTranslationX((1.0f - this.y) * getPanelWidth());
        }
        int size = View.MeasureSpec.getSize(i);
        or1 or1Var = this.f;
        if (or1Var != null && (f7 = (mu1Var = or1Var.a).f7()) != null) {
            View view = (View) f7.getParent();
            aVar = ((d) mu1Var).actionBar;
            i3 = (int) ((aVar.getWidth() - ((f7.getWidth() / 2.0f) + (f7.getX() + view.getX()))) + gl.L(31.0f));
        }
        int max = Math.max(gl.L(200.0f), Math.min(gl.L(288.0f), (size - this.I) - i3));
        if (max != this.J) {
            this.J = max;
            ar8Var.getLayoutParams().width = getPanelWidth();
            ar8Var.setTranslationX((1.0f - this.y) * getPanelWidth());
            this.s.f();
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.y <= 0.0f) {
            return false;
        }
        VelocityTracker velocityTracker = this.i0;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.i0 = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.d0 = motionEvent.getX();
            this.e0 = motionEvent.getY();
            this.f0 = false;
            this.h0 = this.y;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float x = motionEvent.getX() - this.d0;
                if (!this.f0 && Math.abs(x) > ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    this.f0 = true;
                    this.d0 = motionEvent.getX();
                    this.h0 = this.y;
                }
                if (this.f0) {
                    ValueAnimator valueAnimator = this.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.K = null;
                    }
                    setProgress(this.h0 - ((motionEvent.getX() - this.d0) / this.J));
                }
            }
            return true;
        }
        if (this.f0) {
            this.i0.computeCurrentVelocity(1000);
            settle(this.i0.getXVelocity());
        } else if (motionEvent.getActionMasked() == 1 && motionEvent.getX() < getWidth() - (getPanelWidth() * this.y)) {
            d();
        }
        this.f0 = false;
        this.g0 = false;
        this.i0.recycle();
        this.i0 = null;
        return true;
    }

    public void setCurrentTopic(long j) {
        this.L = j;
        this.s.f();
    }

    public void setMenuAvailable(boolean z) {
        ImageView imageView = this.n;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void setProgress(float f) {
        byte b = 0;
        boolean z = this.y <= 0.0f && f > 0.0f;
        this.y = Utilities.l(f);
        if (z && this.S != null) {
            ValueAnimator valueAnimator = this.k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.j0 && this.b0 == null) {
                b(0.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.k0 = ofFloat;
                ofFloat.addUpdateListener(new xvb(this, b));
                this.k0.addListener(new dwb(this, (byte) 1));
                this.k0.setDuration(320L);
                this.k0.setInterpolator(s33.h);
                this.k0.start();
            }
        }
        this.h.setTranslationX((1.0f - this.y) * getPanelWidth());
        if (this.y <= 0.0f && !this.c0) {
            b = 8;
        }
        setVisibility(b);
        invalidate();
        or1 or1Var = this.f;
        if (or1Var != null) {
            or1Var.a.m1.invalidate();
        }
    }

    public void settle(float f) {
        boolean z = false;
        float f2 = 0.0f;
        if (Math.abs(f) <= gl.L(300.0f) ? this.y > 0.5f : f < 0.0f) {
            z = true;
        }
        if (z) {
            n();
            f2 = 1.0f;
        }
        a(f2, f);
        if (z) {
            return;
        }
        gl.t1(this.w);
    }
}

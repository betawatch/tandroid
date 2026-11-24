// default package

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class g48 extends d implements gk7 {
    public final boolean E;
    public final boolean F;
    public final mu1 G;
    public byte H;
    public boolean I;
    public m8 J;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K;
    public a8[] L;
    public FrameLayout M;
    public rt3 N;
    public oc6 O;
    public ImageView P;
    public e48 Q;
    public sb R;
    public View S;
    public final TextPaint T;
    public final RectF U;
    public final Paint V;
    public f48 W;
    public Editable a;
    public final HashMap b;
    public final ArrayList c;
    public ArrayList d;
    public boolean e;
    public byte f;
    public o39 h;
    public s20 n;
    public FrameLayout r;
    public TextView s;
    public boolean w;
    public final byte x;
    public boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    public g48(int i, boolean z, boolean z2, mu1 mu1Var) {
        super(null);
        this.b = new HashMap();
        this.c = new ArrayList();
        this.d = null;
        this.e = false;
        this.f = (byte) 2;
        this.y = true;
        this.I = true;
        this.T = new TextPaint(1);
        this.U = new RectF();
        this.V = new Paint(1);
        this.G = mu1Var;
        this.x = i;
        this.E = z;
        this.F = z2;
    }

    public final void Y(xl6 xl6Var) {
        byte b = 23;
        if (xl6Var != null) {
            u58 u58Var = new u58(0, xl6Var, this.b, this.c, this.x, this.F, this.G, false);
            Editable text = this.N.getText();
            this.a = text;
            u58Var.d = text;
            rt3 rt3Var = u58Var.e0;
            if (rt3Var != null) {
                rt3Var.setText(text);
            }
            u58Var.t0 = new z24(this, b);
            u58Var.j0(this.H, this.I);
            presentFragment(u58Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        boolean z = this.E;
        byte b2 = this.x;
        boolean z2 = this.F;
        if (!z) {
            u58 u58Var2 = new u58(0, xl6Var, hashMap, arrayList, b2, z2, this.G, false);
            Editable text2 = this.N.getText();
            this.a = text2;
            u58Var2.d = text2;
            rt3 rt3Var2 = u58Var2.e0;
            if (rt3Var2 != null) {
                rt3Var2.setText(text2);
            }
            u58Var2.t0 = new d48(this, hashMap, arrayList, (byte) 0);
            u58Var2.j0(this.H, this.I);
            presentFragment(u58Var2);
            return;
        }
        b68 b68Var = new b68(hashMap, arrayList, b2, z2, this.G);
        Editable text3 = this.N.getText();
        this.a = text3;
        u58 u58Var3 = b68Var.a;
        if (u58Var3 != null) {
            u58Var3.d = text3;
            rt3 rt3Var3 = u58Var3.e0;
            if (rt3Var3 != null) {
                rt3Var3.setText(text3);
            }
        }
        d48 d48Var = new d48(this, hashMap, arrayList, (byte) 1);
        u58Var3.t0 = d48Var;
        u58 u58Var4 = b68Var.b;
        u58Var4.t0 = d48Var;
        u58Var3.u0 = new s34(b68Var, b);
        u58Var4.u0 = new pj4((Object) b68Var, (byte) 24);
        byte b3 = this.H;
        boolean z3 = this.I;
        u58Var3.j0(b3, z3);
        u58Var4.j0(b3, z3);
        presentFragment(b68Var);
    }

    public final void Z(HashMap hashMap, ArrayList arrayList, boolean z, int i) {
        if (hashMap.isEmpty() || this.W == null || this.w) {
            return;
        }
        this.w = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = hashMap.get(arrayList.get(i2));
            y3a y3aVar = new y3a();
            arrayList2.add(y3aVar);
            if (obj instanceof jm6) {
                jm6 jm6Var = (jm6) obj;
                String str = jm6Var.h;
                if (str != null) {
                    y3aVar.c = str;
                } else {
                    y3aVar.c = jm6Var.I;
                }
                y3aVar.e = jm6Var.c;
                y3aVar.f = jm6Var.g;
                y3aVar.k = jm6Var.s;
                y3aVar.o = jm6Var.b;
                CharSequence charSequence = jm6Var.a;
                y3aVar.d = charSequence != null ? charSequence.toString() : null;
                y3aVar.i = jm6Var.n;
                y3aVar.j = jm6Var.r;
                y3aVar.h = jm6Var.x;
            } else if (obj instanceof nm6) {
                nm6 nm6Var = (nm6) obj;
                String str2 = nm6Var.h;
                if (str2 != null) {
                    y3aVar.c = str2;
                } else {
                    y3aVar.l = nm6Var;
                }
                y3aVar.e = nm6Var.c;
                y3aVar.f = nm6Var.g;
                y3aVar.k = nm6Var.s;
                CharSequence charSequence2 = nm6Var.I;
                y3aVar.d = charSequence2 != null ? charSequence2.toString() : null;
                y3aVar.i = nm6Var.n;
                y3aVar.j = nm6Var.r;
                y3aVar.h = nm6Var.x;
                TLRPC.BotInlineResult botInlineResult = nm6Var.N;
                if (botInlineResult != null && nm6Var.H) {
                    y3aVar.m = botInlineResult;
                    y3aVar.n = nm6Var.O;
                }
                System.currentTimeMillis();
            }
        }
        this.W.e(arrayList2);
    }

    public final void a0(boolean z) {
        if (z == (this.M.getTag() != null)) {
            return;
        }
        this.M.setTag(z ? 1 : null);
        if (this.N.getEditText().isFocused()) {
            gl.t1(this.N.getEditText());
        }
        this.N.k(true);
        FrameLayout frameLayout = this.M;
        if (z) {
            frameLayout.setVisibility(0);
            this.O.setVisibility(0);
        } else {
            frameLayout.setVisibility(4);
            this.O.setVisibility(4);
        }
        this.O.setScaleX(z ? 1.0f : 0.2f);
        this.O.setScaleY(z ? 1.0f : 0.2f);
        this.O.setAlpha(z ? 1.0f : 0.0f);
        this.R.setScaleX(z ? 1.0f : 0.2f);
        this.R.setScaleY(z ? 1.0f : 0.2f);
        this.R.setAlpha(z ? 1.0f : 0.0f);
        this.M.setTranslationY(z ? 0.0f : gl.L(48.0f));
        this.S.setTranslationY(z ? 0.0f : gl.L(48.0f));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.ca));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        ArrayList arrayList;
        a aVar = this.actionBar;
        int i = bkb.g5;
        zkb.h(i, null, aVar);
        a aVar2 = this.actionBar;
        int i2 = bkb.i5;
        byte b = 5;
        zkb.l(aVar2, 5, i2, null);
        zkb.l(this.actionBar, 1, i2, null);
        zkb.l(this.actionBar, 3, bkb.H5, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 17));
        r6 t = this.actionBar.t();
        if (this.y) {
            t.a(2, R.drawable.outline_header_search).setContentDescription(k96.M0(2131745644, null));
        }
        r7 a = t.a(0, R.drawable.ic_ab_other);
        a.setContentDescription(k96.M0(2131754838, null));
        a.e(1, R.drawable.msg_openin, k96.M0(2131747603, null));
        e48 e48Var = new e48(this, context);
        this.Q = e48Var;
        zkb.h(i, null, e48Var);
        this.fragmentView = this.Q;
        this.actionBar.setTitle(k96.M0(2131750468, null));
        o39 o39Var = new o39(context, null);
        this.h = o39Var;
        o39Var.setPadding(gl.L(6.0f), gl.L(4.0f), gl.L(6.0f), gl.L(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new t26(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.Q.addView(this.h, nme.e(-1, -1, 51));
        o39 o39Var2 = this.h;
        s20 s20Var = new s20(this, context, (byte) 10);
        this.n = s20Var;
        o39Var2.setAdapter(s20Var);
        zkb.H(this.h, i, null);
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextColor(-8355712);
        this.s.setTextSize(1, 20.0f);
        this.s.setGravity(17);
        byte b2 = 8;
        this.s.setVisibility(8);
        this.s.setText(k96.M0(2131747988, null));
        this.Q.addView(this.s, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.s.setOnTouchListener(new jz1((byte) 18));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(8);
        this.Q.addView(this.r, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.r.addView(radialProgressView, nme.e(-2, -2, 17));
        View view = new View(context);
        this.S = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.S.setTranslationY(gl.L(48.0f));
        this.Q.addView(this.S, nme.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        zkb.h(i, null, frameLayout2);
        this.M.setVisibility(4);
        this.M.setTranslationY(gl.L(48.0f));
        this.Q.addView(this.M, nme.e(-1, 48, 83));
        this.M.setOnTouchListener(new jz1((byte) 19));
        rt3 rt3Var = this.N;
        if (rt3Var != null) {
            rt3Var.o();
        }
        this.N = new rt3(context, this.Q, null, 1, false, null);
        this.N.setFilters(new InputFilter[]{new InputFilter.LengthFilter(na7.q1(y6c.t0).F0())});
        this.N.setHint(k96.M0(2131754451, null));
        gt3 editText = this.N.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.M.addView(this.N, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        Editable editable = this.a;
        if (editable != null) {
            this.N.setText(editable);
        }
        oc6 oc6Var = new oc6(b, context, this);
        this.O = oc6Var;
        oc6Var.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        this.O.setVisibility(4);
        this.O.setScaleX(0.2f);
        this.O.setScaleY(0.2f);
        this.O.setAlpha(0.0f);
        this.Q.addView(this.O, nme.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.P = new ImageView(context);
        this.P.setBackgroundDrawable(bkb.h0(gl.L(56.0f), bkb.w0(null, bkb.R5, false), bkb.w0(null, bkb.S5, false)));
        this.P.setImageResource(R.drawable.attach_send);
        this.P.setImportantForAccessibility(2);
        zkb.s(this.P, bkb.T5, null, PorterDuff.Mode.MULTIPLY);
        this.P.setScaleType(ImageView.ScaleType.CENTER);
        this.P.setOutlineProvider(new xi(b2));
        this.O.addView(this.P, nme.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.P.setOnClickListener(new fr7(this, (byte) 9));
        this.P.setOnLongClickListener(new zs(this, b2));
        float L = gl.L(12.0f);
        TextPaint textPaint = this.T;
        textPaint.setTextSize(L);
        textPaint.setTypeface(gl.o());
        sb sbVar = new sb((byte) 23, context, this);
        this.R = sbVar;
        sbVar.setAlpha(0.0f);
        this.R.setScaleX(0.2f);
        this.R.setScaleY(0.2f);
        this.Q.addView(this.R, nme.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.x != 0) {
            this.N.setVisibility(8);
        }
        if (this.e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.r.setVisibility(8);
            this.h.setEmptyView(this.s);
        }
        return this.fragmentView;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != kk7.q2) {
            if (i == kk7.s) {
                removeSelfFromStack(true);
                return;
            }
            return;
        }
        if (this.classGuid == ((Integer) objArr[0]).intValue()) {
            byte b = this.x;
            if (b == 1 || b == 2 || b == 10 || !this.y) {
                this.d = (ArrayList) objArr[2];
            } else {
                this.d = (ArrayList) objArr[1];
            }
            FrameLayout frameLayout = this.r;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            o39 o39Var = this.h;
            if (o39Var != null && o39Var.getEmptyView() == null) {
                this.h.setEmptyView(this.s);
            }
            s20 s20Var = this.n;
            if (s20Var != null) {
                s20Var.f();
            }
            this.e = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.h, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.W9));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        rt3 rt3Var = this.N;
        if (rt3Var == null || !rt3Var.e) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        rt3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o39 o39Var = this.h;
        if (o39Var != null) {
            o39Var.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 7));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        ArrayList arrayList;
        byte b = this.x;
        if (b == 1 || b == 2 || b == 10 || !this.y) {
            arrayList = MediaController.d2;
            this.d = arrayList;
        } else {
            arrayList = MediaController.c2;
            this.d = arrayList;
        }
        this.e = arrayList == null;
        MediaController.N(this.classGuid);
        kk7.e().b(this, kk7.q2);
        kk7.f(this.currentAccount).b(this, kk7.s);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        rt3 rt3Var = this.N;
        if (rt3Var != null) {
            rt3Var.o();
        }
        kk7.e().n(this, kk7.q2);
        kk7.f(this.currentAccount).n(this, kk7.s);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        s20 s20Var = this.n;
        if (s20Var != null) {
            s20Var.f();
        }
        rt3 rt3Var = this.N;
        if (rt3Var != null) {
            rt3Var.s();
        }
        o39 o39Var = this.h;
        if (o39Var != null) {
            o39Var.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 7));
        }
    }
}

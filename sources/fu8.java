// default package

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fu8 extends d {
    public float E;
    public float[] F;
    public boolean G;
    public ValueAnimator H;
    public ClipboardManager I;
    public final boolean J;
    public fba K;
    public boolean L;
    public ClipboardManager.OnPrimaryClipChangedListener M;
    public int N;
    public EditTextBoldCursor[] a;
    public du8 b;
    public m36 c;
    public LinearLayout d;
    public b9a[] e;
    public mhb[] f;
    public uib h;
    public uib n;
    public sha r;
    public vy8[] s;
    public int w;
    public au8 x;
    public String y;

    public fu8() {
        super(null);
        this.e = new b9a[3];
        this.f = new mhb[2];
        this.s = new vy8[3];
        this.E = 1.0f;
        this.F = new float[2];
        this.G = true;
        this.M = new bu8(this, (byte) 0);
        this.K = new fba(au8.i);
        this.J = true;
    }

    public final void Y(boolean z) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        if (this.h == null || this.r == null || (editTextBoldCursor = (editTextBoldCursorArr = this.a)[0]) == null || editTextBoldCursorArr[1] == null) {
            return;
        }
        boolean z2 = this.w != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.z(this.a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(auc.l(editTextBoldCursor.getText().toString())) || auc.f(this.a[4].getText().toString()) == null);
        if (this.G != z2) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.H = ofFloat;
                ofFloat.setDuration(200L);
                this.H.addUpdateListener(new u28(this, (byte) 20));
            }
            if (z) {
                float[] fArr = this.F;
                fArr[0] = this.E;
                fArr[1] = z2 ? 1.0f : 0.0f;
                this.H.start();
            } else {
                this.E = z2 ? 1.0f : 0.0f;
                zkb.X(this.h.getTextView(), z2 ? bkb.p6 : bkb.y6, null);
            }
            this.h.setEnabled(z2);
            this.r.a(z2, z);
            this.G = z2;
        }
    }

    public final void Z(int i, boolean z, on7 on7Var) {
        vy8[] vy8VarArr = this.s;
        mhb[] mhbVarArr = this.f;
        if (this.w != i) {
            this.w = i;
            TransitionManager.endTransitions(this.c);
            byte b = 2;
            if (z) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) s33.f).setDuration(250L);
                if (on7Var != null) {
                    duration.addListener((Transition.TransitionListener) new i7(on7Var, b));
                }
                TransitionManager.beginDelayedTransition(this.c, duration);
            }
            int i2 = this.w;
            if (i2 == 1) {
                mhbVarArr[0].setVisibility(0);
                mhbVarArr[1].setVisibility(8);
                ((View) this.a[4].getParent()).setVisibility(8);
                ((View) this.a[3].getParent()).setVisibility(0);
                ((View) this.a[2].getParent()).setVisibility(0);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i2 == 2) {
                mhbVarArr[0].setVisibility(8);
                mhbVarArr[1].setVisibility(0);
                mhbVarArr[1].setText(k96.M0(2131743538, null) + "\n\n" + k96.M0(2131743537, null));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i2 == 3) {
                mhbVarArr[0].setVisibility(8);
                mhbVarArr[1].setVisibility(0);
                mhbVarArr[1].setText(k96.M0(2131743533, null));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(8);
                this.a[1].setText("443");
            }
            vy8VarArr[0].a(this.w == 1, z);
            vy8VarArr[1].a(this.w == 2, z);
            vy8VarArr[2].a(this.w == 3, z);
            Y(z);
        }
    }

    public final void a0(Context context, String str) {
        zu8 zu8Var = new zu8(context, k96.M0(2131745256, null), str, k96.M0(2131746311, null), true);
        zu8Var.q1.setImageBitmap(lcb.e(gl.L(60.0f), gl.L(60.0f), gl.v2(null, R.raw.qr_dog)));
        showDialog(zu8Var);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.I6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.g7));
        hashSet.add(Integer.valueOf(bkb.f7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0() {
        String str;
        b9a[] b9aVarArr = this.e;
        ClipData primaryClip = this.I.getPrimaryClip();
        au8 au8Var = null;
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            try {
                str = primaryClip.getItemAt(0).coerceToText(this.fragmentView.getContext()).toString();
            } catch (Exception unused) {
            }
            if (TextUtils.equals(str, this.y)) {
                this.x = null;
                this.y = str;
                if (str != null) {
                    try {
                        au8Var = au8.d(Uri.parse(str));
                    } catch (Exception unused2) {
                    }
                    if (au8Var != null && au8Var.g()) {
                        this.x = au8Var;
                    }
                }
                au8 au8Var2 = this.x;
                uib uibVar = this.n;
                if (au8Var2 != null) {
                    if (uibVar.getVisibility() != 0) {
                        this.n.setVisibility(0);
                        b9aVarArr[2].setVisibility(0);
                        return;
                    }
                    return;
                }
                if (uibVar.getVisibility() != 8) {
                    this.n.setVisibility(8);
                    b9aVarArr[2].setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        str = null;
        if (TextUtils.equals(str, this.y)) {
        }
    }

    public final void c0() {
        int w0;
        try {
            int i = 0;
            if (this.b != null && (w0 = bkb.w0(null, bkb.r8, false)) != this.N) {
                this.N = w0;
                gl.v3(this.b, w0);
            }
            if (this.a == null) {
                return;
            }
            bkb.u0(bkb.G6);
            bkb.u0(bkb.F6);
            bkb.u0(bkb.K6);
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i];
                if (editTextBoldCursor != null) {
                    zkb.l(editTextBoldCursor, 34, bkb.G6, null);
                    zkb.v(this.a[i], bkb.F6, null);
                    zkb.z(this.a[i], bkb.K6, null);
                }
                i++;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        mhb[] mhbVarArr = this.f;
        fba fbaVar = this.K;
        b9a[] b9aVarArr = this.e;
        vy8[] vy8VarArr = this.s;
        final byte b = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(k96.M0(2131746411, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ui5 ui5Var = this.parentLayout;
        final byte b2 = 0;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 4));
        this.r = this.simpleActionBar.s(k96.M0(2131745754, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.c = new m36(context);
        du8 du8Var = new du8(context, this.c, this.resourceProvider, true);
        this.b = du8Var;
        du8Var.setDrawBackground(true);
        this.b.setFillViewport(true);
        this.b.setOverScrollMode(0);
        gl.v3(this.b, bkb.w0(null, bkb.r8, false));
        int i = -1;
        frameLayout.addView(this.b, nme.c(-1.0f, -1));
        this.c.setOrientation(1);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: cu8
            public final /* synthetic */ fu8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                byte b3 = b2;
                fu8 fu8Var = this.b;
                switch (b3) {
                    case 0:
                        fu8Var.Z(au8.f(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        au8 au8Var = fu8Var.x;
                        if (au8Var != null) {
                            int i2 = au8Var.a;
                            int i3 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = fu8Var.a;
                                if (i3 >= editTextBoldCursorArr.length) {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    fu8Var.Z(i2, true, new on7(fu8Var, i2, (byte) 7));
                                    break;
                                } else {
                                    if ((i2 != 1 || i3 != 4) && (i2 != 2 || (i3 != 2 && i3 != 3))) {
                                        if (i3 == 0) {
                                            str = fu8Var.x.b;
                                        } else if (i3 == 1) {
                                            int i4 = fu8Var.x.c;
                                            if (i4 != 0) {
                                                str = Integer.toString(i4);
                                            }
                                            str = null;
                                        } else if (i3 == 2) {
                                            str = fu8Var.x.d;
                                        } else if (i3 == 3) {
                                            str = fu8Var.x.e;
                                        } else {
                                            if (i3 == 4) {
                                                str = fu8Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            fu8Var.a[i3].setText((CharSequence) null);
                                        } else {
                                            try {
                                                fu8Var.a[i3].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                fu8Var.a[i3].setText(str);
                                            }
                                        }
                                    }
                                    i3++;
                                }
                            }
                        }
                        break;
                }
            }
        };
        int i2 = 0;
        while (i2 < 3) {
            int f = au8.f(i2);
            vy8 vy8Var = new vy8(context, null);
            vy8VarArr[i2] = vy8Var;
            zkb.R(vy8Var, bkb.L0(true), zkb.M(bkb.c6), zkb.M(bkb.h6), null);
            vy8VarArr[i2].setTag(Integer.valueOf(i2));
            if (i2 == 0) {
                vy8VarArr[i2].c(k96.M0(2131743543, null), f == this.w, true);
            } else if (i2 == 1) {
                vy8VarArr[i2].c(k96.M0(2131743540, null), f == this.w, true);
            } else {
                vy8VarArr[i2].c(k96.M0(2131743534, null), f == this.w, false);
            }
            this.c.addView(vy8VarArr[i2], nme.o(-1, 50));
            vy8VarArr[i2].setOnClickListener(onClickListener);
            i2++;
            i = -1;
        }
        b9a b9aVar = new b9a(context, (de9) null);
        b9aVarArr[0] = b9aVar;
        this.c.addView(b9aVar, nme.o(i, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(gl.L(1.0f));
        this.d.setOutlineProvider(null);
        this.c.addView(this.d, nme.o(-1, -2));
        this.a = new EditTextBoldCursor[5];
        int i3 = 0;
        for (int i4 = 5; i3 < i4; i4 = 5) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, nme.o(-1, 64));
            this.a[i3] = new EditTextBoldCursor(context);
            this.a[i3].setTag(Integer.valueOf(i3));
            this.a[i3].setTextSize(1, 16.0f);
            zkb.A(this.a[i3], bkb.G6, null);
            EditTextBoldCursor editTextBoldCursor = this.a[i3];
            int i5 = bkb.F6;
            zkb.X(editTextBoldCursor, i5, null);
            this.a[i3].setBackground(null);
            zkb.v(this.a[i3], i5, null);
            this.a[i3].setCursorSize(gl.L(20.0f));
            this.a[i3].setCursorWidth(1.5f);
            this.a[i3].setSingleLine(true);
            this.a[i3].setGravity((k96.a0 ? 5 : 3) | 16);
            zkb.z(this.a[i3], bkb.K6, null);
            this.a[i3].setTransformHintToHeader(true);
            zkb.F(this.a[i3], bkb.j6, bkb.k6, bkb.o7, null);
            if (i3 == 0) {
                this.a[i3].setInputType(524305);
                this.a[i3].addTextChangedListener(new eu8(this, (byte) 0));
            } else {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i3 == 1) {
                    editTextBoldCursorArr[i3].setInputType(2);
                    this.a[i3].addTextChangedListener(new eu8(this, (byte) 1));
                } else if (i3 == 3) {
                    editTextBoldCursorArr[i3].setInputType(kk7.M1);
                    this.a[i3].setTypeface(Typeface.DEFAULT);
                    this.a[i3].setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    editTextBoldCursorArr[i3].setInputType(524289);
                }
            }
            if (i3 == 4) {
                this.a[i3].addTextChangedListener(new eu8(this, (byte) 2));
            }
            this.a[i3].setImeOptions(268435461);
            if (i3 == 0) {
                this.a[i3].setHintText(k96.M0(2131743552, null));
                this.a[i3].setText(fbaVar.a.b);
            } else if (i3 == 1) {
                this.a[i3].setHintText(k96.M0(2131743547, null));
                this.a[i3].setText(Integer.toString(fbaVar.a.c));
            } else if (i3 == 2) {
                this.a[i3].setHintText(k96.M0(2131743535, null));
                this.a[i3].setText(fbaVar.a.d);
            } else if (i3 == 3) {
                this.a[i3].setHintText(k96.M0(2131743548, null));
                this.a[i3].setText(fbaVar.a.e);
            } else if (i3 == 4) {
                this.a[i3].setHintText(k96.M0(2131743545, null));
                this.a[i3].setText(fbaVar.a.f);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a[i3];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            this.a[i3].setPadding(0, 0, 0, 0);
            frameLayout2.addView(this.a[i3], nme.d(-1, -1.0f, 51, 17.0f, i3 == 0 ? 12.0f : 0.0f, 17.0f, 0.0f));
            this.a[i3].setOnEditorActionListener(new j(this, (byte) 19));
            i3++;
        }
        for (int i6 = 0; i6 < 2; i6++) {
            mhb mhbVar = new mhb(context);
            mhbVarArr[i6] = mhbVar;
            if (i6 == 0) {
                mhbVar.setText(k96.M0(2131743549, null));
            } else {
                mhbVar.setText(k96.M0(2131743538, null) + "\n\n" + k96.M0(2131743537, null));
                mhbVarArr[i6].setVisibility(8);
            }
            this.c.addView(mhbVarArr[i6], nme.o(-1, -2));
        }
        uib uibVar = new uib(this.fragmentView.getContext());
        this.n = uibVar;
        ff0 L0 = bkb.L0(true);
        int i7 = bkb.c6;
        vkb M = zkb.M(i7);
        int i8 = bkb.h6;
        vkb M2 = zkb.M(i8);
        uibVar.setBackground(L0);
        zkb.j(uibVar, L0, M, M2, null);
        this.n.b(k96.M0(2131747241, null), false);
        TextView textView = this.n.getTextView();
        int i9 = bkb.p6;
        zkb.X(textView, i9, null);
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: cu8
            public final /* synthetic */ fu8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                byte b3 = b;
                fu8 fu8Var = this.b;
                switch (b3) {
                    case 0:
                        fu8Var.Z(au8.f(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        au8 au8Var = fu8Var.x;
                        if (au8Var != null) {
                            int i22 = au8Var.a;
                            int i32 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr2 = fu8Var.a;
                                if (i32 >= editTextBoldCursorArr2.length) {
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr2[0];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    fu8Var.Z(i22, true, new on7(fu8Var, i22, (byte) 7));
                                    break;
                                } else {
                                    if ((i22 != 1 || i32 != 4) && (i22 != 2 || (i32 != 2 && i32 != 3))) {
                                        if (i32 == 0) {
                                            str = fu8Var.x.b;
                                        } else if (i32 == 1) {
                                            int i42 = fu8Var.x.c;
                                            if (i42 != 0) {
                                                str = Integer.toString(i42);
                                            }
                                            str = null;
                                        } else if (i32 == 2) {
                                            str = fu8Var.x.d;
                                        } else if (i32 == 3) {
                                            str = fu8Var.x.e;
                                        } else {
                                            if (i32 == 4) {
                                                str = fu8Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            fu8Var.a[i32].setText((CharSequence) null);
                                        } else {
                                            try {
                                                fu8Var.a[i32].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                fu8Var.a[i32].setText(str);
                                            }
                                        }
                                    }
                                    i32++;
                                }
                            }
                        }
                        break;
                }
            }
        });
        this.c.addView(this.n, 0, nme.o(-1, -2));
        this.n.setVisibility(8);
        b9a b9aVar2 = new b9a(this.fragmentView.getContext(), (de9) null);
        b9aVarArr[2] = b9aVar2;
        this.c.addView(b9aVar2, 1, nme.o(-1, -2));
        b9aVarArr[2].setVisibility(8);
        uib uibVar2 = new uib(context);
        this.h = uibVar2;
        ff0 L02 = bkb.L0(true);
        vkb M3 = zkb.M(i7);
        vkb M4 = zkb.M(i8);
        uibVar2.setBackground(L02);
        zkb.j(uibVar2, L02, M3, M4, null);
        this.h.b(k96.M0(2131745267, null), false);
        zkb.X(this.h.getTextView(), i9, null);
        this.c.addView(this.h, nme.o(-1, -2));
        this.h.setOnClickListener(new v16(this, context, (byte) 26));
        b9a b9aVar3 = new b9a(context, (de9) null);
        b9aVarArr[1] = b9aVar3;
        this.c.addView(b9aVar3, nme.o(-1, -2));
        this.I = (ClipboardManager) context.getSystemService("clipboard");
        this.G = true;
        this.E = 1.0f;
        Y(false);
        this.w = 0;
        Z(fbaVar.a.a, false, null);
        this.x = null;
        this.y = null;
        b0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final tu9 getScrollViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.r8));
        arrayList.add(new blb(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        for (int i = 0; i < this.s.length; i++) {
        }
        if (this.a != null) {
            int i2 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i2 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new blb(editTextBoldCursorArr[i2], TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.G6));
                arrayList.add(new blb(this.a[i2], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.K6));
                i2++;
            }
        } else {
            arrayList.add(new blb((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.F6));
            arrayList.add(new blb((View) null, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.G6));
        }
        arrayList.add(new blb((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        int i3 = 0;
        while (true) {
            b9a[] b9aVarArr = this.e;
            if (i3 >= b9aVarArr.length) {
                break;
            }
            b9a b9aVar = b9aVarArr[i3];
            i3++;
        }
        for (int i4 = 0; i4 < this.f.length; i4++) {
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        this.I.removePrimaryClipChangedListener(this.M);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        gl.W2(getParentActivity(), this.classGuid);
        this.I.addPrimaryClipChangedListener(this.M);
        b0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        ValueAnimator valueAnimator;
        try {
            super.onThemeColorsChanged();
            if (this.h != null && ((valueAnimator = this.H) == null || !valueAnimator.isRunning())) {
                zkb.X(this.h.getTextView(), this.G ? bkb.p6 : bkb.y6, null);
            }
            c0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && !z2 && this.J) {
            this.a[0].requestFocus();
            gl.F3(this.a[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}

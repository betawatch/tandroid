package org.telegram.ui.Wallet;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ra extends FrameLayout {
    public final Rect D;
    public final Rect E;
    public final int[] F;
    public final int[] G;
    public final l1 H;
    public final k1 I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final TextView[] N;
    public final EditText a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final org.telegram.ui.ActionBar.p6 e;
    public Runnable f;
    public Runnable h;
    public Runnable n;
    public Runnable r;
    public PopupWindow s;
    public boolean w;
    public LinearLayout x;
    public ImageView y;

    public ra(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.D = new Rect();
        this.E = new Rect();
        int i11 = 2;
        this.F = new int[2];
        this.G = new int[2];
        final int i12 = 1;
        this.H = new l1(this, i12);
        this.I = new k1(this, i11);
        this.N = new TextView[3];
        this.e = p6Var;
        int L = org.telegram.messenger.i0.L(16.0f);
        int i13 = org.telegram.ui.ActionBar.t6.a7;
        Drawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(i13, p6Var)));
        org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.5f, i13);
        setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(this, d02, L2, null, p6Var);
        final int i14 = 0;
        setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(11.0f), 0);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setText((i10 + 1) + ".");
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.A6, p6Var);
        addView(textView, w7.b6.d(22, -2.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
        setClipChildren(false);
        EditText editText = new EditText(context);
        this.a = editText;
        editText.setTextSize(16.0f);
        editText.setGravity(16);
        editText.setBackground(null);
        editText.setPadding(0, org.telegram.messenger.i0.L(15.0f), 0, org.telegram.messenger.i0.L(15.0f));
        editText.setIncludeFontPadding(false);
        editText.setSingleLine(true);
        editText.setImeOptions(5);
        editText.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.a7.E(editText, org.telegram.ui.ActionBar.t6.z6, p6Var);
        org.telegram.ui.ActionBar.a7.V(editText, org.telegram.ui.ActionBar.t6.G6, p6Var);
        editText.setHint("");
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.Wallet.oa
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                ra raVar = ra.this;
                if (z11) {
                    raVar.setError(false);
                    raVar.e();
                    String lowerCase = raVar.a.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty()) {
                        raVar.a();
                    } else {
                        raVar.f(lowerCase);
                    }
                } else {
                    raVar.a();
                    if (!raVar.w && !raVar.b()) {
                        raVar.setError(true);
                    }
                }
                raVar.d();
            }
        });
        editText.addTextChangedListener(new ag.a1(this, 25));
        addView(editText, w7.b6.d(-1, -1.0f, 16, 30.0f, 0.0f, z10 ? 64.0f : 8.0f, 0.0f));
        editText.setOnEditorActionListener(new x8(this, i11));
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.b6.e(-2, -2, 21));
        if (z10) {
            TextView textView2 = new TextView(context);
            this.c = textView2;
            textView2.setTextSize(14.0f);
            textView2.setTypeface(org.telegram.messenger.i0.o());
            textView2.setGravity(17);
            z20.p(textView2, org.telegram.ui.ActionBar.t6.q6, p6Var, null, 2131743081);
            textView2.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f));
            int L3 = org.telegram.messenger.i0.L(28.0f);
            int i15 = org.telegram.ui.ActionBar.t6.d6;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.t6.d0(L3, org.telegram.ui.ActionBar.t6.w0(i15, p6Var));
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
            textView2.setBackground(d03);
            org.telegram.ui.ActionBar.a7.k(textView2, d03, N, null, p6Var);
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.pa
                public final /* synthetic */ ra b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CharSequence text;
                    switch (i14) {
                        case 0:
                            ra raVar = this.b;
                            EditText editText2 = raVar.a;
                            try {
                                ClipboardManager clipboardManager = (ClipboardManager) raVar.getContext().getSystemService("clipboard");
                                if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                    editText2.setText(text.toString().trim());
                                    editText2.setSelection(editText2.getText().length());
                                    Runnable runnable = raVar.h;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                                return;
                            }
                            break;
                        default:
                            EditText editText3 = this.b.a;
                            editText3.setText("");
                            editText3.setSelection(0);
                            break;
                    }
                }
            });
            frameLayout.addView(textView2, w7.b6.e(-2, -2, 17));
        } else {
            this.c = null;
        }
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.y6, p6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(R.drawable.ic_ab_close);
        int i16 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i16, p6Var), 3, -1);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i16);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N2, p6Var);
        imageView.setVisibility(8);
        imageView.setFocusable(false);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.pa
            public final /* synthetic */ ra b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CharSequence text;
                switch (i12) {
                    case 0:
                        ra raVar = this.b;
                        EditText editText2 = raVar.a;
                        try {
                            ClipboardManager clipboardManager = (ClipboardManager) raVar.getContext().getSystemService("clipboard");
                            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                editText2.setText(text.toString().trim());
                                editText2.setSelection(editText2.getText().length());
                                Runnable runnable = raVar.h;
                                if (runnable != null) {
                                    runnable.run();
                                    break;
                                }
                            }
                        } catch (Exception unused) {
                            return;
                        }
                        break;
                    default:
                        EditText editText3 = this.b.a;
                        editText3.setText("");
                        editText3.setSelection(0);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, w7.b6.e(28, 28, 17));
        e();
        d();
    }

    public final void a() {
        PopupWindow popupWindow = this.s;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.s.dismiss();
    }

    public final boolean b() {
        String lowerCase = this.a.getText().toString().trim().toLowerCase();
        if (lowerCase.isEmpty()) {
            return true;
        }
        for (String str : WalletEngine2.getMnemonicWordlist()) {
            if (str.equals(lowerCase)) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        Rect rect = this.D;
        getWindowVisibleDisplayFrame(rect);
        int[] iArr = this.F;
        getLocationOnScreen(iArr);
        int[] iArr2 = this.G;
        getLocationInWindow(iArr2);
        Rect rect2 = this.E;
        if (!getLocalVisibleRect(rect2)) {
            a();
            return;
        }
        rect2.offset(iArr[0], iArr[1]);
        if (!Rect.intersects(rect2, rect)) {
            a();
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.s.getContentView();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(260.0f), rect.width()), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = linearLayout.getMeasuredWidth();
        int measuredHeight = linearLayout.getMeasuredHeight();
        int L = org.telegram.messenger.i0.L(9.0f);
        int i10 = ((getHeight() + iArr[1]) + L) + measuredHeight > rect.bottom ? 1 : 0;
        if (i10 != 0 && (iArr[1] - L) - measuredHeight < rect.top) {
            a();
            return;
        }
        if (linearLayout.indexOfChild(this.y) != i10) {
            linearLayout.removeView(this.y);
            linearLayout.addView(this.y, i10);
            this.y.setRotation(i10 != 0 ? 180.0f : 0.0f);
        }
        int max = Math.max(rect.left, Math.min(((getWidth() - measuredWidth) / 2) + iArr[0], rect.right - measuredWidth));
        int height = i10 != 0 ? (iArr[1] - L) - measuredHeight : getHeight() + iArr[1] + L;
        int i11 = (max + iArr2[0]) - iArr[0];
        int i12 = (height + iArr2[1]) - iArr[1];
        if (!this.s.isShowing()) {
            this.s.setWidth(measuredWidth);
            this.s.setHeight(measuredHeight);
            this.s.showAtLocation(this, 51, i11, i12);
            getViewTreeObserver().addOnGlobalLayoutListener(this.H);
            getViewTreeObserver().addOnScrollChangedListener(this.I);
        } else if (this.J != i11 || this.K != i12 || this.L != measuredWidth || this.M != measuredHeight) {
            this.s.update(i11, i12, measuredWidth, measuredHeight);
        }
        this.J = i11;
        this.K = i12;
        this.L = measuredWidth;
        this.M = measuredHeight;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.getPrimaryClip().getItemAt(0).getText()) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        EditText editText = this.a;
        boolean z10 = true;
        boolean z11 = editText.getText().length() > 0;
        try {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0) {
            }
        } catch (Exception unused) {
        }
        z10 = false;
        TextView textView = this.c;
        if (textView != null) {
            textView.setVisibility((!z11 && z10) ? 0 : 8);
        }
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setVisibility((z11 && editText.hasFocus()) ? 0 : 8);
        }
    }

    public final void e() {
        org.telegram.ui.ActionBar.a7.V(this.b, this.w ? org.telegram.ui.ActionBar.t6.q7 : this.w || this.a.getText().length() > 0 ? org.telegram.ui.ActionBar.t6.G6 : org.telegram.ui.ActionBar.t6.A6, this.e);
    }

    public final void f(String str) {
        if (!this.a.hasFocus() || TextUtils.isEmpty(str) || str.length() < 1 || WalletEngine2.getMnemonicWordlist().length == 0) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : WalletEngine2.getMnemonicWordlist()) {
            if (str2.startsWith(str) && !str2.equals(str)) {
                arrayList.add(str2);
                if (arrayList.size() >= 3) {
                    break;
                }
            }
        }
        if (arrayList.isEmpty()) {
            a();
            return;
        }
        Context context = getContext();
        PopupWindow popupWindow = this.s;
        TextView[] textViewArr = this.N;
        if (popupWindow == null) {
            PopupWindow popupWindow2 = new PopupWindow(context);
            this.s = popupWindow2;
            popupWindow2.setOutsideTouchable(false);
            this.s.setFocusable(false);
            this.s.setInputMethodMode(1);
            this.s.setBackgroundDrawable(null);
            this.s.setElevation(org.telegram.messenger.i0.L(8.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            this.y = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            this.y.setColorFilter(new PorterDuffColorFilter(-872415232, PorterDuff.Mode.SRC_IN));
            this.y.setImageResource(R.drawable.wallet_tooltip_arrow);
            linearLayout.addView(this.y, w7.b6.t(18, 9, 1, 0, 0, 0, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.x = linearLayout2;
            linearLayout2.setOrientation(0);
            this.x.setGravity(16);
            this.x.setPadding(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
            this.x.setClipToPadding(false);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-872415232);
            gradientDrawable.setCornerRadius(org.telegram.messenger.i0.L(8.0f));
            this.x.setBackground(gradientDrawable);
            int i10 = 0;
            while (i10 < 3) {
                TextView textView = new TextView(context);
                textView.setTextSize(14.0f);
                textView.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
                textView.setGravity(17);
                textView.setIncludeFontPadding(false);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setMaxWidth(org.telegram.messenger.i0.L(140.0f));
                textView.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(9.0f));
                textView.setVisibility(8);
                textView.setOnClickListener(new bh.f(this, i10, 27));
                textViewArr[i10] = textView;
                this.x.addView(textView, w7.b6.t(-2, -2, 16, i10 == 0 ? 0 : 12, 0, 0, 0));
                i10++;
            }
            linearLayout.addView(this.x, w7.b6.o(-2, -2));
            this.s.setContentView(linearLayout);
            this.s.setWidth(-2);
            this.s.setHeight(-2);
            this.s.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.Wallet.qa
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ra raVar = ra.this;
                    raVar.getViewTreeObserver().removeOnGlobalLayoutListener(raVar.H);
                    raVar.getViewTreeObserver().removeOnScrollChangedListener(raVar.I);
                }
            });
        }
        int i11 = 0;
        while (i11 < 3) {
            TextView textView2 = textViewArr[i11];
            if (i11 < arrayList.size()) {
                String str3 = (String) arrayList.get(i11);
                SpannableString spannableString = new SpannableString(str3);
                int min = Math.min(str.length(), str3.length());
                spannableString.setSpan(new ForegroundColorSpan(-4539718), 0, min, 33);
                spannableString.setSpan(new ForegroundColorSpan(-1), min, str3.length(), 33);
                textView2.setText(spannableString);
                textView2.setBackground(i11 == 0 ? org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(5.0f), 452984831) : null);
                textView2.setVisibility(0);
            } else {
                textView2.setText("");
                textView2.setBackground(null);
                textView2.setVisibility(8);
            }
            i11++;
        }
        c();
    }

    public String getWord() {
        return this.a.getText().toString().trim();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(256.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)), i11);
    }

    public void setError(boolean z10) {
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        ImageView imageView = this.d;
        EditText editText = this.a;
        org.telegram.ui.ActionBar.p6 p6Var = this.e;
        if (z10) {
            int L = org.telegram.messenger.i0.L(16.0f);
            int i10 = org.telegram.ui.ActionBar.t6.r7;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.r1(0.24f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
            org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.24f, i10);
            setBackground(d02);
            org.telegram.ui.ActionBar.a7.k(this, d02, L2, null, p6Var);
            int i11 = org.telegram.ui.ActionBar.t6.q7;
            org.telegram.ui.ActionBar.a7.V(this.b, i11, p6Var);
            org.telegram.ui.ActionBar.a7.V(editText, i11, p6Var);
            if (imageView != null) {
                org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, PorterDuff.Mode.SRC_IN);
            }
            org.telegram.messenger.i0.G3(this);
        } else {
            int L3 = org.telegram.messenger.i0.L(16.0f);
            int i12 = org.telegram.ui.ActionBar.t6.a7;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.t6.d0(L3, org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(i12, p6Var)));
            org.telegram.ui.ActionBar.w6 L4 = org.telegram.ui.ActionBar.a7.L(0.5f, i12);
            setBackground(d03);
            org.telegram.ui.ActionBar.a7.k(this, d03, L4, null, p6Var);
            org.telegram.ui.ActionBar.a7.V(editText, org.telegram.ui.ActionBar.t6.G6, p6Var);
            if (imageView != null) {
                org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.y6, p6Var, PorterDuff.Mode.SRC_IN);
            }
            e();
            d();
        }
        Runnable runnable = this.n;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setOnErrorClearListener(Runnable runnable) {
        this.n = runnable;
    }

    public void setOnNextListener(Runnable runnable) {
        this.r = runnable;
    }

    public void setOnPasteListener(Runnable runnable) {
        this.h = runnable;
    }

    public void setOnTextChangedListener(Runnable runnable) {
        this.f = runnable;
    }

    public void setText(String str) {
        EditText editText = this.a;
        editText.setText(str);
        editText.setSelection(str.length());
        setError(false);
        e();
        d();
        a();
    }
}

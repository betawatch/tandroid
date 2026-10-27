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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.bw0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class ha extends FrameLayout {
    public final Rect E;
    public final int[] F;
    public final int[] G;
    public final o1 H;
    public final n1 I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final TextView[] N;
    public final EditText a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final org.telegram.ui.ActionBar.u6 e;
    public Runnable f;
    public Runnable h;
    public Runnable n;
    public Runnable r;
    public PopupWindow s;
    public boolean v;
    public LinearLayout w;
    public ImageView x;
    public final Rect y;

    public ha(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        this.y = new Rect();
        this.E = new Rect();
        this.F = new int[2];
        this.G = new int[2];
        this.H = new o1(this, 1);
        this.I = new n1(this, 2);
        this.N = new TextView[3];
        this.e = u6Var;
        int dp = AndroidUtilities.dp(16.0f);
        int i11 = org.telegram.ui.ActionBar.y6.a7;
        Drawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(i11, u6Var)));
        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.5f, i11);
        setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(this, c02, L, null, u6Var);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(11.0f), 0);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setText((i10 + 1) + ".");
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.A6, u6Var);
        addView(textView, kb1.h(22, -2.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
        setClipChildren(false);
        EditText editText = new EditText(context);
        this.a = editText;
        editText.setTextSize(16.0f);
        editText.setGravity(16);
        editText.setBackground(null);
        editText.setPadding(0, AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f));
        editText.setIncludeFontPadding(false);
        editText.setSingleLine(true);
        editText.setImeOptions(5);
        editText.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.f7.E(editText, org.telegram.ui.ActionBar.y6.z6, u6Var);
        org.telegram.ui.ActionBar.f7.V(editText, org.telegram.ui.ActionBar.y6.G6, u6Var);
        editText.setHint("");
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.Wallet.ea
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                ha haVar = ha.this;
                if (z11) {
                    haVar.setError(false);
                    haVar.e();
                    String lowerCase = haVar.a.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty()) {
                        haVar.a();
                    } else {
                        haVar.f(lowerCase);
                    }
                } else {
                    haVar.a();
                    if (!haVar.v && !haVar.b()) {
                        haVar.setError(true);
                    }
                }
                haVar.d();
            }
        });
        editText.addTextChangedListener(new bi.u(this, 18));
        addView(editText, kb1.h(-1, -1.0f, 16, 30.0f, 0.0f, z10 ? 64.0f : 8.0f, 0.0f));
        editText.setOnEditorActionListener(new l8(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, kb1.i(-2, -2, 21));
        if (z10) {
            TextView textView2 = new TextView(context);
            this.c = textView2;
            textView2.setTextSize(14.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setGravity(17);
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q6, u6Var);
            textView2.setPadding(org.telegram.ui.d3.h(12.0f, R.string.WalletPaste, textView2), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            int dp2 = AndroidUtilities.dp(28.0f);
            int i12 = org.telegram.ui.ActionBar.y6.d6;
            ShapeDrawable c03 = org.telegram.ui.ActionBar.y6.c0(dp2, org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
            textView2.setBackground(c03);
            org.telegram.ui.ActionBar.f7.k(textView2, c03, N, null, u6Var);
            final int i13 = 0;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.fa
                public final /* synthetic */ ha b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CharSequence text;
                    switch (i13) {
                        case 0:
                            ha haVar = this.b;
                            EditText editText2 = haVar.a;
                            try {
                                ClipboardManager clipboardManager = (ClipboardManager) haVar.getContext().getSystemService("clipboard");
                                if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                    editText2.setText(text.toString().trim());
                                    editText2.setSelection(editText2.getText().length());
                                    Runnable runnable = haVar.h;
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
            frameLayout.addView(textView2, kb1.i(-2, -2, 17));
        } else {
            this.c = null;
        }
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.y6, u6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(R.drawable.ic_ab_close);
        int i14 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i14, u6Var), 3, -1);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i14);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N2, u6Var);
        imageView.setVisibility(8);
        imageView.setFocusable(false);
        final int i15 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.fa
            public final /* synthetic */ ha b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CharSequence text;
                switch (i15) {
                    case 0:
                        ha haVar = this.b;
                        EditText editText2 = haVar.a;
                        try {
                            ClipboardManager clipboardManager = (ClipboardManager) haVar.getContext().getSystemService("clipboard");
                            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                editText2.setText(text.toString().trim());
                                editText2.setSelection(editText2.getText().length());
                                Runnable runnable = haVar.h;
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
        frameLayout.addView(imageView, kb1.i(28, 28, 17));
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
        Rect rect = this.y;
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
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(260.0f), rect.width()), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = linearLayout.getMeasuredWidth();
        int measuredHeight = linearLayout.getMeasuredHeight();
        int dp = AndroidUtilities.dp(9.0f);
        int i10 = ((getHeight() + iArr[1]) + dp) + measuredHeight > rect.bottom ? 1 : 0;
        if (i10 != 0 && (iArr[1] - dp) - measuredHeight < rect.top) {
            a();
            return;
        }
        if (linearLayout.indexOfChild(this.x) != i10) {
            linearLayout.removeView(this.x);
            linearLayout.addView(this.x, i10);
            this.x.setRotation(i10 != 0 ? 180.0f : 0.0f);
        }
        int max = Math.max(rect.left, Math.min(((getWidth() - measuredWidth) / 2) + iArr[0], rect.right - measuredWidth));
        int height = i10 != 0 ? (iArr[1] - dp) - measuredHeight : getHeight() + iArr[1] + dp;
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
        org.telegram.ui.ActionBar.f7.V(this.b, this.v ? org.telegram.ui.ActionBar.y6.q7 : this.v || this.a.getText().length() > 0 ? org.telegram.ui.ActionBar.y6.G6 : org.telegram.ui.ActionBar.y6.A6, this.e);
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
            this.s.setElevation(AndroidUtilities.dp(8.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            this.x = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            this.x.setColorFilter(new PorterDuffColorFilter(-872415232, PorterDuff.Mode.SRC_IN));
            this.x.setImageResource(R.drawable.wallet_tooltip_arrow);
            linearLayout.addView(this.x, kb1.x(18, 9, 1, 0, 0, 0, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.w = linearLayout2;
            linearLayout2.setOrientation(0);
            this.w.setGravity(16);
            this.w.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
            this.w.setClipToPadding(false);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-872415232);
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(8.0f));
            this.w.setBackground(gradientDrawable);
            int i10 = 0;
            while (i10 < 3) {
                TextView textView = new TextView(context);
                textView.setTextSize(14.0f);
                textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textView.setGravity(17);
                textView.setIncludeFontPadding(false);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setMaxWidth(AndroidUtilities.dp(140.0f));
                textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f));
                textView.setVisibility(8);
                textView.setOnClickListener(new bw0(this, i10, 3));
                textViewArr[i10] = textView;
                this.w.addView(textView, kb1.x(-2, -2, 16, i10 == 0 ? 0 : 12, 0, 0, 0));
                i10++;
            }
            linearLayout.addView(this.w, kb1.r(-2, -2));
            this.s.setContentView(linearLayout);
            this.s.setWidth(-2);
            this.s.setHeight(-2);
            this.s.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.Wallet.ga
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ha haVar = ha.this;
                    haVar.getViewTreeObserver().removeOnGlobalLayoutListener(haVar.H);
                    haVar.getViewTreeObserver().removeOnScrollChangedListener(haVar.I);
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
                textView2.setBackground(i11 == 0 ? org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(5.0f), 452984831) : null);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(256.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)), i11);
    }

    public void setError(boolean z10) {
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        ImageView imageView = this.d;
        EditText editText = this.a;
        org.telegram.ui.ActionBar.u6 u6Var = this.e;
        if (z10) {
            int dp = AndroidUtilities.dp(16.0f);
            int i10 = org.telegram.ui.ActionBar.y6.r7;
            ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.o1(0.24f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var)));
            org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.24f, i10);
            setBackground(c02);
            org.telegram.ui.ActionBar.f7.k(this, c02, L, null, u6Var);
            int i11 = org.telegram.ui.ActionBar.y6.q7;
            org.telegram.ui.ActionBar.f7.V(this.b, i11, u6Var);
            org.telegram.ui.ActionBar.f7.V(editText, i11, u6Var);
            if (imageView != null) {
                org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, PorterDuff.Mode.SRC_IN);
            }
            AndroidUtilities.shakeViewSpring(this);
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            int i12 = org.telegram.ui.ActionBar.y6.a7;
            ShapeDrawable c03 = org.telegram.ui.ActionBar.y6.c0(dp2, org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(i12, u6Var)));
            org.telegram.ui.ActionBar.b7 L2 = org.telegram.ui.ActionBar.f7.L(0.5f, i12);
            setBackground(c03);
            org.telegram.ui.ActionBar.f7.k(this, c03, L2, null, u6Var);
            org.telegram.ui.ActionBar.f7.V(editText, org.telegram.ui.ActionBar.y6.G6, u6Var);
            if (imageView != null) {
                org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.y6, u6Var, PorterDuff.Mode.SRC_IN);
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

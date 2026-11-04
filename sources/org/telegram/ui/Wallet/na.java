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
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.fu0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class na extends FrameLayout {
    public final Rect E;
    public final Rect F;
    public final int[] G;
    public final int[] H;
    public final j1 I;
    public final i1 J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final TextView[] O;
    public final EditText a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final org.telegram.ui.ActionBar.e6 e;
    public Runnable f;
    public Runnable h;
    public Runnable n;
    public Runnable r;
    public PopupWindow s;
    public boolean w;
    public LinearLayout x;
    public ImageView y;

    public na(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.E = new Rect();
        this.F = new Rect();
        int i10 = 2;
        this.G = new int[2];
        this.H = new int[2];
        final int i11 = 1;
        this.I = new j1(this, i11);
        this.J = new i1(this, i10);
        this.O = new TextView[3];
        this.e = e6Var;
        int L = org.telegram.messenger.g0.L(16.0f);
        int i12 = org.telegram.ui.ActionBar.k6.a7;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i12, e6Var)));
        org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.5f, i12);
        setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(this, d02, L2, null, e6Var);
        final int i13 = 0;
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setText((i3 + 1) + ".");
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A6, e6Var);
        addView(textView, mf.d(22, -2.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
        setClipChildren(false);
        EditText editText = new EditText(context);
        this.a = editText;
        editText.setTextSize(16.0f);
        editText.setGravity(16);
        editText.setBackground(null);
        editText.setPadding(0, org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f));
        editText.setIncludeFontPadding(false);
        editText.setSingleLine(true);
        editText.setImeOptions(5);
        editText.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.r6.E(editText, org.telegram.ui.ActionBar.k6.z6, e6Var);
        org.telegram.ui.ActionBar.r6.V(editText, org.telegram.ui.ActionBar.k6.G6, e6Var);
        editText.setHint("");
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.Wallet.ja
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                na naVar = na.this;
                if (z11) {
                    naVar.setError(false);
                    naVar.e();
                    String lowerCase = naVar.a.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty()) {
                        naVar.a();
                    } else {
                        naVar.f(lowerCase);
                    }
                } else {
                    naVar.a();
                    if (!naVar.w && !naVar.b()) {
                        naVar.setError(true);
                    }
                }
                naVar.d();
            }
        });
        editText.addTextChangedListener(new ma(this, i13));
        addView(editText, mf.d(-1, -1.0f, 16, 30.0f, 0.0f, z10 ? 64.0f : 8.0f, 0.0f));
        editText.setOnEditorActionListener(new r8(this, i10));
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, mf.e(-2, -2, 21));
        if (z10) {
            TextView textView2 = new TextView(context);
            this.c = textView2;
            textView2.setTextSize(14.0f);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setGravity(17);
            org.telegram.messenger.camera.q.o(textView2, org.telegram.ui.ActionBar.k6.q6, e6Var, null, 2131743065);
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            int L3 = org.telegram.messenger.g0.L(28.0f);
            int i14 = org.telegram.ui.ActionBar.k6.d6;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(L3, org.telegram.ui.ActionBar.k6.w0(i14, e6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
            textView2.setBackground(d03);
            org.telegram.ui.ActionBar.r6.k(textView2, d03, N, null, e6Var);
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.ka
                public final /* synthetic */ na b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CharSequence text;
                    switch (i13) {
                        case 0:
                            na naVar = this.b;
                            EditText editText2 = naVar.a;
                            try {
                                ClipboardManager clipboardManager = (ClipboardManager) naVar.getContext().getSystemService("clipboard");
                                if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                    editText2.setText(text.toString().trim());
                                    editText2.setSelection(editText2.getText().length());
                                    Runnable runnable = naVar.h;
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
            frameLayout.addView(textView2, mf.e(-2, -2, 17));
        } else {
            this.c = null;
        }
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.y6, e6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(R.drawable.ic_ab_close);
        int i15 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i15, e6Var), 3, -1);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i15);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N2, e6Var);
        imageView.setVisibility(8);
        imageView.setFocusable(false);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.ka
            public final /* synthetic */ na b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CharSequence text;
                switch (i11) {
                    case 0:
                        na naVar = this.b;
                        EditText editText2 = naVar.a;
                        try {
                            ClipboardManager clipboardManager = (ClipboardManager) naVar.getContext().getSystemService("clipboard");
                            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                editText2.setText(text.toString().trim());
                                editText2.setSelection(editText2.getText().length());
                                Runnable runnable = naVar.h;
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
        frameLayout.addView(imageView, mf.e(28, 28, 17));
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
        Rect rect = this.E;
        getWindowVisibleDisplayFrame(rect);
        int[] iArr = this.G;
        getLocationOnScreen(iArr);
        int[] iArr2 = this.H;
        getLocationInWindow(iArr2);
        Rect rect2 = this.F;
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
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(260.0f), rect.width()), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = linearLayout.getMeasuredWidth();
        int measuredHeight = linearLayout.getMeasuredHeight();
        int L = org.telegram.messenger.g0.L(9.0f);
        int i3 = ((getHeight() + iArr[1]) + L) + measuredHeight > rect.bottom ? 1 : 0;
        if (i3 != 0 && (iArr[1] - L) - measuredHeight < rect.top) {
            a();
            return;
        }
        if (linearLayout.indexOfChild(this.y) != i3) {
            linearLayout.removeView(this.y);
            linearLayout.addView(this.y, i3);
            this.y.setRotation(i3 != 0 ? 180.0f : 0.0f);
        }
        int max = Math.max(rect.left, Math.min(((getWidth() - measuredWidth) / 2) + iArr[0], rect.right - measuredWidth));
        int height = i3 != 0 ? (iArr[1] - L) - measuredHeight : getHeight() + iArr[1] + L;
        int i10 = (max + iArr2[0]) - iArr[0];
        int i11 = (height + iArr2[1]) - iArr[1];
        if (!this.s.isShowing()) {
            this.s.setWidth(measuredWidth);
            this.s.setHeight(measuredHeight);
            this.s.showAtLocation(this, 51, i10, i11);
            getViewTreeObserver().addOnGlobalLayoutListener(this.I);
            getViewTreeObserver().addOnScrollChangedListener(this.J);
        } else if (this.K != i10 || this.L != i11 || this.M != measuredWidth || this.N != measuredHeight) {
            this.s.update(i10, i11, measuredWidth, measuredHeight);
        }
        this.K = i10;
        this.L = i11;
        this.M = measuredWidth;
        this.N = measuredHeight;
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
        org.telegram.ui.ActionBar.r6.V(this.b, this.w ? org.telegram.ui.ActionBar.k6.q7 : this.w || this.a.getText().length() > 0 ? org.telegram.ui.ActionBar.k6.G6 : org.telegram.ui.ActionBar.k6.A6, this.e);
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
        TextView[] textViewArr = this.O;
        if (popupWindow == null) {
            PopupWindow popupWindow2 = new PopupWindow(context);
            this.s = popupWindow2;
            popupWindow2.setOutsideTouchable(false);
            this.s.setFocusable(false);
            this.s.setInputMethodMode(1);
            this.s.setBackgroundDrawable(null);
            this.s.setElevation(org.telegram.messenger.g0.L(8.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            this.y = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            this.y.setColorFilter(new PorterDuffColorFilter(-872415232, PorterDuff.Mode.SRC_IN));
            this.y.setImageResource(R.drawable.wallet_tooltip_arrow);
            linearLayout.addView(this.y, mf.t(18, 9, 1, 0, 0, 0, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.x = linearLayout2;
            linearLayout2.setOrientation(0);
            this.x.setGravity(16);
            this.x.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
            this.x.setClipToPadding(false);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-872415232);
            gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(8.0f));
            this.x.setBackground(gradientDrawable);
            int i3 = 0;
            while (i3 < 3) {
                TextView textView = new TextView(context);
                textView.setTextSize(14.0f);
                textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                textView.setGravity(17);
                textView.setIncludeFontPadding(false);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setMaxWidth(org.telegram.messenger.g0.L(140.0f));
                textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f));
                textView.setVisibility(8);
                textView.setOnClickListener(new fu0(this, i3, 2));
                textViewArr[i3] = textView;
                this.x.addView(textView, mf.t(-2, -2, 16, i3 == 0 ? 0 : 12, 0, 0, 0));
                i3++;
            }
            linearLayout.addView(this.x, mf.o(-2, -2));
            this.s.setContentView(linearLayout);
            this.s.setWidth(-2);
            this.s.setHeight(-2);
            this.s.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.Wallet.la
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    na naVar = na.this;
                    naVar.getViewTreeObserver().removeOnGlobalLayoutListener(naVar.I);
                    naVar.getViewTreeObserver().removeOnScrollChangedListener(naVar.J);
                }
            });
        }
        int i10 = 0;
        while (i10 < 3) {
            TextView textView2 = textViewArr[i10];
            if (i10 < arrayList.size()) {
                String str3 = (String) arrayList.get(i10);
                SpannableString spannableString = new SpannableString(str3);
                int min = Math.min(str.length(), str3.length());
                spannableString.setSpan(new ForegroundColorSpan(-4539718), 0, min, 33);
                spannableString.setSpan(new ForegroundColorSpan(-1), min, str3.length(), 33);
                textView2.setText(spannableString);
                textView2.setBackground(i10 == 0 ? org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(5.0f), 452984831) : null);
                textView2.setVisibility(0);
            } else {
                textView2.setText("");
                textView2.setBackground(null);
                textView2.setVisibility(8);
            }
            i10++;
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(256.0f), View.MeasureSpec.getSize(i3)), View.MeasureSpec.getMode(i3)), i10);
    }

    public void setError(boolean z10) {
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        ImageView imageView = this.d;
        EditText editText = this.a;
        org.telegram.ui.ActionBar.e6 e6Var = this.e;
        if (z10) {
            int L = org.telegram.messenger.g0.L(16.0f);
            int i3 = org.telegram.ui.ActionBar.k6.r7;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.24f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var)));
            org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.24f, i3);
            setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(this, d02, L2, null, e6Var);
            int i10 = org.telegram.ui.ActionBar.k6.q7;
            org.telegram.ui.ActionBar.r6.V(this.b, i10, e6Var);
            org.telegram.ui.ActionBar.r6.V(editText, i10, e6Var);
            if (imageView != null) {
                org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.SRC_IN);
            }
            org.telegram.messenger.g0.H3(this);
        } else {
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int i11 = org.telegram.ui.ActionBar.k6.a7;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(L3, org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i11, e6Var)));
            org.telegram.ui.ActionBar.n6 L4 = org.telegram.ui.ActionBar.r6.L(0.5f, i11);
            setBackground(d03);
            org.telegram.ui.ActionBar.r6.k(this, d03, L4, null, e6Var);
            org.telegram.ui.ActionBar.r6.V(editText, org.telegram.ui.ActionBar.k6.G6, e6Var);
            if (imageView != null) {
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.y6, e6Var, PorterDuff.Mode.SRC_IN);
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

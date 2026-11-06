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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.nu0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class oa extends FrameLayout {
    public final Rect D;
    public final Rect E;
    public final int[] F;
    public final int[] G;
    public final m1 H;
    public final l1 I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final TextView[] N;
    public final EditText a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final org.telegram.ui.ActionBar.f6 e;
    public Runnable f;
    public Runnable h;
    public Runnable n;
    public Runnable r;
    public PopupWindow s;
    public boolean w;
    public LinearLayout x;
    public ImageView y;

    public oa(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        this.D = new Rect();
        this.E = new Rect();
        int i10 = 2;
        this.F = new int[2];
        this.G = new int[2];
        final int i11 = 1;
        this.H = new m1(this, i11);
        this.I = new l1(this, i10);
        this.N = new TextView[3];
        this.e = f6Var;
        int L = org.telegram.messenger.g0.L(16.0f);
        int i12 = org.telegram.ui.ActionBar.k6.a7;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i12, f6Var)));
        org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.5f, i12);
        setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(this, d02, L2, null, f6Var);
        final int i13 = 0;
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setText((i7 + 1) + ".");
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A6, f6Var);
        addView(textView, c8.ha.d(22, -2.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
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
        org.telegram.ui.ActionBar.r6.E(editText, org.telegram.ui.ActionBar.k6.z6, f6Var);
        org.telegram.ui.ActionBar.r6.V(editText, org.telegram.ui.ActionBar.k6.G6, f6Var);
        editText.setHint("");
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.Wallet.ka
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                oa oaVar = oa.this;
                if (z10) {
                    oaVar.setError(false);
                    oaVar.e();
                    String lowerCase = oaVar.a.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty()) {
                        oaVar.a();
                    } else {
                        oaVar.f(lowerCase);
                    }
                } else {
                    oaVar.a();
                    if (!oaVar.w && !oaVar.b()) {
                        oaVar.setError(true);
                    }
                }
                oaVar.d();
            }
        });
        editText.addTextChangedListener(new na(this, i13));
        addView(editText, c8.ha.d(-1, -1.0f, 16, 30.0f, 0.0f, z9 ? 64.0f : 8.0f, 0.0f));
        editText.setOnEditorActionListener(new s8(this, i10));
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c8.ha.e(-2, -2, 21));
        if (z9) {
            TextView textView2 = new TextView(context);
            this.c = textView2;
            textView2.setTextSize(14.0f);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setGravity(17);
            org.telegram.messenger.camera.q.o(textView2, org.telegram.ui.ActionBar.k6.q6, f6Var, null, 2131743056);
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            int L3 = org.telegram.messenger.g0.L(28.0f);
            int i14 = org.telegram.ui.ActionBar.k6.d6;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(L3, org.telegram.ui.ActionBar.k6.w0(i14, f6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
            textView2.setBackground(d03);
            org.telegram.ui.ActionBar.r6.k(textView2, d03, N, null, f6Var);
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.la
                public final /* synthetic */ oa b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CharSequence text;
                    switch (i13) {
                        case 0:
                            oa oaVar = this.b;
                            EditText editText2 = oaVar.a;
                            try {
                                ClipboardManager clipboardManager = (ClipboardManager) oaVar.getContext().getSystemService("clipboard");
                                if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                    editText2.setText(text.toString().trim());
                                    editText2.setSelection(editText2.getText().length());
                                    Runnable runnable = oaVar.h;
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
            frameLayout.addView(textView2, c8.ha.e(-2, -2, 17));
        } else {
            this.c = null;
        }
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.y6, f6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(R.drawable.ic_ab_close);
        int i15 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i15, f6Var), 3, -1);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i15);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N2, f6Var);
        imageView.setVisibility(8);
        imageView.setFocusable(false);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.la
            public final /* synthetic */ oa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CharSequence text;
                switch (i11) {
                    case 0:
                        oa oaVar = this.b;
                        EditText editText2 = oaVar.a;
                        try {
                            ClipboardManager clipboardManager = (ClipboardManager) oaVar.getContext().getSystemService("clipboard");
                            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                editText2.setText(text.toString().trim());
                                editText2.setSelection(editText2.getText().length());
                                Runnable runnable = oaVar.h;
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
        frameLayout.addView(imageView, c8.ha.e(28, 28, 17));
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
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(260.0f), rect.width()), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = linearLayout.getMeasuredWidth();
        int measuredHeight = linearLayout.getMeasuredHeight();
        int L = org.telegram.messenger.g0.L(9.0f);
        int i7 = ((getHeight() + iArr[1]) + L) + measuredHeight > rect.bottom ? 1 : 0;
        if (i7 != 0 && (iArr[1] - L) - measuredHeight < rect.top) {
            a();
            return;
        }
        if (linearLayout.indexOfChild(this.y) != i7) {
            linearLayout.removeView(this.y);
            linearLayout.addView(this.y, i7);
            this.y.setRotation(i7 != 0 ? 180.0f : 0.0f);
        }
        int max = Math.max(rect.left, Math.min(((getWidth() - measuredWidth) / 2) + iArr[0], rect.right - measuredWidth));
        int height = i7 != 0 ? (iArr[1] - L) - measuredHeight : getHeight() + iArr[1] + L;
        int i10 = (max + iArr2[0]) - iArr[0];
        int i11 = (height + iArr2[1]) - iArr[1];
        if (!this.s.isShowing()) {
            this.s.setWidth(measuredWidth);
            this.s.setHeight(measuredHeight);
            this.s.showAtLocation(this, 51, i10, i11);
            getViewTreeObserver().addOnGlobalLayoutListener(this.H);
            getViewTreeObserver().addOnScrollChangedListener(this.I);
        } else if (this.J != i10 || this.K != i11 || this.L != measuredWidth || this.M != measuredHeight) {
            this.s.update(i10, i11, measuredWidth, measuredHeight);
        }
        this.J = i10;
        this.K = i11;
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
        boolean z9 = true;
        boolean z10 = editText.getText().length() > 0;
        try {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0) {
            }
        } catch (Exception unused) {
        }
        z9 = false;
        TextView textView = this.c;
        if (textView != null) {
            textView.setVisibility((!z10 && z9) ? 0 : 8);
        }
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setVisibility((z10 && editText.hasFocus()) ? 0 : 8);
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
        TextView[] textViewArr = this.N;
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
            linearLayout.addView(this.y, c8.ha.t(18, 9, 1, 0, 0, 0, 0));
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
            int i7 = 0;
            while (i7 < 3) {
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
                textView.setOnClickListener(new nu0(this, i7, 2));
                textViewArr[i7] = textView;
                this.x.addView(textView, c8.ha.t(-2, -2, 16, i7 == 0 ? 0 : 12, 0, 0, 0));
                i7++;
            }
            linearLayout.addView(this.x, c8.ha.o(-2, -2));
            this.s.setContentView(linearLayout);
            this.s.setWidth(-2);
            this.s.setHeight(-2);
            this.s.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.Wallet.ma
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    oa oaVar = oa.this;
                    oaVar.getViewTreeObserver().removeOnGlobalLayoutListener(oaVar.H);
                    oaVar.getViewTreeObserver().removeOnScrollChangedListener(oaVar.I);
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(256.0f), View.MeasureSpec.getSize(i7)), View.MeasureSpec.getMode(i7)), i10);
    }

    public void setError(boolean z9) {
        if (this.w == z9) {
            return;
        }
        this.w = z9;
        ImageView imageView = this.d;
        EditText editText = this.a;
        org.telegram.ui.ActionBar.f6 f6Var = this.e;
        if (z9) {
            int L = org.telegram.messenger.g0.L(16.0f);
            int i7 = org.telegram.ui.ActionBar.k6.r7;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.24f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var)));
            org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.24f, i7);
            setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(this, d02, L2, null, f6Var);
            int i10 = org.telegram.ui.ActionBar.k6.q7;
            org.telegram.ui.ActionBar.r6.V(this.b, i10, f6Var);
            org.telegram.ui.ActionBar.r6.V(editText, i10, f6Var);
            if (imageView != null) {
                org.telegram.ui.ActionBar.r6.t(imageView, i10, f6Var, PorterDuff.Mode.SRC_IN);
            }
            org.telegram.messenger.g0.H3(this);
        } else {
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int i11 = org.telegram.ui.ActionBar.k6.a7;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(L3, org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i11, f6Var)));
            org.telegram.ui.ActionBar.n6 L4 = org.telegram.ui.ActionBar.r6.L(0.5f, i11);
            setBackground(d03);
            org.telegram.ui.ActionBar.r6.k(this, d03, L4, null, f6Var);
            org.telegram.ui.ActionBar.r6.V(editText, org.telegram.ui.ActionBar.k6.G6, f6Var);
            if (imageView != null) {
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.y6, f6Var, PorterDuff.Mode.SRC_IN);
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

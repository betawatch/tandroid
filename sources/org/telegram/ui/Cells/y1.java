package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y1 extends FrameLayout {
    public final int A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public View E;
    public View F;
    public int a;
    public final org.telegram.ui.ActionBar.c6 b;
    public final w1 c;
    public final v1 d;
    public final View e;
    public final TextView f;
    public final View h;
    public final CheckBoxSquare n;
    public final bp r;
    public View s;
    public final x1 v;
    public final org.telegram.ui.Components.n9 w;
    public final org.telegram.ui.Components.y8 x;
    public final int y;

    public y1(Context context, int i10) {
        this(i10, 17, context, null, false);
    }

    public final boolean a() {
        int i10 = this.y;
        return i10 == 4 || i10 == 8 || i10 == 6 || i10 == 7;
    }

    public final boolean b() {
        bp bpVar = this.r;
        return bpVar != null ? bpVar.a.q : this.n.h;
    }

    public final void c(boolean z10, boolean z11) {
        bp bpVar = this.r;
        if (bpVar != null) {
            bpVar.a(z10, z11);
        } else {
            this.n.a(z10, z11);
        }
    }

    public final void d(org.telegram.ui.a aVar, nh.x1 x1Var) {
        if (aVar == null) {
            View view = this.E;
            if (view != null) {
                removeView(view);
                this.E = null;
            }
        } else {
            if (this.E == null) {
                View view2 = new View(getContext());
                this.E = view2;
                view2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, this.b), 2, -1));
                addView(this.E, h7.z5.e(-1, -1, 119));
            }
            this.E.setOnClickListener(aVar);
        }
        if (x1Var == null) {
            View view3 = this.F;
            if (view3 != null) {
                removeView(view3);
                this.F = null;
                return;
            }
            return;
        }
        if (this.F == null) {
            View view4 = new View(getContext());
            this.F = view4;
            addView(view4, h7.z5.e(56, -1, LocaleController.isRTL ? 5 : 3));
        }
        this.F.setOnClickListener(x1Var);
    }

    public final void e(CharSequence charSequence, String str, boolean z10, boolean z11, boolean z12) {
        if (this.D) {
            v1 v1Var = this.d;
            v1Var.c(Emoji.replaceEmoji(charSequence, v1Var.getPaint().getFontMetricsInt(), false), z12, true);
        } else {
            this.c.setText(charSequence);
        }
        bp bpVar = this.r;
        if (bpVar != null) {
            bpVar.a(z10, z12);
        } else {
            this.n.a(z10, z12);
        }
        this.f.setText(str);
        this.B = z11;
        setWillNotDraw(!z11);
    }

    public final void f() {
        float f10;
        View view = this.e;
        if (this.s == null) {
            return;
        }
        try {
            f10 = view.getMeasuredWidth();
        } catch (Exception unused) {
            f10 = 0.0f;
        }
        this.s.setTranslationX(LocaleController.isRTL ? (view.getRight() - f10) - AndroidUtilities.dp(20.0f) : view.getLeft() + f10 + AndroidUtilities.dp(4.0f));
    }

    public final void g() {
        boolean z10 = this.D;
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        int i10 = this.y;
        if (z10) {
            this.d.setTextColor(org.telegram.ui.ActionBar.g6.v0((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.g6.j5 : org.telegram.ui.ActionBar.g6.G6, c6Var));
        } else {
            int v02 = org.telegram.ui.ActionBar.g6.v0((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.g6.j5 : org.telegram.ui.ActionBar.g6.G6, c6Var);
            w1 w1Var = this.c;
            w1Var.setTextColor(v02);
            w1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.g6.k5 : org.telegram.ui.ActionBar.g6.J6, c6Var));
        }
        this.f.setTextColor(org.telegram.ui.ActionBar.g6.v0((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.g6.m5 : org.telegram.ui.ActionBar.g6.I6, c6Var));
    }

    public org.telegram.ui.Components.j6 getAnimatedTextView() {
        return this.d;
    }

    public bp getCheckBoxRound() {
        return this.r;
    }

    public View getCheckBoxView() {
        return this.h;
    }

    public TextView getTextView() {
        return this.c;
    }

    public TextView getValueTextView() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.B) {
            int dp = AndroidUtilities.dp(a() ? 60.0f : 20.0f) + ((int) Math.abs(this.e.getTranslationX()));
            if (this.y == 7) {
                dp += AndroidUtilities.dp(39.0f);
            }
            org.telegram.ui.ActionBar.c6 c6Var = this.b;
            Paint N = c6Var != null ? c6Var.N("paintDivider") : null;
            if (N == null) {
                N = org.telegram.ui.ActionBar.g6.k0;
            }
            Paint paint = N;
            float f10 = LocaleController.isRTL ? 0.0f : dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!LocaleController.isRTL) {
                dp = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - dp, getMeasuredHeight() - 1, paint);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        v1 v1Var = this.d;
        if (v1Var != null) {
            accessibilityNodeInfo.setText(v1Var.getText());
        } else {
            w1 w1Var = this.c;
            if (w1Var != null) {
                accessibilityNodeInfo.setText(w1Var.getText());
            }
        }
        accessibilityNodeInfo.setChecked(b());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        View view = this.h;
        int i12 = this.A;
        View view2 = this.e;
        TextView textView = this.f;
        int i13 = this.y;
        if (i13 == 3) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
            view2.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(34.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_31));
            float f10 = i12;
            view.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), TLObject.FLAG_30));
            setMeasuredDimension(AndroidUtilities.dp(29.0f) + view2.getMeasuredWidth(), AndroidUtilities.dp(50.0f));
        } else if (this.C) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.B ? 1 : 0));
            int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(a() ? 60.0f : 34.0f);
            if (this.D) {
                measuredWidth += (int) this.d.getRightPadding();
            }
            if (i13 == 7) {
                measuredWidth -= AndroidUtilities.dp(34.0f);
            }
            if (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                measuredWidth -= ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin;
            }
            int i14 = measuredWidth / 2;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            int measuredWidth2 = textView.getMeasuredWidth();
            x1 x1Var = this.v;
            if (x1Var != null) {
                x1Var.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                measuredWidth2 = rl.C(11.0f, x1Var.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(rl.d(8.0f, (measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            } else {
                view2.measure(rl.d(8.0f, (measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            }
            org.telegram.ui.Components.n9 n9Var = this.w;
            if (n9Var != null) {
                n9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), TLObject.FLAG_30));
            }
            float f11 = i12;
            view.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11), TLObject.FLAG_30));
        }
        View view3 = this.E;
        if (view3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            this.E.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
        }
        View view4 = this.F;
        if (view4 != null) {
            view4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
        }
        View view5 = this.s;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), TLObject.FLAG_30));
        }
    }

    public void setCollapsed(Boolean bool) {
        if (bool == null) {
            View view = this.s;
            if (view != null) {
                removeView(view);
                this.s = null;
                return;
            }
            return;
        }
        if (this.s == null) {
            this.s = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, this.b), PorterDuff.Mode.MULTIPLY));
            this.s.setBackground(mutate);
            addView(this.s, h7.z5.e(16, 16, 16));
        }
        f();
        this.s.animate().cancel();
        this.s.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(340L).setInterpolator(er.h).start();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.e.setAlpha(z10 ? 1.0f : 0.5f);
        this.f.setAlpha(z10 ? 1.0f : 0.5f);
        this.h.setAlpha(z10 ? 1.0f : 0.5f);
    }

    public void setIcon(int i10) {
        this.r.setIcon(i10);
    }

    public void setMultiline(boolean z10) {
        if (this.D) {
            return;
        }
        this.C = z10;
        View view = this.e;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        View view2 = this.h;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        boolean z11 = this.C;
        w1 w1Var = this.c;
        if (z11) {
            w1Var.setLines(0);
            w1Var.setMaxLines(0);
            w1Var.setSingleLine(false);
            w1Var.setEllipsize(null);
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 16;
            layoutParams2.topMargin = 0;
        } else {
            w1Var.setLines(1);
            w1Var.setMaxLines(1);
            w1Var.setSingleLine(true);
            w1Var.setEllipsize(TextUtils.TruncateAt.END);
            view.setPadding(0, 0, 0, 0);
            layoutParams.height = -1;
            layoutParams.topMargin = 0;
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 48;
            layoutParams2.topMargin = AndroidUtilities.dp(15.0f);
        }
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams2);
    }

    public void setNeedDivider(boolean z10) {
        this.B = z10;
    }

    public void setPad(int i10) {
        int dp = AndroidUtilities.dp(i10 * 40 * (LocaleController.isRTL ? -1 : 1));
        View view = this.h;
        if (view != null) {
            view.setTranslationX(dp);
        }
        float f10 = dp;
        this.e.setTranslationX(f10);
        org.telegram.ui.Components.n9 n9Var = this.w;
        if (n9Var != null) {
            n9Var.setTranslationX(f10);
        }
        View view2 = this.E;
        if (view2 != null) {
            view2.setTranslationX(f10);
        }
        View view3 = this.F;
        if (view3 != null) {
            view3.setTranslationX(f10);
        }
    }

    public void setTextColor(int i10) {
        if (this.D) {
            this.d.setTextColor(i10);
        } else {
            this.c.setTextColor(i10);
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        org.telegram.ui.Components.y8 y8Var = this.x;
        y8Var.p(tLObject);
        this.w.e(tLObject, y8Var);
        boolean z10 = tLObject instanceof TLRPC.User;
        String userName = z10 ? UserObject.getUserName((TLRPC.User) tLObject) : ContactsController.formatName(tLObject);
        if (z10 && ((TLRPC.User) tLObject).id == MessagesController.getInstance(UserConfig.selectedAccount).telegramAntispamUserId) {
            userName = LocaleController.getString(R.string.ChannelAntiSpamUser);
        }
        if (!this.D) {
            this.c.setText(userName);
        } else {
            v1 v1Var = this.d;
            v1Var.setText(Emoji.replaceEmoji(userName, v1Var.getPaint().getFontMetricsInt(), false));
        }
    }

    public y1(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(i10, 17, context, c6Var, false);
    }

    public y1(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.b = c6Var;
        this.y = i10;
        this.D = z10;
        boolean z11 = true;
        if (z10) {
            v1 v1Var = new v1(this, context, 0);
            this.d = v1Var;
            NotificationCenter.listenEmojiLoading(v1Var);
            v1Var.setEllipsizeByGradient(true);
            v1Var.setRightPadding(AndroidUtilities.dp(8.0f));
            v1Var.getDrawable().o(true, false, false);
            v1Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.g6.j5 : org.telegram.ui.ActionBar.g6.G6, c6Var)));
            v1Var.setTextSize(AndroidUtilities.dp(16.0f));
            if (i10 == 7) {
                v1Var.setTypeface(AndroidUtilities.bold());
            }
            if (i10 == 3) {
                v1Var.setGravity(19);
                addView(v1Var, h7.z5.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                v1Var.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            } else {
                v1Var.setRightPadding(AndroidUtilities.dp(i11));
                v1Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i10 == 2) {
                    boolean z12 = LocaleController.isRTL;
                    addView(v1Var, h7.z5.d(-1, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 8 : 29, 0.0f, z12 ? 29 : 8, 0.0f));
                } else {
                    int i12 = a() ? 56 : 46;
                    i12 = i10 == 7 ? i12 + 39 : i12;
                    boolean z13 = LocaleController.isRTL;
                    addView(v1Var, h7.z5.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i11 : (i11 - 17) + i12, 0.0f, z13 ? (i11 - 17) + i12 : i11, 0.0f));
                }
            }
            this.e = v1Var;
        } else {
            w1 w1Var = new w1(this, context, 0);
            this.c = w1Var;
            NotificationCenter.listenEmojiLoading(w1Var);
            w1Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.g6.j5 : org.telegram.ui.ActionBar.g6.G6, c6Var)));
            w1Var.setTextSize(1, 16.0f);
            w1Var.setLines(1);
            w1Var.setMaxLines(1);
            w1Var.setSingleLine(true);
            w1Var.setEllipsize(TextUtils.TruncateAt.END);
            if (i10 == 7) {
                w1Var.setTypeface(AndroidUtilities.bold());
            }
            if (i10 == 3) {
                w1Var.setGravity(19);
                addView(w1Var, h7.z5.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                w1Var.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            } else {
                w1Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i10 == 2) {
                    boolean z14 = LocaleController.isRTL;
                    addView(w1Var, h7.z5.d(-1, -2.0f, (z14 ? 5 : 3) | 16, z14 ? 8 : 29, 0.0f, z14 ? 29 : 8, 0.0f));
                } else {
                    int i13 = a() ? 56 : 46;
                    i13 = i10 == 7 ? i13 + 39 : i13;
                    int i14 = a() ? -2 : -1;
                    boolean z15 = LocaleController.isRTL;
                    addView(w1Var, h7.z5.d(i14, -2.0f, (z15 ? 5 : 3) | 16, z15 ? i11 : (i11 - 17) + i13, 0.0f, z15 ? (i11 - 17) + i13 : i11, 0.0f));
                }
            }
            this.e = w1Var;
        }
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTag(Integer.valueOf((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.g6.m5 : org.telegram.ui.ActionBar.g6.I6));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        float f10 = i11;
        addView(textView, h7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        if (a()) {
            bp bpVar = new bp(context, 21, c6Var);
            this.r = bpVar;
            this.h = bpVar;
            bpVar.setDrawUnchecked(true);
            bpVar.a(true, false);
            bpVar.setDrawBackgroundAsArc(10);
            this.A = 21;
            float f11 = 21;
            boolean z16 = LocaleController.isRTL;
            addView(bpVar, h7.z5.d(21, f11, (z16 ? 5 : 3) | 48, z16 ? 0 : i11, 16.0f, z16 ? i11 : 0, 0.0f));
        } else {
            if (i10 != 1 && i10 != 5) {
                z11 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, c6Var, z11);
            this.n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.A = 18;
            if (i10 == 5) {
                float f12 = 18;
                boolean z17 = LocaleController.isRTL;
                addView(checkBoxSquare, h7.z5.d(18, f12, (z17 ? 5 : 3) | 16, z17 ? 0 : i11, 0.0f, z17 ? i11 : 0, 0.0f));
            } else if (i10 == 3) {
                addView(checkBoxSquare, h7.z5.d(18, 18, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else if (i10 == 2) {
                addView(checkBoxSquare, h7.z5.d(18, 18, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                float f13 = 18;
                boolean z18 = LocaleController.isRTL;
                addView(checkBoxSquare, h7.z5.d(18, f13, (z18 ? 5 : 3) | 48, z18 ? 0 : i11, 16.0f, z18 ? i11 : 0, 0.0f));
            }
        }
        if (i10 == 6) {
            x1 x1Var = new x1(this, context, R.drawable.msg_folders_groups);
            this.v = x1Var;
            addView(x1Var, h7.z5.i(-2.0f, -2.0f, 8388629, f10, 0.0f, i11 - 11, 0.0f));
        } else if (i10 == 8) {
            x1 x1Var2 = new x1(this, context, 0);
            this.v = x1Var2;
            addView(x1Var2, h7.z5.i(-2.0f, -2.0f, 8388629, f10, 0.0f, i11 - 11, 0.0f));
        } else if (i10 == 7) {
            this.x = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
            this.w = n9Var;
            n9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
            addView(n9Var, h7.z5.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }
}

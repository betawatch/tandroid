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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
    public final hp r;
    public View s;
    public final x1 v;
    public final org.telegram.ui.Components.t9 w;
    public final org.telegram.ui.Components.e9 x;
    public final int y;

    public y1(Context context, int i10) {
        this(i10, 17, context, null, false);
    }

    public final boolean a() {
        int i10 = this.y;
        return i10 == 4 || i10 == 8 || i10 == 6 || i10 == 7;
    }

    public final boolean b() {
        hp hpVar = this.r;
        return hpVar != null ? hpVar.a.q : this.n.h;
    }

    public final void c(boolean z10, boolean z11) {
        hp hpVar = this.r;
        if (hpVar != null) {
            hpVar.a(z10, z11);
        } else {
            this.n.a(z10, z11);
        }
    }

    public final void d(org.telegram.ui.a aVar, nh.r7 r7Var) {
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
                addView(this.E, i7.f6.e(-1, -1, 119));
            }
            this.E.setOnClickListener(aVar);
        }
        if (r7Var == null) {
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
            addView(view4, i7.f6.e(56, -1, LocaleController.isRTL ? 5 : 3));
        }
        this.F.setOnClickListener(r7Var);
    }

    public final void e(CharSequence charSequence, String str, boolean z10, boolean z11, boolean z12) {
        if (this.D) {
            v1 v1Var = this.d;
            v1Var.c(Emoji.replaceEmoji(charSequence, v1Var.getPaint().getFontMetricsInt(), false), z12, true);
        } else {
            this.c.setText(charSequence);
        }
        hp hpVar = this.r;
        if (hpVar != null) {
            hpVar.a(z10, z12);
        } else {
            this.n.a(z10, z12);
        }
        this.f.setText(str);
        this.B = z11;
        setWillNotDraw(!z11);
    }

    public final void f() {
        float f9;
        View view = this.e;
        if (this.s == null) {
            return;
        }
        try {
            f9 = view.getMeasuredWidth();
        } catch (Exception unused) {
            f9 = 0.0f;
        }
        this.s.setTranslationX(LocaleController.isRTL ? (view.getRight() - f9) - AndroidUtilities.dp(20.0f) : view.getLeft() + f9 + AndroidUtilities.dp(4.0f));
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

    public org.telegram.ui.Components.o6 getAnimatedTextView() {
        return this.d;
    }

    public hp getCheckBoxRound() {
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
            Paint G = c6Var != null ? c6Var.G("paintDivider") : null;
            if (G == null) {
                G = org.telegram.ui.ActionBar.g6.k0;
            }
            Paint paint = G;
            float f9 = LocaleController.isRTL ? 0.0f : dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!LocaleController.isRTL) {
                dp = 0;
            }
            canvas.drawLine(f9, measuredHeight, measuredWidth - dp, getMeasuredHeight() - 1, paint);
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
            float f9 = i12;
            view.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9), TLObject.FLAG_30));
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
                measuredWidth2 = org.telegram.ui.b.C(11.0f, x1Var.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(org.telegram.ui.b.d(8.0f, (measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            } else {
                view2.measure(org.telegram.ui.b.d(8.0f, (measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            }
            org.telegram.ui.Components.t9 t9Var = this.w;
            if (t9Var != null) {
                t9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), TLObject.FLAG_30));
            }
            float f10 = i12;
            view.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), TLObject.FLAG_30));
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
            addView(this.s, i7.f6.e(16, 16, 16));
        }
        f();
        this.s.animate().cancel();
        this.s.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(340L).setInterpolator(jr.h).start();
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
        float f9 = dp;
        this.e.setTranslationX(f9);
        org.telegram.ui.Components.t9 t9Var = this.w;
        if (t9Var != null) {
            t9Var.setTranslationX(f9);
        }
        View view2 = this.E;
        if (view2 != null) {
            view2.setTranslationX(f9);
        }
        View view3 = this.F;
        if (view3 != null) {
            view3.setTranslationX(f9);
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
        org.telegram.ui.Components.e9 e9Var = this.x;
        e9Var.p(tLObject);
        this.w.e(tLObject, e9Var);
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
                addView(v1Var, i7.f6.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                v1Var.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            } else {
                v1Var.setRightPadding(AndroidUtilities.dp(i11));
                v1Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i10 == 2) {
                    boolean z12 = LocaleController.isRTL;
                    addView(v1Var, i7.f6.d(-1, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 8 : 29, 0.0f, z12 ? 29 : 8, 0.0f));
                } else {
                    int i12 = a() ? 56 : 46;
                    i12 = i10 == 7 ? i12 + 39 : i12;
                    boolean z13 = LocaleController.isRTL;
                    addView(v1Var, i7.f6.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i11 : (i11 - 17) + i12, 0.0f, z13 ? (i11 - 17) + i12 : i11, 0.0f));
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
                addView(w1Var, i7.f6.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                w1Var.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            } else {
                w1Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i10 == 2) {
                    boolean z14 = LocaleController.isRTL;
                    addView(w1Var, i7.f6.d(-1, -2.0f, (z14 ? 5 : 3) | 16, z14 ? 8 : 29, 0.0f, z14 ? 29 : 8, 0.0f));
                } else {
                    int i13 = a() ? 56 : 46;
                    i13 = i10 == 7 ? i13 + 39 : i13;
                    int i14 = a() ? -2 : -1;
                    boolean z15 = LocaleController.isRTL;
                    addView(w1Var, i7.f6.d(i14, -2.0f, (z15 ? 5 : 3) | 16, z15 ? i11 : (i11 - 17) + i13, 0.0f, z15 ? (i11 - 17) + i13 : i11, 0.0f));
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
        float f9 = i11;
        addView(textView, i7.f6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f9, 0.0f, f9, 0.0f));
        if (a()) {
            hp hpVar = new hp(context, 21, c6Var);
            this.r = hpVar;
            this.h = hpVar;
            hpVar.setDrawUnchecked(true);
            hpVar.a(true, false);
            hpVar.setDrawBackgroundAsArc(10);
            this.A = 21;
            float f10 = 21;
            boolean z16 = LocaleController.isRTL;
            addView(hpVar, i7.f6.d(21, f10, (z16 ? 5 : 3) | 48, z16 ? 0 : i11, 16.0f, z16 ? i11 : 0, 0.0f));
        } else {
            if (i10 != 1 && i10 != 5) {
                z11 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, c6Var, z11);
            this.n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.A = 18;
            if (i10 == 5) {
                float f11 = 18;
                boolean z17 = LocaleController.isRTL;
                addView(checkBoxSquare, i7.f6.d(18, f11, (z17 ? 5 : 3) | 16, z17 ? 0 : i11, 0.0f, z17 ? i11 : 0, 0.0f));
            } else if (i10 == 3) {
                addView(checkBoxSquare, i7.f6.d(18, 18, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else if (i10 == 2) {
                addView(checkBoxSquare, i7.f6.d(18, 18, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                float f12 = 18;
                boolean z18 = LocaleController.isRTL;
                addView(checkBoxSquare, i7.f6.d(18, f12, (z18 ? 5 : 3) | 48, z18 ? 0 : i11, 16.0f, z18 ? i11 : 0, 0.0f));
            }
        }
        if (i10 == 6) {
            x1 x1Var = new x1(this, context, R.drawable.msg_folders_groups);
            this.v = x1Var;
            addView(x1Var, i7.f6.i(-2.0f, -2.0f, 8388629, f9, 0.0f, i11 - 11, 0.0f));
        } else if (i10 == 8) {
            x1 x1Var2 = new x1(this, context, 0);
            this.v = x1Var2;
            addView(x1Var2, i7.f6.i(-2.0f, -2.0f, 8388629, f9, 0.0f, i11 - 11, 0.0f));
        } else if (i10 == 7) {
            this.x = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
            this.w = t9Var;
            t9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
            addView(t9Var, i7.f6.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }
}

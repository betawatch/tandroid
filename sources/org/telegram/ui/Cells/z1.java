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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z1 extends FrameLayout {
    public final int A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public View E;
    public View F;
    public int a;
    public final org.telegram.ui.ActionBar.b6 b;
    public final x1 c;
    public final w1 d;
    public final View e;
    public final TextView f;
    public final View h;
    public final CheckBoxSquare n;
    public final dp r;
    public View s;
    public final y1 v;
    public final org.telegram.ui.Components.o9 w;
    public final org.telegram.ui.Components.z8 x;
    public final int y;

    public z1(Context context, int i9) {
        this(i9, 17, context, null, false);
    }

    public final boolean a() {
        int i9 = this.y;
        return i9 == 4 || i9 == 8 || i9 == 6 || i9 == 7;
    }

    public final boolean b() {
        dp dpVar = this.r;
        return dpVar != null ? dpVar.a.q : this.n.h;
    }

    public final void c(boolean z10, boolean z11) {
        dp dpVar = this.r;
        if (dpVar != null) {
            dpVar.a(z10, z11);
        } else {
            this.n.a(z10, z11);
        }
    }

    public final void d(org.telegram.ui.a aVar, mh.k3 k3Var) {
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
                view2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, this.b), 2, -1));
                addView(this.E, g7.e6.e(-1, -1, 119));
            }
            this.E.setOnClickListener(aVar);
        }
        if (k3Var == null) {
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
            addView(view4, g7.e6.e(56, -1, LocaleController.isRTL ? 5 : 3));
        }
        this.F.setOnClickListener(k3Var);
    }

    public final void e(CharSequence charSequence, String str, boolean z10, boolean z11, boolean z12) {
        if (this.D) {
            w1 w1Var = this.d;
            w1Var.c(Emoji.replaceEmoji(charSequence, w1Var.getPaint().getFontMetricsInt(), false), z12, true);
        } else {
            this.c.setText(charSequence);
        }
        dp dpVar = this.r;
        if (dpVar != null) {
            dpVar.a(z10, z12);
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
        org.telegram.ui.ActionBar.b6 b6Var = this.b;
        int i9 = this.y;
        if (z10) {
            this.d.setTextColor(org.telegram.ui.ActionBar.f6.v0((i9 == 1 || i9 == 5) ? org.telegram.ui.ActionBar.f6.j5 : org.telegram.ui.ActionBar.f6.G6, b6Var));
        } else {
            int v02 = org.telegram.ui.ActionBar.f6.v0((i9 == 1 || i9 == 5) ? org.telegram.ui.ActionBar.f6.j5 : org.telegram.ui.ActionBar.f6.G6, b6Var);
            x1 x1Var = this.c;
            x1Var.setTextColor(v02);
            x1Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0((i9 == 1 || i9 == 5) ? org.telegram.ui.ActionBar.f6.k5 : org.telegram.ui.ActionBar.f6.J6, b6Var));
        }
        this.f.setTextColor(org.telegram.ui.ActionBar.f6.v0((i9 == 1 || i9 == 5) ? org.telegram.ui.ActionBar.f6.m5 : org.telegram.ui.ActionBar.f6.I6, b6Var));
    }

    public org.telegram.ui.Components.j6 getAnimatedTextView() {
        return this.d;
    }

    public dp getCheckBoxRound() {
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
            org.telegram.ui.ActionBar.b6 b6Var = this.b;
            Paint O = b6Var != null ? b6Var.O("paintDivider") : null;
            if (O == null) {
                O = org.telegram.ui.ActionBar.f6.k0;
            }
            Paint paint = O;
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
        w1 w1Var = this.d;
        if (w1Var != null) {
            accessibilityNodeInfo.setText(w1Var.getText());
        } else {
            x1 x1Var = this.c;
            if (x1Var != null) {
                accessibilityNodeInfo.setText(x1Var.getText());
            }
        }
        accessibilityNodeInfo.setChecked(b());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        View view = this.h;
        int i11 = this.A;
        View view2 = this.e;
        TextView textView = this.f;
        int i12 = this.y;
        if (i12 == 3) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
            view2.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(34.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_31));
            float f10 = i11;
            view.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), TLObject.FLAG_30));
            setMeasuredDimension(AndroidUtilities.dp(29.0f) + view2.getMeasuredWidth(), AndroidUtilities.dp(50.0f));
        } else if (this.C) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(50.0f) + (this.B ? 1 : 0));
            int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(a() ? 60.0f : 34.0f);
            if (this.D) {
                measuredWidth += (int) this.d.getRightPadding();
            }
            if (i12 == 7) {
                measuredWidth -= AndroidUtilities.dp(34.0f);
            }
            if (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                measuredWidth -= ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin;
            }
            int i13 = measuredWidth / 2;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            int measuredWidth2 = textView.getMeasuredWidth();
            y1 y1Var = this.v;
            if (y1Var != null) {
                y1Var.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                measuredWidth2 = ll.D(11.0f, y1Var.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(ll.d(8.0f, (measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            } else {
                view2.measure(ll.d(8.0f, (measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            }
            org.telegram.ui.Components.o9 o9Var = this.w;
            if (o9Var != null) {
                o9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), TLObject.FLAG_30));
            }
            float f11 = i11;
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
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, this.b), PorterDuff.Mode.MULTIPLY));
            this.s.setBackground(mutate);
            addView(this.s, g7.e6.e(16, 16, 16));
        }
        f();
        this.s.animate().cancel();
        this.s.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(340L).setInterpolator(gr.h).start();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.e.setAlpha(z10 ? 1.0f : 0.5f);
        this.f.setAlpha(z10 ? 1.0f : 0.5f);
        this.h.setAlpha(z10 ? 1.0f : 0.5f);
    }

    public void setIcon(int i9) {
        this.r.setIcon(i9);
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
        x1 x1Var = this.c;
        if (z11) {
            x1Var.setLines(0);
            x1Var.setMaxLines(0);
            x1Var.setSingleLine(false);
            x1Var.setEllipsize(null);
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 16;
            layoutParams2.topMargin = 0;
        } else {
            x1Var.setLines(1);
            x1Var.setMaxLines(1);
            x1Var.setSingleLine(true);
            x1Var.setEllipsize(TextUtils.TruncateAt.END);
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

    public void setPad(int i9) {
        int dp = AndroidUtilities.dp(i9 * 40 * (LocaleController.isRTL ? -1 : 1));
        View view = this.h;
        if (view != null) {
            view.setTranslationX(dp);
        }
        float f10 = dp;
        this.e.setTranslationX(f10);
        org.telegram.ui.Components.o9 o9Var = this.w;
        if (o9Var != null) {
            o9Var.setTranslationX(f10);
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

    public void setTextColor(int i9) {
        if (this.D) {
            this.d.setTextColor(i9);
        } else {
            this.c.setTextColor(i9);
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        org.telegram.ui.Components.z8 z8Var = this.x;
        z8Var.p(tLObject);
        this.w.e(tLObject, z8Var);
        boolean z10 = tLObject instanceof TLRPC.User;
        String userName = z10 ? UserObject.getUserName((TLRPC.User) tLObject) : ContactsController.formatName(tLObject);
        if (z10 && ((TLRPC.User) tLObject).id == MessagesController.getInstance(UserConfig.selectedAccount).telegramAntispamUserId) {
            userName = LocaleController.getString(R.string.ChannelAntiSpamUser);
        }
        if (!this.D) {
            this.c.setText(userName);
        } else {
            w1 w1Var = this.d;
            w1Var.setText(Emoji.replaceEmoji(userName, w1Var.getPaint().getFontMetricsInt(), false));
        }
    }

    public z1(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        this(i9, 17, context, b6Var, false);
    }

    public z1(int i9, int i10, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.b = b6Var;
        this.y = i9;
        this.D = z10;
        boolean z11 = true;
        if (z10) {
            w1 w1Var = new w1(this, context, 0);
            this.d = w1Var;
            NotificationCenter.listenEmojiLoading(w1Var);
            w1Var.setEllipsizeByGradient(true);
            w1Var.setRightPadding(AndroidUtilities.dp(8.0f));
            w1Var.getDrawable().o(true, false, false);
            w1Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0((i9 == 1 || i9 == 5) ? org.telegram.ui.ActionBar.f6.j5 : org.telegram.ui.ActionBar.f6.G6, b6Var)));
            w1Var.setTextSize(AndroidUtilities.dp(16.0f));
            if (i9 == 7) {
                w1Var.setTypeface(AndroidUtilities.bold());
            }
            if (i9 == 3) {
                w1Var.setGravity(19);
                addView(w1Var, g7.e6.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                w1Var.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            } else {
                w1Var.setRightPadding(AndroidUtilities.dp(i10));
                w1Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i9 == 2) {
                    boolean z12 = LocaleController.isRTL;
                    addView(w1Var, g7.e6.d(-1, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 8 : 29, 0.0f, z12 ? 29 : 8, 0.0f));
                } else {
                    int i11 = a() ? 56 : 46;
                    i11 = i9 == 7 ? i11 + 39 : i11;
                    boolean z13 = LocaleController.isRTL;
                    addView(w1Var, g7.e6.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i10 : (i10 - 17) + i11, 0.0f, z13 ? (i10 - 17) + i11 : i10, 0.0f));
                }
            }
            this.e = w1Var;
        } else {
            x1 x1Var = new x1(this, context, 0);
            this.c = x1Var;
            NotificationCenter.listenEmojiLoading(x1Var);
            x1Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0((i9 == 1 || i9 == 5) ? org.telegram.ui.ActionBar.f6.j5 : org.telegram.ui.ActionBar.f6.G6, b6Var)));
            x1Var.setTextSize(1, 16.0f);
            x1Var.setLines(1);
            x1Var.setMaxLines(1);
            x1Var.setSingleLine(true);
            x1Var.setEllipsize(TextUtils.TruncateAt.END);
            if (i9 == 7) {
                x1Var.setTypeface(AndroidUtilities.bold());
            }
            if (i9 == 3) {
                x1Var.setGravity(19);
                addView(x1Var, g7.e6.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                x1Var.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            } else {
                x1Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i9 == 2) {
                    boolean z14 = LocaleController.isRTL;
                    addView(x1Var, g7.e6.d(-1, -2.0f, (z14 ? 5 : 3) | 16, z14 ? 8 : 29, 0.0f, z14 ? 29 : 8, 0.0f));
                } else {
                    int i12 = a() ? 56 : 46;
                    i12 = i9 == 7 ? i12 + 39 : i12;
                    int i13 = a() ? -2 : -1;
                    boolean z15 = LocaleController.isRTL;
                    addView(x1Var, g7.e6.d(i13, -2.0f, (z15 ? 5 : 3) | 16, z15 ? i10 : (i10 - 17) + i12, 0.0f, z15 ? (i10 - 17) + i12 : i10, 0.0f));
                }
            }
            this.e = x1Var;
        }
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTag(Integer.valueOf((i9 == 1 || i9 == 5) ? org.telegram.ui.ActionBar.f6.m5 : org.telegram.ui.ActionBar.f6.I6));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        float f10 = i10;
        addView(textView, g7.e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        if (a()) {
            dp dpVar = new dp(context, 21, b6Var);
            this.r = dpVar;
            this.h = dpVar;
            dpVar.setDrawUnchecked(true);
            dpVar.a(true, false);
            dpVar.setDrawBackgroundAsArc(10);
            this.A = 21;
            float f11 = 21;
            boolean z16 = LocaleController.isRTL;
            addView(dpVar, g7.e6.d(21, f11, (z16 ? 5 : 3) | 48, z16 ? 0 : i10, 16.0f, z16 ? i10 : 0, 0.0f));
        } else {
            if (i9 != 1 && i9 != 5) {
                z11 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, b6Var, z11);
            this.n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.A = 18;
            if (i9 == 5) {
                float f12 = 18;
                boolean z17 = LocaleController.isRTL;
                addView(checkBoxSquare, g7.e6.d(18, f12, (z17 ? 5 : 3) | 16, z17 ? 0 : i10, 0.0f, z17 ? i10 : 0, 0.0f));
            } else if (i9 == 3) {
                addView(checkBoxSquare, g7.e6.d(18, 18, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else if (i9 == 2) {
                addView(checkBoxSquare, g7.e6.d(18, 18, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                float f13 = 18;
                boolean z18 = LocaleController.isRTL;
                addView(checkBoxSquare, g7.e6.d(18, f13, (z18 ? 5 : 3) | 48, z18 ? 0 : i10, 16.0f, z18 ? i10 : 0, 0.0f));
            }
        }
        if (i9 == 6) {
            y1 y1Var = new y1(this, context, R.drawable.msg_folders_groups);
            this.v = y1Var;
            addView(y1Var, g7.e6.i(-2.0f, -2.0f, 8388629, f10, 0.0f, i10 - 11, 0.0f));
        } else if (i9 == 8) {
            y1 y1Var2 = new y1(this, context, 0);
            this.v = y1Var2;
            addView(y1Var2, g7.e6.i(-2.0f, -2.0f, 8388629, f10, 0.0f, i10 - 11, 0.0f));
        } else if (i9 == 7) {
            this.x = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
            this.w = o9Var;
            o9Var.setRoundRadius(AndroidUtilities.dp(17.0f));
            addView(o9Var, g7.e6.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }
}

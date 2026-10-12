package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ew0 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ gw0 d;

    public ew0(gw0 gw0Var, Context context) {
        this.d = gw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10;
        int b10 = b1Var.b();
        gw0 gw0Var = this.d;
        if (b10 == gw0Var.i0 || b10 == gw0Var.u0 || b10 == gw0Var.v0) {
            return !gw0Var.I;
        }
        if (!gw0Var.I || b10 < (i10 = gw0Var.n0) || b10 >= gw0Var.y + i10) {
            if (b10 != gw0Var.o0 && b10 != gw0Var.r0 && b10 != gw0Var.s0 && (gw0Var.N != 0 || b10 != gw0Var.t0)) {
                return false;
            }
        } else if (b10 - i10 < gw0Var.x) {
            return false;
        }
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.x0;
    }

    @Override // s4.g0
    public final int j(int i10) {
        gw0 gw0Var = this.d;
        if (i10 == gw0Var.h0 || i10 == gw0Var.m0 || i10 == gw0Var.q0) {
            return 0;
        }
        if (i10 == gw0Var.l0) {
            return 1;
        }
        if (i10 == gw0Var.p0 || i10 == gw0Var.w0 || i10 == gw0Var.k0) {
            return 2;
        }
        if (i10 == gw0Var.o0) {
            return 3;
        }
        if (i10 == gw0Var.i0) {
            return 4;
        }
        if (i10 == gw0Var.j0) {
            return 7;
        }
        return (i10 == gw0Var.r0 || i10 == gw0Var.s0 || i10 == gw0Var.t0 || i10 == gw0Var.u0 || i10 == gw0Var.v0) ? 6 : 5;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        gw0 gw0Var = this.d;
        int i11 = gw0Var.N;
        boolean z10 = gw0Var.d0;
        int i12 = b1Var.f;
        View view = b1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == gw0Var.h0) {
                m4Var.setText(LocaleController.getString(z10 ? gw0Var.z0 != null ? R.string.TodoEditTitle : R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 != gw0Var.m0) {
                if (i10 == gw0Var.q0) {
                    m4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (i11 == 1) {
                m4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                m4Var.setText(LocaleController.getString(z10 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            w8Var.setEnabled(!gw0Var.I);
            w8Var.getCheckBox().setAlpha(!gw0Var.I ? 1.0f : 0.6f);
            if (i10 == gw0Var.u0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), gw0Var.H, true);
                w8Var.e(null, true);
                return;
            }
            if (i10 == gw0Var.v0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), gw0Var.J, false);
                w8Var.e(null, true);
                return;
            }
            if (i10 == gw0Var.r0) {
                w8Var.f(LocaleController.getString(R.string.PollAnonymous), gw0Var.G, (gw0Var.s0 == -1 && gw0Var.t0 == -1) ? false : true);
                w8Var.e(null, true);
                return;
            } else if (i10 == gw0Var.s0) {
                w8Var.f(LocaleController.getString(R.string.PollMultiple), gw0Var.K, gw0Var.t0 != -1);
                w8Var.e(null, true);
                return;
            } else {
                if (i10 == gw0Var.t0) {
                    w8Var.f(LocaleController.getString(R.string.PollQuiz), gw0Var.L, false);
                    w8Var.e(null, i11 == 0);
                    return;
                }
                return;
            }
        }
        Context context = this.c;
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.e(-1, org.telegram.ui.ActionBar.g6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.k7, false), mode));
            r8Var.n(LocaleController.getString(z10 ? R.string.TodoNewTask : R.string.AddAnOption), new org.telegram.ui.Components.cr(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        e9Var.setFixedSize(0);
        e9Var.setBackground(org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
        if (i10 == gw0Var.k0) {
            e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i10 == gw0Var.w0) {
            e9Var.setFixedSize(12);
            e9Var.setText(null);
            return;
        }
        int i13 = gw0Var.n - gw0Var.y;
        if (i13 <= 0) {
            e9Var.setText(LocaleController.getString(z10 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
        } else if (z10) {
            e9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i13));
        } else {
            e9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i13, new Object[0])));
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        gw0 gw0Var = this.d;
        boolean z10 = gw0Var.c0;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
            } else if (i10 == 2) {
                view = new org.telegram.ui.Cells.e9(context);
            } else if (i10 == 3) {
                View r8Var = new org.telegram.ui.Cells.r8(context);
                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view = r8Var;
            } else if (i10 == 4) {
                bw0 bw0Var = new bw0(this, context, z10 ? 1 : 0);
                bw0Var.c();
                bw0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                bw0Var.b(new org.telegram.ui.Components.eo(4, this, bw0Var));
                view = bw0Var;
            } else if (i10 == 6) {
                View w8Var = new org.telegram.ui.Cells.w8(context);
                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view = w8Var;
            } else if (i10 != 7) {
                dw0 dw0Var = new dw0(this, context, z10 ? 1 : 0, new t60(gw0Var, 20));
                dw0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                dw0Var.b(new org.telegram.ui.Components.eo(6, this, dw0Var));
                dw0Var.setShowNextButton(true);
                EditTextBoldCursor textView = dw0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new ce(3, this, dw0Var));
                textView.setOnKeyListener(new yg(dw0Var, 2));
                view = dw0Var;
            } else {
                cw0 cw0Var = new cw0(this, context, z10 ? 1 : 0);
                cw0Var.c();
                cw0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                cw0Var.b(new org.telegram.ui.Components.eo(5, this, cw0Var));
                view = cw0Var;
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.g6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
            view = m4Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        gw0 gw0Var = this.d;
        boolean z10 = gw0Var.d0;
        int i10 = b1Var.f;
        View view = b1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            org.telegram.ui.Cells.c6 c6Var = d6Var.d;
            CharSequence charSequence = gw0Var.E;
            d6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            d6Var.setTag(null);
            d6Var.setEnabled(!gw0Var.I);
            c6Var.setEnabled(true ^ gw0Var.I);
            c6Var.setTextColor(org.telegram.ui.ActionBar.g6.m1(gw0Var.I ? 0.6f : 1.0f, gw0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6)));
            gw0.c0(gw0Var, view, b1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
                d6Var2.setTag(1);
                CharSequence charSequence2 = gw0Var.F;
                d6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                d6Var2.setTag(null);
                gw0.c0(gw0Var, view, b1Var.b());
                return;
            }
            return;
        }
        int b10 = b1Var.b();
        org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
        d6Var3.setTag(1);
        org.telegram.ui.Cells.c6 c6Var2 = d6Var3.d;
        int i11 = b10 - gw0Var.n0;
        boolean z11 = !gw0Var.I || i11 >= gw0Var.x;
        c6Var2.setEnabled(z11);
        c6Var2.setTextColor(org.telegram.ui.ActionBar.g6.m1(z11 ? 1.0f : 0.6f, gw0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6)));
        d6Var3.n(gw0Var.v[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        d6Var3.setTag(null);
        ImageView imageView = d6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = d6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!gw0Var.f0 && gw0Var.g0 == b10) {
            EditTextBoldCursor textView = d6Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            gw0Var.f0 = false;
            gw0Var.g0 = -1;
        }
        gw0.c0(gw0Var, view, b10);
    }

    @Override // s4.g0
    public final void z(s4.b1 b1Var) {
        int i10 = b1Var.f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) b1Var.a).getTextView();
            if (textView.isFocused()) {
                gw0 gw0Var = this.d;
                if (gw0Var.c0) {
                    org.telegram.ui.Components.kz0 kz0Var = gw0Var.Q;
                    if (kz0Var != null) {
                        kz0Var.f();
                    }
                    gw0Var.k0(true);
                }
                gw0Var.b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class dw0 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ fw0 d;

    public dw0(fw0 fw0Var, Context context) {
        this.d = fw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10;
        int b10 = b1Var.b();
        fw0 fw0Var = this.d;
        if (b10 == fw0Var.i0 || b10 == fw0Var.u0 || b10 == fw0Var.v0) {
            return !fw0Var.I;
        }
        if (!fw0Var.I || b10 < (i10 = fw0Var.n0) || b10 >= fw0Var.y + i10) {
            if (b10 != fw0Var.o0 && b10 != fw0Var.r0 && b10 != fw0Var.s0 && (fw0Var.N != 0 || b10 != fw0Var.t0)) {
                return false;
            }
        } else if (b10 - i10 < fw0Var.x) {
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
        fw0 fw0Var = this.d;
        if (i10 == fw0Var.h0 || i10 == fw0Var.m0 || i10 == fw0Var.q0) {
            return 0;
        }
        if (i10 == fw0Var.l0) {
            return 1;
        }
        if (i10 == fw0Var.p0 || i10 == fw0Var.w0 || i10 == fw0Var.k0) {
            return 2;
        }
        if (i10 == fw0Var.o0) {
            return 3;
        }
        if (i10 == fw0Var.i0) {
            return 4;
        }
        if (i10 == fw0Var.j0) {
            return 7;
        }
        return (i10 == fw0Var.r0 || i10 == fw0Var.s0 || i10 == fw0Var.t0 || i10 == fw0Var.u0 || i10 == fw0Var.v0) ? 6 : 5;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        fw0 fw0Var = this.d;
        int i11 = fw0Var.N;
        boolean z10 = fw0Var.d0;
        int i12 = b1Var.f;
        View view = b1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == fw0Var.h0) {
                m4Var.setText(LocaleController.getString(z10 ? fw0Var.z0 != null ? R.string.TodoEditTitle : R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 != fw0Var.m0) {
                if (i10 == fw0Var.q0) {
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
            w8Var.setEnabled(!fw0Var.I);
            w8Var.getCheckBox().setAlpha(!fw0Var.I ? 1.0f : 0.6f);
            if (i10 == fw0Var.u0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), fw0Var.H, true);
                w8Var.e(null, true);
                return;
            }
            if (i10 == fw0Var.v0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), fw0Var.J, false);
                w8Var.e(null, true);
                return;
            }
            if (i10 == fw0Var.r0) {
                w8Var.f(LocaleController.getString(R.string.PollAnonymous), fw0Var.G, (fw0Var.s0 == -1 && fw0Var.t0 == -1) ? false : true);
                w8Var.e(null, true);
                return;
            } else if (i10 == fw0Var.s0) {
                w8Var.f(LocaleController.getString(R.string.PollMultiple), fw0Var.K, fw0Var.t0 != -1);
                w8Var.e(null, true);
                return;
            } else {
                if (i10 == fw0Var.t0) {
                    w8Var.f(LocaleController.getString(R.string.PollQuiz), fw0Var.L, false);
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
        if (i10 == fw0Var.k0) {
            e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i10 == fw0Var.w0) {
            e9Var.setFixedSize(12);
            e9Var.setText(null);
            return;
        }
        int i13 = fw0Var.n - fw0Var.y;
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
        fw0 fw0Var = this.d;
        boolean z10 = fw0Var.c0;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
            } else if (i10 == 2) {
                view = new org.telegram.ui.Cells.e9(context);
            } else if (i10 == 3) {
                View r8Var = new org.telegram.ui.Cells.r8(context);
                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view = r8Var;
            } else if (i10 == 4) {
                aw0 aw0Var = new aw0(this, context, z10 ? 1 : 0);
                aw0Var.c();
                aw0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                aw0Var.b(new org.telegram.ui.Components.eo(4, this, aw0Var));
                view = aw0Var;
            } else if (i10 == 6) {
                View w8Var = new org.telegram.ui.Cells.w8(context);
                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view = w8Var;
            } else if (i10 != 7) {
                cw0 cw0Var = new cw0(this, context, z10 ? 1 : 0, new t60(fw0Var, 20));
                cw0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                cw0Var.b(new org.telegram.ui.Components.eo(6, this, cw0Var));
                cw0Var.setShowNextButton(true);
                EditTextBoldCursor textView = cw0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new ce(3, this, cw0Var));
                textView.setOnKeyListener(new yg(cw0Var, 2));
                view = cw0Var;
            } else {
                bw0 bw0Var = new bw0(this, context, z10 ? 1 : 0);
                bw0Var.c();
                bw0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                bw0Var.b(new org.telegram.ui.Components.eo(5, this, bw0Var));
                view = bw0Var;
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
        fw0 fw0Var = this.d;
        boolean z10 = fw0Var.d0;
        int i10 = b1Var.f;
        View view = b1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            org.telegram.ui.Cells.c6 c6Var = d6Var.d;
            CharSequence charSequence = fw0Var.E;
            d6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            d6Var.setTag(null);
            d6Var.setEnabled(!fw0Var.I);
            c6Var.setEnabled(true ^ fw0Var.I);
            c6Var.setTextColor(org.telegram.ui.ActionBar.g6.m1(fw0Var.I ? 0.6f : 1.0f, fw0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6)));
            fw0.c0(fw0Var, view, b1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
                d6Var2.setTag(1);
                CharSequence charSequence2 = fw0Var.F;
                d6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                d6Var2.setTag(null);
                fw0.c0(fw0Var, view, b1Var.b());
                return;
            }
            return;
        }
        int b10 = b1Var.b();
        org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
        d6Var3.setTag(1);
        org.telegram.ui.Cells.c6 c6Var2 = d6Var3.d;
        int i11 = b10 - fw0Var.n0;
        boolean z11 = !fw0Var.I || i11 >= fw0Var.x;
        c6Var2.setEnabled(z11);
        c6Var2.setTextColor(org.telegram.ui.ActionBar.g6.m1(z11 ? 1.0f : 0.6f, fw0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6)));
        d6Var3.n(fw0Var.v[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        d6Var3.setTag(null);
        ImageView imageView = d6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = d6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!fw0Var.f0 && fw0Var.g0 == b10) {
            EditTextBoldCursor textView = d6Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            fw0Var.f0 = false;
            fw0Var.g0 = -1;
        }
        fw0.c0(fw0Var, view, b10);
    }

    @Override // s4.g0
    public final void z(s4.b1 b1Var) {
        int i10 = b1Var.f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) b1Var.a).getTextView();
            if (textView.isFocused()) {
                fw0 fw0Var = this.d;
                if (fw0Var.c0) {
                    org.telegram.ui.Components.lz0 lz0Var = fw0Var.Q;
                    if (lz0Var != null) {
                        lz0Var.f();
                    }
                    fw0Var.k0(true);
                }
                fw0Var.b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class dv0 extends org.telegram.ui.Components.im0 {
    public final Context c;
    public final /* synthetic */ fv0 d;

    public dv0(fv0 fv0Var, Context context) {
        this.d = fv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        int i10;
        int b10 = b1Var.b();
        fv0 fv0Var = this.d;
        if (b10 == fv0Var.i0 || b10 == fv0Var.u0 || b10 == fv0Var.v0) {
            return !fv0Var.I;
        }
        if (!fv0Var.I || b10 < (i10 = fv0Var.n0) || b10 >= fv0Var.y + i10) {
            if (b10 != fv0Var.o0 && b10 != fv0Var.r0 && b10 != fv0Var.s0 && (fv0Var.N != 0 || b10 != fv0Var.t0)) {
                return false;
            }
        } else if (b10 - i10 < fv0Var.x) {
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
        fv0 fv0Var = this.d;
        if (i10 == fv0Var.h0 || i10 == fv0Var.m0 || i10 == fv0Var.q0) {
            return 0;
        }
        if (i10 == fv0Var.l0) {
            return 1;
        }
        if (i10 == fv0Var.p0 || i10 == fv0Var.w0 || i10 == fv0Var.k0) {
            return 2;
        }
        if (i10 == fv0Var.o0) {
            return 3;
        }
        if (i10 == fv0Var.i0) {
            return 4;
        }
        if (i10 == fv0Var.j0) {
            return 7;
        }
        return (i10 == fv0Var.r0 || i10 == fv0Var.s0 || i10 == fv0Var.t0 || i10 == fv0Var.u0 || i10 == fv0Var.v0) ? 6 : 5;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        fv0 fv0Var = this.d;
        int i11 = fv0Var.N;
        boolean z10 = fv0Var.d0;
        int i12 = b1Var.f;
        View view = b1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == fv0Var.h0) {
                l4Var.setText(LocaleController.getString(z10 ? fv0Var.z0 != null ? R.string.TodoEditTitle : R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 != fv0Var.m0) {
                if (i10 == fv0Var.q0) {
                    l4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (i11 == 1) {
                l4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                l4Var.setText(LocaleController.getString(z10 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            v8Var.setEnabled(!fv0Var.I);
            v8Var.getCheckBox().setAlpha(!fv0Var.I ? 1.0f : 0.6f);
            if (i10 == fv0Var.u0) {
                v8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), fv0Var.H, true);
                v8Var.e(null, true);
                return;
            }
            if (i10 == fv0Var.v0) {
                v8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), fv0Var.J, false);
                v8Var.e(null, true);
                return;
            }
            if (i10 == fv0Var.r0) {
                v8Var.f(LocaleController.getString(R.string.PollAnonymous), fv0Var.G, (fv0Var.s0 == -1 && fv0Var.t0 == -1) ? false : true);
                v8Var.e(null, true);
                return;
            } else if (i10 == fv0Var.s0) {
                v8Var.f(LocaleController.getString(R.string.PollMultiple), fv0Var.K, fv0Var.t0 != -1);
                v8Var.e(null, true);
                return;
            } else {
                if (i10 == fv0Var.t0) {
                    v8Var.f(LocaleController.getString(R.string.PollQuiz), fv0Var.L, false);
                    v8Var.e(null, i11 == 0);
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
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            q8Var.e(-1, org.telegram.ui.ActionBar.h6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.k7, false), mode));
            q8Var.n(LocaleController.getString(z10 ? R.string.TodoNewTask : R.string.AddAnOption), new org.telegram.ui.Components.zq(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
        d9Var.setFixedSize(0);
        d9Var.setBackground(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
        if (i10 == fv0Var.k0) {
            d9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i10 == fv0Var.w0) {
            d9Var.setFixedSize(12);
            d9Var.setText(null);
            return;
        }
        int i13 = fv0Var.n - fv0Var.y;
        if (i13 <= 0) {
            d9Var.setText(LocaleController.getString(z10 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
        } else if (z10) {
            d9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i13));
        } else {
            d9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i13, new Object[0])));
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        fv0 fv0Var = this.d;
        boolean z10 = fv0Var.c0;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
            } else if (i10 == 2) {
                view = new org.telegram.ui.Cells.d9(context);
            } else if (i10 == 3) {
                View q8Var = new org.telegram.ui.Cells.q8(context);
                q8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view = q8Var;
            } else if (i10 == 4) {
                av0 av0Var = new av0(this, context, z10 ? 1 : 0);
                av0Var.d();
                av0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                av0Var.c(new org.telegram.ui.Components.ao(4, this, av0Var));
                view = av0Var;
            } else if (i10 == 6) {
                View v8Var = new org.telegram.ui.Cells.v8(context);
                v8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view = v8Var;
            } else if (i10 != 7) {
                cv0 cv0Var = new cv0(this, context, z10 ? 1 : 0, new s50(fv0Var, 21));
                cv0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                cv0Var.c(new org.telegram.ui.Components.ao(6, this, cv0Var));
                cv0Var.setShowNextButton(true);
                EditTextBoldCursor textView = cv0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new wd(3, this, cv0Var));
                textView.setOnKeyListener(new lg(cv0Var, 2));
                view = cv0Var;
            } else {
                bv0 bv0Var = new bv0(this, context, z10 ? 1 : 0);
                bv0Var.d();
                bv0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                bv0Var.c(new org.telegram.ui.Components.ao(5, this, bv0Var));
                view = bv0Var;
            }
        } else {
            View l4Var = new org.telegram.ui.Cells.l4(this.c, org.telegram.ui.ActionBar.h6.L6, 21, 15, false, null);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
            view = l4Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        fv0 fv0Var = this.d;
        boolean z10 = fv0Var.d0;
        int i10 = b1Var.f;
        View view = b1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            org.telegram.ui.Cells.b6 b6Var = c6Var.d;
            CharSequence charSequence = fv0Var.E;
            c6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            c6Var.setTag(null);
            c6Var.setEnabled(!fv0Var.I);
            b6Var.setEnabled(true ^ fv0Var.I);
            b6Var.setTextColor(org.telegram.ui.ActionBar.h6.m1(fv0Var.I ? 0.6f : 1.0f, fv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6)));
            fv0.c0(fv0Var, view, b1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
                c6Var2.setTag(1);
                CharSequence charSequence2 = fv0Var.F;
                c6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                c6Var2.setTag(null);
                fv0.c0(fv0Var, view, b1Var.b());
                return;
            }
            return;
        }
        int b10 = b1Var.b();
        org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
        c6Var3.setTag(1);
        org.telegram.ui.Cells.b6 b6Var2 = c6Var3.d;
        int i11 = b10 - fv0Var.n0;
        boolean z11 = !fv0Var.I || i11 >= fv0Var.x;
        b6Var2.setEnabled(z11);
        b6Var2.setTextColor(org.telegram.ui.ActionBar.h6.m1(z11 ? 1.0f : 0.6f, fv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6)));
        c6Var3.n(fv0Var.v[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        c6Var3.setTag(null);
        ImageView imageView = c6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = c6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!fv0Var.f0 && fv0Var.g0 == b10) {
            EditTextBoldCursor textView = c6Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            fv0Var.f0 = false;
            fv0Var.g0 = -1;
        }
        fv0.c0(fv0Var, view, b10);
    }

    @Override // s4.g0
    public final void z(s4.b1 b1Var) {
        int i10 = b1Var.f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) b1Var.a).getTextView();
            if (textView.isFocused()) {
                fv0 fv0Var = this.d;
                if (fv0Var.c0) {
                    org.telegram.ui.Components.iz0 iz0Var = fv0Var.Q;
                    if (iz0Var != null) {
                        iz0Var.f();
                    }
                    fv0Var.k0(true);
                }
                fv0Var.b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

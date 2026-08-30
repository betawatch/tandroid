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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class dv0 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ fv0 d;

    public dv0(fv0 fv0Var, Context context) {
        this.d = fv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10;
        int b10 = l1Var.b();
        fv0 fv0Var = this.d;
        if (b10 == fv0Var.f0 || b10 == fv0Var.r0 || b10 == fv0Var.s0) {
            return !fv0Var.F;
        }
        if (!fv0Var.F || b10 < (i10 = fv0Var.k0) || b10 >= fv0Var.y + i10) {
            if (b10 != fv0Var.l0 && b10 != fv0Var.o0 && b10 != fv0Var.p0 && (fv0Var.K != 0 || b10 != fv0Var.q0)) {
                return false;
            }
        } else if (b10 - i10 < fv0Var.x) {
            return false;
        }
        return true;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.u0;
    }

    @Override // f2.o0
    public final int j(int i10) {
        fv0 fv0Var = this.d;
        if (i10 == fv0Var.e0 || i10 == fv0Var.j0 || i10 == fv0Var.n0) {
            return 0;
        }
        if (i10 == fv0Var.i0) {
            return 1;
        }
        if (i10 == fv0Var.m0 || i10 == fv0Var.t0 || i10 == fv0Var.h0) {
            return 2;
        }
        if (i10 == fv0Var.l0) {
            return 3;
        }
        if (i10 == fv0Var.f0) {
            return 4;
        }
        if (i10 == fv0Var.g0) {
            return 7;
        }
        return (i10 == fv0Var.o0 || i10 == fv0Var.p0 || i10 == fv0Var.q0 || i10 == fv0Var.r0 || i10 == fv0Var.s0) ? 6 : 5;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        fv0 fv0Var = this.d;
        int i11 = fv0Var.K;
        boolean z4 = fv0Var.a0;
        int i12 = l1Var.f;
        View view = l1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == fv0Var.e0) {
                m4Var.setText(LocaleController.getString(z4 ? fv0Var.w0 != null ? R.string.TodoEditTitle : R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 != fv0Var.j0) {
                if (i10 == fv0Var.n0) {
                    m4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (i11 == 1) {
                m4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                m4Var.setText(LocaleController.getString(z4 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            s8Var.setEnabled(!fv0Var.F);
            s8Var.getCheckBox().setAlpha(!fv0Var.F ? 1.0f : 0.6f);
            if (i10 == fv0Var.r0) {
                s8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), fv0Var.E, true);
                s8Var.e(null, true);
                return;
            }
            if (i10 == fv0Var.s0) {
                s8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), fv0Var.G, false);
                s8Var.e(null, true);
                return;
            }
            if (i10 == fv0Var.o0) {
                s8Var.f(LocaleController.getString(R.string.PollAnonymous), fv0Var.D, (fv0Var.p0 == -1 && fv0Var.q0 == -1) ? false : true);
                s8Var.e(null, true);
                return;
            } else if (i10 == fv0Var.p0) {
                s8Var.f(LocaleController.getString(R.string.PollMultiple), fv0Var.H, fv0Var.q0 != -1);
                s8Var.e(null, true);
                return;
            } else {
                if (i10 == fv0Var.q0) {
                    s8Var.f(LocaleController.getString(R.string.PollQuiz), fv0Var.I, false);
                    s8Var.e(null, i11 == 0);
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
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            o8Var.e(-1, org.telegram.ui.ActionBar.j6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k7, false), mode));
            o8Var.n(LocaleController.getString(z4 ? R.string.TodoNewTask : R.string.AddAnOption), new org.telegram.ui.Components.nq(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        a9Var.setFixedSize(0);
        a9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
        if (i10 == fv0Var.h0) {
            a9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i10 == fv0Var.t0) {
            a9Var.setFixedSize(12);
            a9Var.setText(null);
            return;
        }
        int i13 = fv0Var.n - fv0Var.y;
        if (i13 <= 0) {
            a9Var.setText(LocaleController.getString(z4 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
        } else if (z4) {
            a9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i13));
        } else {
            a9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i13, new Object[0])));
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        fv0 fv0Var = this.d;
        boolean z4 = fv0Var.Z;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                view = new org.telegram.ui.Cells.z6(context, (b) null);
            } else if (i10 == 2) {
                view = new org.telegram.ui.Cells.a9(context);
            } else if (i10 == 3) {
                View o8Var = new org.telegram.ui.Cells.o8(context);
                o8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = o8Var;
            } else if (i10 == 4) {
                av0 av0Var = new av0(this, context, z4 ? 1 : 0);
                av0Var.d();
                av0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                av0Var.c(new cg.b0(this, av0Var, false, 11));
                view = av0Var;
            } else if (i10 == 6) {
                View s8Var = new org.telegram.ui.Cells.s8(context);
                s8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = s8Var;
            } else if (i10 != 7) {
                cv0 cv0Var = new cv0(this, context, z4 ? 1 : 0, new e60(fv0Var, 22));
                cv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                cv0Var.c(new cg.b0(this, cv0Var, false, 13));
                cv0Var.setShowNextButton(true);
                EditTextBoldCursor textView = cv0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new yd(3, this, cv0Var));
                textView.setOnKeyListener(new og(cv0Var, 2));
                view = cv0Var;
            } else {
                bv0 bv0Var = new bv0(this, context, z4 ? 1 : 0);
                bv0Var.d();
                bv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                bv0Var.c(new cg.b0(this, bv0Var, false, 12));
                view = bv0Var;
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            view = m4Var;
        }
        return yh.o(view, view, -1, -2);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        fv0 fv0Var = this.d;
        boolean z4 = fv0Var.a0;
        int i10 = l1Var.f;
        View view = l1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            dh.b bVar = c6Var.d;
            CharSequence charSequence = fv0Var.B;
            c6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z4 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            c6Var.setTag(null);
            c6Var.setEnabled(!fv0Var.F);
            bVar.setEnabled(true ^ fv0Var.F);
            bVar.setTextColor(org.telegram.ui.ActionBar.j6.l1(fv0Var.F ? 0.6f : 1.0f, fv0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6)));
            fv0.c0(fv0Var, view, l1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
                c6Var2.setTag(1);
                CharSequence charSequence2 = fv0Var.C;
                c6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                c6Var2.setTag(null);
                fv0.c0(fv0Var, view, l1Var.b());
                return;
            }
            return;
        }
        int b10 = l1Var.b();
        org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
        c6Var3.setTag(1);
        dh.b bVar2 = c6Var3.d;
        int i11 = b10 - fv0Var.k0;
        boolean z10 = !fv0Var.F || i11 >= fv0Var.x;
        bVar2.setEnabled(z10);
        bVar2.setTextColor(org.telegram.ui.ActionBar.j6.l1(z10 ? 1.0f : 0.6f, fv0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6)));
        c6Var3.n(fv0Var.v[i11], LocaleController.getString(z4 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        c6Var3.setTag(null);
        ImageView imageView = c6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
        ImageView imageView2 = c6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z10 ? 1.0f : 0.45f);
        }
        if (!fv0Var.c0 && fv0Var.d0 == b10) {
            EditTextBoldCursor textView = c6Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            fv0Var.c0 = false;
            fv0Var.d0 = -1;
        }
        fv0.c0(fv0Var, view, b10);
    }

    @Override // f2.o0
    public final void z(f2.l1 l1Var) {
        int i10 = l1Var.f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) l1Var.a).getTextView();
            if (textView.isFocused()) {
                fv0 fv0Var = this.d;
                if (fv0Var.Z) {
                    org.telegram.ui.Components.qy0 qy0Var = fv0Var.N;
                    if (qy0Var != null) {
                        qy0Var.f();
                    }
                    fv0Var.k0(true);
                }
                fv0Var.Y = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

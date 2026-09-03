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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class kv0 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ mv0 d;

    public kv0(mv0 mv0Var, Context context) {
        this.d = mv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        int i10;
        int b10 = m1Var.b();
        mv0 mv0Var = this.d;
        if (b10 == mv0Var.f0 || b10 == mv0Var.r0 || b10 == mv0Var.s0) {
            return !mv0Var.F;
        }
        if (!mv0Var.F || b10 < (i10 = mv0Var.k0) || b10 >= mv0Var.y + i10) {
            if (b10 != mv0Var.l0 && b10 != mv0Var.o0 && b10 != mv0Var.p0 && (mv0Var.K != 0 || b10 != mv0Var.q0)) {
                return false;
            }
        } else if (b10 - i10 < mv0Var.x) {
            return false;
        }
        return true;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.u0;
    }

    @Override // f2.p0
    public final int j(int i10) {
        mv0 mv0Var = this.d;
        if (i10 == mv0Var.e0 || i10 == mv0Var.j0 || i10 == mv0Var.n0) {
            return 0;
        }
        if (i10 == mv0Var.i0) {
            return 1;
        }
        if (i10 == mv0Var.m0 || i10 == mv0Var.t0 || i10 == mv0Var.h0) {
            return 2;
        }
        if (i10 == mv0Var.l0) {
            return 3;
        }
        if (i10 == mv0Var.f0) {
            return 4;
        }
        if (i10 == mv0Var.g0) {
            return 7;
        }
        return (i10 == mv0Var.o0 || i10 == mv0Var.p0 || i10 == mv0Var.q0 || i10 == mv0Var.r0 || i10 == mv0Var.s0) ? 6 : 5;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        mv0 mv0Var = this.d;
        int i11 = mv0Var.K;
        boolean z4 = mv0Var.a0;
        int i12 = m1Var.f;
        View view = m1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == mv0Var.e0) {
                m4Var.setText(LocaleController.getString(z4 ? mv0Var.w0 != null ? R.string.TodoEditTitle : R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 != mv0Var.j0) {
                if (i10 == mv0Var.n0) {
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
            s8Var.setEnabled(!mv0Var.F);
            s8Var.getCheckBox().setAlpha(!mv0Var.F ? 1.0f : 0.6f);
            if (i10 == mv0Var.r0) {
                s8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), mv0Var.E, true);
                s8Var.e(null, true);
                return;
            }
            if (i10 == mv0Var.s0) {
                s8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), mv0Var.G, false);
                s8Var.e(null, true);
                return;
            }
            if (i10 == mv0Var.o0) {
                s8Var.f(LocaleController.getString(R.string.PollAnonymous), mv0Var.D, (mv0Var.p0 == -1 && mv0Var.q0 == -1) ? false : true);
                s8Var.e(null, true);
                return;
            } else if (i10 == mv0Var.p0) {
                s8Var.f(LocaleController.getString(R.string.PollMultiple), mv0Var.H, mv0Var.q0 != -1);
                s8Var.e(null, true);
                return;
            } else {
                if (i10 == mv0Var.q0) {
                    s8Var.f(LocaleController.getString(R.string.PollQuiz), mv0Var.I, false);
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
            o8Var.e(-1, org.telegram.ui.ActionBar.k6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.k7, false), mode));
            o8Var.n(LocaleController.getString(z4 ? R.string.TodoNewTask : R.string.AddAnOption), new org.telegram.ui.Components.pq(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        a9Var.setFixedSize(0);
        a9Var.setBackground(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
        if (i10 == mv0Var.h0) {
            a9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i10 == mv0Var.t0) {
            a9Var.setFixedSize(12);
            a9Var.setText(null);
            return;
        }
        int i13 = mv0Var.n - mv0Var.y;
        if (i13 <= 0) {
            a9Var.setText(LocaleController.getString(z4 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
        } else if (z4) {
            a9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i13));
        } else {
            a9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i13, new Object[0])));
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        mv0 mv0Var = this.d;
        boolean z4 = mv0Var.Z;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                view = new org.telegram.ui.Cells.z6(context, (b) null);
            } else if (i10 == 2) {
                view = new org.telegram.ui.Cells.a9(context);
            } else if (i10 == 3) {
                View o8Var = new org.telegram.ui.Cells.o8(context);
                o8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                view = o8Var;
            } else if (i10 == 4) {
                hv0 hv0Var = new hv0(this, context, z4 ? 1 : 0);
                hv0Var.d();
                hv0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                hv0Var.c(new dg.b0(this, hv0Var, false, 11));
                view = hv0Var;
            } else if (i10 == 6) {
                View s8Var = new org.telegram.ui.Cells.s8(context);
                s8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                view = s8Var;
            } else if (i10 != 7) {
                jv0 jv0Var = new jv0(this, context, z4 ? 1 : 0, new f60(mv0Var, 21));
                jv0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                jv0Var.c(new dg.b0(this, jv0Var, false, 13));
                jv0Var.setShowNextButton(true);
                EditTextBoldCursor textView = jv0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new yd(3, this, jv0Var));
                textView.setOnKeyListener(new og(jv0Var, 2));
                view = jv0Var;
            } else {
                iv0 iv0Var = new iv0(this, context, z4 ? 1 : 0);
                iv0Var.d();
                iv0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                iv0Var.c(new dg.b0(this, iv0Var, false, 12));
                view = iv0Var;
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
            view = m4Var;
        }
        return yh.o(view, view, -1, -2);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        mv0 mv0Var = this.d;
        boolean z4 = mv0Var.a0;
        int i10 = m1Var.f;
        View view = m1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            eh.b bVar = c6Var.d;
            CharSequence charSequence = mv0Var.B;
            c6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z4 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            c6Var.setTag(null);
            c6Var.setEnabled(!mv0Var.F);
            bVar.setEnabled(true ^ mv0Var.F);
            bVar.setTextColor(org.telegram.ui.ActionBar.k6.l1(mv0Var.F ? 0.6f : 1.0f, mv0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6)));
            mv0.c0(mv0Var, view, m1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
                c6Var2.setTag(1);
                CharSequence charSequence2 = mv0Var.C;
                c6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                c6Var2.setTag(null);
                mv0.c0(mv0Var, view, m1Var.b());
                return;
            }
            return;
        }
        int b10 = m1Var.b();
        org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
        c6Var3.setTag(1);
        eh.b bVar2 = c6Var3.d;
        int i11 = b10 - mv0Var.k0;
        boolean z10 = !mv0Var.F || i11 >= mv0Var.x;
        bVar2.setEnabled(z10);
        bVar2.setTextColor(org.telegram.ui.ActionBar.k6.l1(z10 ? 1.0f : 0.6f, mv0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6)));
        c6Var3.n(mv0Var.v[i11], LocaleController.getString(z4 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        c6Var3.setTag(null);
        ImageView imageView = c6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
        ImageView imageView2 = c6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z10 ? 1.0f : 0.45f);
        }
        if (!mv0Var.c0 && mv0Var.d0 == b10) {
            EditTextBoldCursor textView = c6Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            mv0Var.c0 = false;
            mv0Var.d0 = -1;
        }
        mv0.c0(mv0Var, view, b10);
    }

    @Override // f2.p0
    public final void z(f2.m1 m1Var) {
        int i10 = m1Var.f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) m1Var.a).getTextView();
            if (textView.isFocused()) {
                mv0 mv0Var = this.d;
                if (mv0Var.Z) {
                    org.telegram.ui.Components.qy0 qy0Var = mv0Var.N;
                    if (qy0Var != null) {
                        qy0Var.f();
                    }
                    mv0Var.k0(true);
                }
                mv0Var.Y = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

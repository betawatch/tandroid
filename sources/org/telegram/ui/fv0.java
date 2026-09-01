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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fv0 extends org.telegram.ui.Components.sl0 {
    public final Context c;
    public final /* synthetic */ hv0 d;

    public fv0(hv0 hv0Var, Context context) {
        this.d = hv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        int i10;
        int b10 = m1Var.b();
        hv0 hv0Var = this.d;
        if (b10 == hv0Var.f0 || b10 == hv0Var.r0 || b10 == hv0Var.s0) {
            return !hv0Var.F;
        }
        if (!hv0Var.F || b10 < (i10 = hv0Var.k0) || b10 >= hv0Var.y + i10) {
            if (b10 != hv0Var.l0 && b10 != hv0Var.o0 && b10 != hv0Var.p0 && (hv0Var.K != 0 || b10 != hv0Var.q0)) {
                return false;
            }
        } else if (b10 - i10 < hv0Var.x) {
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
        hv0 hv0Var = this.d;
        if (i10 == hv0Var.e0 || i10 == hv0Var.j0 || i10 == hv0Var.n0) {
            return 0;
        }
        if (i10 == hv0Var.i0) {
            return 1;
        }
        if (i10 == hv0Var.m0 || i10 == hv0Var.t0 || i10 == hv0Var.h0) {
            return 2;
        }
        if (i10 == hv0Var.l0) {
            return 3;
        }
        if (i10 == hv0Var.f0) {
            return 4;
        }
        if (i10 == hv0Var.g0) {
            return 7;
        }
        return (i10 == hv0Var.o0 || i10 == hv0Var.p0 || i10 == hv0Var.q0 || i10 == hv0Var.r0 || i10 == hv0Var.s0) ? 6 : 5;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        hv0 hv0Var = this.d;
        int i11 = hv0Var.K;
        boolean z4 = hv0Var.a0;
        int i12 = m1Var.f;
        View view = m1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == hv0Var.e0) {
                m4Var.setText(LocaleController.getString(z4 ? hv0Var.w0 != null ? R.string.TodoEditTitle : R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 != hv0Var.j0) {
                if (i10 == hv0Var.n0) {
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
            s8Var.setEnabled(!hv0Var.F);
            s8Var.getCheckBox().setAlpha(!hv0Var.F ? 1.0f : 0.6f);
            if (i10 == hv0Var.r0) {
                s8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), hv0Var.E, true);
                s8Var.e(null, true);
                return;
            }
            if (i10 == hv0Var.s0) {
                s8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), hv0Var.G, false);
                s8Var.e(null, true);
                return;
            }
            if (i10 == hv0Var.o0) {
                s8Var.f(LocaleController.getString(R.string.PollAnonymous), hv0Var.D, (hv0Var.p0 == -1 && hv0Var.q0 == -1) ? false : true);
                s8Var.e(null, true);
                return;
            } else if (i10 == hv0Var.p0) {
                s8Var.f(LocaleController.getString(R.string.PollMultiple), hv0Var.H, hv0Var.q0 != -1);
                s8Var.e(null, true);
                return;
            } else {
                if (i10 == hv0Var.q0) {
                    s8Var.f(LocaleController.getString(R.string.PollQuiz), hv0Var.I, false);
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
        if (i10 == hv0Var.h0) {
            a9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i10 == hv0Var.t0) {
            a9Var.setFixedSize(12);
            a9Var.setText(null);
            return;
        }
        int i13 = hv0Var.n - hv0Var.y;
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
        hv0 hv0Var = this.d;
        boolean z4 = hv0Var.Z;
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
                cv0 cv0Var = new cv0(this, context, z4 ? 1 : 0);
                cv0Var.d();
                cv0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                cv0Var.c(new dg.b0(this, cv0Var, false, 11));
                view = cv0Var;
            } else if (i10 == 6) {
                View s8Var = new org.telegram.ui.Cells.s8(context);
                s8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                view = s8Var;
            } else if (i10 != 7) {
                ev0 ev0Var = new ev0(this, context, z4 ? 1 : 0, new f60(hv0Var, 22));
                ev0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                ev0Var.c(new dg.b0(this, ev0Var, false, 13));
                ev0Var.setShowNextButton(true);
                EditTextBoldCursor textView = ev0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new yd(3, this, ev0Var));
                textView.setOnKeyListener(new og(ev0Var, 2));
                view = ev0Var;
            } else {
                dv0 dv0Var = new dv0(this, context, z4 ? 1 : 0);
                dv0Var.d();
                dv0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                dv0Var.c(new dg.b0(this, dv0Var, false, 12));
                view = dv0Var;
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
        hv0 hv0Var = this.d;
        boolean z4 = hv0Var.a0;
        int i10 = m1Var.f;
        View view = m1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            eh.b bVar = c6Var.d;
            CharSequence charSequence = hv0Var.B;
            c6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z4 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            c6Var.setTag(null);
            c6Var.setEnabled(!hv0Var.F);
            bVar.setEnabled(true ^ hv0Var.F);
            bVar.setTextColor(org.telegram.ui.ActionBar.k6.l1(hv0Var.F ? 0.6f : 1.0f, hv0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6)));
            hv0.c0(hv0Var, view, m1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
                c6Var2.setTag(1);
                CharSequence charSequence2 = hv0Var.C;
                c6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                c6Var2.setTag(null);
                hv0.c0(hv0Var, view, m1Var.b());
                return;
            }
            return;
        }
        int b10 = m1Var.b();
        org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
        c6Var3.setTag(1);
        eh.b bVar2 = c6Var3.d;
        int i11 = b10 - hv0Var.k0;
        boolean z10 = !hv0Var.F || i11 >= hv0Var.x;
        bVar2.setEnabled(z10);
        bVar2.setTextColor(org.telegram.ui.ActionBar.k6.l1(z10 ? 1.0f : 0.6f, hv0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6)));
        c6Var3.n(hv0Var.v[i11], LocaleController.getString(z4 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        c6Var3.setTag(null);
        ImageView imageView = c6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
        ImageView imageView2 = c6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z10 ? 1.0f : 0.45f);
        }
        if (!hv0Var.c0 && hv0Var.d0 == b10) {
            EditTextBoldCursor textView = c6Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            hv0Var.c0 = false;
            hv0Var.d0 = -1;
        }
        hv0.c0(hv0Var, view, b10);
    }

    @Override // f2.p0
    public final void z(f2.m1 m1Var) {
        int i10 = m1Var.f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) m1Var.a).getTextView();
            if (textView.isFocused()) {
                hv0 hv0Var = this.d;
                if (hv0Var.Z) {
                    org.telegram.ui.Components.ry0 ry0Var = hv0Var.N;
                    if (ry0Var != null) {
                        ry0Var.f();
                    }
                    hv0Var.k0(true);
                }
                hv0Var.Y = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

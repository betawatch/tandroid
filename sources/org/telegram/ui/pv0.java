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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class pv0 extends org.telegram.ui.Components.vl0 {
    public final Context c;
    public final /* synthetic */ rv0 d;

    public pv0(rv0 rv0Var, Context context) {
        this.d = rv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        rv0 rv0Var = this.d;
        if (b10 == rv0Var.i0 || b10 == rv0Var.u0 || b10 == rv0Var.v0) {
            return !rv0Var.I;
        }
        if (!rv0Var.I || b10 < (i10 = rv0Var.n0) || b10 >= rv0Var.y + i10) {
            if (b10 != rv0Var.o0 && b10 != rv0Var.r0 && b10 != rv0Var.s0 && (rv0Var.N != 0 || b10 != rv0Var.t0)) {
                return false;
            }
        } else if (b10 - i10 < rv0Var.x) {
            return false;
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.x0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        rv0 rv0Var = this.d;
        if (i10 == rv0Var.h0 || i10 == rv0Var.m0 || i10 == rv0Var.q0) {
            return 0;
        }
        if (i10 == rv0Var.l0) {
            return 1;
        }
        if (i10 == rv0Var.p0 || i10 == rv0Var.w0 || i10 == rv0Var.k0) {
            return 2;
        }
        if (i10 == rv0Var.o0) {
            return 3;
        }
        if (i10 == rv0Var.i0) {
            return 4;
        }
        if (i10 == rv0Var.j0) {
            return 7;
        }
        return (i10 == rv0Var.r0 || i10 == rv0Var.s0 || i10 == rv0Var.t0 || i10 == rv0Var.u0 || i10 == rv0Var.v0) ? 6 : 5;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        rv0 rv0Var = this.d;
        int i11 = rv0Var.N;
        boolean z10 = rv0Var.d0;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == rv0Var.h0) {
                m4Var.setText(LocaleController.getString(z10 ? rv0Var.z0 != null ? R.string.TodoEditTitle : R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 != rv0Var.m0) {
                if (i10 == rv0Var.q0) {
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
            w8Var.setEnabled(!rv0Var.I);
            w8Var.getCheckBox().setAlpha(!rv0Var.I ? 1.0f : 0.6f);
            if (i10 == rv0Var.u0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), rv0Var.H, true);
                w8Var.e(null, true);
                return;
            }
            if (i10 == rv0Var.v0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), rv0Var.J, false);
                w8Var.e(null, true);
                return;
            }
            if (i10 == rv0Var.r0) {
                w8Var.f(LocaleController.getString(R.string.PollAnonymous), rv0Var.G, (rv0Var.s0 == -1 && rv0Var.t0 == -1) ? false : true);
                w8Var.e(null, true);
                return;
            } else if (i10 == rv0Var.s0) {
                w8Var.f(LocaleController.getString(R.string.PollMultiple), rv0Var.K, rv0Var.t0 != -1);
                w8Var.e(null, true);
                return;
            } else {
                if (i10 == rv0Var.t0) {
                    w8Var.f(LocaleController.getString(R.string.PollQuiz), rv0Var.L, false);
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
            r8Var.e(-1, org.telegram.ui.ActionBar.h6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.k7, false), mode));
            r8Var.n(LocaleController.getString(z10 ? R.string.TodoNewTask : R.string.AddAnOption), new org.telegram.ui.Components.qq(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        e9Var.setFixedSize(0);
        e9Var.setBackground(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
        if (i10 == rv0Var.k0) {
            e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i10 == rv0Var.w0) {
            e9Var.setFixedSize(12);
            e9Var.setText(null);
            return;
        }
        int i13 = rv0Var.n - rv0Var.y;
        if (i13 <= 0) {
            e9Var.setText(LocaleController.getString(z10 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
        } else if (z10) {
            e9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i13));
        } else {
            e9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i13, new Object[0])));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        rv0 rv0Var = this.d;
        boolean z10 = rv0Var.c0;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
            } else if (i10 == 2) {
                view = new org.telegram.ui.Cells.e9(context);
            } else if (i10 == 3) {
                View r8Var = new org.telegram.ui.Cells.r8(context);
                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view = r8Var;
            } else if (i10 == 4) {
                mv0 mv0Var = new mv0(this, context, z10 ? 1 : 0);
                mv0Var.d();
                mv0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                mv0Var.c(new org.telegram.ui.Components.rn(4, this, mv0Var));
                view = mv0Var;
            } else if (i10 == 6) {
                View w8Var = new org.telegram.ui.Cells.w8(context);
                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view = w8Var;
            } else if (i10 != 7) {
                ov0 ov0Var = new ov0(this, context, z10 ? 1 : 0, new f60(rv0Var, 21));
                ov0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                ov0Var.c(new org.telegram.ui.Components.rn(6, this, ov0Var));
                ov0Var.setShowNextButton(true);
                EditTextBoldCursor textView = ov0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new vd(3, this, ov0Var));
                textView.setOnKeyListener(new sg(ov0Var, 2));
                view = ov0Var;
            } else {
                nv0 nv0Var = new nv0(this, context, z10 ? 1 : 0);
                nv0Var.d();
                nv0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                nv0Var.c(new org.telegram.ui.Components.rn(5, this, nv0Var));
                view = nv0Var;
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.h6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
            view = m4Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        rv0 rv0Var = this.d;
        boolean z10 = rv0Var.d0;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            org.telegram.ui.Cells.c6 c6Var = d6Var.d;
            CharSequence charSequence = rv0Var.E;
            d6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            d6Var.setTag(null);
            d6Var.setEnabled(!rv0Var.I);
            c6Var.setEnabled(true ^ rv0Var.I);
            c6Var.setTextColor(org.telegram.ui.ActionBar.h6.l1(rv0Var.I ? 0.6f : 1.0f, rv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6)));
            rv0.c0(rv0Var, view, c1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
                d6Var2.setTag(1);
                CharSequence charSequence2 = rv0Var.F;
                d6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                d6Var2.setTag(null);
                rv0.c0(rv0Var, view, c1Var.b());
                return;
            }
            return;
        }
        int b10 = c1Var.b();
        org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
        d6Var3.setTag(1);
        org.telegram.ui.Cells.c6 c6Var2 = d6Var3.d;
        int i11 = b10 - rv0Var.n0;
        boolean z11 = !rv0Var.I || i11 >= rv0Var.x;
        c6Var2.setEnabled(z11);
        c6Var2.setTextColor(org.telegram.ui.ActionBar.h6.l1(z11 ? 1.0f : 0.6f, rv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6)));
        d6Var3.n(rv0Var.v[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        d6Var3.setTag(null);
        ImageView imageView = d6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = d6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!rv0Var.f0 && rv0Var.g0 == b10) {
            EditTextBoldCursor textView = d6Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            rv0Var.f0 = false;
            rv0Var.g0 = -1;
        }
        rv0.c0(rv0Var, view, b10);
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) c1Var.a).getTextView();
            if (textView.isFocused()) {
                rv0 rv0Var = this.d;
                if (rv0Var.c0) {
                    org.telegram.ui.Components.xy0 xy0Var = rv0Var.Q;
                    if (xy0Var != null) {
                        xy0Var.f();
                    }
                    rv0Var.k0(true);
                }
                rv0Var.b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class aw0 extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public final /* synthetic */ cw0 d;

    public aw0(cw0 cw0Var, Context context) {
        this.d = cw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        cw0 cw0Var = this.d;
        if (b10 == cw0Var.i0 || b10 == cw0Var.u0 || b10 == cw0Var.v0) {
            return !cw0Var.I;
        }
        if (!cw0Var.I || b10 < (i10 = cw0Var.n0) || b10 >= cw0Var.y + i10) {
            if (b10 != cw0Var.o0 && b10 != cw0Var.r0 && b10 != cw0Var.s0 && (cw0Var.N != 0 || b10 != cw0Var.t0)) {
                return false;
            }
        } else if (b10 - i10 < cw0Var.x) {
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
        cw0 cw0Var = this.d;
        if (i10 == cw0Var.h0 || i10 == cw0Var.m0 || i10 == cw0Var.q0) {
            return 0;
        }
        if (i10 == cw0Var.l0) {
            return 1;
        }
        if (i10 == cw0Var.p0 || i10 == cw0Var.w0 || i10 == cw0Var.k0) {
            return 2;
        }
        if (i10 == cw0Var.o0) {
            return 3;
        }
        if (i10 == cw0Var.i0) {
            return 4;
        }
        if (i10 == cw0Var.j0) {
            return 7;
        }
        return (i10 == cw0Var.r0 || i10 == cw0Var.s0 || i10 == cw0Var.t0 || i10 == cw0Var.u0 || i10 == cw0Var.v0) ? 6 : 5;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        cw0 cw0Var = this.d;
        int i11 = cw0Var.N;
        boolean z10 = cw0Var.d0;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == cw0Var.h0) {
                l4Var.setText(LocaleController.getString(z10 ? cw0Var.z0 != null ? R.string.TodoEditTitle : R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 != cw0Var.m0) {
                if (i10 == cw0Var.q0) {
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
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            w8Var.setEnabled(!cw0Var.I);
            w8Var.getCheckBox().setAlpha(!cw0Var.I ? 1.0f : 0.6f);
            if (i10 == cw0Var.u0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), cw0Var.H, true);
                w8Var.e(null, true);
                return;
            }
            if (i10 == cw0Var.v0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), cw0Var.J, false);
                w8Var.e(null, true);
                return;
            }
            if (i10 == cw0Var.r0) {
                w8Var.f(LocaleController.getString(R.string.PollAnonymous), cw0Var.G, (cw0Var.s0 == -1 && cw0Var.t0 == -1) ? false : true);
                w8Var.e(null, true);
                return;
            } else if (i10 == cw0Var.s0) {
                w8Var.f(LocaleController.getString(R.string.PollMultiple), cw0Var.K, cw0Var.t0 != -1);
                w8Var.e(null, true);
                return;
            } else {
                if (i10 == cw0Var.t0) {
                    w8Var.f(LocaleController.getString(R.string.PollQuiz), cw0Var.L, false);
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
            r8Var.e(-1, org.telegram.ui.ActionBar.j6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k7, false), mode));
            r8Var.n(LocaleController.getString(z10 ? R.string.TodoNewTask : R.string.AddAnOption), new org.telegram.ui.Components.pq(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        e9Var.setFixedSize(0);
        e9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
        if (i10 == cw0Var.k0) {
            e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i10 == cw0Var.w0) {
            e9Var.setFixedSize(12);
            e9Var.setText(null);
            return;
        }
        int i13 = cw0Var.n - cw0Var.y;
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
        cw0 cw0Var = this.d;
        boolean z10 = cw0Var.c0;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
            } else if (i10 == 2) {
                view = new org.telegram.ui.Cells.e9(context);
            } else if (i10 == 3) {
                View r8Var = new org.telegram.ui.Cells.r8(context);
                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = r8Var;
            } else if (i10 == 4) {
                xv0 xv0Var = new xv0(this, context, z10 ? 1 : 0);
                xv0Var.d();
                xv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                xv0Var.c(new org.telegram.ui.Components.qn(4, this, xv0Var));
                view = xv0Var;
            } else if (i10 == 6) {
                View w8Var = new org.telegram.ui.Cells.w8(context);
                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = w8Var;
            } else if (i10 != 7) {
                zv0 zv0Var = new zv0(this, context, z10 ? 1 : 0, new m60(cw0Var, 21));
                zv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                zv0Var.c(new org.telegram.ui.Components.qn(6, this, zv0Var));
                zv0Var.setShowNextButton(true);
                EditTextBoldCursor textView = zv0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new xd(3, this, zv0Var));
                textView.setOnKeyListener(new xg(zv0Var, 2));
                view = zv0Var;
            } else {
                yv0 yv0Var = new yv0(this, context, z10 ? 1 : 0);
                yv0Var.d();
                yv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                yv0Var.c(new org.telegram.ui.Components.qn(5, this, yv0Var));
                view = yv0Var;
            }
        } else {
            View l4Var = new org.telegram.ui.Cells.l4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, null);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            view = l4Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        cw0 cw0Var = this.d;
        boolean z10 = cw0Var.d0;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            org.telegram.ui.Cells.b6 b6Var = c6Var.d;
            CharSequence charSequence = cw0Var.E;
            c6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            c6Var.setTag(null);
            c6Var.setEnabled(!cw0Var.I);
            b6Var.setEnabled(true ^ cw0Var.I);
            b6Var.setTextColor(org.telegram.ui.ActionBar.j6.l1(cw0Var.I ? 0.6f : 1.0f, cw0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6)));
            cw0.c0(cw0Var, view, c1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
                c6Var2.setTag(1);
                CharSequence charSequence2 = cw0Var.F;
                c6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                c6Var2.setTag(null);
                cw0.c0(cw0Var, view, c1Var.b());
                return;
            }
            return;
        }
        int b10 = c1Var.b();
        org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
        c6Var3.setTag(1);
        org.telegram.ui.Cells.b6 b6Var2 = c6Var3.d;
        int i11 = b10 - cw0Var.n0;
        boolean z11 = !cw0Var.I || i11 >= cw0Var.x;
        b6Var2.setEnabled(z11);
        b6Var2.setTextColor(org.telegram.ui.ActionBar.j6.l1(z11 ? 1.0f : 0.6f, cw0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6)));
        c6Var3.n(cw0Var.v[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        c6Var3.setTag(null);
        ImageView imageView = c6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = c6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!cw0Var.f0 && cw0Var.g0 == b10) {
            EditTextBoldCursor textView = c6Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            cw0Var.f0 = false;
            cw0Var.g0 = -1;
        }
        cw0.c0(cw0Var, view, b10);
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) c1Var.a).getTextView();
            if (textView.isFocused()) {
                cw0 cw0Var = this.d;
                if (cw0Var.c0) {
                    org.telegram.ui.Components.oy0 oy0Var = cw0Var.Q;
                    if (oy0Var != null) {
                        oy0Var.f();
                    }
                    cw0Var.k0(true);
                }
                cw0Var.b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class kv0 extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public final /* synthetic */ mv0 d;

    public kv0(mv0 mv0Var, Context context) {
        this.d = mv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10;
        int b10 = l1Var.b();
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

    @Override // f2.o0
    public final int h() {
        return this.d.u0;
    }

    @Override // f2.o0
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

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        mv0 mv0Var = this.d;
        int i11 = mv0Var.K;
        boolean z4 = mv0Var.a0;
        int i12 = l1Var.f;
        View view = l1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == mv0Var.e0) {
                l4Var.setText(LocaleController.getString(z4 ? mv0Var.w0 != null ? R.string.TodoEditTitle : R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 != mv0Var.j0) {
                if (i10 == mv0Var.n0) {
                    l4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (i11 == 1) {
                l4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                l4Var.setText(LocaleController.getString(z4 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.setEnabled(!mv0Var.F);
            r8Var.getCheckBox().setAlpha(!mv0Var.F ? 1.0f : 0.6f);
            if (i10 == mv0Var.r0) {
                r8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), mv0Var.E, true);
                r8Var.e(null, true);
                return;
            }
            if (i10 == mv0Var.s0) {
                r8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), mv0Var.G, false);
                r8Var.e(null, true);
                return;
            }
            if (i10 == mv0Var.o0) {
                r8Var.f(LocaleController.getString(R.string.PollAnonymous), mv0Var.D, (mv0Var.p0 == -1 && mv0Var.q0 == -1) ? false : true);
                r8Var.e(null, true);
                return;
            } else if (i10 == mv0Var.p0) {
                r8Var.f(LocaleController.getString(R.string.PollMultiple), mv0Var.H, mv0Var.q0 != -1);
                r8Var.e(null, true);
                return;
            } else {
                if (i10 == mv0Var.q0) {
                    r8Var.f(LocaleController.getString(R.string.PollQuiz), mv0Var.I, false);
                    r8Var.e(null, i11 == 0);
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
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            n8Var.e(-1, org.telegram.ui.ActionBar.j6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k7, false), mode));
            n8Var.n(LocaleController.getString(z4 ? R.string.TodoNewTask : R.string.AddAnOption), new org.telegram.ui.Components.mq(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        z8Var.setFixedSize(0);
        z8Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
        if (i10 == mv0Var.h0) {
            z8Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i10 == mv0Var.t0) {
            z8Var.setFixedSize(12);
            z8Var.setText(null);
            return;
        }
        int i13 = mv0Var.n - mv0Var.y;
        if (i13 <= 0) {
            z8Var.setText(LocaleController.getString(z4 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
        } else if (z4) {
            z8Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i13));
        } else {
            z8Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i13, new Object[0])));
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        mv0 mv0Var = this.d;
        boolean z4 = mv0Var.Z;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                view = new org.telegram.ui.Cells.y6(context, (b) null);
            } else if (i10 == 2) {
                view = new org.telegram.ui.Cells.z8(context);
            } else if (i10 == 3) {
                View n8Var = new org.telegram.ui.Cells.n8(context);
                n8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = n8Var;
            } else if (i10 == 4) {
                hv0 hv0Var = new hv0(this, context, z4 ? 1 : 0);
                hv0Var.d();
                hv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                hv0Var.c(new cg.b0(this, hv0Var, false, 11));
                view = hv0Var;
            } else if (i10 == 6) {
                View r8Var = new org.telegram.ui.Cells.r8(context);
                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = r8Var;
            } else if (i10 != 7) {
                jv0 jv0Var = new jv0(this, context, z4 ? 1 : 0, new g60(mv0Var, 21));
                jv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                jv0Var.c(new cg.b0(this, jv0Var, false, 13));
                jv0Var.setShowNextButton(true);
                EditTextBoldCursor textView = jv0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new ae(3, this, jv0Var));
                textView.setOnKeyListener(new qg(jv0Var, 2));
                view = jv0Var;
            } else {
                iv0 iv0Var = new iv0(this, context, z4 ? 1 : 0);
                iv0Var.d();
                iv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                iv0Var.c(new cg.b0(this, iv0Var, false, 12));
                view = iv0Var;
            }
        } else {
            View l4Var = new org.telegram.ui.Cells.l4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, null);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            view = l4Var;
        }
        return ai.n(view, view, -1, -2);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        mv0 mv0Var = this.d;
        boolean z4 = mv0Var.a0;
        int i10 = l1Var.f;
        View view = l1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view;
            b6Var.setTag(1);
            dh.b bVar = b6Var.d;
            CharSequence charSequence = mv0Var.B;
            b6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z4 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            b6Var.setTag(null);
            b6Var.setEnabled(!mv0Var.F);
            bVar.setEnabled(true ^ mv0Var.F);
            bVar.setTextColor(org.telegram.ui.ActionBar.j6.l1(mv0Var.F ? 0.6f : 1.0f, mv0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6)));
            mv0.c0(mv0Var, view, l1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.b6 b6Var2 = (org.telegram.ui.Cells.b6) view;
                b6Var2.setTag(1);
                CharSequence charSequence2 = mv0Var.C;
                b6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                b6Var2.setTag(null);
                mv0.c0(mv0Var, view, l1Var.b());
                return;
            }
            return;
        }
        int b10 = l1Var.b();
        org.telegram.ui.Cells.b6 b6Var3 = (org.telegram.ui.Cells.b6) view;
        b6Var3.setTag(1);
        dh.b bVar2 = b6Var3.d;
        int i11 = b10 - mv0Var.k0;
        boolean z10 = !mv0Var.F || i11 >= mv0Var.x;
        bVar2.setEnabled(z10);
        bVar2.setTextColor(org.telegram.ui.ActionBar.j6.l1(z10 ? 1.0f : 0.6f, mv0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6)));
        b6Var3.n(mv0Var.v[i11], LocaleController.getString(z4 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        b6Var3.setTag(null);
        ImageView imageView = b6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
        ImageView imageView2 = b6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z10 ? 1.0f : 0.45f);
        }
        if (!mv0Var.c0 && mv0Var.d0 == b10) {
            EditTextBoldCursor textView = b6Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            mv0Var.c0 = false;
            mv0Var.d0 = -1;
        }
        mv0.c0(mv0Var, view, b10);
    }

    @Override // f2.o0
    public final void z(f2.l1 l1Var) {
        int i10 = l1Var.f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.b6) l1Var.a).getTextView();
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

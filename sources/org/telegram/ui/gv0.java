package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class gv0 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ iv0 d;

    public gv0(iv0 iv0Var, Context context) {
        this.d = iv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10;
        int b10 = b1Var.b();
        iv0 iv0Var = this.d;
        if (b10 == iv0Var.i0 || b10 == iv0Var.u0 || b10 == iv0Var.v0) {
            return !iv0Var.I;
        }
        if (!iv0Var.I || b10 < (i10 = iv0Var.n0) || b10 >= iv0Var.y + i10) {
            if (b10 != iv0Var.o0 && b10 != iv0Var.r0 && b10 != iv0Var.s0 && (iv0Var.N != 0 || b10 != iv0Var.t0)) {
                return false;
            }
        } else if (b10 - i10 < iv0Var.x) {
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
        iv0 iv0Var = this.d;
        if (i10 == iv0Var.h0 || i10 == iv0Var.m0 || i10 == iv0Var.q0) {
            return 0;
        }
        if (i10 == iv0Var.l0) {
            return 1;
        }
        if (i10 == iv0Var.p0 || i10 == iv0Var.w0 || i10 == iv0Var.k0) {
            return 2;
        }
        if (i10 == iv0Var.o0) {
            return 3;
        }
        if (i10 == iv0Var.i0) {
            return 4;
        }
        if (i10 == iv0Var.j0) {
            return 7;
        }
        return (i10 == iv0Var.r0 || i10 == iv0Var.s0 || i10 == iv0Var.t0 || i10 == iv0Var.u0 || i10 == iv0Var.v0) ? 6 : 5;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        iv0 iv0Var = this.d;
        int i11 = iv0Var.N;
        boolean z10 = iv0Var.d0;
        int i12 = b1Var.f;
        View view = b1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == iv0Var.h0) {
                l4Var.setText(LocaleController.getString(z10 ? iv0Var.z0 != null ? R.string.TodoEditTitle : R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 != iv0Var.m0) {
                if (i10 == iv0Var.q0) {
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
            w8Var.setEnabled(!iv0Var.I);
            w8Var.getCheckBox().setAlpha(!iv0Var.I ? 1.0f : 0.6f);
            if (i10 == iv0Var.u0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), iv0Var.H, true);
                w8Var.e(null, true);
                return;
            }
            if (i10 == iv0Var.v0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), iv0Var.J, false);
                w8Var.e(null, true);
                return;
            }
            if (i10 == iv0Var.r0) {
                w8Var.f(LocaleController.getString(R.string.PollAnonymous), iv0Var.G, (iv0Var.s0 == -1 && iv0Var.t0 == -1) ? false : true);
                w8Var.e(null, true);
                return;
            } else if (i10 == iv0Var.s0) {
                w8Var.f(LocaleController.getString(R.string.PollMultiple), iv0Var.K, iv0Var.t0 != -1);
                w8Var.e(null, true);
                return;
            } else {
                if (i10 == iv0Var.t0) {
                    w8Var.f(LocaleController.getString(R.string.PollQuiz), iv0Var.L, false);
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
            r8Var.g(-1, org.telegram.ui.ActionBar.k6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int i13 = org.telegram.ui.ActionBar.k6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.z(r8Var, drawable, i13, null, mode);
            org.telegram.ui.ActionBar.r6.z(r8Var, drawable2, org.telegram.ui.ActionBar.k6.k7, null, mode);
            r8Var.p(LocaleController.getString(z10 ? R.string.TodoNewTask : R.string.AddAnOption), new org.telegram.ui.Components.yq(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        e9Var.setFixedSize(0);
        org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7, context, e9Var, null);
        if (i10 == iv0Var.k0) {
            e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i10 == iv0Var.w0) {
            e9Var.setFixedSize(12);
            e9Var.setText(null);
            return;
        }
        int i14 = iv0Var.n - iv0Var.y;
        if (i14 <= 0) {
            e9Var.setText(LocaleController.getString(z10 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
        } else if (z10) {
            e9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i14));
        } else {
            e9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i14, new Object[0])));
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        iv0 iv0Var = this.d;
        boolean z10 = iv0Var.c0;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
            } else if (i10 == 2) {
                view = new org.telegram.ui.Cells.e9(context);
            } else if (i10 == 3) {
                View r8Var = new org.telegram.ui.Cells.r8(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, r8Var, null);
                view = r8Var;
            } else if (i10 == 4) {
                dv0 dv0Var = new dv0(this, context, z10 ? 1 : 0);
                dv0Var.c();
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, dv0Var, null);
                dv0Var.b(new org.telegram.ui.Components.ao(4, this, dv0Var));
                view = dv0Var;
            } else if (i10 == 6) {
                View w8Var = new org.telegram.ui.Cells.w8(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, w8Var, null);
                view = w8Var;
            } else if (i10 != 7) {
                fv0 fv0Var = new fv0(this, context, z10 ? 1 : 0, new w50(iv0Var, 21));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, fv0Var, null);
                fv0Var.b(new org.telegram.ui.Components.ao(6, this, fv0Var));
                fv0Var.setShowNextButton(true);
                EditTextBoldCursor textView = fv0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new wd(3, this, fv0Var));
                textView.setOnKeyListener(new lg(fv0Var, 2));
                view = fv0Var;
            } else {
                ev0 ev0Var = new ev0(this, context, z10 ? 1 : 0);
                ev0Var.c();
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, ev0Var, null);
                ev0Var.b(new org.telegram.ui.Components.ao(5, this, ev0Var));
                view = ev0Var;
            }
        } else {
            View l4Var = new org.telegram.ui.Cells.l4(this.c, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l4Var, null);
            view = l4Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        iv0 iv0Var = this.d;
        boolean z10 = iv0Var.d0;
        int i10 = b1Var.f;
        View view = b1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            org.telegram.ui.Cells.c6 c6Var = d6Var.d;
            CharSequence charSequence = iv0Var.E;
            d6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            d6Var.setTag(null);
            d6Var.setEnabled(!iv0Var.I);
            c6Var.setEnabled(true ^ iv0Var.I);
            org.telegram.ui.ActionBar.r6.X(c6Var, org.telegram.ui.ActionBar.r6.M(iv0Var.I ? 0.6f : 1.0f, org.telegram.ui.ActionBar.k6.G6), iv0Var.getResourceProvider());
            iv0.c0(iv0Var, view, b1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
                d6Var2.setTag(1);
                CharSequence charSequence2 = iv0Var.F;
                d6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                d6Var2.setTag(null);
                iv0.c0(iv0Var, view, b1Var.b());
                return;
            }
            return;
        }
        int b10 = b1Var.b();
        org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
        d6Var3.setTag(1);
        org.telegram.ui.Cells.c6 c6Var2 = d6Var3.d;
        int i11 = b10 - iv0Var.n0;
        boolean z11 = !iv0Var.I || i11 >= iv0Var.x;
        c6Var2.setEnabled(z11);
        org.telegram.ui.ActionBar.r6.X(c6Var2, org.telegram.ui.ActionBar.r6.M(z11 ? 1.0f : 0.6f, org.telegram.ui.ActionBar.k6.G6), iv0Var.getResourceProvider());
        d6Var3.n(iv0Var.v[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        d6Var3.setTag(null);
        ImageView imageView = d6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = d6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!iv0Var.f0 && iv0Var.g0 == b10) {
            EditTextBoldCursor textView = d6Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            iv0Var.f0 = false;
            iv0Var.g0 = -1;
        }
        iv0.c0(iv0Var, view, b10);
    }

    @Override // s4.g0
    public final void z(s4.b1 b1Var) {
        int i10 = b1Var.f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) b1Var.a).getTextView();
            if (textView.isFocused()) {
                iv0 iv0Var = this.d;
                if (iv0Var.c0) {
                    org.telegram.ui.Components.lz0 lz0Var = iv0Var.Q;
                    if (lz0Var != null) {
                        lz0Var.f();
                    }
                    iv0Var.k0(true);
                }
                iv0Var.b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

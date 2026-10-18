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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class fv0 extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public final /* synthetic */ hv0 d;

    public fv0(hv0 hv0Var, Context context) {
        this.d = hv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int i10;
        int b10 = b1Var.b();
        hv0 hv0Var = this.d;
        if (b10 == hv0Var.i0 || b10 == hv0Var.u0 || b10 == hv0Var.v0) {
            return !hv0Var.I;
        }
        if (!hv0Var.I || b10 < (i10 = hv0Var.n0) || b10 >= hv0Var.y + i10) {
            if (b10 != hv0Var.o0 && b10 != hv0Var.r0 && b10 != hv0Var.s0 && (hv0Var.N != 0 || b10 != hv0Var.t0)) {
                return false;
            }
        } else if (b10 - i10 < hv0Var.x) {
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
        hv0 hv0Var = this.d;
        if (i10 == hv0Var.h0 || i10 == hv0Var.m0 || i10 == hv0Var.q0) {
            return 0;
        }
        if (i10 == hv0Var.l0) {
            return 1;
        }
        if (i10 == hv0Var.p0 || i10 == hv0Var.w0 || i10 == hv0Var.k0) {
            return 2;
        }
        if (i10 == hv0Var.o0) {
            return 3;
        }
        if (i10 == hv0Var.i0) {
            return 4;
        }
        if (i10 == hv0Var.j0) {
            return 7;
        }
        return (i10 == hv0Var.r0 || i10 == hv0Var.s0 || i10 == hv0Var.t0 || i10 == hv0Var.u0 || i10 == hv0Var.v0) ? 6 : 5;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        hv0 hv0Var = this.d;
        int i11 = hv0Var.N;
        boolean z10 = hv0Var.d0;
        int i12 = b1Var.f;
        View view = b1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == hv0Var.h0) {
                l4Var.setText(LocaleController.getString(z10 ? hv0Var.z0 != null ? R.string.TodoEditTitle : R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 != hv0Var.m0) {
                if (i10 == hv0Var.q0) {
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
            v8Var.setEnabled(!hv0Var.I);
            v8Var.getCheckBox().setAlpha(!hv0Var.I ? 1.0f : 0.6f);
            if (i10 == hv0Var.u0) {
                v8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), hv0Var.H, true);
                v8Var.e(null, true);
                return;
            }
            if (i10 == hv0Var.v0) {
                v8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), hv0Var.J, false);
                v8Var.e(null, true);
                return;
            }
            if (i10 == hv0Var.r0) {
                v8Var.f(LocaleController.getString(R.string.PollAnonymous), hv0Var.G, (hv0Var.s0 == -1 && hv0Var.t0 == -1) ? false : true);
                v8Var.e(null, true);
                return;
            } else if (i10 == hv0Var.s0) {
                v8Var.f(LocaleController.getString(R.string.PollMultiple), hv0Var.K, hv0Var.t0 != -1);
                v8Var.e(null, true);
                return;
            } else {
                if (i10 == hv0Var.t0) {
                    v8Var.f(LocaleController.getString(R.string.PollQuiz), hv0Var.L, false);
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
        if (i10 == hv0Var.k0) {
            d9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i10 == hv0Var.w0) {
            d9Var.setFixedSize(12);
            d9Var.setText(null);
            return;
        }
        int i13 = hv0Var.n - hv0Var.y;
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
        hv0 hv0Var = this.d;
        boolean z10 = hv0Var.c0;
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
                cv0 cv0Var = new cv0(this, context, z10 ? 1 : 0);
                cv0Var.d();
                cv0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                cv0Var.c(new org.telegram.ui.Components.ao(4, this, cv0Var));
                view = cv0Var;
            } else if (i10 == 6) {
                View v8Var = new org.telegram.ui.Cells.v8(context);
                v8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view = v8Var;
            } else if (i10 != 7) {
                ev0 ev0Var = new ev0(this, context, z10 ? 1 : 0, new y50(hv0Var, 20));
                ev0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                ev0Var.c(new org.telegram.ui.Components.ao(6, this, ev0Var));
                ev0Var.setShowNextButton(true);
                EditTextBoldCursor textView = ev0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new yd(3, this, ev0Var));
                textView.setOnKeyListener(new ng(ev0Var, 2));
                view = ev0Var;
            } else {
                dv0 dv0Var = new dv0(this, context, z10 ? 1 : 0);
                dv0Var.d();
                dv0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                dv0Var.c(new org.telegram.ui.Components.ao(5, this, dv0Var));
                view = dv0Var;
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
        hv0 hv0Var = this.d;
        boolean z10 = hv0Var.d0;
        int i10 = b1Var.f;
        View view = b1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            org.telegram.ui.Cells.b6 b6Var = c6Var.d;
            CharSequence charSequence = hv0Var.E;
            c6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            c6Var.setTag(null);
            c6Var.setEnabled(!hv0Var.I);
            b6Var.setEnabled(true ^ hv0Var.I);
            b6Var.setTextColor(org.telegram.ui.ActionBar.h6.m1(hv0Var.I ? 0.6f : 1.0f, hv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6)));
            hv0.c0(hv0Var, view, b1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
                c6Var2.setTag(1);
                CharSequence charSequence2 = hv0Var.F;
                c6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                c6Var2.setTag(null);
                hv0.c0(hv0Var, view, b1Var.b());
                return;
            }
            return;
        }
        int b10 = b1Var.b();
        org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
        c6Var3.setTag(1);
        org.telegram.ui.Cells.b6 b6Var2 = c6Var3.d;
        int i11 = b10 - hv0Var.n0;
        boolean z11 = !hv0Var.I || i11 >= hv0Var.x;
        b6Var2.setEnabled(z11);
        b6Var2.setTextColor(org.telegram.ui.ActionBar.h6.m1(z11 ? 1.0f : 0.6f, hv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6)));
        c6Var3.n(hv0Var.v[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        c6Var3.setTag(null);
        ImageView imageView = c6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = c6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!hv0Var.f0 && hv0Var.g0 == b10) {
            EditTextBoldCursor textView = c6Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            hv0Var.f0 = false;
            hv0Var.g0 = -1;
        }
        hv0.c0(hv0Var, view, b10);
    }

    @Override // s4.g0
    public final void z(s4.b1 b1Var) {
        int i10 = b1Var.f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) b1Var.a).getTextView();
            if (textView.isFocused()) {
                hv0 hv0Var = this.d;
                if (hv0Var.c0) {
                    org.telegram.ui.Components.gz0 gz0Var = hv0Var.Q;
                    if (gz0Var != null) {
                        gz0Var.f();
                    }
                    hv0Var.k0(true);
                }
                hv0Var.b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

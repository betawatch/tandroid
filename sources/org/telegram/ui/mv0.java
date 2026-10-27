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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mv0 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public final /* synthetic */ ov0 d;

    public mv0(ov0 ov0Var, Context context) {
        this.d = ov0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10;
        int b10 = e1Var.b();
        ov0 ov0Var = this.d;
        if (b10 == ov0Var.i0 || b10 == ov0Var.u0 || b10 == ov0Var.v0) {
            return !ov0Var.I;
        }
        if (!ov0Var.I || b10 < (i10 = ov0Var.n0) || b10 >= ov0Var.y + i10) {
            if (b10 != ov0Var.o0 && b10 != ov0Var.r0 && b10 != ov0Var.s0 && (ov0Var.N != 0 || b10 != ov0Var.t0)) {
                return false;
            }
        } else if (b10 - i10 < ov0Var.x) {
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
        ov0 ov0Var = this.d;
        if (i10 == ov0Var.h0 || i10 == ov0Var.m0 || i10 == ov0Var.q0) {
            return 0;
        }
        if (i10 == ov0Var.l0) {
            return 1;
        }
        if (i10 == ov0Var.p0 || i10 == ov0Var.w0 || i10 == ov0Var.k0) {
            return 2;
        }
        if (i10 == ov0Var.o0) {
            return 3;
        }
        if (i10 == ov0Var.i0) {
            return 4;
        }
        if (i10 == ov0Var.j0) {
            return 7;
        }
        return (i10 == ov0Var.r0 || i10 == ov0Var.s0 || i10 == ov0Var.t0 || i10 == ov0Var.u0 || i10 == ov0Var.v0) ? 6 : 5;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        ov0 ov0Var = this.d;
        int i11 = ov0Var.N;
        boolean z10 = ov0Var.d0;
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
            if (i10 == ov0Var.h0) {
                q4Var.setText(LocaleController.getString(z10 ? ov0Var.z0 != null ? R.string.TodoEditTitle : R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 != ov0Var.m0) {
                if (i10 == ov0Var.q0) {
                    q4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (i11 == 1) {
                q4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                q4Var.setText(LocaleController.getString(z10 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setEnabled(!ov0Var.I);
            a9Var.getCheckBox().setAlpha(!ov0Var.I ? 1.0f : 0.6f);
            if (i10 == ov0Var.u0) {
                a9Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), ov0Var.H, true);
                a9Var.e(null, true);
                return;
            }
            if (i10 == ov0Var.v0) {
                a9Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), ov0Var.J, false);
                a9Var.e(null, true);
                return;
            }
            if (i10 == ov0Var.r0) {
                a9Var.f(LocaleController.getString(R.string.PollAnonymous), ov0Var.G, (ov0Var.s0 == -1 && ov0Var.t0 == -1) ? false : true);
                a9Var.e(null, true);
                return;
            } else if (i10 == ov0Var.s0) {
                a9Var.f(LocaleController.getString(R.string.PollMultiple), ov0Var.K, ov0Var.t0 != -1);
                a9Var.e(null, true);
                return;
            } else {
                if (i10 == ov0Var.t0) {
                    a9Var.f(LocaleController.getString(R.string.PollQuiz), ov0Var.L, false);
                    a9Var.e(null, i11 == 0);
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
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            v8Var.g(-1, org.telegram.ui.ActionBar.y6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int i13 = org.telegram.ui.ActionBar.y6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.f7.y(v8Var, drawable, i13, null, mode);
            org.telegram.ui.ActionBar.f7.y(v8Var, drawable2, org.telegram.ui.ActionBar.y6.k7, null, mode);
            v8Var.p(LocaleController.getString(z10 ? R.string.TodoNewTask : R.string.AddAnOption), new org.telegram.ui.Components.ar(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
        i9Var.setFixedSize(0);
        org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7, context, i9Var, null);
        if (i10 == ov0Var.k0) {
            i9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i10 == ov0Var.w0) {
            i9Var.setFixedSize(12);
            i9Var.setText(null);
            return;
        }
        int i14 = ov0Var.n - ov0Var.y;
        if (i14 <= 0) {
            i9Var.setText(LocaleController.getString(z10 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
        } else if (z10) {
            i9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i14));
        } else {
            i9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i14, new Object[0])));
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        ov0 ov0Var = this.d;
        boolean z10 = ov0Var.c0;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                view = new org.telegram.ui.Cells.f7(context, (d3) null);
            } else if (i10 == 2) {
                view = new org.telegram.ui.Cells.i9(context);
            } else if (i10 == 3) {
                View v8Var = new org.telegram.ui.Cells.v8(context);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, v8Var, null);
                view = v8Var;
            } else if (i10 == 4) {
                jv0 jv0Var = new jv0(this, context, z10 ? 1 : 0);
                jv0Var.c();
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, jv0Var, null);
                jv0Var.b(new org.telegram.ui.Components.bo(4, this, jv0Var));
                view = jv0Var;
            } else if (i10 == 6) {
                View a9Var = new org.telegram.ui.Cells.a9(context);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, a9Var, null);
                view = a9Var;
            } else if (i10 != 7) {
                lv0 lv0Var = new lv0(this, context, z10 ? 1 : 0, new z50(ov0Var, 23));
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, lv0Var, null);
                lv0Var.b(new org.telegram.ui.Components.bo(6, this, lv0Var));
                lv0Var.setShowNextButton(true);
                EditTextBoldCursor textView = lv0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new yd(3, this, lv0Var));
                textView.setOnKeyListener(new mg(lv0Var, 2));
                view = lv0Var;
            } else {
                kv0 kv0Var = new kv0(this, context, z10 ? 1 : 0);
                kv0Var.c();
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, kv0Var, null);
                kv0Var.b(new org.telegram.ui.Components.bo(5, this, kv0Var));
                view = kv0Var;
            }
        } else {
            View q4Var = new org.telegram.ui.Cells.q4(this.c, org.telegram.ui.ActionBar.y6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, null);
            view = q4Var;
        }
        return ic.a.n(view, view, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        ov0 ov0Var = this.d;
        boolean z10 = ov0Var.d0;
        int i10 = e1Var.f;
        View view = e1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            h6Var.setTag(1);
            org.telegram.ui.Cells.g6 g6Var = h6Var.d;
            CharSequence charSequence = ov0Var.E;
            h6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            h6Var.setTag(null);
            h6Var.setEnabled(!ov0Var.I);
            g6Var.setEnabled(true ^ ov0Var.I);
            org.telegram.ui.ActionBar.f7.W(g6Var, org.telegram.ui.ActionBar.f7.L(ov0Var.I ? 0.6f : 1.0f, org.telegram.ui.ActionBar.y6.G6), ov0Var.getResourceProvider());
            ov0.d0(ov0Var, view, e1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.h6 h6Var2 = (org.telegram.ui.Cells.h6) view;
                h6Var2.setTag(1);
                CharSequence charSequence2 = ov0Var.F;
                h6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                h6Var2.setTag(null);
                ov0.d0(ov0Var, view, e1Var.b());
                return;
            }
            return;
        }
        int b10 = e1Var.b();
        org.telegram.ui.Cells.h6 h6Var3 = (org.telegram.ui.Cells.h6) view;
        h6Var3.setTag(1);
        org.telegram.ui.Cells.g6 g6Var2 = h6Var3.d;
        int i11 = b10 - ov0Var.n0;
        boolean z11 = !ov0Var.I || i11 >= ov0Var.x;
        g6Var2.setEnabled(z11);
        org.telegram.ui.ActionBar.f7.W(g6Var2, org.telegram.ui.ActionBar.f7.L(z11 ? 1.0f : 0.6f, org.telegram.ui.ActionBar.y6.G6), ov0Var.getResourceProvider());
        h6Var3.n(ov0Var.v[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        h6Var3.setTag(null);
        ImageView imageView = h6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = h6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!ov0Var.f0 && ov0Var.g0 == b10) {
            EditTextBoldCursor textView = h6Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            ov0Var.f0 = false;
            ov0Var.g0 = -1;
        }
        ov0.d0(ov0Var, view, b10);
    }

    @Override // s4.h0
    public final void z(s4.e1 e1Var) {
        int i10 = e1Var.f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.h6) e1Var.a).getTextView();
            if (textView.isFocused()) {
                ov0 ov0Var = this.d;
                if (ov0Var.c0) {
                    org.telegram.ui.Components.uz0 uz0Var = ov0Var.Q;
                    if (uz0Var != null) {
                        uz0Var.f();
                    }
                    ov0Var.l0(true);
                }
                ov0Var.b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

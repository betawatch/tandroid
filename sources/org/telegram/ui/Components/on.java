package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class on extends rl0 {
    public final Context c;
    public final /* synthetic */ qn d;

    public on(qn qnVar, Context context) {
        this.d = qnVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        qn qnVar = this.d;
        return b10 == qnVar.r0 || b10 == qnVar.D0 || b10 == qnVar.y0 || b10 == qnVar.C0 || b10 == qnVar.z0 || b10 == qnVar.E0 || b10 == qnVar.A0 || b10 == qnVar.B0 || b10 == qnVar.F0 || b10 == qnVar.G0 || b10 == qnVar.K0.b || b10 == qnVar.J0.b || b10 == qnVar.I0;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.N0;
    }

    @Override // f2.o0
    public final int j(int i10) {
        qn qnVar = this.d;
        if (i10 == qnVar.y0 || i10 == qnVar.C0 || i10 == qnVar.D0 || i10 == qnVar.z0 || i10 == qnVar.A0 || i10 == qnVar.B0 || i10 == qnVar.E0 || i10 == qnVar.J0.b || i10 == qnVar.K0.b) {
            return 10;
        }
        if (i10 == qnVar.i0 || i10 == qnVar.p0 || i10 == qnVar.t0 || i10 == qnVar.l0) {
            return 0;
        }
        if (i10 == qnVar.o0) {
            return 1;
        }
        if (i10 == qnVar.s0 || i10 == qnVar.u0 || i10 == qnVar.n0 || i10 == qnVar.H0) {
            return 2;
        }
        if (i10 == qnVar.r0 || i10 == qnVar.F0 || i10 == qnVar.I0) {
            return 3;
        }
        if (i10 == qnVar.j0) {
            return 4;
        }
        if (i10 == qnVar.k0) {
            return 11;
        }
        if (i10 == qnVar.m0) {
            return 7;
        }
        if (i10 == qnVar.v0 || i10 == qnVar.w0 || i10 == qnVar.G0) {
            return 6;
        }
        if (i10 == qnVar.x0) {
            return 8;
        }
        return i10 == 0 ? 9 : 5;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        qn qnVar = this.d;
        boolean z4 = qnVar.b0;
        b7.l0 l0Var = qnVar.J0;
        b7.l0 l0Var2 = qnVar.K0;
        org.telegram.ui.ActionBar.f6 f6Var = qnVar.a;
        boolean z10 = qnVar.n;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == qnVar.i0) {
                m4Var.getTextView().setGravity(19);
                m4Var.setText(LocaleController.getString(z10 ? R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 == qnVar.l0) {
                m4Var.getTextView().setGravity(19);
                m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                return;
            }
            m4Var.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            if (i10 != qnVar.p0) {
                if (i10 == qnVar.t0) {
                    m4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (z4) {
                m4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                m4Var.setText(LocaleController.getString(z10 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        boolean z11 = true;
        if (i11 == 6) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            if (i10 == qnVar.v0) {
                s8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), qnVar.c0, qnVar.w0 != -1);
                s8Var.e(null, true);
                return;
            } else if (i10 == qnVar.w0) {
                s8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), qnVar.d0, false);
                s8Var.e(null, true);
                return;
            } else {
                if (i10 == qnVar.G0) {
                    s8Var.f(LocaleController.getString(R.string.PollV2HideResults), qnVar.T, false);
                    s8Var.e(null, true);
                    return;
                }
                return;
            }
        }
        Context context = this.c;
        if (i11 == 2) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setFixedSize(0);
            new nq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7)).w = true;
            if (i10 == qnVar.n0) {
                a9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            if (i10 == qnVar.u0) {
                a9Var.setFixedSize(12);
                a9Var.setText(null);
                return;
            }
            int i12 = qnVar.G - qnVar.J;
            if (i12 <= 0) {
                a9Var.setText(LocaleController.getString(z10 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                return;
            }
            if (z10) {
                a9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i12));
                return;
            } else if (i10 == qnVar.H0) {
                a9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                return;
            } else {
                a9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i12, new Object[0])));
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            if (i10 == qnVar.I0) {
                String string = LocaleController.getString(R.string.PollV2AllowedCountries);
                ArrayList arrayList = qnVar.M0;
                o8Var.o(string, arrayList.isEmpty() ? LocaleController.getString(R.string.SearchCountriesSelect) : arrayList.size() == 1 ? LocaleController.getCountryName((String) arrayList.get(0)) : LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]), false, true);
                return;
            } else {
                if (i10 == qnVar.F0) {
                    qnVar.U(o8Var, false);
                    return;
                }
                o8Var.e(-1, org.telegram.ui.ActionBar.j6.il);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N6, f6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k7, f6Var), mode));
                o8Var.n(LocaleController.getString(z10 ? R.string.TodoNewTask : R.string.AddAnOption), new nq(drawable, drawable2), false);
                o8Var.w = 20;
                o8Var.s = 58;
                return;
            }
        }
        if (i11 == 9) {
            view.requestLayout();
            return;
        }
        if (i11 != 10) {
            return;
        }
        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
        a6Var.setDivider(false);
        if (i10 == qnVar.y0) {
            a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !qnVar.U);
        } else {
            if (i10 == qnVar.C0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, qnVar.V);
            } else if (i10 == qnVar.A0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, qnVar.O);
            } else if (i10 == qnVar.z0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, qnVar.Q);
            } else if (i10 == qnVar.B0) {
                a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, qnVar.P);
            } else if (i10 == qnVar.D0) {
                a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, qnVar.W);
            } else if (i10 == l0Var2.b) {
                a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, l0Var2.a);
            } else if (i10 == l0Var.b) {
                a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, l0Var.a);
            } else if (i10 == qnVar.E0) {
                a6Var.a(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), 8, R.drawable.filled_poll_deadline_24, (qnVar.R == 0 && qnVar.S == 0) ? false : true);
                a6Var = a6Var;
                a6Var.setDivider((qnVar.R == 0 && qnVar.S == 0) ? false : true);
            }
            a6Var = a6Var;
        }
        if (i10 == qnVar.D0) {
            a6Var.getCheckBox().a.a(z4, false);
            return;
        }
        if (i10 != qnVar.z0) {
            a6Var.getCheckBox().a.a(false, false);
            return;
        }
        Switch checkBox = a6Var.getCheckBox();
        if (!qnVar.W && !qnVar.U) {
            z11 = false;
        }
        checkBox.a.a(z11, false);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [org.telegram.ui.Components.in] */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        View view;
        qn qnVar = this.d;
        boolean z4 = qnVar.n;
        org.telegram.ui.ActionBar.f6 f6Var = qnVar.a;
        Context context = this.c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, qnVar.a);
                break;
            case 1:
                View z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.b) null);
                new nq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7)).w = true;
                m4Var = z6Var;
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.a9(context, f6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.o8(context, f6Var);
                break;
            case 4:
            case 11:
                kn knVar = new kn(this, this.c, qnVar.F ? 1 : 0, qnVar.a, i10);
                if (i10 == 11 && !z4) {
                    knVar.setTextRight(98);
                    final int i11 = 0;
                    knVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.in
                        public final /* synthetic */ on b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i11) {
                                case 0:
                                    qn.O(this.b.d, -2);
                                    break;
                                case 1:
                                    qn.O(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                knVar.d();
                knVar.setIconsColor(org.telegram.ui.ActionBar.j6.o7);
                knVar.c(new ln(this, knVar, i10));
                m4Var = knVar;
                break;
            case 5:
            default:
                final int i12 = 2;
                nn nnVar = new nn(this, this.c, qnVar.F ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.in
                    public final /* synthetic */ on b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                qn.O(this.b.d, -2);
                                break;
                            case 1:
                                qn.O(this.b.d, -3);
                                break;
                            default:
                                this.b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                break;
                        }
                    }
                }, qnVar.a);
                if (!z4) {
                    nnVar.setTextRight(140);
                    nnVar.b().setOnClickListener(new w2(8, this, nnVar));
                }
                int i13 = org.telegram.ui.ActionBar.j6.o7;
                nnVar.setIconsColor(i13);
                lp lpVar = nnVar.r;
                if (lpVar != null) {
                    lpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = lpVar.getCheckBoxBase();
                    float f10 = nnVar.a.e;
                    if (checkBoxBase.w != f10) {
                        checkBoxBase.w = f10;
                        checkBoxBase.b();
                    }
                }
                nnVar.getCheckBox().b(-1, i13, org.telegram.ui.ActionBar.j6.k7);
                nnVar.c(new cg.b0(this, nnVar, false, 8));
                nnVar.setShowNextButton(true);
                EditTextBoldCursor textView = nnVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.yd(2, this, nnVar));
                textView.setOnKeyListener(new jn(nnVar, 0));
                m4Var = nnVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.s8(context, f6Var);
                break;
            case 7:
                mn mnVar = new mn(this, context, qnVar.F ? 1 : 0);
                mnVar.d();
                if (!z4) {
                    mnVar.setTextRight(98);
                    final int i14 = 1;
                    mnVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.in
                        public final /* synthetic */ on b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    qn.O(this.b.d, -2);
                                    break;
                                case 1:
                                    qn.O(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                mnVar.setIconsColor(org.telegram.ui.ActionBar.j6.o7);
                mnVar.c(new cg.b0(this, mnVar, false, 7));
                m4Var = mnVar;
                break;
            case 8:
                View hnVar = new hn(context, 0);
                hnVar.setTag(-33024);
                view = hnVar;
                m4Var = view;
                break;
            case 9:
                View h0Var = new eg.h0(this, context, 9);
                h0Var.setTag(-33024);
                view = h0Var;
                m4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, f6Var);
                a6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                m4Var = a6Var;
                break;
        }
        return org.telegram.ui.yh.o(m4Var, m4Var, -1, -2);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        qn qnVar = this.d;
        dh.i iVar = qnVar.i1;
        boolean z4 = qnVar.n;
        int i10 = l1Var.f;
        View view = l1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            CharSequence charSequence = qnVar.K;
            c6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z4 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
            c6Var.setTag(null);
            qn.K(qnVar, view, l1Var.b());
            return;
        }
        if (i10 == 11) {
            org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
            c6Var2.setTag(1);
            CharSequence charSequence2 = qnVar.L;
            c6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
            c6Var2.setTag(null);
            c6Var2.e.a(iVar.b(-2), false);
            qn.K(qnVar, view, l1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
                c6Var3.setTag(1);
                CharSequence charSequence3 = qnVar.M;
                c6Var3.n(charSequence3 != null ? charSequence3 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                c6Var3.setTag(null);
                if (!z4) {
                    c6Var3.e.a(iVar.b(-3), false);
                }
                qn.K(qnVar, view, l1Var.b());
                return;
            }
            return;
        }
        int b10 = l1Var.b();
        org.telegram.ui.Cells.c6 c6Var4 = (org.telegram.ui.Cells.c6) view;
        c6Var4.setTag(1);
        c6Var4.a.a(qnVar.V, false);
        int i11 = b10 - qnVar.q0;
        c6Var4.n(qnVar.H[i11], LocaleController.getString(z4 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        c6Var4.setTag(null);
        if (qnVar.h0 == b10) {
            EditTextBoldCursor textView = c6Var4.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            qnVar.h0 = -1;
        }
        if (!z4) {
            c6Var4.e.a(iVar.b(i11), false);
        }
        qn.K(qnVar, view, b10);
    }

    @Override // f2.o0
    public final void z(f2.l1 l1Var) {
        int i10 = l1Var.f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) l1Var.a).getTextView();
            if (textView.isFocused()) {
                qn qnVar = this.d;
                if (qnVar.F) {
                    gn gnVar = qnVar.x;
                    if (gnVar != null) {
                        gnVar.f();
                    }
                    qnVar.Z(true);
                }
                qnVar.d1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

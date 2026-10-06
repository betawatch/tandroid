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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class vn extends yl0 {
    public final Context c;
    public final /* synthetic */ xn d;

    public vn(xn xnVar, Context context) {
        this.d = xnVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        xn xnVar = this.d;
        return b10 == xnVar.u0 || b10 == xnVar.G0 || b10 == xnVar.B0 || b10 == xnVar.F0 || b10 == xnVar.C0 || b10 == xnVar.H0 || b10 == xnVar.D0 || b10 == xnVar.E0 || b10 == xnVar.I0 || b10 == xnVar.J0 || b10 == xnVar.N0.b || b10 == xnVar.M0.b || b10 == xnVar.L0;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.Q0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        xn xnVar = this.d;
        if (i10 == xnVar.B0 || i10 == xnVar.F0 || i10 == xnVar.G0 || i10 == xnVar.C0 || i10 == xnVar.D0 || i10 == xnVar.E0 || i10 == xnVar.H0 || i10 == xnVar.M0.b || i10 == xnVar.N0.b) {
            return 10;
        }
        if (i10 == xnVar.l0 || i10 == xnVar.s0 || i10 == xnVar.w0 || i10 == xnVar.o0) {
            return 0;
        }
        if (i10 == xnVar.r0) {
            return 1;
        }
        if (i10 == xnVar.v0 || i10 == xnVar.x0 || i10 == xnVar.q0 || i10 == xnVar.K0) {
            return 2;
        }
        if (i10 == xnVar.u0 || i10 == xnVar.I0 || i10 == xnVar.L0) {
            return 3;
        }
        if (i10 == xnVar.m0) {
            return 4;
        }
        if (i10 == xnVar.n0) {
            return 11;
        }
        if (i10 == xnVar.p0) {
            return 7;
        }
        if (i10 == xnVar.y0 || i10 == xnVar.z0 || i10 == xnVar.J0) {
            return 6;
        }
        if (i10 == xnVar.A0) {
            return 8;
        }
        return i10 == 0 ? 9 : 5;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        xn xnVar = this.d;
        boolean z10 = xnVar.e0;
        c2.a aVar = xnVar.M0;
        c2.a aVar2 = xnVar.N0;
        org.telegram.ui.ActionBar.d6 d6Var = xnVar.a;
        boolean z11 = xnVar.n;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == xnVar.l0) {
                m4Var.getTextView().setGravity(19);
                m4Var.setText(LocaleController.getString(z11 ? R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 == xnVar.o0) {
                m4Var.getTextView().setGravity(19);
                m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                return;
            }
            m4Var.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            if (i10 != xnVar.s0) {
                if (i10 == xnVar.w0) {
                    m4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (z10) {
                m4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                m4Var.setText(LocaleController.getString(z11 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        boolean z12 = true;
        if (i11 == 6) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            if (i10 == xnVar.y0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), xnVar.f0, xnVar.z0 != -1);
                w8Var.e(null, true);
                return;
            } else if (i10 == xnVar.z0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), xnVar.g0, false);
                w8Var.e(null, true);
                return;
            } else {
                if (i10 == xnVar.J0) {
                    w8Var.f(LocaleController.getString(R.string.PollV2HideResults), xnVar.W, false);
                    w8Var.e(null, true);
                    return;
                }
                return;
            }
        }
        Context context = this.c;
        if (i11 == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setFixedSize(0);
            new sq(new ColorDrawable(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.a7, d6Var)), org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.b7)).w = true;
            if (i10 == xnVar.q0) {
                e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            if (i10 == xnVar.x0) {
                e9Var.setFixedSize(12);
                e9Var.setText(null);
                return;
            }
            int i12 = xnVar.J - xnVar.M;
            if (i12 <= 0) {
                e9Var.setText(LocaleController.getString(z11 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                return;
            }
            if (z11) {
                e9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i12));
                return;
            } else if (i10 == xnVar.K0) {
                e9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                return;
            } else {
                e9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i12, new Object[0])));
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (i10 == xnVar.L0) {
                String string = LocaleController.getString(R.string.PollV2AllowedCountries);
                ArrayList arrayList = xnVar.P0;
                r8Var.o(string, arrayList.isEmpty() ? LocaleController.getString(R.string.SearchCountriesSelect) : arrayList.size() == 1 ? LocaleController.getCountryName((String) arrayList.get(0)) : LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]), false, true);
                return;
            } else {
                if (i10 == xnVar.I0) {
                    xnVar.S(r8Var, false);
                    return;
                }
                r8Var.e(-1, org.telegram.ui.ActionBar.i6.il);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.N6, d6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.k7, d6Var), mode));
                r8Var.n(LocaleController.getString(z11 ? R.string.TodoNewTask : R.string.AddAnOption), new sq(drawable, drawable2), false);
                r8Var.w = 20;
                r8Var.s = 58;
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
        if (i10 == xnVar.B0) {
            a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !xnVar.a0);
        } else {
            if (i10 == xnVar.F0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, xnVar.b0);
            } else if (i10 == xnVar.D0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, xnVar.R);
            } else if (i10 == xnVar.C0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, xnVar.T);
            } else if (i10 == xnVar.E0) {
                a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, xnVar.S);
            } else if (i10 == xnVar.G0) {
                a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, xnVar.c0);
            } else if (i10 == aVar2.b) {
                a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, aVar2.a);
            } else if (i10 == aVar.b) {
                a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, aVar.a);
            } else if (i10 == xnVar.H0) {
                a6Var.a(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), 8, R.drawable.filled_poll_deadline_24, (xnVar.U == 0 && xnVar.V == 0) ? false : true);
                a6Var = a6Var;
                a6Var.setDivider((xnVar.U == 0 && xnVar.V == 0) ? false : true);
            }
            a6Var = a6Var;
        }
        if (i10 == xnVar.G0) {
            a6Var.getCheckBox().a.a(z10, false);
            return;
        }
        if (i10 != xnVar.C0) {
            a6Var.getCheckBox().a.a(false, false);
            return;
        }
        Switch checkBox = a6Var.getCheckBox();
        if (!xnVar.c0 && !xnVar.a0) {
            z12 = false;
        }
        checkBox.a.a(z12, false);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [org.telegram.ui.Components.on] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        View view;
        xn xnVar = this.d;
        boolean z10 = xnVar.n;
        org.telegram.ui.ActionBar.d6 d6Var = xnVar.a;
        Context context = this.c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.i6.L6, 21, 15, false, xnVar.a);
                break;
            case 1:
                View b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                new sq(new ColorDrawable(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.a7, d6Var)), org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.i6.b7)).w = true;
                m4Var = b7Var;
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.e9(context, d6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.r8(context, d6Var);
                break;
            case 4:
            case 11:
                qn qnVar = new qn(this, this.c, xnVar.I ? 1 : 0, xnVar.a, i10);
                if (i10 == 11 && !z10) {
                    qnVar.setTextRight(98);
                    final int i11 = 0;
                    qnVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.on
                        public final /* synthetic */ vn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i11) {
                                case 0:
                                    xn.M(this.b.d, -2);
                                    break;
                                case 1:
                                    xn.M(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.W(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                qnVar.d();
                qnVar.setIconsColor(org.telegram.ui.ActionBar.i6.o7);
                qnVar.c(new rn(this, qnVar, i10));
                m4Var = qnVar;
                break;
            case 5:
            default:
                final int i12 = 2;
                un unVar = new un(this, this.c, xnVar.I ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.on
                    public final /* synthetic */ vn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                xn.M(this.b.d, -2);
                                break;
                            case 1:
                                xn.M(this.b.d, -3);
                                break;
                            default:
                                this.b.d.W(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                break;
                        }
                    }
                }, xnVar.a);
                if (!z10) {
                    unVar.setTextRight(140);
                    unVar.b().setOnClickListener(new org.telegram.ui.qf(23, this, unVar));
                }
                int i13 = org.telegram.ui.ActionBar.i6.o7;
                unVar.setIconsColor(i13);
                qp qpVar = unVar.r;
                if (qpVar != null) {
                    qpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = qpVar.getCheckBoxBase();
                    float f7 = unVar.a.e;
                    if (checkBoxBase.w != f7) {
                        checkBoxBase.w = f7;
                        checkBoxBase.b();
                    }
                }
                unVar.getCheckBox().b(-1, i13, org.telegram.ui.ActionBar.i6.k7);
                unVar.c(new tn(1, this, unVar));
                unVar.setShowNextButton(true);
                EditTextBoldCursor textView = unVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.yd(2, this, unVar));
                textView.setOnKeyListener(new pn(unVar, 0));
                m4Var = unVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.w8(context, d6Var);
                break;
            case 7:
                sn snVar = new sn(this, context, xnVar.I ? 1 : 0);
                snVar.d();
                if (!z10) {
                    snVar.setTextRight(98);
                    final int i14 = 1;
                    snVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.on
                        public final /* synthetic */ vn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    xn.M(this.b.d, -2);
                                    break;
                                case 1:
                                    xn.M(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.W(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                snVar.setIconsColor(org.telegram.ui.ActionBar.i6.o7);
                snVar.c(new tn(0, this, snVar));
                m4Var = snVar;
                break;
            case 8:
                View nnVar = new nn(context, 0);
                nnVar.setTag(-33024);
                view = nnVar;
                m4Var = view;
                break;
            case 9:
                View abVar = new ci.ab(this, context, 14);
                abVar.setTag(-33024);
                view = abVar;
                m4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, d6Var);
                a6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                m4Var = a6Var;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(m4Var, m4Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        xn xnVar = this.d;
        qh.f fVar = xnVar.l1;
        boolean z10 = xnVar.n;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            CharSequence charSequence = xnVar.N;
            d6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
            d6Var.setTag(null);
            xn.J(xnVar, view, c1Var.b());
            return;
        }
        if (i10 == 11) {
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            CharSequence charSequence2 = xnVar.O;
            d6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
            d6Var2.setTag(null);
            d6Var2.e.a(fVar.b(-2), false);
            xn.J(xnVar, view, c1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
                d6Var3.setTag(1);
                CharSequence charSequence3 = xnVar.P;
                d6Var3.n(charSequence3 != null ? charSequence3 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                d6Var3.setTag(null);
                if (!z10) {
                    d6Var3.e.a(fVar.b(-3), false);
                }
                xn.J(xnVar, view, c1Var.b());
                return;
            }
            return;
        }
        int b10 = c1Var.b();
        org.telegram.ui.Cells.d6 d6Var4 = (org.telegram.ui.Cells.d6) view;
        d6Var4.setTag(1);
        d6Var4.a.a(xnVar.b0, false);
        int i11 = b10 - xnVar.t0;
        d6Var4.n(xnVar.K[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        d6Var4.setTag(null);
        if (xnVar.k0 == b10) {
            EditTextBoldCursor textView = d6Var4.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            xnVar.k0 = -1;
        }
        if (!z10) {
            d6Var4.e.a(fVar.b(i11), false);
        }
        xn.J(xnVar, view, b10);
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) c1Var.a).getTextView();
            if (textView.isFocused()) {
                xn xnVar = this.d;
                if (xnVar.I) {
                    mn mnVar = xnVar.x;
                    if (mnVar != null) {
                        mnVar.f();
                    }
                    xnVar.Y(true);
                }
                xnVar.g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

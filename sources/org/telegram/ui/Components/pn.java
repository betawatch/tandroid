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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class pn extends rl0 {
    public final Context c;
    public final /* synthetic */ rn d;

    public pn(rn rnVar, Context context) {
        this.d = rnVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        int b10 = m1Var.b();
        rn rnVar = this.d;
        return b10 == rnVar.r0 || b10 == rnVar.D0 || b10 == rnVar.y0 || b10 == rnVar.C0 || b10 == rnVar.z0 || b10 == rnVar.E0 || b10 == rnVar.A0 || b10 == rnVar.B0 || b10 == rnVar.F0 || b10 == rnVar.G0 || b10 == rnVar.K0.b || b10 == rnVar.J0.b || b10 == rnVar.I0;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.N0;
    }

    @Override // f2.p0
    public final int j(int i10) {
        rn rnVar = this.d;
        if (i10 == rnVar.y0 || i10 == rnVar.C0 || i10 == rnVar.D0 || i10 == rnVar.z0 || i10 == rnVar.A0 || i10 == rnVar.B0 || i10 == rnVar.E0 || i10 == rnVar.J0.b || i10 == rnVar.K0.b) {
            return 10;
        }
        if (i10 == rnVar.i0 || i10 == rnVar.p0 || i10 == rnVar.t0 || i10 == rnVar.l0) {
            return 0;
        }
        if (i10 == rnVar.o0) {
            return 1;
        }
        if (i10 == rnVar.s0 || i10 == rnVar.u0 || i10 == rnVar.n0 || i10 == rnVar.H0) {
            return 2;
        }
        if (i10 == rnVar.r0 || i10 == rnVar.F0 || i10 == rnVar.I0) {
            return 3;
        }
        if (i10 == rnVar.j0) {
            return 4;
        }
        if (i10 == rnVar.k0) {
            return 11;
        }
        if (i10 == rnVar.m0) {
            return 7;
        }
        if (i10 == rnVar.v0 || i10 == rnVar.w0 || i10 == rnVar.G0) {
            return 6;
        }
        if (i10 == rnVar.x0) {
            return 8;
        }
        return i10 == 0 ? 9 : 5;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        rn rnVar = this.d;
        boolean z4 = rnVar.b0;
        b7.l0 l0Var = rnVar.J0;
        b7.l0 l0Var2 = rnVar.K0;
        org.telegram.ui.ActionBar.g6 g6Var = rnVar.a;
        boolean z10 = rnVar.n;
        int i11 = m1Var.f;
        View view = m1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == rnVar.i0) {
                m4Var.getTextView().setGravity(19);
                m4Var.setText(LocaleController.getString(z10 ? R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 == rnVar.l0) {
                m4Var.getTextView().setGravity(19);
                m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                return;
            }
            m4Var.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            if (i10 != rnVar.p0) {
                if (i10 == rnVar.t0) {
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
            if (i10 == rnVar.v0) {
                s8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), rnVar.c0, rnVar.w0 != -1);
                s8Var.e(null, true);
                return;
            } else if (i10 == rnVar.w0) {
                s8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), rnVar.d0, false);
                s8Var.e(null, true);
                return;
            } else {
                if (i10 == rnVar.G0) {
                    s8Var.f(LocaleController.getString(R.string.PollV2HideResults), rnVar.T, false);
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
            new pq(new ColorDrawable(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.a7, g6Var)), org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7)).w = true;
            if (i10 == rnVar.n0) {
                a9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            if (i10 == rnVar.u0) {
                a9Var.setFixedSize(12);
                a9Var.setText(null);
                return;
            }
            int i12 = rnVar.G - rnVar.J;
            if (i12 <= 0) {
                a9Var.setText(LocaleController.getString(z10 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                return;
            }
            if (z10) {
                a9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i12));
                return;
            } else if (i10 == rnVar.H0) {
                a9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                return;
            } else {
                a9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i12, new Object[0])));
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            if (i10 == rnVar.I0) {
                String string = LocaleController.getString(R.string.PollV2AllowedCountries);
                ArrayList arrayList = rnVar.M0;
                o8Var.o(string, arrayList.isEmpty() ? LocaleController.getString(R.string.SearchCountriesSelect) : arrayList.size() == 1 ? LocaleController.getCountryName((String) arrayList.get(0)) : LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]), false, true);
                return;
            } else {
                if (i10 == rnVar.F0) {
                    rnVar.U(o8Var, false);
                    return;
                }
                o8Var.e(-1, org.telegram.ui.ActionBar.k6.il);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.N6, g6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.k7, g6Var), mode));
                o8Var.n(LocaleController.getString(z10 ? R.string.TodoNewTask : R.string.AddAnOption), new pq(drawable, drawable2), false);
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
        if (i10 == rnVar.y0) {
            a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !rnVar.U);
        } else {
            if (i10 == rnVar.C0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, rnVar.V);
            } else if (i10 == rnVar.A0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, rnVar.O);
            } else if (i10 == rnVar.z0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, rnVar.Q);
            } else if (i10 == rnVar.B0) {
                a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, rnVar.P);
            } else if (i10 == rnVar.D0) {
                a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, rnVar.W);
            } else if (i10 == l0Var2.b) {
                a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, l0Var2.a);
            } else if (i10 == l0Var.b) {
                a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, l0Var.a);
            } else if (i10 == rnVar.E0) {
                a6Var.a(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), 8, R.drawable.filled_poll_deadline_24, (rnVar.R == 0 && rnVar.S == 0) ? false : true);
                a6Var = a6Var;
                a6Var.setDivider((rnVar.R == 0 && rnVar.S == 0) ? false : true);
            }
            a6Var = a6Var;
        }
        if (i10 == rnVar.D0) {
            a6Var.getCheckBox().a.a(z4, false);
            return;
        }
        if (i10 != rnVar.z0) {
            a6Var.getCheckBox().a.a(false, false);
            return;
        }
        Switch checkBox = a6Var.getCheckBox();
        if (!rnVar.W && !rnVar.U) {
            z11 = false;
        }
        checkBox.a.a(z11, false);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [org.telegram.ui.Components.jn] */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        View view;
        rn rnVar = this.d;
        boolean z4 = rnVar.n;
        org.telegram.ui.ActionBar.g6 g6Var = rnVar.a;
        Context context = this.c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, rnVar.a);
                break;
            case 1:
                View z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.b) null);
                new pq(new ColorDrawable(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.a7, g6Var)), org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7)).w = true;
                m4Var = z6Var;
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.a9(context, g6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.o8(context, g6Var);
                break;
            case 4:
            case 11:
                ln lnVar = new ln(this, this.c, rnVar.F ? 1 : 0, rnVar.a, i10);
                if (i10 == 11 && !z4) {
                    lnVar.setTextRight(98);
                    final int i11 = 0;
                    lnVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jn
                        public final /* synthetic */ pn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i11) {
                                case 0:
                                    rn.O(this.b.d, -2);
                                    break;
                                case 1:
                                    rn.O(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                lnVar.d();
                lnVar.setIconsColor(org.telegram.ui.ActionBar.k6.o7);
                lnVar.c(new mn(this, lnVar, i10));
                m4Var = lnVar;
                break;
            case 5:
            default:
                final int i12 = 2;
                on onVar = new on(this, this.c, rnVar.F ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jn
                    public final /* synthetic */ pn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                rn.O(this.b.d, -2);
                                break;
                            case 1:
                                rn.O(this.b.d, -3);
                                break;
                            default:
                                this.b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                break;
                        }
                    }
                }, rnVar.a);
                if (!z4) {
                    onVar.setTextRight(140);
                    onVar.b().setOnClickListener(new w2(8, this, onVar));
                }
                int i13 = org.telegram.ui.ActionBar.k6.o7;
                onVar.setIconsColor(i13);
                np npVar = onVar.r;
                if (npVar != null) {
                    npVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = npVar.getCheckBoxBase();
                    float f10 = onVar.a.e;
                    if (checkBoxBase.w != f10) {
                        checkBoxBase.w = f10;
                        checkBoxBase.b();
                    }
                }
                onVar.getCheckBox().b(-1, i13, org.telegram.ui.ActionBar.k6.k7);
                onVar.c(new dg.b0(this, onVar, false, 8));
                onVar.setShowNextButton(true);
                EditTextBoldCursor textView = onVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.yd(2, this, onVar));
                textView.setOnKeyListener(new kn(onVar, 0));
                m4Var = onVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.s8(context, g6Var);
                break;
            case 7:
                nn nnVar = new nn(this, context, rnVar.F ? 1 : 0);
                nnVar.d();
                if (!z4) {
                    nnVar.setTextRight(98);
                    final int i14 = 1;
                    nnVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jn
                        public final /* synthetic */ pn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    rn.O(this.b.d, -2);
                                    break;
                                case 1:
                                    rn.O(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                nnVar.setIconsColor(org.telegram.ui.ActionBar.k6.o7);
                nnVar.c(new dg.b0(this, nnVar, false, 7));
                m4Var = nnVar;
                break;
            case 8:
                View inVar = new in(context, 0);
                inVar.setTag(-33024);
                view = inVar;
                m4Var = view;
                break;
            case 9:
                View h0Var = new fg.h0(this, context, 9);
                h0Var.setTag(-33024);
                view = h0Var;
                m4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, g6Var);
                a6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                m4Var = a6Var;
                break;
        }
        return org.telegram.ui.yh.o(m4Var, m4Var, -1, -2);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        rn rnVar = this.d;
        eh.i iVar = rnVar.i1;
        boolean z4 = rnVar.n;
        int i10 = m1Var.f;
        View view = m1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            CharSequence charSequence = rnVar.K;
            c6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z4 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
            c6Var.setTag(null);
            rn.K(rnVar, view, m1Var.b());
            return;
        }
        if (i10 == 11) {
            org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
            c6Var2.setTag(1);
            CharSequence charSequence2 = rnVar.L;
            c6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
            c6Var2.setTag(null);
            c6Var2.e.a(iVar.b(-2), false);
            rn.K(rnVar, view, m1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
                c6Var3.setTag(1);
                CharSequence charSequence3 = rnVar.M;
                c6Var3.n(charSequence3 != null ? charSequence3 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                c6Var3.setTag(null);
                if (!z4) {
                    c6Var3.e.a(iVar.b(-3), false);
                }
                rn.K(rnVar, view, m1Var.b());
                return;
            }
            return;
        }
        int b10 = m1Var.b();
        org.telegram.ui.Cells.c6 c6Var4 = (org.telegram.ui.Cells.c6) view;
        c6Var4.setTag(1);
        c6Var4.a.a(rnVar.V, false);
        int i11 = b10 - rnVar.q0;
        c6Var4.n(rnVar.H[i11], LocaleController.getString(z4 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        c6Var4.setTag(null);
        if (rnVar.h0 == b10) {
            EditTextBoldCursor textView = c6Var4.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            rnVar.h0 = -1;
        }
        if (!z4) {
            c6Var4.e.a(iVar.b(i11), false);
        }
        rn.K(rnVar, view, b10);
    }

    @Override // f2.p0
    public final void z(f2.m1 m1Var) {
        int i10 = m1Var.f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) m1Var.a).getTextView();
            if (textView.isFocused()) {
                rn rnVar = this.d;
                if (rnVar.F) {
                    hn hnVar = rnVar.x;
                    if (hnVar != null) {
                        hnVar.f();
                    }
                    rnVar.Z(true);
                }
                rnVar.d1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

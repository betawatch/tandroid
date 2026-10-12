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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class go extends lm0 {
    public final Context c;
    public final /* synthetic */ io d;

    public go(io ioVar, Context context) {
        this.d = ioVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        io ioVar = this.d;
        return b10 == ioVar.u0 || b10 == ioVar.G0 || b10 == ioVar.B0 || b10 == ioVar.F0 || b10 == ioVar.C0 || b10 == ioVar.H0 || b10 == ioVar.D0 || b10 == ioVar.E0 || b10 == ioVar.I0 || b10 == ioVar.J0 || b10 == ioVar.N0.a || b10 == ioVar.M0.a || b10 == ioVar.L0;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.Q0;
    }

    @Override // s4.g0
    public final int j(int i10) {
        io ioVar = this.d;
        if (i10 == ioVar.B0 || i10 == ioVar.F0 || i10 == ioVar.G0 || i10 == ioVar.C0 || i10 == ioVar.D0 || i10 == ioVar.E0 || i10 == ioVar.H0 || i10 == ioVar.M0.a || i10 == ioVar.N0.a) {
            return 10;
        }
        if (i10 == ioVar.l0 || i10 == ioVar.s0 || i10 == ioVar.w0 || i10 == ioVar.o0) {
            return 0;
        }
        if (i10 == ioVar.r0) {
            return 1;
        }
        if (i10 == ioVar.v0 || i10 == ioVar.x0 || i10 == ioVar.q0 || i10 == ioVar.K0) {
            return 2;
        }
        if (i10 == ioVar.u0 || i10 == ioVar.I0 || i10 == ioVar.L0) {
            return 3;
        }
        if (i10 == ioVar.m0) {
            return 4;
        }
        if (i10 == ioVar.n0) {
            return 11;
        }
        if (i10 == ioVar.p0) {
            return 7;
        }
        if (i10 == ioVar.y0 || i10 == ioVar.z0 || i10 == ioVar.J0) {
            return 6;
        }
        if (i10 == ioVar.A0) {
            return 8;
        }
        return i10 == 0 ? 9 : 5;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        io ioVar = this.d;
        boolean z10 = ioVar.e0;
        c5.f fVar = ioVar.M0;
        c5.f fVar2 = ioVar.N0;
        org.telegram.ui.ActionBar.c6 c6Var = ioVar.a;
        boolean z11 = ioVar.n;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == ioVar.l0) {
                m4Var.getTextView().setGravity(19);
                m4Var.setText(LocaleController.getString(z11 ? R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 == ioVar.o0) {
                m4Var.getTextView().setGravity(19);
                m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                return;
            }
            m4Var.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            if (i10 != ioVar.s0) {
                if (i10 == ioVar.w0) {
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
            if (i10 == ioVar.y0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), ioVar.f0, ioVar.z0 != -1);
                w8Var.e(null, true);
                return;
            } else if (i10 == ioVar.z0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), ioVar.g0, false);
                w8Var.e(null, true);
                return;
            } else {
                if (i10 == ioVar.J0) {
                    w8Var.f(LocaleController.getString(R.string.PollV2HideResults), ioVar.W, false);
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
            new cr(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.a7, c6Var)), org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7)).w = true;
            if (i10 == ioVar.q0) {
                e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            if (i10 == ioVar.x0) {
                e9Var.setFixedSize(12);
                e9Var.setText(null);
                return;
            }
            int i12 = ioVar.J - ioVar.M;
            if (i12 <= 0) {
                e9Var.setText(LocaleController.getString(z11 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                return;
            }
            if (z11) {
                e9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i12));
                return;
            } else if (i10 == ioVar.K0) {
                e9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                return;
            } else {
                e9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i12, new Object[0])));
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (i10 == ioVar.L0) {
                String string = LocaleController.getString(R.string.PollV2AllowedCountries);
                ArrayList arrayList = ioVar.P0;
                r8Var.o(string, arrayList.isEmpty() ? LocaleController.getString(R.string.SearchCountriesSelect) : arrayList.size() == 1 ? LocaleController.getCountryName((String) arrayList.get(0)) : LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]), false, true);
                return;
            } else {
                if (i10 == ioVar.I0) {
                    ioVar.X(r8Var, false);
                    return;
                }
                r8Var.e(-1, org.telegram.ui.ActionBar.g6.il);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.N6, c6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.k7, c6Var), mode));
                r8Var.n(LocaleController.getString(z11 ? R.string.TodoNewTask : R.string.AddAnOption), new cr(drawable, drawable2), false);
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
        if (i10 == ioVar.B0) {
            a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), z40.c, R.drawable.filled_poll_view_24, !ioVar.a0);
        } else {
            if (i10 == ioVar.F0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), z40.f, R.drawable.filled_poll_multiple_24, ioVar.b0);
            } else if (i10 == ioVar.D0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), z40.v, R.drawable.filled_poll_revote_24, ioVar.R);
            } else if (i10 == ioVar.C0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), z40.s, R.drawable.filled_poll_add_24, ioVar.T);
            } else if (i10 == ioVar.E0) {
                a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), z40.h, R.drawable.filled_poll_shuffle_24, ioVar.S);
            } else if (i10 == ioVar.G0) {
                a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), z40.n, R.drawable.filled_poll_correct_24, ioVar.c0);
            } else if (i10 == fVar2.a) {
                a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), z40.e, R.drawable.filled_location, fVar2.b);
            } else if (i10 == fVar.a) {
                a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), z40.d, R.drawable.msg_folders_groups, fVar.b);
            } else if (i10 == ioVar.H0) {
                a6Var.a(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), z40.r, R.drawable.filled_poll_deadline_24, (ioVar.U == 0 && ioVar.V == 0) ? false : true);
                a6Var = a6Var;
                a6Var.setDivider((ioVar.U == 0 && ioVar.V == 0) ? false : true);
            }
            a6Var = a6Var;
        }
        if (i10 == ioVar.G0) {
            a6Var.getCheckBox().a.a(z10, false);
            return;
        }
        if (i10 != ioVar.C0) {
            a6Var.getCheckBox().a.a(false, false);
            return;
        }
        Switch checkBox = a6Var.getCheckBox();
        if (!ioVar.c0 && !ioVar.a0) {
            z12 = false;
        }
        checkBox.a.a(z12, false);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [org.telegram.ui.Components.yn] */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        View view;
        io ioVar = this.d;
        boolean z10 = ioVar.n;
        org.telegram.ui.ActionBar.c6 c6Var = ioVar.a;
        Context context = this.c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.g6.L6, 21, 15, false, ioVar.a);
                break;
            case 1:
                View b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
                new cr(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.a7, c6Var)), org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7)).w = true;
                m4Var = b7Var;
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.e9(context, c6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.r8(context, c6Var);
                break;
            case 4:
            case 11:
                ao aoVar = new ao(this, this.c, ioVar.I ? 1 : 0, ioVar.a, i10);
                if (i10 == 11 && !z10) {
                    aoVar.setTextRight(98);
                    final int i11 = 0;
                    aoVar.a().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yn
                        public final /* synthetic */ go b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i11) {
                                case 0:
                                    io.R(this.b.d, -2);
                                    break;
                                case 1:
                                    io.R(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                aoVar.c();
                aoVar.setIconsColor(org.telegram.ui.ActionBar.g6.o7);
                aoVar.b(new bo(this, aoVar, i10));
                m4Var = aoVar;
                break;
            case 5:
            default:
                final int i12 = 2;
                fo foVar = new fo(this, this.c, ioVar.I ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yn
                    public final /* synthetic */ go b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                io.R(this.b.d, -2);
                                break;
                            case 1:
                                io.R(this.b.d, -3);
                                break;
                            default:
                                this.b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                break;
                        }
                    }
                }, ioVar.a);
                if (!z10) {
                    foVar.setTextRight(140);
                    foVar.a().setOnClickListener(new org.telegram.ui.xf(23, this, foVar));
                }
                int i13 = org.telegram.ui.ActionBar.g6.o7;
                foVar.setIconsColor(i13);
                aq aqVar = foVar.r;
                if (aqVar != null) {
                    aqVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = aqVar.getCheckBoxBase();
                    float f7 = foVar.a.e;
                    if (checkBoxBase.w != f7) {
                        checkBoxBase.w = f7;
                        checkBoxBase.b();
                    }
                }
                foVar.getCheckBox().b(-1, i13, org.telegram.ui.ActionBar.g6.k7);
                foVar.b(new eo(1, this, foVar));
                foVar.setShowNextButton(true);
                EditTextBoldCursor textView = foVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.ce(2, this, foVar));
                textView.setOnKeyListener(new zn(foVar, 0));
                m4Var = foVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.w8(context, c6Var);
                break;
            case 7:
                co coVar = new co(this, context, ioVar.I ? 1 : 0);
                coVar.c();
                if (!z10) {
                    coVar.setTextRight(98);
                    final int i14 = 1;
                    coVar.a().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yn
                        public final /* synthetic */ go b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    io.R(this.b.d, -2);
                                    break;
                                case 1:
                                    io.R(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                coVar.setIconsColor(org.telegram.ui.ActionBar.g6.o7);
                coVar.b(new eo(0, this, coVar));
                m4Var = coVar;
                break;
            case 8:
                View xnVar = new xn(context, 0);
                xnVar.setTag(-33024);
                view = xnVar;
                m4Var = view;
                break;
            case 9:
                View abVar = new di.ab(this, context, 14);
                abVar.setTag(-33024);
                view = abVar;
                m4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, c6Var);
                a6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                m4Var = a6Var;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(m4Var, m4Var, -1, -2);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        io ioVar = this.d;
        rh.f fVar = ioVar.l1;
        boolean z10 = ioVar.n;
        int i10 = b1Var.f;
        View view = b1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            CharSequence charSequence = ioVar.N;
            d6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
            d6Var.setTag(null);
            io.O(ioVar, view, b1Var.b());
            return;
        }
        if (i10 == 11) {
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            CharSequence charSequence2 = ioVar.O;
            d6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
            d6Var2.setTag(null);
            d6Var2.e.a(fVar.b(-2), false);
            io.O(ioVar, view, b1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
                d6Var3.setTag(1);
                CharSequence charSequence3 = ioVar.P;
                d6Var3.n(charSequence3 != null ? charSequence3 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                d6Var3.setTag(null);
                if (!z10) {
                    d6Var3.e.a(fVar.b(-3), false);
                }
                io.O(ioVar, view, b1Var.b());
                return;
            }
            return;
        }
        int b10 = b1Var.b();
        org.telegram.ui.Cells.d6 d6Var4 = (org.telegram.ui.Cells.d6) view;
        d6Var4.setTag(1);
        d6Var4.a.a(ioVar.b0, false);
        int i11 = b10 - ioVar.t0;
        d6Var4.n(ioVar.K[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        d6Var4.setTag(null);
        if (ioVar.k0 == b10) {
            EditTextBoldCursor textView = d6Var4.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            ioVar.k0 = -1;
        }
        if (!z10) {
            d6Var4.e.a(fVar.b(i11), false);
        }
        io.O(ioVar, view, b10);
    }

    @Override // s4.g0
    public final void z(s4.b1 b1Var) {
        int i10 = b1Var.f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) b1Var.a).getTextView();
            if (textView.isFocused()) {
                io ioVar = this.d;
                if (ioVar.I) {
                    wn wnVar = ioVar.x;
                    if (wnVar != null) {
                        wnVar.f();
                    }
                    ioVar.c0(true);
                }
                ioVar.g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

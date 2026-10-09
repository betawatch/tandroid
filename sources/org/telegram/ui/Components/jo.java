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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jo extends pm0 {
    public final Context c;
    public final /* synthetic */ lo d;

    public jo(lo loVar, Context context) {
        this.d = loVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        int b10 = d1Var.b();
        lo loVar = this.d;
        return b10 == loVar.u0 || b10 == loVar.G0 || b10 == loVar.B0 || b10 == loVar.F0 || b10 == loVar.C0 || b10 == loVar.H0 || b10 == loVar.D0 || b10 == loVar.E0 || b10 == loVar.I0 || b10 == loVar.J0 || b10 == loVar.N0.b || b10 == loVar.M0.b || b10 == loVar.L0;
    }

    @Override // s4.i0
    public final int h() {
        return this.d.Q0;
    }

    @Override // s4.i0
    public final int j(int i10) {
        lo loVar = this.d;
        if (i10 == loVar.B0 || i10 == loVar.F0 || i10 == loVar.G0 || i10 == loVar.C0 || i10 == loVar.D0 || i10 == loVar.E0 || i10 == loVar.H0 || i10 == loVar.M0.b || i10 == loVar.N0.b) {
            return 10;
        }
        if (i10 == loVar.l0 || i10 == loVar.s0 || i10 == loVar.w0 || i10 == loVar.o0) {
            return 0;
        }
        if (i10 == loVar.r0) {
            return 1;
        }
        if (i10 == loVar.v0 || i10 == loVar.x0 || i10 == loVar.q0 || i10 == loVar.K0) {
            return 2;
        }
        if (i10 == loVar.u0 || i10 == loVar.I0 || i10 == loVar.L0) {
            return 3;
        }
        if (i10 == loVar.m0) {
            return 4;
        }
        if (i10 == loVar.n0) {
            return 11;
        }
        if (i10 == loVar.p0) {
            return 7;
        }
        if (i10 == loVar.y0 || i10 == loVar.z0 || i10 == loVar.J0) {
            return 6;
        }
        if (i10 == loVar.A0) {
            return 8;
        }
        return i10 == 0 ? 9 : 5;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        lo loVar = this.d;
        boolean z10 = loVar.e0;
        c2.a aVar = loVar.M0;
        c2.a aVar2 = loVar.N0;
        org.telegram.ui.ActionBar.e6 e6Var = loVar.a;
        boolean z11 = loVar.n;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == loVar.l0) {
                m4Var.getTextView().setGravity(19);
                m4Var.setText(LocaleController.getString(z11 ? R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 == loVar.o0) {
                m4Var.getTextView().setGravity(19);
                m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                return;
            }
            m4Var.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            if (i10 != loVar.s0) {
                if (i10 == loVar.w0) {
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
            if (i10 == loVar.y0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), loVar.f0, loVar.z0 != -1);
                w8Var.e(null, true);
                return;
            } else if (i10 == loVar.z0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), loVar.g0, false);
                w8Var.e(null, true);
                return;
            } else {
                if (i10 == loVar.J0) {
                    w8Var.f(LocaleController.getString(R.string.PollV2HideResults), loVar.W, false);
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
            new fr(new ColorDrawable(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.a7, e6Var)), org.telegram.ui.ActionBar.i6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.b7)).w = true;
            if (i10 == loVar.q0) {
                e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            if (i10 == loVar.x0) {
                e9Var.setFixedSize(12);
                e9Var.setText(null);
                return;
            }
            int i12 = loVar.J - loVar.M;
            if (i12 <= 0) {
                e9Var.setText(LocaleController.getString(z11 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                return;
            }
            if (z11) {
                e9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i12));
                return;
            } else if (i10 == loVar.K0) {
                e9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                return;
            } else {
                e9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i12, new Object[0])));
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (i10 == loVar.L0) {
                String string = LocaleController.getString(R.string.PollV2AllowedCountries);
                ArrayList arrayList = loVar.P0;
                r8Var.o(string, arrayList.isEmpty() ? LocaleController.getString(R.string.SearchCountriesSelect) : arrayList.size() == 1 ? LocaleController.getCountryName((String) arrayList.get(0)) : LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]), false, true);
                return;
            } else {
                if (i10 == loVar.I0) {
                    loVar.X(r8Var, false);
                    return;
                }
                r8Var.e(-1, org.telegram.ui.ActionBar.i6.il);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.N6, e6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.k7, e6Var), mode));
                r8Var.n(LocaleController.getString(z11 ? R.string.TodoNewTask : R.string.AddAnOption), new fr(drawable, drawable2), false);
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
        if (i10 == loVar.B0) {
            a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), d50.c, R.drawable.filled_poll_view_24, !loVar.a0);
        } else {
            if (i10 == loVar.F0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), d50.f, R.drawable.filled_poll_multiple_24, loVar.b0);
            } else if (i10 == loVar.D0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), d50.v, R.drawable.filled_poll_revote_24, loVar.R);
            } else if (i10 == loVar.C0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), d50.s, R.drawable.filled_poll_add_24, loVar.T);
            } else if (i10 == loVar.E0) {
                a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), d50.h, R.drawable.filled_poll_shuffle_24, loVar.S);
            } else if (i10 == loVar.G0) {
                a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), d50.n, R.drawable.filled_poll_correct_24, loVar.c0);
            } else if (i10 == aVar2.b) {
                a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), d50.e, R.drawable.filled_location, aVar2.a);
            } else if (i10 == aVar.b) {
                a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), d50.d, R.drawable.msg_folders_groups, aVar.a);
            } else if (i10 == loVar.H0) {
                a6Var.a(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), d50.r, R.drawable.filled_poll_deadline_24, (loVar.U == 0 && loVar.V == 0) ? false : true);
                a6Var = a6Var;
                a6Var.setDivider((loVar.U == 0 && loVar.V == 0) ? false : true);
            }
            a6Var = a6Var;
        }
        if (i10 == loVar.G0) {
            a6Var.getCheckBox().a.a(z10, false);
            return;
        }
        if (i10 != loVar.C0) {
            a6Var.getCheckBox().a.a(false, false);
            return;
        }
        Switch checkBox = a6Var.getCheckBox();
        if (!loVar.c0 && !loVar.a0) {
            z12 = false;
        }
        checkBox.a.a(z12, false);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [org.telegram.ui.Components.bo] */
    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        View view;
        lo loVar = this.d;
        boolean z10 = loVar.n;
        org.telegram.ui.ActionBar.e6 e6Var = loVar.a;
        Context context = this.c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.i6.L6, 21, 15, false, loVar.a);
                break;
            case 1:
                View b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                new fr(new ColorDrawable(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.a7, e6Var)), org.telegram.ui.ActionBar.i6.W0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.i6.b7)).w = true;
                m4Var = b7Var;
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.e9(context, e6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.r8(context, e6Var);
                break;
            case 4:
            case 11:
                eo eoVar = new eo(this, this.c, loVar.I ? 1 : 0, loVar.a, i10);
                if (i10 == 11 && !z10) {
                    eoVar.setTextRight(98);
                    final int i11 = 0;
                    eoVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bo
                        public final /* synthetic */ jo b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i11) {
                                case 0:
                                    lo.R(this.b.d, -2);
                                    break;
                                case 1:
                                    lo.R(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                eoVar.d();
                eoVar.setIconsColor(org.telegram.ui.ActionBar.i6.o7);
                eoVar.c(new fo(this, eoVar, i10));
                m4Var = eoVar;
                break;
            case 5:
            default:
                final int i12 = 2;
                io ioVar = new io(this, this.c, loVar.I ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bo
                    public final /* synthetic */ jo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                lo.R(this.b.d, -2);
                                break;
                            case 1:
                                lo.R(this.b.d, -3);
                                break;
                            default:
                                this.b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                break;
                        }
                    }
                }, loVar.a);
                if (!z10) {
                    ioVar.setTextRight(140);
                    ioVar.b().setOnClickListener(new org.telegram.ui.sf(23, this, ioVar));
                }
                int i13 = org.telegram.ui.ActionBar.i6.o7;
                ioVar.setIconsColor(i13);
                dq dqVar = ioVar.r;
                if (dqVar != null) {
                    dqVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = dqVar.getCheckBoxBase();
                    float f7 = ioVar.a.e;
                    if (checkBoxBase.w != f7) {
                        checkBoxBase.w = f7;
                        checkBoxBase.b();
                    }
                }
                ioVar.getCheckBox().b(-1, i13, org.telegram.ui.ActionBar.i6.k7);
                ioVar.c(new ho(1, this, ioVar));
                ioVar.setShowNextButton(true);
                EditTextBoldCursor textView = ioVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.wd(2, this, ioVar));
                textView.setOnKeyListener(new co(ioVar, 0));
                m4Var = ioVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.w8(context, e6Var);
                break;
            case 7:
                go goVar = new go(this, context, loVar.I ? 1 : 0);
                goVar.d();
                if (!z10) {
                    goVar.setTextRight(98);
                    final int i14 = 1;
                    goVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bo
                        public final /* synthetic */ jo b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    lo.R(this.b.d, -2);
                                    break;
                                case 1:
                                    lo.R(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                goVar.setIconsColor(org.telegram.ui.ActionBar.i6.o7);
                goVar.c(new ho(0, this, goVar));
                m4Var = goVar;
                break;
            case 8:
                View aoVar = new ao(context, 0);
                aoVar.setTag(-33024);
                view = aoVar;
                m4Var = view;
                break;
            case 9:
                View bbVar = new ci.bb(this, context, 14);
                bbVar.setTag(-33024);
                view = bbVar;
                m4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, e6Var);
                a6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                m4Var = a6Var;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(m4Var, m4Var, -1, -2);
    }

    @Override // s4.i0
    public final void y(s4.d1 d1Var) {
        lo loVar = this.d;
        qh.f fVar = loVar.l1;
        boolean z10 = loVar.n;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            CharSequence charSequence = loVar.N;
            d6Var.o(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
            d6Var.setTag(null);
            lo.O(loVar, view, d1Var.b());
            return;
        }
        if (i10 == 11) {
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            CharSequence charSequence2 = loVar.O;
            d6Var2.o(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
            d6Var2.setTag(null);
            d6Var2.e.a(fVar.b(-2), false);
            lo.O(loVar, view, d1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
                d6Var3.setTag(1);
                CharSequence charSequence3 = loVar.P;
                d6Var3.o(charSequence3 != null ? charSequence3 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                d6Var3.setTag(null);
                if (!z10) {
                    d6Var3.e.a(fVar.b(-3), false);
                }
                lo.O(loVar, view, d1Var.b());
                return;
            }
            return;
        }
        int b10 = d1Var.b();
        org.telegram.ui.Cells.d6 d6Var4 = (org.telegram.ui.Cells.d6) view;
        d6Var4.setTag(1);
        d6Var4.a.a(loVar.b0, false);
        int i11 = b10 - loVar.t0;
        d6Var4.o(loVar.K[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        d6Var4.setTag(null);
        if (loVar.k0 == b10) {
            EditTextBoldCursor textView = d6Var4.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            loVar.k0 = -1;
        }
        if (!z10) {
            d6Var4.e.a(fVar.b(i11), false);
        }
        lo.O(loVar, view, b10);
    }

    @Override // s4.i0
    public final void z(s4.d1 d1Var) {
        int i10 = d1Var.f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) d1Var.a).getTextView();
            if (textView.isFocused()) {
                lo loVar = this.d;
                if (loVar.I) {
                    zn znVar = loVar.x;
                    if (znVar != null) {
                        znVar.f();
                    }
                    loVar.c0(true);
                }
                loVar.g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

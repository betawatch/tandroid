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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class co extends lm0 {
    public final Context c;
    public final /* synthetic */ fo d;

    public co(fo foVar, Context context) {
        this.d = foVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        fo foVar = this.d;
        return b10 == foVar.u0 || b10 == foVar.G0 || b10 == foVar.B0 || b10 == foVar.F0 || b10 == foVar.C0 || b10 == foVar.H0 || b10 == foVar.D0 || b10 == foVar.E0 || b10 == foVar.I0 || b10 == foVar.J0 || b10 == foVar.N0.a || b10 == foVar.M0.a || b10 == foVar.L0;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.Q0;
    }

    @Override // s4.g0
    public final int j(int i10) {
        fo foVar = this.d;
        if (i10 == foVar.B0 || i10 == foVar.F0 || i10 == foVar.G0 || i10 == foVar.C0 || i10 == foVar.D0 || i10 == foVar.E0 || i10 == foVar.H0 || i10 == foVar.M0.a || i10 == foVar.N0.a) {
            return 10;
        }
        if (i10 == foVar.l0 || i10 == foVar.s0 || i10 == foVar.w0 || i10 == foVar.o0) {
            return 0;
        }
        if (i10 == foVar.r0) {
            return 1;
        }
        if (i10 == foVar.v0 || i10 == foVar.x0 || i10 == foVar.q0 || i10 == foVar.K0) {
            return 2;
        }
        if (i10 == foVar.u0 || i10 == foVar.I0 || i10 == foVar.L0) {
            return 3;
        }
        if (i10 == foVar.m0) {
            return 4;
        }
        if (i10 == foVar.n0) {
            return 11;
        }
        if (i10 == foVar.p0) {
            return 7;
        }
        if (i10 == foVar.y0 || i10 == foVar.z0 || i10 == foVar.J0) {
            return 6;
        }
        if (i10 == foVar.A0) {
            return 8;
        }
        return i10 == 0 ? 9 : 5;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        fo foVar = this.d;
        boolean z10 = foVar.e0;
        c5.f fVar = foVar.M0;
        c5.f fVar2 = foVar.N0;
        org.telegram.ui.ActionBar.g6 g6Var = foVar.a;
        boolean z11 = foVar.n;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == foVar.l0) {
                l4Var.getTextView().setGravity(19);
                l4Var.setText(LocaleController.getString(z11 ? R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 == foVar.o0) {
                l4Var.getTextView().setGravity(19);
                l4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                return;
            }
            l4Var.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            if (i10 != foVar.s0) {
                if (i10 == foVar.w0) {
                    l4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (z10) {
                l4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                l4Var.setText(LocaleController.getString(z11 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        boolean z12 = true;
        if (i11 == 6) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            if (i10 == foVar.y0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), foVar.f0, foVar.z0 != -1);
                w8Var.e(null, true);
                return;
            } else if (i10 == foVar.z0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), foVar.g0, false);
                w8Var.e(null, true);
                return;
            } else {
                if (i10 == foVar.J0) {
                    w8Var.f(LocaleController.getString(R.string.PollV2HideResults), foVar.W, false);
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
            new yq(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, g6Var)), org.telegram.ui.ActionBar.k6.X0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7)).w = true;
            if (i10 == foVar.q0) {
                e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            if (i10 == foVar.x0) {
                e9Var.setFixedSize(12);
                e9Var.setText(null);
                return;
            }
            int i12 = foVar.J - foVar.M;
            if (i12 <= 0) {
                e9Var.setText(LocaleController.getString(z11 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                return;
            }
            if (z11) {
                e9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i12));
                return;
            } else if (i10 == foVar.K0) {
                e9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                return;
            } else {
                e9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i12, new Object[0])));
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (i10 == foVar.L0) {
                String string = LocaleController.getString(R.string.PollV2AllowedCountries);
                ArrayList arrayList = foVar.P0;
                r8Var.q(string, arrayList.isEmpty() ? LocaleController.getString(R.string.SearchCountriesSelect) : arrayList.size() == 1 ? LocaleController.getCountryName((String) arrayList.get(0)) : LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]), false, true);
                return;
            }
            if (i10 == foVar.I0) {
                foVar.X(r8Var, false);
                return;
            }
            r8Var.g(-1, org.telegram.ui.ActionBar.k6.il);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N6, g6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.k7, g6Var), mode));
            foVar.n1 = drawable;
            foVar.o1 = drawable2;
            r8Var.p(LocaleController.getString(z11 ? R.string.TodoNewTask : R.string.AddAnOption), new yq(drawable, drawable2), false);
            r8Var.w = 20;
            r8Var.s = 58;
            return;
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
        if (i10 == foVar.B0) {
            a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), v40.c, R.drawable.filled_poll_view_24, !foVar.a0);
        } else {
            if (i10 == foVar.F0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), v40.f, R.drawable.filled_poll_multiple_24, foVar.b0);
            } else if (i10 == foVar.D0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), v40.v, R.drawable.filled_poll_revote_24, foVar.R);
            } else if (i10 == foVar.C0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), v40.s, R.drawable.filled_poll_add_24, foVar.T);
            } else if (i10 == foVar.E0) {
                a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), v40.h, R.drawable.filled_poll_shuffle_24, foVar.S);
            } else if (i10 == foVar.G0) {
                a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), v40.n, R.drawable.filled_poll_correct_24, foVar.c0);
            } else if (i10 == fVar2.a) {
                a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), v40.e, R.drawable.filled_location, fVar2.b);
            } else if (i10 == fVar.a) {
                a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), v40.d, R.drawable.msg_folders_groups, fVar.b);
            } else if (i10 == foVar.H0) {
                a6Var.a(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), v40.r, R.drawable.filled_poll_deadline_24, (foVar.U == 0 && foVar.V == 0) ? false : true);
                a6Var = a6Var;
                a6Var.setDivider((foVar.U == 0 && foVar.V == 0) ? false : true);
            }
            a6Var = a6Var;
        }
        if (i10 == foVar.G0) {
            a6Var.getCheckBox().a.a(z10, false);
            return;
        }
        if (i10 != foVar.C0) {
            a6Var.getCheckBox().a.a(false, false);
            return;
        }
        Switch checkBox = a6Var.getCheckBox();
        if (!foVar.c0 && !foVar.a0) {
            z12 = false;
        }
        checkBox.a.a(z12, false);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [org.telegram.ui.Components.vn] */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        View view;
        fo foVar = this.d;
        boolean z10 = foVar.n;
        org.telegram.ui.ActionBar.g6 g6Var = foVar.a;
        Context context = this.c;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(this.c, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, foVar.a);
                break;
            case 1:
                View b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                new yq(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, g6Var)), org.telegram.ui.ActionBar.k6.X0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7)).w = true;
                l4Var = b7Var;
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.e9(context, g6Var);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.r8(context, g6Var);
                break;
            case 4:
            case 11:
                xn xnVar = new xn(this, this.c, foVar.I ? 1 : 0, foVar.a, i10);
                if (i10 == 11 && !z10) {
                    xnVar.setTextRight(98);
                    final int i11 = 0;
                    xnVar.a().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vn
                        public final /* synthetic */ co b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i11) {
                                case 0:
                                    fo.R(this.b.d, -2);
                                    break;
                                case 1:
                                    fo.R(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                xnVar.c();
                xnVar.setIconsColor(org.telegram.ui.ActionBar.k6.o7);
                xnVar.b(new yn(this, xnVar, i10));
                l4Var = xnVar;
                break;
            case 5:
            default:
                final int i12 = 2;
                bo boVar = new bo(this, this.c, foVar.I ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vn
                    public final /* synthetic */ co b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                fo.R(this.b.d, -2);
                                break;
                            case 1:
                                fo.R(this.b.d, -3);
                                break;
                            default:
                                this.b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                break;
                        }
                    }
                }, foVar.a);
                if (!z10) {
                    boVar.setTextRight(140);
                    boVar.a().setOnClickListener(new ca(4, this, boVar));
                }
                int i13 = org.telegram.ui.ActionBar.k6.o7;
                boVar.setIconsColor(i13);
                xp xpVar = boVar.r;
                if (xpVar != null) {
                    xpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = xpVar.getCheckBoxBase();
                    float f7 = boVar.a.e;
                    if (checkBoxBase.w != f7) {
                        checkBoxBase.w = f7;
                        checkBoxBase.b();
                    }
                }
                boVar.getCheckBox().b(-1, i13, org.telegram.ui.ActionBar.k6.k7);
                boVar.b(new ao(1, this, boVar));
                boVar.setShowNextButton(true);
                EditTextBoldCursor textView = boVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.wd(2, this, boVar));
                textView.setOnKeyListener(new wn(boVar, 0));
                l4Var = boVar;
                break;
            case 6:
                l4Var = new org.telegram.ui.Cells.w8(context, g6Var);
                break;
            case 7:
                zn znVar = new zn(this, context, foVar.I ? 1 : 0);
                znVar.c();
                if (!z10) {
                    znVar.setTextRight(98);
                    final int i14 = 1;
                    znVar.a().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vn
                        public final /* synthetic */ co b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    fo.R(this.b.d, -2);
                                    break;
                                case 1:
                                    fo.R(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                znVar.setIconsColor(org.telegram.ui.ActionBar.k6.o7);
                znVar.b(new ao(0, this, znVar));
                l4Var = znVar;
                break;
            case 8:
                View unVar = new un(context, 0);
                unVar.setTag(-33024);
                view = unVar;
                l4Var = view;
                break;
            case 9:
                View jcVar = new ai.jc(this, context, 14);
                jcVar.setTag(-33024);
                view = jcVar;
                l4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, g6Var);
                a6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                l4Var = a6Var;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(l4Var, l4Var, -1, -2);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        fo foVar = this.d;
        rh.f fVar = foVar.m1;
        boolean z10 = foVar.n;
        int i10 = b1Var.f;
        View view = b1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            CharSequence charSequence = foVar.N;
            d6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
            d6Var.setTag(null);
            fo.O(foVar, view, b1Var.b());
            return;
        }
        if (i10 == 11) {
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            CharSequence charSequence2 = foVar.O;
            d6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
            d6Var2.setTag(null);
            d6Var2.e.a(fVar.b(-2), false);
            fo.O(foVar, view, b1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
                d6Var3.setTag(1);
                CharSequence charSequence3 = foVar.P;
                d6Var3.n(charSequence3 != null ? charSequence3 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                d6Var3.setTag(null);
                if (!z10) {
                    d6Var3.e.a(fVar.b(-3), false);
                }
                fo.O(foVar, view, b1Var.b());
                return;
            }
            return;
        }
        int b10 = b1Var.b();
        org.telegram.ui.Cells.d6 d6Var4 = (org.telegram.ui.Cells.d6) view;
        d6Var4.setTag(1);
        d6Var4.a.a(foVar.b0, false);
        int i11 = b10 - foVar.t0;
        d6Var4.n(foVar.K[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        d6Var4.setTag(null);
        if (foVar.k0 == b10) {
            EditTextBoldCursor textView = d6Var4.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            foVar.k0 = -1;
        }
        if (!z10) {
            d6Var4.e.a(fVar.b(i11), false);
        }
        fo.O(foVar, view, b10);
    }

    @Override // s4.g0
    public final void z(s4.b1 b1Var) {
        int i10 = b1Var.f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) b1Var.a).getTextView();
            if (textView.isFocused()) {
                fo foVar = this.d;
                if (foVar.I) {
                    tn tnVar = foVar.x;
                    if (tnVar != null) {
                        tnVar.f();
                    }
                    foVar.c0(true);
                }
                foVar.g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

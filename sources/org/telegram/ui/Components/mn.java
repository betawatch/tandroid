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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mn extends il0 {
    public final Context c;
    public final /* synthetic */ on d;

    public mn(on onVar, Context context) {
        this.d = onVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int b10 = n1Var.b();
        on onVar = this.d;
        return b10 == onVar.q0 || b10 == onVar.C0 || b10 == onVar.x0 || b10 == onVar.B0 || b10 == onVar.y0 || b10 == onVar.D0 || b10 == onVar.z0 || b10 == onVar.A0 || b10 == onVar.E0 || b10 == onVar.F0 || b10 == onVar.J0.b || b10 == onVar.I0.b || b10 == onVar.H0;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.M0;
    }

    @Override // f2.p0
    public final int j(int i10) {
        on onVar = this.d;
        if (i10 == onVar.x0 || i10 == onVar.B0 || i10 == onVar.C0 || i10 == onVar.y0 || i10 == onVar.z0 || i10 == onVar.A0 || i10 == onVar.D0 || i10 == onVar.I0.b || i10 == onVar.J0.b) {
            return 10;
        }
        if (i10 == onVar.h0 || i10 == onVar.o0 || i10 == onVar.s0 || i10 == onVar.k0) {
            return 0;
        }
        if (i10 == onVar.n0) {
            return 1;
        }
        if (i10 == onVar.r0 || i10 == onVar.t0 || i10 == onVar.m0 || i10 == onVar.G0) {
            return 2;
        }
        if (i10 == onVar.q0 || i10 == onVar.E0 || i10 == onVar.H0) {
            return 3;
        }
        if (i10 == onVar.i0) {
            return 4;
        }
        if (i10 == onVar.j0) {
            return 11;
        }
        if (i10 == onVar.l0) {
            return 7;
        }
        if (i10 == onVar.u0 || i10 == onVar.v0 || i10 == onVar.F0) {
            return 6;
        }
        if (i10 == onVar.w0) {
            return 8;
        }
        return i10 == 0 ? 9 : 5;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        on onVar = this.d;
        boolean z10 = onVar.a0;
        m.a aVar = onVar.I0;
        m.a aVar2 = onVar.J0;
        org.telegram.ui.ActionBar.c6 c6Var = onVar.a;
        boolean z11 = onVar.n;
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            if (i10 == onVar.h0) {
                k4Var.getTextView().setGravity(19);
                k4Var.setText(LocaleController.getString(z11 ? R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 == onVar.k0) {
                k4Var.getTextView().setGravity(19);
                k4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                return;
            }
            k4Var.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            if (i10 != onVar.o0) {
                if (i10 == onVar.s0) {
                    k4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (z10) {
                k4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                k4Var.setText(LocaleController.getString(z11 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        boolean z12 = true;
        if (i11 == 6) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            if (i10 == onVar.u0) {
                q8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), onVar.b0, onVar.v0 != -1);
                q8Var.e(null, true);
                return;
            } else if (i10 == onVar.v0) {
                q8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), onVar.c0, false);
                q8Var.e(null, true);
                return;
            } else {
                if (i10 == onVar.F0) {
                    q8Var.f(LocaleController.getString(R.string.PollV2HideResults), onVar.S, false);
                    q8Var.e(null, true);
                    return;
                }
                return;
            }
        }
        Context context = this.c;
        if (i11 == 2) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setFixedSize(0);
            new jq(new ColorDrawable(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.a7, c6Var)), org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7)).w = true;
            if (i10 == onVar.m0) {
                y8Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            if (i10 == onVar.t0) {
                y8Var.setFixedSize(12);
                y8Var.setText(null);
                return;
            }
            int i12 = onVar.F - onVar.I;
            if (i12 <= 0) {
                y8Var.setText(LocaleController.getString(z11 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                return;
            }
            if (z11) {
                y8Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i12));
                return;
            } else if (i10 == onVar.G0) {
                y8Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                return;
            } else {
                y8Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i12, new Object[0])));
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            if (i10 == onVar.H0) {
                String string = LocaleController.getString(R.string.PollV2AllowedCountries);
                ArrayList arrayList = onVar.L0;
                m8Var.o(string, arrayList.isEmpty() ? LocaleController.getString(R.string.SearchCountriesSelect) : arrayList.size() == 1 ? LocaleController.getCountryName((String) arrayList.get(0)) : LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]), false, true);
                return;
            } else {
                if (i10 == onVar.E0) {
                    onVar.U(m8Var, false);
                    return;
                }
                m8Var.e(-1, org.telegram.ui.ActionBar.g6.il);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.N6, c6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.k7, c6Var), mode));
                m8Var.n(LocaleController.getString(z11 ? R.string.TodoNewTask : R.string.AddAnOption), new jq(drawable, drawable2), false);
                m8Var.w = 20;
                m8Var.s = 58;
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
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) view;
        y5Var.setDivider(false);
        if (i10 == onVar.x0) {
            y5Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !onVar.T);
        } else {
            if (i10 == onVar.B0) {
                y5Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, onVar.U);
            } else if (i10 == onVar.z0) {
                y5Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, onVar.N);
            } else if (i10 == onVar.y0) {
                y5Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, onVar.P);
            } else if (i10 == onVar.A0) {
                y5Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, onVar.O);
            } else if (i10 == onVar.C0) {
                y5Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, onVar.V);
            } else if (i10 == aVar2.b) {
                y5Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, aVar2.a);
            } else if (i10 == aVar.b) {
                y5Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, aVar.a);
            } else if (i10 == onVar.D0) {
                y5Var.a(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), 8, R.drawable.filled_poll_deadline_24, (onVar.Q == 0 && onVar.R == 0) ? false : true);
                y5Var = y5Var;
                y5Var.setDivider((onVar.Q == 0 && onVar.R == 0) ? false : true);
            }
            y5Var = y5Var;
        }
        if (i10 == onVar.C0) {
            y5Var.getCheckBox().a.a(z10, false);
            return;
        }
        if (i10 != onVar.y0) {
            y5Var.getCheckBox().a.a(false, false);
            return;
        }
        Switch checkBox = y5Var.getCheckBox();
        if (!onVar.V && !onVar.T) {
            z12 = false;
        }
        checkBox.a.a(z12, false);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [org.telegram.ui.Components.gn] */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View k4Var;
        View view;
        on onVar = this.d;
        boolean z10 = onVar.n;
        org.telegram.ui.ActionBar.c6 c6Var = onVar.a;
        Context context = this.c;
        switch (i10) {
            case 0:
                k4Var = new org.telegram.ui.Cells.k4(this.c, org.telegram.ui.ActionBar.g6.L6, 21, 15, false, onVar.a);
                break;
            case 1:
                View x6Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.b) null);
                new jq(new ColorDrawable(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.a7, c6Var)), org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7)).w = true;
                k4Var = x6Var;
                break;
            case 2:
                k4Var = new org.telegram.ui.Cells.y8(context, c6Var);
                break;
            case 3:
                k4Var = new org.telegram.ui.Cells.m8(context, c6Var);
                break;
            case 4:
            case 11:
                in inVar = new in(this, this.c, onVar.E ? 1 : 0, onVar.a, i10);
                if (i10 == 11 && !z10) {
                    inVar.setTextRight(98);
                    final int i11 = 0;
                    inVar.a().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gn
                        public final /* synthetic */ mn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i11) {
                                case 0:
                                    on.O(this.b.d, -2);
                                    break;
                                case 1:
                                    on.O(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.X(view2, (org.telegram.ui.Cells.a6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                inVar.c();
                inVar.setIconsColor(org.telegram.ui.ActionBar.g6.o7);
                inVar.b(new jn(this, inVar, i10));
                k4Var = inVar;
                break;
            case 5:
            default:
                final int i12 = 2;
                ln lnVar = new ln(this, this.c, onVar.E ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gn
                    public final /* synthetic */ mn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                on.O(this.b.d, -2);
                                break;
                            case 1:
                                on.O(this.b.d, -3);
                                break;
                            default:
                                this.b.d.X(view2, (org.telegram.ui.Cells.a6) view2.getParent(), true);
                                break;
                        }
                    }
                }, onVar.a);
                if (!z10) {
                    lnVar.setTextRight(140);
                    lnVar.a().setOnClickListener(new t2(11, this, lnVar));
                }
                int i13 = org.telegram.ui.ActionBar.g6.o7;
                lnVar.setIconsColor(i13);
                hp hpVar = lnVar.r;
                if (hpVar != null) {
                    hpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = hpVar.getCheckBoxBase();
                    float f9 = lnVar.a.e;
                    if (checkBoxBase.w != f9) {
                        checkBoxBase.w = f9;
                        checkBoxBase.b();
                    }
                }
                lnVar.getCheckBox().b(-1, i13, org.telegram.ui.ActionBar.g6.k7);
                lnVar.b(new ag.c0(this, lnVar, false, 8));
                lnVar.setShowNextButton(true);
                EditTextBoldCursor textView = lnVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.rd(2, this, lnVar));
                textView.setOnKeyListener(new hn(lnVar, 0));
                k4Var = lnVar;
                break;
            case 6:
                k4Var = new org.telegram.ui.Cells.q8(context, c6Var);
                break;
            case 7:
                kn knVar = new kn(this, context, onVar.E ? 1 : 0);
                knVar.c();
                if (!z10) {
                    knVar.setTextRight(98);
                    final int i14 = 1;
                    knVar.a().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gn
                        public final /* synthetic */ mn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    on.O(this.b.d, -2);
                                    break;
                                case 1:
                                    on.O(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.X(view2, (org.telegram.ui.Cells.a6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                knVar.setIconsColor(org.telegram.ui.ActionBar.g6.o7);
                knVar.b(new ag.c0(this, knVar, false, 7));
                k4Var = knVar;
                break;
            case 8:
                View fnVar = new fn(context, 0);
                fnVar.setTag(-33024);
                view = fnVar;
                k4Var = view;
                break;
            case 9:
                View h0Var = new cg.h0(this, context, 11);
                h0Var.setTag(-33024);
                view = h0Var;
                k4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.y5 y5Var = new org.telegram.ui.Cells.y5(context, c6Var);
                y5Var.getCheckBox().setIcon(R.drawable.permission_locked);
                k4Var = y5Var;
                break;
        }
        return org.telegram.ui.th.m(k4Var, k4Var, -1, -2);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        on onVar = this.d;
        bh.i iVar = onVar.h1;
        boolean z10 = onVar.n;
        int i10 = n1Var.f;
        View view = n1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
            a6Var.setTag(1);
            CharSequence charSequence = onVar.J;
            a6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
            a6Var.setTag(null);
            on.K(onVar, view, n1Var.b());
            return;
        }
        if (i10 == 11) {
            org.telegram.ui.Cells.a6 a6Var2 = (org.telegram.ui.Cells.a6) view;
            a6Var2.setTag(1);
            CharSequence charSequence2 = onVar.K;
            a6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
            a6Var2.setTag(null);
            a6Var2.e.a(iVar.b(-2), false);
            on.K(onVar, view, n1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.a6 a6Var3 = (org.telegram.ui.Cells.a6) view;
                a6Var3.setTag(1);
                CharSequence charSequence3 = onVar.L;
                a6Var3.n(charSequence3 != null ? charSequence3 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                a6Var3.setTag(null);
                if (!z10) {
                    a6Var3.e.a(iVar.b(-3), false);
                }
                on.K(onVar, view, n1Var.b());
                return;
            }
            return;
        }
        int b10 = n1Var.b();
        org.telegram.ui.Cells.a6 a6Var4 = (org.telegram.ui.Cells.a6) view;
        a6Var4.setTag(1);
        a6Var4.a.a(onVar.U, false);
        int i11 = b10 - onVar.p0;
        a6Var4.n(onVar.G[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        a6Var4.setTag(null);
        if (onVar.g0 == b10) {
            EditTextBoldCursor textView = a6Var4.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            onVar.g0 = -1;
        }
        if (!z10) {
            a6Var4.e.a(iVar.b(i11), false);
        }
        on.K(onVar, view, b10);
    }

    @Override // f2.p0
    public final void z(f2.n1 n1Var) {
        int i10 = n1Var.f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.a6) n1Var.a).getTextView();
            if (textView.isFocused()) {
                on onVar = this.d;
                if (onVar.E) {
                    en enVar = onVar.x;
                    if (enVar != null) {
                        enVar.f();
                    }
                    onVar.Z(true);
                }
                onVar.c1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

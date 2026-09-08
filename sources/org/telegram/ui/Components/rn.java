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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class rn extends kl0 {
    public final Context c;
    public final /* synthetic */ tn d;

    public rn(tn tnVar, Context context) {
        this.d = tnVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        tn tnVar = this.d;
        return b10 == tnVar.u0 || b10 == tnVar.G0 || b10 == tnVar.B0 || b10 == tnVar.F0 || b10 == tnVar.C0 || b10 == tnVar.H0 || b10 == tnVar.D0 || b10 == tnVar.E0 || b10 == tnVar.I0 || b10 == tnVar.J0 || b10 == tnVar.N0.b || b10 == tnVar.M0.b || b10 == tnVar.L0;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.Q0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        tn tnVar = this.d;
        if (i10 == tnVar.B0 || i10 == tnVar.F0 || i10 == tnVar.G0 || i10 == tnVar.C0 || i10 == tnVar.D0 || i10 == tnVar.E0 || i10 == tnVar.H0 || i10 == tnVar.M0.b || i10 == tnVar.N0.b) {
            return 10;
        }
        if (i10 == tnVar.l0 || i10 == tnVar.s0 || i10 == tnVar.w0 || i10 == tnVar.o0) {
            return 0;
        }
        if (i10 == tnVar.r0) {
            return 1;
        }
        if (i10 == tnVar.v0 || i10 == tnVar.x0 || i10 == tnVar.q0 || i10 == tnVar.K0) {
            return 2;
        }
        if (i10 == tnVar.u0 || i10 == tnVar.I0 || i10 == tnVar.L0) {
            return 3;
        }
        if (i10 == tnVar.m0) {
            return 4;
        }
        if (i10 == tnVar.n0) {
            return 11;
        }
        if (i10 == tnVar.p0) {
            return 7;
        }
        if (i10 == tnVar.y0 || i10 == tnVar.z0 || i10 == tnVar.J0) {
            return 6;
        }
        if (i10 == tnVar.A0) {
            return 8;
        }
        return i10 == 0 ? 9 : 5;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        tn tnVar = this.d;
        boolean z10 = tnVar.e0;
        c2.a aVar = tnVar.M0;
        c2.a aVar2 = tnVar.N0;
        org.telegram.ui.ActionBar.f6 f6Var = tnVar.a;
        boolean z11 = tnVar.n;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == tnVar.l0) {
                l4Var.getTextView().setGravity(19);
                l4Var.setText(LocaleController.getString(z11 ? R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 == tnVar.o0) {
                l4Var.getTextView().setGravity(19);
                l4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                return;
            }
            l4Var.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            if (i10 != tnVar.s0) {
                if (i10 == tnVar.w0) {
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
            if (i10 == tnVar.y0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), tnVar.f0, tnVar.z0 != -1);
                w8Var.e(null, true);
                return;
            } else if (i10 == tnVar.z0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), tnVar.g0, false);
                w8Var.e(null, true);
                return;
            } else {
                if (i10 == tnVar.J0) {
                    w8Var.f(LocaleController.getString(R.string.PollV2HideResults), tnVar.W, false);
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
            new oq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7)).w = true;
            if (i10 == tnVar.q0) {
                e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            if (i10 == tnVar.x0) {
                e9Var.setFixedSize(12);
                e9Var.setText(null);
                return;
            }
            int i12 = tnVar.J - tnVar.M;
            if (i12 <= 0) {
                e9Var.setText(LocaleController.getString(z11 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                return;
            }
            if (z11) {
                e9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i12));
                return;
            } else if (i10 == tnVar.K0) {
                e9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                return;
            } else {
                e9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i12, new Object[0])));
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (i10 == tnVar.L0) {
                String string = LocaleController.getString(R.string.PollV2AllowedCountries);
                ArrayList arrayList = tnVar.P0;
                r8Var.o(string, arrayList.isEmpty() ? LocaleController.getString(R.string.SearchCountriesSelect) : arrayList.size() == 1 ? LocaleController.getCountryName((String) arrayList.get(0)) : LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]), false, true);
                return;
            } else {
                if (i10 == tnVar.I0) {
                    tnVar.U(r8Var, false);
                    return;
                }
                r8Var.e(-1, org.telegram.ui.ActionBar.j6.il);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N6, f6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k7, f6Var), mode));
                r8Var.n(LocaleController.getString(z11 ? R.string.TodoNewTask : R.string.AddAnOption), new oq(drawable, drawable2), false);
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
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
        z5Var.setDivider(false);
        if (i10 == tnVar.B0) {
            z5Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !tnVar.a0);
        } else {
            if (i10 == tnVar.F0) {
                z5Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, tnVar.b0);
            } else if (i10 == tnVar.D0) {
                z5Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, tnVar.R);
            } else if (i10 == tnVar.C0) {
                z5Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, tnVar.T);
            } else if (i10 == tnVar.E0) {
                z5Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, tnVar.S);
            } else if (i10 == tnVar.G0) {
                z5Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, tnVar.c0);
            } else if (i10 == aVar2.b) {
                z5Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, aVar2.a);
            } else if (i10 == aVar.b) {
                z5Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, aVar.a);
            } else if (i10 == tnVar.H0) {
                z5Var.a(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), 8, R.drawable.filled_poll_deadline_24, (tnVar.U == 0 && tnVar.V == 0) ? false : true);
                z5Var = z5Var;
                z5Var.setDivider((tnVar.U == 0 && tnVar.V == 0) ? false : true);
            }
            z5Var = z5Var;
        }
        if (i10 == tnVar.G0) {
            z5Var.getCheckBox().a.a(z10, false);
            return;
        }
        if (i10 != tnVar.C0) {
            z5Var.getCheckBox().a.a(false, false);
            return;
        }
        Switch checkBox = z5Var.getCheckBox();
        if (!tnVar.c0 && !tnVar.a0) {
            z12 = false;
        }
        checkBox.a.a(z12, false);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [org.telegram.ui.Components.kn] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        View view;
        tn tnVar = this.d;
        boolean z10 = tnVar.n;
        org.telegram.ui.ActionBar.f6 f6Var = tnVar.a;
        Context context = this.c;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, tnVar.a);
                break;
            case 1:
                View a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                new oq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7)).w = true;
                l4Var = a7Var;
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.e9(context, f6Var);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.r8(context, f6Var);
                break;
            case 4:
            case 11:
                mn mnVar = new mn(this, this.c, tnVar.I ? 1 : 0, tnVar.a, i10);
                if (i10 == 11 && !z10) {
                    mnVar.setTextRight(98);
                    final int i11 = 0;
                    mnVar.a().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kn
                        public final /* synthetic */ rn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i11) {
                                case 0:
                                    tn.O(this.b.d, -2);
                                    break;
                                case 1:
                                    tn.O(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                mnVar.c();
                mnVar.setIconsColor(org.telegram.ui.ActionBar.j6.o7);
                mnVar.b(new nn(this, mnVar, i10));
                l4Var = mnVar;
                break;
            case 5:
            default:
                final int i12 = 2;
                qn qnVar = new qn(this, this.c, tnVar.I ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kn
                    public final /* synthetic */ rn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                tn.O(this.b.d, -2);
                                break;
                            case 1:
                                tn.O(this.b.d, -3);
                                break;
                            default:
                                this.b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                break;
                        }
                    }
                }, tnVar.a);
                if (!z10) {
                    qnVar.setTextRight(140);
                    qnVar.a().setOnClickListener(new org.telegram.ui.rf(23, this, qnVar));
                }
                int i13 = org.telegram.ui.ActionBar.j6.o7;
                qnVar.setIconsColor(i13);
                mp mpVar = qnVar.r;
                if (mpVar != null) {
                    mpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = mpVar.getCheckBoxBase();
                    float f7 = qnVar.a.e;
                    if (checkBoxBase.w != f7) {
                        checkBoxBase.w = f7;
                        checkBoxBase.b();
                    }
                }
                qnVar.getCheckBox().b(-1, i13, org.telegram.ui.ActionBar.j6.k7);
                qnVar.b(new pn(1, this, qnVar));
                qnVar.setShowNextButton(true);
                EditTextBoldCursor textView = qnVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.wd(2, this, qnVar));
                textView.setOnKeyListener(new ln(qnVar, 0));
                l4Var = qnVar;
                break;
            case 6:
                l4Var = new org.telegram.ui.Cells.w8(context, f6Var);
                break;
            case 7:
                on onVar = new on(this, context, tnVar.I ? 1 : 0);
                onVar.c();
                if (!z10) {
                    onVar.setTextRight(98);
                    final int i14 = 1;
                    onVar.a().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kn
                        public final /* synthetic */ rn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    tn.O(this.b.d, -2);
                                    break;
                                case 1:
                                    tn.O(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                onVar.setIconsColor(org.telegram.ui.ActionBar.j6.o7);
                onVar.b(new pn(0, this, onVar));
                l4Var = onVar;
                break;
            case 8:
                View jnVar = new jn(context, 0);
                jnVar.setTag(-33024);
                view = jnVar;
                l4Var = view;
                break;
            case 9:
                View ebVar = new di.eb(this, context, 14);
                ebVar.setTag(-33024);
                view = ebVar;
                l4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context, f6Var);
                z5Var.getCheckBox().setIcon(R.drawable.permission_locked);
                l4Var = z5Var;
                break;
        }
        return com.google.android.gms.internal.vision.e2.l(l4Var, l4Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        tn tnVar = this.d;
        rh.f fVar = tnVar.l1;
        boolean z10 = tnVar.n;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            CharSequence charSequence = tnVar.N;
            c6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
            c6Var.setTag(null);
            tn.L(tnVar, view, c1Var.b());
            return;
        }
        if (i10 == 11) {
            org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
            c6Var2.setTag(1);
            CharSequence charSequence2 = tnVar.O;
            c6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
            c6Var2.setTag(null);
            c6Var2.e.a(fVar.b(-2), false);
            tn.L(tnVar, view, c1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
                c6Var3.setTag(1);
                CharSequence charSequence3 = tnVar.P;
                c6Var3.n(charSequence3 != null ? charSequence3 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                c6Var3.setTag(null);
                if (!z10) {
                    c6Var3.e.a(fVar.b(-3), false);
                }
                tn.L(tnVar, view, c1Var.b());
                return;
            }
            return;
        }
        int b10 = c1Var.b();
        org.telegram.ui.Cells.c6 c6Var4 = (org.telegram.ui.Cells.c6) view;
        c6Var4.setTag(1);
        c6Var4.a.a(tnVar.b0, false);
        int i11 = b10 - tnVar.t0;
        c6Var4.n(tnVar.K[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        c6Var4.setTag(null);
        if (tnVar.k0 == b10) {
            EditTextBoldCursor textView = c6Var4.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            tnVar.k0 = -1;
        }
        if (!z10) {
            c6Var4.e.a(fVar.b(i11), false);
        }
        tn.L(tnVar, view, b10);
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) c1Var.a).getTextView();
            if (textView.isFocused()) {
                tn tnVar = this.d;
                if (tnVar.I) {
                    in inVar = tnVar.x;
                    if (inVar != null) {
                        inVar.f();
                    }
                    tnVar.Z(true);
                }
                tnVar.g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

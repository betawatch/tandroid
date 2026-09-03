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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class nn extends ql0 {
    public final Context c;
    public final /* synthetic */ pn d;

    public nn(pn pnVar, Context context) {
        this.d = pnVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        pn pnVar = this.d;
        return b10 == pnVar.r0 || b10 == pnVar.D0 || b10 == pnVar.y0 || b10 == pnVar.C0 || b10 == pnVar.z0 || b10 == pnVar.E0 || b10 == pnVar.A0 || b10 == pnVar.B0 || b10 == pnVar.F0 || b10 == pnVar.G0 || b10 == pnVar.K0.b || b10 == pnVar.J0.b || b10 == pnVar.I0;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.N0;
    }

    @Override // f2.o0
    public final int j(int i10) {
        pn pnVar = this.d;
        if (i10 == pnVar.y0 || i10 == pnVar.C0 || i10 == pnVar.D0 || i10 == pnVar.z0 || i10 == pnVar.A0 || i10 == pnVar.B0 || i10 == pnVar.E0 || i10 == pnVar.J0.b || i10 == pnVar.K0.b) {
            return 10;
        }
        if (i10 == pnVar.i0 || i10 == pnVar.p0 || i10 == pnVar.t0 || i10 == pnVar.l0) {
            return 0;
        }
        if (i10 == pnVar.o0) {
            return 1;
        }
        if (i10 == pnVar.s0 || i10 == pnVar.u0 || i10 == pnVar.n0 || i10 == pnVar.H0) {
            return 2;
        }
        if (i10 == pnVar.r0 || i10 == pnVar.F0 || i10 == pnVar.I0) {
            return 3;
        }
        if (i10 == pnVar.j0) {
            return 4;
        }
        if (i10 == pnVar.k0) {
            return 11;
        }
        if (i10 == pnVar.m0) {
            return 7;
        }
        if (i10 == pnVar.v0 || i10 == pnVar.w0 || i10 == pnVar.G0) {
            return 6;
        }
        if (i10 == pnVar.x0) {
            return 8;
        }
        return i10 == 0 ? 9 : 5;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        pn pnVar = this.d;
        boolean z4 = pnVar.b0;
        b7.l0 l0Var = pnVar.J0;
        b7.l0 l0Var2 = pnVar.K0;
        org.telegram.ui.ActionBar.f6 f6Var = pnVar.a;
        boolean z10 = pnVar.n;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == pnVar.i0) {
                l4Var.getTextView().setGravity(19);
                l4Var.setText(LocaleController.getString(z10 ? R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 == pnVar.l0) {
                l4Var.getTextView().setGravity(19);
                l4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                return;
            }
            l4Var.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            if (i10 != pnVar.p0) {
                if (i10 == pnVar.t0) {
                    l4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (z4) {
                l4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                l4Var.setText(LocaleController.getString(z10 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        boolean z11 = true;
        if (i11 == 6) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (i10 == pnVar.v0) {
                r8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), pnVar.c0, pnVar.w0 != -1);
                r8Var.e(null, true);
                return;
            } else if (i10 == pnVar.w0) {
                r8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), pnVar.d0, false);
                r8Var.e(null, true);
                return;
            } else {
                if (i10 == pnVar.G0) {
                    r8Var.f(LocaleController.getString(R.string.PollV2HideResults), pnVar.T, false);
                    r8Var.e(null, true);
                    return;
                }
                return;
            }
        }
        Context context = this.c;
        if (i11 == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            z8Var.setFixedSize(0);
            new mq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7)).w = true;
            if (i10 == pnVar.n0) {
                z8Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            if (i10 == pnVar.u0) {
                z8Var.setFixedSize(12);
                z8Var.setText(null);
                return;
            }
            int i12 = pnVar.G - pnVar.J;
            if (i12 <= 0) {
                z8Var.setText(LocaleController.getString(z10 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                return;
            }
            if (z10) {
                z8Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i12));
                return;
            } else if (i10 == pnVar.H0) {
                z8Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                return;
            } else {
                z8Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i12, new Object[0])));
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            if (i10 == pnVar.I0) {
                String string = LocaleController.getString(R.string.PollV2AllowedCountries);
                ArrayList arrayList = pnVar.M0;
                n8Var.o(string, arrayList.isEmpty() ? LocaleController.getString(R.string.SearchCountriesSelect) : arrayList.size() == 1 ? LocaleController.getCountryName((String) arrayList.get(0)) : LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]), false, true);
                return;
            } else {
                if (i10 == pnVar.F0) {
                    pnVar.U(n8Var, false);
                    return;
                }
                n8Var.e(-1, org.telegram.ui.ActionBar.j6.il);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N6, f6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k7, f6Var), mode));
                n8Var.n(LocaleController.getString(z10 ? R.string.TodoNewTask : R.string.AddAnOption), new mq(drawable, drawable2), false);
                n8Var.w = 20;
                n8Var.s = 58;
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
        if (i10 == pnVar.y0) {
            z5Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !pnVar.U);
        } else {
            if (i10 == pnVar.C0) {
                z5Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, pnVar.V);
            } else if (i10 == pnVar.A0) {
                z5Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, pnVar.O);
            } else if (i10 == pnVar.z0) {
                z5Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, pnVar.Q);
            } else if (i10 == pnVar.B0) {
                z5Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, pnVar.P);
            } else if (i10 == pnVar.D0) {
                z5Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, pnVar.W);
            } else if (i10 == l0Var2.b) {
                z5Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, l0Var2.a);
            } else if (i10 == l0Var.b) {
                z5Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, l0Var.a);
            } else if (i10 == pnVar.E0) {
                z5Var.a(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), 8, R.drawable.filled_poll_deadline_24, (pnVar.R == 0 && pnVar.S == 0) ? false : true);
                z5Var = z5Var;
                z5Var.setDivider((pnVar.R == 0 && pnVar.S == 0) ? false : true);
            }
            z5Var = z5Var;
        }
        if (i10 == pnVar.D0) {
            z5Var.getCheckBox().a.a(z4, false);
            return;
        }
        if (i10 != pnVar.z0) {
            z5Var.getCheckBox().a.a(false, false);
            return;
        }
        Switch checkBox = z5Var.getCheckBox();
        if (!pnVar.W && !pnVar.U) {
            z11 = false;
        }
        checkBox.a.a(z11, false);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [org.telegram.ui.Components.hn] */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        View view;
        pn pnVar = this.d;
        boolean z4 = pnVar.n;
        org.telegram.ui.ActionBar.f6 f6Var = pnVar.a;
        Context context = this.c;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, pnVar.a);
                break;
            case 1:
                View y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.b) null);
                new mq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7)).w = true;
                l4Var = y6Var;
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.z8(context, f6Var);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.n8(context, f6Var);
                break;
            case 4:
            case 11:
                jn jnVar = new jn(this, this.c, pnVar.F ? 1 : 0, pnVar.a, i10);
                if (i10 == 11 && !z4) {
                    jnVar.setTextRight(98);
                    final int i11 = 0;
                    jnVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hn
                        public final /* synthetic */ nn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i11) {
                                case 0:
                                    pn.O(this.b.d, -2);
                                    break;
                                case 1:
                                    pn.O(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.X(view2, (org.telegram.ui.Cells.b6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                jnVar.d();
                jnVar.setIconsColor(org.telegram.ui.ActionBar.j6.o7);
                jnVar.c(new kn(this, jnVar, i10));
                l4Var = jnVar;
                break;
            case 5:
            default:
                final int i12 = 2;
                mn mnVar = new mn(this, this.c, pnVar.F ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hn
                    public final /* synthetic */ nn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                pn.O(this.b.d, -2);
                                break;
                            case 1:
                                pn.O(this.b.d, -3);
                                break;
                            default:
                                this.b.d.X(view2, (org.telegram.ui.Cells.b6) view2.getParent(), true);
                                break;
                        }
                    }
                }, pnVar.a);
                if (!z4) {
                    mnVar.setTextRight(140);
                    mnVar.b().setOnClickListener(new w2(8, this, mnVar));
                }
                int i13 = org.telegram.ui.ActionBar.j6.o7;
                mnVar.setIconsColor(i13);
                kp kpVar = mnVar.r;
                if (kpVar != null) {
                    kpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = kpVar.getCheckBoxBase();
                    float f10 = mnVar.a.e;
                    if (checkBoxBase.w != f10) {
                        checkBoxBase.w = f10;
                        checkBoxBase.b();
                    }
                }
                mnVar.getCheckBox().b(-1, i13, org.telegram.ui.ActionBar.j6.k7);
                mnVar.c(new cg.b0(this, mnVar, false, 8));
                mnVar.setShowNextButton(true);
                EditTextBoldCursor textView = mnVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.ae(2, this, mnVar));
                textView.setOnKeyListener(new in(mnVar, 0));
                l4Var = mnVar;
                break;
            case 6:
                l4Var = new org.telegram.ui.Cells.r8(context, f6Var);
                break;
            case 7:
                ln lnVar = new ln(this, context, pnVar.F ? 1 : 0);
                lnVar.d();
                if (!z4) {
                    lnVar.setTextRight(98);
                    final int i14 = 1;
                    lnVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hn
                        public final /* synthetic */ nn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    pn.O(this.b.d, -2);
                                    break;
                                case 1:
                                    pn.O(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.X(view2, (org.telegram.ui.Cells.b6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                lnVar.setIconsColor(org.telegram.ui.ActionBar.j6.o7);
                lnVar.c(new cg.b0(this, lnVar, false, 7));
                l4Var = lnVar;
                break;
            case 8:
                View gnVar = new gn(context, 0);
                gnVar.setTag(-33024);
                view = gnVar;
                l4Var = view;
                break;
            case 9:
                View h0Var = new eg.h0(this, context, 9);
                h0Var.setTag(-33024);
                view = h0Var;
                l4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context, f6Var);
                z5Var.getCheckBox().setIcon(R.drawable.permission_locked);
                l4Var = z5Var;
                break;
        }
        return org.telegram.ui.ai.n(l4Var, l4Var, -1, -2);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        pn pnVar = this.d;
        dh.i iVar = pnVar.i1;
        boolean z4 = pnVar.n;
        int i10 = l1Var.f;
        View view = l1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view;
            b6Var.setTag(1);
            CharSequence charSequence = pnVar.K;
            b6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z4 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
            b6Var.setTag(null);
            pn.K(pnVar, view, l1Var.b());
            return;
        }
        if (i10 == 11) {
            org.telegram.ui.Cells.b6 b6Var2 = (org.telegram.ui.Cells.b6) view;
            b6Var2.setTag(1);
            CharSequence charSequence2 = pnVar.L;
            b6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
            b6Var2.setTag(null);
            b6Var2.e.a(iVar.b(-2), false);
            pn.K(pnVar, view, l1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.b6 b6Var3 = (org.telegram.ui.Cells.b6) view;
                b6Var3.setTag(1);
                CharSequence charSequence3 = pnVar.M;
                b6Var3.n(charSequence3 != null ? charSequence3 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                b6Var3.setTag(null);
                if (!z4) {
                    b6Var3.e.a(iVar.b(-3), false);
                }
                pn.K(pnVar, view, l1Var.b());
                return;
            }
            return;
        }
        int b10 = l1Var.b();
        org.telegram.ui.Cells.b6 b6Var4 = (org.telegram.ui.Cells.b6) view;
        b6Var4.setTag(1);
        b6Var4.a.a(pnVar.V, false);
        int i11 = b10 - pnVar.q0;
        b6Var4.n(pnVar.H[i11], LocaleController.getString(z4 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        b6Var4.setTag(null);
        if (pnVar.h0 == b10) {
            EditTextBoldCursor textView = b6Var4.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            pnVar.h0 = -1;
        }
        if (!z4) {
            b6Var4.e.a(iVar.b(i11), false);
        }
        pn.K(pnVar, view, b10);
    }

    @Override // f2.o0
    public final void z(f2.l1 l1Var) {
        int i10 = l1Var.f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.b6) l1Var.a).getTextView();
            if (textView.isFocused()) {
                pn pnVar = this.d;
                if (pnVar.F) {
                    fn fnVar = pnVar.x;
                    if (fnVar != null) {
                        fnVar.f();
                    }
                    pnVar.Z(true);
                }
                pnVar.d1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

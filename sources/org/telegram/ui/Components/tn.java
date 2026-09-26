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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class tn extends vl0 {
    public final Context c;
    public final /* synthetic */ vn d;

    public tn(vn vnVar, Context context) {
        this.d = vnVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        vn vnVar = this.d;
        return b10 == vnVar.u0 || b10 == vnVar.G0 || b10 == vnVar.B0 || b10 == vnVar.F0 || b10 == vnVar.C0 || b10 == vnVar.H0 || b10 == vnVar.D0 || b10 == vnVar.E0 || b10 == vnVar.I0 || b10 == vnVar.J0 || b10 == vnVar.N0.b || b10 == vnVar.M0.b || b10 == vnVar.L0;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.Q0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        vn vnVar = this.d;
        if (i10 == vnVar.B0 || i10 == vnVar.F0 || i10 == vnVar.G0 || i10 == vnVar.C0 || i10 == vnVar.D0 || i10 == vnVar.E0 || i10 == vnVar.H0 || i10 == vnVar.M0.b || i10 == vnVar.N0.b) {
            return 10;
        }
        if (i10 == vnVar.l0 || i10 == vnVar.s0 || i10 == vnVar.w0 || i10 == vnVar.o0) {
            return 0;
        }
        if (i10 == vnVar.r0) {
            return 1;
        }
        if (i10 == vnVar.v0 || i10 == vnVar.x0 || i10 == vnVar.q0 || i10 == vnVar.K0) {
            return 2;
        }
        if (i10 == vnVar.u0 || i10 == vnVar.I0 || i10 == vnVar.L0) {
            return 3;
        }
        if (i10 == vnVar.m0) {
            return 4;
        }
        if (i10 == vnVar.n0) {
            return 11;
        }
        if (i10 == vnVar.p0) {
            return 7;
        }
        if (i10 == vnVar.y0 || i10 == vnVar.z0 || i10 == vnVar.J0) {
            return 6;
        }
        if (i10 == vnVar.A0) {
            return 8;
        }
        return i10 == 0 ? 9 : 5;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        vn vnVar = this.d;
        boolean z10 = vnVar.e0;
        c2.a aVar = vnVar.M0;
        c2.a aVar2 = vnVar.N0;
        org.telegram.ui.ActionBar.d6 d6Var = vnVar.a;
        boolean z11 = vnVar.n;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == vnVar.l0) {
                m4Var.getTextView().setGravity(19);
                m4Var.setText(LocaleController.getString(z11 ? R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 == vnVar.o0) {
                m4Var.getTextView().setGravity(19);
                m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                return;
            }
            m4Var.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            if (i10 != vnVar.s0) {
                if (i10 == vnVar.w0) {
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
            if (i10 == vnVar.y0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), vnVar.f0, vnVar.z0 != -1);
                w8Var.e(null, true);
                return;
            } else if (i10 == vnVar.z0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), vnVar.g0, false);
                w8Var.e(null, true);
                return;
            } else {
                if (i10 == vnVar.J0) {
                    w8Var.f(LocaleController.getString(R.string.PollV2HideResults), vnVar.W, false);
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
            new qq(new ColorDrawable(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.a7, d6Var)), org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7)).w = true;
            if (i10 == vnVar.q0) {
                e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            if (i10 == vnVar.x0) {
                e9Var.setFixedSize(12);
                e9Var.setText(null);
                return;
            }
            int i12 = vnVar.J - vnVar.M;
            if (i12 <= 0) {
                e9Var.setText(LocaleController.getString(z11 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                return;
            }
            if (z11) {
                e9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i12));
                return;
            } else if (i10 == vnVar.K0) {
                e9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                return;
            } else {
                e9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i12, new Object[0])));
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (i10 == vnVar.L0) {
                String string = LocaleController.getString(R.string.PollV2AllowedCountries);
                ArrayList arrayList = vnVar.P0;
                r8Var.o(string, arrayList.isEmpty() ? LocaleController.getString(R.string.SearchCountriesSelect) : arrayList.size() == 1 ? LocaleController.getCountryName((String) arrayList.get(0)) : LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]), false, true);
                return;
            } else {
                if (i10 == vnVar.I0) {
                    vnVar.U(r8Var, false);
                    return;
                }
                r8Var.e(-1, org.telegram.ui.ActionBar.h6.il);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.N6, d6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.k7, d6Var), mode));
                r8Var.n(LocaleController.getString(z11 ? R.string.TodoNewTask : R.string.AddAnOption), new qq(drawable, drawable2), false);
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
        if (i10 == vnVar.B0) {
            a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !vnVar.a0);
        } else {
            if (i10 == vnVar.F0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, vnVar.b0);
            } else if (i10 == vnVar.D0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, vnVar.R);
            } else if (i10 == vnVar.C0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, vnVar.T);
            } else if (i10 == vnVar.E0) {
                a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, vnVar.S);
            } else if (i10 == vnVar.G0) {
                a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, vnVar.c0);
            } else if (i10 == aVar2.b) {
                a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, aVar2.a);
            } else if (i10 == aVar.b) {
                a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, aVar.a);
            } else if (i10 == vnVar.H0) {
                a6Var.a(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), 8, R.drawable.filled_poll_deadline_24, (vnVar.U == 0 && vnVar.V == 0) ? false : true);
                a6Var = a6Var;
                a6Var.setDivider((vnVar.U == 0 && vnVar.V == 0) ? false : true);
            }
            a6Var = a6Var;
        }
        if (i10 == vnVar.G0) {
            a6Var.getCheckBox().a.a(z10, false);
            return;
        }
        if (i10 != vnVar.C0) {
            a6Var.getCheckBox().a.a(false, false);
            return;
        }
        Switch checkBox = a6Var.getCheckBox();
        if (!vnVar.c0 && !vnVar.a0) {
            z12 = false;
        }
        checkBox.a.a(z12, false);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [org.telegram.ui.Components.mn] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        View view;
        vn vnVar = this.d;
        boolean z10 = vnVar.n;
        org.telegram.ui.ActionBar.d6 d6Var = vnVar.a;
        Context context = this.c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.h6.L6, 21, 15, false, vnVar.a);
                break;
            case 1:
                View b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                new qq(new ColorDrawable(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.a7, d6Var)), org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.b7)).w = true;
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
                on onVar = new on(this, this.c, vnVar.I ? 1 : 0, vnVar.a, i10);
                if (i10 == 11 && !z10) {
                    onVar.setTextRight(98);
                    final int i11 = 0;
                    onVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mn
                        public final /* synthetic */ tn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i11) {
                                case 0:
                                    vn.O(this.b.d, -2);
                                    break;
                                case 1:
                                    vn.O(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.X(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                onVar.d();
                onVar.setIconsColor(org.telegram.ui.ActionBar.h6.o7);
                onVar.c(new pn(this, onVar, i10));
                m4Var = onVar;
                break;
            case 5:
            default:
                final int i12 = 2;
                sn snVar = new sn(this, this.c, vnVar.I ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mn
                    public final /* synthetic */ tn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                vn.O(this.b.d, -2);
                                break;
                            case 1:
                                vn.O(this.b.d, -3);
                                break;
                            default:
                                this.b.d.X(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                break;
                        }
                    }
                }, vnVar.a);
                if (!z10) {
                    snVar.setTextRight(140);
                    snVar.b().setOnClickListener(new org.telegram.ui.pf(23, this, snVar));
                }
                int i13 = org.telegram.ui.ActionBar.h6.o7;
                snVar.setIconsColor(i13);
                op opVar = snVar.r;
                if (opVar != null) {
                    opVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = opVar.getCheckBoxBase();
                    float f7 = snVar.a.e;
                    if (checkBoxBase.w != f7) {
                        checkBoxBase.w = f7;
                        checkBoxBase.b();
                    }
                }
                snVar.getCheckBox().b(-1, i13, org.telegram.ui.ActionBar.h6.k7);
                snVar.c(new rn(1, this, snVar));
                snVar.setShowNextButton(true);
                EditTextBoldCursor textView = snVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.vd(2, this, snVar));
                textView.setOnKeyListener(new nn(snVar, 0));
                m4Var = snVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.w8(context, d6Var);
                break;
            case 7:
                qn qnVar = new qn(this, context, vnVar.I ? 1 : 0);
                qnVar.d();
                if (!z10) {
                    qnVar.setTextRight(98);
                    final int i14 = 1;
                    qnVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mn
                        public final /* synthetic */ tn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    vn.O(this.b.d, -2);
                                    break;
                                case 1:
                                    vn.O(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.X(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                qnVar.setIconsColor(org.telegram.ui.ActionBar.h6.o7);
                qnVar.c(new rn(0, this, qnVar));
                m4Var = qnVar;
                break;
            case 8:
                View lnVar = new ln(context, 0);
                lnVar.setTag(-33024);
                view = lnVar;
                m4Var = view;
                break;
            case 9:
                View bbVar = new ci.bb(this, context, 14);
                bbVar.setTag(-33024);
                view = bbVar;
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
        vn vnVar = this.d;
        qh.f fVar = vnVar.l1;
        boolean z10 = vnVar.n;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            CharSequence charSequence = vnVar.N;
            d6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
            d6Var.setTag(null);
            vn.L(vnVar, view, c1Var.b());
            return;
        }
        if (i10 == 11) {
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            CharSequence charSequence2 = vnVar.O;
            d6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
            d6Var2.setTag(null);
            d6Var2.e.a(fVar.b(-2), false);
            vn.L(vnVar, view, c1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
                d6Var3.setTag(1);
                CharSequence charSequence3 = vnVar.P;
                d6Var3.n(charSequence3 != null ? charSequence3 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                d6Var3.setTag(null);
                if (!z10) {
                    d6Var3.e.a(fVar.b(-3), false);
                }
                vn.L(vnVar, view, c1Var.b());
                return;
            }
            return;
        }
        int b10 = c1Var.b();
        org.telegram.ui.Cells.d6 d6Var4 = (org.telegram.ui.Cells.d6) view;
        d6Var4.setTag(1);
        d6Var4.a.a(vnVar.b0, false);
        int i11 = b10 - vnVar.t0;
        d6Var4.n(vnVar.K[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        d6Var4.setTag(null);
        if (vnVar.k0 == b10) {
            EditTextBoldCursor textView = d6Var4.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            vnVar.k0 = -1;
        }
        if (!z10) {
            d6Var4.e.a(fVar.b(i11), false);
        }
        vn.L(vnVar, view, b10);
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) c1Var.a).getTextView();
            if (textView.isFocused()) {
                vn vnVar = this.d;
                if (vnVar.I) {
                    kn knVar = vnVar.x;
                    if (knVar != null) {
                        knVar.f();
                    }
                    vnVar.Z(true);
                }
                vnVar.g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

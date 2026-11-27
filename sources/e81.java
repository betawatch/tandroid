// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class e81 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ g81 b;

    public e81(g81 g81Var, Context context) {
        this.b = g81Var;
        this.a = context;
    }

    public final h81 a(float f, float f2) {
        h81 h81Var;
        g81 g81Var = this.b;
        if (g81Var.n != null) {
            int i = g81Var.e;
            float measuredWidth = g81Var.getMeasuredWidth() / 7.0f;
            float L = hl.L(52.0f);
            int L2 = hl.L(44.0f) / 2;
            int i2 = 0;
            for (int i3 = 0; i3 < g81Var.d; i3++) {
                float f3 = (measuredWidth / 2.0f) + (i * measuredWidth);
                float L3 = (L / 2.0f) + (i2 * L) + hl.L(44.0f);
                float f4 = L2;
                if (f >= f3 - f4 && f <= f3 + f4 && f2 >= L3 - f4 && f2 <= L3 + f4 && (h81Var = (h81) g81Var.n.get(i3, null)) != null) {
                    return h81Var;
                }
                i++;
                if (i >= 7) {
                    i2++;
                    i = 0;
                }
            }
        }
        return null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        final h81 a;
        wk5 wk5Var;
        super.onLongPress(motionEvent);
        g81 g81Var = this.b;
        j81 j81Var = g81Var.y;
        if (j81Var.f0 != 0 || hl.O1() || (a = a(motionEvent.getX(), motionEvent.getY())) == null) {
            return;
        }
        final byte b = 0;
        try {
            g81Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        Bundle bundle = new Bundle();
        long j = j81Var.y;
        if (j > 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putInt("start_from_date", a.h);
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        zu1 zu1Var = new zu1(bundle);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, j81Var.getResourceProvider(), j81Var.getParentActivity());
        yob.h(aob.G8, j81Var.getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
        final byte b2 = 1;
        b8 b8Var = new b8(j81Var.getParentActivity(), true, false);
        b8Var.j(ob6.M0(2131748819, null), R.drawable.msg_message, null);
        b8Var.setMinimumWidth(jn7.p2);
        b8Var.setOnClickListener(new View.OnClickListener(this) { // from class: c81
            public final /* synthetic */ e81 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wk5 wk5Var2;
                wk5 wk5Var3;
                wk5 wk5Var4;
                wk5 wk5Var5;
                byte b3 = b;
                h81 h81Var = a;
                e81 e81Var = this.b;
                switch (b3) {
                    case 0:
                        j81 j81Var2 = e81Var.b.y;
                        wk5Var2 = ((e) j81Var2).parentLayout;
                        if (wk5Var2 != null) {
                            wk5Var3 = ((e) j81Var2).parentLayout;
                            if (wk5Var3.getFragmentStack().size() >= 3) {
                                wk5Var4 = ((e) j81Var2).parentLayout;
                                List fragmentStack = wk5Var4.getFragmentStack();
                                wk5Var5 = ((e) j81Var2).parentLayout;
                                e eVar = (e) fragmentStack.get(wk5Var5.getFragmentStack().size() - 3);
                                if (eVar instanceof zu1) {
                                    hl.d3(new tu0(e81Var, (zu1) eVar, h81Var, (byte) 12), 300L);
                                }
                            }
                        }
                        j81Var2.finishPreviewFragment();
                        break;
                    default:
                        j81 j81Var3 = e81Var.b.y;
                        int i = h81Var.h;
                        j81Var3.R = i;
                        j81Var3.Q = i;
                        j81Var3.H = true;
                        j81Var3.B0();
                        j81Var3.r0();
                        j81Var3.finishPreviewFragment();
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var);
        if (j81Var.e0) {
            b8 b8Var2 = new b8(j81Var.getParentActivity(), false, false);
            b8Var2.j(ob6.M0(2131745378, null), R.drawable.msg_select, null);
            b8Var2.setMinimumWidth(jn7.p2);
            b8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: c81
                public final /* synthetic */ e81 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wk5 wk5Var2;
                    wk5 wk5Var3;
                    wk5 wk5Var4;
                    wk5 wk5Var5;
                    byte b3 = b2;
                    h81 h81Var = a;
                    e81 e81Var = this.b;
                    switch (b3) {
                        case 0:
                            j81 j81Var2 = e81Var.b.y;
                            wk5Var2 = ((e) j81Var2).parentLayout;
                            if (wk5Var2 != null) {
                                wk5Var3 = ((e) j81Var2).parentLayout;
                                if (wk5Var3.getFragmentStack().size() >= 3) {
                                    wk5Var4 = ((e) j81Var2).parentLayout;
                                    List fragmentStack = wk5Var4.getFragmentStack();
                                    wk5Var5 = ((e) j81Var2).parentLayout;
                                    e eVar = (e) fragmentStack.get(wk5Var5.getFragmentStack().size() - 3);
                                    if (eVar instanceof zu1) {
                                        hl.d3(new tu0(e81Var, (zu1) eVar, h81Var, (byte) 12), 300L);
                                    }
                                }
                            }
                            j81Var2.finishPreviewFragment();
                            break;
                        default:
                            j81 j81Var3 = e81Var.b.y;
                            int i = h81Var.h;
                            j81Var3.R = i;
                            j81Var3.Q = i;
                            j81Var3.H = true;
                            j81Var3.B0();
                            j81Var3.r0();
                            j81Var3.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var2);
            b8 b8Var3 = new b8(j81Var.getParentActivity(), false, true);
            b8Var3.j(ob6.M0(2131752054, null), R.drawable.msg_delete, null);
            b8Var3.setMinimumWidth(jn7.p2);
            b8Var3.setOnClickListener(new View.OnClickListener(this) { // from class: d81
                public final /* synthetic */ e81 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wk5 wk5Var2;
                    wk5 wk5Var3;
                    wk5 wk5Var4;
                    byte b3 = b;
                    e81 e81Var = this.b;
                    switch (b3) {
                        case 0:
                            j81 j81Var2 = e81Var.b.y;
                            wk5Var2 = ((e) j81Var2).parentLayout;
                            if (wk5Var2.getFragmentStack().size() >= 3) {
                                wk5Var3 = ((e) j81Var2).parentLayout;
                                List fragmentStack = wk5Var3.getFragmentStack();
                                wk5Var4 = ((e) j81Var2).parentLayout;
                                e eVar = (e) fragmentStack.get(wk5Var4.getFragmentStack().size() - 3);
                                if (eVar instanceof zu1) {
                                    jj.q(j81Var2, 1, j81Var2.getMessagesController().X1(Long.valueOf(j81Var2.y)), null, false, new lh2(e81Var, (zu1) eVar, false, (byte) 13), null);
                                }
                            }
                            j81Var2.finishPreviewFragment();
                            break;
                        default:
                            e81Var.b.y.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var3);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        j81Var.w = new tb((byte) 4, this.a, this);
        j81Var.w.setOnClickListener(new View.OnClickListener(this) { // from class: d81
            public final /* synthetic */ e81 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wk5 wk5Var2;
                wk5 wk5Var3;
                wk5 wk5Var4;
                byte b3 = b2;
                e81 e81Var = this.b;
                switch (b3) {
                    case 0:
                        j81 j81Var2 = e81Var.b.y;
                        wk5Var2 = ((e) j81Var2).parentLayout;
                        if (wk5Var2.getFragmentStack().size() >= 3) {
                            wk5Var3 = ((e) j81Var2).parentLayout;
                            List fragmentStack = wk5Var3.getFragmentStack();
                            wk5Var4 = ((e) j81Var2).parentLayout;
                            e eVar = (e) fragmentStack.get(wk5Var4.getFragmentStack().size() - 3);
                            if (eVar instanceof zu1) {
                                jj.q(j81Var2, 1, j81Var2.getMessagesController().X1(Long.valueOf(j81Var2.y)), null, false, new lh2(e81Var, (zu1) eVar, false, (byte) 13), null);
                            }
                        }
                        j81Var2.finishPreviewFragment();
                        break;
                    default:
                        e81Var.b.y.finishPreviewFragment();
                        break;
                }
            }
        });
        j81Var.w.setVisibility(8);
        j81Var.w.setFitsSystemWindows(true);
        wk5Var = ((e) j81Var).parentLayout;
        wk5Var.getOverlayContainerView().addView(j81Var.w, tre.c(-1.0f, -1));
        j81Var.x0();
        j81Var.presentFragmentAsPreviewWithMenu(zu1Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        wk5 wk5Var;
        wk5 wk5Var2;
        wk5 wk5Var3;
        wk5 wk5Var4;
        wk5 wk5Var5;
        h81 a;
        r47 r47Var;
        k09 k09Var;
        g81 g81Var = this.b;
        j81 j81Var = g81Var.y;
        wk5Var = ((e) j81Var).parentLayout;
        if (wk5Var != null) {
            if (((j81Var.f0 == 1 && g81Var.n != null) || j81Var.g0 != null) && (a = a(motionEvent.getX(), motionEvent.getY())) != null && (r47Var = a.a) != null && (k09Var = j81Var.N) != null) {
                if (j81Var.g0 != null) {
                    lcb orCreateStoryViewer = j81Var.getOrCreateStoryViewer();
                    Context context = g81Var.getContext();
                    r47 r47Var2 = a.a;
                    TL_stories.StoryItem storyItem = r47Var2.l;
                    int e1 = r47Var2.e1();
                    u5b u5bVar = j81Var.g0;
                    z8d z8dVar = j81Var.h0;
                    orCreateStoryViewer.h = yac.t0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(u5bVar.d));
                    orCreateStoryViewer.P0 = e1;
                    orCreateStoryViewer.K(context, storyItem, arrayList, 0, u5bVar, null, z8dVar, true);
                } else {
                    int e12 = r47Var.e1();
                    int i = a.c;
                    eja ejaVar = (eja) k09Var.b;
                    tia[] tiaVarArr = ejaVar.w1;
                    int i2 = -1;
                    for (int i3 = 0; i3 < tiaVarArr[0].a.size(); i3++) {
                        if (((r47) tiaVarArr[0].a.get(i3)).e1() == e12) {
                            i2 = i3;
                        }
                    }
                    zha P = ejaVar.P(0);
                    if (i2 < 0 || P == null) {
                        ejaVar.v0(0, e12, i, true);
                    } else {
                        P.x.g1(i2, 0);
                    }
                    if (P != null) {
                        P.J = e12;
                        P.K = false;
                    }
                    j81Var.finishFragment();
                }
            }
            if (g81Var.n != null) {
                if (j81Var.H) {
                    h81 a2 = a(motionEvent.getX(), motionEvent.getY());
                    if (a2 != null) {
                        ValueAnimator valueAnimator = j81Var.S;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            j81Var.S = null;
                        }
                        int i4 = j81Var.Q;
                        if (i4 == 0 && j81Var.R == 0) {
                            int i5 = a2.h;
                            j81Var.R = i5;
                            j81Var.Q = i5;
                        } else {
                            int i6 = a2.h;
                            int i7 = j81Var.R;
                            if (i4 == i6) {
                                if (i7 == i6) {
                                    j81Var.R = 0;
                                    j81Var.Q = 0;
                                } else {
                                    j81Var.Q = i7;
                                }
                            } else if (i7 == i6) {
                                j81Var.R = i4;
                            } else if (i4 != i7) {
                                j81Var.R = i6;
                                j81Var.Q = i6;
                            } else if (i6 > i7) {
                                j81Var.R = i6;
                            } else {
                                j81Var.Q = i6;
                            }
                        }
                        j81Var.B0();
                        j81Var.r0();
                        return false;
                    }
                } else {
                    h81 a3 = a(motionEvent.getX(), motionEvent.getY());
                    if (a3 != null) {
                        wk5Var2 = ((e) j81Var).parentLayout;
                        if (wk5Var2 != null) {
                            wk5Var3 = ((e) j81Var).parentLayout;
                            if (wk5Var3.getFragmentStack().size() >= 2) {
                                wk5Var4 = ((e) j81Var).parentLayout;
                                List fragmentStack = wk5Var4.getFragmentStack();
                                wk5Var5 = ((e) j81Var).parentLayout;
                                e eVar = (e) fragmentStack.get(wk5Var5.getFragmentStack().size() - 2);
                                if (eVar instanceof zu1) {
                                    j81Var.finishFragment();
                                    ((zu1) eVar).m8(a3.h);
                                    return false;
                                }
                            }
                        }
                    }
                    if (a3 != null && j81Var.O != null) {
                        j81Var.finishFragment();
                        j81Var.O.m8(a3.h);
                    }
                }
            }
        }
        return false;
    }
}

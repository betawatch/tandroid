package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class c8 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ e8 b;

    public c8(e8 e8Var, Context context) {
        this.b = e8Var;
        this.a = context;
    }

    public final f8 a(float f7, float f10) {
        f8 f8Var;
        e8 e8Var = this.b;
        if (e8Var.n == null) {
            return null;
        }
        int i10 = e8Var.e;
        float measuredWidth = e8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < e8Var.d; i12++) {
            float f11 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f12 = dp2;
            if (f7 >= f11 - f12 && f7 <= f11 + f12 && f10 >= dp3 - f12 && f10 <= dp3 + f12 && (f8Var = (f8) e8Var.n.get(i12, null)) != null) {
                return f8Var;
            }
            i10++;
            if (i10 >= 7) {
                i11++;
                i10 = 0;
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
        final f8 a2;
        org.telegram.ui.ActionBar.d5 d5Var;
        super.onLongPress(motionEvent);
        e8 e8Var = this.b;
        h8 h8Var = e8Var.x;
        if (h8Var.e0 != 0 || AndroidUtilities.isTablet() || (a2 = a(motionEvent.getX(), motionEvent.getY())) == null) {
            return;
        }
        try {
            e8Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        Bundle bundle = new Bundle();
        long j3 = h8Var.x;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("start_from_date", a2.h);
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        co coVar = new co(bundle);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, h8Var.getParentActivity(), h8Var.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(h8Var.getParentActivity(), true, false);
        f1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
        f1Var.setMinimumWidth(160);
        final int i10 = 0;
        f1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z7
            public final /* synthetic */ c8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d5 d5Var2;
                org.telegram.ui.ActionBar.d5 d5Var3;
                org.telegram.ui.ActionBar.d5 d5Var4;
                org.telegram.ui.ActionBar.d5 d5Var5;
                switch (i10) {
                    case 0:
                        c8 c8Var = this.b;
                        h8 h8Var2 = c8Var.b.x;
                        d5Var2 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                        if (d5Var2 != null) {
                            d5Var3 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                            if (d5Var3.getFragmentStack().size() >= 3) {
                                d5Var4 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                List fragmentStack = d5Var4.getFragmentStack();
                                d5Var5 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var5.getFragmentStack().size() - 3);
                                if (n2Var instanceof co) {
                                    AndroidUtilities.runOnUIThread(new r1(c8Var, (co) n2Var, a2, 5), 300L);
                                }
                            }
                        }
                        h8Var2.finishPreviewFragment();
                        break;
                    default:
                        e8 e8Var2 = this.b.b;
                        h8 h8Var3 = e8Var2.x;
                        int i11 = a2.h;
                        h8Var3.Q = i11;
                        h8Var3.P = i11;
                        h8Var3.G = true;
                        h8Var3.t0();
                        h8 h8Var4 = e8Var2.x;
                        h8Var4.o0();
                        h8Var4.finishPreviewFragment();
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
        if (h8Var.d0) {
            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(h8Var.getParentActivity(), false, false);
            f1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
            f1Var2.setMinimumWidth(160);
            final int i11 = 1;
            f1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z7
                public final /* synthetic */ c8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.d5 d5Var2;
                    org.telegram.ui.ActionBar.d5 d5Var3;
                    org.telegram.ui.ActionBar.d5 d5Var4;
                    org.telegram.ui.ActionBar.d5 d5Var5;
                    switch (i11) {
                        case 0:
                            c8 c8Var = this.b;
                            h8 h8Var2 = c8Var.b.x;
                            d5Var2 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                            if (d5Var2 != null) {
                                d5Var3 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                if (d5Var3.getFragmentStack().size() >= 3) {
                                    d5Var4 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                    List fragmentStack = d5Var4.getFragmentStack();
                                    d5Var5 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var5.getFragmentStack().size() - 3);
                                    if (n2Var instanceof co) {
                                        AndroidUtilities.runOnUIThread(new r1(c8Var, (co) n2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            h8Var2.finishPreviewFragment();
                            break;
                        default:
                            e8 e8Var2 = this.b.b;
                            h8 h8Var3 = e8Var2.x;
                            int i112 = a2.h;
                            h8Var3.Q = i112;
                            h8Var3.P = i112;
                            h8Var3.G = true;
                            h8Var3.t0();
                            h8 h8Var4 = e8Var2.x;
                            h8Var4.o0();
                            h8Var4.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
            org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(h8Var.getParentActivity(), false, true);
            f1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
            f1Var3.setMinimumWidth(160);
            final int i12 = 0;
            f1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a8
                public final /* synthetic */ c8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.d5 d5Var2;
                    org.telegram.ui.ActionBar.d5 d5Var3;
                    org.telegram.ui.ActionBar.d5 d5Var4;
                    switch (i12) {
                        case 0:
                            c8 c8Var = this.b;
                            h8 h8Var2 = c8Var.b.x;
                            d5Var2 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                            if (d5Var2.getFragmentStack().size() >= 3) {
                                d5Var3 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                List fragmentStack = d5Var3.getFragmentStack();
                                d5Var4 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var4.getFragmentStack().size() - 3);
                                if (n2Var instanceof co) {
                                    org.telegram.ui.Components.e5.r(h8Var2, 1, h8Var2.getMessagesController().getUser(Long.valueOf(h8Var2.x)), null, false, new b8(c8Var, (co) n2Var), null);
                                }
                            }
                            h8Var2.finishPreviewFragment();
                            break;
                        default:
                            this.b.b.x.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var3);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        h8Var.v = new di.eb(this, this.a, 10);
        final int i13 = 1;
        h8Var.v.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a8
            public final /* synthetic */ c8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.d5 d5Var2;
                org.telegram.ui.ActionBar.d5 d5Var3;
                org.telegram.ui.ActionBar.d5 d5Var4;
                switch (i13) {
                    case 0:
                        c8 c8Var = this.b;
                        h8 h8Var2 = c8Var.b.x;
                        d5Var2 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                        if (d5Var2.getFragmentStack().size() >= 3) {
                            d5Var3 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                            List fragmentStack = d5Var3.getFragmentStack();
                            d5Var4 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var4.getFragmentStack().size() - 3);
                            if (n2Var instanceof co) {
                                org.telegram.ui.Components.e5.r(h8Var2, 1, h8Var2.getMessagesController().getUser(Long.valueOf(h8Var2.x)), null, false, new b8(c8Var, (co) n2Var), null);
                            }
                        }
                        h8Var2.finishPreviewFragment();
                        break;
                    default:
                        this.b.b.x.finishPreviewFragment();
                        break;
                }
            }
        });
        h8Var.v.setVisibility(8);
        h8Var.v.setFitsSystemWindows(true);
        d5Var = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
        d5Var.getOverlayContainerView().addView(h8Var.v, w7.x5.c(-1.0f, -1));
        h8.b0(h8Var);
        h8Var.presentFragmentAsPreviewWithMenu(coVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        org.telegram.ui.ActionBar.d5 d5Var4;
        org.telegram.ui.ActionBar.d5 d5Var5;
        f8 a2;
        MessageObject messageObject;
        l.d dVar;
        e8 e8Var = this.b;
        h8 h8Var = e8Var.x;
        d5Var = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
        if (d5Var != null) {
            if (((h8Var.e0 == 1 && e8Var.n != null) || h8Var.f0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.a) != null && (dVar = h8Var.M) != null) {
                if (h8Var.f0 != null) {
                    bi.pb orCreateStoryViewer = h8Var.getOrCreateStoryViewer();
                    Context context = e8Var.getContext();
                    MessageObject messageObject2 = a2.a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    bi.l8 l8Var = h8Var.f0;
                    g gVar = h8Var.g0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(l8Var.d));
                    orCreateStoryViewer.P0 = id2;
                    orCreateStoryViewer.G(context, storyItem, arrayList, 0, l8Var, null, gVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.c;
                    org.telegram.ui.Components.xu0 xu0Var = (org.telegram.ui.Components.xu0) dVar.b;
                    int i11 = -1;
                    for (int i12 = 0; i12 < xu0Var.t1[0].a.size(); i12++) {
                        if (((MessageObject) xu0Var.t1[0].a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.qt0 W = xu0Var.W(0);
                    if (i11 < 0 || W == null) {
                        xu0Var.y0(0, id3, i10, true);
                    } else {
                        W.x.h1(i11, 0);
                    }
                    if (W != null) {
                        W.J = id3;
                        W.K = false;
                    }
                    h8Var.finishFragment();
                }
            }
            if (e8Var.n != null) {
                if (h8Var.G) {
                    f8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        ValueAnimator valueAnimator = h8Var.R;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            h8Var.R = null;
                        }
                        int i13 = h8Var.P;
                        if (i13 == 0 && h8Var.Q == 0) {
                            int i14 = a10.h;
                            h8Var.Q = i14;
                            h8Var.P = i14;
                        } else {
                            int i15 = a10.h;
                            if (i13 == i15 && h8Var.Q == i15) {
                                h8Var.Q = 0;
                                h8Var.P = 0;
                            } else if (i13 == i15) {
                                h8Var.P = h8Var.Q;
                            } else {
                                int i16 = h8Var.Q;
                                if (i16 == i15) {
                                    h8Var.Q = i13;
                                } else if (i13 != i16) {
                                    h8Var.Q = i15;
                                    h8Var.P = i15;
                                } else if (i15 > i16) {
                                    h8Var.Q = i15;
                                } else {
                                    h8Var.P = i15;
                                }
                            }
                        }
                        h8Var.t0();
                        h8Var.o0();
                        return false;
                    }
                } else {
                    f8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null) {
                        d5Var2 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
                        if (d5Var2 != null) {
                            d5Var3 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
                            if (d5Var3.getFragmentStack().size() >= 2) {
                                d5Var4 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
                                List fragmentStack = d5Var4.getFragmentStack();
                                d5Var5 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
                                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var5.getFragmentStack().size() - 2);
                                if (n2Var instanceof co) {
                                    h8Var.finishFragment();
                                    ((co) n2Var).G9(a11.h);
                                    return false;
                                }
                            }
                        }
                    }
                    if (a11 != null && h8Var.N != null) {
                        h8Var.finishFragment();
                        h8Var.N.G9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}

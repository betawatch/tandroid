package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class b8 extends rl0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public String e;
    public z7 f;
    public boolean h;
    public final /* synthetic */ c8 n;

    public b8(c8 c8Var, Context context) {
        this.n = c8Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return (this.n.s0 && m1Var.b() == 0) ? false : true;
    }

    public final void E(String str) {
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        if (str == null) {
            this.e = null;
            this.d.clear();
            l();
        } else {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            z7 z7Var = new z7(this, str, 0);
            this.f = z7Var;
            dispatchQueue.postRunnable(z7Var, 300L);
        }
    }

    @Override // f2.p0
    public final int h() {
        int size;
        c8 c8Var = this.n;
        boolean z4 = c8Var.s0;
        if (c8Var.f) {
            size = this.d.size();
        } else {
            if (c8Var.u0.size() <= 1) {
                return 0;
            }
            size = c8Var.u0.size();
        }
        return size + (z4 ? 1 : 0);
    }

    @Override // f2.p0
    public final int j(int i10) {
        return (this.n.s0 && i10 == 0) ? 1 : 0;
    }

    @Override // f2.p0
    public final void l() {
        super.l();
        c8 c8Var = this.n;
        View view = c8Var.e;
        j7 j7Var = c8Var.B;
        o7 o7Var = c8Var.n;
        if ((c8Var.u0.size() > 1) != this.h) {
            boolean z4 = c8Var.u0.size() > 1;
            this.h = z4;
            if (z4) {
                o7Var.setVisibility(0);
                o7Var.setTranslationY(AndroidUtilities.displaySize.y);
                final int i10 = 0;
                o7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.y7
                    public final /* synthetic */ b8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (i10) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.h3) this.b.n).containerView;
                                viewGroup.invalidate();
                                break;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.h3) this.b.n).containerView;
                                viewGroup2.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(pr.h).start();
            } else {
                final int i11 = 1;
                o7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.y7
                    public final /* synthetic */ b8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (i11) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.h3) this.b.n).containerView;
                                viewGroup.invalidate();
                                break;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.h3) this.b.n).containerView;
                                viewGroup2.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(pr.h).withEndAction(new fg(this, 9)).start();
            }
        }
        if (c8Var.u0.size() > 1) {
            j7Var.setBackgroundColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ri));
            view.setVisibility(0);
            o7Var.setPadding(0, o7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            j7Var.setBackgroundColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ri));
            view.setVisibility(0);
            o7Var.setPadding(0, o7Var.getPaddingTop(), 0, 0);
        }
        c8Var.v.setVisibility((c8Var.h && c8Var.s.h() == 0) ? 0 : 8);
        c8Var.E0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ((r12 + 1) < r10.d.size()) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0028, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:
    
        if (((r0.u0.size() - r12) - 2) >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0046, code lost:
    
        if ((r12 + 1) < r0.u0.size()) goto L11;
     */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        MessageObject messageObject;
        boolean z4;
        org.telegram.ui.ActionBar.g6 g6Var;
        c8 c8Var = this.n;
        if (c8Var.s0) {
            if (i10 == 0) {
                return;
            } else {
                i10--;
            }
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) m1Var.a;
        if (c8Var.f) {
            messageObject = (MessageObject) this.d.get(i10);
        } else if (c8Var.t0 == null ? !SharedConfig.playOrderReversed : SharedConfig.playOrderReversed) {
            ArrayList arrayList = c8Var.u0;
            messageObject = (MessageObject) arrayList.get((arrayList.size() - i10) - 1);
        } else {
            messageObject = (MessageObject) c8Var.u0.get(i10);
        }
        if (messageObject != null) {
            messageObject.setQuery(this.e);
        }
        org.telegram.ui.ActionBar.i1 i1Var = c8Var.s0() ? new org.telegram.ui.ActionBar.i1(1, this, xVar) : null;
        int i11 = org.telegram.ui.ActionBar.k6.h5;
        g6Var = ((org.telegram.ui.ActionBar.h3) c8Var).resourcesProvider;
        xVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        boolean s02 = c8Var.s0();
        eg.o oVar = (c8Var.s0() || c8Var.w0 || messageObject.getId() <= 0) ? null : new eg.o(this, xVar, messageObject, 18);
        RadialProgress2 radialProgress2 = xVar.E;
        ImageView imageView = xVar.v;
        xVar.w = messageObject;
        if (xVar.x != z4) {
            xVar.invalidate();
        }
        xVar.x = z4;
        imageView.setImageResource(s02 ? R.drawable.list_reorder : R.drawable.ic_ab_other);
        imageView.setVisibility((s02 || oVar != null) ? 0 : 8);
        imageView.setOnClickListener(oVar);
        imageView.setOnTouchListener(i1Var);
        TLRPC.Document document = messageObject.getDocument();
        TLRPC.PhotoSize closestPhotoSizeWithSize = document != null ? FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90) : null;
        if ((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) {
            radialProgress2.i(closestPhotoSizeWithSize, document, messageObject);
        } else {
            String artworkUrl = messageObject.getArtworkUrl(true);
            if (TextUtils.isEmpty(artworkUrl)) {
                radialProgress2.i(null, null, null);
            } else {
                radialProgress2.h(artworkUrl);
            }
        }
        xVar.requestLayout();
        xVar.b(false, false);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = this.c;
        if (i10 == 1) {
            in inVar = new in(context, 7);
            inVar.setTag(-33024);
            return new el0(inVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        g6Var = ((org.telegram.ui.ActionBar.h3) this.n).resourcesProvider;
        return new el0(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, g6Var));
    }
}

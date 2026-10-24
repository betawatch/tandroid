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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class j8 extends lm0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public String e;
    public h8 f;
    public boolean h;
    public final /* synthetic */ k8 n;

    public j8(k8 k8Var, Context context) {
        this.n = k8Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return (this.n.u0 && b1Var.b() == 0) ? false : true;
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
            h8 h8Var = new h8(this, str, 0);
            this.f = h8Var;
            dispatchQueue.postRunnable(h8Var, 300L);
        }
    }

    @Override // s4.g0
    public final int h() {
        int size;
        k8 k8Var = this.n;
        boolean z10 = k8Var.u0;
        if (k8Var.f) {
            size = this.d.size();
        } else {
            if (k8Var.w0.size() <= 1) {
                return 0;
            }
            size = k8Var.w0.size();
        }
        return size + (z10 ? 1 : 0);
    }

    @Override // s4.g0
    public final int j(int i10) {
        return (this.n.u0 && i10 == 0) ? 1 : 0;
    }

    @Override // s4.g0
    public final void l() {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        super.l();
        k8 k8Var = this.n;
        View view = k8Var.e;
        q7 q7Var = k8Var.y;
        v7 v7Var = k8Var.n;
        if ((k8Var.w0.size() > 1) != this.h) {
            boolean z10 = k8Var.w0.size() > 1;
            this.h = z10;
            if (z10) {
                v7Var.setVisibility(0);
                v7Var.setTranslationY(AndroidUtilities.displaySize.y);
                final int i10 = 0;
                v7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.g8
                    public final /* synthetic */ j8 b;

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
                }).setDuration(420L).setInterpolator(bs.h).start();
            } else {
                final int i11 = 1;
                v7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.g8
                    public final /* synthetic */ j8 b;

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
                }).setDuration(420L).setInterpolator(bs.h).withEndAction(new pg(this, 10)).start();
            }
        }
        if (k8Var.w0.size() > 1) {
            int i12 = org.telegram.ui.ActionBar.k6.Ri;
            g6Var2 = ((org.telegram.ui.ActionBar.h3) k8Var).resourcesProvider;
            org.telegram.ui.ActionBar.r6.i(i12, q7Var, g6Var2);
            view.setVisibility(0);
            v7Var.setPadding(0, v7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            int i13 = org.telegram.ui.ActionBar.k6.Ri;
            g6Var = ((org.telegram.ui.ActionBar.h3) k8Var).resourcesProvider;
            org.telegram.ui.ActionBar.r6.i(i13, q7Var, g6Var);
            view.setVisibility(0);
            v7Var.setPadding(0, v7Var.getPaddingTop(), 0, 0);
        }
        k8Var.v.setVisibility((k8Var.h && k8Var.s.h() == 0) ? 0 : 8);
        k8Var.K0();
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
    
        if (((r0.w0.size() - r12) - 2) >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0046, code lost:
    
        if ((r12 + 1) < r0.w0.size()) goto L11;
     */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        MessageObject messageObject;
        boolean z10;
        org.telegram.ui.ActionBar.g6 g6Var;
        k8 k8Var = this.n;
        if (k8Var.u0) {
            if (i10 == 0) {
                return;
            } else {
                i10--;
            }
        }
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) b1Var.a;
        if (k8Var.f) {
            messageObject = (MessageObject) this.d.get(i10);
        } else if (k8Var.v0 == null ? !SharedConfig.playOrderReversed : SharedConfig.playOrderReversed) {
            ArrayList arrayList = k8Var.w0;
            messageObject = (MessageObject) arrayList.get((arrayList.size() - i10) - 1);
        } else {
            messageObject = (MessageObject) k8Var.w0.get(i10);
        }
        if (messageObject != null) {
            messageObject.setQuery(this.e);
        }
        ei.p1 p1Var = k8Var.z0() ? new ei.p1(2, this, wVar) : null;
        int i11 = org.telegram.ui.ActionBar.k6.h5;
        g6Var = ((org.telegram.ui.ActionBar.h3) k8Var).resourcesProvider;
        org.telegram.ui.ActionBar.r6.i(i11, wVar, g6Var);
        boolean z02 = k8Var.z0();
        ai.v0 v0Var = (k8Var.z0() || k8Var.y0 || messageObject.getId() <= 0) ? null : new ai.v0(this, wVar, messageObject, 18);
        RadialProgress2 radialProgress2 = wVar.H;
        ImageView imageView = wVar.v;
        wVar.w = messageObject;
        if (wVar.x != z10) {
            wVar.invalidate();
        }
        wVar.x = z10;
        imageView.setImageResource(z02 ? R.drawable.list_reorder : R.drawable.ic_ab_other);
        imageView.setVisibility((z02 || v0Var != null) ? 0 : 8);
        imageView.setOnClickListener(v0Var);
        imageView.setOnTouchListener(p1Var);
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
        wVar.requestLayout();
        wVar.b(false, false);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = this.c;
        if (i10 == 1) {
            un unVar = new un(context, 10);
            unVar.setTag(-33024);
            return new wl0(unVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        g6Var = ((org.telegram.ui.ActionBar.h3) this.n).resourcesProvider;
        return new wl0(new org.telegram.ui.Cells.w(context, currentPlaylistIsGlobalSearch ? 1 : 0, g6Var));
    }
}

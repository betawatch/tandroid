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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class l8 extends lm0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public String e;
    public j8 f;
    public boolean h;
    public final /* synthetic */ m8 n;

    public l8(m8 m8Var, Context context) {
        this.n = m8Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return (this.n.v0 && b1Var.b() == 0) ? false : true;
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
            j8 j8Var = new j8(this, str, 0);
            this.f = j8Var;
            dispatchQueue.postRunnable(j8Var, 300L);
        }
    }

    @Override // s4.g0
    public final int h() {
        int size;
        m8 m8Var = this.n;
        boolean z10 = m8Var.v0;
        if (m8Var.f) {
            size = this.d.size();
        } else {
            if (m8Var.x0.size() <= 1) {
                return 0;
            }
            size = m8Var.x0.size();
        }
        return size + (z10 ? 1 : 0);
    }

    @Override // s4.g0
    public final int j(int i10) {
        return (this.n.v0 && i10 == 0) ? 1 : 0;
    }

    @Override // s4.g0
    public final void l() {
        super.l();
        m8 m8Var = this.n;
        View view = m8Var.e;
        s7 s7Var = m8Var.E;
        x7 x7Var = m8Var.n;
        if ((m8Var.x0.size() > 1) != this.h) {
            boolean z10 = m8Var.x0.size() > 1;
            this.h = z10;
            if (z10) {
                x7Var.setVisibility(0);
                x7Var.setTranslationY(AndroidUtilities.displaySize.y);
                final int i10 = 0;
                x7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.i8
                    public final /* synthetic */ l8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (i10) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.e3) this.b.n).containerView;
                                viewGroup.invalidate();
                                break;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.e3) this.b.n).containerView;
                                viewGroup2.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(es.h).start();
            } else {
                final int i11 = 1;
                x7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.i8
                    public final /* synthetic */ l8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (i11) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.e3) this.b.n).containerView;
                                viewGroup.invalidate();
                                break;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.e3) this.b.n).containerView;
                                viewGroup2.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(es.h).withEndAction(new qg(this, 9)).start();
            }
        }
        if (m8Var.x0.size() > 1) {
            s7Var.setBackgroundColor(m8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ri));
            view.setVisibility(0);
            x7Var.setPadding(0, x7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            s7Var.setBackgroundColor(m8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ri));
            view.setVisibility(0);
            x7Var.setPadding(0, x7Var.getPaddingTop(), 0, 0);
        }
        m8Var.v.setVisibility((m8Var.h && m8Var.s.h() == 0) ? 0 : 8);
        m8Var.E0();
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
    
        if (((r0.x0.size() - r12) - 2) >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0046, code lost:
    
        if ((r12 + 1) < r0.x0.size()) goto L11;
     */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        MessageObject messageObject;
        boolean z10;
        org.telegram.ui.ActionBar.c6 c6Var;
        m8 m8Var = this.n;
        if (m8Var.v0) {
            if (i10 == 0) {
                return;
            } else {
                i10--;
            }
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) b1Var.a;
        if (m8Var.f) {
            messageObject = (MessageObject) this.d.get(i10);
        } else if (m8Var.w0 == null ? !SharedConfig.playOrderReversed : SharedConfig.playOrderReversed) {
            ArrayList arrayList = m8Var.x0;
            messageObject = (MessageObject) arrayList.get((arrayList.size() - i10) - 1);
        } else {
            messageObject = (MessageObject) m8Var.x0.get(i10);
        }
        if (messageObject != null) {
            messageObject.setQuery(this.e);
        }
        di.p1 p1Var = m8Var.t0() ? new di.p1(2, this, xVar) : null;
        int i11 = org.telegram.ui.ActionBar.g6.h5;
        c6Var = ((org.telegram.ui.ActionBar.e3) m8Var).resourcesProvider;
        xVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        boolean t02 = m8Var.t0();
        bi.x xVar2 = (m8Var.t0() || m8Var.z0 || messageObject.getId() <= 0) ? null : new bi.x(this, xVar, messageObject, 15);
        RadialProgress2 radialProgress2 = xVar.H;
        ImageView imageView = xVar.v;
        xVar.w = messageObject;
        if (xVar.x != z10) {
            xVar.invalidate();
        }
        xVar.x = z10;
        imageView.setImageResource(t02 ? R.drawable.list_reorder : R.drawable.ic_ab_other);
        imageView.setVisibility((t02 || xVar2 != null) ? 0 : 8);
        imageView.setOnClickListener(xVar2);
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
        xVar.requestLayout();
        xVar.b(false, false);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = this.c;
        if (i10 == 1) {
            xn xnVar = new xn(context, 10);
            xnVar.setTag(-33024);
            return new wl0(xnVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        c6Var = ((org.telegram.ui.ActionBar.e3) this.n).resourcesProvider;
        return new wl0(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, c6Var));
    }
}

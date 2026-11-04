package org.telegram.ui;

import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qb extends sg.a {
    public final String c;
    public final TL_stories.Boost d;
    public TL_stories.PrepaidGiveaway e;
    public boolean f;
    public final int g;

    public qb(int i3, String str) {
        super(i3, false);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        TL_stories.PrepaidGiveaway prepaidGiveaway;
        boolean z10 = this.f;
        if (this == obj) {
            return true;
        }
        if (obj == null || qb.class != obj.getClass()) {
            return false;
        }
        qb qbVar = (qb) obj;
        TL_stories.Boost boost = qbVar.d;
        boolean z11 = qbVar.f;
        TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.e;
        if (prepaidGiveaway2 != null && (prepaidGiveaway = qbVar.e) != null) {
            return prepaidGiveaway2.id == prepaidGiveaway.id && z10 == z11;
        }
        TL_stories.Boost boost2 = this.d;
        if (boost2 == null || boost == null) {
            return true;
        }
        return boost2.id.hashCode() == boost.id.hashCode() && z10 == z11 && this.g == qbVar.g;
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g));
    }

    public qb(TL_stories.Boost boost, boolean z10, int i3) {
        super(5, true);
        this.d = boost;
        this.f = z10;
        this.g = i3;
    }
}

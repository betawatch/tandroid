package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public class DepthLimitExceededException extends ParseException {
    private static final long serialVersionUID = 1;

    public DepthLimitExceededException() {
        super("Maximum formula nesting depth exceeded");
    }
}

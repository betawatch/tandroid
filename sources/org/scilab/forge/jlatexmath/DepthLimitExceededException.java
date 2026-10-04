package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public class DepthLimitExceededException extends ParseException {
    private static final long serialVersionUID = 1;

    public DepthLimitExceededException() {
        super("Maximum formula nesting depth exceeded");
    }
}

package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class DepthLimitExceededException extends ParseException {
    private static final long serialVersionUID = 1;

    public DepthLimitExceededException() {
        super("Maximum formula nesting depth exceeded");
    }
}

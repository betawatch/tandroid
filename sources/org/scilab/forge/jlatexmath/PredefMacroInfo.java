package org.scilab.forge.jlatexmath;

import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
class PredefMacroInfo extends MacroInfo {
    private int id;

    public PredefMacroInfo(int i7, int i10, int i11) {
        super(i10, i11);
        this.id = i7;
    }

    private static final Object invokeID(int i7, TeXParser teXParser, String[] strArr) {
        try {
            switch (i7) {
                case 0:
                    return PredefMacros.newcommand_macro(teXParser, strArr);
                case 1:
                    return PredefMacros.renewcommand_macro(teXParser, strArr);
                case 2:
                    return PredefMacros.rule_macro(teXParser, strArr);
                case 3:
                case 4:
                    return PredefMacros.hvspace_macro(teXParser, strArr);
                case 5:
                case 6:
                case 7:
                    return PredefMacros.clrlap_macro(teXParser, strArr);
                case 8:
                case 9:
                case 10:
                    return PredefMacros.mathclrlap_macro(teXParser, strArr);
                case 11:
                    return PredefMacros.includegraphics_macro(teXParser, strArr);
                case 12:
                    return PredefMacros.cfrac_macro(teXParser, strArr);
                case 13:
                    return PredefMacros.frac_macro(teXParser, strArr);
                case 14:
                    return PredefMacros.sfrac_macro(teXParser, strArr);
                case 15:
                    return PredefMacros.genfrac_macro(teXParser, strArr);
                case 16:
                    return PredefMacros.over_macro(teXParser, strArr);
                case 17:
                    return PredefMacros.overwithdelims_macro(teXParser, strArr);
                case 18:
                    return PredefMacros.atop_macro(teXParser, strArr);
                case 19:
                    return PredefMacros.atopwithdelims_macro(teXParser, strArr);
                case 20:
                    return PredefMacros.choose_macro(teXParser, strArr);
                case 21:
                    return PredefMacros.underscore_macro(teXParser, strArr);
                case 22:
                    return PredefMacros.mbox_macro(teXParser, strArr);
                case 23:
                    return PredefMacros.text_macro(teXParser, strArr);
                case 24:
                    return PredefMacros.intertext_macro(teXParser, strArr);
                case 25:
                    return PredefMacros.binom_macro(teXParser, strArr);
                case 26:
                    return PredefMacros.mathbf_macro(teXParser, strArr);
                case 27:
                    return PredefMacros.bf_macro(teXParser, strArr);
                case 28:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 29:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case ks.T /* 30 */:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case ks.U /* 31 */:
                    return PredefMacros.mathit_macro(teXParser, strArr);
                case 32:
                    return PredefMacros.it_macro(teXParser, strArr);
                case 33:
                    return PredefMacros.mathrm_macro(teXParser, strArr);
                case 34:
                    return PredefMacros.rm_macro(teXParser, strArr);
                case 35:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 36:
                    return PredefMacros.mathsf_macro(teXParser, strArr);
                case 37:
                    return PredefMacros.sf_macro(teXParser, strArr);
                case 38:
                    return PredefMacros.mathtt_macro(teXParser, strArr);
                case 39:
                    return PredefMacros.tt_macro(teXParser, strArr);
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case ks.o0 /* 51 */:
                case ks.p0 /* 52 */:
                case ks.q0 /* 53 */:
                case ks.r0 /* 54 */:
                case ks.s0 /* 55 */:
                case ks.t0 /* 56 */:
                case ks.u0 /* 57 */:
                    return PredefMacros.accentbis_macros(teXParser, strArr);
                case ks.v0 /* 58 */:
                    return PredefMacros.T_macro(teXParser, strArr);
                case ks.w0 /* 59 */:
                    return PredefMacros.accentbis_macros(teXParser, strArr);
                case ks.x0 /* 60 */:
                    return PredefMacros.accent_macro(teXParser, strArr);
                case ks.y0 /* 61 */:
                    return PredefMacros.grkaccent_macro(teXParser, strArr);
                case ks.z0 /* 62 */:
                case ks.A0 /* 63 */:
                case 64:
                case 65:
                case ks.D0 /* 66 */:
                case ks.E0 /* 67 */:
                case ks.F0 /* 68 */:
                case ks.G0 /* 69 */:
                case ks.H0 /* 70 */:
                case ks.I0 /* 71 */:
                case ks.J0 /* 72 */:
                case ks.K0 /* 73 */:
                case ks.L0 /* 74 */:
                case ks.M0 /* 75 */:
                    return PredefMacros.accent_macros(teXParser, strArr);
                case ks.N0 /* 76 */:
                    return PredefMacros.nbsp_macro(teXParser, strArr);
                case ks.O0 /* 77 */:
                    return PredefMacros.smallmatrixATATenv_macro(teXParser, strArr);
                case ks.P0 /* 78 */:
                    return PredefMacros.matrixATATenv_macro(teXParser, strArr);
                case ks.Q0 /* 79 */:
                    return PredefMacros.overrightarrow_macro(teXParser, strArr);
                case 80:
                    return PredefMacros.overleftarrow_macro(teXParser, strArr);
                case ks.S0 /* 81 */:
                    return PredefMacros.overleftrightarrow_macro(teXParser, strArr);
                case ks.T0 /* 82 */:
                    return PredefMacros.underrightarrow_macro(teXParser, strArr);
                case ks.U0 /* 83 */:
                    return PredefMacros.underleftarrow_macro(teXParser, strArr);
                case ks.V0 /* 84 */:
                    return PredefMacros.underleftrightarrow_macro(teXParser, strArr);
                case ks.W0 /* 85 */:
                    return PredefMacros.xleftarrow_macro(teXParser, strArr);
                case ks.X0 /* 86 */:
                    return PredefMacros.xrightarrow_macro(teXParser, strArr);
                case ks.Y0 /* 87 */:
                    return PredefMacros.underbrace_macro(teXParser, strArr);
                case ks.Z0 /* 88 */:
                    return PredefMacros.overbrace_macro(teXParser, strArr);
                case ks.a1 /* 89 */:
                    return PredefMacros.underbrack_macro(teXParser, strArr);
                case ks.b1 /* 90 */:
                    return PredefMacros.overbrack_macro(teXParser, strArr);
                case ks.c1 /* 91 */:
                    return PredefMacros.underparen_macro(teXParser, strArr);
                case ks.d1 /* 92 */:
                    return PredefMacros.overparen_macro(teXParser, strArr);
                case ks.e1 /* 93 */:
                case ks.f1 /* 94 */:
                    return PredefMacros.sqrt_macro(teXParser, strArr);
                case ks.g1 /* 95 */:
                    return PredefMacros.overline_macro(teXParser, strArr);
                case 96:
                    return PredefMacros.underline_macro(teXParser, strArr);
                case ks.i1 /* 97 */:
                    return PredefMacros.mathop_macro(teXParser, strArr);
                case ks.j1 /* 98 */:
                    return PredefMacros.mathpunct_macro(teXParser, strArr);
                case ks.k1 /* 99 */:
                    return PredefMacros.mathord_macro(teXParser, strArr);
                case ks.l1 /* 100 */:
                    return PredefMacros.mathrel_macro(teXParser, strArr);
                case 101:
                    return PredefMacros.mathinner_macro(teXParser, strArr);
                case ks.n1 /* 102 */:
                    return PredefMacros.mathbin_macro(teXParser, strArr);
                case ks.o1 /* 103 */:
                    return PredefMacros.mathopen_macro(teXParser, strArr);
                case ks.p1 /* 104 */:
                    return PredefMacros.mathclose_macro(teXParser, strArr);
                case ks.q1 /* 105 */:
                    return PredefMacros.joinrel_macro(teXParser, strArr);
                case ks.r1 /* 106 */:
                    return PredefMacros.smash_macro(teXParser, strArr);
                case ks.s1 /* 107 */:
                    return PredefMacros.vdots_macro(teXParser, strArr);
                case ks.t1 /* 108 */:
                    return PredefMacros.ddots_macro(teXParser, strArr);
                case ks.u1 /* 109 */:
                    return PredefMacros.iddots_macro(teXParser, strArr);
                case ks.v1 /* 110 */:
                    return PredefMacros.nolimits_macro(teXParser, strArr);
                case ks.w1 /* 111 */:
                    return PredefMacros.limits_macro(teXParser, strArr);
                case ks.x1 /* 112 */:
                    return PredefMacros.normal_macro(teXParser, strArr);
                case ks.y1 /* 113 */:
                    return PredefMacros.leftparenthesis_macro(teXParser, strArr);
                case ks.z1 /* 114 */:
                    return PredefMacros.leftbracket_macro(teXParser, strArr);
                case ks.A1 /* 115 */:
                    return PredefMacros.left_macro(teXParser, strArr);
                case ks.B1 /* 116 */:
                    return PredefMacros.middle_macro(teXParser, strArr);
                case ks.C1 /* 117 */:
                    return PredefMacros.cr_macro(teXParser, strArr);
                case ks.D1 /* 118 */:
                    return PredefMacros.multicolumn_macro(teXParser, strArr);
                case ks.E1 /* 119 */:
                    return PredefMacros.hdotsfor_macro(teXParser, strArr);
                case 120:
                    return PredefMacros.arrayATATenv_macro(teXParser, strArr);
                case ks.F1 /* 121 */:
                    return PredefMacros.alignATATenv_macro(teXParser, strArr);
                case ks.G1 /* 122 */:
                    return PredefMacros.alignedATATenv_macro(teXParser, strArr);
                case ks.H1 /* 123 */:
                    return PredefMacros.flalignATATenv_macro(teXParser, strArr);
                case ks.I1 /* 124 */:
                    return PredefMacros.alignatATATenv_macro(teXParser, strArr);
                case ks.J1 /* 125 */:
                    return PredefMacros.alignedatATATenv_macro(teXParser, strArr);
                case ks.K1 /* 126 */:
                    return PredefMacros.multlineATATenv_macro(teXParser, strArr);
                case ks.L1 /* 127 */:
                    return PredefMacros.gatherATATenv_macro(teXParser, strArr);
                case 128:
                    return PredefMacros.gatheredATATenv_macro(teXParser, strArr);
                case ks.N1 /* 129 */:
                    return PredefMacros.shoveright_macro(teXParser, strArr);
                case ks.O1 /* 130 */:
                    return PredefMacros.shoveleft_macro(teXParser, strArr);
                case ks.P1 /* 131 */:
                    return PredefMacros.backslashcr_macro(teXParser, strArr);
                case ks.Q1 /* 132 */:
                    return PredefMacros.newenvironment_macro(teXParser, strArr);
                case 133:
                    return PredefMacros.renewenvironment_macro(teXParser, strArr);
                case 134:
                    return PredefMacros.makeatletter_macro(teXParser, strArr);
                case ks.R1 /* 135 */:
                    return PredefMacros.makeatother_macro(teXParser, strArr);
                case ks.S1 /* 136 */:
                case ks.T1 /* 137 */:
                    return PredefMacros.fbox_macro(teXParser, strArr);
                case ks.U1 /* 138 */:
                    return PredefMacros.stackrel_macro(teXParser, strArr);
                case ks.V1 /* 139 */:
                    return PredefMacros.stackbin_macro(teXParser, strArr);
                case ks.W1 /* 140 */:
                    return PredefMacros.accentset_macro(teXParser, strArr);
                case ks.X1 /* 141 */:
                    return PredefMacros.underaccent_macro(teXParser, strArr);
                case ks.Y1 /* 142 */:
                    return PredefMacros.undertilde_macro(teXParser, strArr);
                case ks.Z1 /* 143 */:
                    return PredefMacros.overset_macro(teXParser, strArr);
                case ks.a2 /* 144 */:
                    return PredefMacros.Braket_macro(teXParser, strArr);
                case ks.b2 /* 145 */:
                    return PredefMacros.Set_macro(teXParser, strArr);
                case ks.c2 /* 146 */:
                    return PredefMacros.underset_macro(teXParser, strArr);
                case ks.d2 /* 147 */:
                    return PredefMacros.boldsymbol_macro(teXParser, strArr);
                case ks.e2 /* 148 */:
                    return PredefMacros.LaTeX_macro(teXParser, strArr);
                case ks.f2 /* 149 */:
                    return PredefMacros.GeoGebra_macro(teXParser, strArr);
                case ks.g2 /* 150 */:
                    return PredefMacros.big_macro(teXParser, strArr);
                case ks.h2 /* 151 */:
                    return PredefMacros.Big_macro(teXParser, strArr);
                case ks.i2 /* 152 */:
                    return PredefMacros.bigg_macro(teXParser, strArr);
                case ks.j2 /* 153 */:
                    return PredefMacros.Bigg_macro(teXParser, strArr);
                case ks.k2 /* 154 */:
                    return PredefMacros.bigl_macro(teXParser, strArr);
                case ks.l2 /* 155 */:
                    return PredefMacros.Bigl_macro(teXParser, strArr);
                case ks.m2 /* 156 */:
                    return PredefMacros.biggl_macro(teXParser, strArr);
                case ks.n2 /* 157 */:
                    return PredefMacros.Biggl_macro(teXParser, strArr);
                case ks.o2 /* 158 */:
                    return PredefMacros.bigr_macro(teXParser, strArr);
                case ks.p2 /* 159 */:
                    return PredefMacros.Bigr_macro(teXParser, strArr);
                case ks.q2 /* 160 */:
                    return PredefMacros.biggr_macro(teXParser, strArr);
                case ks.r2 /* 161 */:
                    return PredefMacros.Biggr_macro(teXParser, strArr);
                case ks.s2 /* 162 */:
                    return PredefMacros.displaystyle_macro(teXParser, strArr);
                case ks.t2 /* 163 */:
                    return PredefMacros.textstyle_macro(teXParser, strArr);
                case ks.u2 /* 164 */:
                    return PredefMacros.scriptstyle_macro(teXParser, strArr);
                case ks.v2 /* 165 */:
                    return PredefMacros.scriptscriptstyle_macro(teXParser, strArr);
                case ks.w2 /* 166 */:
                    return PredefMacros.sideset_macro(teXParser, strArr);
                case ks.x2 /* 167 */:
                    return PredefMacros.prescript_macro(teXParser, strArr);
                case ks.y2 /* 168 */:
                    return PredefMacros.rotatebox_macro(teXParser, strArr);
                case ks.z2 /* 169 */:
                    return PredefMacros.reflectbox_macro(teXParser, strArr);
                case ks.A2 /* 170 */:
                    return PredefMacros.scalebox_macro(teXParser, strArr);
                case ks.B2 /* 171 */:
                    return PredefMacros.resizebox_macro(teXParser, strArr);
                case ks.C2 /* 172 */:
                    return PredefMacros.raisebox_macro(teXParser, strArr);
                case ks.D2 /* 173 */:
                    return PredefMacros.shadowbox_macro(teXParser, strArr);
                case ks.E2 /* 174 */:
                    return PredefMacros.ovalbox_macro(teXParser, strArr);
                case ks.F2 /* 175 */:
                    return PredefMacros.doublebox_macro(teXParser, strArr);
                case ks.G2 /* 176 */:
                    return PredefMacros.phantom_macro(teXParser, strArr);
                case ks.H2 /* 177 */:
                    return PredefMacros.hphantom_macro(teXParser, strArr);
                case ks.I2 /* 178 */:
                    return PredefMacros.vphantom_macro(teXParser, strArr);
                case ks.J2 /* 179 */:
                    return PredefMacros.spATbreve_macro(teXParser, strArr);
                case ks.K2 /* 180 */:
                    return PredefMacros.spAThat_macro(teXParser, strArr);
                case ks.L2 /* 181 */:
                    return PredefMacros.definecolor_macro(teXParser, strArr);
                case ks.M2 /* 182 */:
                    return PredefMacros.textcolor_macro(teXParser, strArr);
                case ks.N2 /* 183 */:
                    return PredefMacros.fgcolor_macro(teXParser, strArr);
                case ks.O2 /* 184 */:
                    return PredefMacros.bgcolor_macro(teXParser, strArr);
                case ks.P2 /* 185 */:
                    return PredefMacros.colorbox_macro(teXParser, strArr);
                case ks.Q2 /* 186 */:
                    return PredefMacros.fcolorbox_macro(teXParser, strArr);
                case ks.R2 /* 187 */:
                    return PredefMacros.cedilla_macro(teXParser, strArr);
                case ks.S2 /* 188 */:
                    return PredefMacros.IJ_macro(teXParser, strArr);
                case ks.T2 /* 189 */:
                    return PredefMacros.IJ_macro(teXParser, strArr);
                case ks.U2 /* 190 */:
                    return PredefMacros.TStroke_macro(teXParser, strArr);
                case ks.V2 /* 191 */:
                    return PredefMacros.TStroke_macro(teXParser, strArr);
                case ks.W2 /* 192 */:
                    return PredefMacros.LCaron_macro(teXParser, strArr);
                case ks.X2 /* 193 */:
                    return PredefMacros.tcaron_macro(teXParser, strArr);
                case ks.Y2 /* 194 */:
                    return PredefMacros.LCaron_macro(teXParser, strArr);
                case ks.Z2 /* 195 */:
                    return PredefMacros.ogonek_macro(teXParser, strArr);
                case ks.a3 /* 196 */:
                    return PredefMacros.cong_macro(teXParser, strArr);
                case ks.b3 /* 197 */:
                    return PredefMacros.doteq_macro(teXParser, strArr);
                case ks.c3 /* 198 */:
                    return PredefMacros.jlmDynamic_macro(teXParser, strArr);
                case ks.d3 /* 199 */:
                    return PredefMacros.jlmExternalFont_macro(teXParser, strArr);
                case ks.e3 /* 200 */:
                    return PredefMacros.jlmText_macro(teXParser, strArr);
                case ks.f3 /* 201 */:
                    return PredefMacros.jlmTextit_macro(teXParser, strArr);
                case ks.g3 /* 202 */:
                    return PredefMacros.jlmTextbf_macro(teXParser, strArr);
                case 203:
                    return PredefMacros.jlmTextitbf_macro(teXParser, strArr);
                case ks.i3 /* 204 */:
                    return PredefMacros.DeclareMathSizes_macro(teXParser, strArr);
                case ks.j3 /* 205 */:
                    return PredefMacros.magnification_macro(teXParser, strArr);
                case ks.k3 /* 206 */:
                    return PredefMacros.hline_macro(teXParser, strArr);
                case ks.l3 /* 207 */:
                case ks.m3 /* 208 */:
                case ks.n3 /* 209 */:
                case 210:
                case ks.o3 /* 211 */:
                case ks.p3 /* 212 */:
                case ks.q3 /* 213 */:
                case ks.r3 /* 214 */:
                case ks.s3 /* 215 */:
                case ks.t3 /* 216 */:
                    return PredefMacros.size_macros(teXParser, strArr);
                case ks.u3 /* 217 */:
                    return PredefMacros.jlatexmathcumsup_macro(teXParser, strArr);
                case ks.v3 /* 218 */:
                    return PredefMacros.jlatexmathcumsub_macro(teXParser, strArr);
                case ks.w3 /* 219 */:
                    return PredefMacros.hstrok_macro(teXParser, strArr);
                case ks.x3 /* 220 */:
                    return PredefMacros.Hstrok_macro(teXParser, strArr);
                case ks.y3 /* 221 */:
                    return PredefMacros.dstrok_macro(teXParser, strArr);
                case ks.z3 /* 222 */:
                    return PredefMacros.Dstrok_macro(teXParser, strArr);
                case ks.A3 /* 223 */:
                    return PredefMacros.dotminus_macro(teXParser, strArr);
                case ks.B3 /* 224 */:
                    return PredefMacros.ratio_macro(teXParser, strArr);
                case ks.C3 /* 225 */:
                    return PredefMacros.smallfrowneq_macro(teXParser, strArr);
                case ks.D3 /* 226 */:
                    return PredefMacros.geoprop_macro(teXParser, strArr);
                case ks.E3 /* 227 */:
                    return PredefMacros.minuscolon_macro(teXParser, strArr);
                case ks.F3 /* 228 */:
                    return PredefMacros.minuscoloncolon_macro(teXParser, strArr);
                case 229:
                    return PredefMacros.simcolon_macro(teXParser, strArr);
                case ks.G3 /* 230 */:
                    return PredefMacros.simcoloncolon_macro(teXParser, strArr);
                case ks.H3 /* 231 */:
                    return PredefMacros.approxcolon_macro(teXParser, strArr);
                case ks.I3 /* 232 */:
                    return PredefMacros.approxcoloncolon_macro(teXParser, strArr);
                case ks.J3 /* 233 */:
                    return PredefMacros.coloncolon_macro(teXParser, strArr);
                case 234:
                    return PredefMacros.equalscolon_macro(teXParser, strArr);
                case ks.L3 /* 235 */:
                    return PredefMacros.equalscoloncolon_macro(teXParser, strArr);
                case 236:
                    return PredefMacros.colonminus_macro(teXParser, strArr);
                case ks.M3 /* 237 */:
                    return PredefMacros.coloncolonminus_macro(teXParser, strArr);
                case ks.N3 /* 238 */:
                    return PredefMacros.colonequals_macro(teXParser, strArr);
                case ks.O3 /* 239 */:
                    return PredefMacros.coloncolonequals_macro(teXParser, strArr);
                case ks.P3 /* 240 */:
                    return PredefMacros.colonsim_macro(teXParser, strArr);
                case ks.Q3 /* 241 */:
                    return PredefMacros.coloncolonsim_macro(teXParser, strArr);
                case ks.R3 /* 242 */:
                    return PredefMacros.colonapprox_macro(teXParser, strArr);
                case ks.S3 /* 243 */:
                    return PredefMacros.coloncolonapprox_macro(teXParser, strArr);
                case ks.T3 /* 244 */:
                    return PredefMacros.kern_macro(teXParser, strArr);
                case ks.U3 /* 245 */:
                    return PredefMacros.char_macro(teXParser, strArr);
                case ks.V3 /* 246 */:
                case ks.W3 /* 247 */:
                    return PredefMacros.romannumeral_macro(teXParser, strArr);
                case ks.X3 /* 248 */:
                    return PredefMacros.textcircled_macro(teXParser, strArr);
                case ks.Y3 /* 249 */:
                    return PredefMacros.textsc_macro(teXParser, strArr);
                case ks.Z3 /* 250 */:
                    return PredefMacros.sc_macro(teXParser, strArr);
                case ks.a4 /* 251 */:
                case ks.b4 /* 252 */:
                case ks.c4 /* 253 */:
                case ks.d4 /* 254 */:
                case ks.e4 /* 255 */:
                case 256:
                case ks.g4 /* 257 */:
                case ks.h4 /* 258 */:
                case ks.i4 /* 259 */:
                case ks.j4 /* 260 */:
                    return PredefMacros.muskip_macros(teXParser, strArr);
                case ks.k4 /* 261 */:
                    return PredefMacros.quad_macro(teXParser, strArr);
                case ks.l4 /* 262 */:
                    return PredefMacros.surd_macro(teXParser, strArr);
                case ks.m4 /* 263 */:
                    return PredefMacros.iint_macro(teXParser, strArr);
                case ks.n4 /* 264 */:
                    return PredefMacros.iiint_macro(teXParser, strArr);
                case ks.o4 /* 265 */:
                    return PredefMacros.iiiint_macro(teXParser, strArr);
                case ks.p4 /* 266 */:
                    return PredefMacros.idotsint_macro(teXParser, strArr);
                case ks.q4 /* 267 */:
                    return PredefMacros.int_macro(teXParser, strArr);
                case ks.r4 /* 268 */:
                    return PredefMacros.oint_macro(teXParser, strArr);
                case ks.s4 /* 269 */:
                    return PredefMacros.lmoustache_macro(teXParser, strArr);
                case ks.t4 /* 270 */:
                    return PredefMacros.rmoustache_macro(teXParser, strArr);
                case ks.u4 /* 271 */:
                    return PredefMacros.insertBreakMark_macro(teXParser, strArr);
                case ks.v4 /* 272 */:
                    return PredefMacros.jlmXML_macro(teXParser, strArr);
                case ks.w4 /* 273 */:
                    return PredefMacros.above_macro(teXParser, strArr);
                case ks.x4 /* 274 */:
                    return PredefMacros.abovewithdelims_macro(teXParser, strArr);
                case ks.y4 /* 275 */:
                    return PredefMacros.st_macro(teXParser, strArr);
                case ks.z4 /* 276 */:
                    return PredefMacros.fcscore_macro(teXParser, strArr);
                case ks.A4 /* 277 */:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case ks.B4 /* 278 */:
                    return PredefMacros.qquad_macro(teXParser, strArr);
                case ks.C4 /* 279 */:
                    return PredefMacros.longdiv_macro(teXParser, strArr);
                case ks.D4 /* 280 */:
                    return PredefMacros.questeq_macro(teXParser, strArr);
                case ks.E4 /* 281 */:
                    return PredefMacros.bangle_macro(teXParser, strArr);
                case ks.F4 /* 282 */:
                    return PredefMacros.brace_macro(teXParser, strArr);
                case ks.G4 /* 283 */:
                    return PredefMacros.brack_macro(teXParser, strArr);
                default:
                    return null;
            }
        } catch (Exception e10) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n" + e10.getMessage());
        }
    }

    @Override // org.scilab.forge.jlatexmath.MacroInfo
    public Object invoke(TeXParser teXParser, String[] strArr) {
        return invokeID(this.id, teXParser, strArr);
    }

    public PredefMacroInfo(int i7, int i10) {
        super(i10);
        this.id = i7;
    }
}
